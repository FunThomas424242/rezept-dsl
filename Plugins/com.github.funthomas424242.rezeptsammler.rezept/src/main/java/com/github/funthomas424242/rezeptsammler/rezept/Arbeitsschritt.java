/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbeitsschritt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt#getNotiz <em>Notiz</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getArbeitsschritt()
 * @model
 * @generated
 */
public interface Arbeitsschritt extends EObject
{
  /**
   * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beschreibung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beschreibung</em>' attribute.
   * @see #setBeschreibung(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getArbeitsschritt_Beschreibung()
   * @model required="true"
   * @generated
   */
  String getBeschreibung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt#getBeschreibung <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beschreibung</em>' attribute.
   * @see #getBeschreibung()
   * @generated
   */
  void setBeschreibung(String value);

  /**
   * Returns the value of the '<em><b>Notiz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notiz</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notiz</em>' containment reference.
   * @see #setNotiz(Notiz)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getArbeitsschritt_Notiz()
   * @model containment="true"
   * @generated
   */
  Notiz getNotiz();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt#getNotiz <em>Notiz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notiz</em>' containment reference.
   * @see #getNotiz()
   * @generated
   */
  void setNotiz(Notiz value);

} // Arbeitsschritt
