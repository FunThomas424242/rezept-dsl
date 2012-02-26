/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.util;

import com.github.funthomas424242.rezeptsammler.rezept.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage
 * @generated
 */
public class RezeptSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RezeptPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RezeptSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RezeptPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RezeptPackage.REZEPT:
      {
        Rezept rezept = (Rezept)theEObject;
        T result = caseRezept(rezept);
        if (result == null) result = caseModelElement(rezept);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PRODUKT:
      {
        Produkt produkt = (Produkt)theEObject;
        T result = caseProdukt(produkt);
        if (result == null) result = caseModelElement(produkt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PROJEKT_BESCHREIBUNG:
      {
        ProjektBeschreibung projektBeschreibung = (ProjektBeschreibung)theEObject;
        T result = caseProjektBeschreibung(projektBeschreibung);
        if (result == null) result = caseMetadaten(projektBeschreibung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.QUELLE:
      {
        Quelle quelle = (Quelle)theEObject;
        T result = caseQuelle(quelle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.ARBEITSSCHRITT:
      {
        Arbeitsschritt arbeitsschritt = (Arbeitsschritt)theEObject;
        T result = caseArbeitsschritt(arbeitsschritt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.TIPP:
      {
        Tipp tipp = (Tipp)theEObject;
        T result = caseTipp(tipp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.RANK:
      {
        Rank rank = (Rank)theEObject;
        T result = caseRank(rank);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PRODUKT_REF:
      {
        ProduktRef produktRef = (ProduktRef)theEObject;
        T result = caseProduktRef(produktRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.ZUTAT:
      {
        Zutat zutat = (Zutat)theEObject;
        T result = caseZutat(zutat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.REZEPT_MODEL:
      {
        RezeptModel rezeptModel = (RezeptModel)theEObject;
        T result = caseRezeptModel(rezeptModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.KATEGORIE:
      {
        Kategorie kategorie = (Kategorie)theEObject;
        T result = caseKategorie(kategorie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.ALERGENE:
      {
        Alergene alergene = (Alergene)theEObject;
        T result = caseAlergene(alergene);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.METADATEN:
      {
        Metadaten metadaten = (Metadaten)theEObject;
        T result = caseMetadaten(metadaten);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.STANDARD_KATEGORIE:
      {
        StandardKategorie standardKategorie = (StandardKategorie)theEObject;
        T result = caseStandardKategorie(standardKategorie);
        if (result == null) result = caseKategorie(standardKategorie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.BENUTZER_KATEGORIE:
      {
        BenutzerKategorie benutzerKategorie = (BenutzerKategorie)theEObject;
        T result = caseBenutzerKategorie(benutzerKategorie);
        if (result == null) result = caseKategorie(benutzerKategorie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.MODUL_BESCHREIBUNG:
      {
        ModulBeschreibung modulBeschreibung = (ModulBeschreibung)theEObject;
        T result = caseModulBeschreibung(modulBeschreibung);
        if (result == null) result = caseMetadaten(modulBeschreibung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rezept</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rezept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRezept(Rezept object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Produkt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Produkt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProdukt(Produkt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Projekt Beschreibung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Projekt Beschreibung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjektBeschreibung(ProjektBeschreibung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quelle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quelle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuelle(Quelle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arbeitsschritt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arbeitsschritt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArbeitsschritt(Arbeitsschritt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tipp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tipp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTipp(Tipp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rank</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rank</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRank(Rank object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Produkt Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Produkt Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduktRef(ProduktRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Zutat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zutat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZutat(Zutat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRezeptModel(RezeptModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kategorie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kategorie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKategorie(Kategorie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alergene</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alergene</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlergene(Alergene object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadaten</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadaten</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadaten(Metadaten object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Standard Kategorie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Standard Kategorie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStandardKategorie(StandardKategorie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Benutzer Kategorie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Benutzer Kategorie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBenutzerKategorie(BenutzerKategorie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modul Beschreibung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modul Beschreibung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModulBeschreibung(ModulBeschreibung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RezeptSwitch
