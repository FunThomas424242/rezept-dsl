/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept.util;

import com.github.funthomas424242.rezeptsammler.rezept.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage
 * @generated
 */
public class RezeptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RezeptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RezeptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RezeptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RezeptSwitch<Adapter> modelSwitch =
    new RezeptSwitch<Adapter>()
    {
      @Override
      public Adapter caseRezept(Rezept object)
      {
        return createRezeptAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseProdukt(Produkt object)
      {
        return createProduktAdapter();
      }
      @Override
      public Adapter caseProjektBeschreibung(ProjektBeschreibung object)
      {
        return createProjektBeschreibungAdapter();
      }
      @Override
      public Adapter caseQuelle(Quelle object)
      {
        return createQuelleAdapter();
      }
      @Override
      public Adapter caseArbeitsschritt(Arbeitsschritt object)
      {
        return createArbeitsschrittAdapter();
      }
      @Override
      public Adapter caseTipp(Tipp object)
      {
        return createTippAdapter();
      }
      @Override
      public Adapter caseRank(Rank object)
      {
        return createRankAdapter();
      }
      @Override
      public Adapter caseProduktRef(ProduktRef object)
      {
        return createProduktRefAdapter();
      }
      @Override
      public Adapter caseZutat(Zutat object)
      {
        return createZutatAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseRezeptModel(RezeptModel object)
      {
        return createRezeptModelAdapter();
      }
      @Override
      public Adapter caseKategorie(Kategorie object)
      {
        return createKategorieAdapter();
      }
      @Override
      public Adapter caseAlergene(Alergene object)
      {
        return createAlergeneAdapter();
      }
      @Override
      public Adapter caseMetadaten(Metadaten object)
      {
        return createMetadatenAdapter();
      }
      @Override
      public Adapter caseStandardKategorie(StandardKategorie object)
      {
        return createStandardKategorieAdapter();
      }
      @Override
      public Adapter caseBenutzerKategorie(BenutzerKategorie object)
      {
        return createBenutzerKategorieAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Rezept <em>Rezept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rezept
   * @generated
   */
  public Adapter createRezeptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt <em>Produkt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Produkt
   * @generated
   */
  public Adapter createProduktAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung <em>Projekt Beschreibung</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung
   * @generated
   */
  public Adapter createProjektBeschreibungAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Quelle <em>Quelle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Quelle
   * @generated
   */
  public Adapter createQuelleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt <em>Arbeitsschritt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt
   * @generated
   */
  public Adapter createArbeitsschrittAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Tipp <em>Tipp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Tipp
   * @generated
   */
  public Adapter createTippAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Rank <em>Rank</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Rank
   * @generated
   */
  public Adapter createRankAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.ProduktRef <em>Produkt Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.ProduktRef
   * @generated
   */
  public Adapter createProduktRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Zutat <em>Zutat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Zutat
   * @generated
   */
  public Adapter createZutatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.RezeptModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptModel
   * @generated
   */
  public Adapter createRezeptModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Kategorie <em>Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Kategorie
   * @generated
   */
  public Adapter createKategorieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Alergene <em>Alergene</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Alergene
   * @generated
   */
  public Adapter createAlergeneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.Metadaten <em>Metadaten</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Metadaten
   * @generated
   */
  public Adapter createMetadatenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie <em>Standard Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.StandardKategorie
   * @generated
   */
  public Adapter createStandardKategorieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rezeptsammler.rezept.BenutzerKategorie <em>Benutzer Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rezeptsammler.rezept.BenutzerKategorie
   * @generated
   */
  public Adapter createBenutzerKategorieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RezeptAdapterFactory
