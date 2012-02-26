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
 * A representation of the literals of the enumeration '<em><b>Diaet Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getDiaetArt()
 * @model
 * @generated
 */
public enum DiaetArt implements Enumerator
{
  /**
   * The '<em><b>Laktosefrei</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LAKTOSEFREI_VALUE
   * @generated
   * @ordered
   */
  LAKTOSEFREI(0, "Laktosefrei", "Laktosefrei"),

  /**
   * The '<em><b>Fruchtzuckerarm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRUCHTZUCKERARM_VALUE
   * @generated
   * @ordered
   */
  FRUCHTZUCKERARM(1, "Fruchtzuckerarm", "Fruchtzuckerarm");

  /**
   * The '<em><b>Laktosefrei</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Laktosefrei</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LAKTOSEFREI
   * @model name="Laktosefrei"
   * @generated
   * @ordered
   */
  public static final int LAKTOSEFREI_VALUE = 0;

  /**
   * The '<em><b>Fruchtzuckerarm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fruchtzuckerarm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRUCHTZUCKERARM
   * @model name="Fruchtzuckerarm"
   * @generated
   * @ordered
   */
  public static final int FRUCHTZUCKERARM_VALUE = 1;

  /**
   * An array of all the '<em><b>Diaet Art</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DiaetArt[] VALUES_ARRAY =
    new DiaetArt[]
    {
      LAKTOSEFREI,
      FRUCHTZUCKERARM,
    };

  /**
   * A public read-only list of all the '<em><b>Diaet Art</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DiaetArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Diaet Art</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DiaetArt get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DiaetArt result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Diaet Art</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DiaetArt getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DiaetArt result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Diaet Art</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DiaetArt get(int value)
  {
    switch (value)
    {
      case LAKTOSEFREI_VALUE: return LAKTOSEFREI;
      case FRUCHTZUCKERARM_VALUE: return FRUCHTZUCKERARM;
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
  private DiaetArt(int value, String name, String literal)
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
  
} //DiaetArt
