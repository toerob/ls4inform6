/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6.impl;

import com.github.toerob.inform6.AbstractArray;
import com.github.toerob.inform6.AbstractProperty;
import com.github.toerob.inform6.AnyToken;
import com.github.toerob.inform6.ArrayDeclaration;
import com.github.toerob.inform6.ArrayType;
import com.github.toerob.inform6.Attribute;
import com.github.toerob.inform6.AttributeDeclaration;
import com.github.toerob.inform6.AttributeSection;
import com.github.toerob.inform6.BYTE_ARRAY;
import com.github.toerob.inform6.ClassDeclaration;
import com.github.toerob.inform6.ClassSection;
import com.github.toerob.inform6.CommentDeclaration;
import com.github.toerob.inform6.CompilerDirective;
import com.github.toerob.inform6.Directive;
import com.github.toerob.inform6.Expression;
import com.github.toerob.inform6.FunctionBody;
import com.github.toerob.inform6.FunctionHeader;
import com.github.toerob.inform6.GlobalConstantDeclaration;
import com.github.toerob.inform6.GlobalConstantValue;
import com.github.toerob.inform6.GlobalDeclaration;
import com.github.toerob.inform6.GlobalDefaultDeclaration;
import com.github.toerob.inform6.GlobalFunctionDefinition;
import com.github.toerob.inform6.IdlessObjectDeclaration;
import com.github.toerob.inform6.IncludeDeclaration;
import com.github.toerob.inform6.Inform6Factory;
import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.inform6.MessageDirective;
import com.github.toerob.inform6.NearbyDeclaration;
import com.github.toerob.inform6.ObjectDeclaration;
import com.github.toerob.inform6.Primary;
import com.github.toerob.inform6.PrimaryExpression;
import com.github.toerob.inform6.Program;
import com.github.toerob.inform6.Property;
import com.github.toerob.inform6.PropertyDeclaration;
import com.github.toerob.inform6.PropertyDirective;
import com.github.toerob.inform6.PropertySection;
import com.github.toerob.inform6.ReleaseDirective;
import com.github.toerob.inform6.ReplaceDirective;
import com.github.toerob.inform6.STRING_ARRAY;
import com.github.toerob.inform6.SerialDirective;
import com.github.toerob.inform6.SwitchesDeclaration;
import com.github.toerob.inform6.TABLE_ARRAY;
import com.github.toerob.inform6.VerbAssignment;
import com.github.toerob.inform6.VerbBody;
import com.github.toerob.inform6.VerbDeclaration;
import com.github.toerob.inform6.WORD_ARRAY;
import com.github.toerob.inform6.ZcharacterDirective;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Inform6FactoryImpl extends EFactoryImpl implements Inform6Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Inform6Factory init()
  {
    try
    {
      Inform6Factory theInform6Factory = (Inform6Factory)EPackage.Registry.INSTANCE.getEFactory(Inform6Package.eNS_URI);
      if (theInform6Factory != null)
      {
        return theInform6Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Inform6FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inform6FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Inform6Package.PROGRAM: return createProgram();
      case Inform6Package.DIRECTIVE: return createDirective();
      case Inform6Package.MESSAGE_DIRECTIVE: return createMessageDirective();
      case Inform6Package.ZCHARACTER_DIRECTIVE: return createZcharacterDirective();
      case Inform6Package.COMMENT_DECLARATION: return createCommentDeclaration();
      case Inform6Package.COMPILER_DIRECTIVE: return createCompilerDirective();
      case Inform6Package.INCLUDE_DECLARATION: return createIncludeDeclaration();
      case Inform6Package.PROPERTY_DIRECTIVE: return createPropertyDirective();
      case Inform6Package.RELEASE_DIRECTIVE: return createReleaseDirective();
      case Inform6Package.REPLACE_DIRECTIVE: return createReplaceDirective();
      case Inform6Package.SERIAL_DIRECTIVE: return createSerialDirective();
      case Inform6Package.GLOBAL_CONSTANT_DECLARATION: return createGlobalConstantDeclaration();
      case Inform6Package.GLOBAL_DEFAULT_DECLARATION: return createGlobalDefaultDeclaration();
      case Inform6Package.SWITCHES_DECLARATION: return createSwitchesDeclaration();
      case Inform6Package.GLOBAL_DECLARATION: return createGlobalDeclaration();
      case Inform6Package.GLOBAL_CONSTANT_VALUE: return createGlobalConstantValue();
      case Inform6Package.ATTRIBUTE_DECLARATION: return createAttributeDeclaration();
      case Inform6Package.PROPERTY_DECLARATION: return createPropertyDeclaration();
      case Inform6Package.CLASS_DECLARATION: return createClassDeclaration();
      case Inform6Package.OBJECT_DECLARATION: return createObjectDeclaration();
      case Inform6Package.IDLESS_OBJECT_DECLARATION: return createIdlessObjectDeclaration();
      case Inform6Package.NEARBY_DECLARATION: return createNearbyDeclaration();
      case Inform6Package.VERB_DECLARATION: return createVerbDeclaration();
      case Inform6Package.VERB_BODY: return createVerbBody();
      case Inform6Package.VERB_ASSIGNMENT: return createVerbAssignment();
      case Inform6Package.ARRAY_DECLARATION: return createArrayDeclaration();
      case Inform6Package.ARRAY_TYPE: return createArrayType();
      case Inform6Package.CLASS_SECTION: return createClassSection();
      case Inform6Package.PROPERTY_SECTION: return createPropertySection();
      case Inform6Package.ATTRIBUTE_SECTION: return createAttributeSection();
      case Inform6Package.PROPERTY: return createProperty();
      case Inform6Package.ABSTRACT_ARRAY: return createAbstractArray();
      case Inform6Package.ABSTRACT_PROPERTY: return createAbstractProperty();
      case Inform6Package.GLOBAL_FUNCTION_DEFINITION: return createGlobalFunctionDefinition();
      case Inform6Package.EXPRESSION: return createExpression();
      case Inform6Package.FUNCTION_HEADER: return createFunctionHeader();
      case Inform6Package.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case Inform6Package.FUNCTION_BODY: return createFunctionBody();
      case Inform6Package.ANY_TOKEN: return createAnyToken();
      case Inform6Package.PRIMARY: return createPrimary();
      case Inform6Package.NUMBER: return createNumber();
      case Inform6Package.ATTRIBUTE: return createAttribute();
      case Inform6Package.BYTE_ARRAY: return createBYTE_ARRAY();
      case Inform6Package.WORD_ARRAY: return createWORD_ARRAY();
      case Inform6Package.TABLE_ARRAY: return createTABLE_ARRAY();
      case Inform6Package.STRING_ARRAY: return createSTRING_ARRAY();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Directive createDirective()
  {
    DirectiveImpl directive = new DirectiveImpl();
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MessageDirective createMessageDirective()
  {
    MessageDirectiveImpl messageDirective = new MessageDirectiveImpl();
    return messageDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ZcharacterDirective createZcharacterDirective()
  {
    ZcharacterDirectiveImpl zcharacterDirective = new ZcharacterDirectiveImpl();
    return zcharacterDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommentDeclaration createCommentDeclaration()
  {
    CommentDeclarationImpl commentDeclaration = new CommentDeclarationImpl();
    return commentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompilerDirective createCompilerDirective()
  {
    CompilerDirectiveImpl compilerDirective = new CompilerDirectiveImpl();
    return compilerDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IncludeDeclaration createIncludeDeclaration()
  {
    IncludeDeclarationImpl includeDeclaration = new IncludeDeclarationImpl();
    return includeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyDirective createPropertyDirective()
  {
    PropertyDirectiveImpl propertyDirective = new PropertyDirectiveImpl();
    return propertyDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReleaseDirective createReleaseDirective()
  {
    ReleaseDirectiveImpl releaseDirective = new ReleaseDirectiveImpl();
    return releaseDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReplaceDirective createReplaceDirective()
  {
    ReplaceDirectiveImpl replaceDirective = new ReplaceDirectiveImpl();
    return replaceDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SerialDirective createSerialDirective()
  {
    SerialDirectiveImpl serialDirective = new SerialDirectiveImpl();
    return serialDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalConstantDeclaration createGlobalConstantDeclaration()
  {
    GlobalConstantDeclarationImpl globalConstantDeclaration = new GlobalConstantDeclarationImpl();
    return globalConstantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalDefaultDeclaration createGlobalDefaultDeclaration()
  {
    GlobalDefaultDeclarationImpl globalDefaultDeclaration = new GlobalDefaultDeclarationImpl();
    return globalDefaultDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SwitchesDeclaration createSwitchesDeclaration()
  {
    SwitchesDeclarationImpl switchesDeclaration = new SwitchesDeclarationImpl();
    return switchesDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalDeclaration createGlobalDeclaration()
  {
    GlobalDeclarationImpl globalDeclaration = new GlobalDeclarationImpl();
    return globalDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalConstantValue createGlobalConstantValue()
  {
    GlobalConstantValueImpl globalConstantValue = new GlobalConstantValueImpl();
    return globalConstantValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeDeclaration createAttributeDeclaration()
  {
    AttributeDeclarationImpl attributeDeclaration = new AttributeDeclarationImpl();
    return attributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyDeclaration createPropertyDeclaration()
  {
    PropertyDeclarationImpl propertyDeclaration = new PropertyDeclarationImpl();
    return propertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassDeclaration createClassDeclaration()
  {
    ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
    return classDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectDeclaration createObjectDeclaration()
  {
    ObjectDeclarationImpl objectDeclaration = new ObjectDeclarationImpl();
    return objectDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdlessObjectDeclaration createIdlessObjectDeclaration()
  {
    IdlessObjectDeclarationImpl idlessObjectDeclaration = new IdlessObjectDeclarationImpl();
    return idlessObjectDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NearbyDeclaration createNearbyDeclaration()
  {
    NearbyDeclarationImpl nearbyDeclaration = new NearbyDeclarationImpl();
    return nearbyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerbDeclaration createVerbDeclaration()
  {
    VerbDeclarationImpl verbDeclaration = new VerbDeclarationImpl();
    return verbDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerbBody createVerbBody()
  {
    VerbBodyImpl verbBody = new VerbBodyImpl();
    return verbBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerbAssignment createVerbAssignment()
  {
    VerbAssignmentImpl verbAssignment = new VerbAssignmentImpl();
    return verbAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayDeclaration createArrayDeclaration()
  {
    ArrayDeclarationImpl arrayDeclaration = new ArrayDeclarationImpl();
    return arrayDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassSection createClassSection()
  {
    ClassSectionImpl classSection = new ClassSectionImpl();
    return classSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertySection createPropertySection()
  {
    PropertySectionImpl propertySection = new PropertySectionImpl();
    return propertySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeSection createAttributeSection()
  {
    AttributeSectionImpl attributeSection = new AttributeSectionImpl();
    return attributeSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractArray createAbstractArray()
  {
    AbstractArrayImpl abstractArray = new AbstractArrayImpl();
    return abstractArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractProperty createAbstractProperty()
  {
    AbstractPropertyImpl abstractProperty = new AbstractPropertyImpl();
    return abstractProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalFunctionDefinition createGlobalFunctionDefinition()
  {
    GlobalFunctionDefinitionImpl globalFunctionDefinition = new GlobalFunctionDefinitionImpl();
    return globalFunctionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionHeader createFunctionHeader()
  {
    FunctionHeaderImpl functionHeader = new FunctionHeaderImpl();
    return functionHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionBody createFunctionBody()
  {
    FunctionBodyImpl functionBody = new FunctionBodyImpl();
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnyToken createAnyToken()
  {
    AnyTokenImpl anyToken = new AnyTokenImpl();
    return anyToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.github.toerob.inform6.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BYTE_ARRAY createBYTE_ARRAY()
  {
    BYTE_ARRAYImpl bytE_ARRAY = new BYTE_ARRAYImpl();
    return bytE_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WORD_ARRAY createWORD_ARRAY()
  {
    WORD_ARRAYImpl worD_ARRAY = new WORD_ARRAYImpl();
    return worD_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TABLE_ARRAY createTABLE_ARRAY()
  {
    TABLE_ARRAYImpl tablE_ARRAY = new TABLE_ARRAYImpl();
    return tablE_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public STRING_ARRAY createSTRING_ARRAY()
  {
    STRING_ARRAYImpl strinG_ARRAY = new STRING_ARRAYImpl();
    return strinG_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inform6Package getInform6Package()
  {
    return (Inform6Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Inform6Package getPackage()
  {
    return Inform6Package.eINSTANCE;
  }

} //Inform6FactoryImpl
