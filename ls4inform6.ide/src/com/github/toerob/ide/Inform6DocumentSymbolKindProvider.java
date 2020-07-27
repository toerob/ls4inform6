package com.github.toerob.ide;

import org.eclipse.xtext.ide.server.symbol.DocumentSymbolMapper.DocumentSymbolKindProvider;

public class Inform6DocumentSymbolKindProvider extends DocumentSymbolKindProvider {
	/*
	@Override
	public SymbolKind getSymbolKind(EObject object) {
		if (object instanceof ClassDeclaration) {
			return SymbolKind.Class;
		} else if (object instanceof ObjectDeclaration) {
			return SymbolKind.Object;
		} else if (object instanceof GlobalFunctionDefinition) {
			return SymbolKind.Function;
		} else if (object instanceof Property && ((Property) object).getMethod() != null) {
			return SymbolKind.Method;
		} else if (object instanceof PropertySection) {
			return SymbolKind.Struct;
		}
		return super.getSymbolKind(object);
	}*/
}
