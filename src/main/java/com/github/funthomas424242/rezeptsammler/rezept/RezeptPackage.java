/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
  int REZEPT__ID = 0;

  /**
   * The feature id for the '<em><b>Quelle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__QUELLE = 1;

  /**
   * The feature id for the '<em><b>Schritte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__SCHRITTE = 2;

  /**
   * The feature id for the '<em><b>Produkte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__PRODUKTE = 3;

  /**
   * The feature id for the '<em><b>Zutaten</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__ZUTATEN = 4;

  /**
   * The feature id for the '<em><b>Titel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__TITEL = 5;

  /**
   * The feature id for the '<em><b>Untertitel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__UNTERTITEL = 6;

  /**
   * The feature id for the '<em><b>Kategorie</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__KATEGORIE = 7;

  /**
   * The feature id for the '<em><b>Letzte Aenderung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__LETZTE_AENDERUNG = 8;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__TAGS = 9;

  /**
   * The feature id for the '<em><b>Notizen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__NOTIZEN = 10;

  /**
   * The feature id for the '<em><b>Personen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT__PERSONEN = 11;

  /**
   * The number of structural features of the '<em>Rezept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImportImpl <em>Produkt Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImportImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProduktImport()
   * @generated
   */
  int PRODUKT_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT_IMPORT__IMPORTED_RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Produkt Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT_IMPORT_FEATURE_COUNT = 1;

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
  int PRODUKT__NAME = 0;

  /**
   * The feature id for the '<em><b>Verpackung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__VERPACKUNG = 1;

  /**
   * The feature id for the '<em><b>Ean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__EAN = 2;

  /**
   * The feature id for the '<em><b>Uba</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__UBA = 3;

  /**
   * The feature id for the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__HANDLER = 4;

  /**
   * The feature id for the '<em><b>Hersteller</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__HERSTELLER = 5;

  /**
   * The feature id for the '<em><b>Datum Letzte Aenderung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__DATUM_LETZTE_AENDERUNG = 6;

  /**
   * The feature id for the '<em><b>Preis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__PREIS = 7;

  /**
   * The feature id for the '<em><b>Menge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT__MENGE = 8;

  /**
   * The number of structural features of the '<em>Produkt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKT_FEATURE_COUNT = 9;

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
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__VERSION = 3;

  /**
   * The feature id for the '<em><b>Buch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG__BUCH = 4;

  /**
   * The number of structural features of the '<em>Projekt Beschreibung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJEKT_BESCHREIBUNG_FEATURE_COUNT = 5;

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
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl <em>Arbeitsschritt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ArbeitsschrittImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getArbeitsschritt()
   * @generated
   */
  int ARBEITSSCHRITT = 5;

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
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.NotizImpl <em>Notiz</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.NotizImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getNotiz()
   * @generated
   */
  int NOTIZ = 20;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIZ__TEXT = 0;

  /**
   * The number of structural features of the '<em>Notiz</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIZ_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.TippImpl <em>Tipp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.TippImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getTipp()
   * @generated
   */
  int TIPP = 9;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImportImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezeptImport()
   * @generated
   */
  int REZEPT_IMPORT = 10;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.KommentarImpl <em>Kommentar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.KommentarImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getKommentar()
   * @generated
   */
  int KOMMENTAR = 6;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOMMENTAR__TEXT = NOTIZ__TEXT;

  /**
   * The number of structural features of the '<em>Kommentar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOMMENTAR_FEATURE_COUNT = NOTIZ_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl <em>Produkt Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktRefImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProduktRef()
   * @generated
   */
  int PRODUKT_REF = 7;

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
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl <em>Zutat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ZutatImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getZutat()
   * @generated
   */
  int ZUTAT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUTAT__NAME = 0;

  /**
   * The feature id for the '<em><b>Menge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUTAT__MENGE = 1;

  /**
   * The number of structural features of the '<em>Zutat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUTAT_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPP__TEXT = NOTIZ__TEXT;

  /**
   * The number of structural features of the '<em>Tipp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPP_FEATURE_COUNT = NOTIZ_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imported Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT_IMPORT__IMPORTED_RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPT_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.TagImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getTag()
   * @generated
   */
  int TAG = 11;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.StoffTagImpl <em>Stoff Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.StoffTagImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getStoffTag()
   * @generated
   */
  int STOFF_TAG = 12;

  /**
   * The feature id for the '<em><b>Stoff</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOFF_TAG__STOFF = TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stoff Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOFF_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerTagImpl <em>Benutzer Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerTagImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBenutzerTag()
   * @generated
   */
  int BENUTZER_TAG = 13;

  /**
   * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENUTZER_TAG__BEZEICHNUNG = TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Benutzer Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENUTZER_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptlisteImpl <em>Rezeptliste</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptlisteImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezeptliste()
   * @generated
   */
  int REZEPTLISTE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPTLISTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Rezepte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPTLISTE__REZEPTE = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPTLISTE__IMPORTS = 2;

  /**
   * The number of structural features of the '<em>Rezeptliste</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REZEPTLISTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.DiaetTagImpl <em>Diaet Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.DiaetTagImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getDiaetTag()
   * @generated
   */
  int DIAET_TAG = 15;

  /**
   * The feature id for the '<em><b>Diaet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAET_TAG__DIAET = TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Diaet Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAET_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.PreisImpl <em>Preis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.PreisImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getPreis()
   * @generated
   */
  int PREIS = 16;

  /**
   * The feature id for the '<em><b>Betrag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREIS__BETRAG = 0;

  /**
   * The feature id for the '<em><b>Waehrung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREIS__WAEHRUNG = 1;

  /**
   * The number of structural features of the '<em>Preis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREIS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.MengeImpl <em>Menge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.MengeImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMenge()
   * @generated
   */
  int MENGE = 17;

  /**
   * The number of structural features of the '<em>Menge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENGE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl <em>Buch Beschreibung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBuchBeschreibung()
   * @generated
   */
  int BUCH_BESCHREIBUNG = 18;

  /**
   * The feature id for the '<em><b>Titel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCH_BESCHREIBUNG__TITEL = 0;

  /**
   * The feature id for the '<em><b>Resources Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCH_BESCHREIBUNG__RESOURCES_DIR = 1;

  /**
   * The number of structural features of the '<em>Buch Beschreibung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCH_BESCHREIBUNG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AnmerkungImpl <em>Anmerkung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.AnmerkungImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getAnmerkung()
   * @generated
   */
  int ANMERKUNG = 19;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANMERKUNG__TEXT = NOTIZ__TEXT;

  /**
   * The number of structural features of the '<em>Anmerkung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANMERKUNG_FEATURE_COUNT = NOTIZ_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BestimmteMengeImpl <em>Bestimmte Menge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BestimmteMengeImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBestimmteMenge()
   * @generated
   */
  int BESTIMMTE_MENGE = 21;

  /**
   * The feature id for the '<em><b>Betrag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BESTIMMTE_MENGE__BETRAG = MENGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Einheit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BESTIMMTE_MENGE__EINHEIT = MENGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bestimmte Menge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BESTIMMTE_MENGE_FEATURE_COUNT = MENGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.UnbestimmteMengeImpl <em>Unbestimmte Menge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.UnbestimmteMengeImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getUnbestimmteMenge()
   * @generated
   */
  int UNBESTIMMTE_MENGE = 22;

  /**
   * The feature id for the '<em><b>Menge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBESTIMMTE_MENGE__MENGE = MENGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unbestimmte Menge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBESTIMMTE_MENGE_FEATURE_COUNT = MENGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktlisteImpl <em>Produktliste</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktlisteImpl
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProduktliste()
   * @generated
   */
  int PRODUKTLISTE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKTLISTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Produkte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKTLISTE__PRODUKTE = 1;

  /**
   * The number of structural features of the '<em>Produktliste</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUKTLISTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt <em>Modifikations Art</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getModifikationsArt()
   * @generated
   */
  int MODIFIKATIONS_ART = 24;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.KategorieArt <em>Kategorie Art</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.KategorieArt
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getKategorieArt()
   * @generated
   */
  int KATEGORIE_ART = 25;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Verpackung <em>Verpackung</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.Verpackung
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getVerpackung()
   * @generated
   */
  int VERPACKUNG = 26;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Stoff <em>Stoff</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.Stoff
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getStoff()
   * @generated
   */
  int STOFF = 27;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.DiaetArt <em>Diaet Art</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.DiaetArt
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getDiaetArt()
   * @generated
   */
  int DIAET_ART = 28;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Waehrung <em>Waehrung</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.Waehrung
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getWaehrung()
   * @generated
   */
  int WAEHRUNG = 29;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Masseinheit <em>Masseinheit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.Masseinheit
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMasseinheit()
   * @generated
   */
  int MASSEINHEIT = 30;


  /**
   * The meta object id for the '{@link com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe <em>Mengen Angabe</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe
   * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMengenAngabe()
   * @generated
   */
  int MENGEN_ANGABE = 31;


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
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getKategorie <em>Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kategorie</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getKategorie()
   * @see #getRezept()
   * @generated
   */
  EAttribute getRezept_Kategorie();

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
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getTags()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Tags();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getNotizen <em>Notizen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notizen</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getNotizen()
   * @see #getRezept()
   * @generated
   */
  EReference getRezept_Notizen();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept#getPersonen <em>Personen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Personen</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept#getPersonen()
   * @see #getRezept()
   * @generated
   */
  EAttribute getRezept_Personen();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktImport <em>Produkt Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Produkt Import</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProduktImport
   * @generated
   */
  EClass getProduktImport();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktImport#getImportedResource <em>Imported Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Resource</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProduktImport#getImportedResource()
   * @see #getProduktImport()
   * @generated
   */
  EReference getProduktImport_ImportedResource();

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
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getDatumLetzteAenderung <em>Datum Letzte Aenderung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datum Letzte Aenderung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getDatumLetzteAenderung()
   * @see #getProdukt()
   * @generated
   */
  EAttribute getProdukt_DatumLetzteAenderung();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getPreis <em>Preis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preis</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getPreis()
   * @see #getProdukt()
   * @generated
   */
  EReference getProdukt_Preis();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getMenge <em>Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt#getMenge()
   * @see #getProdukt()
   * @generated
   */
  EReference getProdukt_Menge();

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
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getBuch <em>Buch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Buch</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung#getBuch()
   * @see #getProjektBeschreibung()
   * @generated
   */
  EReference getProjektBeschreibung_Buch();

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
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptImport
   * @generated
   */
  EClass getRezeptImport();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptImport#getImportedResource <em>Imported Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Resource</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptImport#getImportedResource()
   * @see #getRezeptImport()
   * @generated
   */
  EReference getRezeptImport_ImportedResource();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Kommentar <em>Kommentar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kommentar</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Kommentar
   * @generated
   */
  EClass getKommentar();

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
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat#getMenge <em>Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Zutat#getMenge()
   * @see #getZutat()
   * @generated
   */
  EReference getZutat_Menge();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.StoffTag <em>Stoff Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stoff Tag</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.StoffTag
   * @generated
   */
  EClass getStoffTag();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.StoffTag#getStoff <em>Stoff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stoff</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.StoffTag#getStoff()
   * @see #getStoffTag()
   * @generated
   */
  EAttribute getStoffTag_Stoff();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag <em>Benutzer Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Benutzer Tag</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag
   * @generated
   */
  EClass getBenutzerTag();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag#getBezeichnung <em>Bezeichnung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bezeichnung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag#getBezeichnung()
   * @see #getBenutzerTag()
   * @generated
   */
  EAttribute getBenutzerTag_Bezeichnung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste <em>Rezeptliste</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rezeptliste</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste
   * @generated
   */
  EClass getRezeptliste();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getName()
   * @see #getRezeptliste()
   * @generated
   */
  EAttribute getRezeptliste_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getRezepte <em>Rezepte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rezepte</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getRezepte()
   * @see #getRezeptliste()
   * @generated
   */
  EReference getRezeptliste_Rezepte();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste#getImports()
   * @see #getRezeptliste()
   * @generated
   */
  EReference getRezeptliste_Imports();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.DiaetTag <em>Diaet Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diaet Tag</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.DiaetTag
   * @generated
   */
  EClass getDiaetTag();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.DiaetTag#getDiaet <em>Diaet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Diaet</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.DiaetTag#getDiaet()
   * @see #getDiaetTag()
   * @generated
   */
  EAttribute getDiaetTag_Diaet();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Preis <em>Preis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preis</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Preis
   * @generated
   */
  EClass getPreis();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Preis#getBetrag <em>Betrag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Betrag</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Preis#getBetrag()
   * @see #getPreis()
   * @generated
   */
  EAttribute getPreis_Betrag();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Preis#getWaehrung <em>Waehrung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Waehrung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Preis#getWaehrung()
   * @see #getPreis()
   * @generated
   */
  EAttribute getPreis_Waehrung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Menge <em>Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Menge
   * @generated
   */
  EClass getMenge();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung <em>Buch Beschreibung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Buch Beschreibung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung
   * @generated
   */
  EClass getBuchBeschreibung();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getTitel <em>Titel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Titel</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getTitel()
   * @see #getBuchBeschreibung()
   * @generated
   */
  EAttribute getBuchBeschreibung_Titel();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getResourcesDir <em>Resources Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resources Dir</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung#getResourcesDir()
   * @see #getBuchBeschreibung()
   * @generated
   */
  EAttribute getBuchBeschreibung_ResourcesDir();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Anmerkung <em>Anmerkung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anmerkung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Anmerkung
   * @generated
   */
  EClass getAnmerkung();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Notiz <em>Notiz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notiz</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Notiz
   * @generated
   */
  EClass getNotiz();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Notiz#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Notiz#getText()
   * @see #getNotiz()
   * @generated
   */
  EAttribute getNotiz_Text();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge <em>Bestimmte Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bestimmte Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge
   * @generated
   */
  EClass getBestimmteMenge();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getBetrag <em>Betrag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Betrag</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getBetrag()
   * @see #getBestimmteMenge()
   * @generated
   */
  EAttribute getBestimmteMenge_Betrag();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getEinheit <em>Einheit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Einheit</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge#getEinheit()
   * @see #getBestimmteMenge()
   * @generated
   */
  EAttribute getBestimmteMenge_Einheit();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge <em>Unbestimmte Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unbestimmte Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge
   * @generated
   */
  EClass getUnbestimmteMenge();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge#getMenge <em>Menge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Menge</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge#getMenge()
   * @see #getUnbestimmteMenge()
   * @generated
   */
  EAttribute getUnbestimmteMenge_Menge();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rezeptsammler.rezept.Produktliste <em>Produktliste</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Produktliste</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produktliste
   * @generated
   */
  EClass getProduktliste();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rezeptsammler.rezept.Produktliste#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produktliste#getName()
   * @see #getProduktliste()
   * @generated
   */
  EAttribute getProduktliste_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rezeptsammler.rezept.Produktliste#getProdukte <em>Produkte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Produkte</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produktliste#getProdukte()
   * @see #getProduktliste()
   * @generated
   */
  EReference getProduktliste_Produkte();

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
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.DiaetArt <em>Diaet Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Diaet Art</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.DiaetArt
   * @generated
   */
  EEnum getDiaetArt();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.Waehrung <em>Waehrung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Waehrung</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Waehrung
   * @generated
   */
  EEnum getWaehrung();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.Masseinheit <em>Masseinheit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Masseinheit</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Masseinheit
   * @generated
   */
  EEnum getMasseinheit();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe <em>Mengen Angabe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Mengen Angabe</em>'.
   * @see com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe
   * @generated
   */
  EEnum getMengenAngabe();

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
     * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPT__KATEGORIE = eINSTANCE.getRezept_Kategorie();

    /**
     * The meta object literal for the '<em><b>Letzte Aenderung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPT__LETZTE_AENDERUNG = eINSTANCE.getRezept_LetzteAenderung();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__TAGS = eINSTANCE.getRezept_Tags();

    /**
     * The meta object literal for the '<em><b>Notizen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT__NOTIZEN = eINSTANCE.getRezept_Notizen();

    /**
     * The meta object literal for the '<em><b>Personen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPT__PERSONEN = eINSTANCE.getRezept_Personen();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImportImpl <em>Produkt Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktImportImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProduktImport()
     * @generated
     */
    EClass PRODUKT_IMPORT = eINSTANCE.getProduktImport();

    /**
     * The meta object literal for the '<em><b>Imported Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUKT_IMPORT__IMPORTED_RESOURCE = eINSTANCE.getProduktImport_ImportedResource();

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
     * The meta object literal for the '<em><b>Datum Letzte Aenderung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKT__DATUM_LETZTE_AENDERUNG = eINSTANCE.getProdukt_DatumLetzteAenderung();

    /**
     * The meta object literal for the '<em><b>Preis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUKT__PREIS = eINSTANCE.getProdukt_Preis();

    /**
     * The meta object literal for the '<em><b>Menge</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUKT__MENGE = eINSTANCE.getProdukt_Menge();

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
     * The meta object literal for the '<em><b>Buch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJEKT_BESCHREIBUNG__BUCH = eINSTANCE.getProjektBeschreibung_Buch();

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
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptImportImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezeptImport()
     * @generated
     */
    EClass REZEPT_IMPORT = eINSTANCE.getRezeptImport();

    /**
     * The meta object literal for the '<em><b>Imported Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPT_IMPORT__IMPORTED_RESOURCE = eINSTANCE.getRezeptImport_ImportedResource();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.KommentarImpl <em>Kommentar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.KommentarImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getKommentar()
     * @generated
     */
    EClass KOMMENTAR = eINSTANCE.getKommentar();

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
     * The meta object literal for the '<em><b>Menge</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZUTAT__MENGE = eINSTANCE.getZutat_Menge();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.TagImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.StoffTagImpl <em>Stoff Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.StoffTagImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getStoffTag()
     * @generated
     */
    EClass STOFF_TAG = eINSTANCE.getStoffTag();

    /**
     * The meta object literal for the '<em><b>Stoff</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STOFF_TAG__STOFF = eINSTANCE.getStoffTag_Stoff();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerTagImpl <em>Benutzer Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BenutzerTagImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBenutzerTag()
     * @generated
     */
    EClass BENUTZER_TAG = eINSTANCE.getBenutzerTag();

    /**
     * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENUTZER_TAG__BEZEICHNUNG = eINSTANCE.getBenutzerTag_Bezeichnung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptlisteImpl <em>Rezeptliste</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptlisteImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getRezeptliste()
     * @generated
     */
    EClass REZEPTLISTE = eINSTANCE.getRezeptliste();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REZEPTLISTE__NAME = eINSTANCE.getRezeptliste_Name();

    /**
     * The meta object literal for the '<em><b>Rezepte</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPTLISTE__REZEPTE = eINSTANCE.getRezeptliste_Rezepte();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REZEPTLISTE__IMPORTS = eINSTANCE.getRezeptliste_Imports();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.DiaetTagImpl <em>Diaet Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.DiaetTagImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getDiaetTag()
     * @generated
     */
    EClass DIAET_TAG = eINSTANCE.getDiaetTag();

    /**
     * The meta object literal for the '<em><b>Diaet</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAET_TAG__DIAET = eINSTANCE.getDiaetTag_Diaet();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.PreisImpl <em>Preis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.PreisImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getPreis()
     * @generated
     */
    EClass PREIS = eINSTANCE.getPreis();

    /**
     * The meta object literal for the '<em><b>Betrag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREIS__BETRAG = eINSTANCE.getPreis_Betrag();

    /**
     * The meta object literal for the '<em><b>Waehrung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREIS__WAEHRUNG = eINSTANCE.getPreis_Waehrung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.MengeImpl <em>Menge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.MengeImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMenge()
     * @generated
     */
    EClass MENGE = eINSTANCE.getMenge();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl <em>Buch Beschreibung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BuchBeschreibungImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBuchBeschreibung()
     * @generated
     */
    EClass BUCH_BESCHREIBUNG = eINSTANCE.getBuchBeschreibung();

    /**
     * The meta object literal for the '<em><b>Titel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUCH_BESCHREIBUNG__TITEL = eINSTANCE.getBuchBeschreibung_Titel();

    /**
     * The meta object literal for the '<em><b>Resources Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUCH_BESCHREIBUNG__RESOURCES_DIR = eINSTANCE.getBuchBeschreibung_ResourcesDir();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.AnmerkungImpl <em>Anmerkung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.AnmerkungImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getAnmerkung()
     * @generated
     */
    EClass ANMERKUNG = eINSTANCE.getAnmerkung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.NotizImpl <em>Notiz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.NotizImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getNotiz()
     * @generated
     */
    EClass NOTIZ = eINSTANCE.getNotiz();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTIZ__TEXT = eINSTANCE.getNotiz_Text();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.BestimmteMengeImpl <em>Bestimmte Menge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.BestimmteMengeImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getBestimmteMenge()
     * @generated
     */
    EClass BESTIMMTE_MENGE = eINSTANCE.getBestimmteMenge();

    /**
     * The meta object literal for the '<em><b>Betrag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BESTIMMTE_MENGE__BETRAG = eINSTANCE.getBestimmteMenge_Betrag();

    /**
     * The meta object literal for the '<em><b>Einheit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BESTIMMTE_MENGE__EINHEIT = eINSTANCE.getBestimmteMenge_Einheit();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.UnbestimmteMengeImpl <em>Unbestimmte Menge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.UnbestimmteMengeImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getUnbestimmteMenge()
     * @generated
     */
    EClass UNBESTIMMTE_MENGE = eINSTANCE.getUnbestimmteMenge();

    /**
     * The meta object literal for the '<em><b>Menge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNBESTIMMTE_MENGE__MENGE = eINSTANCE.getUnbestimmteMenge_Menge();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktlisteImpl <em>Produktliste</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.ProduktlisteImpl
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getProduktliste()
     * @generated
     */
    EClass PRODUKTLISTE = eINSTANCE.getProduktliste();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUKTLISTE__NAME = eINSTANCE.getProduktliste_Name();

    /**
     * The meta object literal for the '<em><b>Produkte</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUKTLISTE__PRODUKTE = eINSTANCE.getProduktliste_Produkte();

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
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.DiaetArt <em>Diaet Art</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.DiaetArt
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getDiaetArt()
     * @generated
     */
    EEnum DIAET_ART = eINSTANCE.getDiaetArt();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Waehrung <em>Waehrung</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.Waehrung
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getWaehrung()
     * @generated
     */
    EEnum WAEHRUNG = eINSTANCE.getWaehrung();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.Masseinheit <em>Masseinheit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.Masseinheit
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMasseinheit()
     * @generated
     */
    EEnum MASSEINHEIT = eINSTANCE.getMasseinheit();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe <em>Mengen Angabe</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe
     * @see com.github.funthomas424242.rezeptsammler.rezept.impl.RezeptPackageImpl#getMengenAngabe()
     * @generated
     */
    EEnum MENGEN_ANGABE = eINSTANCE.getMengenAngabe();

  }

} //RezeptPackage
