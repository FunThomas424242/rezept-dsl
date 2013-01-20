/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Personenquelle;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personenquelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.PersonenquelleImpl#getPersonenBeschreibung <em>Personen Beschreibung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonenquelleImpl extends QuelleImpl implements Personenquelle
{
  /**
   * The default value of the '{@link #getPersonenBeschreibung() <em>Personen Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonenBeschreibung()
   * @generated
   * @ordered
   */
  protected static final String PERSONEN_BESCHREIBUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersonenBeschreibung() <em>Personen Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonenBeschreibung()
   * @generated
   * @ordered
   */
  protected String personenBeschreibung = PERSONEN_BESCHREIBUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonenquelleImpl()
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
    return RezeptPackage.Literals.PERSONENQUELLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersonenBeschreibung()
  {
    return personenBeschreibung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonenBeschreibung(String newPersonenBeschreibung)
  {
    String oldPersonenBeschreibung = personenBeschreibung;
    personenBeschreibung = newPersonenBeschreibung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG, oldPersonenBeschreibung, personenBeschreibung));
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
      case RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG:
        return getPersonenBeschreibung();
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
      case RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG:
        setPersonenBeschreibung((String)newValue);
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
      case RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG:
        setPersonenBeschreibung(PERSONEN_BESCHREIBUNG_EDEFAULT);
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
      case RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG:
        return PERSONEN_BESCHREIBUNG_EDEFAULT == null ? personenBeschreibung != null : !PERSONEN_BESCHREIBUNG_EDEFAULT.equals(personenBeschreibung);
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
    result.append(" (personenBeschreibung: ");
    result.append(personenBeschreibung);
    result.append(')');
    return result.toString();
  }

} //PersonenquelleImpl
