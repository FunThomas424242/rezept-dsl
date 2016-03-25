/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class RezeptGrammarInformationProvider {
	
	public final static EStructuralFeature ANONYMOUS_FEATURE = EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static RezeptGrammarInformationProvider INSTANCE = new RezeptGrammarInformationProvider();
	
	private Set<String> keywords;
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_0 = INSTANCE.getREZEPT_0_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("RezeptSammlung", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_1 = INSTANCE.getREZEPT_0_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("{", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_2 = INSTANCE.getREZEPT_0_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("groupId", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_3 = INSTANCE.getREZEPT_0_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("=", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_0_0_0_4 = INSTANCE.getREZEPT_0_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_0_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_5 = INSTANCE.getREZEPT_0_0_0_5();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_5() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_6 = INSTANCE.getREZEPT_0_0_0_6();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_6() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("artifactId", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_7 = INSTANCE.getREZEPT_0_0_0_7();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_7() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("=", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_0_0_0_8 = INSTANCE.getREZEPT_0_0_0_8();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_0_0_0_8() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_9 = INSTANCE.getREZEPT_0_0_0_9();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_9() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_10 = INSTANCE.getREZEPT_0_0_0_10();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_10() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("version", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_11 = INSTANCE.getREZEPT_0_0_0_11();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_11() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("=", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_0_0_0_12 = INSTANCE.getREZEPT_0_0_0_12();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_0_0_0_12() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_13 = INSTANCE.getREZEPT_0_0_0_13();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_13() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_14 = INSTANCE.getREZEPT_0_0_0_14();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_14() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Media Folder:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_0_0_0_15 = INSTANCE.getREZEPT_0_0_0_15();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_0_0_0_15() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_16 = INSTANCE.getREZEPT_0_0_0_16();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_16() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_17_0_0_0 = INSTANCE.getREZEPT_0_0_0_17_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_17_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("siteURL", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_17_0_0_1 = INSTANCE.getREZEPT_0_0_0_17_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_17_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("=", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_0_0_0_17_0_0_2 = INSTANCE.getREZEPT_0_0_0_17_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_0_0_0_17_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_17_0_0_3 = INSTANCE.getREZEPT_0_0_0_17_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_17_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_0_0_0_17_0_0 = INSTANCE.getREZEPT_0_0_0_17_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_0_0_0_17_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_0_0_0_17_0_0_0, REZEPT_0_0_0_17_0_0_1, REZEPT_0_0_0_17_0_0_2, REZEPT_0_0_0_17_0_0_3);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_0_0_0_17_0 = INSTANCE.getREZEPT_0_0_0_17_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_0_0_0_17_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_0_0_0_17_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_0_0_0_17 = INSTANCE.getREZEPT_0_0_0_17();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_0_0_0_17() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_0_0_0_17_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_0_0_0_18 = INSTANCE.getREZEPT_0_0_0_18();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_0_0_0_18() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("}", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_0_0_0_19 = INSTANCE.getREZEPT_0_0_0_19();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_0_0_0_19() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_0_0_0 = INSTANCE.getREZEPT_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_0_0_0_0, REZEPT_0_0_0_1, REZEPT_0_0_0_2, REZEPT_0_0_0_3, REZEPT_0_0_0_4, REZEPT_0_0_0_5, REZEPT_0_0_0_6, REZEPT_0_0_0_7, REZEPT_0_0_0_8, REZEPT_0_0_0_9, REZEPT_0_0_0_10, REZEPT_0_0_0_11, REZEPT_0_0_0_12, REZEPT_0_0_0_13, REZEPT_0_0_0_14, REZEPT_0_0_0_15, REZEPT_0_0_0_16, REZEPT_0_0_0_17, REZEPT_0_0_0_18, REZEPT_0_0_0_19);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_0_0 = INSTANCE.getREZEPT_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_0_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ProjektBeschreibung
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_0 = INSTANCE.getREZEPT_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung(), REZEPT_0_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_0 = INSTANCE.getREZEPT_1_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Buch", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_1 = INSTANCE.getREZEPT_1_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("{", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_1_0_0_2 = INSTANCE.getREZEPT_1_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_1_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptImport(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_3 = INSTANCE.getREZEPT_1_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Titel:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_1_0_0_4 = INSTANCE.getREZEPT_1_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_1_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__TITEL), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_5 = INSTANCE.getREZEPT_1_0_0_5();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_5() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_1_0_0_6 = INSTANCE.getREZEPT_1_0_0_6();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_1_0_0_6() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.PLUS, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAutor(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_7_0_0_0 = INSTANCE.getREZEPT_1_0_0_7_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_7_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Vorwort:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_1_0_0_7_0_0_1 = INSTANCE.getREZEPT_1_0_0_7_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_1_0_0_7_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__VORWORT), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_1_0_0_7_0_0_2 = INSTANCE.getREZEPT_1_0_0_7_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_1_0_0_7_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAbsatz(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_1_0_0_7_0_0 = INSTANCE.getREZEPT_1_0_0_7_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_1_0_0_7_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_1_0_0_7_0_0_0, REZEPT_1_0_0_7_0_0_1, REZEPT_1_0_0_7_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_1_0_0_7_0 = INSTANCE.getREZEPT_1_0_0_7_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_1_0_0_7_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_1_0_0_7_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_1_0_0_7 = INSTANCE.getREZEPT_1_0_0_7();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_1_0_0_7() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_1_0_0_7_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_1_0_0_8 = INSTANCE.getREZEPT_1_0_0_8();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_1_0_0_8() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLizenz(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_9_0_0_0 = INSTANCE.getREZEPT_1_0_0_9_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_9_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Ver\u00f6ffentlicht am:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_1_0_0_9_0_0_1 = INSTANCE.getREZEPT_1_0_0_9_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_1_0_0_9_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED), "DATUM", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_9_0_0_2 = INSTANCE.getREZEPT_1_0_0_9_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_9_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_1_0_0_9_0_0 = INSTANCE.getREZEPT_1_0_0_9_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_1_0_0_9_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_1_0_0_9_0_0_0, REZEPT_1_0_0_9_0_0_1, REZEPT_1_0_0_9_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_1_0_0_9_0 = INSTANCE.getREZEPT_1_0_0_9_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_1_0_0_9_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_1_0_0_9_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_1_0_0_9 = INSTANCE.getREZEPT_1_0_0_9();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_1_0_0_9() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_1_0_0_9_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_1_0_0_10 = INSTANCE.getREZEPT_1_0_0_10();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_1_0_0_10() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("}", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_1_0_0 = INSTANCE.getREZEPT_1_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_1_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_1_0_0_0, REZEPT_1_0_0_1, REZEPT_1_0_0_2, REZEPT_1_0_0_3, REZEPT_1_0_0_4, REZEPT_1_0_0_5, REZEPT_1_0_0_6, REZEPT_1_0_0_7, REZEPT_1_0_0_8, REZEPT_1_0_0_9, REZEPT_1_0_0_10);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_1_0 = INSTANCE.getREZEPT_1_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_1_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_1_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * BuchBeschreibung
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_1 = INSTANCE.getREZEPT_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), REZEPT_1_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_2_0_0_0 = INSTANCE.getREZEPT_2_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_2_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Absatz:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_2_0_0_1_0_0_0 = INSTANCE.getREZEPT_2_0_0_1_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_2_0_0_1_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAbsatz().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TITEL), "QUOTED_6161_6161", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_2_0_0_1_0_0 = INSTANCE.getREZEPT_2_0_0_1_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_2_0_0_1_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_2_0_0_1_0_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_2_0_0_1_0 = INSTANCE.getREZEPT_2_0_0_1_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_2_0_0_1_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_2_0_0_1_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_2_0_0_1 = INSTANCE.getREZEPT_2_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_2_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_2_0_0_1_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_2_0_0_2 = INSTANCE.getREZEPT_2_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_2_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAbsatz().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TEXT), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_2_0_0 = INSTANCE.getREZEPT_2_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_2_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_2_0_0_0, REZEPT_2_0_0_1, REZEPT_2_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_2_0 = INSTANCE.getREZEPT_2_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_2_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_2_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Absatz
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_2 = INSTANCE.getREZEPT_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAbsatz(), REZEPT_2_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_3_0_0_0 = INSTANCE.getREZEPT_3_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_3_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Autor:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_3_0_0_1 = INSTANCE.getREZEPT_3_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_3_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("{", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_3_0_0_2 = INSTANCE.getREZEPT_3_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_3_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Vorname:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_3_0_0_3 = INSTANCE.getREZEPT_3_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_3_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAutor().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__VORNAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_3_0_0_4 = INSTANCE.getREZEPT_3_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_3_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Nachname:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_3_0_0_5 = INSTANCE.getREZEPT_3_0_0_5();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_3_0_0_5() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAutor().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__NACHNAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_3_0_0_6_0_0_0 = INSTANCE.getREZEPT_3_0_0_6_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_3_0_0_6_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Organisation:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_3_0_0_6_0_0_1 = INSTANCE.getREZEPT_3_0_0_6_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_3_0_0_6_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAutor().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__ORGANISATIONS_NAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_3_0_0_6_0_0 = INSTANCE.getREZEPT_3_0_0_6_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_3_0_0_6_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_3_0_0_6_0_0_0, REZEPT_3_0_0_6_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_3_0_0_6_0 = INSTANCE.getREZEPT_3_0_0_6_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_3_0_0_6_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_3_0_0_6_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_3_0_0_6 = INSTANCE.getREZEPT_3_0_0_6();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_3_0_0_6() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_3_0_0_6_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_3_0_0_7 = INSTANCE.getREZEPT_3_0_0_7();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_3_0_0_7() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("ModifikationsNotiz:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_3_0_0_8 = INSTANCE.getREZEPT_3_0_0_8();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_3_0_0_8() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAutor().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_3_0_0_9 = INSTANCE.getREZEPT_3_0_0_9();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_3_0_0_9() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("}", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_3_0_0 = INSTANCE.getREZEPT_3_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_3_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_3_0_0_0, REZEPT_3_0_0_1, REZEPT_3_0_0_2, REZEPT_3_0_0_3, REZEPT_3_0_0_4, REZEPT_3_0_0_5, REZEPT_3_0_0_6, REZEPT_3_0_0_7, REZEPT_3_0_0_8, REZEPT_3_0_0_9);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_3_0 = INSTANCE.getREZEPT_3_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_3_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_3_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Autor
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_3 = INSTANCE.getREZEPT_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAutor(), REZEPT_3_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_4_0_0_0 = INSTANCE.getREZEPT_4_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_4_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Lizenzhinweis:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_4_0_0_1 = INSTANCE.getREZEPT_4_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_4_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLizenz().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__HINWEIS), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_4_0_0_2_0_0_0 = INSTANCE.getREZEPT_4_0_0_2_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_4_0_0_2_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Lizenztext:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_4_0_0_2_0_0_1 = INSTANCE.getREZEPT_4_0_0_2_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_4_0_0_2_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLizenz().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__TEXT), "TEXT", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_4_0_0_2_0_0 = INSTANCE.getREZEPT_4_0_0_2_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_4_0_0_2_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_4_0_0_2_0_0_0, REZEPT_4_0_0_2_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_4_0_0_2_0 = INSTANCE.getREZEPT_4_0_0_2_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_4_0_0_2_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_4_0_0_2_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_4_0_0_2 = INSTANCE.getREZEPT_4_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_4_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_4_0_0_2_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_4_0_0 = INSTANCE.getREZEPT_4_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_4_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_4_0_0_0, REZEPT_4_0_0_1, REZEPT_4_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_4_0 = INSTANCE.getREZEPT_4_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_4_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_4_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Lizenz
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_4 = INSTANCE.getREZEPT_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLizenz(), REZEPT_4_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_5_0_0_0 = INSTANCE.getREZEPT_5_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_5_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("import rezepte", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_5_0_0_1 = INSTANCE.getREZEPT_5_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_5_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptImport().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_5_0_0_2 = INSTANCE.getREZEPT_5_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_5_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_5_0_0 = INSTANCE.getREZEPT_5_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_5_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_5_0_0_0, REZEPT_5_0_0_1, REZEPT_5_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_5_0 = INSTANCE.getREZEPT_5_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_5_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_5_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class RezeptImport
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_5 = INSTANCE.getREZEPT_5();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_5() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptImport(), REZEPT_5_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_6_0_0_0 = INSTANCE.getREZEPT_6_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_6_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Rezeptliste", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_6_0_0_1 = INSTANCE.getREZEPT_6_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_6_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__NAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_6_0_0_2 = INSTANCE.getREZEPT_6_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_6_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_6_0_0_3 = INSTANCE.getREZEPT_6_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_6_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__IMPORTS), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktImport(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_6_0_0_4 = INSTANCE.getREZEPT_6_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_6_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__REZEPTE), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.PLUS, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_6_0_0 = INSTANCE.getREZEPT_6_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_6_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_6_0_0_0, REZEPT_6_0_0_1, REZEPT_6_0_0_2, REZEPT_6_0_0_3, REZEPT_6_0_0_4);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_6_0 = INSTANCE.getREZEPT_6_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_6_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_6_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Rezeptliste
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_6 = INSTANCE.getREZEPT_6();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_6() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), REZEPT_6_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_7_0_0_0 = INSTANCE.getREZEPT_7_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_7_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("import produkte", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_7_0_0_1 = INSTANCE.getREZEPT_7_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_7_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktImport().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_7_0_0_2 = INSTANCE.getREZEPT_7_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_7_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_7_0_0 = INSTANCE.getREZEPT_7_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_7_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_7_0_0_0, REZEPT_7_0_0_1, REZEPT_7_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_7_0 = INSTANCE.getREZEPT_7_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_7_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_7_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ProduktImport
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_7 = INSTANCE.getREZEPT_7();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_7() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktImport(), REZEPT_7_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_8_0_0_0 = INSTANCE.getREZEPT_8_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_8_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Produktliste", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_8_0_0_1 = INSTANCE.getREZEPT_8_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_8_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__NAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_8_0_0_2 = INSTANCE.getREZEPT_8_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_8_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(";", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_8_0_0_3 = INSTANCE.getREZEPT_8_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_8_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__PRODUKTE), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.PLUS, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_8_0_0 = INSTANCE.getREZEPT_8_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_8_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_8_0_0_0, REZEPT_8_0_0_1, REZEPT_8_0_0_2, REZEPT_8_0_0_3);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_8_0 = INSTANCE.getREZEPT_8_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_8_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_8_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Produktliste
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_8 = INSTANCE.getREZEPT_8();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_8() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(), REZEPT_8_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_0 = INSTANCE.getREZEPT_9_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Produkt", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_9_0_0_1 = INSTANCE.getREZEPT_9_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_9_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__NAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_2 = INSTANCE.getREZEPT_9_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("{", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_3_0_0_0 = INSTANCE.getREZEPT_9_0_0_3_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_3_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Verpackung:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_9_0_0_3_0_0_1 = INSTANCE.getREZEPT_9_0_0_3_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_9_0_0_3_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__VERPACKUNG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_3_0_0_2 = INSTANCE.getREZEPT_9_0_0_3_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_3_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_9_0_0_3_0_0 = INSTANCE.getREZEPT_9_0_0_3_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_9_0_0_3_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_3_0_0_0, REZEPT_9_0_0_3_0_0_1, REZEPT_9_0_0_3_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_9_0_0_3_0 = INSTANCE.getREZEPT_9_0_0_3_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_9_0_0_3_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_3_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_9_0_0_3 = INSTANCE.getREZEPT_9_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_9_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_9_0_0_3_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_9_0_0_4 = INSTANCE.getREZEPT_9_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_9_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__MENGE), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getMenge(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_5_0_0_0 = INSTANCE.getREZEPT_9_0_0_5_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_5_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("EAN:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_9_0_0_5_0_0_1 = INSTANCE.getREZEPT_9_0_0_5_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_9_0_0_5_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__EAN), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_5_0_0_2 = INSTANCE.getREZEPT_9_0_0_5_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_5_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_9_0_0_5_0_0 = INSTANCE.getREZEPT_9_0_0_5_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_9_0_0_5_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_5_0_0_0, REZEPT_9_0_0_5_0_0_1, REZEPT_9_0_0_5_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_9_0_0_5_0 = INSTANCE.getREZEPT_9_0_0_5_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_9_0_0_5_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_5_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_9_0_0_5 = INSTANCE.getREZEPT_9_0_0_5();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_9_0_0_5() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_9_0_0_5_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_6_0_0_0 = INSTANCE.getREZEPT_9_0_0_6_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_6_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("UBA:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_9_0_0_6_0_0_1 = INSTANCE.getREZEPT_9_0_0_6_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_9_0_0_6_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__UBA), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_6_0_0_2 = INSTANCE.getREZEPT_9_0_0_6_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_6_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_9_0_0_6_0_0 = INSTANCE.getREZEPT_9_0_0_6_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_9_0_0_6_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_6_0_0_0, REZEPT_9_0_0_6_0_0_1, REZEPT_9_0_0_6_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_9_0_0_6_0 = INSTANCE.getREZEPT_9_0_0_6_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_9_0_0_6_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_6_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_9_0_0_6 = INSTANCE.getREZEPT_9_0_0_6();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_9_0_0_6() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_9_0_0_6_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_9_0_0_7 = INSTANCE.getREZEPT_9_0_0_7();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_9_0_0_7() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__PREIS), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPreis(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_8_0_0_0 = INSTANCE.getREZEPT_9_0_0_8_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_8_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("H\u00e4ndler:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_9_0_0_8_0_0_1 = INSTANCE.getREZEPT_9_0_0_8_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_9_0_0_8_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HANDLER), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_8_0_0_2 = INSTANCE.getREZEPT_9_0_0_8_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_8_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_9_0_0_8_0_0 = INSTANCE.getREZEPT_9_0_0_8_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_9_0_0_8_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_8_0_0_0, REZEPT_9_0_0_8_0_0_1, REZEPT_9_0_0_8_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_9_0_0_8_0 = INSTANCE.getREZEPT_9_0_0_8_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_9_0_0_8_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_8_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_9_0_0_8 = INSTANCE.getREZEPT_9_0_0_8();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_9_0_0_8() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_9_0_0_8_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_9_0_0_0 = INSTANCE.getREZEPT_9_0_0_9_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_9_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Hersteller:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_9_0_0_9_0_0_1 = INSTANCE.getREZEPT_9_0_0_9_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_9_0_0_9_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HERSTELLER), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_9_0_0_2 = INSTANCE.getREZEPT_9_0_0_9_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_9_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_9_0_0_9_0_0 = INSTANCE.getREZEPT_9_0_0_9_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_9_0_0_9_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_9_0_0_0, REZEPT_9_0_0_9_0_0_1, REZEPT_9_0_0_9_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_9_0_0_9_0 = INSTANCE.getREZEPT_9_0_0_9_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_9_0_0_9_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_9_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_9_0_0_9 = INSTANCE.getREZEPT_9_0_0_9();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_9_0_0_9() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_9_0_0_9_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_10 = INSTANCE.getREZEPT_9_0_0_10();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_10() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Letzte \u00c4nderung:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_9_0_0_11 = INSTANCE.getREZEPT_9_0_0_11();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_9_0_0_11() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG), "DATUM", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_12 = INSTANCE.getREZEPT_9_0_0_12();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_12() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_9_0_0_13 = INSTANCE.getREZEPT_9_0_0_13();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_9_0_0_13() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("}", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_9_0_0 = INSTANCE.getREZEPT_9_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_9_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0_0, REZEPT_9_0_0_1, REZEPT_9_0_0_2, REZEPT_9_0_0_3, REZEPT_9_0_0_4, REZEPT_9_0_0_5, REZEPT_9_0_0_6, REZEPT_9_0_0_7, REZEPT_9_0_0_8, REZEPT_9_0_0_9, REZEPT_9_0_0_10, REZEPT_9_0_0_11, REZEPT_9_0_0_12, REZEPT_9_0_0_13);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_9_0 = INSTANCE.getREZEPT_9_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_9_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_9_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Produkt
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_9 = INSTANCE.getREZEPT_9();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_9() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), REZEPT_9_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_10_0_0_0 = INSTANCE.getREZEPT_10_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_10_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Preis:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_10_0_0_1 = INSTANCE.getREZEPT_10_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_10_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPreis().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__BETRAG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_10_0_0_2 = INSTANCE.getREZEPT_10_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_10_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPreis().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__WAEHRUNG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_10_0_0_3 = INSTANCE.getREZEPT_10_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_10_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_10_0_0 = INSTANCE.getREZEPT_10_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_10_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_10_0_0_0, REZEPT_10_0_0_1, REZEPT_10_0_0_2, REZEPT_10_0_0_3);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_10_0 = INSTANCE.getREZEPT_10_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_10_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_10_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Preis
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_10 = INSTANCE.getREZEPT_10();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_10() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPreis(), REZEPT_10_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_0 = INSTANCE.getREZEPT_11_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Rezept", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_11_0_0_1 = INSTANCE.getREZEPT_11_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_11_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ID), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_2 = INSTANCE.getREZEPT_11_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("{", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_3 = INSTANCE.getREZEPT_11_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Titel:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_11_0_0_4 = INSTANCE.getREZEPT_11_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_11_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TITEL), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_5 = INSTANCE.getREZEPT_11_0_0_5();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_5() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_6_0_0_0 = INSTANCE.getREZEPT_11_0_0_6_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_6_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Untertitel:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_11_0_0_6_0_0_1 = INSTANCE.getREZEPT_11_0_0_6_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_11_0_0_6_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__UNTERTITEL), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_6_0_0_2 = INSTANCE.getREZEPT_11_0_0_6_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_6_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_11_0_0_6_0_0 = INSTANCE.getREZEPT_11_0_0_6_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_11_0_0_6_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0_6_0_0_0, REZEPT_11_0_0_6_0_0_1, REZEPT_11_0_0_6_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_11_0_0_6_0 = INSTANCE.getREZEPT_11_0_0_6_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_11_0_0_6_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0_6_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_11_0_0_6 = INSTANCE.getREZEPT_11_0_0_6();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_11_0_0_6() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_11_0_0_6_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_7 = INSTANCE.getREZEPT_11_0_0_7();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_7() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Kategorie:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_11_0_0_8 = INSTANCE.getREZEPT_11_0_0_8();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_11_0_0_8() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__KATEGORIE), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_9 = INSTANCE.getREZEPT_11_0_0_9();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_9() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_10_0_0_0 = INSTANCE.getREZEPT_11_0_0_10_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_10_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Quelle:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_11_0_0_10_0_0_1 = INSTANCE.getREZEPT_11_0_0_10_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_11_0_0_10_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__QUELLE), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getQuelle(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_11_0_0_10_0_0 = INSTANCE.getREZEPT_11_0_0_10_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_11_0_0_10_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0_10_0_0_0, REZEPT_11_0_0_10_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_11_0_0_10_0 = INSTANCE.getREZEPT_11_0_0_10_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_11_0_0_10_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0_10_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_11_0_0_10 = INSTANCE.getREZEPT_11_0_0_10();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_11_0_0_10() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_11_0_0_10_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_11_0_0_0 = INSTANCE.getREZEPT_11_0_0_11_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_11_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Ausreichend f\u00fcr", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_11_0_0_11_0_0_1 = INSTANCE.getREZEPT_11_0_0_11_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_11_0_0_11_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PERSONEN), "NUMBER", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_11_0_0_2 = INSTANCE.getREZEPT_11_0_0_11_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_11_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Personen.", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_11_0_0_11_0_0 = INSTANCE.getREZEPT_11_0_0_11_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_11_0_0_11_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0_11_0_0_0, REZEPT_11_0_0_11_0_0_1, REZEPT_11_0_0_11_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_11_0_0_11_0 = INSTANCE.getREZEPT_11_0_0_11_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_11_0_0_11_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0_11_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_11_0_0_11 = INSTANCE.getREZEPT_11_0_0_11();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_11_0_0_11() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_11_0_0_11_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_12 = INSTANCE.getREZEPT_11_0_0_12();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_12() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Letzte \u00c4nderung:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_11_0_0_13 = INSTANCE.getREZEPT_11_0_0_13();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_11_0_0_13() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__LETZTE_AENDERUNG), "DATUM", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_14 = INSTANCE.getREZEPT_11_0_0_14();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_14() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_11_0_0_15 = INSTANCE.getREZEPT_11_0_0_15();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_11_0_0_15() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TAGS), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.PLUS, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getTag(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_11_0_0_16 = INSTANCE.getREZEPT_11_0_0_16();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_11_0_0_16() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PRODUKTE), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_11_0_0_17 = INSTANCE.getREZEPT_11_0_0_17();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_11_0_0_17() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ZUTATEN), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.PLUS, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getZutat(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_11_0_0_18 = INSTANCE.getREZEPT_11_0_0_18();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_11_0_0_18() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__SCHRITTE), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.PLUS, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getArbeitsschritt(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_19 = INSTANCE.getREZEPT_11_0_0_19();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_19() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("--Zusatzinformationen--", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_11_0_0_20 = INSTANCE.getREZEPT_11_0_0_20();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_11_0_0_20() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__NOTIZEN), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getNotiz(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_11_0_0_21 = INSTANCE.getREZEPT_11_0_0_21();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_11_0_0_21() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__BILDER), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_11_0_0_22 = INSTANCE.getREZEPT_11_0_0_22();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_11_0_0_22() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("}", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_11_0_0 = INSTANCE.getREZEPT_11_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_11_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0_0, REZEPT_11_0_0_1, REZEPT_11_0_0_2, REZEPT_11_0_0_3, REZEPT_11_0_0_4, REZEPT_11_0_0_5, REZEPT_11_0_0_6, REZEPT_11_0_0_7, REZEPT_11_0_0_8, REZEPT_11_0_0_9, REZEPT_11_0_0_10, REZEPT_11_0_0_11, REZEPT_11_0_0_12, REZEPT_11_0_0_13, REZEPT_11_0_0_14, REZEPT_11_0_0_15, REZEPT_11_0_0_16, REZEPT_11_0_0_17, REZEPT_11_0_0_18, REZEPT_11_0_0_19, REZEPT_11_0_0_20, REZEPT_11_0_0_21, REZEPT_11_0_0_22);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_11_0 = INSTANCE.getREZEPT_11_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_11_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_11_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Rezept
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_11 = INSTANCE.getREZEPT_11();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_11() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), REZEPT_11_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_12_0_0_0 = INSTANCE.getREZEPT_12_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_12_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Stoff:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_12_0_0_1 = INSTANCE.getREZEPT_12_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_12_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getStoffTag().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.STOFF_TAG__STOFF), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_12_0_0_2 = INSTANCE.getREZEPT_12_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_12_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_12_0_0 = INSTANCE.getREZEPT_12_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_12_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_12_0_0_0, REZEPT_12_0_0_1, REZEPT_12_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_12_0 = INSTANCE.getREZEPT_12_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_12_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_12_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class StoffTag
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_12 = INSTANCE.getREZEPT_12();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_12() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getStoffTag(), REZEPT_12_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_13_0_0_0 = INSTANCE.getREZEPT_13_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_13_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Tag:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_13_0_0_1 = INSTANCE.getREZEPT_13_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_13_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBenutzerTag().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BENUTZER_TAG__BEZEICHNUNG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_13_0_0_2 = INSTANCE.getREZEPT_13_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_13_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_13_0_0 = INSTANCE.getREZEPT_13_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_13_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_13_0_0_0, REZEPT_13_0_0_1, REZEPT_13_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_13_0 = INSTANCE.getREZEPT_13_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_13_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_13_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class BenutzerTag
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_13 = INSTANCE.getREZEPT_13();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_13() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBenutzerTag(), REZEPT_13_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_14_0_0_0 = INSTANCE.getREZEPT_14_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_14_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Di\u00e4t:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_14_0_0_1 = INSTANCE.getREZEPT_14_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_14_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getDiaetTag().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.DIAET_TAG__DIAET), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_14_0_0_2 = INSTANCE.getREZEPT_14_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_14_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_14_0_0 = INSTANCE.getREZEPT_14_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_14_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_14_0_0_0, REZEPT_14_0_0_1, REZEPT_14_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_14_0 = INSTANCE.getREZEPT_14_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_14_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_14_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class DiaetTag
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_14 = INSTANCE.getREZEPT_14();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_14() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getDiaetTag(), REZEPT_14_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_15_0_0_0 = INSTANCE.getREZEPT_15_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_15_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("ProduktRef:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_15_0_0_1 = INSTANCE.getREZEPT_15_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_15_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_15_0_0_2 = INSTANCE.getREZEPT_15_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_15_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Menge:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_15_0_0_3 = INSTANCE.getREZEPT_15_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_15_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__MENGE), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_15_0_0_4 = INSTANCE.getREZEPT_15_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_15_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("mal.", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_15_0_0 = INSTANCE.getREZEPT_15_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_15_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_15_0_0_0, REZEPT_15_0_0_1, REZEPT_15_0_0_2, REZEPT_15_0_0_3, REZEPT_15_0_0_4);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_15_0 = INSTANCE.getREZEPT_15_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_15_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_15_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class ProduktRef
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_15 = INSTANCE.getREZEPT_15();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_15() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef(), REZEPT_15_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_16_0_0_0 = INSTANCE.getREZEPT_16_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_16_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Zutat:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_16_0_0_1 = INSTANCE.getREZEPT_16_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_16_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getZutat().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__NAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_16_0_0_2 = INSTANCE.getREZEPT_16_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_16_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getZutat().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__MENGE), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getMenge(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_16_0_0 = INSTANCE.getREZEPT_16_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_16_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_16_0_0_0, REZEPT_16_0_0_1, REZEPT_16_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_16_0 = INSTANCE.getREZEPT_16_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_16_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_16_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Zutat
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_16 = INSTANCE.getREZEPT_16();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_16() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getZutat(), REZEPT_16_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_17_0_0_0 = INSTANCE.getREZEPT_17_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_17_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Menge:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_17_0_0_1 = INSTANCE.getREZEPT_17_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_17_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBestimmteMenge().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__BETRAG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_17_0_0_2 = INSTANCE.getREZEPT_17_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_17_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBestimmteMenge().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__DETAILS), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_17_0_0_3 = INSTANCE.getREZEPT_17_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_17_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBestimmteMenge().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__EINHEIT), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_17_0_0_4 = INSTANCE.getREZEPT_17_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_17_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_17_0_0 = INSTANCE.getREZEPT_17_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_17_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_17_0_0_0, REZEPT_17_0_0_1, REZEPT_17_0_0_2, REZEPT_17_0_0_3, REZEPT_17_0_0_4);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_17_0 = INSTANCE.getREZEPT_17_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_17_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_17_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * BestimmteMenge
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_17 = INSTANCE.getREZEPT_17();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_17() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBestimmteMenge(), REZEPT_17_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_18_0_0_0 = INSTANCE.getREZEPT_18_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_18_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getUnbestimmteMenge().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.UNBESTIMMTE_MENGE__MENGE), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_18_0_0_1 = INSTANCE.getREZEPT_18_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_18_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_18_0_0 = INSTANCE.getREZEPT_18_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_18_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_18_0_0_0, REZEPT_18_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_18_0 = INSTANCE.getREZEPT_18_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_18_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_18_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * UnbestimmteMenge
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_18 = INSTANCE.getREZEPT_18();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_18() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getUnbestimmteMenge(), REZEPT_18_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_19_0_0_0 = INSTANCE.getREZEPT_19_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_19_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Aktion:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_19_0_0_1 = INSTANCE.getREZEPT_19_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_19_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getArbeitsschritt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_19_0_0_2 = INSTANCE.getREZEPT_19_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_19_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getArbeitsschritt().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__NOTIZ), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getNotiz(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_19_0_0 = INSTANCE.getREZEPT_19_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_19_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_19_0_0_0, REZEPT_19_0_0_1, REZEPT_19_0_0_2);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_19_0 = INSTANCE.getREZEPT_19_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_19_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_19_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * Arbeitsschritt
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_19 = INSTANCE.getREZEPT_19();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_19() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getArbeitsschritt(), REZEPT_19_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_20_0_0_0 = INSTANCE.getREZEPT_20_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_20_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Tipp:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_20_0_0_1 = INSTANCE.getREZEPT_20_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_20_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getTipp().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.TIPP__TEXT), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_20_0_0 = INSTANCE.getREZEPT_20_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_20_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_20_0_0_0, REZEPT_20_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_20_0 = INSTANCE.getREZEPT_20_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_20_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_20_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Tipp
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_20 = INSTANCE.getREZEPT_20();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_20() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getTipp(), REZEPT_20_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_21_0_0_0 = INSTANCE.getREZEPT_21_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_21_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Kommentar:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_21_0_0_1 = INSTANCE.getREZEPT_21_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_21_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getKommentar().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.KOMMENTAR__TEXT), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_21_0_0 = INSTANCE.getREZEPT_21_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_21_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_21_0_0_0, REZEPT_21_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_21_0 = INSTANCE.getREZEPT_21_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_21_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_21_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Kommentar
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_21 = INSTANCE.getREZEPT_21();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_21() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getKommentar(), REZEPT_21_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_22_0_0_0 = INSTANCE.getREZEPT_22_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_22_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Anmerkung:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_22_0_0_1 = INSTANCE.getREZEPT_22_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_22_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAnmerkung().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ANMERKUNG__TEXT), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_22_0_0 = INSTANCE.getREZEPT_22_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_22_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_22_0_0_0, REZEPT_22_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_22_0 = INSTANCE.getREZEPT_22_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_22_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_22_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Anmerkung
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_22 = INSTANCE.getREZEPT_22();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_22() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAnmerkung(), REZEPT_22_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_23_0_0_0 = INSTANCE.getREZEPT_23_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_23_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("\u00fcbernommen", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_23_0_0_1 = INSTANCE.getREZEPT_23_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_23_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLiteraturquelle().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_23_0_0_2 = INSTANCE.getREZEPT_23_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_23_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("aus", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_23_0_0_3 = INSTANCE.getREZEPT_23_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_23_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLiteraturquelle().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__BESCHREIBUNG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_23_0_0_4 = INSTANCE.getREZEPT_23_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_23_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_23_0_0 = INSTANCE.getREZEPT_23_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_23_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_23_0_0_0, REZEPT_23_0_0_1, REZEPT_23_0_0_2, REZEPT_23_0_0_3, REZEPT_23_0_0_4);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_23_0 = INSTANCE.getREZEPT_23_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_23_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_23_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * Literaturquelle
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_23 = INSTANCE.getREZEPT_23();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_23() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLiteraturquelle(), REZEPT_23_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_24_0_0_0 = INSTANCE.getREZEPT_24_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_24_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("\u00fcberliefert", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_24_0_0_1 = INSTANCE.getREZEPT_24_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_24_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("von", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_24_0_0_2 = INSTANCE.getREZEPT_24_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_24_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPersonenquelle().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_24_0_0_3 = INSTANCE.getREZEPT_24_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_24_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_24_0_0 = INSTANCE.getREZEPT_24_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_24_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_24_0_0_0, REZEPT_24_0_0_1, REZEPT_24_0_0_2, REZEPT_24_0_0_3);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_24_0 = INSTANCE.getREZEPT_24_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_24_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_24_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * Personenquelle
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_24 = INSTANCE.getREZEPT_24();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_24() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getPersonenquelle(), REZEPT_24_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_25_0_0_0 = INSTANCE.getREZEPT_25_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_25_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Bild:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment REZEPT_25_0_0_1 = INSTANCE.getREZEPT_25_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment getREZEPT_25_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__ABLAGE_ORT), com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, new EClass[] {com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getAblagePfad(), }, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_25_0_0_2_0_0_0 = INSTANCE.getREZEPT_25_0_0_2_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_25_0_0_2_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Text:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_25_0_0_2_0_0_1 = INSTANCE.getREZEPT_25_0_0_2_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_25_0_0_2_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__BESCHREIBUNG), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_25_0_0_2_0_0 = INSTANCE.getREZEPT_25_0_0_2_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_25_0_0_2_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0_2_0_0_0, REZEPT_25_0_0_2_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_25_0_0_2_0 = INSTANCE.getREZEPT_25_0_0_2_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_25_0_0_2_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0_2_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_25_0_0_2 = INSTANCE.getREZEPT_25_0_0_2();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_25_0_0_2() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_25_0_0_2_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_25_0_0_3_0_0_0 = INSTANCE.getREZEPT_25_0_0_3_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_25_0_0_3_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Lizenz:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_25_0_0_3_0_0_1 = INSTANCE.getREZEPT_25_0_0_3_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_25_0_0_3_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__LIZENZ), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_25_0_0_3_0_0 = INSTANCE.getREZEPT_25_0_0_3_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_25_0_0_3_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0_3_0_0_0, REZEPT_25_0_0_3_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_25_0_0_3_0 = INSTANCE.getREZEPT_25_0_0_3_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_25_0_0_3_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0_3_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_25_0_0_3 = INSTANCE.getREZEPT_25_0_0_3();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_25_0_0_3() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_25_0_0_3_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_25_0_0_4_0_0_0 = INSTANCE.getREZEPT_25_0_0_4_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_25_0_0_4_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("Urheber:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_25_0_0_4_0_0_1 = INSTANCE.getREZEPT_25_0_0_4_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_25_0_0_4_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__URHEBER), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_25_0_0_4_0_0 = INSTANCE.getREZEPT_25_0_0_4_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_25_0_0_4_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0_4_0_0_0, REZEPT_25_0_0_4_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_25_0_0_4_0 = INSTANCE.getREZEPT_25_0_0_4_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_25_0_0_4_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0_4_0_0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound REZEPT_25_0_0_4 = INSTANCE.getREZEPT_25_0_0_4();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound getREZEPT_25_0_0_4() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCompound(REZEPT_25_0_0_4_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_25_0_0_5 = INSTANCE.getREZEPT_25_0_0_5();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_25_0_0_5() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword(".", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_25_0_0 = INSTANCE.getREZEPT_25_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_25_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0_0, REZEPT_25_0_0_1, REZEPT_25_0_0_2, REZEPT_25_0_0_3, REZEPT_25_0_0_4, REZEPT_25_0_0_5);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_25_0 = INSTANCE.getREZEPT_25_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_25_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_25_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Bild
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_25 = INSTANCE.getREZEPT_25();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_25() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild(), REZEPT_25_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_26_0_0_0 = INSTANCE.getREZEPT_26_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_26_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("URL:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_26_0_0_1 = INSTANCE.getREZEPT_26_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_26_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getInternetPfad().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.INTERNET_PFAD__URL), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_26_0_0 = INSTANCE.getREZEPT_26_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_26_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_26_0_0_0, REZEPT_26_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_26_0 = INSTANCE.getREZEPT_26_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_26_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_26_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class InternetPfad
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_26 = INSTANCE.getREZEPT_26();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_26() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getInternetPfad(), REZEPT_26_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword REZEPT_27_0_0_0 = INSTANCE.getREZEPT_27_0_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword getREZEPT_27_0_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword("FileName:", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder REZEPT_27_0_0_1 = INSTANCE.getREZEPT_27_0_0_1();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder getREZEPT_27_0_0_1() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLokalerPfad().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LOKALER_PFAD__FILE_NAME), "QUOTED_34_34", com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, 0);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence REZEPT_27_0_0 = INSTANCE.getREZEPT_27_0_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence getREZEPT_27_0_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSequence(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_27_0_0_0, REZEPT_27_0_0_1);
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice REZEPT_27_0 = INSTANCE.getREZEPT_27_0();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getREZEPT_27_0() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE, REZEPT_27_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class LokalerPfad
	 */
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule REZEPT_27 = INSTANCE.getREZEPT_27();
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getREZEPT_27() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getLokalerPfad(), REZEPT_27_0, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE);
	}
	
	
	public static String getSyntaxElementID(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (Field field : com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement) com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule[] RULES = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule[] {
		REZEPT_0,
		REZEPT_1,
		REZEPT_2,
		REZEPT_3,
		REZEPT_4,
		REZEPT_5,
		REZEPT_6,
		REZEPT_7,
		REZEPT_8,
		REZEPT_9,
		REZEPT_10,
		REZEPT_11,
		REZEPT_12,
		REZEPT_13,
		REZEPT_14,
		REZEPT_15,
		REZEPT_16,
		REZEPT_17,
		REZEPT_18,
		REZEPT_19,
		REZEPT_20,
		REZEPT_21,
		REZEPT_22,
		REZEPT_23,
		REZEPT_24,
		REZEPT_25,
		REZEPT_26,
		REZEPT_27,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new LinkedHashSet<String>();
			for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement element, Set<String> keywords) {
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword) {
			keywords.add(((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword) element).getValue());
		} else if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptBooleanTerminal) {
			keywords.add(((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptBooleanTerminal) element).getTrueLiteral());
			keywords.add(((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptEnumerationTerminal) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptEnumerationTerminal terminal = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
