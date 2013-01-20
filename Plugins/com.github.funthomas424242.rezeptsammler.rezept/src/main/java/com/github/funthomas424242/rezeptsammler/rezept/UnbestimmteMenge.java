/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unbestimmte Menge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge#getMenge <em>Menge</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getUnbestimmteMenge()
 * @model
 * @generated
 */
public interface UnbestimmteMenge extends Menge
{
  /**
   * Returns the value of the '<em><b>Menge</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menge</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menge</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe
   * @see #setMenge(MengenAngabe)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getUnbestimmteMenge_Menge()
   * @model required="true"
   * @generated
   */
  MengenAngabe getMenge();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge#getMenge <em>Menge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menge</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe
   * @see #getMenge()
   * @generated
   */
  void setMenge(MengenAngabe value);

} // UnbestimmteMenge
