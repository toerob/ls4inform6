/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.toerob.inform6.Inform6Package
 * @generated
 */
public interface Inform6Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Inform6Factory eINSTANCE = com.github.toerob.inform6.impl.Inform6FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directive</em>'.
   * @generated
   */
  Directive createDirective();

  /**
   * Returns a new object of class '<em>Message Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Directive</em>'.
   * @generated
   */
  MessageDirective createMessageDirective();

  /**
   * Returns a new object of class '<em>Zcharacter Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Zcharacter Directive</em>'.
   * @generated
   */
  ZcharacterDirective createZcharacterDirective();

  /**
   * Returns a new object of class '<em>Comment Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment Declaration</em>'.
   * @generated
   */
  CommentDeclaration createCommentDeclaration();

  /**
   * Returns a new object of class '<em>Compiler Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compiler Directive</em>'.
   * @generated
   */
  CompilerDirective createCompilerDirective();

  /**
   * Returns a new object of class '<em>Include Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Declaration</em>'.
   * @generated
   */
  IncludeDeclaration createIncludeDeclaration();

  /**
   * Returns a new object of class '<em>Property Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Directive</em>'.
   * @generated
   */
  PropertyDirective createPropertyDirective();

  /**
   * Returns a new object of class '<em>Release Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Release Directive</em>'.
   * @generated
   */
  ReleaseDirective createReleaseDirective();

  /**
   * Returns a new object of class '<em>Replace Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Replace Directive</em>'.
   * @generated
   */
  ReplaceDirective createReplaceDirective();

  /**
   * Returns a new object of class '<em>Serial Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Serial Directive</em>'.
   * @generated
   */
  SerialDirective createSerialDirective();

  /**
   * Returns a new object of class '<em>Global Constant Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Constant Declaration</em>'.
   * @generated
   */
  GlobalConstantDeclaration createGlobalConstantDeclaration();

  /**
   * Returns a new object of class '<em>Global Default Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Default Declaration</em>'.
   * @generated
   */
  GlobalDefaultDeclaration createGlobalDefaultDeclaration();

  /**
   * Returns a new object of class '<em>Switches Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switches Declaration</em>'.
   * @generated
   */
  SwitchesDeclaration createSwitchesDeclaration();

  /**
   * Returns a new object of class '<em>Global Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Declaration</em>'.
   * @generated
   */
  GlobalDeclaration createGlobalDeclaration();

  /**
   * Returns a new object of class '<em>Global Constant Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Constant Value</em>'.
   * @generated
   */
  GlobalConstantValue createGlobalConstantValue();

  /**
   * Returns a new object of class '<em>Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Declaration</em>'.
   * @generated
   */
  AttributeDeclaration createAttributeDeclaration();

  /**
   * Returns a new object of class '<em>Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Declaration</em>'.
   * @generated
   */
  PropertyDeclaration createPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Declaration</em>'.
   * @generated
   */
  ClassDeclaration createClassDeclaration();

  /**
   * Returns a new object of class '<em>Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Declaration</em>'.
   * @generated
   */
  ObjectDeclaration createObjectDeclaration();

  /**
   * Returns a new object of class '<em>Idless Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Idless Object Declaration</em>'.
   * @generated
   */
  IdlessObjectDeclaration createIdlessObjectDeclaration();

  /**
   * Returns a new object of class '<em>Nearby Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nearby Declaration</em>'.
   * @generated
   */
  NearbyDeclaration createNearbyDeclaration();

  /**
   * Returns a new object of class '<em>Verb Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verb Declaration</em>'.
   * @generated
   */
  VerbDeclaration createVerbDeclaration();

  /**
   * Returns a new object of class '<em>Verb Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verb Body</em>'.
   * @generated
   */
  VerbBody createVerbBody();

  /**
   * Returns a new object of class '<em>Verb Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verb Assignment</em>'.
   * @generated
   */
  VerbAssignment createVerbAssignment();

  /**
   * Returns a new object of class '<em>Array Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Declaration</em>'.
   * @generated
   */
  ArrayDeclaration createArrayDeclaration();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>Class Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Section</em>'.
   * @generated
   */
  ClassSection createClassSection();

  /**
   * Returns a new object of class '<em>Property Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Section</em>'.
   * @generated
   */
  PropertySection createPropertySection();

  /**
   * Returns a new object of class '<em>Attribute Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Section</em>'.
   * @generated
   */
  AttributeSection createAttributeSection();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Abstract Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Array</em>'.
   * @generated
   */
  AbstractArray createAbstractArray();

  /**
   * Returns a new object of class '<em>Abstract Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Property</em>'.
   * @generated
   */
  AbstractProperty createAbstractProperty();

  /**
   * Returns a new object of class '<em>Global Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Function Definition</em>'.
   * @generated
   */
  GlobalFunctionDefinition createGlobalFunctionDefinition();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Function Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Header</em>'.
   * @generated
   */
  FunctionHeader createFunctionHeader();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Body</em>'.
   * @generated
   */
  FunctionBody createFunctionBody();

  /**
   * Returns a new object of class '<em>Any Token</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Token</em>'.
   * @generated
   */
  AnyToken createAnyToken();

  /**
   * Returns a new object of class '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary</em>'.
   * @generated
   */
  Primary createPrimary();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>BYTE ARRAY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BYTE ARRAY</em>'.
   * @generated
   */
  BYTE_ARRAY createBYTE_ARRAY();

  /**
   * Returns a new object of class '<em>WORD ARRAY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WORD ARRAY</em>'.
   * @generated
   */
  WORD_ARRAY createWORD_ARRAY();

  /**
   * Returns a new object of class '<em>TABLE ARRAY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TABLE ARRAY</em>'.
   * @generated
   */
  TABLE_ARRAY createTABLE_ARRAY();

  /**
   * Returns a new object of class '<em>STRING ARRAY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STRING ARRAY</em>'.
   * @generated
   */
  STRING_ARRAY createSTRING_ARRAY();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Inform6Package getInform6Package();

} //Inform6Factory
