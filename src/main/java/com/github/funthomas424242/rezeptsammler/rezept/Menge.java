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
 * A representation of the model object '<em><b>Menge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Menge#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Menge#getEinheit <em>Einheit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getMenge()
 * @model
 * @generated
 */
public interface Menge extends EObject
{
  /**
   * Returns the value of the '<em><b>Betrag</b></em>' attribute.
   * The default value is <code>"1.5"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Betrag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Betrag</em>' attribute.
   * @see #setBetrag(Float)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getMenge_Betrag()
   * @model default="1.5" required="true"
   * @generated
   */
  Float getBetrag();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Menge#getBetrag <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Betrag</em>' attribute.
   * @see #getBetrag()
   * @generated
   */
  void setBetrag(Float value);

  /**
   * Returns the value of the '<em><b>Einheit</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.Masseinheit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Einheit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Einheit</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Masseinheit
   * @see #setEinheit(Masseinheit)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getMenge_Einheit()
   * @model required="true"
   * @generated
   */
  Masseinheit getEinheit();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Menge#getEinheit <em>Einheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Einheit</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Masseinheit
   * @see #getEinheit()
   * @generated
   */
  void setEinheit(Masseinheit value);

} // Menge
