/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.DiaetArt;
import com.github.funthomas424242.rezeptsammler.rezept.DiaetTag;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diaet Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.DiaetTagImpl#getDiaet <em>Diaet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiaetTagImpl extends TagImpl implements DiaetTag
{
  /**
   * The default value of the '{@link #getDiaet() <em>Diaet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiaet()
   * @generated
   * @ordered
   */
  protected static final DiaetArt DIAET_EDEFAULT = DiaetArt.LAKTOSEFREI;

  /**
   * The cached value of the '{@link #getDiaet() <em>Diaet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiaet()
   * @generated
   * @ordered
   */
  protected DiaetArt diaet = DIAET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiaetTagImpl()
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
    return RezeptPackage.Literals.DIAET_TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiaetArt getDiaet()
  {
    return diaet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiaet(DiaetArt newDiaet)
  {
    DiaetArt oldDiaet = diaet;
    diaet = newDiaet == null ? DIAET_EDEFAULT : newDiaet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.DIAET_TAG__DIAET, oldDiaet, diaet));
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
      case RezeptPackage.DIAET_TAG__DIAET:
        return getDiaet();
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
      case RezeptPackage.DIAET_TAG__DIAET:
        setDiaet((DiaetArt)newValue);
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
      case RezeptPackage.DIAET_TAG__DIAET:
        setDiaet(DIAET_EDEFAULT);
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
      case RezeptPackage.DIAET_TAG__DIAET:
        return diaet != DIAET_EDEFAULT;
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
    result.append(" (diaet: ");
    result.append(diaet);
    result.append(')');
    return result.toString();
  }

} //DiaetTagImpl
