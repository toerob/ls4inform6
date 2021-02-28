/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6.impl;

import com.github.toerob.inform6.ClassDeclaration;
import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.inform6.ObjectDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.impl.ObjectDeclarationImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ObjectDeclarationImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ObjectDeclarationImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ObjectDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ObjectDeclarationImpl#getHeadline <em>Headline</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ObjectDeclarationImpl#getIn <em>In</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ObjectDeclarationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectDeclarationImpl extends DirectiveImpl implements ObjectDeclaration
{
  /**
   * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected String object = OBJECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected ClassDeclaration superType;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected EList<String> level;

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
   * The default value of the '{@link #getHeadline() <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadline()
   * @generated
   * @ordered
   */
  protected static final String HEADLINE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeadline() <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadline()
   * @generated
   * @ordered
   */
  protected String headline = HEADLINE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected ObjectDeclaration in;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<EObject> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectDeclarationImpl()
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
    return Inform6Package.Literals.OBJECT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObject(String newObject)
  {
    String oldObject = object;
    object = newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.OBJECT_DECLARATION__OBJECT, oldObject, object));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassDeclaration getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (ClassDeclaration)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inform6Package.OBJECT_DECLARATION__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(ClassDeclaration newSuperType)
  {
    ClassDeclaration oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.OBJECT_DECLARATION__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getLevel()
  {
    if (level == null)
    {
      level = new EDataTypeEList<String>(String.class, this, Inform6Package.OBJECT_DECLARATION__LEVEL);
    }
    return level;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.OBJECT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHeadline()
  {
    return headline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHeadline(String newHeadline)
  {
    String oldHeadline = headline;
    headline = newHeadline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.OBJECT_DECLARATION__HEADLINE, oldHeadline, headline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectDeclaration getIn()
  {
    if (in != null && in.eIsProxy())
    {
      InternalEObject oldIn = (InternalEObject)in;
      in = (ObjectDeclaration)eResolveProxy(oldIn);
      if (in != oldIn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inform6Package.OBJECT_DECLARATION__IN, oldIn, in));
      }
    }
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDeclaration basicGetIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIn(ObjectDeclaration newIn)
  {
    ObjectDeclaration oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.OBJECT_DECLARATION__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<EObject>(EObject.class, this, Inform6Package.OBJECT_DECLARATION__PROPERTIES);
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
      case Inform6Package.OBJECT_DECLARATION__PROPERTIES:
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
      case Inform6Package.OBJECT_DECLARATION__OBJECT:
        return getObject();
      case Inform6Package.OBJECT_DECLARATION__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case Inform6Package.OBJECT_DECLARATION__LEVEL:
        return getLevel();
      case Inform6Package.OBJECT_DECLARATION__NAME:
        return getName();
      case Inform6Package.OBJECT_DECLARATION__HEADLINE:
        return getHeadline();
      case Inform6Package.OBJECT_DECLARATION__IN:
        if (resolve) return getIn();
        return basicGetIn();
      case Inform6Package.OBJECT_DECLARATION__PROPERTIES:
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
      case Inform6Package.OBJECT_DECLARATION__OBJECT:
        setObject((String)newValue);
        return;
      case Inform6Package.OBJECT_DECLARATION__SUPER_TYPE:
        setSuperType((ClassDeclaration)newValue);
        return;
      case Inform6Package.OBJECT_DECLARATION__LEVEL:
        getLevel().clear();
        getLevel().addAll((Collection<? extends String>)newValue);
        return;
      case Inform6Package.OBJECT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case Inform6Package.OBJECT_DECLARATION__HEADLINE:
        setHeadline((String)newValue);
        return;
      case Inform6Package.OBJECT_DECLARATION__IN:
        setIn((ObjectDeclaration)newValue);
        return;
      case Inform6Package.OBJECT_DECLARATION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends EObject>)newValue);
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
      case Inform6Package.OBJECT_DECLARATION__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case Inform6Package.OBJECT_DECLARATION__SUPER_TYPE:
        setSuperType((ClassDeclaration)null);
        return;
      case Inform6Package.OBJECT_DECLARATION__LEVEL:
        getLevel().clear();
        return;
      case Inform6Package.OBJECT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Inform6Package.OBJECT_DECLARATION__HEADLINE:
        setHeadline(HEADLINE_EDEFAULT);
        return;
      case Inform6Package.OBJECT_DECLARATION__IN:
        setIn((ObjectDeclaration)null);
        return;
      case Inform6Package.OBJECT_DECLARATION__PROPERTIES:
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
      case Inform6Package.OBJECT_DECLARATION__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case Inform6Package.OBJECT_DECLARATION__SUPER_TYPE:
        return superType != null;
      case Inform6Package.OBJECT_DECLARATION__LEVEL:
        return level != null && !level.isEmpty();
      case Inform6Package.OBJECT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Inform6Package.OBJECT_DECLARATION__HEADLINE:
        return HEADLINE_EDEFAULT == null ? headline != null : !HEADLINE_EDEFAULT.equals(headline);
      case Inform6Package.OBJECT_DECLARATION__IN:
        return in != null;
      case Inform6Package.OBJECT_DECLARATION__PROPERTIES:
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
    result.append(" (object: ");
    result.append(object);
    result.append(", level: ");
    result.append(level);
    result.append(", name: ");
    result.append(name);
    result.append(", headline: ");
    result.append(headline);
    result.append(')');
    return result.toString();
  }

} //ObjectDeclarationImpl
