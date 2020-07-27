/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.ReleaseDirective#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.ReleaseDirective#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getReleaseDirective()
 * @model
 * @generated
 */
public interface ReleaseDirective extends Directive
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.toerob.inform6.Inform6Package#getReleaseDirective_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.ReleaseDirective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(int)
   * @see com.github.toerob.inform6.Inform6Package#getReleaseDirective_Version()
   * @model
   * @generated
   */
  int getVersion();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.ReleaseDirective#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(int value);

} // ReleaseDirective
