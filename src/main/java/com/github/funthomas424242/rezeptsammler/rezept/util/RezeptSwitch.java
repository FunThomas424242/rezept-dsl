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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PRODUKT_IMPORT:
      {
        ProduktImport produktImport = (ProduktImport)theEObject;
        T result = caseProduktImport(produktImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PRODUKT:
      {
        Produkt produkt = (Produkt)theEObject;
        T result = caseProdukt(produkt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.BUCH_BESCHREIBUNG:
      {
        BuchBeschreibung buchBeschreibung = (BuchBeschreibung)theEObject;
        T result = caseBuchBeschreibung(buchBeschreibung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PROJEKT_BESCHREIBUNG:
      {
        ProjektBeschreibung projektBeschreibung = (ProjektBeschreibung)theEObject;
        T result = caseProjektBeschreibung(projektBeschreibung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.LITERATURQUELLE:
      {
        Literaturquelle literaturquelle = (Literaturquelle)theEObject;
        T result = caseLiteraturquelle(literaturquelle);
        if (result == null) result = caseQuelle(literaturquelle);
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
      case RezeptPackage.KOMMENTAR:
      {
        Kommentar kommentar = (Kommentar)theEObject;
        T result = caseKommentar(kommentar);
        if (result == null) result = caseNotiz(kommentar);
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
      case RezeptPackage.TIPP:
      {
        Tipp tipp = (Tipp)theEObject;
        T result = caseTipp(tipp);
        if (result == null) result = caseNotiz(tipp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.REZEPT_IMPORT:
      {
        RezeptImport rezeptImport = (RezeptImport)theEObject;
        T result = caseRezeptImport(rezeptImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.TAG:
      {
        Tag tag = (Tag)theEObject;
        T result = caseTag(tag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.STOFF_TAG:
      {
        StoffTag stoffTag = (StoffTag)theEObject;
        T result = caseStoffTag(stoffTag);
        if (result == null) result = caseTag(stoffTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.BENUTZER_TAG:
      {
        BenutzerTag benutzerTag = (BenutzerTag)theEObject;
        T result = caseBenutzerTag(benutzerTag);
        if (result == null) result = caseTag(benutzerTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.REZEPTLISTE:
      {
        Rezeptliste rezeptliste = (Rezeptliste)theEObject;
        T result = caseRezeptliste(rezeptliste);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.DIAET_TAG:
      {
        DiaetTag diaetTag = (DiaetTag)theEObject;
        T result = caseDiaetTag(diaetTag);
        if (result == null) result = caseTag(diaetTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PREIS:
      {
        Preis preis = (Preis)theEObject;
        T result = casePreis(preis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.MENGE:
      {
        Menge menge = (Menge)theEObject;
        T result = caseMenge(menge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.ANMERKUNG:
      {
        Anmerkung anmerkung = (Anmerkung)theEObject;
        T result = caseAnmerkung(anmerkung);
        if (result == null) result = caseNotiz(anmerkung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.NOTIZ:
      {
        Notiz notiz = (Notiz)theEObject;
        T result = caseNotiz(notiz);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.BESTIMMTE_MENGE:
      {
        BestimmteMenge bestimmteMenge = (BestimmteMenge)theEObject;
        T result = caseBestimmteMenge(bestimmteMenge);
        if (result == null) result = caseMenge(bestimmteMenge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.UNBESTIMMTE_MENGE:
      {
        UnbestimmteMenge unbestimmteMenge = (UnbestimmteMenge)theEObject;
        T result = caseUnbestimmteMenge(unbestimmteMenge);
        if (result == null) result = caseMenge(unbestimmteMenge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PRODUKTLISTE:
      {
        Produktliste produktliste = (Produktliste)theEObject;
        T result = caseProduktliste(produktliste);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.LIZENZ:
      {
        Lizenz lizenz = (Lizenz)theEObject;
        T result = caseLizenz(lizenz);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.AUTOR:
      {
        Autor autor = (Autor)theEObject;
        T result = caseAutor(autor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RezeptPackage.PERSONENQUELLE:
      {
        Personenquelle personenquelle = (Personenquelle)theEObject;
        T result = casePersonenquelle(personenquelle);
        if (result == null) result = caseQuelle(personenquelle);
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
      case RezeptPackage.BILD:
      {
        Bild bild = (Bild)theEObject;
        T result = caseBild(bild);
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
   * Returns the result of interpreting the object as an instance of '<em>Produkt Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Produkt Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduktImport(ProduktImport object)
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
   * Returns the result of interpreting the object as an instance of '<em>Literaturquelle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literaturquelle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteraturquelle(Literaturquelle object)
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
   * Returns the result of interpreting the object as an instance of '<em>Bild</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bild</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBild(Bild object)
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
  public T caseRezeptImport(RezeptImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kommentar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kommentar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKommentar(Kommentar object)
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
   * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTag(Tag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stoff Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stoff Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoffTag(StoffTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Benutzer Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Benutzer Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBenutzerTag(BenutzerTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rezeptliste</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rezeptliste</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRezeptliste(Rezeptliste object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diaet Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diaet Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiaetTag(DiaetTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreis(Preis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenge(Menge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Buch Beschreibung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Buch Beschreibung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuchBeschreibung(BuchBeschreibung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anmerkung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anmerkung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnmerkung(Anmerkung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Notiz</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Notiz</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotiz(Notiz object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bestimmte Menge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bestimmte Menge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBestimmteMenge(BestimmteMenge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unbestimmte Menge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unbestimmte Menge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnbestimmteMenge(UnbestimmteMenge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Produktliste</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Produktliste</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduktliste(Produktliste object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lizenz</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lizenz</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLizenz(Lizenz object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Autor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Autor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutor(Autor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personenquelle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personenquelle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonenquelle(Personenquelle object)
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
