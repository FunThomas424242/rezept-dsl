/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Metadaten;
import com.github.funthomas424242.rezeptsammler.rezept.ModelElement;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptModel;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptModelImpl#getElemente <em>Elemente</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptModelImpl#getMetadaten <em>Metadaten</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RezeptModelImpl extends EObjectImpl implements RezeptModel
{
  /**
   * The cached value of the '{@link #getElemente() <em>Elemente</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemente()
   * @generated
   * @ordered
   */
  protected EList<ModelElement> elemente;

  /**
   * The cached value of the '{@link #getMetadaten() <em>Metadaten</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetadaten()
   * @generated
   * @ordered
   */
  protected Metadaten metadaten;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RezeptModelImpl()
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
    return RezeptPackage.Literals.REZEPT_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelElement> getElemente()
  {
    if (elemente == null)
    {
      elemente = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, RezeptPackage.REZEPT_MODEL__ELEMENTE);
    }
    return elemente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadaten getMetadaten()
  {
    return metadaten;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetadaten(Metadaten newMetadaten, NotificationChain msgs)
  {
    Metadaten oldMetadaten = metadaten;
    metadaten = newMetadaten;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT_MODEL__METADATEN, oldMetadaten, newMetadaten);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetadaten(Metadaten newMetadaten)
  {
    if (newMetadaten != metadaten)
    {
      NotificationChain msgs = null;
      if (metadaten != null)
        msgs = ((InternalEObject)metadaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.REZEPT_MODEL__METADATEN, null, msgs);
      if (newMetadaten != null)
        msgs = ((InternalEObject)newMetadaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.REZEPT_MODEL__METADATEN, null, msgs);
      msgs = basicSetMetadaten(newMetadaten, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT_MODEL__METADATEN, newMetadaten, newMetadaten));
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
      case RezeptPackage.REZEPT_MODEL__ELEMENTE:
        return ((InternalEList<?>)getElemente()).basicRemove(otherEnd, msgs);
      case RezeptPackage.REZEPT_MODEL__METADATEN:
        return basicSetMetadaten(null, msgs);
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
      case RezeptPackage.REZEPT_MODEL__ELEMENTE:
        return getElemente();
      case RezeptPackage.REZEPT_MODEL__METADATEN:
        return getMetadaten();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RezeptPackage.REZEPT_MODEL__ELEMENTE:
        getElemente().clear();
        getElemente().addAll((Collection<? extends ModelElement>)newValue);
        return;
      case RezeptPackage.REZEPT_MODEL__METADATEN:
        setMetadaten((Metadaten)newValue);
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
      case RezeptPackage.REZEPT_MODEL__ELEMENTE:
        getElemente().clear();
        return;
      case RezeptPackage.REZEPT_MODEL__METADATEN:
        setMetadaten((Metadaten)null);
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
      case RezeptPackage.REZEPT_MODEL__ELEMENTE:
        return elemente != null && !elemente.isEmpty();
      case RezeptPackage.REZEPT_MODEL__METADATEN:
        return metadaten != null;
    }
    return super.eIsSet(featureID);
  }

} //RezeptModelImpl
