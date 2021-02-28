/**
 * generated by Xtext 2.24.0
 */
package com.github.toerob.inform6.impl;

import com.github.toerob.inform6.Directive;
import com.github.toerob.inform6.IncludeDeclaration;
import com.github.toerob.inform6.Inform6Package;
import com.github.toerob.inform6.Program;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.toerob.inform6.impl.ProgramImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link com.github.toerob.inform6.impl.ProgramImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectives()
   * @generated
   * @ordered
   */
  protected EList<Directive> directives;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<IncludeDeclaration> imports;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return Inform6Package.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Directive> getDirectives()
  {
    if (directives == null)
    {
      directives = new EObjectContainmentEList<Directive>(Directive.class, this, Inform6Package.PROGRAM__DIRECTIVES);
    }
    return directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IncludeDeclaration> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<IncludeDeclaration>(IncludeDeclaration.class, this, Inform6Package.PROGRAM__IMPORTS);
    }
    return imports;
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
      case Inform6Package.PROGRAM__DIRECTIVES:
        return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
      case Inform6Package.PROGRAM__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
      case Inform6Package.PROGRAM__DIRECTIVES:
        return getDirectives();
      case Inform6Package.PROGRAM__IMPORTS:
        return getImports();
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
      case Inform6Package.PROGRAM__DIRECTIVES:
        getDirectives().clear();
        getDirectives().addAll((Collection<? extends Directive>)newValue);
        return;
      case Inform6Package.PROGRAM__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends IncludeDeclaration>)newValue);
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
      case Inform6Package.PROGRAM__DIRECTIVES:
        getDirectives().clear();
        return;
      case Inform6Package.PROGRAM__IMPORTS:
        getImports().clear();
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
      case Inform6Package.PROGRAM__DIRECTIVES:
        return directives != null && !directives.isEmpty();
      case Inform6Package.PROGRAM__IMPORTS:
        return imports != null && !imports.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
