/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bestimmte Menge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getEinheit <em>Einheit</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBestimmteMenge()
 * @model
 * @generated
 */
public interface BestimmteMenge extends Menge
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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBestimmteMenge_Betrag()
   * @model default="1.5" required="true"
   * @generated
   */
  Float getBetrag();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getBetrag <em>Betrag</em>}' attribute.
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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBestimmteMenge_Einheit()
   * @model required="true"
   * @generated
   */
  Masseinheit getEinheit();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getEinheit <em>Einheit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Einheit</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Masseinheit
   * @see #getEinheit()
   * @generated
   */
  void setEinheit(Masseinheit value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' attribute.
   * @see #setDetails(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBestimmteMenge_Details()
   * @model
   * @generated
   */
  String getDetails();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getDetails <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' attribute.
   * @see #getDetails()
   * @generated
   */
  void setDetails(String value);

} // BestimmteMenge
