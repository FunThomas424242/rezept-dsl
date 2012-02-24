/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Alergene;
import com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt;
import com.github.funthomas424242.rezeptsammler.rezept.BenutzerKategorie;
import com.github.funthomas424242.rezeptsammler.rezept.Import;
import com.github.funthomas424242.rezeptsammler.rezept.Kategorie;
import com.github.funthomas424242.rezeptsammler.rezept.KategorieArt;
import com.github.funthomas424242.rezeptsammler.rezept.Metadaten;
import com.github.funthomas424242.rezeptsammler.rezept.ModelElement;
import com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt;
import com.github.funthomas424242.rezeptsammler.rezept.Produkt;
import com.github.funthomas424242.rezeptsammler.rezept.ProduktRef;
import com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.Quelle;
import com.github.funthomas424242.rezeptsammler.rezept.Rank;
import com.github.funthomas424242.rezeptsammler.rezept.Rezept;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptModel;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie;
import com.github.funthomas424242.rezeptsammler.rezept.Stoff;
import com.github.funthomas424242.rezeptsammler.rezept.Tipp;
import com.github.funthomas424242.rezeptsammler.rezept.Verpackung;
import com.github.funthomas424242.rezeptsammler.rezept.Zutat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RezeptPackageImpl extends EPackageImpl implements RezeptPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rezeptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass produktEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projektBeschreibungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quelleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arbeitsschrittEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tippEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rankEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass produktRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass zutatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rezeptModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kategorieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alergeneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadatenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass standardKategorieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass benutzerKategorieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum modifikationsArtEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kategorieArtEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum verpackungEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stoffEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RezeptPackageImpl()
  {
    super(eNS_URI, RezeptFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RezeptPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RezeptPackage init()
  {
    if (isInited) return (RezeptPackage)EPackage.Registry.INSTANCE.getEPackage(RezeptPackage.eNS_URI);

    // Obtain or create and register package
    RezeptPackageImpl theRezeptPackage = (RezeptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RezeptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RezeptPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRezeptPackage.createPackageContents();

    // Initialize created meta-data
    theRezeptPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRezeptPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RezeptPackage.eNS_URI, theRezeptPackage);
    return theRezeptPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRezept()
  {
    return rezeptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_Id()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Quelle()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Tipps()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Bewertung()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Schritte()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Produkte()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Zutaten()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_Titel()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_Untertitel()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_LetzteAenderung()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_ArmAn()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_FreiVon()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Kategorien()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelElement()
  {
    return modelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProdukt()
  {
    return produktEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Name()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Verpackung()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Ean()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Uba()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Preis()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Handler()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Hersteller()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_LetzteAenderung()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjektBeschreibung()
  {
    return projektBeschreibungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjektBeschreibung_ProgramVersion()
  {
    return (EAttribute)projektBeschreibungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjektBeschreibung_Name()
  {
    return (EAttribute)projektBeschreibungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjektBeschreibung_Imports()
  {
    return (EReference)projektBeschreibungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuelle()
  {
    return quelleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuelle_Beschreibung()
  {
    return (EAttribute)quelleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuelle_ModifikationsArt()
  {
    return (EAttribute)quelleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArbeitsschritt()
  {
    return arbeitsschrittEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArbeitsschritt_Beschreibung()
  {
    return (EAttribute)arbeitsschrittEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTipp()
  {
    return tippEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTipp_Text()
  {
    return (EAttribute)tippEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRank()
  {
    return rankEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRank_Bewertung()
  {
    return (EAttribute)rankEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduktRef()
  {
    return produktRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduktRef_Menge()
  {
    return (EAttribute)produktRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduktRef_Produkt()
  {
    return (EReference)produktRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getZutat()
  {
    return zutatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getZutat_Name()
  {
    return (EAttribute)zutatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getZutat_Menge()
  {
    return (EAttribute)zutatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getZutat_Einheit()
  {
    return (EAttribute)zutatEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_ImportedResource()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRezeptModel()
  {
    return rezeptModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezeptModel_Elemente()
  {
    return (EReference)rezeptModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezeptModel_Metadaten()
  {
    return (EReference)rezeptModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKategorie()
  {
    return kategorieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlergene()
  {
    return alergeneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlergene_Stoff()
  {
    return (EAttribute)alergeneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadaten()
  {
    return metadatenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetadaten_Projektdaten()
  {
    return (EReference)metadatenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStandardKategorie()
  {
    return standardKategorieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStandardKategorie_Bezeichnung()
  {
    return (EAttribute)standardKategorieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBenutzerKategorie()
  {
    return benutzerKategorieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBenutzerKategorie_Bezeichnung()
  {
    return (EAttribute)benutzerKategorieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getModifikationsArt()
  {
    return modifikationsArtEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getKategorieArt()
  {
    return kategorieArtEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVerpackung()
  {
    return verpackungEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStoff()
  {
    return stoffEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RezeptFactory getRezeptFactory()
  {
    return (RezeptFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rezeptEClass = createEClass(REZEPT);
    createEAttribute(rezeptEClass, REZEPT__ID);
    createEReference(rezeptEClass, REZEPT__QUELLE);
    createEReference(rezeptEClass, REZEPT__TIPPS);
    createEReference(rezeptEClass, REZEPT__BEWERTUNG);
    createEReference(rezeptEClass, REZEPT__SCHRITTE);
    createEReference(rezeptEClass, REZEPT__PRODUKTE);
    createEReference(rezeptEClass, REZEPT__ZUTATEN);
    createEAttribute(rezeptEClass, REZEPT__TITEL);
    createEAttribute(rezeptEClass, REZEPT__UNTERTITEL);
    createEAttribute(rezeptEClass, REZEPT__LETZTE_AENDERUNG);
    createEReference(rezeptEClass, REZEPT__ARM_AN);
    createEReference(rezeptEClass, REZEPT__FREI_VON);
    createEReference(rezeptEClass, REZEPT__KATEGORIEN);

    modelElementEClass = createEClass(MODEL_ELEMENT);

    produktEClass = createEClass(PRODUKT);
    createEAttribute(produktEClass, PRODUKT__NAME);
    createEAttribute(produktEClass, PRODUKT__VERPACKUNG);
    createEAttribute(produktEClass, PRODUKT__EAN);
    createEAttribute(produktEClass, PRODUKT__UBA);
    createEAttribute(produktEClass, PRODUKT__PREIS);
    createEAttribute(produktEClass, PRODUKT__HANDLER);
    createEAttribute(produktEClass, PRODUKT__HERSTELLER);
    createEAttribute(produktEClass, PRODUKT__LETZTE_AENDERUNG);

    projektBeschreibungEClass = createEClass(PROJEKT_BESCHREIBUNG);
    createEAttribute(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__PROGRAM_VERSION);
    createEAttribute(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__NAME);
    createEReference(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__IMPORTS);

    quelleEClass = createEClass(QUELLE);
    createEAttribute(quelleEClass, QUELLE__BESCHREIBUNG);
    createEAttribute(quelleEClass, QUELLE__MODIFIKATIONS_ART);

    arbeitsschrittEClass = createEClass(ARBEITSSCHRITT);
    createEAttribute(arbeitsschrittEClass, ARBEITSSCHRITT__BESCHREIBUNG);

    tippEClass = createEClass(TIPP);
    createEAttribute(tippEClass, TIPP__TEXT);

    rankEClass = createEClass(RANK);
    createEAttribute(rankEClass, RANK__BEWERTUNG);

    produktRefEClass = createEClass(PRODUKT_REF);
    createEAttribute(produktRefEClass, PRODUKT_REF__MENGE);
    createEReference(produktRefEClass, PRODUKT_REF__PRODUKT);

    zutatEClass = createEClass(ZUTAT);
    createEAttribute(zutatEClass, ZUTAT__NAME);
    createEAttribute(zutatEClass, ZUTAT__MENGE);
    createEAttribute(zutatEClass, ZUTAT__EINHEIT);

    importEClass = createEClass(IMPORT);
    createEReference(importEClass, IMPORT__IMPORTED_RESOURCE);

    rezeptModelEClass = createEClass(REZEPT_MODEL);
    createEReference(rezeptModelEClass, REZEPT_MODEL__ELEMENTE);
    createEReference(rezeptModelEClass, REZEPT_MODEL__METADATEN);

    kategorieEClass = createEClass(KATEGORIE);

    alergeneEClass = createEClass(ALERGENE);
    createEAttribute(alergeneEClass, ALERGENE__STOFF);

    metadatenEClass = createEClass(METADATEN);
    createEReference(metadatenEClass, METADATEN__PROJEKTDATEN);

    standardKategorieEClass = createEClass(STANDARD_KATEGORIE);
    createEAttribute(standardKategorieEClass, STANDARD_KATEGORIE__BEZEICHNUNG);

    benutzerKategorieEClass = createEClass(BENUTZER_KATEGORIE);
    createEAttribute(benutzerKategorieEClass, BENUTZER_KATEGORIE__BEZEICHNUNG);

    // Create enums
    modifikationsArtEEnum = createEEnum(MODIFIKATIONS_ART);
    kategorieArtEEnum = createEEnum(KATEGORIE_ART);
    verpackungEEnum = createEEnum(VERPACKUNG);
    stoffEEnum = createEEnum(STOFF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    rezeptEClass.getESuperTypes().add(this.getModelElement());
    produktEClass.getESuperTypes().add(this.getModelElement());
    standardKategorieEClass.getESuperTypes().add(this.getKategorie());
    benutzerKategorieEClass.getESuperTypes().add(this.getKategorie());

    // Initialize classes and features; add operations and parameters
    initEClass(rezeptEClass, Rezept.class, "Rezept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRezept_Id(), ecorePackage.getELongObject(), "id", "1", 1, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Quelle(), this.getQuelle(), null, "quelle", null, 0, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Tipps(), this.getTipp(), null, "tipps", null, 0, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Bewertung(), this.getRank(), null, "bewertung", null, 0, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Schritte(), this.getArbeitsschritt(), null, "schritte", null, 1, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Produkte(), this.getProduktRef(), null, "produkte", null, 0, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Zutaten(), this.getZutat(), null, "zutaten", null, 1, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_Titel(), ecorePackage.getEString(), "titel", null, 1, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_Untertitel(), ecorePackage.getEString(), "untertitel", null, 0, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_LetzteAenderung(), ecorePackage.getEString(), "letzteAenderung", "01.01.2012", 1, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_ArmAn(), this.getAlergene(), null, "armAn", null, 0, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_FreiVon(), this.getAlergene(), null, "freiVon", null, 0, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Kategorien(), this.getKategorie(), null, "kategorien", null, 1, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(produktEClass, Produkt.class, "Produkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProdukt_Name(), ecorePackage.getEString(), "name", null, 1, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Verpackung(), this.getVerpackung(), "verpackung", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Ean(), ecorePackage.getEString(), "ean", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Uba(), ecorePackage.getEString(), "uba", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Preis(), ecorePackage.getEFloatObject(), "preis", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Handler(), ecorePackage.getEString(), "handler", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Hersteller(), ecorePackage.getEString(), "hersteller", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_LetzteAenderung(), ecorePackage.getEString(), "letzteAenderung", null, 1, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projektBeschreibungEClass, ProjektBeschreibung.class, "ProjektBeschreibung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjektBeschreibung_ProgramVersion(), ecorePackage.getEString(), "programVersion", null, 1, 1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProjektBeschreibung_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjektBeschreibung_Imports(), this.getImport(), null, "imports", null, 0, -1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quelleEClass, Quelle.class, "Quelle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuelle_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 1, 1, Quelle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuelle_ModifikationsArt(), this.getModifikationsArt(), "modifikationsArt", null, 1, 1, Quelle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arbeitsschrittEClass, Arbeitsschritt.class, "Arbeitsschritt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArbeitsschritt_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 1, 1, Arbeitsschritt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tippEClass, Tipp.class, "Tipp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTipp_Text(), ecorePackage.getEString(), "text", null, 1, 1, Tipp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rankEClass, Rank.class, "Rank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRank_Bewertung(), ecorePackage.getEString(), "bewertung", null, 1, 1, Rank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(produktRefEClass, ProduktRef.class, "ProduktRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProduktRef_Menge(), ecorePackage.getEFloatObject(), "menge", null, 1, 1, ProduktRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduktRef_Produkt(), this.getProdukt(), null, "produkt", null, 1, 1, ProduktRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(zutatEClass, Zutat.class, "Zutat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getZutat_Name(), ecorePackage.getEString(), "name", null, 1, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getZutat_Menge(), ecorePackage.getEFloatObject(), "menge", null, 1, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getZutat_Einheit(), ecorePackage.getEString(), "einheit", null, 1, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImport_ImportedResource(), this.getRezeptModel(), null, "importedResource", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rezeptModelEClass, RezeptModel.class, "RezeptModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRezeptModel_Elemente(), this.getModelElement(), null, "elemente", null, 1, -1, RezeptModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezeptModel_Metadaten(), this.getMetadaten(), null, "metadaten", null, 1, 1, RezeptModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kategorieEClass, Kategorie.class, "Kategorie", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alergeneEClass, Alergene.class, "Alergene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlergene_Stoff(), this.getStoff(), "stoff", null, 1, 1, Alergene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadatenEClass, Metadaten.class, "Metadaten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetadaten_Projektdaten(), this.getProjektBeschreibung(), null, "projektdaten", null, 0, 1, Metadaten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(standardKategorieEClass, StandardKategorie.class, "StandardKategorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStandardKategorie_Bezeichnung(), this.getKategorieArt(), "bezeichnung", null, 1, 1, StandardKategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(benutzerKategorieEClass, BenutzerKategorie.class, "BenutzerKategorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBenutzerKategorie_Bezeichnung(), ecorePackage.getEString(), "bezeichnung", "defaultKategorie", 1, 1, BenutzerKategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(modifikationsArtEEnum, ModifikationsArt.class, "ModifikationsArt");
    addEEnumLiteral(modifikationsArtEEnum, ModifikationsArt.ORIGINAL);
    addEEnumLiteral(modifikationsArtEEnum, ModifikationsArt.VERAENDERT);

    initEEnum(kategorieArtEEnum, KategorieArt.class, "KategorieArt");
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.SALAT);
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.KOCHEN);
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.BACKEN);

    initEEnum(verpackungEEnum, Verpackung.class, "Verpackung");
    addEEnumLiteral(verpackungEEnum, Verpackung.PACKUNG);
    addEEnumLiteral(verpackungEEnum, Verpackung.DOSE);
    addEEnumLiteral(verpackungEEnum, Verpackung.BUECHSE);
    addEEnumLiteral(verpackungEEnum, Verpackung.BEUTEL);
    addEEnumLiteral(verpackungEEnum, Verpackung.STUECK);

    initEEnum(stoffEEnum, Stoff.class, "Stoff");
    addEEnumLiteral(stoffEEnum, Stoff.LAKTOSE);
    addEEnumLiteral(stoffEEnum, Stoff.FRUCHTZUCKER);
    addEEnumLiteral(stoffEEnum, Stoff.NUESSEN);

    // Create resource
    createResource(eNS_URI);
  }

} //RezeptPackageImpl
