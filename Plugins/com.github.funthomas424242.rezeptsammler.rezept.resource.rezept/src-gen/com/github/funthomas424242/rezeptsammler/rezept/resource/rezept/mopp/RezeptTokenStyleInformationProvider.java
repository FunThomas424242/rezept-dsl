/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;


public class RezeptTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("DATUM".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x00, 0xFF, 0x00}, null, true, false, false, false);
		}
		if ("ID".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x40, 0x40, 0x40}, null, true, false, false, false);
		}
		if ("NUMBER".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x00, 0xFF, 0x00}, null, true, false, false, false);
		}
		if ("Rezept".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("import rezepte".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("import produkte".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Titel:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Untertitel:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Media Folder:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Kategorie:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Ausreichend f\\u00fcr".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Personen.".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Ver\\u00f6ffentlicht am:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Tag:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Di\\u00e4t:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Stoff:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ProduktRef:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Produkt".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RezeptSammlung".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("groupId".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("artifactId".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("version".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Letzte \\u00c4nderung:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Rezeptliste".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Produktliste".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Verpackung:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EAN:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UBA:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Preis:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("H\\u00e4ndler:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Hersteller:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Quelle:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("\\u00fcbernommen".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("\\u00fcberliefert".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("aus".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Aktion:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Tipp:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Bild:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Anmerkung:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Kommentar:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Zutat:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Menge:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mal.".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("siteURL".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Buch".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Vorwort:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Absatz:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Autor:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Vorname:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Nachname:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Organisation:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ModifikationsNotiz:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Lizenzhinweis:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Lizenztext:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("von".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Text:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Lizenz:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Urheber:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("URL:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FileName:".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("QUOTED_6161_6161".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
