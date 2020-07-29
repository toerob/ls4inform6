/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BYTE ARRAY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.BYTE_ARRAY#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getBYTE_ARRAY()
 * @model
 * @generated
 */
public interface BYTE_ARRAY extends ArrayType
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getBYTE_ARRAY_Content()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getContent();

} // BYTE_ARRAY
