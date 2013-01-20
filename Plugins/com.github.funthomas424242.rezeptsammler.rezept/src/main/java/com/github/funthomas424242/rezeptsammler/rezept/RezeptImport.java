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
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptImport#getImportedResource <em>Imported Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptImport()
 * @model
 * @generated
 */
public interface RezeptImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Resource</em>' reference.
   * @see #setImportedResource(Rezeptliste)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getRezeptImport_ImportedResource()
   * @model required="true"
   * @generated
   */
  Rezeptliste getImportedResource();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptImport#getImportedResource <em>Imported Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Resource</em>' reference.
   * @see #getImportedResource()
   * @generated
   */
  void setImportedResource(Rezeptliste value);

} // RezeptImport