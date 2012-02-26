/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Produkt;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.Verpackung;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getVerpackung <em>Verpackung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getEan <em>Ean</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getUba <em>Uba</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getPreis <em>Preis</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getLetzteAenderung <em>Letzte Aenderung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduktImpl extends ModelElementImpl implements Produkt
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVerpackung() <em>Verpackung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerpackung()
   * @generated
   * @ordered
   */
  protected static final Verpackung VERPACKUNG_EDEFAULT = Verpackung.PACKUNG;

  /**
   * The cached value of the '{@link #getVerpackung() <em>Verpackung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerpackung()
   * @generated
   * @ordered
   */
  protected Verpackung verpackung = VERPACKUNG_EDEFAULT;

  /**
   * The default value of the '{@link #getEan() <em>Ean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEan()
   * @generated
   * @ordered
   */
  protected static final String EAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEan() <em>Ean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEan()
   * @generated
   * @ordered
   */
  protected String ean = EAN_EDEFAULT;

  /**
   * The default value of the '{@link #getUba() <em>Uba</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUba()
   * @generated
   * @ordered
   */
  protected static final String UBA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUba() <em>Uba</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUba()
   * @generated
   * @ordered
   */
  protected String uba = UBA_EDEFAULT;

  /**
   * The default value of the '{@link #getPreis() <em>Preis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreis()
   * @generated
   * @ordered
   */
  protected static final Float PREIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreis() <em>Preis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreis()
   * @generated
   * @ordered
   */
  protected Float preis = PREIS_EDEFAULT;

  /**
   * The default value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected static final String HANDLER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected String handler = HANDLER_EDEFAULT;

  /**
   * The default value of the '{@link #getHersteller() <em>Hersteller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHersteller()
   * @generated
   * @ordered
   */
  protected static final String HERSTELLER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHersteller()
   * @generated
   * @ordered
   */
  protected String hersteller = HERSTELLER_EDEFAULT;

  /**
   * The default value of the '{@link #getLetzteAenderung() <em>Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLetzteAenderung()
   * @generated
   * @ordered
   */
  protected static final String LETZTE_AENDERUNG_EDEFAULT = "\'01.01.2012\'";

  /**
   * The cached value of the '{@link #getLetzteAenderung() <em>Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLetzteAenderung()
   * @generated
   * @ordered
   */
  protected String letzteAenderung = LETZTE_AENDERUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProduktImpl()
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
    return RezeptPackage.Literals.PRODUKT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verpackung getVerpackung()
  {
    return verpackung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerpackung(Verpackung newVerpackung)
  {
    Verpackung oldVerpackung = verpackung;
    verpackung = newVerpackung == null ? VERPACKUNG_EDEFAULT : newVerpackung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__VERPACKUNG, oldVerpackung, verpackung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEan()
  {
    return ean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEan(String newEan)
  {
    String oldEan = ean;
    ean = newEan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__EAN, oldEan, ean));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUba()
  {
    return uba;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUba(String newUba)
  {
    String oldUba = uba;
    uba = newUba;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__UBA, oldUba, uba));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getPreis()
  {
    return preis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreis(Float newPreis)
  {
    Float oldPreis = preis;
    preis = newPreis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__PREIS, oldPreis, preis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHandler()
  {
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandler(String newHandler)
  {
    String oldHandler = handler;
    handler = newHandler;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__HANDLER, oldHandler, handler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHersteller()
  {
    return hersteller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHersteller(String newHersteller)
  {
    String oldHersteller = hersteller;
    hersteller = newHersteller;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__HERSTELLER, oldHersteller, hersteller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLetzteAenderung()
  {
    return letzteAenderung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLetzteAenderung(String newLetzteAenderung)
  {
    String oldLetzteAenderung = letzteAenderung;
    letzteAenderung = newLetzteAenderung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__LETZTE_AENDERUNG, oldLetzteAenderung, letzteAenderung));
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
      case RezeptPackage.PRODUKT__NAME:
        return getName();
      case RezeptPackage.PRODUKT__VERPACKUNG:
        return getVerpackung();
      case RezeptPackage.PRODUKT__EAN:
        return getEan();
      case RezeptPackage.PRODUKT__UBA:
        return getUba();
      case RezeptPackage.PRODUKT__PREIS:
        return getPreis();
      case RezeptPackage.PRODUKT__HANDLER:
        return getHandler();
      case RezeptPackage.PRODUKT__HERSTELLER:
        return getHersteller();
      case RezeptPackage.PRODUKT__LETZTE_AENDERUNG:
        return getLetzteAenderung();
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
      case RezeptPackage.PRODUKT__NAME:
        setName((String)newValue);
        return;
      case RezeptPackage.PRODUKT__VERPACKUNG:
        setVerpackung((Verpackung)newValue);
        return;
      case RezeptPackage.PRODUKT__EAN:
        setEan((String)newValue);
        return;
      case RezeptPackage.PRODUKT__UBA:
        setUba((String)newValue);
        return;
      case RezeptPackage.PRODUKT__PREIS:
        setPreis((Float)newValue);
        return;
      case RezeptPackage.PRODUKT__HANDLER:
        setHandler((String)newValue);
        return;
      case RezeptPackage.PRODUKT__HERSTELLER:
        setHersteller((String)newValue);
        return;
      case RezeptPackage.PRODUKT__LETZTE_AENDERUNG:
        setLetzteAenderung((String)newValue);
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
      case RezeptPackage.PRODUKT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__VERPACKUNG:
        setVerpackung(VERPACKUNG_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__EAN:
        setEan(EAN_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__UBA:
        setUba(UBA_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__PREIS:
        setPreis(PREIS_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__HANDLER:
        setHandler(HANDLER_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__HERSTELLER:
        setHersteller(HERSTELLER_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__LETZTE_AENDERUNG:
        setLetzteAenderung(LETZTE_AENDERUNG_EDEFAULT);
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
      case RezeptPackage.PRODUKT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RezeptPackage.PRODUKT__VERPACKUNG:
        return verpackung != VERPACKUNG_EDEFAULT;
      case RezeptPackage.PRODUKT__EAN:
        return EAN_EDEFAULT == null ? ean != null : !EAN_EDEFAULT.equals(ean);
      case RezeptPackage.PRODUKT__UBA:
        return UBA_EDEFAULT == null ? uba != null : !UBA_EDEFAULT.equals(uba);
      case RezeptPackage.PRODUKT__PREIS:
        return PREIS_EDEFAULT == null ? preis != null : !PREIS_EDEFAULT.equals(preis);
      case RezeptPackage.PRODUKT__HANDLER:
        return HANDLER_EDEFAULT == null ? handler != null : !HANDLER_EDEFAULT.equals(handler);
      case RezeptPackage.PRODUKT__HERSTELLER:
        return HERSTELLER_EDEFAULT == null ? hersteller != null : !HERSTELLER_EDEFAULT.equals(hersteller);
      case RezeptPackage.PRODUKT__LETZTE_AENDERUNG:
        return LETZTE_AENDERUNG_EDEFAULT == null ? letzteAenderung != null : !LETZTE_AENDERUNG_EDEFAULT.equals(letzteAenderung);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", verpackung: ");
    result.append(verpackung);
    result.append(", ean: ");
    result.append(ean);
    result.append(", uba: ");
    result.append(uba);
    result.append(", preis: ");
    result.append(preis);
    result.append(", handler: ");
    result.append(handler);
    result.append(", hersteller: ");
    result.append(hersteller);
    result.append(", letzteAenderung: ");
    result.append(letzteAenderung);
    result.append(')');
    return result.toString();
  }

} //ProduktImpl
