/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Kategorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getStandardKategorie()
 * @model
 * @generated
 */
public interface StandardKategorie extends Kategorie
{
  /**
   * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.KategorieArt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bezeichnung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bezeichnung</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.KategorieArt
   * @see #setBezeichnung(KategorieArt)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getStandardKategorie_Bezeichnung()
   * @model required="true"
   * @generated
   */
  KategorieArt getBezeichnung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie#getBezeichnung <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bezeichnung</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.KategorieArt
   * @see #getBezeichnung()
   * @generated
   */
  void setBezeichnung(KategorieArt value);

} // StandardKategorie
