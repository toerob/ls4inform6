/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.Property#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Property#getMethod <em>Method</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Property#getArray <em>Array</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Property#getObjectReference <em>Object Reference</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Property#getValue <em>Value</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Property#getObjectReferences <em>Object References</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(AbstractProperty)
   * @see com.github.toerob.inform6.Inform6Package#getProperty_Method()
   * @model containment="true"
   * @generated
   */
  AbstractProperty getMethod();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Property#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(AbstractProperty value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(AbstractArray)
   * @see com.github.toerob.inform6.Inform6Package#getProperty_Array()
   * @model containment="true"
   * @generated
   */
  AbstractArray getArray();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Property#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(AbstractArray value);

  /**
   * Returns the value of the '<em><b>Object Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Reference</em>' reference.
   * @see #setObjectReference(ObjectDeclaration)
   * @see com.github.toerob.inform6.Inform6Package#getProperty_ObjectReference()
   * @model
   * @generated
   */
  ObjectDeclaration getObjectReference();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Property#getObjectReference <em>Object Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Reference</em>' reference.
   * @see #getObjectReference()
   * @generated
   */
  void setObjectReference(ObjectDeclaration value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Primary)
   * @see com.github.toerob.inform6.Inform6Package#getProperty_Value()
   * @model containment="true"
   * @generated
   */
  Primary getValue();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Property#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Primary value);

  /**
   * Returns the value of the '<em><b>Object References</b></em>' reference list.
   * The list contents are of type {@link com.github.toerob.inform6.ObjectDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object References</em>' reference list.
   * @see com.github.toerob.inform6.Inform6Package#getProperty_ObjectReferences()
   * @model
   * @generated
   */
  EList<ObjectDeclaration> getObjectReferences();

} // Property
