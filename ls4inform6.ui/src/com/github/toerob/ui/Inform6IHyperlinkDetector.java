package com.github.toerob.ui;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.ui.editor.hyperlinking.DefaultHyperlinkDetector;

public class Inform6IHyperlinkDetector extends DefaultHyperlinkDetector {
	private static final String INCLUDE = "Include";
	//private static final String PLAYER_TO = "PlayerTo";

	public Inform6IHyperlinkDetector() {
		super();
	}

	@Override
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks) {

		
		IDocument document = textViewer.getDocument();
		int offset = region.getOffset();
		IRegion lineRegion;
		String candidate;
		try {
			lineRegion = document.getLineInformationOfOffset(offset);
			candidate = document.get(lineRegion.getOffset(), lineRegion.getLength());
		} catch (BadLocationException ex) {
			return null;
		}
		int startIndex = candidate.indexOf(INCLUDE);
		int endIndex = candidate.indexOf(';', startIndex);
		if (startIndex != -1) {
			IRegion targetRegion = new Region(lineRegion.getOffset() + startIndex, endIndex);
			if ((targetRegion.getOffset() <= offset)
					&& ((targetRegion.getOffset() + targetRegion.getLength()) > offset))
				return new IHyperlink[] {
						new Inform6IncludeHyperlink(targetRegion, candidate.substring(startIndex+INCLUDE.length()+2, endIndex-1)) };

		} else {
			
			/*
			int playerToStartIndex = candidate.indexOf(PLAYER_TO);
			int playerToStopIndex = candidate.indexOf(';', playerToStartIndex);
			if (playerToStartIndex != -1) {
				IRegion targetRegion = new Region(lineRegion.getOffset() + playerToStartIndex, playerToStopIndex);
				if ((targetRegion.getOffset() <= offset)
						&& ((targetRegion.getOffset() + targetRegion.getLength()) > offset))
					return new IHyperlink[] {
							new Inform6LocationHyperlink(targetRegion, candidate.substring(playerToStartIndex+PLAYER_TO.length()+1, playerToStopIndex-1)) };
			}*/
		}
		
		return super.detectHyperlinks(textViewer, region, canShowMultipleHyperlinks);
	}

}
