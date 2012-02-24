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
 * A representation of the model object '<em><b>Produkt Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getMenge <em>Menge</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getProdukt <em>Produkt</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProduktRef()
 * @model
 * @generated
 */
public interface ProduktRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Menge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menge</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menge</em>' attribute.
   * @see #setMenge(Float)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProduktRef_Menge()
   * @model required="true"
   * @generated
   */
  Float getMenge();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getMenge <em>Menge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menge</em>' attribute.
   * @see #getMenge()
   * @generated
   */
  void setMenge(Float value);

  /**
   * Returns the value of the '<em><b>Produkt</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produkt</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Produkt</em>' reference.
   * @see #setProdukt(Produkt)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProduktRef_Produkt()
   * @model required="true"
   * @generated
   */
  Produkt getProdukt();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getProdukt <em>Produkt</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Produkt</em>' reference.
   * @see #getProdukt()
   * @generated
   */
  void setProdukt(Produkt value);

} // ProduktRef
