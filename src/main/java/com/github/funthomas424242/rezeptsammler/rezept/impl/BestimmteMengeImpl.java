/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge;
import com.github.funthomas424242.rezeptsammler.rezept.Masseinheit;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bestimmte Menge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BestimmteMengeImpl#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BestimmteMengeImpl#getEinheit <em>Einheit</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BestimmteMengeImpl#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BestimmteMengeImpl extends MengeImpl implements BestimmteMenge
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
   * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected static final String DETAILS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected String details = DETAILS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BestimmteMengeImpl()
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
    return RezeptPackage.Literals.BESTIMMTE_MENGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BESTIMMTE_MENGE__BETRAG, oldBetrag, betrag));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BESTIMMTE_MENGE__EINHEIT, oldEinheit, einheit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDetails()
  {
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetails(String newDetails)
  {
    String oldDetails = details;
    details = newDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BESTIMMTE_MENGE__DETAILS, oldDetails, details));
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
      case RezeptPackage.BESTIMMTE_MENGE__BETRAG:
        return getBetrag();
      case RezeptPackage.BESTIMMTE_MENGE__EINHEIT:
        return getEinheit();
      case RezeptPackage.BESTIMMTE_MENGE__DETAILS:
        return getDetails();
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
      case RezeptPackage.BESTIMMTE_MENGE__BETRAG:
        setBetrag((Float)newValue);
        return;
      case RezeptPackage.BESTIMMTE_MENGE__EINHEIT:
        setEinheit((Masseinheit)newValue);
        return;
      case RezeptPackage.BESTIMMTE_MENGE__DETAILS:
        setDetails((String)newValue);
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
      case RezeptPackage.BESTIMMTE_MENGE__BETRAG:
        setBetrag(BETRAG_EDEFAULT);
        return;
      case RezeptPackage.BESTIMMTE_MENGE__EINHEIT:
        setEinheit(EINHEIT_EDEFAULT);
        return;
      case RezeptPackage.BESTIMMTE_MENGE__DETAILS:
        setDetails(DETAILS_EDEFAULT);
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
      case RezeptPackage.BESTIMMTE_MENGE__BETRAG:
        return BETRAG_EDEFAULT == null ? betrag != null : !BETRAG_EDEFAULT.equals(betrag);
      case RezeptPackage.BESTIMMTE_MENGE__EINHEIT:
        return einheit != EINHEIT_EDEFAULT;
      case RezeptPackage.BESTIMMTE_MENGE__DETAILS:
        return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
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
    result.append(", details: ");
    result.append(details);
    result.append(')');
    return result.toString();
  }

} //BestimmteMengeImpl
