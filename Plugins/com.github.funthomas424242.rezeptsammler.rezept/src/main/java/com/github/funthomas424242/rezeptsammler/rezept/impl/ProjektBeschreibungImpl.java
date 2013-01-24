/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptImport;
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
 * An implementation of the model object '<em><b>Projekt Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl#getBuch <em>Buch</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl#getResourcesDir <em>Resources Dir</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl#getSiteURL <em>Site URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjektBeschreibungImpl extends EObjectImpl implements ProjektBeschreibung
{
  /**
   * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected static final String GROUP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected String groupId = GROUP_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected String artifactId = ARTIFACT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBuch() <em>Buch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuch()
   * @generated
   * @ordered
   */
  protected BuchBeschreibung buch;

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
   * The default value of the '{@link #getSiteURL() <em>Site URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteURL()
   * @generated
   * @ordered
   */
  protected static final String SITE_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSiteURL() <em>Site URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteURL()
   * @generated
   * @ordered
   */
  protected String siteURL = SITE_URL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjektBeschreibungImpl()
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
    return RezeptPackage.Literals.PROJEKT_BESCHREIBUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupId()
  {
    return groupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupId(String newGroupId)
  {
    String oldGroupId = groupId;
    groupId = newGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID, oldGroupId, groupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactId()
  {
    return artifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactId(String newArtifactId)
  {
    String oldArtifactId = artifactId;
    artifactId = newArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID, oldArtifactId, artifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuchBeschreibung getBuch()
  {
    return buch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuch(BuchBeschreibung newBuch, NotificationChain msgs)
  {
    BuchBeschreibung oldBuch = buch;
    buch = newBuch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH, oldBuch, newBuch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuch(BuchBeschreibung newBuch)
  {
    if (newBuch != buch)
    {
      NotificationChain msgs = null;
      if (buch != null)
        msgs = ((InternalEObject)buch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH, null, msgs);
      if (newBuch != null)
        msgs = ((InternalEObject)newBuch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH, null, msgs);
      msgs = basicSetBuch(newBuch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH, newBuch, newBuch));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR, oldResourcesDir, resourcesDir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSiteURL()
  {
    return siteURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSiteURL(String newSiteURL)
  {
    String oldSiteURL = siteURL;
    siteURL = newSiteURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL, oldSiteURL, siteURL));
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
      case RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH:
        return basicSetBuch(null, msgs);
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
      case RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID:
        return getGroupId();
      case RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID:
        return getArtifactId();
      case RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION:
        return getVersion();
      case RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH:
        return getBuch();
      case RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR:
        return getResourcesDir();
      case RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL:
        return getSiteURL();
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
      case RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID:
        setArtifactId((String)newValue);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION:
        setVersion((String)newValue);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH:
        setBuch((BuchBeschreibung)newValue);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR:
        setResourcesDir((String)newValue);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL:
        setSiteURL((String)newValue);
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
      case RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH:
        setBuch((BuchBeschreibung)null);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR:
        setResourcesDir(RESOURCES_DIR_EDEFAULT);
        return;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL:
        setSiteURL(SITE_URL_EDEFAULT);
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
      case RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
      case RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH:
        return buch != null;
      case RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR:
        return RESOURCES_DIR_EDEFAULT == null ? resourcesDir != null : !RESOURCES_DIR_EDEFAULT.equals(resourcesDir);
      case RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL:
        return SITE_URL_EDEFAULT == null ? siteURL != null : !SITE_URL_EDEFAULT.equals(siteURL);
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
    result.append(" (groupId: ");
    result.append(groupId);
    result.append(", artifactId: ");
    result.append(artifactId);
    result.append(", version: ");
    result.append(version);
    result.append(", resourcesDir: ");
    result.append(resourcesDir);
    result.append(", siteURL: ");
    result.append(siteURL);
    result.append(')');
    return result.toString();
  }

} //ProjektBeschreibungImpl
