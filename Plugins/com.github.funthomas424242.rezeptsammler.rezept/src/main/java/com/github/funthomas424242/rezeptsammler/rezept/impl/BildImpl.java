/**
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.AblagePfad;
import com.github.funthomas424242.rezeptsammler.rezept.Bild;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bild</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BildImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BildImpl#getLizenz <em>Lizenz</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BildImpl#getUrheber <em>Urheber</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BildImpl#getAblageOrt <em>Ablage Ort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BildImpl extends EObjectImpl implements Bild
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
   * The default value of the '{@link #getLizenz() <em>Lizenz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLizenz()
   * @generated
   * @ordered
   */
  protected static final String LIZENZ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLizenz() <em>Lizenz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLizenz()
   * @generated
   * @ordered
   */
  protected String lizenz = LIZENZ_EDEFAULT;

  /**
   * The default value of the '{@link #getUrheber() <em>Urheber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrheber()
   * @generated
   * @ordered
   */
  protected static final String URHEBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrheber() <em>Urheber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrheber()
   * @generated
   * @ordered
   */
  protected String urheber = URHEBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getAblageOrt() <em>Ablage Ort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAblageOrt()
   * @generated
   * @ordered
   */
  protected AblagePfad ablageOrt;

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
  public String getLizenz()
  {
    return lizenz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLizenz(String newLizenz)
  {
    String oldLizenz = lizenz;
    lizenz = newLizenz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BILD__LIZENZ, oldLizenz, lizenz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrheber()
  {
    return urheber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrheber(String newUrheber)
  {
    String oldUrheber = urheber;
    urheber = newUrheber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BILD__URHEBER, oldUrheber, urheber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AblagePfad getAblageOrt()
  {
    return ablageOrt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAblageOrt(AblagePfad newAblageOrt, NotificationChain msgs)
  {
    AblagePfad oldAblageOrt = ablageOrt;
    ablageOrt = newAblageOrt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.BILD__ABLAGE_ORT, oldAblageOrt, newAblageOrt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAblageOrt(AblagePfad newAblageOrt)
  {
    if (newAblageOrt != ablageOrt)
    {
      NotificationChain msgs = null;
      if (ablageOrt != null)
        msgs = ((InternalEObject)ablageOrt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.BILD__ABLAGE_ORT, null, msgs);
      if (newAblageOrt != null)
        msgs = ((InternalEObject)newAblageOrt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.BILD__ABLAGE_ORT, null, msgs);
      msgs = basicSetAblageOrt(newAblageOrt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BILD__ABLAGE_ORT, newAblageOrt, newAblageOrt));
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
      case RezeptPackage.BILD__ABLAGE_ORT:
        return basicSetAblageOrt(null, msgs);
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
      case RezeptPackage.BILD__BESCHREIBUNG:
        return getBeschreibung();
      case RezeptPackage.BILD__LIZENZ:
        return getLizenz();
      case RezeptPackage.BILD__URHEBER:
        return getUrheber();
      case RezeptPackage.BILD__ABLAGE_ORT:
        return getAblageOrt();
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
      case RezeptPackage.BILD__BESCHREIBUNG:
        setBeschreibung((String)newValue);
        return;
      case RezeptPackage.BILD__LIZENZ:
        setLizenz((String)newValue);
        return;
      case RezeptPackage.BILD__URHEBER:
        setUrheber((String)newValue);
        return;
      case RezeptPackage.BILD__ABLAGE_ORT:
        setAblageOrt((AblagePfad)newValue);
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
      case RezeptPackage.BILD__BESCHREIBUNG:
        setBeschreibung(BESCHREIBUNG_EDEFAULT);
        return;
      case RezeptPackage.BILD__LIZENZ:
        setLizenz(LIZENZ_EDEFAULT);
        return;
      case RezeptPackage.BILD__URHEBER:
        setUrheber(URHEBER_EDEFAULT);
        return;
      case RezeptPackage.BILD__ABLAGE_ORT:
        setAblageOrt((AblagePfad)null);
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
      case RezeptPackage.BILD__BESCHREIBUNG:
        return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
      case RezeptPackage.BILD__LIZENZ:
        return LIZENZ_EDEFAULT == null ? lizenz != null : !LIZENZ_EDEFAULT.equals(lizenz);
      case RezeptPackage.BILD__URHEBER:
        return URHEBER_EDEFAULT == null ? urheber != null : !URHEBER_EDEFAULT.equals(urheber);
      case RezeptPackage.BILD__ABLAGE_ORT:
        return ablageOrt != null;
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
    result.append(", lizenz: ");
    result.append(lizenz);
    result.append(", urheber: ");
    result.append(urheber);
    result.append(')');
    return result.toString();
  }

} //BildImpl
