/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory
 * @model kind="package"
 * @generated
 */
public interface RezeptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rezept";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.github.com/funthomas424242/language/rezept";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rezept";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RezeptPackage eINSTANCE = com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ModelElementImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl <em>Rezept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezept()
   * @generated
   */
  int REZEPT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__ID = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quelle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__QUELLE = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tipps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__TIPPS = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Bewertung</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__BEWERTUNG = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Schritte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__SCHRITTE = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Produkte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__PRODUKTE = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Zutaten</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__ZUTATEN = MODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Titel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__TITEL = MODEL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Untertitel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__UNTERTITEL = MODEL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Letzte Aenderung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__LETZTE_AENDERUNG = MODEL_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Arm An</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__ARM_AN = MODEL_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Frei Von</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__FREI_VON = MODEL_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Kategorien</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__KATEGORIEN = MODEL_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Rezept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl <em>Produkt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProdukt()
   * @generated
   */
  int PRODUKT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Verpackung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__VERPACKUNG = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__EAN = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Uba</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__UBA = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Preis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__PREIS = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__HANDLER = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Hersteller</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__HERSTELLER = MODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Letzte Aenderung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__LETZTE_AENDERUNG = MODEL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Produkt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl <em>Projekt Beschreibung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProjektBeschreibung()
   * @generated
   */
  int PROJEKT_BESCHREIBUNG = 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.QuelleImpl <em>Quelle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.QuelleImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getQuelle()
   * @generated
   */
  int QUELLE = 4;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl <em>Arbeitsschritt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getArbeitsschritt()
   * @generated
   */
  int ARBEITSSCHRITT = 5;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.TippImpl <em>Tipp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.TippImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getTipp()
   * @generated
   */
  int TIPP = 6;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RankImpl <em>Rank</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RankImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRank()
   * @generated
   */
  int RANK = 7;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl <em>Produkt Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProduktRef()
   * @generated
   */
  int PRODUKT_REF = 8;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl <em>Zutat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getZutat()
   * @generated
   */
  int ZUTAT = 9;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ImportImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 10;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptModelImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezeptModel()
   * @generated
   */
  int REZEPT_MODEL = 11;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.KategorieImpl <em>Kategorie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.KategorieImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getKategorie()
   * @generated
   */
  int KATEGORIE = 12;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AlergeneImpl <em>Alergene</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.AlergeneImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getAlergene()
   * @generated
   */
  int ALERGENE = 13;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.MetadatenImpl <em>Metadaten</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.MetadatenImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMetadaten()
   * @generated
   */
  int METADATEN = 14;

  /**
   * The number of structural features of the '<em>Metadaten</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATEN_FEATURE_COUNT = 0;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__GROUP_ID = METADATEN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__ARTIFACT_ID = METADATEN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__IMPORTS = METADATEN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__VERSION = METADATEN_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Projekt Beschreibung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG_FEATURE_COUNT = METADATEN_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUELLE__BESCHREIBUNG = 0;

  /**
   * The feature id for the '<em><b>Modifikations Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUELLE__MODIFIKATIONS_ART = 1;

  /**
   * The number of structural features of the '<em>Quelle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUELLE_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBEITSSCHRITT__BESCHREIBUNG = 0;

  /**
   * The number of structural features of the '<em>Arbeitsschritt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBEITSSCHRITT_FEATURE_COUNT = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPP__TEXT = 0;

  /**
   * The number of structural features of the '<em>Tipp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPP_FEATURE_COUNT = 1;

  /**
   * The feature id for the '<em><b>Bewertung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANK__BEWERTUNG = 0;

  /**
   * The number of structural features of the '<em>Rank</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANK_FEATURE_COUNT = 1;

  /**
   * The feature id for the '<em><b>Menge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT_REF__MENGE = 0;

  /**
   * The feature id for the '<em><b>Produkt</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT_REF__PRODUKT = 1;

  /**
   * The number of structural features of the '<em>Produkt Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT_REF_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUTAT__NAME = 0;

  /**
   * The feature id for the '<em><b>Menge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUTAT__MENGE = 1;

  /**
   * The feature id for the '<em><b>Einheit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUTAT__EINHEIT = 2;

  /**
   * The number of structural features of the '<em>Zutat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUTAT_FEATURE_COUNT = 3;

  /**
   * The feature id for the '<em><b>Imported Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The feature id for the '<em><b>Elemente</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT_MODEL__ELEMENTE = 0;

  /**
   * The feature id for the '<em><b>Metadaten</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT_MODEL__METADATEN = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT_MODEL_FEATURE_COUNT = 2;

  /**
   * The number of structural features of the '<em>Kategorie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KATEGORIE_FEATURE_COUNT = 0;

  /**
   * The feature id for the '<em><b>Stoff</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERGENE__STOFF = 0;

  /**
   * The number of structural features of the '<em>Alergene</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERGENE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.StandardKategorieImpl <em>Standard Kategorie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.StandardKategorieImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getStandardKategorie()
   * @generated
   */
  int STANDARD_KATEGORIE = 15;

  /**
   * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_KATEGORIE__BEZEICHNUNG = KATEGORIE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Standard Kategorie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_KATEGORIE_FEATURE_COUNT = KATEGORIE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerKategorieImpl <em>Benutzer Kategorie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerKategorieImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBenutzerKategorie()
   * @generated
   */
  int BENUTZER_KATEGORIE = 16;

  /**
   * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENUTZER_KATEGORIE__BEZEICHNUNG = KATEGORIE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Benutzer Kategorie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENUTZER_KATEGORIE_FEATURE_COUNT = KATEGORIE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ModulBeschreibungImpl <em>Modul Beschreibung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ModulBeschreibungImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getModulBeschreibung()
   * @generated
   */
  int MODUL_BESCHREIBUNG = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODUL_BESCHREIBUNG__NAME = METADATEN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Modul Beschreibung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODUL_BESCHREIBUNG_FEATURE_COUNT = METADATEN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt <em>Modifikations Art</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getModifikationsArt()
   * @generated
   */
  int MODIFIKATIONS_ART = 18;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.KategorieArt <em>Kategorie Art</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.KategorieArt
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getKategorieArt()
   * @generated
   */
  int KATEGORIE_ART = 19;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Verpackung <em>Verpackung</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.Verpackung
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getVerpackung()
   * @generated
   */
  int VERPACKUNG = 20;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Stoff <em>Stoff</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.Stoff
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getStoff()
   * @generated
   */
  int STOFF = 21;


  /**
   * The meta object id for the '<em>Datum</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getDatum()
   * @generated
   */
  int DATUM = 22;


  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept <em>Rezept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rezept</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept
   * @generated
   */
  EClass getRezept();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getId()
   * @see #getRezept()
   * @generated
   */
  EAttribute getRezept_Id();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getQuelle <em>Quelle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quelle</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getQuelle()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Quelle();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTipps <em>Tipps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tipps</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTipps()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Tipps();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getBewertung <em>Bewertung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bewertung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getBewertung()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Bewertung();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getSchritte <em>Schritte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Schritte</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getSchritte()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Schritte();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getProdukte <em>Produkte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Produkte</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getProdukte()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Produkte();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getZutaten <em>Zutaten</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Zutaten</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getZutaten()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Zutaten();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTitel <em>Titel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Titel</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTitel()
   * @see #getRezept()
   * @generated
   */
  EAttribute getRezept_Titel();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getUntertitel <em>Untertitel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Untertitel</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getUntertitel()
   * @see #getRezept()
   * @generated
   */
  EAttribute getRezept_Untertitel();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getLetzteAenderung <em>Letzte Aenderung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Letzte Aenderung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getLetzteAenderung()
   * @see #getRezept()
   * @generated
   */
  EAttribute getRezept_LetzteAenderung();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getArmAn <em>Arm An</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arm An</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getArmAn()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_ArmAn();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getFreiVon <em>Frei Von</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Frei Von</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getFreiVon()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_FreiVon();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getKategorien <em>Kategorien</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kategorien</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getKategorien()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Kategorien();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt <em>Produkt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Produkt</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt
   * @generated
   */
  EClass getProdukt();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getName()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_Name();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getVerpackung <em>Verpackung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verpackung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getVerpackung()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_Verpackung();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getEan <em>Ean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ean</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getEan()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_Ean();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getUba <em>Uba</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uba</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getUba()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_Uba();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getPreis <em>Preis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preis</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getPreis()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_Preis();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHandler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handler</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHandler()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_Handler();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHersteller <em>Hersteller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hersteller</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHersteller()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_Hersteller();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getLetzteAenderung <em>Letzte Aenderung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Letzte Aenderung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getLetzteAenderung()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_LetzteAenderung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung <em>Projekt Beschreibung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Projekt Beschreibung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung
   * @generated
   */
  EClass getProjektBeschreibung();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getGroupId()
   * @see #getProjektBeschreibung()
   * @generated
   */
  EAttribute getProjektBeschreibung_GroupId();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getArtifactId()
   * @see #getProjektBeschreibung()
   * @generated
   */
  EAttribute getProjektBeschreibung_ArtifactId();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getImports()
   * @see #getProjektBeschreibung()
   * @generated
   */
  EReference getProjektBeschreibung_Imports();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getVersion()
   * @see #getProjektBeschreibung()
   * @generated
   */
  EAttribute getProjektBeschreibung_Version();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle <em>Quelle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quelle</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Quelle
   * @generated
   */
  EClass getQuelle();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle#getBeschreibung <em>Beschreibung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beschreibung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Quelle#getBeschreibung()
   * @see #getQuelle()
   * @generated
   */
  EAttribute getQuelle_Beschreibung();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle#getModifikationsArt <em>Modifikations Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifikations Art</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Quelle#getModifikationsArt()
   * @see #getQuelle()
   * @generated
   */
  EAttribute getQuelle_ModifikationsArt();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt <em>Arbeitsschritt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arbeitsschritt</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt
   * @generated
   */
  EClass getArbeitsschritt();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt#getBeschreibung <em>Beschreibung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beschreibung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt#getBeschreibung()
   * @see #getArbeitsschritt()
   * @generated
   */
  EAttribute getArbeitsschritt_Beschreibung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Tipp <em>Tipp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tipp</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Tipp
   * @generated
   */
  EClass getTipp();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Tipp#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Tipp#getText()
   * @see #getTipp()
   * @generated
   */
  EAttribute getTipp_Text();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Rank <em>Rank</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rank</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rank
   * @generated
   */
  EClass getRank();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rank#getBewertung <em>Bewertung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bewertung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rank#getBewertung()
   * @see #getRank()
   * @generated
   */
  EAttribute getRank_Bewertung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef <em>Produkt Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Produkt Ref</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProduktRef
   * @generated
   */
  EClass getProduktRef();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getMenge <em>Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getMenge()
   * @see #getProduktRef()
   * @generated
   */
  EAttribute getProduktRef_Menge();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getProdukt <em>Produkt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Produkt</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProduktRef#getProdukt()
   * @see #getProduktRef()
   * @generated
   */
  EReference getProduktRef_Produkt();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat <em>Zutat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zutat</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Zutat
   * @generated
   */
  EClass getZutat();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Zutat#getName()
   * @see #getZutat()
   * @generated
   */
  EAttribute getZutat_Name();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getMenge <em>Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Zutat#getMenge()
   * @see #getZutat()
   * @generated
   */
  EAttribute getZutat_Menge();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getEinheit <em>Einheit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Einheit</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Zutat#getEinheit()
   * @see #getZutat()
   * @generated
   */
  EAttribute getZutat_Einheit();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.rezeptsammler.rezept.Import#getImportedResource <em>Imported Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Resource</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Import#getImportedResource()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportedResource();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptModel
   * @generated
   */
  EClass getRezeptModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptModel#getElemente <em>Elemente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elemente</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptModel#getElemente()
   * @see #getRezeptModel()
   * @generated
   */
  EReference getRezeptModel_Elemente();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptModel#getMetadaten <em>Metadaten</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadaten</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptModel#getMetadaten()
   * @see #getRezeptModel()
   * @generated
   */
  EReference getRezeptModel_Metadaten();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Kategorie <em>Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kategorie</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Kategorie
   * @generated
   */
  EClass getKategorie();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Alergene <em>Alergene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alergene</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Alergene
   * @generated
   */
  EClass getAlergene();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Alergene#getStoff <em>Stoff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stoff</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Alergene#getStoff()
   * @see #getAlergene()
   * @generated
   */
  EAttribute getAlergene_Stoff();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Metadaten <em>Metadaten</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadaten</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Metadaten
   * @generated
   */
  EClass getMetadaten();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie <em>Standard Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Standard Kategorie</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie
   * @generated
   */
  EClass getStandardKategorie();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie#getBezeichnung <em>Bezeichnung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bezeichnung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie#getBezeichnung()
   * @see #getStandardKategorie()
   * @generated
   */
  EAttribute getStandardKategorie_Bezeichnung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.BenutzerKategorie <em>Benutzer Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Benutzer Kategorie</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BenutzerKategorie
   * @generated
   */
  EClass getBenutzerKategorie();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.BenutzerKategorie#getBezeichnung <em>Bezeichnung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bezeichnung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BenutzerKategorie#getBezeichnung()
   * @see #getBenutzerKategorie()
   * @generated
   */
  EAttribute getBenutzerKategorie_Bezeichnung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung <em>Modul Beschreibung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modul Beschreibung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung
   * @generated
   */
  EClass getModulBeschreibung();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModulBeschreibung#getName()
   * @see #getModulBeschreibung()
   * @generated
   */
  EAttribute getModulBeschreibung_Name();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt <em>Modifikations Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Modifikations Art</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt
   * @generated
   */
  EEnum getModifikationsArt();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.KategorieArt <em>Kategorie Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Kategorie Art</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.KategorieArt
   * @generated
   */
  EEnum getKategorieArt();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.Verpackung <em>Verpackung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verpackung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Verpackung
   * @generated
   */
  EEnum getVerpackung();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.Stoff <em>Stoff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Stoff</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Stoff
   * @generated
   */
  EEnum getStoff();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Datum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Datum</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   * @generated
   */
  EDataType getDatum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RezeptFactory getRezeptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl <em>Rezept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezept()
     * @generated
     */
    EClass REZEPT = eINSTANCE.getRezept();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPT__ID = eINSTANCE.getRezept_Id();

    /**
     * The meta object literal for the '<em><b>Quelle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__QUELLE = eINSTANCE.getRezept_Quelle();

    /**
     * The meta object literal for the '<em><b>Tipps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__TIPPS = eINSTANCE.getRezept_Tipps();

    /**
     * The meta object literal for the '<em><b>Bewertung</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__BEWERTUNG = eINSTANCE.getRezept_Bewertung();

    /**
     * The meta object literal for the '<em><b>Schritte</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__SCHRITTE = eINSTANCE.getRezept_Schritte();

    /**
     * The meta object literal for the '<em><b>Produkte</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__PRODUKTE = eINSTANCE.getRezept_Produkte();

    /**
     * The meta object literal for the '<em><b>Zutaten</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__ZUTATEN = eINSTANCE.getRezept_Zutaten();

    /**
     * The meta object literal for the '<em><b>Titel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPT__TITEL = eINSTANCE.getRezept_Titel();

    /**
     * The meta object literal for the '<em><b>Untertitel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPT__UNTERTITEL = eINSTANCE.getRezept_Untertitel();

    /**
     * The meta object literal for the '<em><b>Letzte Aenderung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPT__LETZTE_AENDERUNG = eINSTANCE.getRezept_LetzteAenderung();

    /**
     * The meta object literal for the '<em><b>Arm An</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__ARM_AN = eINSTANCE.getRezept_ArmAn();

    /**
     * The meta object literal for the '<em><b>Frei Von</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__FREI_VON = eINSTANCE.getRezept_FreiVon();

    /**
     * The meta object literal for the '<em><b>Kategorien</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__KATEGORIEN = eINSTANCE.getRezept_Kategorien();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ModelElementImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl <em>Produkt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProdukt()
     * @generated
     */
    EClass PRODUKT = eINSTANCE.getProdukt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__NAME = eINSTANCE.getProdukt_Name();

    /**
     * The meta object literal for the '<em><b>Verpackung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__VERPACKUNG = eINSTANCE.getProdukt_Verpackung();

    /**
     * The meta object literal for the '<em><b>Ean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__EAN = eINSTANCE.getProdukt_Ean();

    /**
     * The meta object literal for the '<em><b>Uba</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__UBA = eINSTANCE.getProdukt_Uba();

    /**
     * The meta object literal for the '<em><b>Preis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__PREIS = eINSTANCE.getProdukt_Preis();

    /**
     * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__HANDLER = eINSTANCE.getProdukt_Handler();

    /**
     * The meta object literal for the '<em><b>Hersteller</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__HERSTELLER = eINSTANCE.getProdukt_Hersteller();

    /**
     * The meta object literal for the '<em><b>Letzte Aenderung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__LETZTE_AENDERUNG = eINSTANCE.getProdukt_LetzteAenderung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl <em>Projekt Beschreibung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProjektBeschreibungImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProjektBeschreibung()
     * @generated
     */
    EClass PROJEKT_BESCHREIBUNG = eINSTANCE.getProjektBeschreibung();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJEKT_BESCHREIBUNG__GROUP_ID = eINSTANCE.getProjektBeschreibung_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJEKT_BESCHREIBUNG__ARTIFACT_ID = eINSTANCE.getProjektBeschreibung_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJEKT_BESCHREIBUNG__IMPORTS = eINSTANCE.getProjektBeschreibung_Imports();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJEKT_BESCHREIBUNG__VERSION = eINSTANCE.getProjektBeschreibung_Version();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.QuelleImpl <em>Quelle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.QuelleImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getQuelle()
     * @generated
     */
    EClass QUELLE = eINSTANCE.getQuelle();

    /**
     * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUELLE__BESCHREIBUNG = eINSTANCE.getQuelle_Beschreibung();

    /**
     * The meta object literal for the '<em><b>Modifikations Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUELLE__MODIFIKATIONS_ART = eINSTANCE.getQuelle_ModifikationsArt();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl <em>Arbeitsschritt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getArbeitsschritt()
     * @generated
     */
    EClass ARBEITSSCHRITT = eINSTANCE.getArbeitsschritt();

    /**
     * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARBEITSSCHRITT__BESCHREIBUNG = eINSTANCE.getArbeitsschritt_Beschreibung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.TippImpl <em>Tipp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.TippImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getTipp()
     * @generated
     */
    EClass TIPP = eINSTANCE.getTipp();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIPP__TEXT = eINSTANCE.getTipp_Text();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RankImpl <em>Rank</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RankImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRank()
     * @generated
     */
    EClass RANK = eINSTANCE.getRank();

    /**
     * The meta object literal for the '<em><b>Bewertung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANK__BEWERTUNG = eINSTANCE.getRank_Bewertung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl <em>Produkt Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProduktRef()
     * @generated
     */
    EClass PRODUKT_REF = eINSTANCE.getProduktRef();

    /**
     * The meta object literal for the '<em><b>Menge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT_REF__MENGE = eINSTANCE.getProduktRef_Menge();

    /**
     * The meta object literal for the '<em><b>Produkt</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUKT_REF__PRODUKT = eINSTANCE.getProduktRef_Produkt();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl <em>Zutat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getZutat()
     * @generated
     */
    EClass ZUTAT = eINSTANCE.getZutat();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZUTAT__NAME = eINSTANCE.getZutat_Name();

    /**
     * The meta object literal for the '<em><b>Menge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZUTAT__MENGE = eINSTANCE.getZutat_Menge();

    /**
     * The meta object literal for the '<em><b>Einheit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZUTAT__EINHEIT = eINSTANCE.getZutat_Einheit();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ImportImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORTED_RESOURCE = eINSTANCE.getImport_ImportedResource();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptModelImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezeptModel()
     * @generated
     */
    EClass REZEPT_MODEL = eINSTANCE.getRezeptModel();

    /**
     * The meta object literal for the '<em><b>Elemente</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT_MODEL__ELEMENTE = eINSTANCE.getRezeptModel_Elemente();

    /**
     * The meta object literal for the '<em><b>Metadaten</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT_MODEL__METADATEN = eINSTANCE.getRezeptModel_Metadaten();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.KategorieImpl <em>Kategorie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.KategorieImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getKategorie()
     * @generated
     */
    EClass KATEGORIE = eINSTANCE.getKategorie();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AlergeneImpl <em>Alergene</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.AlergeneImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getAlergene()
     * @generated
     */
    EClass ALERGENE = eINSTANCE.getAlergene();

    /**
     * The meta object literal for the '<em><b>Stoff</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALERGENE__STOFF = eINSTANCE.getAlergene_Stoff();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.MetadatenImpl <em>Metadaten</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.MetadatenImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMetadaten()
     * @generated
     */
    EClass METADATEN = eINSTANCE.getMetadaten();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.StandardKategorieImpl <em>Standard Kategorie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.StandardKategorieImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getStandardKategorie()
     * @generated
     */
    EClass STANDARD_KATEGORIE = eINSTANCE.getStandardKategorie();

    /**
     * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STANDARD_KATEGORIE__BEZEICHNUNG = eINSTANCE.getStandardKategorie_Bezeichnung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerKategorieImpl <em>Benutzer Kategorie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerKategorieImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBenutzerKategorie()
     * @generated
     */
    EClass BENUTZER_KATEGORIE = eINSTANCE.getBenutzerKategorie();

    /**
     * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENUTZER_KATEGORIE__BEZEICHNUNG = eINSTANCE.getBenutzerKategorie_Bezeichnung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ModulBeschreibungImpl <em>Modul Beschreibung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ModulBeschreibungImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getModulBeschreibung()
     * @generated
     */
    EClass MODUL_BESCHREIBUNG = eINSTANCE.getModulBeschreibung();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODUL_BESCHREIBUNG__NAME = eINSTANCE.getModulBeschreibung_Name();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt <em>Modifikations Art</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getModifikationsArt()
     * @generated
     */
    EEnum MODIFIKATIONS_ART = eINSTANCE.getModifikationsArt();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.KategorieArt <em>Kategorie Art</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.KategorieArt
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getKategorieArt()
     * @generated
     */
    EEnum KATEGORIE_ART = eINSTANCE.getKategorieArt();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Verpackung <em>Verpackung</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.Verpackung
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getVerpackung()
     * @generated
     */
    EEnum VERPACKUNG = eINSTANCE.getVerpackung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Stoff <em>Stoff</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.Stoff
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getStoff()
     * @generated
     */
    EEnum STOFF = eINSTANCE.getStoff();

    /**
     * The meta object literal for the '<em>Datum</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getDatum()
     * @generated
     */
    EDataType DATUM = eINSTANCE.getDatum();

  }

} //RezeptPackage
