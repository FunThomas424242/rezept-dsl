/**
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bild</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getLizenz <em>Lizenz</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getUrheber <em>Urheber</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getAblageOrt <em>Ablage Ort</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBild()
 * @model
 * @generated
 */
public interface Bild extends EObject
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
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBild_Beschreibung()
   * @model
   * @generated
   */
  String getBeschreibung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getBeschreibung <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beschreibung</em>' attribute.
   * @see #getBeschreibung()
   * @generated
   */
  void setBeschreibung(String value);

  /**
   * Returns the value of the '<em><b>Lizenz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lizenz</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lizenz</em>' attribute.
   * @see #setLizenz(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBild_Lizenz()
   * @model
   * @generated
   */
  String getLizenz();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getLizenz <em>Lizenz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lizenz</em>' attribute.
   * @see #getLizenz()
   * @generated
   */
  void setLizenz(String value);

  /**
   * Returns the value of the '<em><b>Urheber</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Urheber</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Urheber</em>' attribute.
   * @see #setUrheber(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBild_Urheber()
   * @model
   * @generated
   */
  String getUrheber();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getUrheber <em>Urheber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Urheber</em>' attribute.
   * @see #getUrheber()
   * @generated
   */
  void setUrheber(String value);

  /**
   * Returns the value of the '<em><b>Ablage Ort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ablage Ort</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ablage Ort</em>' containment reference.
   * @see #setAblageOrt(AblagePfad)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getBild_AblageOrt()
   * @model containment="true" required="true"
   * @generated
   */
  AblagePfad getAblageOrt();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Bild#getAblageOrt <em>Ablage Ort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ablage Ort</em>' containment reference.
   * @see #getAblageOrt()
   * @generated
   */
  void setAblageOrt(AblagePfad value);

} // Bild
