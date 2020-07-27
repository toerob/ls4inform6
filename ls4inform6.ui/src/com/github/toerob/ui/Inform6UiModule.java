/*
 * generated by Xtext 2.22.0
 */
package com.github.toerob.ui;

import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class Inform6UiModule extends AbstractInform6UiModule {

	public Inform6UiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IHyperlinkDetector> bindIHyperlinkDetector() {
		return Inform6IHyperlinkDetector.class;
	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		//binder.bind(HyperlinkHelper.class).to(Inform6HyperlinkHelper.class);
	}

}