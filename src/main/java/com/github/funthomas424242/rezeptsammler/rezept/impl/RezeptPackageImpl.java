/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.Anmerkung;
import com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt;
import com.github.funthomas424242.rezeptsammler.rezept.Autor;
import com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag;
import com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge;
import com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.DiaetArt;
import com.github.funthomas424242.rezeptsammler.rezept.DiaetTag;
import com.github.funthomas424242.rezeptsammler.rezept.KategorieArt;
import com.github.funthomas424242.rezeptsammler.rezept.Kommentar;
import com.github.funthomas424242.rezeptsammler.rezept.Lizenz;
import com.github.funthomas424242.rezeptsammler.rezept.Masseinheit;
import com.github.funthomas424242.rezeptsammler.rezept.Menge;
import com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe;
import com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt;
import com.github.funthomas424242.rezeptsammler.rezept.Notiz;
import com.github.funthomas424242.rezeptsammler.rezept.Preis;
import com.github.funthomas424242.rezeptsammler.rezept.Produkt;
import com.github.funthomas424242.rezeptsammler.rezept.ProduktImport;
import com.github.funthomas424242.rezeptsammler.rezept.ProduktRef;
import com.github.funthomas424242.rezeptsammler.rezept.Produktliste;
import com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.Quelle;
import com.github.funthomas424242.rezeptsammler.rezept.Rezept;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptImport;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage;
import com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste;
import com.github.funthomas424242.rezeptsammler.rezept.Stoff;
import com.github.funthomas424242.rezeptsammler.rezept.StoffTag;
import com.github.funthomas424242.rezeptsammler.rezept.Tag;
import com.github.funthomas424242.rezeptsammler.rezept.Tipp;
import com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge;
import com.github.funthomas424242.rezeptsammler.rezept.Verpackung;
import com.github.funthomas424242.rezeptsammler.rezept.Waehrung;
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
  private EClass produktImportEClass = null;

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
  private EClass kommentarEClass = null;

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
  private EClass tippEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rezeptImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stoffTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass benutzerTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rezeptlisteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diaetTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mengeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buchBeschreibungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anmerkungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notizEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bestimmteMengeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unbestimmteMengeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass produktlisteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lizenzEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autorEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum diaetArtEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum waehrungEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum masseinheitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mengenAngabeEEnum = null;

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
  public EReference getRezept_Schritte()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Produkte()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Zutaten()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_Titel()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_Untertitel()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_Kategorie()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_LetzteAenderung()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Tags()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezept_Notizen()
  {
    return (EReference)rezeptEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezept_Personen()
  {
    return (EAttribute)rezeptEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduktImport()
  {
    return produktImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduktImport_ImportedResource()
  {
    return (EReference)produktImportEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getProdukt_Handler()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_Hersteller()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProdukt_DatumLetzteAenderung()
  {
    return (EAttribute)produktEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProdukt_Preis()
  {
    return (EReference)produktEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProdukt_Menge()
  {
    return (EReference)produktEClass.getEStructuralFeatures().get(8);
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
  public EAttribute getProjektBeschreibung_GroupId()
  {
    return (EAttribute)projektBeschreibungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjektBeschreibung_ArtifactId()
  {
    return (EAttribute)projektBeschreibungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjektBeschreibung_Version()
  {
    return (EAttribute)projektBeschreibungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjektBeschreibung_Buch()
  {
    return (EReference)projektBeschreibungEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjektBeschreibung_ResourcesDir()
  {
    return (EAttribute)projektBeschreibungEClass.getEStructuralFeatures().get(4);
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
  public EClass getKommentar()
  {
    return kommentarEClass;
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
  public EReference getZutat_Menge()
  {
    return (EReference)zutatEClass.getEStructuralFeatures().get(1);
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
  public EClass getRezeptImport()
  {
    return rezeptImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezeptImport_ImportedResource()
  {
    return (EReference)rezeptImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag()
  {
    return tagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStoffTag()
  {
    return stoffTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStoffTag_Stoff()
  {
    return (EAttribute)stoffTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBenutzerTag()
  {
    return benutzerTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBenutzerTag_Bezeichnung()
  {
    return (EAttribute)benutzerTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRezeptliste()
  {
    return rezeptlisteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRezeptliste_Name()
  {
    return (EAttribute)rezeptlisteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezeptliste_Rezepte()
  {
    return (EReference)rezeptlisteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRezeptliste_Imports()
  {
    return (EReference)rezeptlisteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiaetTag()
  {
    return diaetTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiaetTag_Diaet()
  {
    return (EAttribute)diaetTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreis()
  {
    return preisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreis_Betrag()
  {
    return (EAttribute)preisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreis_Waehrung()
  {
    return (EAttribute)preisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenge()
  {
    return mengeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuchBeschreibung()
  {
    return buchBeschreibungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuchBeschreibung_Titel()
  {
    return (EAttribute)buchBeschreibungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuchBeschreibung_Vorwort()
  {
    return (EAttribute)buchBeschreibungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuchBeschreibung_DatumPublished()
  {
    return (EAttribute)buchBeschreibungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchBeschreibung_Lizenz()
  {
    return (EReference)buchBeschreibungEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchBeschreibung_Autoren()
  {
    return (EReference)buchBeschreibungEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchBeschreibung_Imports()
  {
    return (EReference)buchBeschreibungEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnmerkung()
  {
    return anmerkungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotiz()
  {
    return notizEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotiz_Text()
  {
    return (EAttribute)notizEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBestimmteMenge()
  {
    return bestimmteMengeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBestimmteMenge_Betrag()
  {
    return (EAttribute)bestimmteMengeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBestimmteMenge_Einheit()
  {
    return (EAttribute)bestimmteMengeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnbestimmteMenge()
  {
    return unbestimmteMengeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnbestimmteMenge_Menge()
  {
    return (EAttribute)unbestimmteMengeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduktliste()
  {
    return produktlisteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduktliste_Name()
  {
    return (EAttribute)produktlisteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduktliste_Produkte()
  {
    return (EReference)produktlisteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLizenz()
  {
    return lizenzEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLizenz_Text()
  {
    return (EAttribute)lizenzEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLizenz_Hinweis()
  {
    return (EAttribute)lizenzEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutor()
  {
    return autorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAutor_Vorname()
  {
    return (EAttribute)autorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAutor_Nachname()
  {
    return (EAttribute)autorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAutor_OrganisationsName()
  {
    return (EAttribute)autorEClass.getEStructuralFeatures().get(2);
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
  public EEnum getDiaetArt()
  {
    return diaetArtEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWaehrung()
  {
    return waehrungEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMasseinheit()
  {
    return masseinheitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMengenAngabe()
  {
    return mengenAngabeEEnum;
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
    createEReference(rezeptEClass, REZEPT__SCHRITTE);
    createEReference(rezeptEClass, REZEPT__PRODUKTE);
    createEReference(rezeptEClass, REZEPT__ZUTATEN);
    createEAttribute(rezeptEClass, REZEPT__TITEL);
    createEAttribute(rezeptEClass, REZEPT__UNTERTITEL);
    createEAttribute(rezeptEClass, REZEPT__KATEGORIE);
    createEAttribute(rezeptEClass, REZEPT__LETZTE_AENDERUNG);
    createEReference(rezeptEClass, REZEPT__TAGS);
    createEReference(rezeptEClass, REZEPT__NOTIZEN);
    createEAttribute(rezeptEClass, REZEPT__PERSONEN);

    produktImportEClass = createEClass(PRODUKT_IMPORT);
    createEReference(produktImportEClass, PRODUKT_IMPORT__IMPORTED_RESOURCE);

    produktEClass = createEClass(PRODUKT);
    createEAttribute(produktEClass, PRODUKT__NAME);
    createEAttribute(produktEClass, PRODUKT__VERPACKUNG);
    createEAttribute(produktEClass, PRODUKT__EAN);
    createEAttribute(produktEClass, PRODUKT__UBA);
    createEAttribute(produktEClass, PRODUKT__HANDLER);
    createEAttribute(produktEClass, PRODUKT__HERSTELLER);
    createEAttribute(produktEClass, PRODUKT__DATUM_LETZTE_AENDERUNG);
    createEReference(produktEClass, PRODUKT__PREIS);
    createEReference(produktEClass, PRODUKT__MENGE);

    buchBeschreibungEClass = createEClass(BUCH_BESCHREIBUNG);
    createEAttribute(buchBeschreibungEClass, BUCH_BESCHREIBUNG__TITEL);
    createEAttribute(buchBeschreibungEClass, BUCH_BESCHREIBUNG__VORWORT);
    createEAttribute(buchBeschreibungEClass, BUCH_BESCHREIBUNG__DATUM_PUBLISHED);
    createEReference(buchBeschreibungEClass, BUCH_BESCHREIBUNG__LIZENZ);
    createEReference(buchBeschreibungEClass, BUCH_BESCHREIBUNG__AUTOREN);
    createEReference(buchBeschreibungEClass, BUCH_BESCHREIBUNG__IMPORTS);

    projektBeschreibungEClass = createEClass(PROJEKT_BESCHREIBUNG);
    createEAttribute(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__GROUP_ID);
    createEAttribute(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__ARTIFACT_ID);
    createEAttribute(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__VERSION);
    createEReference(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__BUCH);
    createEAttribute(projektBeschreibungEClass, PROJEKT_BESCHREIBUNG__RESOURCES_DIR);

    quelleEClass = createEClass(QUELLE);
    createEAttribute(quelleEClass, QUELLE__BESCHREIBUNG);
    createEAttribute(quelleEClass, QUELLE__MODIFIKATIONS_ART);

    arbeitsschrittEClass = createEClass(ARBEITSSCHRITT);
    createEAttribute(arbeitsschrittEClass, ARBEITSSCHRITT__BESCHREIBUNG);

    kommentarEClass = createEClass(KOMMENTAR);

    produktRefEClass = createEClass(PRODUKT_REF);
    createEAttribute(produktRefEClass, PRODUKT_REF__MENGE);
    createEReference(produktRefEClass, PRODUKT_REF__PRODUKT);

    zutatEClass = createEClass(ZUTAT);
    createEAttribute(zutatEClass, ZUTAT__NAME);
    createEReference(zutatEClass, ZUTAT__MENGE);

    tippEClass = createEClass(TIPP);

    rezeptImportEClass = createEClass(REZEPT_IMPORT);
    createEReference(rezeptImportEClass, REZEPT_IMPORT__IMPORTED_RESOURCE);

    tagEClass = createEClass(TAG);

    stoffTagEClass = createEClass(STOFF_TAG);
    createEAttribute(stoffTagEClass, STOFF_TAG__STOFF);

    benutzerTagEClass = createEClass(BENUTZER_TAG);
    createEAttribute(benutzerTagEClass, BENUTZER_TAG__BEZEICHNUNG);

    rezeptlisteEClass = createEClass(REZEPTLISTE);
    createEAttribute(rezeptlisteEClass, REZEPTLISTE__NAME);
    createEReference(rezeptlisteEClass, REZEPTLISTE__REZEPTE);
    createEReference(rezeptlisteEClass, REZEPTLISTE__IMPORTS);

    diaetTagEClass = createEClass(DIAET_TAG);
    createEAttribute(diaetTagEClass, DIAET_TAG__DIAET);

    preisEClass = createEClass(PREIS);
    createEAttribute(preisEClass, PREIS__BETRAG);
    createEAttribute(preisEClass, PREIS__WAEHRUNG);

    mengeEClass = createEClass(MENGE);

    anmerkungEClass = createEClass(ANMERKUNG);

    notizEClass = createEClass(NOTIZ);
    createEAttribute(notizEClass, NOTIZ__TEXT);

    bestimmteMengeEClass = createEClass(BESTIMMTE_MENGE);
    createEAttribute(bestimmteMengeEClass, BESTIMMTE_MENGE__BETRAG);
    createEAttribute(bestimmteMengeEClass, BESTIMMTE_MENGE__EINHEIT);

    unbestimmteMengeEClass = createEClass(UNBESTIMMTE_MENGE);
    createEAttribute(unbestimmteMengeEClass, UNBESTIMMTE_MENGE__MENGE);

    produktlisteEClass = createEClass(PRODUKTLISTE);
    createEAttribute(produktlisteEClass, PRODUKTLISTE__NAME);
    createEReference(produktlisteEClass, PRODUKTLISTE__PRODUKTE);

    lizenzEClass = createEClass(LIZENZ);
    createEAttribute(lizenzEClass, LIZENZ__TEXT);
    createEAttribute(lizenzEClass, LIZENZ__HINWEIS);

    autorEClass = createEClass(AUTOR);
    createEAttribute(autorEClass, AUTOR__VORNAME);
    createEAttribute(autorEClass, AUTOR__NACHNAME);
    createEAttribute(autorEClass, AUTOR__ORGANISATIONS_NAME);

    // Create enums
    modifikationsArtEEnum = createEEnum(MODIFIKATIONS_ART);
    kategorieArtEEnum = createEEnum(KATEGORIE_ART);
    verpackungEEnum = createEEnum(VERPACKUNG);
    stoffEEnum = createEEnum(STOFF);
    diaetArtEEnum = createEEnum(DIAET_ART);
    waehrungEEnum = createEEnum(WAEHRUNG);
    masseinheitEEnum = createEEnum(MASSEINHEIT);
    mengenAngabeEEnum = createEEnum(MENGEN_ANGABE);
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
    kommentarEClass.getESuperTypes().add(this.getNotiz());
    tippEClass.getESuperTypes().add(this.getNotiz());
    stoffTagEClass.getESuperTypes().add(this.getTag());
    benutzerTagEClass.getESuperTypes().add(this.getTag());
    diaetTagEClass.getESuperTypes().add(this.getTag());
    anmerkungEClass.getESuperTypes().add(this.getNotiz());
    bestimmteMengeEClass.getESuperTypes().add(this.getMenge());
    unbestimmteMengeEClass.getESuperTypes().add(this.getMenge());

    // Initialize classes and features; add operations and parameters
    initEClass(rezeptEClass, Rezept.class, "Rezept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRezept_Id(), ecorePackage.getEString(), "id", "1", 1, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Quelle(), this.getQuelle(), null, "quelle", null, 0, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Schritte(), this.getArbeitsschritt(), null, "schritte", null, 1, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Produkte(), this.getProduktRef(), null, "produkte", null, 0, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Zutaten(), this.getZutat(), null, "zutaten", null, 1, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_Titel(), ecorePackage.getEString(), "titel", null, 1, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_Untertitel(), ecorePackage.getEString(), "untertitel", null, 0, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_Kategorie(), this.getKategorieArt(), "kategorie", null, 1, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_LetzteAenderung(), ecorePackage.getEString(), "letzteAenderung", "\'01.01.2012\'", 1, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Tags(), this.getTag(), null, "tags", null, 1, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezept_Notizen(), this.getNotiz(), null, "notizen", null, 0, -1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRezept_Personen(), ecorePackage.getELongObject(), "personen", "0", 0, 1, Rezept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(produktImportEClass, ProduktImport.class, "ProduktImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProduktImport_ImportedResource(), this.getProduktliste(), null, "importedResource", null, 1, 1, ProduktImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(produktEClass, Produkt.class, "Produkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProdukt_Name(), ecorePackage.getEString(), "name", null, 1, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Verpackung(), this.getVerpackung(), "verpackung", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Ean(), ecorePackage.getEString(), "ean", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Uba(), ecorePackage.getEString(), "uba", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Handler(), ecorePackage.getEString(), "handler", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_Hersteller(), ecorePackage.getEString(), "hersteller", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProdukt_DatumLetzteAenderung(), ecorePackage.getEString(), "datumLetzteAenderung", "\'01.01.2012\'", 1, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProdukt_Preis(), this.getPreis(), null, "preis", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProdukt_Menge(), this.getMenge(), null, "menge", null, 1, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buchBeschreibungEClass, BuchBeschreibung.class, "BuchBeschreibung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuchBeschreibung_Titel(), ecorePackage.getEString(), "titel", null, 1, 1, BuchBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuchBeschreibung_Vorwort(), ecorePackage.getEString(), "vorwort", null, 0, 1, BuchBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuchBeschreibung_DatumPublished(), ecorePackage.getEString(), "datumPublished", null, 0, 1, BuchBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchBeschreibung_Lizenz(), this.getLizenz(), null, "lizenz", null, 0, 1, BuchBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchBeschreibung_Autoren(), this.getAutor(), null, "autoren", null, 1, -1, BuchBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchBeschreibung_Imports(), this.getRezeptImport(), null, "imports", null, 0, -1, BuchBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projektBeschreibungEClass, ProjektBeschreibung.class, "ProjektBeschreibung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjektBeschreibung_GroupId(), ecorePackage.getEString(), "groupId", null, 1, 1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProjektBeschreibung_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 1, 1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProjektBeschreibung_Version(), ecorePackage.getEString(), "version", null, 1, 1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjektBeschreibung_Buch(), this.getBuchBeschreibung(), null, "buch", null, 1, 1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProjektBeschreibung_ResourcesDir(), ecorePackage.getEString(), "resourcesDir", null, 1, 1, ProjektBeschreibung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quelleEClass, Quelle.class, "Quelle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuelle_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 1, 1, Quelle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuelle_ModifikationsArt(), this.getModifikationsArt(), "modifikationsArt", null, 1, 1, Quelle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arbeitsschrittEClass, Arbeitsschritt.class, "Arbeitsschritt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArbeitsschritt_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 1, 1, Arbeitsschritt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kommentarEClass, Kommentar.class, "Kommentar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(produktRefEClass, ProduktRef.class, "ProduktRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProduktRef_Menge(), ecorePackage.getEFloatObject(), "menge", "1.5", 1, 1, ProduktRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduktRef_Produkt(), this.getProdukt(), null, "produkt", null, 1, 1, ProduktRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(zutatEClass, Zutat.class, "Zutat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getZutat_Name(), ecorePackage.getEString(), "name", null, 1, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getZutat_Menge(), this.getMenge(), null, "menge", null, 1, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tippEClass, Tipp.class, "Tipp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rezeptImportEClass, RezeptImport.class, "RezeptImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRezeptImport_ImportedResource(), this.getRezeptliste(), null, "importedResource", null, 1, 1, RezeptImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagEClass, Tag.class, "Tag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stoffTagEClass, StoffTag.class, "StoffTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStoffTag_Stoff(), this.getStoff(), "stoff", null, 1, 1, StoffTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(benutzerTagEClass, BenutzerTag.class, "BenutzerTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBenutzerTag_Bezeichnung(), ecorePackage.getEString(), "bezeichnung", "defaultKategorie", 1, 1, BenutzerTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rezeptlisteEClass, Rezeptliste.class, "Rezeptliste", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRezeptliste_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rezeptliste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezeptliste_Rezepte(), this.getRezept(), null, "rezepte", null, 1, -1, Rezeptliste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRezeptliste_Imports(), this.getProduktImport(), null, "imports", null, 0, -1, Rezeptliste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diaetTagEClass, DiaetTag.class, "DiaetTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDiaetTag_Diaet(), this.getDiaetArt(), "diaet", null, 1, 1, DiaetTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preisEClass, Preis.class, "Preis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreis_Betrag(), ecorePackage.getEFloatObject(), "betrag", null, 1, 1, Preis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPreis_Waehrung(), this.getWaehrung(), "waehrung", null, 1, 1, Preis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mengeEClass, Menge.class, "Menge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anmerkungEClass, Anmerkung.class, "Anmerkung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notizEClass, Notiz.class, "Notiz", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNotiz_Text(), ecorePackage.getEString(), "text", null, 1, 1, Notiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bestimmteMengeEClass, BestimmteMenge.class, "BestimmteMenge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBestimmteMenge_Betrag(), ecorePackage.getEFloatObject(), "betrag", "1.5", 1, 1, BestimmteMenge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBestimmteMenge_Einheit(), this.getMasseinheit(), "einheit", null, 1, 1, BestimmteMenge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unbestimmteMengeEClass, UnbestimmteMenge.class, "UnbestimmteMenge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnbestimmteMenge_Menge(), this.getMengenAngabe(), "menge", null, 1, 1, UnbestimmteMenge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(produktlisteEClass, Produktliste.class, "Produktliste", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProduktliste_Name(), ecorePackage.getEString(), "name", null, 1, 1, Produktliste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduktliste_Produkte(), this.getProdukt(), null, "produkte", null, 1, -1, Produktliste.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lizenzEClass, Lizenz.class, "Lizenz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLizenz_Text(), ecorePackage.getEString(), "text", null, 0, 1, Lizenz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLizenz_Hinweis(), ecorePackage.getEString(), "hinweis", null, 1, 1, Lizenz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(autorEClass, Autor.class, "Autor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAutor_Vorname(), ecorePackage.getEString(), "vorname", null, 1, 1, Autor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAutor_Nachname(), ecorePackage.getEString(), "nachname", null, 1, 1, Autor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAutor_OrganisationsName(), ecorePackage.getEString(), "organisationsName", null, 0, 1, Autor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(modifikationsArtEEnum, ModifikationsArt.class, "ModifikationsArt");
    addEEnumLiteral(modifikationsArtEEnum, ModifikationsArt.ORIGINAL);
    addEEnumLiteral(modifikationsArtEEnum, ModifikationsArt.VERAENDERT);

    initEEnum(kategorieArtEEnum, KategorieArt.class, "KategorieArt");
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.SALAT);
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.KOCHEN);
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.BACKEN);
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.AUFLAUF);
    addEEnumLiteral(kategorieArtEEnum, KategorieArt.PIZZA);

    initEEnum(verpackungEEnum, Verpackung.class, "Verpackung");
    addEEnumLiteral(verpackungEEnum, Verpackung.PACKUNG);
    addEEnumLiteral(verpackungEEnum, Verpackung.DOSE);
    addEEnumLiteral(verpackungEEnum, Verpackung.BUECHSE);
    addEEnumLiteral(verpackungEEnum, Verpackung.BEUTEL);
    addEEnumLiteral(verpackungEEnum, Verpackung.STUECK);
    addEEnumLiteral(verpackungEEnum, Verpackung.GLAS);
    addEEnumLiteral(verpackungEEnum, Verpackung.FLASCHE);
    addEEnumLiteral(verpackungEEnum, Verpackung.BECHER);

    initEEnum(stoffEEnum, Stoff.class, "Stoff");
    addEEnumLiteral(stoffEEnum, Stoff.LAKTOSE);
    addEEnumLiteral(stoffEEnum, Stoff.FRUCHTZUCKER);
    addEEnumLiteral(stoffEEnum, Stoff.NUESSEN);

    initEEnum(diaetArtEEnum, DiaetArt.class, "DiaetArt");
    addEEnumLiteral(diaetArtEEnum, DiaetArt.LAKTOSEFREI);
    addEEnumLiteral(diaetArtEEnum, DiaetArt.FRUCHTZUCKERARM);

    initEEnum(waehrungEEnum, Waehrung.class, "Waehrung");
    addEEnumLiteral(waehrungEEnum, Waehrung.EURO);
    addEEnumLiteral(waehrungEEnum, Waehrung.MARK);
    addEEnumLiteral(waehrungEEnum, Waehrung.DM);

    initEEnum(masseinheitEEnum, Masseinheit.class, "Masseinheit");
    addEEnumLiteral(masseinheitEEnum, Masseinheit.PRISE);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.MESSERSPITZE);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.TEELOEFFEL);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.ESSLOEFFEL);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.GEHAEUFTER_ESSLOEFFEL);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.L);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.G);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.KG);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.STUECK);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.TASSE);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.BECHER);
    addEEnumLiteral(masseinheitEEnum, Masseinheit.ML);

    initEEnum(mengenAngabeEEnum, MengenAngabe.class, "MengenAngabe");
    addEEnumLiteral(mengenAngabeEEnum, MengenAngabe.ETWAS);
    addEEnumLiteral(mengenAngabeEEnum, MengenAngabe.WENIG);
    addEEnumLiteral(mengenAngabeEEnum, MengenAngabe.EINIGE);
    addEEnumLiteral(mengenAngabeEEnum, MengenAngabe.REICHLICH);
    addEEnumLiteral(mengenAngabeEEnum, MengenAngabe.NACH_BEDARF);

    // Create resource
    createResource(eNS_URI);
  }

} //RezeptPackageImpl
