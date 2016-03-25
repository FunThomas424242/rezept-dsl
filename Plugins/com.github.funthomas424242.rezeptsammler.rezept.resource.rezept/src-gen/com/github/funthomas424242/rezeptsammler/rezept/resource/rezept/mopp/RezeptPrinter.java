/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * This class provides an implementation of the
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextDiagn
 * ostic interface. However, it is recommended to use the
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPrint
 * er2 instead, because it provides advanced printing features. There are even
 * some features (e.g., printing enumeration terminals) which are only supported
 * by that class.
 */
public class RezeptPrinter implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextPrinter {
	
	protected com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolverFactory tokenResolverFactory = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenResolverFactory();
	
	protected OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource;
	
	private Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public RezeptPrinter(OutputStream outputStream, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(Map<String, Integer> featureCounter, Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(EObject element, PrintWriter out, String globaltab) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung) {
			print_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung((com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung) {
			print_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung((com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Absatz) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Absatz((com.github.funthomas424242.rezeptsammler.rezept.Absatz) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Autor) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Autor((com.github.funthomas424242.rezeptsammler.rezept.Autor) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Lizenz) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Lizenz((com.github.funthomas424242.rezeptsammler.rezept.Lizenz) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.RezeptImport) {
			print_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport((com.github.funthomas424242.rezeptsammler.rezept.RezeptImport) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste((com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.ProduktImport) {
			print_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport((com.github.funthomas424242.rezeptsammler.rezept.ProduktImport) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Produktliste) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Produktliste((com.github.funthomas424242.rezeptsammler.rezept.Produktliste) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Produkt) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Produkt((com.github.funthomas424242.rezeptsammler.rezept.Produkt) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Preis) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Preis((com.github.funthomas424242.rezeptsammler.rezept.Preis) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Rezept) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Rezept((com.github.funthomas424242.rezeptsammler.rezept.Rezept) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.StoffTag) {
			print_com_github_funthomas424242_rezeptsammler_rezept_StoffTag((com.github.funthomas424242.rezeptsammler.rezept.StoffTag) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag) {
			print_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag((com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.DiaetTag) {
			print_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag((com.github.funthomas424242.rezeptsammler.rezept.DiaetTag) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.ProduktRef) {
			print_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef((com.github.funthomas424242.rezeptsammler.rezept.ProduktRef) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Zutat) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Zutat((com.github.funthomas424242.rezeptsammler.rezept.Zutat) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge) {
			print_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge((com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge) {
			print_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge((com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt((com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Tipp) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Tipp((com.github.funthomas424242.rezeptsammler.rezept.Tipp) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Kommentar) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Kommentar((com.github.funthomas424242.rezeptsammler.rezept.Kommentar) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Anmerkung) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung((com.github.funthomas424242.rezeptsammler.rezept.Anmerkung) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle((com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Personenquelle) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle((com.github.funthomas424242.rezeptsammler.rezept.Personenquelle) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Bild) {
			print_com_github_funthomas424242_rezeptsammler_rezept_Bild((com.github.funthomas424242.rezeptsammler.rezept.Bild) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.InternetPfad) {
			print_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad((com.github.funthomas424242.rezeptsammler.rezept.InternetPfad) element, globaltab, out);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad) {
			print_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad((com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptReferenceResolverSwitch getReferenceResolverSwitch() {
		return (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptReferenceResolverSwitch) new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptProblem(errorMessage, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType.PRINT_PROBLEM, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(EObject element) throws java.io.IOException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung(com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID));
		printCountingMap.put("groupId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID));
		printCountingMap.put("artifactId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION));
		printCountingMap.put("version", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH));
		printCountingMap.put("buch", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR));
		printCountingMap.put("resourcesDir", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL));
		printCountingMap.put("siteURL", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("RezeptSammlung");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("groupId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("groupId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID), element));
				out.print(" ");
			}
			printCountingMap.put("groupId", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("artifactId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("artifactId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID), element));
				out.print(" ");
			}
			printCountingMap.put("artifactId", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("version");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("version");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION), element));
				out.print(" ");
			}
			printCountingMap.put("version", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Media Folder:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("resourcesDir");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR), element));
				out.print(" ");
			}
			printCountingMap.put("resourcesDir", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("buch");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("buch", count - 1);
		}
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung_0(com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("siteURL");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("siteURL");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL), element));
				out.print(" ");
			}
			printCountingMap.put("siteURL", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung(com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__TITEL));
		printCountingMap.put("titel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__VORWORT));
		printCountingMap.put("vorwort", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED));
		printCountingMap.put("datumPublished", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ));
		printCountingMap.put("lizenz", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN));
		printCountingMap.put("autoren", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ));
		printCountingMap.put("absatz", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Buch");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("imports");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("imports", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Titel:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("titel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__TITEL));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__TITEL), element));
				out.print(" ");
			}
			printCountingMap.put("titel", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("autoren");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("autoren", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lizenz");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("lizenz", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_0(com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Vorwort:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("vorwort");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__VORWORT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__VORWORT), element));
				out.print(" ");
			}
			printCountingMap.put("vorwort", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("absatz");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("absatz", 0);
		}
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_1(com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Ver\u00f6ffentlicht am:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("datumPublished");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("DATUM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED), element));
				out.print(" ");
			}
			printCountingMap.put("datumPublished", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Absatz(com.github.funthomas424242.rezeptsammler.rezept.Absatz element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TITEL));
		printCountingMap.put("titel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Absatz:");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Absatz_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TEXT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TEXT), element));
				out.print(" ");
			}
			printCountingMap.put("text", count - 1);
		}
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Absatz_0(com.github.funthomas424242.rezeptsammler.rezept.Absatz element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("titel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TITEL));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_6161_6161");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TITEL), element));
				out.print(" ");
			}
			printCountingMap.put("titel", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Autor(com.github.funthomas424242.rezeptsammler.rezept.Autor element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__VORNAME));
		printCountingMap.put("vorname", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__NACHNAME));
		printCountingMap.put("nachname", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__ORGANISATIONS_NAME));
		printCountingMap.put("organisationsName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ));
		printCountingMap.put("modifikationsNotiz", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Autor:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Vorname:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("vorname");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__VORNAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__VORNAME), element));
				out.print(" ");
			}
			printCountingMap.put("vorname", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Nachname:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("nachname");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__NACHNAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__NACHNAME), element));
				out.print(" ");
			}
			printCountingMap.put("nachname", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Autor_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("ModifikationsNotiz:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("modifikationsNotiz");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ), element));
				out.print(" ");
			}
			printCountingMap.put("modifikationsNotiz", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Autor_0(com.github.funthomas424242.rezeptsammler.rezept.Autor element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Organisation:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("organisationsName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__ORGANISATIONS_NAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__ORGANISATIONS_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("organisationsName", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Lizenz(com.github.funthomas424242.rezeptsammler.rezept.Lizenz element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__HINWEIS));
		printCountingMap.put("hinweis", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Lizenzhinweis:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("hinweis");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__HINWEIS));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__HINWEIS), element));
				out.print(" ");
			}
			printCountingMap.put("hinweis", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Lizenz_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Lizenz_0(com.github.funthomas424242.rezeptsammler.rezept.Lizenz element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Lizenztext:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__TEXT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__TEXT), element));
				out.print(" ");
			}
			printCountingMap.put("text", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport(com.github.funthomas424242.rezeptsammler.rezept.RezeptImport element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE));
		printCountingMap.put("importedResource", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("import rezepte");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("importedResource");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRezeptImportImportedResourceReferenceResolver().deResolve((com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste) o, element, (EReference) element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE)), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE), element));
				out.print(" ");
			}
			printCountingMap.put("importedResource", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste(com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__REZEPTE));
		printCountingMap.put("rezepte", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Rezeptliste");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__NAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("imports");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__IMPORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("imports", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rezepte");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__REZEPTE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("rezepte", 0);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport(com.github.funthomas424242.rezeptsammler.rezept.ProduktImport element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE));
		printCountingMap.put("importedResource", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("import produkte");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("importedResource");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProduktImportImportedResourceReferenceResolver().deResolve((com.github.funthomas424242.rezeptsammler.rezept.Produktliste) o, element, (EReference) element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE)), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE), element));
				out.print(" ");
			}
			printCountingMap.put("importedResource", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Produktliste(com.github.funthomas424242.rezeptsammler.rezept.Produktliste element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__PRODUKTE));
		printCountingMap.put("produkte", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Produktliste");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__NAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("produkte");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__PRODUKTE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("produkte", 0);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Produkt(com.github.funthomas424242.rezeptsammler.rezept.Produkt element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__VERPACKUNG));
		printCountingMap.put("verpackung", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__EAN));
		printCountingMap.put("ean", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__UBA));
		printCountingMap.put("uba", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HANDLER));
		printCountingMap.put("handler", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HERSTELLER));
		printCountingMap.put("hersteller", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG));
		printCountingMap.put("datumLetzteAenderung", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__PREIS));
		printCountingMap.put("preis", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__MENGE));
		printCountingMap.put("menge", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Produkt");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__NAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("menge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__MENGE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("menge", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("preis");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__PREIS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("preis", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Letzte \u00c4nderung:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("datumLetzteAenderung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("DATUM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG), element));
				out.print(" ");
			}
			printCountingMap.put("datumLetzteAenderung", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_0(com.github.funthomas424242.rezeptsammler.rezept.Produkt element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Verpackung:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("verpackung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__VERPACKUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__VERPACKUNG), element));
				out.print(" ");
			}
			printCountingMap.put("verpackung", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_1(com.github.funthomas424242.rezeptsammler.rezept.Produkt element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("EAN:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("ean");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__EAN));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__EAN), element));
				out.print(" ");
			}
			printCountingMap.put("ean", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_2(com.github.funthomas424242.rezeptsammler.rezept.Produkt element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("UBA:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("uba");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__UBA));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__UBA), element));
				out.print(" ");
			}
			printCountingMap.put("uba", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_3(com.github.funthomas424242.rezeptsammler.rezept.Produkt element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("H\u00e4ndler:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("handler");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HANDLER));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HANDLER), element));
				out.print(" ");
			}
			printCountingMap.put("handler", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Produkt_4(com.github.funthomas424242.rezeptsammler.rezept.Produkt element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Hersteller:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("hersteller");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HERSTELLER));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HERSTELLER), element));
				out.print(" ");
			}
			printCountingMap.put("hersteller", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Preis(com.github.funthomas424242.rezeptsammler.rezept.Preis element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__BETRAG));
		printCountingMap.put("betrag", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__WAEHRUNG));
		printCountingMap.put("waehrung", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Preis:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("betrag");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__BETRAG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__BETRAG), element));
				out.print(" ");
			}
			printCountingMap.put("betrag", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("waehrung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__WAEHRUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__WAEHRUNG), element));
				out.print(" ");
			}
			printCountingMap.put("waehrung", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Rezept(com.github.funthomas424242.rezeptsammler.rezept.Rezept element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(13);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__QUELLE));
		printCountingMap.put("quelle", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__SCHRITTE));
		printCountingMap.put("schritte", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PRODUKTE));
		printCountingMap.put("produkte", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ZUTATEN));
		printCountingMap.put("zutaten", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TITEL));
		printCountingMap.put("titel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__UNTERTITEL));
		printCountingMap.put("untertitel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__KATEGORIE));
		printCountingMap.put("kategorie", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__LETZTE_AENDERUNG));
		printCountingMap.put("letzteAenderung", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TAGS));
		printCountingMap.put("tags", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__NOTIZEN));
		printCountingMap.put("notizen", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PERSONEN));
		printCountingMap.put("personen", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__BILDER));
		printCountingMap.put("bilder", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Rezept");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ID));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Titel:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("titel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TITEL));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TITEL), element));
				out.print(" ");
			}
			printCountingMap.put("titel", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Rezept_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Kategorie:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("kategorie");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__KATEGORIE));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__KATEGORIE), element));
				out.print(" ");
			}
			printCountingMap.put("kategorie", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Rezept_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Rezept_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Letzte \u00c4nderung:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("letzteAenderung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__LETZTE_AENDERUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("DATUM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__LETZTE_AENDERUNG), element));
				out.print(" ");
			}
			printCountingMap.put("letzteAenderung", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tags");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TAGS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("tags", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("produkte");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PRODUKTE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("produkte", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("zutaten");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ZUTATEN));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("zutaten", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("schritte");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__SCHRITTE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("schritte", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("--Zusatzinformationen--");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("notizen");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__NOTIZEN));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("notizen", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bilder");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__BILDER));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("bilder", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Rezept_0(com.github.funthomas424242.rezeptsammler.rezept.Rezept element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Untertitel:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("untertitel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__UNTERTITEL));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__UNTERTITEL), element));
				out.print(" ");
			}
			printCountingMap.put("untertitel", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Rezept_1(com.github.funthomas424242.rezeptsammler.rezept.Rezept element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Quelle:");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("quelle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__QUELLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("quelle", count - 1);
		}
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Rezept_2(com.github.funthomas424242.rezeptsammler.rezept.Rezept element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Ausreichend f\u00fcr");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("personen");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PERSONEN));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PERSONEN), element));
				out.print(" ");
			}
			printCountingMap.put("personen", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Personen.");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_StoffTag(com.github.funthomas424242.rezeptsammler.rezept.StoffTag element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.STOFF_TAG__STOFF));
		printCountingMap.put("stoff", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Stoff:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("stoff");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.STOFF_TAG__STOFF));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.STOFF_TAG__STOFF), element));
				out.print(" ");
			}
			printCountingMap.put("stoff", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag(com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BENUTZER_TAG__BEZEICHNUNG));
		printCountingMap.put("bezeichnung", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Tag:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("bezeichnung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BENUTZER_TAG__BEZEICHNUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BENUTZER_TAG__BEZEICHNUNG), element));
				out.print(" ");
			}
			printCountingMap.put("bezeichnung", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag(com.github.funthomas424242.rezeptsammler.rezept.DiaetTag element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.DIAET_TAG__DIAET));
		printCountingMap.put("diaet", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Di\u00e4t:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("diaet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.DIAET_TAG__DIAET));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.DIAET_TAG__DIAET), element));
				out.print(" ");
			}
			printCountingMap.put("diaet", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef(com.github.funthomas424242.rezeptsammler.rezept.ProduktRef element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__MENGE));
		printCountingMap.put("menge", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT));
		printCountingMap.put("produkt", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("ProduktRef:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("produkt");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProduktRefProduktReferenceResolver().deResolve((com.github.funthomas424242.rezeptsammler.rezept.Produkt) o, element, (EReference) element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT)), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT), element));
				out.print(" ");
			}
			printCountingMap.put("produkt", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Menge:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("menge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__MENGE));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__MENGE), element));
				out.print(" ");
			}
			printCountingMap.put("menge", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("mal.");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Zutat(com.github.funthomas424242.rezeptsammler.rezept.Zutat element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__MENGE));
		printCountingMap.put("menge", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Zutat:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__NAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("menge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__MENGE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("menge", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge(com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__BETRAG));
		printCountingMap.put("betrag", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__EINHEIT));
		printCountingMap.put("einheit", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__DETAILS));
		printCountingMap.put("details", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Menge:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("betrag");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__BETRAG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__BETRAG), element));
				out.print(" ");
			}
			printCountingMap.put("betrag", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("details");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__DETAILS));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__DETAILS), element));
				out.print(" ");
			}
			printCountingMap.put("details", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("einheit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__EINHEIT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__EINHEIT), element));
				out.print(" ");
			}
			printCountingMap.put("einheit", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge(com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.UNBESTIMMTE_MENGE__MENGE));
		printCountingMap.put("menge", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("menge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.UNBESTIMMTE_MENGE__MENGE));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.UNBESTIMMTE_MENGE__MENGE), element));
				out.print(" ");
			}
			printCountingMap.put("menge", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt(com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG));
		printCountingMap.put("beschreibung", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__NOTIZ));
		printCountingMap.put("notiz", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Aktion:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("beschreibung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG), element));
				out.print(" ");
			}
			printCountingMap.put("beschreibung", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("notiz");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__NOTIZ));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("notiz", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Tipp(com.github.funthomas424242.rezeptsammler.rezept.Tipp element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.TIPP__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Tipp:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.TIPP__TEXT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.TIPP__TEXT), element));
				out.print(" ");
			}
			printCountingMap.put("text", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Kommentar(com.github.funthomas424242.rezeptsammler.rezept.Kommentar element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.KOMMENTAR__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Kommentar:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.KOMMENTAR__TEXT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.KOMMENTAR__TEXT), element));
				out.print(" ");
			}
			printCountingMap.put("text", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung(com.github.funthomas424242.rezeptsammler.rezept.Anmerkung element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ANMERKUNG__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Anmerkung:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ANMERKUNG__TEXT));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ANMERKUNG__TEXT), element));
				out.print(" ");
			}
			printCountingMap.put("text", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle(com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__BESCHREIBUNG));
		printCountingMap.put("beschreibung", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART));
		printCountingMap.put("modifikationsArt", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("\u00fcbernommen");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("modifikationsArt");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART), element));
				out.print(" ");
			}
			printCountingMap.put("modifikationsArt", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("aus");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("beschreibung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__BESCHREIBUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__BESCHREIBUNG), element));
				out.print(" ");
			}
			printCountingMap.put("beschreibung", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle(com.github.funthomas424242.rezeptsammler.rezept.Personenquelle element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG));
		printCountingMap.put("personenBeschreibung", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("\u00fcberliefert");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("von");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("personenBeschreibung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG), element));
				out.print(" ");
			}
			printCountingMap.put("personenBeschreibung", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Bild(com.github.funthomas424242.rezeptsammler.rezept.Bild element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__BESCHREIBUNG));
		printCountingMap.put("beschreibung", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__LIZENZ));
		printCountingMap.put("lizenz", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__URHEBER));
		printCountingMap.put("urheber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__ABLAGE_ORT));
		printCountingMap.put("ablageOrt", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Bild:");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ablageOrt");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__ABLAGE_ORT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("ablageOrt", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Bild_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Bild_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_com_github_funthomas424242_rezeptsammler_rezept_Bild_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Bild_0(com.github.funthomas424242.rezeptsammler.rezept.Bild element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Text:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("beschreibung");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__BESCHREIBUNG));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__BESCHREIBUNG), element));
				out.print(" ");
			}
			printCountingMap.put("beschreibung", count - 1);
		}
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Bild_1(com.github.funthomas424242.rezeptsammler.rezept.Bild element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Lizenz:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("lizenz");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__LIZENZ));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__LIZENZ), element));
				out.print(" ");
			}
			printCountingMap.put("lizenz", count - 1);
		}
	}
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_Bild_2(com.github.funthomas424242.rezeptsammler.rezept.Bild element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Urheber:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("urheber");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__URHEBER));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__URHEBER), element));
				out.print(" ");
			}
			printCountingMap.put("urheber", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad(com.github.funthomas424242.rezeptsammler.rezept.InternetPfad element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.INTERNET_PFAD__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("URL:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.INTERNET_PFAD__URL));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.INTERNET_PFAD__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	
	
	public void print_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad(com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LOKALER_PFAD__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FileName:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("fileName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LOKALER_PFAD__FILE_NAME));
			if (o != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LOKALER_PFAD__FILE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("fileName", count - 1);
		}
	}
	
	
}
