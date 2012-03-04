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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptModel#getMetadaten <em>Metadaten</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptModel()
 * @model
 * @generated
 */
public interface RezeptModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Metadaten</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadaten</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadaten</em>' containment reference.
   * @see #setMetadaten(Metadaten)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptModel_Metadaten()
   * @model containment="true" required="true"
   * @generated
   */
  Metadaten getMetadaten();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptModel#getMetadaten <em>Metadaten</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadaten</em>' containment reference.
   * @see #getMetadaten()
   * @generated
   */
  void setMetadaten(Metadaten value);

} // RezeptModel
