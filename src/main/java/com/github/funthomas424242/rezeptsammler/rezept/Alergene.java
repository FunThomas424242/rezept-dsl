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
 * A representation of the model object '<em><b>Alergene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Alergene#getStoff <em>Stoff</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAlergene()
 * @model
 * @generated
 */
public interface Alergene extends EObject
{
  /**
   * Returns the value of the '<em><b>Stoff</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.Stoff}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stoff</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stoff</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Stoff
   * @see #setStoff(Stoff)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAlergene_Stoff()
   * @model required="true"
   * @generated
   */
  Stoff getStoff();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Alergene#getStoff <em>Stoff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stoff</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Stoff
   * @see #getStoff()
   * @generated
   */
  void setStoff(Stoff value);

} // Alergene
