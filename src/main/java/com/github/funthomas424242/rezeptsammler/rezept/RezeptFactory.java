/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage
 * @generated
 */
public interface RezeptFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RezeptFactory eINSTANCE = com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Rezept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rezept</em>'.
   * @generated
   */
  Rezept createRezept();

  /**
   * Returns a new object of class '<em>Produkt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Produkt</em>'.
   * @generated
   */
  Produkt createProdukt();

  /**
   * Returns a new object of class '<em>Projekt Beschreibung</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Projekt Beschreibung</em>'.
   * @generated
   */
  ProjektBeschreibung createProjektBeschreibung();

  /**
   * Returns a new object of class '<em>Quelle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quelle</em>'.
   * @generated
   */
  Quelle createQuelle();

  /**
   * Returns a new object of class '<em>Arbeitsschritt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arbeitsschritt</em>'.
   * @generated
   */
  Arbeitsschritt createArbeitsschritt();

  /**
   * Returns a new object of class '<em>Tipp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tipp</em>'.
   * @generated
   */
  Tipp createTipp();

  /**
   * Returns a new object of class '<em>Rank</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rank</em>'.
   * @generated
   */
  Rank createRank();

  /**
   * Returns a new object of class '<em>Produkt Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Produkt Ref</em>'.
   * @generated
   */
  ProduktRef createProduktRef();

  /**
   * Returns a new object of class '<em>Zutat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Zutat</em>'.
   * @generated
   */
  Zutat createZutat();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  RezeptModel createRezeptModel();

  /**
   * Returns a new object of class '<em>Alergene</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alergene</em>'.
   * @generated
   */
  Alergene createAlergene();

  /**
   * Returns a new object of class '<em>Standard Kategorie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standard Kategorie</em>'.
   * @generated
   */
  StandardKategorie createStandardKategorie();

  /**
   * Returns a new object of class '<em>Benutzer Kategorie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Benutzer Kategorie</em>'.
   * @generated
   */
  BenutzerKategorie createBenutzerKategorie();

  /**
   * Returns a new object of class '<em>Modul Beschreibung</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modul Beschreibung</em>'.
   * @generated
   */
  ModulBeschreibung createModulBeschreibung();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RezeptPackage getRezeptPackage();

} //RezeptFactory
