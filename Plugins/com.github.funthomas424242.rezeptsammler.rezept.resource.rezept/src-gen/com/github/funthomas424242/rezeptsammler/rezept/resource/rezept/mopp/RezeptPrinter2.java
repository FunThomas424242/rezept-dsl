/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

public class RezeptPrinter2 implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextPrinter {
	
	protected class PrintToken {
		
		private String text;
		private String tokenName;
		private EObject container;
		
		public PrintToken(String text, String tokenName, EObject container) {
			this.text = text;
			this.tokenName = tokenName;
			this.container = container;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
		public EObject getContainer() {
			return container;
		}
		
		public String toString() {
			return "'" + text + "' [" + tokenName + "]";
		}
		
	}
	
	/**
	 * The PrintCountingMap keeps tracks of the values that must be printed for each
	 * feature of an EObject. It is also used to store the indices of all values that
	 * have been printed. This knowledge is used to avoid printing values twice. We
	 * must store the concrete indices of the printed values instead of basically
	 * counting them, because values may be printed in an order that differs from the
	 * order in which they are stored in the EObject's feature.
	 */
	protected class PrintCountingMap {
		
		private Map<String, List<Object>> featureToValuesMap = new LinkedHashMap<String, List<Object>>();
		private Map<String, Set<Integer>> featureToPrintedIndicesMap = new LinkedHashMap<String, Set<Integer>>();
		
		public void setFeatureValues(String featureName, List<Object> values) {
			featureToValuesMap.put(featureName, values);
			// If the feature does not have values it won't be printed. An entry in
			// 'featureToPrintedIndicesMap' is therefore not needed in this case.
			if (values != null) {
				featureToPrintedIndicesMap.put(featureName, new LinkedHashSet<Integer>());
			}
		}
		
		public Set<Integer> getIndicesToPrint(String featureName) {
			return featureToPrintedIndicesMap.get(featureName);
		}
		
		public void addIndexToPrint(String featureName, int index) {
			featureToPrintedIndicesMap.get(featureName).add(index);
		}
		
		public int getCountLeft(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal terminal) {
			EStructuralFeature feature = terminal.getFeature();
			String featureName = feature.getName();
			List<Object> totalValuesToPrint = featureToValuesMap.get(featureName);
			Set<Integer> printedIndices = featureToPrintedIndicesMap.get(featureName);
			if (totalValuesToPrint == null) {
				return 0;
			}
			if (feature instanceof EAttribute) {
				// for attributes we do not need to check the type, since the CS languages does
				// not allow type restrictions for attributes.
				return totalValuesToPrint.size() - printedIndices.size();
			} else if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				if (!reference.isContainment()) {
					// for non-containment references we also do not need to check the type, since the
					// CS languages does not allow type restrictions for these either.
					return totalValuesToPrint.size() - printedIndices.size();
				}
			}
			// now we're left with containment references for which we check the type of the
			// objects to print
			List<Class<?>> allowedTypes = getAllowedTypes(terminal);
			Set<Integer> indicesWithCorrectType = new LinkedHashSet<Integer>();
			int index = 0;
			for (Object valueToPrint : totalValuesToPrint) {
				for (Class<?> allowedType : allowedTypes) {
					if (allowedType.isInstance(valueToPrint)) {
						indicesWithCorrectType.add(index);
					}
				}
				index++;
			}
			indicesWithCorrectType.removeAll(printedIndices);
			return indicesWithCorrectType.size();
		}
		
		public int getNextIndexToPrint(String featureName) {
			int printedValues = featureToPrintedIndicesMap.get(featureName).size();
			return printedValues;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	private final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEClassUtil eClassUtil = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEClassUtil();
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource;
	
	private Map<?, ?> options;
	private OutputStream outputStream;
	private String encoding = System.getProperty("file.encoding");
	protected List<PrintToken> tokenOutputStream;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolverFactory tokenResolverFactory = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether tokens have already been printed for some object.
	 * The flag is set to false whenever printing of an EObject tree is started. The
	 * status of the flag is used to avoid printing default token space in front of
	 * the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	/**
	 * This flag is used to indicate whether the number of tabs before the current
	 * object has been set for the current object. The flag is needed, because setting
	 * the number of tabs must be performed when the first token of the contained
	 * element is printed.
	 */
	private boolean startedPrintingContainedObject;
	
	public RezeptPrinter2(OutputStream outputStream, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(EObject element) throws IOException {
		tokenOutputStream = new ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		startedPrintingContainedObject = false;
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement>  formattingElements = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(element, formattingElements, layoutInformations, eofLayoutInformation);
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(EObject element, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Absatz) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_2, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Autor) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Lizenz) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_4, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.RezeptImport) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_5, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.ProduktImport) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_7, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Produktliste) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_8, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Produkt) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Preis) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_10, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Rezept) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.StoffTag) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_12, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_13, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.DiaetTag) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_14, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.ProduktRef) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Zutat) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_16, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_18, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_19, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Tipp) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_20, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Kommentar) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_21, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Anmerkung) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_22, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Personenquelle) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.Bild) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.InternetPfad) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_26, foundFormattingElements);
			return;
		}
		if (element instanceof com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad) {
			printInternal(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_27, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(EObject eObject, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement ruleElement, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements) {
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator getDecoratorTree(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement syntaxElement) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator[] childDecorators = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator decorator = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator decorator, EObject eObject) {
		PrintCountingMap printCountingMap = initializePrintCountingMap(eObject);
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator> keywordsToPrint = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference held by
	 * the given EObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator decorator, EObject eObject, PrintCountingMap printCountingMap, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement syntaxElement = decorator.getDecoratedElement();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator> subKeywordsToPrint = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal terminal = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal) syntaxElement;
				EStructuralFeature feature = terminal.getFeature();
				if (feature == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				String featureName = feature.getName();
				int countLeft = printCountingMap.getCountLeft(terminal);
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					// normally we print the element at the next index
					int indexToPrint = printCountingMap.getNextIndexToPrint(featureName);
					// But, if there are type restrictions for containments, we must choose an index
					// of an element that fits (i.e., which has the correct type)
					if (terminal instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment containment = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment) terminal;
						indexToPrint = findElementWithCorrectType(eObject, feature, printCountingMap.getIndicesToPrint(featureName), containment);
					}
					if (indexToPrint >= 0) {
						decorator.addIndexToPrint(indexToPrint);
						printCountingMap.addIndexToPrint(featureName, indexToPrint);
						keepDecorating = true;
					}
				}
			}
			if (syntaxElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice) {
				// for choices we do print only the choice which does print at least one feature
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator childToPrint = null;
				for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR || cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE || cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	private int findElementWithCorrectType(EObject eObject, EStructuralFeature feature, Set<Integer> indicesToPrint, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment containment) {
		// By default the type restrictions that are defined in the CS definition are
		// considered when printing models. You can change this behavior by setting the
		// 'ignoreTypeRestrictionsForPrinting' option to true.
		boolean ignoreTypeRestrictions = false;
		EClass[] allowedTypes = containment.getAllowedTypes();
		Object value = eObject.eGet(feature);
		if (value instanceof List<?>) {
			List<?> valueList = (List<?>) value;
			int listSize = valueList.size();
			for (int index = 0; index < listSize; index++) {
				if (indicesToPrint.contains(index)) {
					continue;
				}
				Object valueAtIndex = valueList.get(index);
				if (eClassUtil.isInstance(valueAtIndex, allowedTypes) || ignoreTypeRestrictions) {
					return index;
				}
			}
		} else {
			if (eClassUtil.isInstance(value, allowedTypes) || ignoreTypeRestrictions) {
				return 0;
			}
		}
		return -1;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference held by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator decorator, EObject eObject, PrintCountingMap printCountingMap) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal terminal = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal) syntaxElement;
			EStructuralFeature feature = terminal.getFeature();
			if (feature == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.getCountLeft(terminal);
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator decorator, EObject eObject, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement printElement = decorator.getDecoratedElement();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality = printElement.getCardinality();
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> cloned = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword) {
					printKeyword(eObject, (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder) {
					com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder placeholder = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment) {
					com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment containment = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptBooleanTerminal) {
					com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptBooleanTerminal booleanTerminal = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptEnumerationTerminal) {
					com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptEnumerationTerminal enumTerminal = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptWhiteSpace) {
				foundFormattingElements.add((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptWhiteSpace) printElement);
			}
			if (printElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptLineBreak) {
				foundFormattingElements.add((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptLineBreak) printElement);
			}
			for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice) {
					break;
				}
			}
			if (cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.ONE || cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.STAR || cardinality == com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(EObject eObject, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword keyword, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation keywordLayout = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, keywordLayout);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.escapeToANTLRKeyword(value) + "'", eObject));
	}
	
	public void printFeature(EObject eObject, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder placeholder, int count, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof EAttribute) {
			printAttribute(eObject, (EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(EObject eObject, EAttribute attribute, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder placeholder, int index, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		String result = null;
		Object attributeValue = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getFeatureValue(eObject, attribute, index);
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName(), eObject));
		}
	}
	
	
	public void printBooleanTerminal(EObject eObject, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptBooleanTerminal booleanTerminal, int index, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		EAttribute attribute = booleanTerminal.getAttribute();
		String result = null;
		Object attributeValue = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getFeatureValue(eObject, attribute, index);
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printEnumerationTerminal(EObject eObject, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptEnumerationTerminal enumTerminal, int index, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		EAttribute attribute = enumTerminal.getAttribute();
		String result = null;
		Object attributeValue = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getFeatureValue(eObject, attribute, index);
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the enumeration attribute is converted to its textual
			// representation using the literals of the enumeration terminal
			assert attributeValue instanceof Enumerator;
			result = enumTerminal.getText(((Enumerator) attributeValue).getName());
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printContainedObject(EObject eObject, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment containment, int index, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		EStructuralFeature reference = containment.getFeature();
		Object o = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getFeatureValue(eObject, reference, index);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		startedPrintingContainedObject = false;
		currentTabs = 0;
		doPrint((EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(EObject eObject, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			if (layoutInformations != null) {
				layoutInformations.remove(layoutInformation);
			}
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null, eObject));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			setTabsBeforeCurrentObject(0);
			return;
		}
		int printedTabs = 0;
		if (foundFormattingElements.size() > 0) {
			for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptWhiteSpace) {
					int amount = ((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(createSpaceToken(eObject));
					}
				}
				if (foundFormattingElement instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptLineBreak) {
					currentTabs = ((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptLineBreak) foundFormattingElement).getTabs();
					printedTabs += currentTabs;
					tokenOutputStream.add(createNewLineToken(eObject));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(createTabToken(eObject));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null, eObject));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		setTabsBeforeCurrentObject(printedTabs);
	}
	
	private void setTabsBeforeCurrentObject(int tabs) {
		if (startedPrintingContainedObject) {
			return;
		}
		tabsBeforeCurrentObject = tabsBeforeCurrentObject + tabs;
		startedPrintingContainedObject = true;
	}
	
	@SuppressWarnings("unchecked")
	public void printReference(EObject eObject, EReference reference, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptPlaceholder placeholder, int index, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement> foundFormattingElements, List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getFeatureValue(eObject, reference, index, false);
		// first add layout before the reference
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation referenceLayout = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, referenceLayout);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof EObject) {
			EObject eObjectToDeResolve = (EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				// If the proxy was created by EMFText, we can try to recover the identifier from
				// the proxy URI
				if (deresolvedReference != null && deresolvedReference.startsWith(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((EObject) referencedObject, eObject, reference);
		}
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName, eObject));
	}
	
	@SuppressWarnings("unchecked")
	public PrintCountingMap initializePrintCountingMap(EObject eObject) {
		// The PrintCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		PrintCountingMap printCountingMap = new PrintCountingMap();
		List<EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (EStructuralFeature feature : features) {
			// We get the feature value without resolving it, because resolving is not
			// required to count the number of elements that are referenced by the feature.
			// Moreover, triggering reference resolving is not desired here, because we'd also
			// like to print models that contain unresolved references.
			Object featureValue = eObject.eGet(feature, false);
			if (featureValue != null) {
				if (featureValue instanceof List<?>) {
					printCountingMap.setFeatureValues(feature.getName(), (List<Object>) featureValue);
				} else {
					printCountingMap.setFeatureValues(feature.getName(), Collections.singletonList(featureValue));
				}
			} else {
				printCountingMap.setFeatureValues(feature.getName(), null);
			}
		}
		return printCountingMap;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource getResource() {
		return resource;
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
	
	protected com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformationAdapter getLayoutInformationAdapter(EObject element) {
		for (Adapter adapter : element.eAdapters()) {
			if (adapter instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformationAdapter) {
				return (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformationAdapter) adapter;
			}
		}
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformationAdapter newAdapter = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation getLayoutInformation(List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement syntaxElement, Object object, EObject container) {
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				}
				// The layout information adapter must only try to resolve the object it refers
				// to, if we compare with a non-proxy object. If we're printing a resource that
				// contains proxy objects, resolving must not be triggered.
				boolean isNoProxy = true;
				if (object instanceof EObject) {
					EObject eObject = (EObject) object;
					isNoProxy = !eObject.eIsProxy();
				}
				if (isSame(object, layoutInformation.getObject(container, isNoProxy))) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	public List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> getCopyOfLayoutInformation(EObject eObject) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation> layoutInformations = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(PrintWriter writer) throws IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * <p>
	 * Prints the current tokenOutputStream to the given writer.
	 * </p>
	 * 
	 * <p>
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * </p>
	 * 
	 * <p>
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 * </p>
	 */
	public void printSmart(PrintWriter writer) throws IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		char lastCharWritten = ' ';
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				char[] charArray = currentBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextScanner scanner = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken> tempTokens = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken>();
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				char[] charArray = validBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// print separating whitespace
				// if no whitespace (or tab or linebreak) is already there
				if (lastCharWritten != ' ' && lastCharWritten != '\t' && lastCharWritten != '\n' && lastCharWritten != '\r') {
					lastCharWritten = ' ';
					writer.write(lastCharWritten);
				}
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
	private boolean isSame(Object o1, Object o2) {
		if (o1 instanceof String || o1 instanceof Integer || o1 instanceof Long || o1 instanceof Byte || o1 instanceof Short || o1 instanceof Float || o2 instanceof Double) {
			return o1.equals(o2);
		}
		return o1 == o2;
	}
	
	protected List<Class<?>> getAllowedTypes(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal terminal) {
		List<Class<?>> allowedTypes = new ArrayList<Class<?>>();
		allowedTypes.add(terminal.getFeature().getEType().getInstanceClass());
		if (terminal instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment printingContainment = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainment) terminal;
			EClass[] typeRestrictions = printingContainment.getAllowedTypes();
			if (typeRestrictions != null && typeRestrictions.length > 0) {
				allowedTypes.clear();
				for (EClass eClass : typeRestrictions) {
					allowedTypes.add(eClass.getInstanceClass());
				}
			}
		}
		return allowedTypes;
	}
	
	protected PrintToken createSpaceToken(EObject container) {
		return new PrintToken(" ", null, container);
	}
	
	protected PrintToken createTabToken(EObject container) {
		return new PrintToken("\t", null, container);
	}
	
	protected PrintToken createNewLineToken(EObject container) {
		if (options != null) {
			Object lineBreaks = options.get(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptions.LINE_DELIMITER_FOR_PRINTING);
			if (lineBreaks != null && lineBreaks instanceof String) {
				return new PrintToken((String) lineBreaks, null, container);
			}
		}
		return new PrintToken(NEW_LINE, null, container);
	}
	
}
