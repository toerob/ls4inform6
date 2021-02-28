/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serial Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.SerialDirective#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.SerialDirective#getSerial <em>Serial</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getSerialDirective()
 * @model
 * @generated
 */
public interface SerialDirective extends Directive
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getSerialDirective_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.SerialDirective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Serial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Serial</em>' attribute.
   * @see #setSerial(String)
   * @see com.github.toerob.inform6.Inform6Package#getSerialDirective_Serial()
   * @model
   * @generated
   */
  String getSerial();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.SerialDirective#getSerial <em>Serial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Serial</em>' attribute.
   * @see #getSerial()
   * @generated
   */
  void setSerial(String value);

} // SerialDirective
