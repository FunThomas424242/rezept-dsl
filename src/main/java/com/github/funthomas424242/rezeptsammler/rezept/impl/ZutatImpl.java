/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.Zutat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zutat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl#getMenge <em>Menge</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl#getEinheit <em>Einheit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZutatImpl extends EObjectImpl implements Zutat
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
   * The default value of the '{@link #getMenge() <em>Menge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenge()
   * @generated
   * @ordered
   */
  protected static final Float MENGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMenge() <em>Menge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenge()
   * @generated
   * @ordered
   */
  protected Float menge = MENGE_EDEFAULT;

  /**
   * The default value of the '{@link #getEinheit() <em>Einheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEinheit()
   * @generated
   * @ordered
   */
  protected static final String EINHEIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEinheit() <em>Einheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEinheit()
   * @generated
   * @ordered
   */
  protected String einheit = EINHEIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ZutatImpl()
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
    return RezeptPackage.Literals.ZUTAT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.ZUTAT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getMenge()
  {
    return menge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenge(Float newMenge)
  {
    Float oldMenge = menge;
    menge = newMenge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.ZUTAT__MENGE, oldMenge, menge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEinheit()
  {
    return einheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEinheit(String newEinheit)
  {
    String oldEinheit = einheit;
    einheit = newEinheit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.ZUTAT__EINHEIT, oldEinheit, einheit));
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
      case RezeptPackage.ZUTAT__NAME:
        return getName();
      case RezeptPackage.ZUTAT__MENGE:
        return getMenge();
      case RezeptPackage.ZUTAT__EINHEIT:
        return getEinheit();
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
      case RezeptPackage.ZUTAT__NAME:
        setName((String)newValue);
        return;
      case RezeptPackage.ZUTAT__MENGE:
        setMenge((Float)newValue);
        return;
      case RezeptPackage.ZUTAT__EINHEIT:
        setEinheit((String)newValue);
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
      case RezeptPackage.ZUTAT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RezeptPackage.ZUTAT__MENGE:
        setMenge(MENGE_EDEFAULT);
        return;
      case RezeptPackage.ZUTAT__EINHEIT:
        setEinheit(EINHEIT_EDEFAULT);
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
      case RezeptPackage.ZUTAT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RezeptPackage.ZUTAT__MENGE:
        return MENGE_EDEFAULT == null ? menge != null : !MENGE_EDEFAULT.equals(menge);
      case RezeptPackage.ZUTAT__EINHEIT:
        return EINHEIT_EDEFAULT == null ? einheit != null : !EINHEIT_EDEFAULT.equals(einheit);
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
    result.append(", menge: ");
    result.append(menge);
    result.append(", einheit: ");
    result.append(einheit);
    result.append(')');
    return result.toString();
  }

} //ZutatImpl
