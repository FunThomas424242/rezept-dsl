/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rezeptliste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getName <em>Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getRezepte <em>Rezepte</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptliste()
 * @model
 * @generated
 */
public interface Rezeptliste extends EObject
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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptliste_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rezepte</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Rezept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rezepte</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rezepte</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptliste_Rezepte()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Rezept> getRezepte();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.ProduktImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptliste_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ProduktImport> getImports();

} // Rezeptliste
