/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kategorie Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getKategorieArt()
 * @model
 * @generated
 */
public enum KategorieArt implements Enumerator
{
  /**
   * The '<em><b>Salat</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SALAT_VALUE
   * @generated
   * @ordered
   */
  SALAT(0, "Salat", "Salat"),

  /**
   * The '<em><b>Kochen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KOCHEN_VALUE
   * @generated
   * @ordered
   */
  KOCHEN(1, "Kochen", "Kochen"),

  /**
   * The '<em><b>Backen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BACKEN_VALUE
   * @generated
   * @ordered
   */
  BACKEN(2, "Backen", "Backen"),

  /**
   * The '<em><b>Auflauf</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUFLAUF_VALUE
   * @generated
   * @ordered
   */
  AUFLAUF(3, "Auflauf", "Auflauf"), /**
   * The '<em><b>Pizza</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PIZZA_VALUE
   * @generated
   * @ordered
   */
  PIZZA(4, "Pizza", "Pizza"), /**
   * The '<em><b>Asiatisch</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASIATISCH_VALUE
   * @generated
   * @ordered
   */
  ASIATISCH(5, "Asiatisch", "Asiatisch"), /**
   * The '<em><b>Nudeln</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUDELN_VALUE
   * @generated
   * @ordered
   */
  NUDELN(6, "Nudeln", "Nudeln");

  /**
   * The '<em><b>Salat</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Salat</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SALAT
   * @model name="Salat"
   * @generated
   * @ordered
   */
  public static final int SALAT_VALUE = 0;

  /**
   * The '<em><b>Kochen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Kochen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #KOCHEN
   * @model name="Kochen"
   * @generated
   * @ordered
   */
  public static final int KOCHEN_VALUE = 1;

  /**
   * The '<em><b>Backen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Backen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BACKEN
   * @model name="Backen"
   * @generated
   * @ordered
   */
  public static final int BACKEN_VALUE = 2;

  /**
   * The '<em><b>Auflauf</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Auflauf</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUFLAUF
   * @model name="Auflauf"
   * @generated
   * @ordered
   */
  public static final int AUFLAUF_VALUE = 3;

  /**
   * The '<em><b>Pizza</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pizza</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PIZZA
   * @model name="Pizza"
   * @generated
   * @ordered
   */
  public static final int PIZZA_VALUE = 4;

  /**
   * The '<em><b>Asiatisch</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Asiatisch</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASIATISCH
   * @model name="Asiatisch"
   * @generated
   * @ordered
   */
  public static final int ASIATISCH_VALUE = 5;

  /**
   * The '<em><b>Nudeln</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nudeln</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUDELN
   * @model name="Nudeln"
   * @generated
   * @ordered
   */
  public static final int NUDELN_VALUE = 6;

  /**
   * An array of all the '<em><b>Kategorie Art</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final KategorieArt[] VALUES_ARRAY =
    new KategorieArt[]
    {
      SALAT,
      KOCHEN,
      BACKEN,
      AUFLAUF,
      PIZZA,
      ASIATISCH,
      NUDELN,
    };

  /**
   * A public read-only list of all the '<em><b>Kategorie Art</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<KategorieArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Kategorie Art</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KategorieArt get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KategorieArt result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Kategorie Art</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KategorieArt getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KategorieArt result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Kategorie Art</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KategorieArt get(int value)
  {
    switch (value)
    {
      case SALAT_VALUE: return SALAT;
      case KOCHEN_VALUE: return KOCHEN;
      case BACKEN_VALUE: return BACKEN;
      case AUFLAUF_VALUE: return AUFLAUF;
      case PIZZA_VALUE: return PIZZA;
      case ASIATISCH_VALUE: return ASIATISCH;
      case NUDELN_VALUE: return NUDELN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private KategorieArt(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //KategorieArt
