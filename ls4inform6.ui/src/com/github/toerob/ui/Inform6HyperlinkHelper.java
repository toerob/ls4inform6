package com.github.toerob.ui;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;

import com.github.toerob.inform6.IncludeDeclaration;
import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.scoping.GlobalInformLibraryContext;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class Inform6HyperlinkHelper extends HyperlinkHelper {

	@Inject
	private Provider<XtextHyperlink> hyperlinkProvider;

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	private GlobalInformLibraryContext gilCtx = GlobalInformLibraryContext.getInstance();

	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
		super.createHyperlinksByOffset(resource, offset, acceptor);

		EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		if (eObject instanceof IncludeDeclaration) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
					Inform6Package.Literals.INCLUDE_DECLARATION__IMPORT_URI);
			if (!nodes.isEmpty()) {
				String location = ((IncludeDeclaration) eObject).getImportURI();
				File file = gilCtx.getLibraryFilePaths().get(location);
				URI importUri = URI.createURI(file.toURI().toString());
				XtextHyperlink hyperlink = hyperlinkProvider.get();
				hyperlink.setURI(importUri);
				acceptor.accept(hyperlink);
			}
		}
	}

}
