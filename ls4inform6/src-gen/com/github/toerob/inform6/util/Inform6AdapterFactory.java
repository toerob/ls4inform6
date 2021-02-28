/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6.util;

import com.github.toerob.inform6.AbstractArray;
import com.github.toerob.inform6.AbstractProperty;
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
import com.github.toerob.inform6.FunctionHeader;
import com.github.toerob.inform6.GlobalConstantDeclaration;
import com.github.toerob.inform6.GlobalConstantValue;
import com.github.toerob.inform6.GlobalDeclaration;
import com.github.toerob.inform6.GlobalDefaultDeclaration;
import com.github.toerob.inform6.GlobalFunctionDefinition;
import com.github.toerob.inform6.IdlessObjectDeclaration;
import com.github.toerob.inform6.IncludeDeclaration;
import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.inform6.MessageDirective;
import com.github.toerob.inform6.NearbyDeclaration;
import com.github.toerob.inform6.ObjectDeclaration;
import com.github.toerob.inform6.Primary;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.toerob.inform6.Inform6Package
 * @generated
 */
public class Inform6AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Inform6Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inform6AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Inform6Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Inform6Switch<Adapter> modelSwitch =
    new Inform6Switch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseDirective(Directive object)
      {
        return createDirectiveAdapter();
      }
      @Override
      public Adapter caseMessageDirective(MessageDirective object)
      {
        return createMessageDirectiveAdapter();
      }
      @Override
      public Adapter caseZcharacterDirective(ZcharacterDirective object)
      {
        return createZcharacterDirectiveAdapter();
      }
      @Override
      public Adapter caseCommentDeclaration(CommentDeclaration object)
      {
        return createCommentDeclarationAdapter();
      }
      @Override
      public Adapter caseCompilerDirective(CompilerDirective object)
      {
        return createCompilerDirectiveAdapter();
      }
      @Override
      public Adapter caseIncludeDeclaration(IncludeDeclaration object)
      {
        return createIncludeDeclarationAdapter();
      }
      @Override
      public Adapter casePropertyDirective(PropertyDirective object)
      {
        return createPropertyDirectiveAdapter();
      }
      @Override
      public Adapter caseReleaseDirective(ReleaseDirective object)
      {
        return createReleaseDirectiveAdapter();
      }
      @Override
      public Adapter caseReplaceDirective(ReplaceDirective object)
      {
        return createReplaceDirectiveAdapter();
      }
      @Override
      public Adapter caseSerialDirective(SerialDirective object)
      {
        return createSerialDirectiveAdapter();
      }
      @Override
      public Adapter caseGlobalConstantDeclaration(GlobalConstantDeclaration object)
      {
        return createGlobalConstantDeclarationAdapter();
      }
      @Override
      public Adapter caseGlobalDefaultDeclaration(GlobalDefaultDeclaration object)
      {
        return createGlobalDefaultDeclarationAdapter();
      }
      @Override
      public Adapter caseSwitchesDeclaration(SwitchesDeclaration object)
      {
        return createSwitchesDeclarationAdapter();
      }
      @Override
      public Adapter caseGlobalDeclaration(GlobalDeclaration object)
      {
        return createGlobalDeclarationAdapter();
      }
      @Override
      public Adapter caseGlobalConstantValue(GlobalConstantValue object)
      {
        return createGlobalConstantValueAdapter();
      }
      @Override
      public Adapter caseAttributeDeclaration(AttributeDeclaration object)
      {
        return createAttributeDeclarationAdapter();
      }
      @Override
      public Adapter casePropertyDeclaration(PropertyDeclaration object)
      {
        return createPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseClassDeclaration(ClassDeclaration object)
      {
        return createClassDeclarationAdapter();
      }
      @Override
      public Adapter caseObjectDeclaration(ObjectDeclaration object)
      {
        return createObjectDeclarationAdapter();
      }
      @Override
      public Adapter caseIdlessObjectDeclaration(IdlessObjectDeclaration object)
      {
        return createIdlessObjectDeclarationAdapter();
      }
      @Override
      public Adapter caseNearbyDeclaration(NearbyDeclaration object)
      {
        return createNearbyDeclarationAdapter();
      }
      @Override
      public Adapter caseVerbDeclaration(VerbDeclaration object)
      {
        return createVerbDeclarationAdapter();
      }
      @Override
      public Adapter caseVerbBody(VerbBody object)
      {
        return createVerbBodyAdapter();
      }
      @Override
      public Adapter caseVerbAssignment(VerbAssignment object)
      {
        return createVerbAssignmentAdapter();
      }
      @Override
      public Adapter caseArrayDeclaration(ArrayDeclaration object)
      {
        return createArrayDeclarationAdapter();
      }
      @Override
      public Adapter caseArrayType(ArrayType object)
      {
        return createArrayTypeAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseClassSection(ClassSection object)
      {
        return createClassSectionAdapter();
      }
      @Override
      public Adapter casePropertySection(PropertySection object)
      {
        return createPropertySectionAdapter();
      }
      @Override
      public Adapter caseAttributeSection(AttributeSection object)
      {
        return createAttributeSectionAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseAbstractArray(AbstractArray object)
      {
        return createAbstractArrayAdapter();
      }
      @Override
      public Adapter caseAbstractProperty(AbstractProperty object)
      {
        return createAbstractPropertyAdapter();
      }
      @Override
      public Adapter caseGlobalFunctionDefinition(GlobalFunctionDefinition object)
      {
        return createGlobalFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionHeader(FunctionHeader object)
      {
        return createFunctionHeaderAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
      }
      @Override
      public Adapter caseNumber(com.github.toerob.inform6.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseBYTE_ARRAY(BYTE_ARRAY object)
      {
        return createBYTE_ARRAYAdapter();
      }
      @Override
      public Adapter caseWORD_ARRAY(WORD_ARRAY object)
      {
        return createWORD_ARRAYAdapter();
      }
      @Override
      public Adapter caseTABLE_ARRAY(TABLE_ARRAY object)
      {
        return createTABLE_ARRAYAdapter();
      }
      @Override
      public Adapter caseSTRING_ARRAY(STRING_ARRAY object)
      {
        return createSTRING_ARRAYAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.Directive <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.Directive
   * @generated
   */
  public Adapter createDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.MessageDirective <em>Message Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.MessageDirective
   * @generated
   */
  public Adapter createMessageDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ZcharacterDirective <em>Zcharacter Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ZcharacterDirective
   * @generated
   */
  public Adapter createZcharacterDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.CommentDeclaration <em>Comment Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.CommentDeclaration
   * @generated
   */
  public Adapter createCommentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.CompilerDirective <em>Compiler Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.CompilerDirective
   * @generated
   */
  public Adapter createCompilerDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.IncludeDeclaration <em>Include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.IncludeDeclaration
   * @generated
   */
  public Adapter createIncludeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.PropertyDirective <em>Property Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.PropertyDirective
   * @generated
   */
  public Adapter createPropertyDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ReleaseDirective <em>Release Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ReleaseDirective
   * @generated
   */
  public Adapter createReleaseDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ReplaceDirective <em>Replace Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ReplaceDirective
   * @generated
   */
  public Adapter createReplaceDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.SerialDirective <em>Serial Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.SerialDirective
   * @generated
   */
  public Adapter createSerialDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.GlobalConstantDeclaration <em>Global Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.GlobalConstantDeclaration
   * @generated
   */
  public Adapter createGlobalConstantDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.GlobalDefaultDeclaration <em>Global Default Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.GlobalDefaultDeclaration
   * @generated
   */
  public Adapter createGlobalDefaultDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.SwitchesDeclaration <em>Switches Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.SwitchesDeclaration
   * @generated
   */
  public Adapter createSwitchesDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.GlobalDeclaration <em>Global Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.GlobalDeclaration
   * @generated
   */
  public Adapter createGlobalDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.GlobalConstantValue <em>Global Constant Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.GlobalConstantValue
   * @generated
   */
  public Adapter createGlobalConstantValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.AttributeDeclaration
   * @generated
   */
  public Adapter createAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.PropertyDeclaration
   * @generated
   */
  public Adapter createPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ClassDeclaration
   * @generated
   */
  public Adapter createClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ObjectDeclaration <em>Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ObjectDeclaration
   * @generated
   */
  public Adapter createObjectDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.IdlessObjectDeclaration <em>Idless Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.IdlessObjectDeclaration
   * @generated
   */
  public Adapter createIdlessObjectDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.NearbyDeclaration <em>Nearby Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.NearbyDeclaration
   * @generated
   */
  public Adapter createNearbyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.VerbDeclaration <em>Verb Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.VerbDeclaration
   * @generated
   */
  public Adapter createVerbDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.VerbBody <em>Verb Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.VerbBody
   * @generated
   */
  public Adapter createVerbBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.VerbAssignment <em>Verb Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.VerbAssignment
   * @generated
   */
  public Adapter createVerbAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ArrayDeclaration <em>Array Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ArrayDeclaration
   * @generated
   */
  public Adapter createArrayDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ArrayType
   * @generated
   */
  public Adapter createArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.ClassSection <em>Class Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.ClassSection
   * @generated
   */
  public Adapter createClassSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.PropertySection <em>Property Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.PropertySection
   * @generated
   */
  public Adapter createPropertySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.AttributeSection <em>Attribute Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.AttributeSection
   * @generated
   */
  public Adapter createAttributeSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.AbstractArray <em>Abstract Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.AbstractArray
   * @generated
   */
  public Adapter createAbstractArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.AbstractProperty <em>Abstract Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.AbstractProperty
   * @generated
   */
  public Adapter createAbstractPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.GlobalFunctionDefinition <em>Global Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.GlobalFunctionDefinition
   * @generated
   */
  public Adapter createGlobalFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.FunctionHeader <em>Function Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.FunctionHeader
   * @generated
   */
  public Adapter createFunctionHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.BYTE_ARRAY <em>BYTE ARRAY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.BYTE_ARRAY
   * @generated
   */
  public Adapter createBYTE_ARRAYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.WORD_ARRAY <em>WORD ARRAY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.WORD_ARRAY
   * @generated
   */
  public Adapter createWORD_ARRAYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.TABLE_ARRAY <em>TABLE ARRAY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.TABLE_ARRAY
   * @generated
   */
  public Adapter createTABLE_ARRAYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.toerob.inform6.STRING_ARRAY <em>STRING ARRAY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.toerob.inform6.STRING_ARRAY
   * @generated
   */
  public Adapter createSTRING_ARRAYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Inform6AdapterFactory
