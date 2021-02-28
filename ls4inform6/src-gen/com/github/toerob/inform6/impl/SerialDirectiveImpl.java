/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6.impl;

import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.inform6.SerialDirective;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serial Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.impl.SerialDirectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.SerialDirectiveImpl#getSerial <em>Serial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SerialDirectiveImpl extends DirectiveImpl implements SerialDirective
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
   * The default value of the '{@link #getSerial() <em>Serial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSerial()
   * @generated
   * @ordered
   */
  protected static final String SERIAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSerial() <em>Serial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSerial()
   * @generated
   * @ordered
   */
  protected String serial = SERIAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SerialDirectiveImpl()
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
    return Inform6Package.Literals.SERIAL_DIRECTIVE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.SERIAL_DIRECTIVE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSerial()
  {
    return serial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSerial(String newSerial)
  {
    String oldSerial = serial;
    serial = newSerial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Inform6Package.SERIAL_DIRECTIVE__SERIAL, oldSerial, serial));
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
      case Inform6Package.SERIAL_DIRECTIVE__NAME:
        return getName();
      case Inform6Package.SERIAL_DIRECTIVE__SERIAL:
        return getSerial();
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
      case Inform6Package.SERIAL_DIRECTIVE__NAME:
        setName((String)newValue);
        return;
      case Inform6Package.SERIAL_DIRECTIVE__SERIAL:
        setSerial((String)newValue);
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
      case Inform6Package.SERIAL_DIRECTIVE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Inform6Package.SERIAL_DIRECTIVE__SERIAL:
        setSerial(SERIAL_EDEFAULT);
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
      case Inform6Package.SERIAL_DIRECTIVE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Inform6Package.SERIAL_DIRECTIVE__SERIAL:
        return SERIAL_EDEFAULT == null ? serial != null : !SERIAL_EDEFAULT.equals(serial);
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
    result.append(", serial: ");
    result.append(serial);
    result.append(')');
    return result.toString();
  }

} //SerialDirectiveImpl
