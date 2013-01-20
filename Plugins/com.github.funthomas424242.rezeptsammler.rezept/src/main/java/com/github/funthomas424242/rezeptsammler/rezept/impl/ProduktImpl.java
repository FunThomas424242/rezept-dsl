/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Menge;
import com.github.funthomas424242.rezeptsammler.rezept.Preis;
import com.github.funthomas424242.rezeptsammler.rezept.Produkt;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.Verpackung;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getDatumLetzteAenderung <em>Datum Letzte Aenderung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getPreis <em>Preis</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl#getMenge <em>Menge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduktImpl extends EObjectImpl implements Produkt
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
   * The default value of the '{@link #getDatumLetzteAenderung() <em>Datum Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatumLetzteAenderung()
   * @generated
   * @ordered
   */
  protected static final String DATUM_LETZTE_AENDERUNG_EDEFAULT = "\'01.01.2012\'";

  /**
   * The cached value of the '{@link #getDatumLetzteAenderung() <em>Datum Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatumLetzteAenderung()
   * @generated
   * @ordered
   */
  protected String datumLetzteAenderung = DATUM_LETZTE_AENDERUNG_EDEFAULT;

  /**
   * The cached value of the '{@link #getPreis() <em>Preis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreis()
   * @generated
   * @ordered
   */
  protected Preis preis;

  /**
   * The cached value of the '{@link #getMenge() <em>Menge</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenge()
   * @generated
   * @ordered
   */
  protected Menge menge;

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
  public String getDatumLetzteAenderung()
  {
    return datumLetzteAenderung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatumLetzteAenderung(String newDatumLetzteAenderung)
  {
    String oldDatumLetzteAenderung = datumLetzteAenderung;
    datumLetzteAenderung = newDatumLetzteAenderung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG, oldDatumLetzteAenderung, datumLetzteAenderung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preis getPreis()
  {
    return preis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreis(Preis newPreis, NotificationChain msgs)
  {
    Preis oldPreis = preis;
    preis = newPreis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__PREIS, oldPreis, newPreis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreis(Preis newPreis)
  {
    if (newPreis != preis)
    {
      NotificationChain msgs = null;
      if (preis != null)
        msgs = ((InternalEObject)preis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.PRODUKT__PREIS, null, msgs);
      if (newPreis != null)
        msgs = ((InternalEObject)newPreis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.PRODUKT__PREIS, null, msgs);
      msgs = basicSetPreis(newPreis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__PREIS, newPreis, newPreis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menge getMenge()
  {
    return menge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMenge(Menge newMenge, NotificationChain msgs)
  {
    Menge oldMenge = menge;
    menge = newMenge;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__MENGE, oldMenge, newMenge);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenge(Menge newMenge)
  {
    if (newMenge != menge)
    {
      NotificationChain msgs = null;
      if (menge != null)
        msgs = ((InternalEObject)menge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.PRODUKT__MENGE, null, msgs);
      if (newMenge != null)
        msgs = ((InternalEObject)newMenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.PRODUKT__MENGE, null, msgs);
      msgs = basicSetMenge(newMenge, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT__MENGE, newMenge, newMenge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RezeptPackage.PRODUKT__PREIS:
        return basicSetPreis(null, msgs);
      case RezeptPackage.PRODUKT__MENGE:
        return basicSetMenge(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RezeptPackage.PRODUKT__HANDLER:
        return getHandler();
      case RezeptPackage.PRODUKT__HERSTELLER:
        return getHersteller();
      case RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG:
        return getDatumLetzteAenderung();
      case RezeptPackage.PRODUKT__PREIS:
        return getPreis();
      case RezeptPackage.PRODUKT__MENGE:
        return getMenge();
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
      case RezeptPackage.PRODUKT__HANDLER:
        setHandler((String)newValue);
        return;
      case RezeptPackage.PRODUKT__HERSTELLER:
        setHersteller((String)newValue);
        return;
      case RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG:
        setDatumLetzteAenderung((String)newValue);
        return;
      case RezeptPackage.PRODUKT__PREIS:
        setPreis((Preis)newValue);
        return;
      case RezeptPackage.PRODUKT__MENGE:
        setMenge((Menge)newValue);
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
      case RezeptPackage.PRODUKT__HANDLER:
        setHandler(HANDLER_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__HERSTELLER:
        setHersteller(HERSTELLER_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG:
        setDatumLetzteAenderung(DATUM_LETZTE_AENDERUNG_EDEFAULT);
        return;
      case RezeptPackage.PRODUKT__PREIS:
        setPreis((Preis)null);
        return;
      case RezeptPackage.PRODUKT__MENGE:
        setMenge((Menge)null);
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
      case RezeptPackage.PRODUKT__HANDLER:
        return HANDLER_EDEFAULT == null ? handler != null : !HANDLER_EDEFAULT.equals(handler);
      case RezeptPackage.PRODUKT__HERSTELLER:
        return HERSTELLER_EDEFAULT == null ? hersteller != null : !HERSTELLER_EDEFAULT.equals(hersteller);
      case RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG:
        return DATUM_LETZTE_AENDERUNG_EDEFAULT == null ? datumLetzteAenderung != null : !DATUM_LETZTE_AENDERUNG_EDEFAULT.equals(datumLetzteAenderung);
      case RezeptPackage.PRODUKT__PREIS:
        return preis != null;
      case RezeptPackage.PRODUKT__MENGE:
        return menge != null;
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
    result.append(", handler: ");
    result.append(handler);
    result.append(", hersteller: ");
    result.append(hersteller);
    result.append(", datumLetzteAenderung: ");
    result.append(datumLetzteAenderung);
    result.append(')');
    return result.toString();
  }

} //ProduktImpl
