/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Masseinheit;
import com.github.funthomas424242.rezeptsammler.rezept.Menge;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.MengeImpl#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.MengeImpl#getEinheit <em>Einheit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MengeImpl extends EObjectImpl implements Menge
{
  /**
   * The default value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBetrag()
   * @generated
   * @ordered
   */
  protected static final Float BETRAG_EDEFAULT = new Float(1.5F);

  /**
   * The cached value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBetrag()
   * @generated
   * @ordered
   */
  protected Float betrag = BETRAG_EDEFAULT;

  /**
   * The default value of the '{@link #getEinheit() <em>Einheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEinheit()
   * @generated
   * @ordered
   */
  protected static final Masseinheit EINHEIT_EDEFAULT = Masseinheit.PRISE;

  /**
   * The cached value of the '{@link #getEinheit() <em>Einheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEinheit()
   * @generated
   * @ordered
   */
  protected Masseinheit einheit = EINHEIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MengeImpl()
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
    return RezeptPackage.Literals.MENGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getBetrag()
  {
    return betrag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBetrag(Float newBetrag)
  {
    Float oldBetrag = betrag;
    betrag = newBetrag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.MENGE__BETRAG, oldBetrag, betrag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Masseinheit getEinheit()
  {
    return einheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEinheit(Masseinheit newEinheit)
  {
    Masseinheit oldEinheit = einheit;
    einheit = newEinheit == null ? EINHEIT_EDEFAULT : newEinheit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.MENGE__EINHEIT, oldEinheit, einheit));
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
      case RezeptPackage.MENGE__BETRAG:
        return getBetrag();
      case RezeptPackage.MENGE__EINHEIT:
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
      case RezeptPackage.MENGE__BETRAG:
        setBetrag((Float)newValue);
        return;
      case RezeptPackage.MENGE__EINHEIT:
        setEinheit((Masseinheit)newValue);
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
      case RezeptPackage.MENGE__BETRAG:
        setBetrag(BETRAG_EDEFAULT);
        return;
      case RezeptPackage.MENGE__EINHEIT:
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
      case RezeptPackage.MENGE__BETRAG:
        return BETRAG_EDEFAULT == null ? betrag != null : !BETRAG_EDEFAULT.equals(betrag);
      case RezeptPackage.MENGE__EINHEIT:
        return einheit != EINHEIT_EDEFAULT;
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
    result.append(" (betrag: ");
    result.append(betrag);
    result.append(", einheit: ");
    result.append(einheit);
    result.append(')');
    return result.toString();
  }

} //MengeImpl
