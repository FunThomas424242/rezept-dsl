/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt;
import com.github.funthomas424242.rezeptsammler.rezept.KategorieArt;
import com.github.funthomas424242.rezeptsammler.rezept.Notiz;
import com.github.funthomas424242.rezeptsammler.rezept.ProduktRef;
import com.github.funthomas424242.rezeptsammler.rezept.Quelle;
import com.github.funthomas424242.rezeptsammler.rezept.Rezept;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.Tag;
import com.github.funthomas424242.rezeptsammler.rezept.Zutat;

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
 * An implementation of the model object '<em><b>Rezept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getQuelle <em>Quelle</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getSchritte <em>Schritte</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getProdukte <em>Produkte</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getZutaten <em>Zutaten</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getTitel <em>Titel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getUntertitel <em>Untertitel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getLetzteAenderung <em>Letzte Aenderung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getNotizen <em>Notizen</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl#getPersonen <em>Personen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RezeptImpl extends EObjectImpl implements Rezept
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = "1";

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuelle() <em>Quelle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuelle()
   * @generated
   * @ordered
   */
  protected Quelle quelle;

  /**
   * The cached value of the '{@link #getSchritte() <em>Schritte</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchritte()
   * @generated
   * @ordered
   */
  protected EList<Arbeitsschritt> schritte;

  /**
   * The cached value of the '{@link #getProdukte() <em>Produkte</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProdukte()
   * @generated
   * @ordered
   */
  protected EList<ProduktRef> produkte;

  /**
   * The cached value of the '{@link #getZutaten() <em>Zutaten</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZutaten()
   * @generated
   * @ordered
   */
  protected EList<Zutat> zutaten;

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
   * The default value of the '{@link #getUntertitel() <em>Untertitel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntertitel()
   * @generated
   * @ordered
   */
  protected static final String UNTERTITEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUntertitel() <em>Untertitel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntertitel()
   * @generated
   * @ordered
   */
  protected String untertitel = UNTERTITEL_EDEFAULT;

  /**
   * The default value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKategorie()
   * @generated
   * @ordered
   */
  protected static final KategorieArt KATEGORIE_EDEFAULT = KategorieArt.SALAT;

  /**
   * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKategorie()
   * @generated
   * @ordered
   */
  protected KategorieArt kategorie = KATEGORIE_EDEFAULT;

  /**
   * The default value of the '{@link #getLetzteAenderung() <em>Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLetzteAenderung()
   * @generated
   * @ordered
   */
  protected static final String LETZTE_AENDERUNG_EDEFAULT = "\'01.01.2012\'";

  /**
   * The cached value of the '{@link #getLetzteAenderung() <em>Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLetzteAenderung()
   * @generated
   * @ordered
   */
  protected String letzteAenderung = LETZTE_AENDERUNG_EDEFAULT;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<Tag> tags;

  /**
   * The cached value of the '{@link #getNotizen() <em>Notizen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotizen()
   * @generated
   * @ordered
   */
  protected EList<Notiz> notizen;

  /**
   * The default value of the '{@link #getPersonen() <em>Personen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonen()
   * @generated
   * @ordered
   */
  protected static final Long PERSONEN_EDEFAULT = new Long(0L);

  /**
   * The cached value of the '{@link #getPersonen() <em>Personen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonen()
   * @generated
   * @ordered
   */
  protected Long personen = PERSONEN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RezeptImpl()
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
    return RezeptPackage.Literals.REZEPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quelle getQuelle()
  {
    return quelle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuelle(Quelle newQuelle, NotificationChain msgs)
  {
    Quelle oldQuelle = quelle;
    quelle = newQuelle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__QUELLE, oldQuelle, newQuelle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuelle(Quelle newQuelle)
  {
    if (newQuelle != quelle)
    {
      NotificationChain msgs = null;
      if (quelle != null)
        msgs = ((InternalEObject)quelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.REZEPT__QUELLE, null, msgs);
      if (newQuelle != null)
        msgs = ((InternalEObject)newQuelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RezeptPackage.REZEPT__QUELLE, null, msgs);
      msgs = basicSetQuelle(newQuelle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__QUELLE, newQuelle, newQuelle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Arbeitsschritt> getSchritte()
  {
    if (schritte == null)
    {
      schritte = new EObjectContainmentEList<Arbeitsschritt>(Arbeitsschritt.class, this, RezeptPackage.REZEPT__SCHRITTE);
    }
    return schritte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProduktRef> getProdukte()
  {
    if (produkte == null)
    {
      produkte = new EObjectContainmentEList<ProduktRef>(ProduktRef.class, this, RezeptPackage.REZEPT__PRODUKTE);
    }
    return produkte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Zutat> getZutaten()
  {
    if (zutaten == null)
    {
      zutaten = new EObjectContainmentEList<Zutat>(Zutat.class, this, RezeptPackage.REZEPT__ZUTATEN);
    }
    return zutaten;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__TITEL, oldTitel, titel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUntertitel()
  {
    return untertitel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUntertitel(String newUntertitel)
  {
    String oldUntertitel = untertitel;
    untertitel = newUntertitel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__UNTERTITEL, oldUntertitel, untertitel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KategorieArt getKategorie()
  {
    return kategorie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKategorie(KategorieArt newKategorie)
  {
    KategorieArt oldKategorie = kategorie;
    kategorie = newKategorie == null ? KATEGORIE_EDEFAULT : newKategorie;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__KATEGORIE, oldKategorie, kategorie));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLetzteAenderung()
  {
    return letzteAenderung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLetzteAenderung(String newLetzteAenderung)
  {
    String oldLetzteAenderung = letzteAenderung;
    letzteAenderung = newLetzteAenderung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__LETZTE_AENDERUNG, oldLetzteAenderung, letzteAenderung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tag> getTags()
  {
    if (tags == null)
    {
      tags = new EObjectContainmentEList<Tag>(Tag.class, this, RezeptPackage.REZEPT__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Notiz> getNotizen()
  {
    if (notizen == null)
    {
      notizen = new EObjectContainmentEList<Notiz>(Notiz.class, this, RezeptPackage.REZEPT__NOTIZEN);
    }
    return notizen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Long getPersonen()
  {
    return personen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonen(Long newPersonen)
  {
    Long oldPersonen = personen;
    personen = newPersonen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RezeptPackage.REZEPT__PERSONEN, oldPersonen, personen));
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
      case RezeptPackage.REZEPT__QUELLE:
        return basicSetQuelle(null, msgs);
      case RezeptPackage.REZEPT__SCHRITTE:
        return ((InternalEList<?>)getSchritte()).basicRemove(otherEnd, msgs);
      case RezeptPackage.REZEPT__PRODUKTE:
        return ((InternalEList<?>)getProdukte()).basicRemove(otherEnd, msgs);
      case RezeptPackage.REZEPT__ZUTATEN:
        return ((InternalEList<?>)getZutaten()).basicRemove(otherEnd, msgs);
      case RezeptPackage.REZEPT__TAGS:
        return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
      case RezeptPackage.REZEPT__NOTIZEN:
        return ((InternalEList<?>)getNotizen()).basicRemove(otherEnd, msgs);
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
      case RezeptPackage.REZEPT__ID:
        return getId();
      case RezeptPackage.REZEPT__QUELLE:
        return getQuelle();
      case RezeptPackage.REZEPT__SCHRITTE:
        return getSchritte();
      case RezeptPackage.REZEPT__PRODUKTE:
        return getProdukte();
      case RezeptPackage.REZEPT__ZUTATEN:
        return getZutaten();
      case RezeptPackage.REZEPT__TITEL:
        return getTitel();
      case RezeptPackage.REZEPT__UNTERTITEL:
        return getUntertitel();
      case RezeptPackage.REZEPT__KATEGORIE:
        return getKategorie();
      case RezeptPackage.REZEPT__LETZTE_AENDERUNG:
        return getLetzteAenderung();
      case RezeptPackage.REZEPT__TAGS:
        return getTags();
      case RezeptPackage.REZEPT__NOTIZEN:
        return getNotizen();
      case RezeptPackage.REZEPT__PERSONEN:
        return getPersonen();
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
      case RezeptPackage.REZEPT__ID:
        setId((String)newValue);
        return;
      case RezeptPackage.REZEPT__QUELLE:
        setQuelle((Quelle)newValue);
        return;
      case RezeptPackage.REZEPT__SCHRITTE:
        getSchritte().clear();
        getSchritte().addAll((Collection<? extends Arbeitsschritt>)newValue);
        return;
      case RezeptPackage.REZEPT__PRODUKTE:
        getProdukte().clear();
        getProdukte().addAll((Collection<? extends ProduktRef>)newValue);
        return;
      case RezeptPackage.REZEPT__ZUTATEN:
        getZutaten().clear();
        getZutaten().addAll((Collection<? extends Zutat>)newValue);
        return;
      case RezeptPackage.REZEPT__TITEL:
        setTitel((String)newValue);
        return;
      case RezeptPackage.REZEPT__UNTERTITEL:
        setUntertitel((String)newValue);
        return;
      case RezeptPackage.REZEPT__KATEGORIE:
        setKategorie((KategorieArt)newValue);
        return;
      case RezeptPackage.REZEPT__LETZTE_AENDERUNG:
        setLetzteAenderung((String)newValue);
        return;
      case RezeptPackage.REZEPT__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends Tag>)newValue);
        return;
      case RezeptPackage.REZEPT__NOTIZEN:
        getNotizen().clear();
        getNotizen().addAll((Collection<? extends Notiz>)newValue);
        return;
      case RezeptPackage.REZEPT__PERSONEN:
        setPersonen((Long)newValue);
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
      case RezeptPackage.REZEPT__ID:
        setId(ID_EDEFAULT);
        return;
      case RezeptPackage.REZEPT__QUELLE:
        setQuelle((Quelle)null);
        return;
      case RezeptPackage.REZEPT__SCHRITTE:
        getSchritte().clear();
        return;
      case RezeptPackage.REZEPT__PRODUKTE:
        getProdukte().clear();
        return;
      case RezeptPackage.REZEPT__ZUTATEN:
        getZutaten().clear();
        return;
      case RezeptPackage.REZEPT__TITEL:
        setTitel(TITEL_EDEFAULT);
        return;
      case RezeptPackage.REZEPT__UNTERTITEL:
        setUntertitel(UNTERTITEL_EDEFAULT);
        return;
      case RezeptPackage.REZEPT__KATEGORIE:
        setKategorie(KATEGORIE_EDEFAULT);
        return;
      case RezeptPackage.REZEPT__LETZTE_AENDERUNG:
        setLetzteAenderung(LETZTE_AENDERUNG_EDEFAULT);
        return;
      case RezeptPackage.REZEPT__TAGS:
        getTags().clear();
        return;
      case RezeptPackage.REZEPT__NOTIZEN:
        getNotizen().clear();
        return;
      case RezeptPackage.REZEPT__PERSONEN:
        setPersonen(PERSONEN_EDEFAULT);
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
      case RezeptPackage.REZEPT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RezeptPackage.REZEPT__QUELLE:
        return quelle != null;
      case RezeptPackage.REZEPT__SCHRITTE:
        return schritte != null && !schritte.isEmpty();
      case RezeptPackage.REZEPT__PRODUKTE:
        return produkte != null && !produkte.isEmpty();
      case RezeptPackage.REZEPT__ZUTATEN:
        return zutaten != null && !zutaten.isEmpty();
      case RezeptPackage.REZEPT__TITEL:
        return TITEL_EDEFAULT == null ? titel != null : !TITEL_EDEFAULT.equals(titel);
      case RezeptPackage.REZEPT__UNTERTITEL:
        return UNTERTITEL_EDEFAULT == null ? untertitel != null : !UNTERTITEL_EDEFAULT.equals(untertitel);
      case RezeptPackage.REZEPT__KATEGORIE:
        return kategorie != KATEGORIE_EDEFAULT;
      case RezeptPackage.REZEPT__LETZTE_AENDERUNG:
        return LETZTE_AENDERUNG_EDEFAULT == null ? letzteAenderung != null : !LETZTE_AENDERUNG_EDEFAULT.equals(letzteAenderung);
      case RezeptPackage.REZEPT__TAGS:
        return tags != null && !tags.isEmpty();
      case RezeptPackage.REZEPT__NOTIZEN:
        return notizen != null && !notizen.isEmpty();
      case RezeptPackage.REZEPT__PERSONEN:
        return PERSONEN_EDEFAULT == null ? personen != null : !PERSONEN_EDEFAULT.equals(personen);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", titel: ");
    result.append(titel);
    result.append(", untertitel: ");
    result.append(untertitel);
    result.append(", kategorie: ");
    result.append(kategorie);
    result.append(", letzteAenderung: ");
    result.append(letzteAenderung);
    result.append(", personen: ");
    result.append(personen);
    result.append(')');
    return result.toString();
  }

} //RezeptImpl
