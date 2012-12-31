/**
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Bild;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bild</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BildImpl#getAblagePfad <em>Ablage Pfad</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BildImpl#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BildImpl extends EObjectImpl implements Bild
{
  /**
   * The default value of the '{@link #getAblagePfad() <em>Ablage Pfad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAblagePfad()
   * @generated
   * @ordered
   */
  protected static final String ABLAGE_PFAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAblagePfad() <em>Ablage Pfad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAblagePfad()
   * @generated
   * @ordered
   */
  protected String ablagePfad = ABLAGE_PFAD_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BildImpl()
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
    return RezeptPackage.Literals.BILD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAblagePfad()
  {
    return ablagePfad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAblagePfad(String newAblagePfad)
  {
    String oldAblagePfad = ablagePfad;
    ablagePfad = newAblagePfad;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BILD__ABLAGE_PFAD, oldAblagePfad, ablagePfad));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BILD__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
      case RezeptPackage.BILD__ABLAGE_PFAD:
        return getAblagePfad();
      case RezeptPackage.BILD__BESCHREIBUNG:
        return getBeschreibung();
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
      case RezeptPackage.BILD__ABLAGE_PFAD:
        setAblagePfad((String)newValue);
        return;
      case RezeptPackage.BILD__BESCHREIBUNG:
        setBeschreibung((String)newValue);
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
      case RezeptPackage.BILD__ABLAGE_PFAD:
        setAblagePfad(ABLAGE_PFAD_EDEFAULT);
        return;
      case RezeptPackage.BILD__BESCHREIBUNG:
        setBeschreibung(BESCHREIBUNG_EDEFAULT);
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
      case RezeptPackage.BILD__ABLAGE_PFAD:
        return ABLAGE_PFAD_EDEFAULT == null ? ablagePfad != null : !ABLAGE_PFAD_EDEFAULT.equals(ablagePfad);
      case RezeptPackage.BILD__BESCHREIBUNG:
        return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
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
    result.append(" (ablagePfad: ");
    result.append(ablagePfad);
    result.append(", beschreibung: ");
    result.append(beschreibung);
    result.append(')');
    return result.toString();
  }

} //BildImpl
