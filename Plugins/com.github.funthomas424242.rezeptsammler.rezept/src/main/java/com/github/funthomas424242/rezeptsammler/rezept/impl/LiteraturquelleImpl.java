/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle;
import com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literaturquelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.LiteraturquelleImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.LiteraturquelleImpl#getModifikationsArt <em>Modifikations Art</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteraturquelleImpl extends QuelleImpl implements Literaturquelle
{
  /**
   * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeschreibung()
   * @generated
   * @ordered
   */
  protected static final String BESCHREIBUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeschreibung()
   * @generated
   * @ordered
   */
  protected String beschreibung = BESCHREIBUNG_EDEFAULT;

  /**
   * The default value of the '{@link #getModifikationsArt() <em>Modifikations Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifikationsArt()
   * @generated
   * @ordered
   */
  protected static final ModifikationsArt MODIFIKATIONS_ART_EDEFAULT = ModifikationsArt.ORIGINAL;

  /**
   * The cached value of the '{@link #getModifikationsArt() <em>Modifikations Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifikationsArt()
   * @generated
   * @ordered
   */
  protected ModifikationsArt modifikationsArt = MODIFIKATIONS_ART_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteraturquelleImpl()
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
    return RezeptPackage.Literals.LITERATURQUELLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBeschreibung()
  {
    return beschreibung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeschreibung(String newBeschreibung)
  {
    String oldBeschreibung = beschreibung;
    beschreibung = newBeschreibung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.LITERATURQUELLE__BESCHREIBUNG, oldBeschreibung, beschreibung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifikationsArt getModifikationsArt()
  {
    return modifikationsArt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifikationsArt(ModifikationsArt newModifikationsArt)
  {
    ModifikationsArt oldModifikationsArt = modifikationsArt;
    modifikationsArt = newModifikationsArt == null ? MODIFIKATIONS_ART_EDEFAULT : newModifikationsArt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART, oldModifikationsArt, modifikationsArt));
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
      case RezeptPackage.LITERATURQUELLE__BESCHREIBUNG:
        return getBeschreibung();
      case RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART:
        return getModifikationsArt();
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
      case RezeptPackage.LITERATURQUELLE__BESCHREIBUNG:
        setBeschreibung((String)newValue);
        return;
      case RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART:
        setModifikationsArt((ModifikationsArt)newValue);
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
      case RezeptPackage.LITERATURQUELLE__BESCHREIBUNG:
        setBeschreibung(BESCHREIBUNG_EDEFAULT);
        return;
      case RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART:
        setModifikationsArt(MODIFIKATIONS_ART_EDEFAULT);
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
      case RezeptPackage.LITERATURQUELLE__BESCHREIBUNG:
        return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
      case RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART:
        return modifikationsArt != MODIFIKATIONS_ART_EDEFAULT;
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
    result.append(" (beschreibung: ");
    result.append(beschreibung);
    result.append(", modifikationsArt: ");
    result.append(modifikationsArt);
    result.append(')');
    return result.toString();
  }

} //LiteraturquelleImpl
