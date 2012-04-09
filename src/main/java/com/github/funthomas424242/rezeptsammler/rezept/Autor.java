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
 * A representation of the model object '<em><b>Autor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Autor#getVorname <em>Vorname</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Autor#getNachname <em>Nachname</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Autor#getOrganisationsName <em>Organisations Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAutor()
 * @model
 * @generated
 */
public interface Autor extends EObject
{
  /**
   * Returns the value of the '<em><b>Vorname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vorname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vorname</em>' attribute.
   * @see #setVorname(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAutor_Vorname()
   * @model required="true"
   * @generated
   */
  String getVorname();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Autor#getVorname <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vorname</em>' attribute.
   * @see #getVorname()
   * @generated
   */
  void setVorname(String value);

  /**
   * Returns the value of the '<em><b>Nachname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nachname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nachname</em>' attribute.
   * @see #setNachname(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAutor_Nachname()
   * @model required="true"
   * @generated
   */
  String getNachname();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Autor#getNachname <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nachname</em>' attribute.
   * @see #getNachname()
   * @generated
   */
  void setNachname(String value);

  /**
   * Returns the value of the '<em><b>Organisations Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organisations Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organisations Name</em>' attribute.
   * @see #setOrganisationsName(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getAutor_OrganisationsName()
   * @model
   * @generated
   */
  String getOrganisationsName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Autor#getOrganisationsName <em>Organisations Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organisations Name</em>' attribute.
   * @see #getOrganisationsName()
   * @generated
   */
  void setOrganisationsName(String value);

} // Autor
