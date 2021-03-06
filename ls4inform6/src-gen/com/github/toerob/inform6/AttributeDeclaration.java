/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.AttributeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.AttributeDeclaration#getAliasedAttribute <em>Aliased Attribute</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getAttributeDeclaration()
 * @model
 * @generated
 */
public interface AttributeDeclaration extends Directive
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getAttributeDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.AttributeDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Aliased Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliased Attribute</em>' attribute.
   * @see #setAliasedAttribute(String)
   * @see com.github.toerob.inform6.Inform6Package#getAttributeDeclaration_AliasedAttribute()
   * @model
   * @generated
   */
  String getAliasedAttribute();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.AttributeDeclaration#getAliasedAttribute <em>Aliased Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliased Attribute</em>' attribute.
   * @see #getAliasedAttribute()
   * @generated
   */
  void setAliasedAttribute(String value);

} // AttributeDeclaration
