/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rezeptsammler.rezept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getName <em>Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getVerpackung <em>Verpackung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getEan <em>Ean</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getUba <em>Uba</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHandler <em>Handler</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getDatumLetzteAenderung <em>Datum Letzte Aenderung</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getPreis <em>Preis</em>}</li>
 *   <li>{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getMenge <em>Menge</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt()
 * @model
 * @generated
 */
public interface Produkt extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Verpackung</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.rezeptsammler.rezept.Verpackung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verpackung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verpackung</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Verpackung
   * @see #setVerpackung(Verpackung)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Verpackung()
   * @model
   * @generated
   */
  Verpackung getVerpackung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getVerpackung <em>Verpackung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verpackung</em>' attribute.
   * @see com.github.funthomas424242.rezeptsammler.rezept.Verpackung
   * @see #getVerpackung()
   * @generated
   */
  void setVerpackung(Verpackung value);

  /**
   * Returns the value of the '<em><b>Ean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ean</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ean</em>' attribute.
   * @see #setEan(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Ean()
   * @model
   * @generated
   */
  String getEan();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getEan <em>Ean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ean</em>' attribute.
   * @see #getEan()
   * @generated
   */
  void setEan(String value);

  /**
   * Returns the value of the '<em><b>Uba</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uba</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uba</em>' attribute.
   * @see #setUba(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Uba()
   * @model
   * @generated
   */
  String getUba();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getUba <em>Uba</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uba</em>' attribute.
   * @see #getUba()
   * @generated
   */
  void setUba(String value);

  /**
   * Returns the value of the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handler</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler</em>' attribute.
   * @see #setHandler(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Handler()
   * @model
   * @generated
   */
  String getHandler();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHandler <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handler</em>' attribute.
   * @see #getHandler()
   * @generated
   */
  void setHandler(String value);

  /**
   * Returns the value of the '<em><b>Hersteller</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hersteller</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hersteller</em>' attribute.
   * @see #setHersteller(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Hersteller()
   * @model
   * @generated
   */
  String getHersteller();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getHersteller <em>Hersteller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hersteller</em>' attribute.
   * @see #getHersteller()
   * @generated
   */
  void setHersteller(String value);

  /**
   * Returns the value of the '<em><b>Datum Letzte Aenderung</b></em>' attribute.
   * The default value is <code>"\'01.01.2012\'"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datum Letzte Aenderung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datum Letzte Aenderung</em>' attribute.
   * @see #setDatumLetzteAenderung(String)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_DatumLetzteAenderung()
   * @model default="\'01.01.2012\'" required="true"
   * @generated
   */
  String getDatumLetzteAenderung();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getDatumLetzteAenderung <em>Datum Letzte Aenderung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datum Letzte Aenderung</em>' attribute.
   * @see #getDatumLetzteAenderung()
   * @generated
   */
  void setDatumLetzteAenderung(String value);

  /**
   * Returns the value of the '<em><b>Preis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preis</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preis</em>' containment reference.
   * @see #setPreis(Preis)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Preis()
   * @model containment="true"
   * @generated
   */
  Preis getPreis();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getPreis <em>Preis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preis</em>' containment reference.
   * @see #getPreis()
   * @generated
   */
  void setPreis(Preis value);

  /**
   * Returns the value of the '<em><b>Menge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menge</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menge</em>' containment reference.
   * @see #setMenge(Menge)
   * @see com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage#getProdukt_Menge()
   * @model containment="true" required="true"
   * @generated
   */
  Menge getMenge();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rezeptsammler.rezept.Produkt#getMenge <em>Menge</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menge</em>' containment reference.
   * @see #getMenge()
   * @generated
   */
  void setMenge(Menge value);

} // Produkt
