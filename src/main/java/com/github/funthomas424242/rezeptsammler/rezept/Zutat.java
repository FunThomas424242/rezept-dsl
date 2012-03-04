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
 * A representation of the model object '<em><b>Zutat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getName <em>Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getMenge <em>Menge</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getZutat()
 * @model
 * @generated
 */
public interface Zutat extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getZutat_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Menge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menge</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menge</em>' containment reference.
   * @see #setMenge(Menge)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getZutat_Menge()
   * @model containment="true" required="true"
   * @generated
   */
  Menge getMenge();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getMenge <em>Menge</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menge</em>' containment reference.
   * @see #getMenge()
   * @generated
   */
  void setMenge(Menge value);

} // Zutat
