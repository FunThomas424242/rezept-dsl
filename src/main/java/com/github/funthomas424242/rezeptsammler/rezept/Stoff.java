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
 * A representation of the literals of the enumeration '<em><b>Stoff</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getStoff()
 * @model
 * @generated
 */
public enum Stoff implements Enumerator
{
  /**
   * The '<em><b>Laktose</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LAKTOSE_VALUE
   * @generated
   * @ordered
   */
  LAKTOSE(0, "Laktose", "Laktose"),

  /**
   * The '<em><b>Fruchtzucker</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRUCHTZUCKER_VALUE
   * @generated
   * @ordered
   */
  FRUCHTZUCKER(1, "Fruchtzucker", "Fruchtzucker"),

  /**
   * The '<em><b>Nuessen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUESSEN_VALUE
   * @generated
   * @ordered
   */
  NUESSEN(2, "Nuessen", "Nuessen");

  /**
   * The '<em><b>Laktose</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Laktose</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LAKTOSE
   * @model name="Laktose"
   * @generated
   * @ordered
   */
  public static final int LAKTOSE_VALUE = 0;

  /**
   * The '<em><b>Fruchtzucker</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fruchtzucker</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRUCHTZUCKER
   * @model name="Fruchtzucker"
   * @generated
   * @ordered
   */
  public static final int FRUCHTZUCKER_VALUE = 1;

  /**
   * The '<em><b>Nuessen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nuessen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUESSEN
   * @model name="Nuessen"
   * @generated
   * @ordered
   */
  public static final int NUESSEN_VALUE = 2;

  /**
   * An array of all the '<em><b>Stoff</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Stoff[] VALUES_ARRAY =
    new Stoff[]
    {
      LAKTOSE,
      FRUCHTZUCKER,
      NUESSEN,
    };

  /**
   * A public read-only list of all the '<em><b>Stoff</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Stoff> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Stoff</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Stoff get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Stoff result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stoff</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Stoff getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Stoff result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stoff</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Stoff get(int value)
  {
    switch (value)
    {
      case LAKTOSE_VALUE: return LAKTOSE;
      case FRUCHTZUCKER_VALUE: return FRUCHTZUCKER;
      case NUESSEN_VALUE: return NUESSEN;
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
  private Stoff(int value, String name, String literal)
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
  
} //Stoff
