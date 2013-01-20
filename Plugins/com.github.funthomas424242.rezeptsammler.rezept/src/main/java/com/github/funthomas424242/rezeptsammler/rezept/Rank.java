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
 * A representation of the model object '<em><b>Rank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rank#getBewertung <em>Bewertung</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRank()
 * @model
 * @generated
 */
public interface Rank extends EObject
{
  /**
   * Returns the value of the '<em><b>Bewertung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bewertung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bewertung</em>' attribute.
   * @see #setBewertung(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRank_Bewertung()
   * @model required="true"
   * @generated
   */
  String getBewertung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rank#getBewertung <em>Bewertung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bewertung</em>' attribute.
   * @see #getBewertung()
   * @generated
   */
  void setBewertung(String value);

} // Rank
