/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diaet Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.DiaetTag#getDiaet <em>Diaet</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getDiaetTag()
 * @model
 * @generated
 */
public interface DiaetTag extends Tag
{
  /**
   * Returns the value of the '<em><b>Diaet</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.DiaetArt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Diaet</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Diaet</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.DiaetArt
   * @see #setDiaet(DiaetArt)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getDiaetTag_Diaet()
   * @model required="true"
   * @generated
   */
  DiaetArt getDiaet();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.DiaetTag#getDiaet <em>Diaet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Diaet</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.DiaetArt
   * @see #getDiaet()
   * @generated
   */
  void setDiaet(DiaetArt value);

} // DiaetTag
