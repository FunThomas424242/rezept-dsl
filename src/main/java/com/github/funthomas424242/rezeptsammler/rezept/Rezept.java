/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rezept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getId <em>Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getQuelle <em>Quelle</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTipps <em>Tipps</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getBewertung <em>Bewertung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getSchritte <em>Schritte</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getProdukte <em>Produkte</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getZutaten <em>Zutaten</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTitel <em>Titel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getUntertitel <em>Untertitel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getLetzteAenderung <em>Letzte Aenderung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getArmAn <em>Arm An</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getFreiVon <em>Frei Von</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getKategorien <em>Kategorien</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept()
 * @model
 * @generated
 */
public interface Rezept extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Id()
   * @model default="1" id="true" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Quelle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quelle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quelle</em>' containment reference.
   * @see #setQuelle(Quelle)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Quelle()
   * @model containment="true"
   * @generated
   */
  Quelle getQuelle();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getQuelle <em>Quelle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quelle</em>' containment reference.
   * @see #getQuelle()
   * @generated
   */
  void setQuelle(Quelle value);

  /**
   * Returns the value of the '<em><b>Tipps</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Tipp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipps</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Tipps()
   * @model containment="true"
   * @generated
   */
  EList<Tipp> getTipps();

  /**
   * Returns the value of the '<em><b>Bewertung</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bewertung</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bewertung</em>' containment reference.
   * @see #setBewertung(Rank)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Bewertung()
   * @model containment="true"
   * @generated
   */
  Rank getBewertung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getBewertung <em>Bewertung</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bewertung</em>' containment reference.
   * @see #getBewertung()
   * @generated
   */
  void setBewertung(Rank value);

  /**
   * Returns the value of the '<em><b>Schritte</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schritte</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schritte</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Schritte()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Arbeitsschritt> getSchritte();

  /**
   * Returns the value of the '<em><b>Produkte</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produkte</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Produkte</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Produkte()
   * @model containment="true"
   * @generated
   */
  EList<ProduktRef> getProdukte();

  /**
   * Returns the value of the '<em><b>Zutaten</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Zutat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zutaten</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zutaten</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Zutaten()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Zutat> getZutaten();

  /**
   * Returns the value of the '<em><b>Titel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Titel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Titel</em>' attribute.
   * @see #setTitel(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Titel()
   * @model required="true"
   * @generated
   */
  String getTitel();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTitel <em>Titel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titel</em>' attribute.
   * @see #getTitel()
   * @generated
   */
  void setTitel(String value);

  /**
   * Returns the value of the '<em><b>Untertitel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Untertitel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Untertitel</em>' attribute.
   * @see #setUntertitel(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Untertitel()
   * @model
   * @generated
   */
  String getUntertitel();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getUntertitel <em>Untertitel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Untertitel</em>' attribute.
   * @see #getUntertitel()
   * @generated
   */
  void setUntertitel(String value);

  /**
   * Returns the value of the '<em><b>Letzte Aenderung</b></em>' attribute.
   * The default value is <code>"\'01.01.2012\'"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Letzte Aenderung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Letzte Aenderung</em>' attribute.
   * @see #setLetzteAenderung(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_LetzteAenderung()
   * @model default="\'01.01.2012\'" required="true"
   * @generated
   */
  String getLetzteAenderung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getLetzteAenderung <em>Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Letzte Aenderung</em>' attribute.
   * @see #getLetzteAenderung()
   * @generated
   */
  void setLetzteAenderung(String value);

  /**
   * Returns the value of the '<em><b>Arm An</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Alergene}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arm An</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arm An</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_ArmAn()
   * @model containment="true"
   * @generated
   */
  EList<Alergene> getArmAn();

  /**
   * Returns the value of the '<em><b>Frei Von</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Alergene}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frei Von</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frei Von</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_FreiVon()
   * @model containment="true"
   * @generated
   */
  EList<Alergene> getFreiVon();

  /**
   * Returns the value of the '<em><b>Kategorien</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Kategorie}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kategorien</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kategorien</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezept_Kategorien()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Kategorie> getKategorien();

} // Rezept
