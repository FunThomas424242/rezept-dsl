/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buch Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getTitel <em>Titel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getVorwort <em>Vorwort</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getDatumPublished <em>Datum Published</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getLizenz <em>Lizenz</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getAutoren <em>Autoren</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getImports <em>Imports</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getAbsatz <em>Absatz</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung()
 * @model
 * @generated
 */
public interface BuchBeschreibung extends EObject
{
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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_Titel()
   * @model required="true"
   * @generated
   */
  String getTitel();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getTitel <em>Titel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titel</em>' attribute.
   * @see #getTitel()
   * @generated
   */
  void setTitel(String value);

  /**
   * Returns the value of the '<em><b>Vorwort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vorwort</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vorwort</em>' attribute.
   * @see #setVorwort(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_Vorwort()
   * @model
   * @generated
   */
  String getVorwort();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getVorwort <em>Vorwort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vorwort</em>' attribute.
   * @see #getVorwort()
   * @generated
   */
  void setVorwort(String value);

  /**
   * Returns the value of the '<em><b>Datum Published</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datum Published</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datum Published</em>' attribute.
   * @see #setDatumPublished(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_DatumPublished()
   * @model
   * @generated
   */
  String getDatumPublished();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getDatumPublished <em>Datum Published</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datum Published</em>' attribute.
   * @see #getDatumPublished()
   * @generated
   */
  void setDatumPublished(String value);

  /**
   * Returns the value of the '<em><b>Lizenz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lizenz</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lizenz</em>' containment reference.
   * @see #setLizenz(Lizenz)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_Lizenz()
   * @model containment="true"
   * @generated
   */
  Lizenz getLizenz();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getLizenz <em>Lizenz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lizenz</em>' containment reference.
   * @see #getLizenz()
   * @generated
   */
  void setLizenz(Lizenz value);

  /**
   * Returns the value of the '<em><b>Autoren</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Autor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autoren</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autoren</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_Autoren()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Autor> getAutoren();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.RezeptImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_Imports()
   * @model containment="true" required="true"
   * @generated
   */
  EList<RezeptImport> getImports();

  /**
   * Returns the value of the '<em><b>Absatz</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Absatz}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Absatz</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Absatz</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_Absatz()
   * @model containment="true"
   * @generated
   */
  EList<Absatz> getAbsatz();

} // BuchBeschreibung
