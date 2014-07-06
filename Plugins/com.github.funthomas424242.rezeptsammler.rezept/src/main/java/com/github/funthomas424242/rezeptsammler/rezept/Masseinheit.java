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
   * The '<em><b>Essloeffel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ESSLOEFFEL_VALUE
   * @generated
   * @ordered
   */
  ESSLOEFFEL(8, "Essloeffel", "Essl\u00f6ffel"), /**
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
  STUECK(7, "stueck", "St\u00fcck"), /**
   * The '<em><b>Tasse</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TASSE_VALUE
   * @generated
   * @ordered
   */
  TASSE(9, "Tasse", "Tasse"), /**
   * The '<em><b>Becher</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BECHER_VALUE
   * @generated
   * @ordered
   */
  BECHER(10, "Becher", "Becher"), /**
   * The '<em><b>Ml</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ML_VALUE
   * @generated
   * @ordered
   */
  ML(11, "ml", "ml"), /**
   * The '<em><b>Knolle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KNOLLE_VALUE
   * @generated
   * @ordered
   */
  KNOLLE(12, "Knolle", "Knolle"), /**
   * The '<em><b>Zehe</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZEHE_VALUE
   * @generated
   * @ordered
   */
  ZEHE(13, "Zehe", "Zehe"), /**
   * The '<em><b>Zehen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZEHEN_VALUE
   * @generated
   * @ordered
   */
  ZEHEN(14, "Zehen", "Zehen"), /**
   * The '<em><b>Scheibe</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCHEIBE_VALUE
   * @generated
   * @ordered
   */
  SCHEIBE(15, "Scheibe", "Scheibe"), /**
   * The '<em><b>Scheiben</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCHEIBEN_VALUE
   * @generated
   * @ordered
   */
  SCHEIBEN(16, "Scheiben", "Scheiben"), /**
   * The '<em><b>Stange</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STANGE_VALUE
   * @generated
   * @ordered
   */
  STANGE(17, "Stange", "Stange"), /**
   * The '<em><b>Stangen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STANGEN_VALUE
   * @generated
   * @ordered
   */
  STANGEN(18, "Stangen", "Stangen"), /**
   * The '<em><b>Bund</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUND_VALUE
   * @generated
   * @ordered
   */
  BUND(19, "Bund", "Bund"), /**
   * The '<em><b>Blatt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLATT_VALUE
   * @generated
   * @ordered
   */
  BLATT(20, "Blatt", "Blatt"), /**
   * The '<em><b>Tüte</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TÜTE_VALUE
   * @generated
   * @ordered
   */
  TÜTE(21, "Tüte", "T\u00fcte(n)"), /**
   * The '<em><b>Packungen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PACKUNGEN_VALUE
   * @generated
   * @ordered
   */
  PACKUNGEN(22, "Packungen", "Packung(en)"), /**
   * The '<em><b>Päckchen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PÄCKCHEN_VALUE
   * @generated
   * @ordered
   */
  PÄCKCHEN(23, "Päckchen", "P\u00e4ckchen"), /**
   * The '<em><b>Dose</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOSE_VALUE
   * @generated
   * @ordered
   */
  DOSE(24, "Dose", "Dose");

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
   * The '<em><b>Essloeffel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Essloeffel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ESSLOEFFEL
   * @model name="Essloeffel" literal="Essl\366ffel"
   * @generated
   * @ordered
   */
  public static final int ESSLOEFFEL_VALUE = 8;

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
   * The '<em><b>Tasse</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tasse</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TASSE
   * @model name="Tasse"
   * @generated
   * @ordered
   */
  public static final int TASSE_VALUE = 9;

  /**
   * The '<em><b>Becher</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Becher</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BECHER
   * @model name="Becher"
   * @generated
   * @ordered
   */
  public static final int BECHER_VALUE = 10;

  /**
   * The '<em><b>Ml</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ml</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ML
   * @model name="ml"
   * @generated
   * @ordered
   */
  public static final int ML_VALUE = 11;

  /**
   * The '<em><b>Knolle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Knolle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #KNOLLE
   * @model name="Knolle"
   * @generated
   * @ordered
   */
  public static final int KNOLLE_VALUE = 12;

  /**
   * The '<em><b>Zehe</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Zehe</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZEHE
   * @model name="Zehe"
   * @generated
   * @ordered
   */
  public static final int ZEHE_VALUE = 13;

  /**
   * The '<em><b>Zehen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Zehen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZEHEN
   * @model name="Zehen"
   * @generated
   * @ordered
   */
  public static final int ZEHEN_VALUE = 14;

  /**
   * The '<em><b>Scheibe</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Scheibe</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SCHEIBE
   * @model name="Scheibe"
   * @generated
   * @ordered
   */
  public static final int SCHEIBE_VALUE = 15;

  /**
   * The '<em><b>Scheiben</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Scheiben</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SCHEIBEN
   * @model name="Scheiben"
   * @generated
   * @ordered
   */
  public static final int SCHEIBEN_VALUE = 16;

  /**
   * The '<em><b>Stange</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stange</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STANGE
   * @model name="Stange"
   * @generated
   * @ordered
   */
  public static final int STANGE_VALUE = 17;

  /**
   * The '<em><b>Stangen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stangen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STANGEN
   * @model name="Stangen"
   * @generated
   * @ordered
   */
  public static final int STANGEN_VALUE = 18;

  /**
   * The '<em><b>Bund</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bund</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUND
   * @model name="Bund"
   * @generated
   * @ordered
   */
  public static final int BUND_VALUE = 19;

  /**
   * The '<em><b>Blatt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Blatt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLATT
   * @model name="Blatt"
   * @generated
   * @ordered
   */
  public static final int BLATT_VALUE = 20;

  /**
   * The '<em><b>Tüte</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tüte</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TÜTE
   * @model name="Tüte" literal="T\374te(n)"
   * @generated
   * @ordered
   */
  public static final int TÜTE_VALUE = 21;

  /**
   * The '<em><b>Packungen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Packungen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PACKUNGEN
   * @model name="Packungen" literal="Packung(en)"
   * @generated
   * @ordered
   */
  public static final int PACKUNGEN_VALUE = 22;

  /**
   * The '<em><b>Päckchen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Päckchen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PÄCKCHEN
   * @model name="Päckchen"
   * @generated
   * @ordered
   */
  public static final int PÄCKCHEN_VALUE = 23;

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
  public static final int DOSE_VALUE = 24;

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
      ESSLOEFFEL,
      GEHAEUFTER_ESSLOEFFEL,
      L,
      G,
      KG,
      STUECK,
      TASSE,
      BECHER,
      ML,
      KNOLLE,
      ZEHE,
      ZEHEN,
      SCHEIBE,
      SCHEIBEN,
      STANGE,
      STANGEN,
      BUND,
      BLATT,
      TÜTE,
      PACKUNGEN,
      PÄCKCHEN,
      DOSE,
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
      case ESSLOEFFEL_VALUE: return ESSLOEFFEL;
      case GEHAEUFTER_ESSLOEFFEL_VALUE: return GEHAEUFTER_ESSLOEFFEL;
      case L_VALUE: return L;
      case G_VALUE: return G;
      case KG_VALUE: return KG;
      case STUECK_VALUE: return STUECK;
      case TASSE_VALUE: return TASSE;
      case BECHER_VALUE: return BECHER;
      case ML_VALUE: return ML;
      case KNOLLE_VALUE: return KNOLLE;
      case ZEHE_VALUE: return ZEHE;
      case ZEHEN_VALUE: return ZEHEN;
      case SCHEIBE_VALUE: return SCHEIBE;
      case SCHEIBEN_VALUE: return SCHEIBEN;
      case STANGE_VALUE: return STANGE;
      case STANGEN_VALUE: return STANGEN;
      case BUND_VALUE: return BUND;
      case BLATT_VALUE: return BLATT;
      case TÜTE_VALUE: return TÜTE;
      case PACKUNGEN_VALUE: return PACKUNGEN;
      case PÄCKCHEN_VALUE: return PÄCKCHEN;
      case DOSE_VALUE: return DOSE;
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
