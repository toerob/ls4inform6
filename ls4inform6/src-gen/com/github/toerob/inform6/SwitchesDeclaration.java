/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switches Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.SwitchesDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.SwitchesDeclaration#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getSwitchesDeclaration()
 * @model
 * @generated
 */
public interface SwitchesDeclaration extends Directive
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getSwitchesDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.SwitchesDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Switches</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.Primary}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switches</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getSwitchesDeclaration_Switches()
   * @model containment="true"
   * @generated
   */
  EList<Primary> getSwitches();

} // SwitchesDeclaration
