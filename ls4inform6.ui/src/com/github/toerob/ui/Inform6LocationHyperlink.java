package com.github.toerob.ui;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;

public class Inform6LocationHyperlink implements IHyperlink {

	private IRegion targetRegion;
	private String substring;

	public Inform6LocationHyperlink(IRegion targetRegion, String substring) {
		this.targetRegion = targetRegion;
		this.substring = substring;
	}

	@Override
	public IRegion getHyperlinkRegion() {
		return targetRegion;
	}

	@Override
	public String getTypeLabel() {
		return "Location";
	}

	@Override
	public String getHyperlinkText() {
		return substring;
	}

	@Override
	public void open() {
	}

}
