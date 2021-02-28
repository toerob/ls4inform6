/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.FunctionHeader#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getFunctionHeader()
 * @model
 * @generated
 */
public interface FunctionHeader extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute list.
   * @see com.github.toerob.inform6.Inform6Package#getFunctionHeader_Variables()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariables();

} // FunctionHeader
