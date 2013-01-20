/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Absatz;
import com.github.funthomas424242.rezeptsammler.rezept.Autor;
import com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.Lizenz;
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
 * An implementation of the model object '<em><b>Buch Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getTitel <em>Titel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getVorwort <em>Vorwort</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getDatumPublished <em>Datum Published</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getLizenz <em>Lizenz</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getAutoren <em>Autoren</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl#getAbsatz <em>Absatz</em>}</li>
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
   * The default value of the '{@link #getVorwort() <em>Vorwort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorwort()
   * @generated
   * @ordered
   */
  protected static final String VORWORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVorwort() <em>Vorwort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorwort()
   * @generated
   * @ordered
   */
  protected String vorwort = VORWORT_EDEFAULT;

  /**
   * The default value of the '{@link #getDatumPublished() <em>Datum Published</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatumPublished()
   * @generated
   * @ordered
   */
  protected static final String DATUM_PUBLISHED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatumPublished() <em>Datum Published</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatumPublished()
   * @generated
   * @ordered
   */
  protected String datumPublished = DATUM_PUBLISHED_EDEFAULT;

  /**
   * The cached value of the '{@link #getLizenz() <em>Lizenz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLizenz()
   * @generated
   * @ordered
   */
  protected Lizenz lizenz;

  /**
   * The cached value of the '{@link #getAutoren() <em>Autoren</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoren()
   * @generated
   * @ordered
   */
  protected EList<Autor> autoren;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<RezeptImport> imports;

  /**
   * The cached value of the '{@link #getAbsatz() <em>Absatz</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsatz()
   * @generated
   * @ordered
   */
  protected EList<Absatz> absatz;

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
  public String getVorwort()
  {
    return vorwort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVorwort(String newVorwort)
  {
    String oldVorwort = vorwort;
    vorwort = newVorwort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BUCH_BESCHREIBUNG__VORWORT, oldVorwort, vorwort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDatumPublished()
  {
    return datumPublished;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatumPublished(String newDatumPublished)
  {
    String oldDatumPublished = datumPublished;
    datumPublished = newDatumPublished;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED, oldDatumPublished, datumPublished));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lizenz getLizenz()
  {
    return lizenz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLizenz(Lizenz newLizenz, NotificationChain msgs)
  {
    Lizenz oldLizenz = lizenz;
    lizenz = newLizenz;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ, oldLizenz, newLizenz);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLizenz(Lizenz newLizenz)
  {
    if (newLizenz != lizenz)
    {
      NotificationChain msgs = null;
      if (lizenz != null)
        msgs = ((InternalEObject)lizenz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ, null, msgs);
      if (newLizenz != null)
        msgs = ((InternalEObject)newLizenz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ, null, msgs);
      msgs = basicSetLizenz(newLizenz, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ, newLizenz, newLizenz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Autor> getAutoren()
  {
    if (autoren == null)
    {
      autoren = new EObjectContainmentEList<Autor>(Autor.class, this, RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN);
    }
    return autoren;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RezeptImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<RezeptImport>(RezeptImport.class, this, RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Absatz> getAbsatz()
  {
    if (absatz == null)
    {
      absatz = new EObjectContainmentEList<Absatz>(Absatz.class, this, RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ);
    }
    return absatz;
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
      case RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ:
        return basicSetLizenz(null, msgs);
      case RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN:
        return ((InternalEList<?>)getAutoren()).basicRemove(otherEnd, msgs);
      case RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ:
        return ((InternalEList<?>)getAbsatz()).basicRemove(otherEnd, msgs);
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
      case RezeptPackage.BUCH_BESCHREIBUNG__TITEL:
        return getTitel();
      case RezeptPackage.BUCH_BESCHREIBUNG__VORWORT:
        return getVorwort();
      case RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED:
        return getDatumPublished();
      case RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ:
        return getLizenz();
      case RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN:
        return getAutoren();
      case RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS:
        return getImports();
      case RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ:
        return getAbsatz();
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
      case RezeptPackage.BUCH_BESCHREIBUNG__TITEL:
        setTitel((String)newValue);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__VORWORT:
        setVorwort((String)newValue);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED:
        setDatumPublished((String)newValue);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ:
        setLizenz((Lizenz)newValue);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN:
        getAutoren().clear();
        getAutoren().addAll((Collection<? extends Autor>)newValue);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends RezeptImport>)newValue);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ:
        getAbsatz().clear();
        getAbsatz().addAll((Collection<? extends Absatz>)newValue);
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
      case RezeptPackage.BUCH_BESCHREIBUNG__VORWORT:
        setVorwort(VORWORT_EDEFAULT);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED:
        setDatumPublished(DATUM_PUBLISHED_EDEFAULT);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ:
        setLizenz((Lizenz)null);
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN:
        getAutoren().clear();
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS:
        getImports().clear();
        return;
      case RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ:
        getAbsatz().clear();
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
      case RezeptPackage.BUCH_BESCHREIBUNG__VORWORT:
        return VORWORT_EDEFAULT == null ? vorwort != null : !VORWORT_EDEFAULT.equals(vorwort);
      case RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED:
        return DATUM_PUBLISHED_EDEFAULT == null ? datumPublished != null : !DATUM_PUBLISHED_EDEFAULT.equals(datumPublished);
      case RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ:
        return lizenz != null;
      case RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN:
        return autoren != null && !autoren.isEmpty();
      case RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS:
        return imports != null && !imports.isEmpty();
      case RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ:
        return absatz != null && !absatz.isEmpty();
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
    result.append(", vorwort: ");
    result.append(vorwort);
    result.append(", datumPublished: ");
    result.append(datumPublished);
    result.append(')');
    return result.toString();
  }

} //BuchBeschreibungImpl
