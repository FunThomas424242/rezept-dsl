/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Autor;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AutorImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AutorImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AutorImpl#getOrganisationsName <em>Organisations Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AutorImpl#getModifikationsNotiz <em>Modifikations Notiz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutorImpl extends EObjectImpl implements Autor
{
  /**
   * The default value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorname()
   * @generated
   * @ordered
   */
  protected static final String VORNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorname()
   * @generated
   * @ordered
   */
  protected String vorname = VORNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNachname()
   * @generated
   * @ordered
   */
  protected static final String NACHNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNachname()
   * @generated
   * @ordered
   */
  protected String nachname = NACHNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getOrganisationsName() <em>Organisations Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganisationsName()
   * @generated
   * @ordered
   */
  protected static final String ORGANISATIONS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrganisationsName() <em>Organisations Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganisationsName()
   * @generated
   * @ordered
   */
  protected String organisationsName = ORGANISATIONS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getModifikationsNotiz() <em>Modifikations Notiz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifikationsNotiz()
   * @generated
   * @ordered
   */
  protected static final String MODIFIKATIONS_NOTIZ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModifikationsNotiz() <em>Modifikations Notiz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifikationsNotiz()
   * @generated
   * @ordered
   */
  protected String modifikationsNotiz = MODIFIKATIONS_NOTIZ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutorImpl()
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
    return RezeptPackage.Literals.AUTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVorname()
  {
    return vorname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVorname(String newVorname)
  {
    String oldVorname = vorname;
    vorname = newVorname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.AUTOR__VORNAME, oldVorname, vorname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNachname()
  {
    return nachname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNachname(String newNachname)
  {
    String oldNachname = nachname;
    nachname = newNachname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.AUTOR__NACHNAME, oldNachname, nachname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrganisationsName()
  {
    return organisationsName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganisationsName(String newOrganisationsName)
  {
    String oldOrganisationsName = organisationsName;
    organisationsName = newOrganisationsName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.AUTOR__ORGANISATIONS_NAME, oldOrganisationsName, organisationsName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModifikationsNotiz()
  {
    return modifikationsNotiz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifikationsNotiz(String newModifikationsNotiz)
  {
    String oldModifikationsNotiz = modifikationsNotiz;
    modifikationsNotiz = newModifikationsNotiz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ, oldModifikationsNotiz, modifikationsNotiz));
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
      case RezeptPackage.AUTOR__VORNAME:
        return getVorname();
      case RezeptPackage.AUTOR__NACHNAME:
        return getNachname();
      case RezeptPackage.AUTOR__ORGANISATIONS_NAME:
        return getOrganisationsName();
      case RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ:
        return getModifikationsNotiz();
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
      case RezeptPackage.AUTOR__VORNAME:
        setVorname((String)newValue);
        return;
      case RezeptPackage.AUTOR__NACHNAME:
        setNachname((String)newValue);
        return;
      case RezeptPackage.AUTOR__ORGANISATIONS_NAME:
        setOrganisationsName((String)newValue);
        return;
      case RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ:
        setModifikationsNotiz((String)newValue);
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
      case RezeptPackage.AUTOR__VORNAME:
        setVorname(VORNAME_EDEFAULT);
        return;
      case RezeptPackage.AUTOR__NACHNAME:
        setNachname(NACHNAME_EDEFAULT);
        return;
      case RezeptPackage.AUTOR__ORGANISATIONS_NAME:
        setOrganisationsName(ORGANISATIONS_NAME_EDEFAULT);
        return;
      case RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ:
        setModifikationsNotiz(MODIFIKATIONS_NOTIZ_EDEFAULT);
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
      case RezeptPackage.AUTOR__VORNAME:
        return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
      case RezeptPackage.AUTOR__NACHNAME:
        return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
      case RezeptPackage.AUTOR__ORGANISATIONS_NAME:
        return ORGANISATIONS_NAME_EDEFAULT == null ? organisationsName != null : !ORGANISATIONS_NAME_EDEFAULT.equals(organisationsName);
      case RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ:
        return MODIFIKATIONS_NOTIZ_EDEFAULT == null ? modifikationsNotiz != null : !MODIFIKATIONS_NOTIZ_EDEFAULT.equals(modifikationsNotiz);
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
    result.append(" (vorname: ");
    result.append(vorname);
    result.append(", nachname: ");
    result.append(nachname);
    result.append(", organisationsName: ");
    result.append(organisationsName);
    result.append(", modifikationsNotiz: ");
    result.append(modifikationsNotiz);
    result.append(')');
    return result.toString();
  }

} //AutorImpl
