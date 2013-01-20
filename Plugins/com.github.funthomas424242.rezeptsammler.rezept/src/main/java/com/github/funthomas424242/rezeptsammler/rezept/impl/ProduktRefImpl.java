/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Produkt;
import com.github.funthomas424242.rezeptsammler.rezept.ProduktRef;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produkt Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl#getMenge <em>Menge</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl#getProdukt <em>Produkt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduktRefImpl extends EObjectImpl implements ProduktRef
{
  /**
   * The default value of the '{@link #getMenge() <em>Menge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenge()
   * @generated
   * @ordered
   */
  protected static final Float MENGE_EDEFAULT = new Float(1.5F);

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
   * The cached value of the '{@link #getProdukt() <em>Produkt</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProdukt()
   * @generated
   * @ordered
   */
  protected Produkt produkt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProduktRefImpl()
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
    return RezeptPackage.Literals.PRODUKT_REF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT_REF__MENGE, oldMenge, menge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Produkt getProdukt()
  {
    if (produkt != null && produkt.eIsProxy())
    {
      InternalEObject oldProdukt = (InternalEObject)produkt;
      produkt = (Produkt)eResolveProxy(oldProdukt);
      if (produkt != oldProdukt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RezeptPackage.PRODUKT_REF__PRODUKT, oldProdukt, produkt));
      }
    }
    return produkt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Produkt basicGetProdukt()
  {
    return produkt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProdukt(Produkt newProdukt)
  {
    Produkt oldProdukt = produkt;
    produkt = newProdukt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT_REF__PRODUKT, oldProdukt, produkt));
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
      case RezeptPackage.PRODUKT_REF__MENGE:
        return getMenge();
      case RezeptPackage.PRODUKT_REF__PRODUKT:
        if (resolve) return getProdukt();
        return basicGetProdukt();
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
      case RezeptPackage.PRODUKT_REF__MENGE:
        setMenge((Float)newValue);
        return;
      case RezeptPackage.PRODUKT_REF__PRODUKT:
        setProdukt((Produkt)newValue);
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
      case RezeptPackage.PRODUKT_REF__MENGE:
        setMenge(MENGE_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT_REF__PRODUKT:
        setProdukt((Produkt)null);
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
      case RezeptPackage.PRODUKT_REF__MENGE:
        return MENGE_EDEFAULT == null ? menge != null : !MENGE_EDEFAULT.equals(menge);
      case RezeptPackage.PRODUKT_REF__PRODUKT:
        return produkt != null;
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

} //ProduktRefImpl
