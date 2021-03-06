/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6.impl;

import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.inform6.Property;
import com.github.toerob.inform6.PropertySection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.impl.PropertySectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.PropertySectionImpl#getClassProperty <em>Class Property</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.PropertySectionImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertySectionImpl extends ClassSectionImpl implements PropertySection
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
   * The cached value of the '{@link #getClassProperty() <em>Class Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassProperty()
   * @generated
   * @ordered
   */
  protected Property classProperty;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertySectionImpl()
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
    return Inform6Package.Literals.PROPERTY_SECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.PROPERTY_SECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getClassProperty()
  {
    return classProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassProperty(Property newClassProperty, NotificationChain msgs)
  {
    Property oldClassProperty = classProperty;
    classProperty = newClassProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY, oldClassProperty, newClassProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClassProperty(Property newClassProperty)
  {
    if (newClassProperty != classProperty)
    {
      NotificationChain msgs = null;
      if (classProperty != null)
        msgs = ((InternalEObject)classProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY, null, msgs);
      if (newClassProperty != null)
        msgs = ((InternalEObject)newClassProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY, null, msgs);
      msgs = basicSetClassProperty(newClassProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY, newClassProperty, newClassProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, Inform6Package.PROPERTY_SECTION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY:
        return basicSetClassProperty(null, msgs);
      case Inform6Package.PROPERTY_SECTION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Inform6Package.PROPERTY_SECTION__NAME:
        return getName();
      case Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY:
        return getClassProperty();
      case Inform6Package.PROPERTY_SECTION__PROPERTIES:
        return getProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Inform6Package.PROPERTY_SECTION__NAME:
        setName((String)newValue);
        return;
      case Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY:
        setClassProperty((Property)newValue);
        return;
      case Inform6Package.PROPERTY_SECTION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
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
      case Inform6Package.PROPERTY_SECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY:
        setClassProperty((Property)null);
        return;
      case Inform6Package.PROPERTY_SECTION__PROPERTIES:
        getProperties().clear();
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
      case Inform6Package.PROPERTY_SECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Inform6Package.PROPERTY_SECTION__CLASS_PROPERTY:
        return classProperty != null;
      case Inform6Package.PROPERTY_SECTION__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //PropertySectionImpl
