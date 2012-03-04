/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Import;
import com.github.funthomas424242.rezeptsammler.rezept.ModelElement;
import com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

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
 * An implementation of the model object '<em><b>Modul Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ModulBeschreibungImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ModulBeschreibungImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ModulBeschreibungImpl#getElemente <em>Elemente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModulBeschreibungImpl extends MetadatenImpl implements ModulBeschreibung
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getElemente() <em>Elemente</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemente()
   * @generated
   * @ordered
   */
  protected EList<ModelElement> elemente;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModulBeschreibungImpl()
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
    return RezeptPackage.Literals.MODUL_BESCHREIBUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.MODUL_BESCHREIBUNG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, RezeptPackage.MODUL_BESCHREIBUNG__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelElement> getElemente()
  {
    if (elemente == null)
    {
      elemente = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, RezeptPackage.MODUL_BESCHREIBUNG__ELEMENTE);
    }
    return elemente;
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
      case RezeptPackage.MODUL_BESCHREIBUNG__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case RezeptPackage.MODUL_BESCHREIBUNG__ELEMENTE:
        return ((InternalEList<?>)getElemente()).basicRemove(otherEnd, msgs);
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
      case RezeptPackage.MODUL_BESCHREIBUNG__NAME:
        return getName();
      case RezeptPackage.MODUL_BESCHREIBUNG__IMPORTS:
        return getImports();
      case RezeptPackage.MODUL_BESCHREIBUNG__ELEMENTE:
        return getElemente();
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
      case RezeptPackage.MODUL_BESCHREIBUNG__NAME:
        setName((String)newValue);
        return;
      case RezeptPackage.MODUL_BESCHREIBUNG__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case RezeptPackage.MODUL_BESCHREIBUNG__ELEMENTE:
        getElemente().clear();
        getElemente().addAll((Collection<? extends ModelElement>)newValue);
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
      case RezeptPackage.MODUL_BESCHREIBUNG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RezeptPackage.MODUL_BESCHREIBUNG__IMPORTS:
        getImports().clear();
        return;
      case RezeptPackage.MODUL_BESCHREIBUNG__ELEMENTE:
        getElemente().clear();
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
      case RezeptPackage.MODUL_BESCHREIBUNG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RezeptPackage.MODUL_BESCHREIBUNG__IMPORTS:
        return imports != null && !imports.isEmpty();
      case RezeptPackage.MODUL_BESCHREIBUNG__ELEMENTE:
        return elemente != null && !elemente.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModulBeschreibungImpl
