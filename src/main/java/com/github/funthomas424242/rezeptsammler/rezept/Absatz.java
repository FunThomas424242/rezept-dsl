/**
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absatz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Absatz#getTitel <em>Titel</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Absatz#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAbsatz()
 * @model
 * @generated
 */
public interface Absatz extends EObject
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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAbsatz_Titel()
   * @model
   * @generated
   */
  String getTitel();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Absatz#getTitel <em>Titel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titel</em>' attribute.
   * @see #getTitel()
   * @generated
   */
  void setTitel(String value);

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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAbsatz_Text()
   * @model required="true"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Absatz#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // Absatz
