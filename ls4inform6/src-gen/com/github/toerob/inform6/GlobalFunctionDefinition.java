/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.GlobalFunctionDefinition#getFunctionHeader <em>Function Header</em>}</li>
 *   <li>{@link com.github.toerob.inform6.GlobalFunctionDefinition#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getGlobalFunctionDefinition()
 * @model
 * @generated
 */
public interface GlobalFunctionDefinition extends Directive
{
  /**
   * Returns the value of the '<em><b>Function Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Header</em>' containment reference.
   * @see #setFunctionHeader(FunctionHeader)
   * @see com.github.toerob.inform6.Inform6Package#getGlobalFunctionDefinition_FunctionHeader()
   * @model containment="true"
   * @generated
   */
  FunctionHeader getFunctionHeader();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.GlobalFunctionDefinition#getFunctionHeader <em>Function Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Header</em>' containment reference.
   * @see #getFunctionHeader()
   * @generated
   */
  void setFunctionHeader(FunctionHeader value);

  /**
   * Returns the value of the '<em><b>Function Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Body</em>' attribute.
   * @see #setFunctionBody(String)
   * @see com.github.toerob.inform6.Inform6Package#getGlobalFunctionDefinition_FunctionBody()
   * @model
   * @generated
   */
  String getFunctionBody();

  /**
   * Sets the value of the '{@link com.github.toerob.inform6.GlobalFunctionDefinition#getFunctionBody <em>Function Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Body</em>' attribute.
   * @see #getFunctionBody()
   * @generated
   */
  void setFunctionBody(String value);

} // GlobalFunctionDefinition
