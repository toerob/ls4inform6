/*
 * generated by Xtext 2.22.0
 */
package com.github.toerob.serializer;

import com.github.toerob.inform6.AbstractArray;
import com.github.toerob.inform6.AbstractProperty;
import com.github.toerob.inform6.ArrayDeclaration;
import com.github.toerob.inform6.Attribute;
import com.github.toerob.inform6.AttributeDeclaration;
import com.github.toerob.inform6.AttributeSection;
import com.github.toerob.inform6.BYTE_ARRAY;
import com.github.toerob.inform6.ClassDeclaration;
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
import com.github.toerob.inform6.IncludeDeclaration;
import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.inform6.MessageDirective;
import com.github.toerob.inform6.ObjectDeclaration;
import com.github.toerob.inform6.Primary;
import com.github.toerob.inform6.Program;
import com.github.toerob.inform6.Property;
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
import com.github.toerob.services.Inform6GrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Inform6SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Inform6GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Inform6Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Inform6Package.ABSTRACT_ARRAY:
				sequence_AbstractArray(context, (AbstractArray) semanticObject); 
				return; 
			case Inform6Package.ABSTRACT_PROPERTY:
				sequence_Method(context, (AbstractProperty) semanticObject); 
				return; 
			case Inform6Package.ARRAY_DECLARATION:
				sequence_ArrayDeclaration(context, (ArrayDeclaration) semanticObject); 
				return; 
			case Inform6Package.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case Inform6Package.ATTRIBUTE_DECLARATION:
				sequence_AttributeDeclaration(context, (AttributeDeclaration) semanticObject); 
				return; 
			case Inform6Package.ATTRIBUTE_SECTION:
				sequence_AttributeSection(context, (AttributeSection) semanticObject); 
				return; 
			case Inform6Package.BYTE_ARRAY:
				sequence_ArrayType(context, (BYTE_ARRAY) semanticObject); 
				return; 
			case Inform6Package.CLASS_DECLARATION:
				sequence_ClassDeclaration(context, (ClassDeclaration) semanticObject); 
				return; 
			case Inform6Package.COMMENT_DECLARATION:
				sequence_CommentDeclaration(context, (CommentDeclaration) semanticObject); 
				return; 
			case Inform6Package.COMPILER_DIRECTIVE:
				sequence_CompilerDirective(context, (CompilerDirective) semanticObject); 
				return; 
			case Inform6Package.DIRECTIVE:
				sequence_Directive(context, (Directive) semanticObject); 
				return; 
			case Inform6Package.EXPRESSION:
				sequence_PrimaryExpression(context, (Expression) semanticObject); 
				return; 
			case Inform6Package.FUNCTION_HEADER:
				sequence_FunctionHeader(context, (FunctionHeader) semanticObject); 
				return; 
			case Inform6Package.GLOBAL_CONSTANT_DECLARATION:
				sequence_GlobalConstantDeclaration(context, (GlobalConstantDeclaration) semanticObject); 
				return; 
			case Inform6Package.GLOBAL_CONSTANT_VALUE:
				sequence_GlobalConstantValue(context, (GlobalConstantValue) semanticObject); 
				return; 
			case Inform6Package.GLOBAL_DECLARATION:
				sequence_GlobalDeclaration(context, (GlobalDeclaration) semanticObject); 
				return; 
			case Inform6Package.GLOBAL_DEFAULT_DECLARATION:
				sequence_GlobalDefaultDeclaration(context, (GlobalDefaultDeclaration) semanticObject); 
				return; 
			case Inform6Package.GLOBAL_FUNCTION_DEFINITION:
				sequence_GlobalFunctionDefinition(context, (GlobalFunctionDefinition) semanticObject); 
				return; 
			case Inform6Package.INCLUDE_DECLARATION:
				sequence_IncludeDeclaration(context, (IncludeDeclaration) semanticObject); 
				return; 
			case Inform6Package.MESSAGE_DIRECTIVE:
				sequence_MessageDirective(context, (MessageDirective) semanticObject); 
				return; 
			case Inform6Package.NUMBER:
				sequence_Number(context, (com.github.toerob.inform6.Number) semanticObject); 
				return; 
			case Inform6Package.OBJECT_DECLARATION:
				if (rule == grammarAccess.getIdlessObjectDeclarationRule()) {
					sequence_IdlessObjectDeclaration(context, (ObjectDeclaration) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNearbyDeclarationRule()) {
					sequence_NearbyDeclaration(context, (ObjectDeclaration) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getObjectDeclarationRule()) {
					sequence_ObjectDeclaration(context, (ObjectDeclaration) semanticObject); 
					return; 
				}
				else break;
			case Inform6Package.PRIMARY:
				sequence_Primary(context, (Primary) semanticObject); 
				return; 
			case Inform6Package.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case Inform6Package.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case Inform6Package.PROPERTY_DIRECTIVE:
				sequence_PropertyDirective(context, (PropertyDirective) semanticObject); 
				return; 
			case Inform6Package.PROPERTY_SECTION:
				if (rule == grammarAccess.getClassSectionRule()) {
					sequence_ClassSection(context, (PropertySection) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertySectionRule()) {
					sequence_PropertySection(context, (PropertySection) semanticObject); 
					return; 
				}
				else break;
			case Inform6Package.RELEASE_DIRECTIVE:
				sequence_ReleaseDirective(context, (ReleaseDirective) semanticObject); 
				return; 
			case Inform6Package.REPLACE_DIRECTIVE:
				sequence_ReplaceDirective(context, (ReplaceDirective) semanticObject); 
				return; 
			case Inform6Package.STRING_ARRAY:
				sequence_ArrayType(context, (STRING_ARRAY) semanticObject); 
				return; 
			case Inform6Package.SERIAL_DIRECTIVE:
				sequence_SerialDirective(context, (SerialDirective) semanticObject); 
				return; 
			case Inform6Package.SWITCHES_DECLARATION:
				sequence_SwitchesDeclaration(context, (SwitchesDeclaration) semanticObject); 
				return; 
			case Inform6Package.TABLE_ARRAY:
				sequence_ArrayType(context, (TABLE_ARRAY) semanticObject); 
				return; 
			case Inform6Package.VERB_ASSIGNMENT:
				sequence_VerbAssignment(context, (VerbAssignment) semanticObject); 
				return; 
			case Inform6Package.VERB_BODY:
				sequence_VerbBody(context, (VerbBody) semanticObject); 
				return; 
			case Inform6Package.VERB_DECLARATION:
				sequence_VerbDeclaration(context, (VerbDeclaration) semanticObject); 
				return; 
			case Inform6Package.WORD_ARRAY:
				sequence_ArrayType(context, (WORD_ARRAY) semanticObject); 
				return; 
			case Inform6Package.ZCHARACTER_DIRECTIVE:
				sequence_ZcharacterDirective(context, (ZcharacterDirective) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractArray returns AbstractArray
	 *
	 * Constraint:
	 *     (array+=Primary? array+=Primary*)
	 */
	protected void sequence_AbstractArray(ISerializationContext context, AbstractArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArrayDeclaration returns ArrayDeclaration
	 *
	 * Constraint:
	 *     ((name=ID | name='buffer') arrayBody=ArrayType)
	 */
	protected void sequence_ArrayDeclaration(ISerializationContext context, ArrayDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArrayType returns BYTE_ARRAY
	 *
	 * Constraint:
	 *     (type=BYTE_ARROW size=PrimaryExpression? content+=PrimaryExpression*)
	 */
	protected void sequence_ArrayType(ISerializationContext context, BYTE_ARRAY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArrayType returns STRING_ARRAY
	 *
	 * Constraint:
	 *     (type='string' size=PrimaryExpression? content+=STRING?)
	 */
	protected void sequence_ArrayType(ISerializationContext context, STRING_ARRAY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArrayType returns TABLE_ARRAY
	 *
	 * Constraint:
	 *     ((type='table' | type='buffer') size=PrimaryExpression? content+=PrimaryExpression*)
	 */
	protected void sequence_ArrayType(ISerializationContext context, TABLE_ARRAY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArrayType returns WORD_ARRAY
	 *
	 * Constraint:
	 *     (type=WORD_ARROW size=PrimaryExpression? content+=PrimaryExpression*)
	 */
	protected void sequence_ArrayType(ISerializationContext context, WORD_ARRAY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeDeclaration returns AttributeDeclaration
	 *
	 * Constraint:
	 *     ((name=ID | name=STATIC) (aliasedAttribute=ID | aliasedAttribute=STATIC)?)
	 */
	protected void sequence_AttributeDeclaration(ISerializationContext context, AttributeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeSection returns AttributeSection
	 *
	 * Constraint:
	 *     (name='has' attributes+=Attribute attributes+=Attribute*)
	 */
	protected void sequence_AttributeSection(ISerializationContext context, AttributeSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=[AttributeDeclaration|ID] | name=[AttributeDeclaration|STATIC])
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDeclaration returns ClassDeclaration
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (cardinality='(' max=Primary)? 
	 *         (properties+=ClassSection | properties+=PropertySection | properties+=AttributeSection)? 
	 *         properties+=ClassSection? 
	 *         ((properties+=PropertySection | properties+=AttributeSection)? properties+=ClassSection?)*
	 *     )
	 */
	protected void sequence_ClassDeclaration(ISerializationContext context, ClassDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassSection returns PropertySection
	 *
	 * Constraint:
	 *     (name='class' classProperty=Property)
	 */
	protected void sequence_ClassSection(ISerializationContext context, PropertySection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.PROPERTY_SECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.PROPERTY_SECTION__NAME));
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.PROPERTY_SECTION__CLASS_PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.PROPERTY_SECTION__CLASS_PROPERTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassSectionAccess().getNameClassKeyword_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getClassSectionAccess().getClassPropertyPropertyParserRuleCall_2_0(), semanticObject.getClassProperty());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns CommentDeclaration
	 *     CommentDeclaration returns CommentDeclaration
	 *
	 * Constraint:
	 *     {CommentDeclaration}
	 */
	protected void sequence_CommentDeclaration(ISerializationContext context, CommentDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns CompilerDirective
	 *     CommentDeclaration returns CompilerDirective
	 *     CompilerDirective returns CompilerDirective
	 *
	 * Constraint:
	 *     value=COMPILER_DIRECTIVE_COMMENT
	 */
	protected void sequence_CompilerDirective(ISerializationContext context, CompilerDirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.COMPILER_DIRECTIVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.COMPILER_DIRECTIVE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompilerDirectiveAccess().getValueCOMPILER_DIRECTIVE_COMMENTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns Directive
	 *
	 * Constraint:
	 *     (
	 *         globals+=GlobalDeclaration | 
	 *         defaults+=GlobalDefaultDeclaration | 
	 *         constants+=GlobalConstantDeclaration | 
	 *         globalFunctions+=GlobalFunctionDefinition | 
	 *         attributes+=AttributeDeclaration | 
	 *         properties+=PropertyDirective | 
	 *         classes+=ClassDeclaration | 
	 *         objects+=ObjectDeclaration | 
	 *         idlessobjects+=IdlessObjectDeclaration | 
	 *         nearbyObjects+=NearbyDeclaration | 
	 *         verbs+=VerbDeclaration | 
	 *         arrays+=ArrayDeclaration
	 *     )?
	 */
	protected void sequence_Directive(ISerializationContext context, Directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionHeader returns FunctionHeader
	 *
	 * Constraint:
	 *     variables+=ID*
	 */
	protected void sequence_FunctionHeader(ISerializationContext context, FunctionHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GlobalConstantDeclaration returns GlobalConstantDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=GlobalConstantValue?)
	 */
	protected void sequence_GlobalConstantDeclaration(ISerializationContext context, GlobalConstantDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GlobalConstantValue returns GlobalConstantValue
	 *
	 * Constraint:
	 *     name=Primary
	 */
	protected void sequence_GlobalConstantValue(ISerializationContext context, GlobalConstantValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.GLOBAL_CONSTANT_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.GLOBAL_CONSTANT_VALUE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalConstantValueAccess().getNamePrimaryParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GlobalDeclaration returns GlobalDeclaration
	 *
	 * Constraint:
	 *     ((name=ID | name='meta') value=Primary?)
	 */
	protected void sequence_GlobalDeclaration(ISerializationContext context, GlobalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GlobalDefaultDeclaration returns GlobalDefaultDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=GlobalConstantValue?)
	 */
	protected void sequence_GlobalDefaultDeclaration(ISerializationContext context, GlobalDefaultDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GlobalFunctionDefinition returns GlobalFunctionDefinition
	 *
	 * Constraint:
	 *     (functionHeader=FunctionHeader functionBody=FunctionBody)
	 */
	protected void sequence_GlobalFunctionDefinition(ISerializationContext context, GlobalFunctionDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.GLOBAL_FUNCTION_DEFINITION__FUNCTION_HEADER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.GLOBAL_FUNCTION_DEFINITION__FUNCTION_HEADER));
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.GLOBAL_FUNCTION_DEFINITION__FUNCTION_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.GLOBAL_FUNCTION_DEFINITION__FUNCTION_BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalFunctionDefinitionAccess().getFunctionHeaderFunctionHeaderParserRuleCall_1_0(), semanticObject.getFunctionHeader());
		feeder.accept(grammarAccess.getGlobalFunctionDefinitionAccess().getFunctionBodyFunctionBodyParserRuleCall_2_0(), semanticObject.getFunctionBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IdlessObjectDeclaration returns ObjectDeclaration
	 *
	 * Constraint:
	 *     (
	 *         (object='Object' | superType=[ClassDeclaration|ID]) 
	 *         level+=BYTE_ARROW* 
	 *         name=STRING? 
	 *         in=[ObjectDeclaration|ID]? 
	 *         (properties+=ClassSection | properties+=PropertySection | properties+=AttributeSection)? 
	 *         properties+=ClassSection? 
	 *         ((properties+=PropertySection | properties+=AttributeSection)? properties+=ClassSection?)*
	 *     )
	 */
	protected void sequence_IdlessObjectDeclaration(ISerializationContext context, ObjectDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IncludeDeclaration returns IncludeDeclaration
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_IncludeDeclaration(ISerializationContext context, IncludeDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.INCLUDE_DECLARATION__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.INCLUDE_DECLARATION__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIncludeDeclarationAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns MessageDirective
	 *     MessageDirective returns MessageDirective
	 *
	 * Constraint:
	 *     (name=ID? string=STRING)
	 */
	protected void sequence_MessageDirective(ISerializationContext context, MessageDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns AbstractProperty
	 *
	 * Constraint:
	 *     functionBody=FunctionBody
	 */
	protected void sequence_Method(ISerializationContext context, AbstractProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.ABSTRACT_PROPERTY__FUNCTION_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.ABSTRACT_PROPERTY__FUNCTION_BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodAccess().getFunctionBodyFunctionBodyParserRuleCall_1_0(), semanticObject.getFunctionBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NearbyDeclaration returns ObjectDeclaration
	 *
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         headline=STRING 
	 *         in=[ObjectDeclaration|ID]? 
	 *         (properties+=ClassSection | properties+=PropertySection | properties+=AttributeSection)? 
	 *         properties+=ClassSection? 
	 *         ((properties+=PropertySection | properties+=AttributeSection)? properties+=ClassSection?)*
	 *     )
	 */
	protected void sequence_NearbyDeclaration(ISerializationContext context, ObjectDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Number returns Number
	 *
	 * Constraint:
	 *     (negative='-'? value=INT)
	 */
	protected void sequence_Number(ISerializationContext context, com.github.toerob.inform6.Number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectDeclaration returns ObjectDeclaration
	 *
	 * Constraint:
	 *     (
	 *         (object='Object' | superType=[ClassDeclaration|ID]) 
	 *         level+=BYTE_ARROW* 
	 *         name=ID 
	 *         headline=STRING? 
	 *         in=[ObjectDeclaration|ID]? 
	 *         (properties+=ClassSection | properties+=PropertySection | properties+=AttributeSection)? 
	 *         properties+=ClassSection? 
	 *         ((properties+=PropertySection | properties+=AttributeSection)? properties+=ClassSection?)*
	 *     )
	 */
	protected void sequence_ObjectDeclaration(ISerializationContext context, ObjectDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Expression
	 *
	 * Constraint:
	 *     (
	 *         (left=Primary (operator='/' | operator='*' | operator='+' | operator='-') right=Primary) | 
	 *         (left=Primary (operator='/' | operator='*' | operator='+' | operator='-') right=Primary) | 
	 *         left=Primary | 
	 *         left=Primary | 
	 *         unparsedTokens+=FuzzyExpression+
	 *     )?
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VerbAssignment returns Primary
	 *     Primary returns Primary
	 *
	 * Constraint:
	 *     (
	 *         id=ID | 
	 *         number=Number | 
	 *         string=STRING | 
	 *         direction=DIRECTIONS | 
	 *         hex=HEX | 
	 *         binary=BINARY
	 *     )
	 */
	protected void sequence_Primary(ISerializationContext context, Primary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (directives+=Directive | imports+=IncludeDeclaration)+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyDirective returns PropertyDirective
	 *
	 * Constraint:
	 *     (additive?='additive'? (name=ID | name=DIRECTIONS | name='found_in') alias?='alias'? value=Primary?)
	 */
	protected void sequence_PropertyDirective(ISerializationContext context, PropertyDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertySection returns PropertySection
	 *
	 * Constraint:
	 *     ((name='with' | name='private') properties+=Property? properties+=Property*)?
	 */
	protected void sequence_PropertySection(ISerializationContext context, PropertySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (
	 *         (name=ID (method=Method | array=AbstractArray)) | 
	 *         (name=DIRECTIONS (objectReference=[ObjectDeclaration|ID] | value=Primary | method=Method | array=AbstractArray)) | 
	 *         objectReferences+=[ObjectDeclaration|ID]+ | 
	 *         method=Method | 
	 *         value=Primary
	 *     )?
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns ReleaseDirective
	 *     ReleaseDirective returns ReleaseDirective
	 *
	 * Constraint:
	 *     (name='Release' version=INT)
	 */
	protected void sequence_ReleaseDirective(ISerializationContext context, ReleaseDirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.RELEASE_DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.RELEASE_DIRECTIVE__NAME));
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.RELEASE_DIRECTIVE__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.RELEASE_DIRECTIVE__VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReleaseDirectiveAccess().getNameReleaseKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReleaseDirectiveAccess().getVersionINTTerminalRuleCall_1_0(), semanticObject.getVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns ReplaceDirective
	 *     ReplaceDirective returns ReplaceDirective
	 *
	 * Constraint:
	 *     (name='Replace' id=ID)
	 */
	protected void sequence_ReplaceDirective(ISerializationContext context, ReplaceDirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.REPLACE_DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.REPLACE_DIRECTIVE__NAME));
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.REPLACE_DIRECTIVE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.REPLACE_DIRECTIVE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReplaceDirectiveAccess().getNameReplaceKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReplaceDirectiveAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns SerialDirective
	 *     SerialDirective returns SerialDirective
	 *
	 * Constraint:
	 *     (name='Serial' serial=STRING)
	 */
	protected void sequence_SerialDirective(ISerializationContext context, SerialDirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.SERIAL_DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.SERIAL_DIRECTIVE__NAME));
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.SERIAL_DIRECTIVE__SERIAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.SERIAL_DIRECTIVE__SERIAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSerialDirectiveAccess().getNameSerialKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSerialDirectiveAccess().getSerialSTRINGTerminalRuleCall_1_0(), semanticObject.getSerial());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns SwitchesDeclaration
	 *     SwitchesDeclaration returns SwitchesDeclaration
	 *
	 * Constraint:
	 *     (name='Switches' switches+=Primary*)
	 */
	protected void sequence_SwitchesDeclaration(ISerializationContext context, SwitchesDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VerbAssignment returns VerbAssignment
	 *
	 * Constraint:
	 *     {VerbAssignment}
	 */
	protected void sequence_VerbAssignment(ISerializationContext context, VerbAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VerbBody returns VerbBody
	 *
	 * Constraint:
	 *     (definitions+=VerbAssignment* name=ID reverse='reverse'?)
	 */
	protected void sequence_VerbBody(ISerializationContext context, VerbBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VerbDeclaration returns VerbDeclaration
	 *
	 * Constraint:
	 *     ((name='Verb' meta='meta'? syn+=STRING* defintions+=VerbBody*) | (name='Extend' only='only'? syn+=STRING* defintions+=VerbBody*))
	 */
	protected void sequence_VerbDeclaration(ISerializationContext context, VerbDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Directive returns ZcharacterDirective
	 *     ZcharacterDirective returns ZcharacterDirective
	 *
	 * Constraint:
	 *     string=STRING
	 */
	protected void sequence_ZcharacterDirective(ISerializationContext context, ZcharacterDirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Inform6Package.Literals.ZCHARACTER_DIRECTIVE__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Inform6Package.Literals.ZCHARACTER_DIRECTIVE__STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getZcharacterDirectiveAccess().getStringSTRINGTerminalRuleCall_1_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
}
