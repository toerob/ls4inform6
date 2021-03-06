/**
 * generated by Xtext 2.22.0
 */
package com.github.toerob.inform6.impl;

import com.github.toerob.inform6.ArrayDeclaration;
import com.github.toerob.inform6.ArrayType;
import com.github.toerob.inform6.Inform6Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.impl.ArrayDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ArrayDeclarationImpl#getArrayBody <em>Array Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayDeclarationImpl extends DirectiveImpl implements ArrayDeclaration
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
   * The cached value of the '{@link #getArrayBody() <em>Array Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayBody()
   * @generated
   * @ordered
   */
  protected ArrayType arrayBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayDeclarationImpl()
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
    return Inform6Package.Literals.ARRAY_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.ARRAY_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayType getArrayBody()
  {
    return arrayBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayBody(ArrayType newArrayBody, NotificationChain msgs)
  {
    ArrayType oldArrayBody = arrayBody;
    arrayBody = newArrayBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inform6Package.ARRAY_DECLARATION__ARRAY_BODY, oldArrayBody, newArrayBody);
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
  public void setArrayBody(ArrayType newArrayBody)
  {
    if (newArrayBody != arrayBody)
    {
      NotificationChain msgs = null;
      if (arrayBody != null)
        msgs = ((InternalEObject)arrayBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Inform6Package.ARRAY_DECLARATION__ARRAY_BODY, null, msgs);
      if (newArrayBody != null)
        msgs = ((InternalEObject)newArrayBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Inform6Package.ARRAY_DECLARATION__ARRAY_BODY, null, msgs);
      msgs = basicSetArrayBody(newArrayBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.ARRAY_DECLARATION__ARRAY_BODY, newArrayBody, newArrayBody));
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
      case Inform6Package.ARRAY_DECLARATION__ARRAY_BODY:
        return basicSetArrayBody(null, msgs);
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
      case Inform6Package.ARRAY_DECLARATION__NAME:
        return getName();
      case Inform6Package.ARRAY_DECLARATION__ARRAY_BODY:
        return getArrayBody();
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
      case Inform6Package.ARRAY_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case Inform6Package.ARRAY_DECLARATION__ARRAY_BODY:
        setArrayBody((ArrayType)newValue);
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
      case Inform6Package.ARRAY_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Inform6Package.ARRAY_DECLARATION__ARRAY_BODY:
        setArrayBody((ArrayType)null);
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
      case Inform6Package.ARRAY_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Inform6Package.ARRAY_DECLARATION__ARRAY_BODY:
        return arrayBody != null;
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

} //ArrayDeclarationImpl
