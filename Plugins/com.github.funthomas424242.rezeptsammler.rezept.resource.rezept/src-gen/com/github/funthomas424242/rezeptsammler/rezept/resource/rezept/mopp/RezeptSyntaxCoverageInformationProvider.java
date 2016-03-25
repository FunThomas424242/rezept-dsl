/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import org.eclipse.emf.ecore.EClass;

public class RezeptSyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAbsatz(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAutor(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLizenz(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptImport(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktImport(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPreis(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getStoffTag(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBenutzerTag(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getDiaetTag(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getZutat(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBestimmteMenge(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getUnbestimmteMenge(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getArbeitsschritt(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getTipp(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getKommentar(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAnmerkung(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLiteraturquelle(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPersonenquelle(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getInternetPfad(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLokalerPfad(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(),
		};
	}
	
}
