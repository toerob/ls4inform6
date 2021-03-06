/*
 * generated by Xtext 2.22.0
 */
package com.github.toerob;

import org.eclipse.xtext.scoping.IGlobalScopeProvider;

import com.github.toerob.scoping.Inform6GlobalScopeProvider;
import com.google.inject.Binder;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class Inform6RuntimeModule extends AbstractInform6RuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
	}

	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return Inform6GlobalScopeProvider.class;
	}

}
