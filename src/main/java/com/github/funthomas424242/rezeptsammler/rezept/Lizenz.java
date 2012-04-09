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
 * A representation of the model object '<em><b>Lizenz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Lizenz#getText <em>Text</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Lizenz#getHinweis <em>Hinweis</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getLizenz()
 * @model
 * @generated
 */
public interface Lizenz extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getLizenz_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Lizenz#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Hinweis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hinweis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hinweis</em>' attribute.
   * @see #setHinweis(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getLizenz_Hinweis()
   * @model required="true"
   * @generated
   */
  String getHinweis();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Lizenz#getHinweis <em>Hinweis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hinweis</em>' attribute.
   * @see #getHinweis()
   * @generated
   */
  void setHinweis(String value);

} // Lizenz
