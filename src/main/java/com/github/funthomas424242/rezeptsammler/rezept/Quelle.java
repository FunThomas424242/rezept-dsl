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
 * A representation of the model object '<em><b>Quelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle#getModifikationsArt <em>Modifikations Art</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getQuelle()
 * @model
 * @generated
 */
public interface Quelle extends EObject
{
  /**
   * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beschreibung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beschreibung</em>' attribute.
   * @see #setBeschreibung(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getQuelle_Beschreibung()
   * @model required="true"
   * @generated
   */
  String getBeschreibung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle#getBeschreibung <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beschreibung</em>' attribute.
   * @see #getBeschreibung()
   * @generated
   */
  void setBeschreibung(String value);

  /**
   * Returns the value of the '<em><b>Modifikations Art</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifikations Art</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifikations Art</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt
   * @see #setModifikationsArt(ModifikationsArt)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getQuelle_ModifikationsArt()
   * @model required="true"
   * @generated
   */
  ModifikationsArt getModifikationsArt();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle#getModifikationsArt <em>Modifikations Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifikations Art</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt
   * @see #getModifikationsArt()
   * @generated
   */
  void setModifikationsArt(ModifikationsArt value);

} // Quelle
