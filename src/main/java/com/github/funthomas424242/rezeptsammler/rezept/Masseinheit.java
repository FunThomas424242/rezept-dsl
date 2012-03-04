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
 * A representation of the literals of the enumeration '<em><b>Masseinheit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getMasseinheit()
 * @model
 * @generated
 */
public enum Masseinheit implements Enumerator
{
  /**
   * The '<em><b>Prise</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRISE_VALUE
   * @generated
   * @ordered
   */
  PRISE(0, "Prise", "Prise"),

  /**
   * The '<em><b>Messerspitze</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MESSERSPITZE_VALUE
   * @generated
   * @ordered
   */
  MESSERSPITZE(1, "Messerspitze", "Messerspitze"),

  /**
   * The '<em><b>Teeloeffel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEELOEFFEL_VALUE
   * @generated
   * @ordered
   */
  TEELOEFFEL(2, "Teeloeffel", "Teeloeffel"),

  /**
   * The '<em><b>Gehaeufter Essloeffel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GEHAEUFTER_ESSLOEFFEL_VALUE
   * @generated
   * @ordered
   */
  GEHAEUFTER_ESSLOEFFEL(3, "gehaeufterEssloeffel", "gehaeufterEssloeffel"),

  /**
   * The '<em><b>L</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #L_VALUE
   * @generated
   * @ordered
   */
  L(4, "L", "L"),

  /**
   * The '<em><b>G</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #G_VALUE
   * @generated
   * @ordered
   */
  G(5, "g", "g"),

  /**
   * The '<em><b>Kg</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KG_VALUE
   * @generated
   * @ordered
   */
  KG(6, "kg", "kg"),

  /**
   * The '<em><b>Stueck</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STUECK_VALUE
   * @generated
   * @ordered
   */
  STUECK(7, "stueck", "St\u00fcck");

  /**
   * The '<em><b>Prise</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Prise</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRISE
   * @model name="Prise"
   * @generated
   * @ordered
   */
  public static final int PRISE_VALUE = 0;

  /**
   * The '<em><b>Messerspitze</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Messerspitze</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MESSERSPITZE
   * @model name="Messerspitze"
   * @generated
   * @ordered
   */
  public static final int MESSERSPITZE_VALUE = 1;

  /**
   * The '<em><b>Teeloeffel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Teeloeffel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEELOEFFEL
   * @model name="Teeloeffel"
   * @generated
   * @ordered
   */
  public static final int TEELOEFFEL_VALUE = 2;

  /**
   * The '<em><b>Gehaeufter Essloeffel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Gehaeufter Essloeffel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GEHAEUFTER_ESSLOEFFEL
   * @model name="gehaeufterEssloeffel"
   * @generated
   * @ordered
   */
  public static final int GEHAEUFTER_ESSLOEFFEL_VALUE = 3;

  /**
   * The '<em><b>L</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>L</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #L
   * @model
   * @generated
   * @ordered
   */
  public static final int L_VALUE = 4;

  /**
   * The '<em><b>G</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #G
   * @model name="g"
   * @generated
   * @ordered
   */
  public static final int G_VALUE = 5;

  /**
   * The '<em><b>Kg</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Kg</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #KG
   * @model name="kg"
   * @generated
   * @ordered
   */
  public static final int KG_VALUE = 6;

  /**
   * The '<em><b>Stueck</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stueck</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STUECK
   * @model name="stueck" literal="St\374ck"
   * @generated
   * @ordered
   */
  public static final int STUECK_VALUE = 7;

  /**
   * An array of all the '<em><b>Masseinheit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Masseinheit[] VALUES_ARRAY =
    new Masseinheit[]
    {
      PRISE,
      MESSERSPITZE,
      TEELOEFFEL,
      GEHAEUFTER_ESSLOEFFEL,
      L,
      G,
      KG,
      STUECK,
    };

  /**
   * A public read-only list of all the '<em><b>Masseinheit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Masseinheit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Masseinheit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Masseinheit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Masseinheit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Masseinheit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Masseinheit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Masseinheit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Masseinheit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Masseinheit get(int value)
  {
    switch (value)
    {
      case PRISE_VALUE: return PRISE;
      case MESSERSPITZE_VALUE: return MESSERSPITZE;
      case TEELOEFFEL_VALUE: return TEELOEFFEL;
      case GEHAEUFTER_ESSLOEFFEL_VALUE: return GEHAEUFTER_ESSLOEFFEL;
      case L_VALUE: return L;
      case G_VALUE: return G;
      case KG_VALUE: return KG;
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
  private Masseinheit(int value, String name, String literal)
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
  
} //Masseinheit
