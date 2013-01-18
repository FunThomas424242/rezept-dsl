/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt;
import com.github.funthomas424242.rezeptsammler.rezept.Notiz;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arbeitsschritt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl#getNotiz <em>Notiz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArbeitsschrittImpl extends EObjectImpl implements Arbeitsschritt
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
   * The cached value of the '{@link #getNotiz() <em>Notiz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotiz()
   * @generated
   * @ordered
   */
  protected Notiz notiz;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArbeitsschrittImpl()
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
    return RezeptPackage.Literals.ARBEITSSCHRITT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG, oldBeschreibung, beschreibung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notiz getNotiz()
  {
    return notiz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNotiz(Notiz newNotiz, NotificationChain msgs)
  {
    Notiz oldNotiz = notiz;
    notiz = newNotiz;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.ARBEITSSCHRITT__NOTIZ, oldNotiz, newNotiz);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotiz(Notiz newNotiz)
  {
    if (newNotiz != notiz)
    {
      NotificationChain msgs = null;
      if (notiz != null)
        msgs = ((InternalEObject)notiz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.ARBEITSSCHRITT__NOTIZ, null, msgs);
      if (newNotiz != null)
        msgs = ((InternalEObject)newNotiz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.ARBEITSSCHRITT__NOTIZ, null, msgs);
      msgs = basicSetNotiz(newNotiz, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.ARBEITSSCHRITT__NOTIZ, newNotiz, newNotiz));
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
      case RezeptPackage.ARBEITSSCHRITT__NOTIZ:
        return basicSetNotiz(null, msgs);
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
      case RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG:
        return getBeschreibung();
      case RezeptPackage.ARBEITSSCHRITT__NOTIZ:
        return getNotiz();
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
      case RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG:
        setBeschreibung((String)newValue);
        return;
      case RezeptPackage.ARBEITSSCHRITT__NOTIZ:
        setNotiz((Notiz)newValue);
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
      case RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG:
        setBeschreibung(BESCHREIBUNG_EDEFAULT);
        return;
      case RezeptPackage.ARBEITSSCHRITT__NOTIZ:
        setNotiz((Notiz)null);
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
      case RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG:
        return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
      case RezeptPackage.ARBEITSSCHRITT__NOTIZ:
        return notiz != null;
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
    result.append(')');
    return result.toString();
  }

} //ArbeitsschrittImpl
