/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.AbstractArray#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getAbstractArray()
 * @model
 * @generated
 */
public interface AbstractArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.Primary}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getAbstractArray_Array()
   * @model containment="true"
   * @generated
   */
  EList<Primary> getArray();

} // AbstractArray