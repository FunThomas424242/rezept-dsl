/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buch Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getTitel <em>Titel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getResourcesDir <em>Resources Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuchBeschreibungImpl extends EObjectImpl implements BuchBeschreibung
{
  /**
   * The default value of the '{@link #getTitel() <em>Titel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitel()
   * @generated
   * @ordered
   */
  protected static final String TITEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitel() <em>Titel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitel()
   * @generated
   * @ordered
   */
  protected String titel = TITEL_EDEFAULT;

  /**
   * The default value of the '{@link #getResourcesDir() <em>Resources Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcesDir()
   * @generated
   * @ordered
   */
  protected static final String RESOURCES_DIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResourcesDir() <em>Resources Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcesDir()
   * @generated
   * @ordered
   */
  protected String resourcesDir = RESOURCES_DIR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuchBeschreibungImpl()
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
    return RezeptPackage.Literals.BUCH_BESCHREIBUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitel()
  {
    return titel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitel(String newTitel)
  {
    String oldTitel = titel;
    titel = newTitel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BUCH_BESCHREIBUNG__TITEL, oldTitel, titel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResourcesDir()
  {
    return resourcesDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourcesDir(String newResourcesDir)
  {
    String oldResourcesDir = resourcesDir;
    resourcesDir = newResourcesDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BUCH_BESCHREIBUNG__RESOURCES_DIR, oldResourcesDir, resourcesDir));
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
      case RezeptPackage.BUCH_BESCHREIBUNG__TITEL:
        return getTitel();
      case RezeptPackage.BUCH_BESCHREIBUNG__RESOURCES_DIR:
        return getResourcesDir();
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
      case RezeptPackage.BUCH_BESCHREIBUNG__TITEL:
        setTitel((String)newValue);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__RESOURCES_DIR:
        setResourcesDir((String)newValue);
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
      case RezeptPackage.BUCH_BESCHREIBUNG__TITEL:
        setTitel(TITEL_EDEFAULT);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__RESOURCES_DIR:
        setResourcesDir(RESOURCES_DIR_EDEFAULT);
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
      case RezeptPackage.BUCH_BESCHREIBUNG__TITEL:
        return TITEL_EDEFAULT == null ? titel != null : !TITEL_EDEFAULT.equals(titel);
      case RezeptPackage.BUCH_BESCHREIBUNG__RESOURCES_DIR:
        return RESOURCES_DIR_EDEFAULT == null ? resourcesDir != null : !RESOURCES_DIR_EDEFAULT.equals(resourcesDir);
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
    result.append(" (titel: ");
    result.append(titel);
    result.append(", resourcesDir: ");
    result.append(resourcesDir);
    result.append(')');
    return result.toString();
  }

} //BuchBeschreibungImpl
