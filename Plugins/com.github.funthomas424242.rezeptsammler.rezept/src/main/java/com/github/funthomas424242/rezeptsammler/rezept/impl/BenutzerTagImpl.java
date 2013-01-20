/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Benutzer Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerTagImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BenutzerTagImpl extends TagImpl implements BenutzerTag
{
  /**
   * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBezeichnung()
   * @generated
   * @ordered
   */
  protected static final String BEZEICHNUNG_EDEFAULT = "defaultKategorie";

  /**
   * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBezeichnung()
   * @generated
   * @ordered
   */
  protected String bezeichnung = BEZEICHNUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BenutzerTagImpl()
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
    return RezeptPackage.Literals.BENUTZER_TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBezeichnung()
  {
    return bezeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBezeichnung(String newBezeichnung)
  {
    String oldBezeichnung = bezeichnung;
    bezeichnung = newBezeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BENUTZER_TAG__BEZEICHNUNG, oldBezeichnung, bezeichnung));
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
      case RezeptPackage.BENUTZER_TAG__BEZEICHNUNG:
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
      case RezeptPackage.BENUTZER_TAG__BEZEICHNUNG:
        setBezeichnung((String)newValue);
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
      case RezeptPackage.BENUTZER_TAG__BEZEICHNUNG:
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
      case RezeptPackage.BENUTZER_TAG__BEZEICHNUNG:
        return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
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

} //BenutzerTagImpl
