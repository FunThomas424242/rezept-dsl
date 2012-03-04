/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modul Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung#getName <em>Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung#getImports <em>Imports</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung#getElemente <em>Elemente</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getModulBeschreibung()
 * @model
 * @generated
 */
public interface ModulBeschreibung extends Metadaten
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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getModulBeschreibung_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getModulBeschreibung_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Elemente</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.ModelElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemente</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemente</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getModulBeschreibung_Elemente()
   * @model containment="true" required="true"
   * @generated
   */
  EList<ModelElement> getElemente();

} // ModulBeschreibung
