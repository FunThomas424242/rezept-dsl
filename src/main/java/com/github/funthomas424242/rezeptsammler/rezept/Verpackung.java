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
 * A representation of the literals of the enumeration '<em><b>Verpackung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getVerpackung()
 * @model
 * @generated
 */
public enum Verpackung implements Enumerator
{
  /**
   * The '<em><b>Packung</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PACKUNG_VALUE
   * @generated
   * @ordered
   */
  PACKUNG(0, "Packung", "Packung"),

  /**
   * The '<em><b>Dose</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOSE_VALUE
   * @generated
   * @ordered
   */
  DOSE(1, "Dose", "Dose"),

  /**
   * The '<em><b>Buechse</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUECHSE_VALUE
   * @generated
   * @ordered
   */
  BUECHSE(2, "Buechse", "Buechse"),

  /**
   * The '<em><b>Beutel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEUTEL_VALUE
   * @generated
   * @ordered
   */
  BEUTEL(3, "Beutel", "Beutel"),

  /**
   * The '<em><b>Stueck</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STUECK_VALUE
   * @generated
   * @ordered
   */
  STUECK(4, "Stueck", "Stueck");

  /**
   * The '<em><b>Packung</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Packung</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PACKUNG
   * @model name="Packung"
   * @generated
   * @ordered
   */
  public static final int PACKUNG_VALUE = 0;

  /**
   * The '<em><b>Dose</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dose</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOSE
   * @model name="Dose"
   * @generated
   * @ordered
   */
  public static final int DOSE_VALUE = 1;

  /**
   * The '<em><b>Buechse</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Buechse</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUECHSE
   * @model name="Buechse"
   * @generated
   * @ordered
   */
  public static final int BUECHSE_VALUE = 2;

  /**
   * The '<em><b>Beutel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beutel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEUTEL
   * @model name="Beutel"
   * @generated
   * @ordered
   */
  public static final int BEUTEL_VALUE = 3;

  /**
   * The '<em><b>Stueck</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stueck</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STUECK
   * @model name="Stueck"
   * @generated
   * @ordered
   */
  public static final int STUECK_VALUE = 4;

  /**
   * An array of all the '<em><b>Verpackung</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Verpackung[] VALUES_ARRAY =
    new Verpackung[]
    {
      PACKUNG,
      DOSE,
      BUECHSE,
      BEUTEL,
      STUECK,
    };

  /**
   * A public read-only list of all the '<em><b>Verpackung</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Verpackung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Verpackung</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Verpackung get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Verpackung result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Verpackung</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Verpackung getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Verpackung result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Verpackung</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Verpackung get(int value)
  {
    switch (value)
    {
      case PACKUNG_VALUE: return PACKUNG;
      case DOSE_VALUE: return DOSE;
      case BUECHSE_VALUE: return BUECHSE;
      case BEUTEL_VALUE: return BEUTEL;
      case STUECK_VALUE: return STUECK;
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
  private Verpackung(int value, String name, String literal)
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
  
} //Verpackung
