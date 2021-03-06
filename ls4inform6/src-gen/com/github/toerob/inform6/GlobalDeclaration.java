/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.GlobalDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.GlobalDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getGlobalDeclaration()
 * @model
 * @generated
 */
public interface GlobalDeclaration extends Directive
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getGlobalDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.GlobalDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Primary)
   * @see com.github.toerob.inform6.Inform6Package#getGlobalDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Primary getValue();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.GlobalDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Primary value);

} // GlobalDeclaration
