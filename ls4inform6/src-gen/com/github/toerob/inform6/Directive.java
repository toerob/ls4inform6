/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.Directive#getGlobals <em>Globals</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getConstants <em>Constants</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getGlobalFunctions <em>Global Functions</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getObjects <em>Objects</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getIdlessobjects <em>Idlessobjects</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getNearbyObjects <em>Nearby Objects</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getVerbs <em>Verbs</em>}</li>
 *   <li>{@link com.github.toerob.inform6.Directive#getArrays <em>Arrays</em>}</li>
 * </ul>
 *
 * @see com.github.toerob.inform6.Inform6Package#getDirective()
 * @model
 * @generated
 */
public interface Directive extends EObject
{
  /**
   * Returns the value of the '<em><b>Globals</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.GlobalDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Globals</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Globals()
   * @model containment="true"
   * @generated
   */
  EList<GlobalDeclaration> getGlobals();

  /**
   * Returns the value of the '<em><b>Defaults</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.GlobalDefaultDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defaults</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Defaults()
   * @model containment="true"
   * @generated
   */
  EList<GlobalDefaultDeclaration> getDefaults();

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.GlobalConstantDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Constants()
   * @model containment="true"
   * @generated
   */
  EList<GlobalConstantDeclaration> getConstants();

  /**
   * Returns the value of the '<em><b>Global Functions</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.GlobalFunctionDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global Functions</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_GlobalFunctions()
   * @model containment="true"
   * @generated
   */
  EList<GlobalFunctionDefinition> getGlobalFunctions();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.AttributeDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeDeclaration> getAttributes();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.PropertyDirective}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Properties()
   * @model containment="true"
   * @generated
   */
  EList<PropertyDirective> getProperties();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.ClassDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Classes()
   * @model containment="true"
   * @generated
   */
  EList<ClassDeclaration> getClasses();

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.ObjectDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Objects()
   * @model containment="true"
   * @generated
   */
  EList<ObjectDeclaration> getObjects();

  /**
   * Returns the value of the '<em><b>Idlessobjects</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.IdlessObjectDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idlessobjects</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Idlessobjects()
   * @model containment="true"
   * @generated
   */
  EList<IdlessObjectDeclaration> getIdlessobjects();

  /**
   * Returns the value of the '<em><b>Nearby Objects</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.NearbyDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nearby Objects</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_NearbyObjects()
   * @model containment="true"
   * @generated
   */
  EList<NearbyDeclaration> getNearbyObjects();

  /**
   * Returns the value of the '<em><b>Verbs</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.VerbDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verbs</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Verbs()
   * @model containment="true"
   * @generated
   */
  EList<VerbDeclaration> getVerbs();

  /**
   * Returns the value of the '<em><b>Arrays</b></em>' containment reference list.
   * The list contents are of type {@link com.github.toerob.inform6.ArrayDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrays</em>' containment reference list.
   * @see com.github.toerob.inform6.Inform6Package#getDirective_Arrays()
   * @model containment="true"
   * @generated
   */
  EList<ArrayDeclaration> getArrays();

} // Directive
