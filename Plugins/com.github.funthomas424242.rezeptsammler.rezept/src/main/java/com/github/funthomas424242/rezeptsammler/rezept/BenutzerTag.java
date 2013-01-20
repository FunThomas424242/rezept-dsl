/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benutzer Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBenutzerTag()
 * @model
 * @generated
 */
public interface BenutzerTag extends Tag
{
  /**
   * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
   * The default value is <code>"defaultKategorie"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bezeichnung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bezeichnung</em>' attribute.
   * @see #setBezeichnung(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBenutzerTag_Bezeichnung()
   * @model default="defaultKategorie" required="true"
   * @generated
   */
  String getBezeichnung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag#getBezeichnung <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bezeichnung</em>' attribute.
   * @see #getBezeichnung()
   * @generated
   */
  void setBezeichnung(String value);

} // BenutzerTag
