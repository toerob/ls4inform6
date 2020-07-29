/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6.impl;

import com.github.toerob.inform6.AttributeDeclaration;
import com.github.toerob.inform6.Inform6Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.impl.AttributeDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.AttributeDeclarationImpl#getAliasedAttribute <em>Aliased Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDeclarationImpl extends DirectiveImpl implements AttributeDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAliasedAttribute() <em>Aliased Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliasedAttribute()
   * @generated
   * @ordered
   */
  protected static final String ALIASED_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAliasedAttribute() <em>Aliased Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliasedAttribute()
   * @generated
   * @ordered
   */
  protected String aliasedAttribute = ALIASED_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Inform6Package.Literals.ATTRIBUTE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.ATTRIBUTE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAliasedAttribute()
  {
    return aliasedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAliasedAttribute(String newAliasedAttribute)
  {
    String oldAliasedAttribute = aliasedAttribute;
    aliasedAttribute = newAliasedAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.ATTRIBUTE_DECLARATION__ALIASED_ATTRIBUTE, oldAliasedAttribute, aliasedAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Inform6Package.ATTRIBUTE_DECLARATION__NAME:
        return getName();
      case Inform6Package.ATTRIBUTE_DECLARATION__ALIASED_ATTRIBUTE:
        return getAliasedAttribute();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Inform6Package.ATTRIBUTE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case Inform6Package.ATTRIBUTE_DECLARATION__ALIASED_ATTRIBUTE:
        setAliasedAttribute((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Inform6Package.ATTRIBUTE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Inform6Package.ATTRIBUTE_DECLARATION__ALIASED_ATTRIBUTE:
        setAliasedAttribute(ALIASED_ATTRIBUTE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Inform6Package.ATTRIBUTE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Inform6Package.ATTRIBUTE_DECLARATION__ALIASED_ATTRIBUTE:
        return ALIASED_ATTRIBUTE_EDEFAULT == null ? aliasedAttribute != null : !ALIASED_ATTRIBUTE_EDEFAULT.equals(aliasedAttribute);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", aliasedAttribute: ");
    result.append(aliasedAttribute);
    result.append(')');
    return result.toString();
  }

} //AttributeDeclarationImpl
