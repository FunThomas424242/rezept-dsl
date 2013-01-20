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
   * Returns a new object of class '<em>Produkt Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Produkt Import</em>'.
   * @generated
   */
  ProduktImport createProduktImport();

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
   * Returns a new object of class '<em>Literaturquelle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literaturquelle</em>'.
   * @generated
   */
  Literaturquelle createLiteraturquelle();

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
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  RezeptImport createRezeptImport();

  /**
   * Returns a new object of class '<em>Kommentar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kommentar</em>'.
   * @generated
   */
  Kommentar createKommentar();

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
   * Returns a new object of class '<em>Stoff Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stoff Tag</em>'.
   * @generated
   */
  StoffTag createStoffTag();

  /**
   * Returns a new object of class '<em>Benutzer Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Benutzer Tag</em>'.
   * @generated
   */
  BenutzerTag createBenutzerTag();

  /**
   * Returns a new object of class '<em>Rezeptliste</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rezeptliste</em>'.
   * @generated
   */
  Rezeptliste createRezeptliste();

  /**
   * Returns a new object of class '<em>Diaet Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diaet Tag</em>'.
   * @generated
   */
  DiaetTag createDiaetTag();

  /**
   * Returns a new object of class '<em>Preis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preis</em>'.
   * @generated
   */
  Preis createPreis();

  /**
   * Returns a new object of class '<em>Buch Beschreibung</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Buch Beschreibung</em>'.
   * @generated
   */
  BuchBeschreibung createBuchBeschreibung();

  /**
   * Returns a new object of class '<em>Anmerkung</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anmerkung</em>'.
   * @generated
   */
  Anmerkung createAnmerkung();

  /**
   * Returns a new object of class '<em>Bestimmte Menge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bestimmte Menge</em>'.
   * @generated
   */
  BestimmteMenge createBestimmteMenge();

  /**
   * Returns a new object of class '<em>Unbestimmte Menge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unbestimmte Menge</em>'.
   * @generated
   */
  UnbestimmteMenge createUnbestimmteMenge();

  /**
   * Returns a new object of class '<em>Produktliste</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Produktliste</em>'.
   * @generated
   */
  Produktliste createProduktliste();

  /**
   * Returns a new object of class '<em>Lizenz</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lizenz</em>'.
   * @generated
   */
  Lizenz createLizenz();

  /**
   * Returns a new object of class '<em>Autor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Autor</em>'.
   * @generated
   */
  Autor createAutor();

  /**
   * Returns a new object of class '<em>Personenquelle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personenquelle</em>'.
   * @generated
   */
  Personenquelle createPersonenquelle();

  /**
   * Returns a new object of class '<em>Bild</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bild</em>'.
   * @generated
   */
  Bild createBild();

  /**
   * Returns a new object of class '<em>Internet Pfad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internet Pfad</em>'.
   * @generated
   */
  InternetPfad createInternetPfad();

  /**
   * Returns a new object of class '<em>Lokaler Pfad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lokaler Pfad</em>'.
   * @generated
   */
  LokalerPfad createLokalerPfad();

  /**
   * Returns a new object of class '<em>Absatz</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Absatz</em>'.
   * @generated
   */
  Absatz createAbsatz();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RezeptPackage getRezeptPackage();

} //RezeptFactory
