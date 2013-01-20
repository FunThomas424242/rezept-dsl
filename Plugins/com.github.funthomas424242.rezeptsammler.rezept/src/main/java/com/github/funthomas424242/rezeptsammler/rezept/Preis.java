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
 * A representation of the model object '<em><b>Preis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Preis#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Preis#getWaehrung <em>Waehrung</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getPreis()
 * @model
 * @generated
 */
public interface Preis extends EObject
{
  /**
   * Returns the value of the '<em><b>Betrag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Betrag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Betrag</em>' attribute.
   * @see #setBetrag(Float)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getPreis_Betrag()
   * @model required="true"
   * @generated
   */
  Float getBetrag();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Preis#getBetrag <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Betrag</em>' attribute.
   * @see #getBetrag()
   * @generated
   */
  void setBetrag(Float value);

  /**
   * Returns the value of the '<em><b>Waehrung</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.Waehrung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Waehrung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Waehrung</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Waehrung
   * @see #setWaehrung(Waehrung)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getPreis_Waehrung()
   * @model required="true"
   * @generated
   */
  Waehrung getWaehrung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Preis#getWaehrung <em>Waehrung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Waehrung</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Waehrung
   * @see #getWaehrung()
   * @generated
   */
  void setWaehrung(Waehrung value);

} // Preis
