/*
 * generated by Xtext 2.22.0
 */
package com.github.toerob.ui.outline;

import java.lang.reflect.Method;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

import com.github.toerob.inform6.AbstractArray;
import com.github.toerob.inform6.Expression;
import com.github.toerob.inform6.GlobalConstantValue;
import com.github.toerob.inform6.GlobalDeclaration;
import com.github.toerob.inform6.GlobalFunctionDefinition;
import com.github.toerob.inform6.VerbDeclaration;

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
public class Inform6OutlineTreeProvider extends DefaultOutlineTreeProvider {
	protected boolean _isLeaf(AbstractArray modelElement) {
		return true;
	}
	
	protected boolean _isLeaf(Method modelElement) {
		return true;
	}
	
	protected boolean _isLeaf(Expression ele) {
		return true;
	}	
	

	protected boolean _isLeaf(GlobalFunctionDefinition modelElement) {
		return true;
	}

	protected boolean _isLeaf(GlobalDeclaration modelElement) {
		return true;
	}
	protected boolean _isLeaf(GlobalConstantValue modelElement) {
		return true;
	}

	protected boolean _isLeaf(VerbDeclaration modelElement) {
		return true;
	}
}
