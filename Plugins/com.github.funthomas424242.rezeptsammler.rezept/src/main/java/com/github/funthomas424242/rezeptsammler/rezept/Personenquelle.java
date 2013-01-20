/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personenquelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Personenquelle#getPersonenBeschreibung <em>Personen Beschreibung</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getPersonenquelle()
 * @model
 * @generated
 */
public interface Personenquelle extends Quelle
{
  /**
   * Returns the value of the '<em><b>Personen Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Personen Beschreibung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Personen Beschreibung</em>' attribute.
   * @see #setPersonenBeschreibung(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getPersonenquelle_PersonenBeschreibung()
   * @model required="true"
   * @generated
   */
  String getPersonenBeschreibung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Personenquelle#getPersonenBeschreibung <em>Personen Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Personen Beschreibung</em>' attribute.
   * @see #getPersonenBeschreibung()
   * @generated
   */
  void setPersonenBeschreibung(String value);

} // Personenquelle
