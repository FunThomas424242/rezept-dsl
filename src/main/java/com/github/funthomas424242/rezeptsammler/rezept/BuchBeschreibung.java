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
 * A representation of the model object '<em><b>Buch Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getTitel <em>Titel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getResourcesDir <em>Resources Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung()
 * @model
 * @generated
 */
public interface BuchBeschreibung extends EObject
{
  /**
   * Returns the value of the '<em><b>Titel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Titel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Titel</em>' attribute.
   * @see #setTitel(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_Titel()
   * @model required="true"
   * @generated
   */
  String getTitel();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getTitel <em>Titel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titel</em>' attribute.
   * @see #getTitel()
   * @generated
   */
  void setTitel(String value);

  /**
   * Returns the value of the '<em><b>Resources Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources Dir</em>' attribute.
   * @see #setResourcesDir(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBuchBeschreibung_ResourcesDir()
   * @model required="true"
   * @generated
   */
  String getResourcesDir();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getResourcesDir <em>Resources Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resources Dir</em>' attribute.
   * @see #getResourcesDir()
   * @generated
   */
  void setResourcesDir(String value);

} // BuchBeschreibung
