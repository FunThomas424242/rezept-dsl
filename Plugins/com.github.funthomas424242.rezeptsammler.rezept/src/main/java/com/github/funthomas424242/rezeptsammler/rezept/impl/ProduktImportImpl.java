/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.ProduktImport;
import com.github.funthomas424242.rezeptsammler.rezept.Produktliste;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produkt Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImportImpl#getImportedResource <em>Imported Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduktImportImpl extends EObjectImpl implements ProduktImport
{
  /**
   * The cached value of the '{@link #getImportedResource() <em>Imported Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedResource()
   * @generated
   * @ordered
   */
  protected Produktliste importedResource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProduktImportImpl()
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
    return RezeptPackage.Literals.PRODUKT_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Produktliste getImportedResource()
  {
    if (importedResource != null && importedResource.eIsProxy())
    {
      InternalEObject oldImportedResource = (InternalEObject)importedResource;
      importedResource = (Produktliste)eResolveProxy(oldImportedResource);
      if (importedResource != oldImportedResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE, oldImportedResource, importedResource));
      }
    }
    return importedResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Produktliste basicGetImportedResource()
  {
    return importedResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedResource(Produktliste newImportedResource)
  {
    Produktliste oldImportedResource = importedResource;
    importedResource = newImportedResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE, oldImportedResource, importedResource));
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
      case RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE:
        if (resolve) return getImportedResource();
        return basicGetImportedResource();
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
      case RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE:
        setImportedResource((Produktliste)newValue);
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
      case RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE:
        setImportedResource((Produktliste)null);
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
      case RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE:
        return importedResource != null;
    }
    return super.eIsSet(featureID);
  }

} //ProduktImportImpl
