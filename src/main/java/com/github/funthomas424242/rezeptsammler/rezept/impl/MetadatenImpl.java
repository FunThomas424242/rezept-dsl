/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Metadaten;
import com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadaten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.MetadatenImpl#getProjektdaten <em>Projektdaten</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadatenImpl extends EObjectImpl implements Metadaten
{
  /**
   * The cached value of the '{@link #getProjektdaten() <em>Projektdaten</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjektdaten()
   * @generated
   * @ordered
   */
  protected ProjektBeschreibung projektdaten;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetadatenImpl()
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
    return RezeptPackage.Literals.METADATEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjektBeschreibung getProjektdaten()
  {
    return projektdaten;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProjektdaten(ProjektBeschreibung newProjektdaten, NotificationChain msgs)
  {
    ProjektBeschreibung oldProjektdaten = projektdaten;
    projektdaten = newProjektdaten;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.METADATEN__PROJEKTDATEN, oldProjektdaten, newProjektdaten);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjektdaten(ProjektBeschreibung newProjektdaten)
  {
    if (newProjektdaten != projektdaten)
    {
      NotificationChain msgs = null;
      if (projektdaten != null)
        msgs = ((InternalEObject)projektdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.METADATEN__PROJEKTDATEN, null, msgs);
      if (newProjektdaten != null)
        msgs = ((InternalEObject)newProjektdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.METADATEN__PROJEKTDATEN, null, msgs);
      msgs = basicSetProjektdaten(newProjektdaten, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.METADATEN__PROJEKTDATEN, newProjektdaten, newProjektdaten));
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
      case RezeptPackage.METADATEN__PROJEKTDATEN:
        return basicSetProjektdaten(null, msgs);
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
      case RezeptPackage.METADATEN__PROJEKTDATEN:
        return getProjektdaten();
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
      case RezeptPackage.METADATEN__PROJEKTDATEN:
        setProjektdaten((ProjektBeschreibung)newValue);
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
      case RezeptPackage.METADATEN__PROJEKTDATEN:
        setProjektdaten((ProjektBeschreibung)null);
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
      case RezeptPackage.METADATEN__PROJEKTDATEN:
        return projektdaten != null;
    }
    return super.eIsSet(featureID);
  }

} //MetadatenImpl
