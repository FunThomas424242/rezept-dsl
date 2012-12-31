/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.impl;

import com.github.funthomas424242.rezeptsammler.rezept.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RezeptFactoryImpl extends EFactoryImpl implements RezeptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RezeptFactory init()
  {
    try
    {
      RezeptFactory theRezeptFactory = (RezeptFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.github.com/funthomas424242/language/rezept"); 
      if (theRezeptFactory != null)
      {
        return theRezeptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RezeptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RezeptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RezeptPackage.REZEPT: return createRezept();
      case RezeptPackage.PRODUKT_IMPORT: return createProduktImport();
      case RezeptPackage.PRODUKT: return createProdukt();
      case RezeptPackage.BUCH_BESCHREIBUNG: return createBuchBeschreibung();
      case RezeptPackage.PROJEKT_BESCHREIBUNG: return createProjektBeschreibung();
      case RezeptPackage.LITERATURQUELLE: return createLiteraturquelle();
      case RezeptPackage.ARBEITSSCHRITT: return createArbeitsschritt();
      case RezeptPackage.KOMMENTAR: return createKommentar();
      case RezeptPackage.PRODUKT_REF: return createProduktRef();
      case RezeptPackage.ZUTAT: return createZutat();
      case RezeptPackage.TIPP: return createTipp();
      case RezeptPackage.REZEPT_IMPORT: return createRezeptImport();
      case RezeptPackage.STOFF_TAG: return createStoffTag();
      case RezeptPackage.BENUTZER_TAG: return createBenutzerTag();
      case RezeptPackage.REZEPTLISTE: return createRezeptliste();
      case RezeptPackage.DIAET_TAG: return createDiaetTag();
      case RezeptPackage.PREIS: return createPreis();
      case RezeptPackage.ANMERKUNG: return createAnmerkung();
      case RezeptPackage.BESTIMMTE_MENGE: return createBestimmteMenge();
      case RezeptPackage.UNBESTIMMTE_MENGE: return createUnbestimmteMenge();
      case RezeptPackage.PRODUKTLISTE: return createProduktliste();
      case RezeptPackage.LIZENZ: return createLizenz();
      case RezeptPackage.AUTOR: return createAutor();
      case RezeptPackage.PERSONENQUELLE: return createPersonenquelle();
      case RezeptPackage.BILD: return createBild();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RezeptPackage.MODIFIKATIONS_ART:
        return createModifikationsArtFromString(eDataType, initialValue);
      case RezeptPackage.KATEGORIE_ART:
        return createKategorieArtFromString(eDataType, initialValue);
      case RezeptPackage.VERPACKUNG:
        return createVerpackungFromString(eDataType, initialValue);
      case RezeptPackage.STOFF:
        return createStoffFromString(eDataType, initialValue);
      case RezeptPackage.DIAET_ART:
        return createDiaetArtFromString(eDataType, initialValue);
      case RezeptPackage.WAEHRUNG:
        return createWaehrungFromString(eDataType, initialValue);
      case RezeptPackage.MASSEINHEIT:
        return createMasseinheitFromString(eDataType, initialValue);
      case RezeptPackage.MENGEN_ANGABE:
        return createMengenAngabeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RezeptPackage.MODIFIKATIONS_ART:
        return convertModifikationsArtToString(eDataType, instanceValue);
      case RezeptPackage.KATEGORIE_ART:
        return convertKategorieArtToString(eDataType, instanceValue);
      case RezeptPackage.VERPACKUNG:
        return convertVerpackungToString(eDataType, instanceValue);
      case RezeptPackage.STOFF:
        return convertStoffToString(eDataType, instanceValue);
      case RezeptPackage.DIAET_ART:
        return convertDiaetArtToString(eDataType, instanceValue);
      case RezeptPackage.WAEHRUNG:
        return convertWaehrungToString(eDataType, instanceValue);
      case RezeptPackage.MASSEINHEIT:
        return convertMasseinheitToString(eDataType, instanceValue);
      case RezeptPackage.MENGEN_ANGABE:
        return convertMengenAngabeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rezept createRezept()
  {
    RezeptImpl rezept = new RezeptImpl();
    return rezept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProduktImport createProduktImport()
  {
    ProduktImportImpl produktImport = new ProduktImportImpl();
    return produktImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Produkt createProdukt()
  {
    ProduktImpl produkt = new ProduktImpl();
    return produkt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjektBeschreibung createProjektBeschreibung()
  {
    ProjektBeschreibungImpl projektBeschreibung = new ProjektBeschreibungImpl();
    return projektBeschreibung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literaturquelle createLiteraturquelle()
  {
    LiteraturquelleImpl literaturquelle = new LiteraturquelleImpl();
    return literaturquelle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arbeitsschritt createArbeitsschritt()
  {
    ArbeitsschrittImpl arbeitsschritt = new ArbeitsschrittImpl();
    return arbeitsschritt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kommentar createKommentar()
  {
    KommentarImpl kommentar = new KommentarImpl();
    return kommentar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProduktRef createProduktRef()
  {
    ProduktRefImpl produktRef = new ProduktRefImpl();
    return produktRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Zutat createZutat()
  {
    ZutatImpl zutat = new ZutatImpl();
    return zutat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tipp createTipp()
  {
    TippImpl tipp = new TippImpl();
    return tipp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RezeptImport createRezeptImport()
  {
    RezeptImportImpl rezeptImport = new RezeptImportImpl();
    return rezeptImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoffTag createStoffTag()
  {
    StoffTagImpl stoffTag = new StoffTagImpl();
    return stoffTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenutzerTag createBenutzerTag()
  {
    BenutzerTagImpl benutzerTag = new BenutzerTagImpl();
    return benutzerTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rezeptliste createRezeptliste()
  {
    RezeptlisteImpl rezeptliste = new RezeptlisteImpl();
    return rezeptliste;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiaetTag createDiaetTag()
  {
    DiaetTagImpl diaetTag = new DiaetTagImpl();
    return diaetTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preis createPreis()
  {
    PreisImpl preis = new PreisImpl();
    return preis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuchBeschreibung createBuchBeschreibung()
  {
    BuchBeschreibungImpl buchBeschreibung = new BuchBeschreibungImpl();
    return buchBeschreibung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anmerkung createAnmerkung()
  {
    AnmerkungImpl anmerkung = new AnmerkungImpl();
    return anmerkung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BestimmteMenge createBestimmteMenge()
  {
    BestimmteMengeImpl bestimmteMenge = new BestimmteMengeImpl();
    return bestimmteMenge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnbestimmteMenge createUnbestimmteMenge()
  {
    UnbestimmteMengeImpl unbestimmteMenge = new UnbestimmteMengeImpl();
    return unbestimmteMenge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Produktliste createProduktliste()
  {
    ProduktlisteImpl produktliste = new ProduktlisteImpl();
    return produktliste;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lizenz createLizenz()
  {
    LizenzImpl lizenz = new LizenzImpl();
    return lizenz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Autor createAutor()
  {
    AutorImpl autor = new AutorImpl();
    return autor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Personenquelle createPersonenquelle()
  {
    PersonenquelleImpl personenquelle = new PersonenquelleImpl();
    return personenquelle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bild createBild()
  {
    BildImpl bild = new BildImpl();
    return bild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifikationsArt createModifikationsArtFromString(EDataType eDataType, String initialValue)
  {
    ModifikationsArt result = ModifikationsArt.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertModifikationsArtToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KategorieArt createKategorieArtFromString(EDataType eDataType, String initialValue)
  {
    KategorieArt result = KategorieArt.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertKategorieArtToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verpackung createVerpackungFromString(EDataType eDataType, String initialValue)
  {
    Verpackung result = Verpackung.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVerpackungToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stoff createStoffFromString(EDataType eDataType, String initialValue)
  {
    Stoff result = Stoff.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStoffToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiaetArt createDiaetArtFromString(EDataType eDataType, String initialValue)
  {
    DiaetArt result = DiaetArt.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDiaetArtToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Waehrung createWaehrungFromString(EDataType eDataType, String initialValue)
  {
    Waehrung result = Waehrung.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWaehrungToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Masseinheit createMasseinheitFromString(EDataType eDataType, String initialValue)
  {
    Masseinheit result = Masseinheit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMasseinheitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MengenAngabe createMengenAngabeFromString(EDataType eDataType, String initialValue)
  {
    MengenAngabe result = MengenAngabe.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMengenAngabeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RezeptPackage getRezeptPackage()
  {
    return (RezeptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RezeptPackage getPackage()
  {
    return RezeptPackage.eINSTANCE;
  }

} //RezeptFactoryImpl
