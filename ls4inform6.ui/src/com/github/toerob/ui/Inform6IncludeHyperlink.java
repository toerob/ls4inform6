package com.github.toerob.ui;

import java.io.File;

import org.apache.log4j.Logger;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import com.github.toerob.scoping.GlobalInformLibraryContext;

public class Inform6IncludeHyperlink implements IHyperlink {

	private static Logger LOGGER = Logger.getLogger(Inform6IncludeHyperlink.class);

	private final String fileIDString;

	private IRegion targetRegion;

	private GlobalInformLibraryContext gilManager = GlobalInformLibraryContext.getInstance();

	public Inform6IncludeHyperlink(IRegion targetRegion, String fileIDString) {
		this.targetRegion = targetRegion;
		this.fileIDString = fileIDString;
	}

	@Override
	public IRegion getHyperlinkRegion() {
		return targetRegion;
	}

	@Override
	public String getTypeLabel() {
		return null;
	}

	@Override
	public String getHyperlinkText() {
		return null;
	}

	@Override
	public void open() {
		File file = gilManager.getLibraryFilePaths().get(fileIDString);
		openFileInIDE(file);
	}

	private void openFileInIDE(File fileToOpen) {
		if (fileToOpen != null && fileToOpen.exists() && fileToOpen.isFile()) {
			try {
				final IFileStore store = EFS.getStore(fileToOpen.toURI());
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorPart part = IDE.openEditorOnFileStore(page, store);
				part.setFocus();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		} else {
			LOGGER.info("File: " + fileToOpen.toString() + " does not exist.");
		}
	}
}