/**
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lokaler Pfad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getLokalerPfad()
 * @model
 * @generated
 */
public interface LokalerPfad extends AblagePfad
{
  /**
   * Returns the value of the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' attribute.
   * @see #setFileName(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getLokalerPfad_FileName()
   * @model required="true"
   * @generated
   */
  String getFileName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad#getFileName <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' attribute.
   * @see #getFileName()
   * @generated
   */
  void setFileName(String value);

} // LokalerPfad
