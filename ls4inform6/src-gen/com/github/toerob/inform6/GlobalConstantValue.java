/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Constant Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.GlobalConstantValue#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getGlobalConstantValue()
 * @model
 * @generated
 */
public interface GlobalConstantValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Primary)
   * @see com.github.toerob.inform6.Inform6Package#getGlobalConstantValue_Name()
   * @model containment="true"
   * @generated
   */
  Primary getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.GlobalConstantValue#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Primary value);

} // GlobalConstantValue
