/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.PropertyDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.PropertyDeclaration#getAdditive <em>Additive</em>}</li>
 *   <li>{@link com.github.toerob.inform6.PropertyDeclaration#getValue <em>Value</em>}</li>
 *   <li>{@link com.github.toerob.inform6.PropertyDeclaration#getAliasedProperty <em>Aliased Property</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getPropertyDeclaration()
 * @model
 * @generated
 */
public interface PropertyDeclaration extends Directive
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getPropertyDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.PropertyDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Additive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additive</em>' attribute.
   * @see #setAdditive(String)
   * @see com.github.toerob.inform6.Inform6Package#getPropertyDeclaration_Additive()
   * @model
   * @generated
   */
  String getAdditive();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.PropertyDeclaration#getAdditive <em>Additive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Additive</em>' attribute.
   * @see #getAdditive()
   * @generated
   */
  void setAdditive(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Primary)
   * @see com.github.toerob.inform6.Inform6Package#getPropertyDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Primary getValue();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.PropertyDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Primary value);

  /**
   * Returns the value of the '<em><b>Aliased Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliased Property</em>' containment reference.
   * @see #setAliasedProperty(Primary)
   * @see com.github.toerob.inform6.Inform6Package#getPropertyDeclaration_AliasedProperty()
   * @model containment="true"
   * @generated
   */
  Primary getAliasedProperty();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.PropertyDeclaration#getAliasedProperty <em>Aliased Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliased Property</em>' containment reference.
   * @see #getAliasedProperty()
   * @generated
   */
  void setAliasedProperty(Primary value);

} // PropertyDeclaration
