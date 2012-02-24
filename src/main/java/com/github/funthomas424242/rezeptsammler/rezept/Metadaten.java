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
 * A representation of the model object '<em><b>Metadaten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Metadaten#getProjektdaten <em>Projektdaten</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getMetadaten()
 * @model
 * @generated
 */
public interface Metadaten extends EObject
{
  /**
   * Returns the value of the '<em><b>Projektdaten</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projektdaten</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projektdaten</em>' containment reference.
   * @see #setProjektdaten(ProjektBeschreibung)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getMetadaten_Projektdaten()
   * @model containment="true"
   * @generated
   */
  ProjektBeschreibung getProjektdaten();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Metadaten#getProjektdaten <em>Projektdaten</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Projektdaten</em>' containment reference.
   * @see #getProjektdaten()
   * @generated
   */
  void setProjektdaten(ProjektBeschreibung value);

} // Metadaten
