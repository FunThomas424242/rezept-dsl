/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Preis;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.Waehrung;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.PreisImpl#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.PreisImpl#getWaehrung <em>Waehrung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreisImpl extends EObjectImpl implements Preis
{
  /**
   * The default value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBetrag()
   * @generated
   * @ordered
   */
  protected static final Float BETRAG_EDEFAULT = null;

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
   * The default value of the '{@link #getWaehrung() <em>Waehrung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWaehrung()
   * @generated
   * @ordered
   */
  protected static final Waehrung WAEHRUNG_EDEFAULT = Waehrung.EURO;

  /**
   * The cached value of the '{@link #getWaehrung() <em>Waehrung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWaehrung()
   * @generated
   * @ordered
   */
  protected Waehrung waehrung = WAEHRUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreisImpl()
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
    return RezeptPackage.Literals.PREIS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PREIS__BETRAG, oldBetrag, betrag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Waehrung getWaehrung()
  {
    return waehrung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWaehrung(Waehrung newWaehrung)
  {
    Waehrung oldWaehrung = waehrung;
    waehrung = newWaehrung == null ? WAEHRUNG_EDEFAULT : newWaehrung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PREIS__WAEHRUNG, oldWaehrung, waehrung));
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
      case RezeptPackage.PREIS__BETRAG:
        return getBetrag();
      case RezeptPackage.PREIS__WAEHRUNG:
        return getWaehrung();
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
      case RezeptPackage.PREIS__BETRAG:
        setBetrag((Float)newValue);
        return;
      case RezeptPackage.PREIS__WAEHRUNG:
        setWaehrung((Waehrung)newValue);
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
      case RezeptPackage.PREIS__BETRAG:
        setBetrag(BETRAG_EDEFAULT);
        return;
      case RezeptPackage.PREIS__WAEHRUNG:
        setWaehrung(WAEHRUNG_EDEFAULT);
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
      case RezeptPackage.PREIS__BETRAG:
        return BETRAG_EDEFAULT == null ? betrag != null : !BETRAG_EDEFAULT.equals(betrag);
      case RezeptPackage.PREIS__WAEHRUNG:
        return waehrung != WAEHRUNG_EDEFAULT;
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
    result.append(", waehrung: ");
    result.append(waehrung);
    result.append(')');
    return result.toString();
  }

} //PreisImpl
