package com.github.toerob.scoping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.github.toerob.inform6.CompilerDirective;
import com.github.toerob.inform6.IncludeDeclaration;

/**
 * Inform6GlobalScopeProvider is responsible for including resources that are
 * imported using "importURI" values.
 * 
 * @author tomasoberg
 *
 */
public class Inform6GlobalScopeProvider extends ImportUriGlobalScopeProvider {

	private static List<String> libraryFiles = Arrays.asList(
			"Parser", "VerbLib", "Grammar", "parserm", "verblibm",
			"linklpa", "infglk", "infix", 
			"English", "SweAlpha", "Swedish", "SwedishG", "SweRout"
			);

	private GlobalInformLibraryContext gilManager = GlobalInformLibraryContext.getInstance();

	private static Logger LOGGER = Logger.getLogger(Inform6GlobalScopeProvider.class);

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		List<String> includePaths = new ArrayList<>();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof CompilerDirective) {
				CompilerDirective cd = (CompilerDirective) object;
				int indexOfIncludePath = cd.getValue().indexOf("include_path");
				if(indexOfIncludePath == -1) {
					indexOfIncludePath = cd.getValue().indexOf("language_name");
				}
				if (indexOfIncludePath != -1) {
					int indexOfEqualSign = cd.getValue().indexOf('=', indexOfIncludePath);
					if (indexOfEqualSign != -1 && cd.getValue().length() > indexOfEqualSign + 1) {
						String pathsAsString = cd.getValue().substring(indexOfEqualSign + 1);
						// System.out.println("include path value: ");
						String[] splittedPaths = pathsAsString.split(",");
						List<String> paths = Arrays.asList(splittedPaths);
						for (String path : paths) {
							includePaths.add(path.trim());
						}
					}
				}
			}
		}

		List<URI> pathURIs = appendBaseURIToPaths(includePaths, resource.getURI());

		iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof IncludeDeclaration) {

				IncludeDeclaration includeDeclaration = (IncludeDeclaration) object;
				String importURI = includeDeclaration.getImportURI();

				// Trim away local sign '>'
				if (importURI.startsWith(">")) {
					importURI = importURI.substring(1);
				}

				// Add '.h' extension to global import if it is missing.
				if (!importURI.endsWith(".h") && !importURI.endsWith(".inf")) {
					importURI += ".h";
				}

				// Try out paths one by one defined within "+include_path=..."
				for (URI pathURI : pathURIs) {
					URI appendedSegment = pathURI.appendSegment(importURI);
					URI resolvedURI = CommonPlugin.resolve(appendedSegment);
					File file = new File(resolvedURI.toFileString());
					if (file.exists()) {
						gilManager.getLibraryFilePaths().putIfAbsent(includeDeclaration.getImportURI().toString(),
							file);
					}
				}
			}
		}

		// Always add the rest of the standard library, if not already present
		libraryFiles.forEach(x -> {
			for (URI pathURI : pathURIs) {
				URI appendedSegment = pathURI.appendSegment(x + ".h");
				URI resolvedURI = CommonPlugin.resolve(appendedSegment);
				File file = new File(resolvedURI.toFileString());
				if (file.exists()) {
					gilManager.getLibraryFilePaths().putIfAbsent(x, file);
				}
			}
		});

		LinkedHashSet<URI> importedUris = super.getImportedUris(resource);

		for (File uri : gilManager.getLibraryFilePaths().values()) {
			URI createdURI = URI.createURI(uri.toURI().toString());
			if (!importedUris.contains(createdURI)) {
				importedUris.add(createdURI);
			}
		}
		return importedUris;
	}

	private List<URI> appendBaseURIToPaths(List<String> includePaths, URI openedFileURI) {
		List<URI> resolvedIncludePaths = new ArrayList<>();
		URI baseURIFolder = openedFileURI.trimSegments(1);
		for (String path : includePaths) {

			URI uri;
			if (path.startsWith(".")) {
				URI resolve = CommonPlugin.resolve(openedFileURI);
				uri = URI.createURI(path).resolve(resolve);
			} else {
				uri = URI.createURI("file://" + path);
			}
			resolvedIncludePaths.add(uri);
		}
		// Also add the current folder as a base folder
		resolvedIncludePaths.add(baseURIFolder); 
		return resolvedIncludePaths;
	}

}
