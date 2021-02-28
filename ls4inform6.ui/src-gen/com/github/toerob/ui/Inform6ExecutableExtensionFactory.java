/*
 * generated by Xtext 2.24.0
 */
package com.github.toerob.ui;

import com.google.inject.Injector;
import ls4inform6.ui.internal.Ls4inform6Activator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Inform6ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Ls4inform6Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Ls4inform6Activator activator = Ls4inform6Activator.getInstance();
		return activator != null ? activator.getInjector(Ls4inform6Activator.COM_GITHUB_TOEROB_INFORM6) : null;
	}

}
