/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unbestimmte Menge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.UnbestimmteMengeImpl#getMenge <em>Menge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnbestimmteMengeImpl extends MengeImpl implements UnbestimmteMenge
{
  /**
   * The default value of the '{@link #getMenge() <em>Menge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenge()
   * @generated
   * @ordered
   */
  protected static final MengenAngabe MENGE_EDEFAULT = MengenAngabe.ETWAS;

  /**
   * The cached value of the '{@link #getMenge() <em>Menge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenge()
   * @generated
   * @ordered
   */
  protected MengenAngabe menge = MENGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnbestimmteMengeImpl()
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
    return RezeptPackage.Literals.UNBESTIMMTE_MENGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MengenAngabe getMenge()
  {
    return menge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenge(MengenAngabe newMenge)
  {
    MengenAngabe oldMenge = menge;
    menge = newMenge == null ? MENGE_EDEFAULT : newMenge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.UNBESTIMMTE_MENGE__MENGE, oldMenge, menge));
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
      case RezeptPackage.UNBESTIMMTE_MENGE__MENGE:
        return getMenge();
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
      case RezeptPackage.UNBESTIMMTE_MENGE__MENGE:
        setMenge((MengenAngabe)newValue);
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
      case RezeptPackage.UNBESTIMMTE_MENGE__MENGE:
        setMenge(MENGE_EDEFAULT);
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
      case RezeptPackage.UNBESTIMMTE_MENGE__MENGE:
        return menge != MENGE_EDEFAULT;
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
    result.append(" (menge: ");
    result.append(menge);
    result.append(')');
    return result.toString();
  }

} //UnbestimmteMengeImpl
