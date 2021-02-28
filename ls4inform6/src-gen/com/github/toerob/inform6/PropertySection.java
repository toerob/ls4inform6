/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.PropertySection#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.PropertySection#getClassProperty <em>Class Property</em>}</li>
 *   <li>{@link com.github.toerob.inform6.PropertySection#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getPropertySection()
 * @model
 * @generated
 */
public interface PropertySection extends ClassSection
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getPropertySection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.PropertySection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Class Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Property</em>' containment reference.
   * @see #setClassProperty(Property)
   * @see com.github.toerob.inform6.Inform6Package#getPropertySection_ClassProperty()
   * @model containment="true"
   * @generated
   */
  Property getClassProperty();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.PropertySection#getClassProperty <em>Class Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Property</em>' containment reference.
   * @see #getClassProperty()
   * @generated
   */
  void setClassProperty(Property value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getPropertySection_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // PropertySection
