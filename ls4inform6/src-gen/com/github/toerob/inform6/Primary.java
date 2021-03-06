/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.Primary#getId <em>Id</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Primary#getNumber <em>Number</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Primary#getString <em>String</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Primary#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Primary#getHex <em>Hex</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Primary#getBinary <em>Binary</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getPrimary()
 * @model
 * @generated
 */
public interface Primary extends VerbAssignment
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.github.toerob.inform6.Inform6Package#getPrimary_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Primary#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(com.github.toerob.inform6.Number)
   * @see com.github.toerob.inform6.Inform6Package#getPrimary_Number()
   * @model containment="true"
   * @generated
   */
  com.github.toerob.inform6.Number getNumber();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Primary#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(com.github.toerob.inform6.Number value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see com.github.toerob.inform6.Inform6Package#getPrimary_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Primary#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see #setDirection(String)
   * @see com.github.toerob.inform6.Inform6Package#getPrimary_Direction()
   * @model
   * @generated
   */
  String getDirection();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Primary#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see #getDirection()
   * @generated
   */
  void setDirection(String value);

  /**
   * Returns the value of the '<em><b>Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hex</em>' attribute.
   * @see #setHex(String)
   * @see com.github.toerob.inform6.Inform6Package#getPrimary_Hex()
   * @model
   * @generated
   */
  String getHex();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Primary#getHex <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hex</em>' attribute.
   * @see #getHex()
   * @generated
   */
  void setHex(String value);

  /**
   * Returns the value of the '<em><b>Binary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary</em>' attribute.
   * @see #setBinary(String)
   * @see com.github.toerob.inform6.Inform6Package#getPrimary_Binary()
   * @model
   * @generated
   */
  String getBinary();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.Primary#getBinary <em>Binary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary</em>' attribute.
   * @see #getBinary()
   * @generated
   */
  void setBinary(String value);

} // Primary
