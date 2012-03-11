/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projekt Beschreibung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getImports <em>Imports</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getBuch <em>Buch</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProjektBeschreibung()
 * @model
 * @generated
 */
public interface ProjektBeschreibung extends EObject
{
  /**
   * Returns the value of the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Id</em>' attribute.
   * @see #setGroupId(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProjektBeschreibung_GroupId()
   * @model required="true"
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getGroupId <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Id</em>' attribute.
   * @see #getGroupId()
   * @generated
   */
  void setGroupId(String value);

  /**
   * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Id</em>' attribute.
   * @see #setArtifactId(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProjektBeschreibung_ArtifactId()
   * @model required="true"
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getArtifactId <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Id</em>' attribute.
   * @see #getArtifactId()
   * @generated
   */
  void setArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rezeptsammler.rezept.RezeptImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProjektBeschreibung_Imports()
   * @model containment="true"
   * @generated
   */
  EList<RezeptImport> getImports();

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProjektBeschreibung_Version()
   * @model required="true"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Buch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buch</em>' containment reference.
   * @see #setBuch(BuchBeschreibung)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProjektBeschreibung_Buch()
   * @model containment="true" required="true"
   * @generated
   */
  BuchBeschreibung getBuch();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getBuch <em>Buch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buch</em>' containment reference.
   * @see #getBuch()
   * @generated
   */
  void setBuch(BuchBeschreibung value);

} // ProjektBeschreibung
