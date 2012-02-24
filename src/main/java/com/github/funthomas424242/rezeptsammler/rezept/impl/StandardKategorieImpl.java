/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.KategorieArt;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Kategorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.StandardKategorieImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardKategorieImpl extends KategorieImpl implements StandardKategorie
{
  /**
   * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBezeichnung()
   * @generated
   * @ordered
   */
  protected static final KategorieArt BEZEICHNUNG_EDEFAULT = KategorieArt.SALAT;

  /**
   * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBezeichnung()
   * @generated
   * @ordered
   */
  protected KategorieArt bezeichnung = BEZEICHNUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StandardKategorieImpl()
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
    return RezeptPackage.Literals.STANDARD_KATEGORIE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KategorieArt getBezeichnung()
  {
    return bezeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBezeichnung(KategorieArt newBezeichnung)
  {
    KategorieArt oldBezeichnung = bezeichnung;
    bezeichnung = newBezeichnung == null ? BEZEICHNUNG_EDEFAULT : newBezeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.STANDARD_KATEGORIE__BEZEICHNUNG, oldBezeichnung, bezeichnung));
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
      case RezeptPackage.STANDARD_KATEGORIE__BEZEICHNUNG:
        return getBezeichnung();
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
      case RezeptPackage.STANDARD_KATEGORIE__BEZEICHNUNG:
        setBezeichnung((KategorieArt)newValue);
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
      case RezeptPackage.STANDARD_KATEGORIE__BEZEICHNUNG:
        setBezeichnung(BEZEICHNUNG_EDEFAULT);
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
      case RezeptPackage.STANDARD_KATEGORIE__BEZEICHNUNG:
        return bezeichnung != BEZEICHNUNG_EDEFAULT;
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
    result.append(" (bezeichnung: ");
    result.append(bezeichnung);
    result.append(')');
    return result.toString();
  }

} //StandardKategorieImpl
