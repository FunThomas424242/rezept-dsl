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
 * A representation of the literals of the enumeration '<em><b>Mengen Angabe</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getMengenAngabe()
 * @model
 * @generated
 */
public enum MengenAngabe implements Enumerator
{
  /**
   * The '<em><b>Etwas</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ETWAS_VALUE
   * @generated
   * @ordered
   */
  ETWAS(0, "etwas", "etwas"),

  /**
   * The '<em><b>Wenig</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WENIG_VALUE
   * @generated
   * @ordered
   */
  WENIG(1, "wenig", "wenig"),

  /**
   * The '<em><b>Einige</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EINIGE_VALUE
   * @generated
   * @ordered
   */
  EINIGE(2, "einige", "einige"),

  /**
   * The '<em><b>Reichlich</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REICHLICH_VALUE
   * @generated
   * @ordered
   */
  REICHLICH(3, "reichlich", "reichlich"), /**
   * The '<em><b>Nach Bedarf</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NACH_BEDARF_VALUE
   * @generated
   * @ordered
   */
  NACH_BEDARF(4, "nachBedarf", "nach Bedarf");

  /**
   * The '<em><b>Etwas</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Etwas</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ETWAS
   * @model name="etwas"
   * @generated
   * @ordered
   */
  public static final int ETWAS_VALUE = 0;

  /**
   * The '<em><b>Wenig</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Wenig</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WENIG
   * @model name="wenig"
   * @generated
   * @ordered
   */
  public static final int WENIG_VALUE = 1;

  /**
   * The '<em><b>Einige</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Einige</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EINIGE
   * @model name="einige"
   * @generated
   * @ordered
   */
  public static final int EINIGE_VALUE = 2;

  /**
   * The '<em><b>Reichlich</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reichlich</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REICHLICH
   * @model name="reichlich"
   * @generated
   * @ordered
   */
  public static final int REICHLICH_VALUE = 3;

  /**
   * The '<em><b>Nach Bedarf</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nach Bedarf</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NACH_BEDARF
   * @model name="nachBedarf" literal="nach Bedarf"
   * @generated
   * @ordered
   */
  public static final int NACH_BEDARF_VALUE = 4;

  /**
   * An array of all the '<em><b>Mengen Angabe</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MengenAngabe[] VALUES_ARRAY =
    new MengenAngabe[]
    {
      ETWAS,
      WENIG,
      EINIGE,
      REICHLICH,
      NACH_BEDARF,
    };

  /**
   * A public read-only list of all the '<em><b>Mengen Angabe</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MengenAngabe> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Mengen Angabe</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MengenAngabe get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MengenAngabe result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Mengen Angabe</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MengenAngabe getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MengenAngabe result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Mengen Angabe</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MengenAngabe get(int value)
  {
    switch (value)
    {
      case ETWAS_VALUE: return ETWAS;
      case WENIG_VALUE: return WENIG;
      case EINIGE_VALUE: return EINIGE;
      case REICHLICH_VALUE: return REICHLICH;
      case NACH_BEDARF_VALUE: return NACH_BEDARF;
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
  private MengenAngabe(int value, String name, String literal)
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
  
} //MengenAngabe
