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
      case RezeptPackage.PRODUKT: return createProdukt();
      case RezeptPackage.PROJEKT_BESCHREIBUNG: return createProjektBeschreibung();
      case RezeptPackage.QUELLE: return createQuelle();
      case RezeptPackage.ARBEITSSCHRITT: return createArbeitsschritt();
      case RezeptPackage.TIPP: return createTipp();
      case RezeptPackage.RANK: return createRank();
      case RezeptPackage.PRODUKT_REF: return createProduktRef();
      case RezeptPackage.ZUTAT: return createZutat();
      case RezeptPackage.IMPORT: return createImport();
      case RezeptPackage.REZEPT_MODEL: return createRezeptModel();
      case RezeptPackage.ALERGENE: return createAlergene();
      case RezeptPackage.STANDARD_KATEGORIE: return createStandardKategorie();
      case RezeptPackage.BENUTZER_KATEGORIE: return createBenutzerKategorie();
      case RezeptPackage.MODUL_BESCHREIBUNG: return createModulBeschreibung();
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
      case RezeptPackage.DATUM:
        return createDatumFromString(eDataType, initialValue);
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
      case RezeptPackage.DATUM:
        return convertDatumToString(eDataType, instanceValue);
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
  public Quelle createQuelle()
  {
    QuelleImpl quelle = new QuelleImpl();
    return quelle;
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
  public Rank createRank()
  {
    RankImpl rank = new RankImpl();
    return rank;
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
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RezeptModel createRezeptModel()
  {
    RezeptModelImpl rezeptModel = new RezeptModelImpl();
    return rezeptModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alergene createAlergene()
  {
    AlergeneImpl alergene = new AlergeneImpl();
    return alergene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StandardKategorie createStandardKategorie()
  {
    StandardKategorieImpl standardKategorie = new StandardKategorieImpl();
    return standardKategorie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenutzerKategorie createBenutzerKategorie()
  {
    BenutzerKategorieImpl benutzerKategorie = new BenutzerKategorieImpl();
    return benutzerKategorie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModulBeschreibung createModulBeschreibung()
  {
    ModulBeschreibungImpl modulBeschreibung = new ModulBeschreibungImpl();
    return modulBeschreibung;
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
  public String createDatumFromString(EDataType eDataType, String initialValue)
  {
    return (String)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDatumToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
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
