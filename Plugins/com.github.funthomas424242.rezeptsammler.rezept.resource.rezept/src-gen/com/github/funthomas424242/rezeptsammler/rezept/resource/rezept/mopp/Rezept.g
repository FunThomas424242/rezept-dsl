grammar Rezept;

options {
	superClass = RezeptANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;
}

@lexer::members {
	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
	
	public void reportError(RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
	}
}
@header{
	package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;
	
	import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.antlr.runtime3_4_0.ANTLRInputStream;
import org.antlr.runtime3_4_0.BitSet;
import org.antlr.runtime3_4_0.CommonToken;
import org.antlr.runtime3_4_0.CommonTokenStream;
import org.antlr.runtime3_4_0.IntStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.RecognitionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
}

@members{
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolverFactory tokenResolverFactory = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal> expectedElements = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected List<RecognitionException> lexerExceptions = Collections.synchronizedList(new ArrayList<RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected List<Integer> lexerExceptionPositions = Collections.synchronizedList(new ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	List<EObject> incompleteObjects = new ArrayList<EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap;
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxErrorMessageConverter syntaxErrorMessageConverter = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxErrorMessageConverter(tokenNames);
	
	@Override
	public void reportError(RecognitionException re) {
		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
	}
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>() {
			public boolean execute(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptProblem() {
					public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity getSeverity() {
						return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity.ERROR;
					}
					public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType getType() {
						return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	protected void addErrorToResource(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLocalizedMessage message) {
		if (message == null) {
			return;
		}
		addErrorToResource(message.getMessage(), message.getColumn(), message.getLine(), message.getCharStart(), message.getCharEnd());
	}
	
	public void addExpectedElement(EClass eClass, int expectationStartIndex, int expectationEndIndex) {
		for (int expectationIndex = expectationStartIndex; expectationIndex <= expectationEndIndex; expectationIndex++) {
			addExpectedElement(eClass, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectationConstants.EXPECTATIONS[expectationIndex]);
		}
	}
	
	public void addExpectedElement(EClass eClass, int expectationIndex) {
		addExpectedElement(eClass, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectationConstants.EXPECTATIONS[expectationIndex]);
	}
	
	public void addExpectedElement(EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement terminal = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFollowSetProvider.TERMINALS[terminalID];
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[] containmentFeatures = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFollowSetProvider.LINKS[ids[i]];
		}
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainmentTrace containmentTrace = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainmentTrace(eClass, containmentFeatures);
		EObject container = getLastIncompleteElement();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedElement = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(EObject element) {
	}
	
	protected void copyLocalizationInfos(final EObject source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>() {
			public boolean execute(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource) {
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final CommonToken source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>() {
			public boolean execute(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource) {
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>() {
			public boolean execute(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource) {
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextParser createInstance(InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new RezeptParser(new CommonTokenStream(new RezeptLexer(new ANTLRInputStream(actualInputStream))));
			} else {
				return new RezeptParser(new CommonTokenStream(new RezeptLexer(new ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (IOException e) {
			new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public RezeptParser() {
		super(null);
	}
	
	protected EObject doParse() throws RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((RezeptLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((RezeptLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof EClass) {
			EClass type = (EClass) typeObject;
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Absatz.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Autor.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Autor();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Lizenz.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.RezeptImport.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.ProduktImport.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Produktliste.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Produkt.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Preis.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Preis();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Rezept.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.StoffTag.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.DiaetTag.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.ProduktRef.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Zutat.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Tipp.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Kommentar.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Anmerkung.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Personenquelle.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.Bild.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_Bild();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.InternetPfad.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad();
			}
			if (type.getInstanceClass() == com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad.class) {
				return parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad();
			}
		}
		throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(IntStream arg0, RecognitionException arg1, int arg2, BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptParseResult parse() {
		// Reset parser state
		terminateParsing = false;
		postParseCommands = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>>();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptParseResult parseResult = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptParseResult();
		if (disableLocationMap) {
			locationMap = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptDevNullLocationMap();
		} else {
			locationMap = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLocationMap();
		}
		// Run parser
		try {
			EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
				parseResult.setLocationMap(locationMap);
			}
		} catch (RecognitionException re) {
			addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
		} catch (IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (RecognitionException re : lexerExceptions) {
			addErrorToResource(syntaxErrorMessageConverter.translateLexicalError(re, lexerExceptions, lexerExceptionPositions));
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal> parseToExpectedElements(EClass type, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptParseResult result = parse();
		for (EObject incompleteObject : incompleteObjects) {
			Lexer lexer = (Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		Set<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal> currentFollowSet = new LinkedHashSet<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal>();
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal> newFollowSet = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 200;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			CommonToken nextToken = (CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptPair<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptPair<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[]> newFollowerPair : newFollowers) {
							com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement newFollower = newFollowerPair.getLeft();
							EObject container = getLastIncompleteElement();
							com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainmentTrace containmentTrace = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptContainmentTrace(null, newFollowerPair.getRight());
							com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal newFollowTerminal = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal(container, newFollower, followSetID, containmentTrace);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			CommonToken tokenAtIndex = (CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof EObject) {
			this.incompleteObjects.add((EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.remove(object);
		}
		if (object instanceof EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, 0, 2);
		expectedElementsIndexOfLastCompleteElement = 2;
	}
	(
		c0 = parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung{ element = c0; }
		|  		c1 = parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste{ element = c1; }
		|  		c2 = parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste{ element = c2; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung returns [com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung element = null]
@init{
}
:
	a0 = 'RezeptSammlung' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 3);
	}
	
	a1 = '{' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4);
	}
	
	a2 = 'groupId' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5);
	}
	
	a3 = '=' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 6);
	}
	
	(
		a4 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__GROUP_ID), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_4, resolved, true);
				copyLocalizationInfos((CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 7);
	}
	
	a5 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 8);
	}
	
	a6 = 'artifactId' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 9);
	}
	
	a7 = '=' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 10);
	}
	
	(
		a8 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
				startIncompleteElement(element);
			}
			if (a8 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__ARTIFACT_ID), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_8, resolved, true);
				copyLocalizationInfos((CommonToken) a8, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 11);
	}
	
	a9 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_9, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 12);
	}
	
	a10 = 'version' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_10, null, true);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 13);
	}
	
	a11 = '=' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_11, null, true);
		copyLocalizationInfos((CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 14);
	}
	
	(
		a12 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
				startIncompleteElement(element);
			}
			if (a12 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__VERSION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_12, resolved, true);
				copyLocalizationInfos((CommonToken) a12, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 15);
	}
	
	a13 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_13, null, true);
		copyLocalizationInfos((CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 16);
	}
	
	a14 = 'Media Folder:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_14, null, true);
		copyLocalizationInfos((CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 17);
	}
	
	(
		a15 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
				startIncompleteElement(element);
			}
			if (a15 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a15).getLine(), ((CommonToken) a15).getCharPositionInLine(), ((CommonToken) a15).getStartIndex(), ((CommonToken) a15).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__RESOURCES_DIR), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_15, resolved, true);
				copyLocalizationInfos((CommonToken) a15, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 18);
	}
	
	a16 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_16, null, true);
		copyLocalizationInfos((CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 19, 20);
	}
	
	(
		(
			a17 = 'siteURL' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_17_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 21);
			}
			
			a18 = '=' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_17_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 22);
			}
			
			(
				a19 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
						startIncompleteElement(element);
					}
					if (a19 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a19).getLine(), ((CommonToken) a19).getCharPositionInLine(), ((CommonToken) a19).getStartIndex(), ((CommonToken) a19).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__SITE_URL), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_17_0_0_2, resolved, true);
						copyLocalizationInfos((CommonToken) a19, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 23);
			}
			
			a20 = ';' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_17_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a20, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 24);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 25);
	}
	
	a21 = '}' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_18, null, true);
		copyLocalizationInfos((CommonToken)a21, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung(), 26);
	}
	
	(
		a22_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
				startIncompleteElement(element);
			}
			if (a22_0 != null) {
				if (a22_0 != null) {
					Object value = a22_0;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PROJEKT_BESCHREIBUNG__BUCH), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_19, a22_0, true);
				copyLocalizationInfos(a22_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung returns [com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung element = null]
@init{
}
:
	a0 = 'Buch' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 27);
	}
	
	a1 = '{' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 28);
		addExpectedElement(null, 29);
	}
	
	(
		(
			a2_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__IMPORTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 30);
		addExpectedElement(null, 31);
	}
	
	a3 = 'Titel:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 32);
	}
	
	(
		a4 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__TITEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__TITEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_4, resolved, true);
				copyLocalizationInfos((CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 33);
	}
	
	a5 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 34);
	}
	
	(
		(
			a6_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Autor			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
					startIncompleteElement(element);
				}
				if (a6_0 != null) {
					if (a6_0 != null) {
						Object value = a6_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__AUTOREN, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_6, a6_0, true);
					copyLocalizationInfos(a6_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 35);
		addExpectedElement(null, 36);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 37);
		addExpectedElement(null, 38, 39);
	}
	
	(
		(
			a7 = 'Vorwort:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 40);
			}
			
			(
				a8 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
						startIncompleteElement(element);
					}
					if (a8 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__VORWORT), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__VORWORT), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_7_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 41, 42);
				addExpectedElement(null, 43, 44);
			}
			
			(
				(
					a9_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz					{
						if (terminateParsing) {
							throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
						}
						if (element == null) {
							element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
							startIncompleteElement(element);
						}
						if (a9_0 != null) {
							if (a9_0 != null) {
								Object value = a9_0;
								addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__ABSATZ, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_7_0_0_2, a9_0, true);
							copyLocalizationInfos(a9_0, element);
						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 45, 46);
				addExpectedElement(null, 47, 48);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 49);
		addExpectedElement(null, 50, 51);
	}
	
	(
		(
			a10_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
					startIncompleteElement(element);
				}
				if (a10_0 != null) {
					if (a10_0 != null) {
						Object value = a10_0;
						element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__LIZENZ), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_8, a10_0, true);
					copyLocalizationInfos(a10_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 52, 53);
	}
	
	(
		(
			a11 = 'Ver\u00f6ffentlicht am:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 54);
			}
			
			(
				a12 = DATUM				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
						startIncompleteElement(element);
					}
					if (a12 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DATUM");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BUCH_BESCHREIBUNG__DATUM_PUBLISHED), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_9_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a12, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 55);
			}
			
			a13 = '.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_9_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 56);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 57);
	}
	
	a14 = '}' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_10, null, true);
		copyLocalizationInfos((CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz returns [com.github.funthomas424242.rezeptsammler.rezept.Absatz element = null]
@init{
}
:
	a0 = 'Absatz:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAbsatz();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_2_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 58, 59);
	}
	
	(
		(
			(
				a1 = QUOTED_6161_6161				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAbsatz();
						startIncompleteElement(element);
					}
					if (a1 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_6161_6161");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TITEL), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TITEL), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_2_0_0_1_0_0_0, resolved, true);
						copyLocalizationInfos((CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 60);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 61);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAbsatz();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TEXT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ABSATZ__TEXT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_2_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 62, 63);
		addExpectedElement(null, 64, 65);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Autor returns [com.github.funthomas424242.rezeptsammler.rezept.Autor element = null]
@init{
}
:
	a0 = 'Autor:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 66);
	}
	
	a1 = '{' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 67);
	}
	
	a2 = 'Vorname:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 68);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__VORNAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__VORNAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_3, resolved, true);
				copyLocalizationInfos((CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 69);
	}
	
	a4 = 'Nachname:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 70);
	}
	
	(
		a5 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__NACHNAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__NACHNAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_5, resolved, true);
				copyLocalizationInfos((CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 71, 72);
	}
	
	(
		(
			a6 = 'Organisation:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 73);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__ORGANISATIONS_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__ORGANISATIONS_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_6_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 74);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 75);
	}
	
	a8 = 'ModifikationsNotiz:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 76);
	}
	
	(
		a9 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
				startIncompleteElement(element);
			}
			if (a9 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a9).getLine(), ((CommonToken) a9).getCharPositionInLine(), ((CommonToken) a9).getStartIndex(), ((CommonToken) a9).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.AUTOR__MODIFIKATIONS_NOTIZ), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_8, resolved, true);
				copyLocalizationInfos((CommonToken) a9, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 77);
	}
	
	a10 = '}' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_9, null, true);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 78);
		addExpectedElement(null, 79);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 80);
		addExpectedElement(null, 81, 82);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz returns [com.github.funthomas424242.rezeptsammler.rezept.Lizenz element = null]
@init{
}
:
	a0 = 'Lizenzhinweis:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLizenz();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_4_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 83);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLizenz();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__HINWEIS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__HINWEIS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_4_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 84, 86);
	}
	
	(
		(
			a2 = 'Lizenztext:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLizenz();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_4_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 87);
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLizenz();
						startIncompleteElement(element);
					}
					if (a3 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__TEXT), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LIZENZ__TEXT), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_4_0_0_2_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 88, 89);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 90, 91);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport returns [com.github.funthomas424242.rezeptsammler.rezept.RezeptImport element = null]
@init{
}
:
	a0 = 'import rezepte' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptImport();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_5_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 92);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptImport();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste proxy = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
				collectHiddenTokens(element);
				registerContextDependentProxy(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContextDependentURIFragmentFactory<com.github.funthomas424242.rezeptsammler.rezept.RezeptImport, com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRezeptImportImportedResourceReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT_IMPORT__IMPORTED_RESOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_5_0_0_1, proxy, true);
				copyLocalizationInfos((CommonToken) a1, element);
				copyLocalizationInfos((CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 93);
	}
	
	a2 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptImport();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_5_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 94);
		addExpectedElement(null, 95);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste returns [com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste element = null]
@init{
}
:
	a0 = 'Rezeptliste' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 96);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 97);
	}
	
	a2 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 98, 99);
	}
	
	(
		(
			a3_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
					startIncompleteElement(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__IMPORTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6_0_0_3, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 100, 101);
	}
	
	(
		(
			a4_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
					startIncompleteElement(element);
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						Object value = a4_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPTLISTE__REZEPTE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6_0_0_4, a4_0, true);
					copyLocalizationInfos(a4_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 102);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport returns [com.github.funthomas424242.rezeptsammler.rezept.ProduktImport element = null]
@init{
}
:
	a0 = 'import produkte' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktImport();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_7_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 103);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktImport();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				com.github.funthomas424242.rezeptsammler.rezept.Produktliste proxy = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktliste();
				collectHiddenTokens(element);
				registerContextDependentProxy(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContextDependentURIFragmentFactory<com.github.funthomas424242.rezeptsammler.rezept.ProduktImport, com.github.funthomas424242.rezeptsammler.rezept.Produktliste>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProduktImportImportedResourceReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_IMPORT__IMPORTED_RESOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_7_0_0_1, proxy, true);
				copyLocalizationInfos((CommonToken) a1, element);
				copyLocalizationInfos((CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 104);
	}
	
	a2 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktImport();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_7_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 105, 106);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste returns [com.github.funthomas424242.rezeptsammler.rezept.Produktliste element = null]
@init{
}
:
	a0 = 'Produktliste' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktliste();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_8_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 107);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktliste();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_8_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 108);
	}
	
	a2 = ';' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktliste();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_8_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(), 109);
	}
	
	(
		(
			a3_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktliste();
					startIncompleteElement(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKTLISTE__PRODUKTE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_8_0_0_3, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(), 110);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt returns [com.github.funthomas424242.rezeptsammler.rezept.Produkt element = null]
@init{
}
:
	a0 = 'Produkt' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 111);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 112);
	}
	
	a2 = '{' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 113);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 114, 115);
	}
	
	(
		(
			a3 = 'Verpackung:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 116);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__VERPACKUNG), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
						}
						com.github.funthomas424242.rezeptsammler.rezept.Verpackung resolved = (com.github.funthomas424242.rezeptsammler.rezept.Verpackung) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__VERPACKUNG), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_3_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 117);
			}
			
			a5 = '.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_3_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 118, 119);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 120, 121);
	}
	
	(
		a6_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Menge		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
				startIncompleteElement(element);
			}
			if (a6_0 != null) {
				if (a6_0 != null) {
					Object value = a6_0;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__MENGE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_4, a6_0, true);
				copyLocalizationInfos(a6_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 122, 123);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 124);
		addExpectedElement(null, 125, 127);
	}
	
	(
		(
			a7 = 'EAN:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 128);
			}
			
			(
				a8 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
						startIncompleteElement(element);
					}
					if (a8 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__EAN), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__EAN), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_5_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 129);
			}
			
			a9 = '.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_5_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 130);
				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 131);
				addExpectedElement(null, 132, 134);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 135);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 136);
		addExpectedElement(null, 137, 139);
	}
	
	(
		(
			a10 = 'UBA:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 140);
			}
			
			(
				a11 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
						startIncompleteElement(element);
					}
					if (a11 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__UBA), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a11).getLine(), ((CommonToken) a11).getCharPositionInLine(), ((CommonToken) a11).getStartIndex(), ((CommonToken) a11).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__UBA), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_6_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a11, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 141);
			}
			
			a12 = '.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_6_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 142);
				addExpectedElement(null, 143, 145);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 146);
		addExpectedElement(null, 147, 149);
	}
	
	(
		(
			a13_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Preis			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				if (a13_0 != null) {
					if (a13_0 != null) {
						Object value = a13_0;
						element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__PREIS), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_7, a13_0, true);
					copyLocalizationInfos(a13_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 150, 152);
	}
	
	(
		(
			a14 = 'H\u00e4ndler:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 153);
			}
			
			(
				a15 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
						startIncompleteElement(element);
					}
					if (a15 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HANDLER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a15).getLine(), ((CommonToken) a15).getCharPositionInLine(), ((CommonToken) a15).getStartIndex(), ((CommonToken) a15).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HANDLER), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_8_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a15, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 154);
			}
			
			a16 = '.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_8_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 155, 156);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 157, 158);
	}
	
	(
		(
			a17 = 'Hersteller:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 159);
			}
			
			(
				a18 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
						startIncompleteElement(element);
					}
					if (a18 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HERSTELLER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a18).getLine(), ((CommonToken) a18).getCharPositionInLine(), ((CommonToken) a18).getStartIndex(), ((CommonToken) a18).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__HERSTELLER), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_9_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a18, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 160);
			}
			
			a19 = '.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_9_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a19, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 161);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 162);
	}
	
	a20 = 'Letzte \u00c4nderung:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_10, null, true);
		copyLocalizationInfos((CommonToken)a20, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 163);
	}
	
	(
		a21 = DATUM		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
				startIncompleteElement(element);
			}
			if (a21 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DATUM");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a21).getLine(), ((CommonToken) a21).getCharPositionInLine(), ((CommonToken) a21).getStartIndex(), ((CommonToken) a21).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT__DATUM_LETZTE_AENDERUNG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_11, resolved, true);
				copyLocalizationInfos((CommonToken) a21, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 164);
	}
	
	a22 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_12, null, true);
		copyLocalizationInfos((CommonToken)a22, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 165);
	}
	
	a23 = '}' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_13, null, true);
		copyLocalizationInfos((CommonToken)a23, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(), 166);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Preis returns [com.github.funthomas424242.rezeptsammler.rezept.Preis element = null]
@init{
}
:
	a0 = 'Preis:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPreis();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_10_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 167);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPreis();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__BETRAG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.Float resolved = (java.lang.Float) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__BETRAG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_10_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 168);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPreis();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__WAEHRUNG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				com.github.funthomas424242.rezeptsammler.rezept.Waehrung resolved = (com.github.funthomas424242.rezeptsammler.rezept.Waehrung) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PREIS__WAEHRUNG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_10_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 169);
	}
	
	a3 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPreis();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_10_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 170, 172);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept returns [com.github.funthomas424242.rezeptsammler.rezept.Rezept element = null]
@init{
}
:
	a0 = 'Rezept' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 173);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ID), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ID), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 174);
	}
	
	a2 = '{' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 175);
	}
	
	a3 = 'Titel:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 176);
	}
	
	(
		a4 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TITEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TITEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_4, resolved, true);
				copyLocalizationInfos((CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 177);
	}
	
	a5 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 178, 179);
	}
	
	(
		(
			a6 = 'Untertitel:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 180);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__UNTERTITEL), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__UNTERTITEL), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_6_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 181);
			}
			
			a8 = '.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_6_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 182);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 183);
	}
	
	a9 = 'Kategorie:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 184);
	}
	
	(
		a10 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
				startIncompleteElement(element);
			}
			if (a10 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__KATEGORIE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a10).getLine(), ((CommonToken) a10).getCharPositionInLine(), ((CommonToken) a10).getStartIndex(), ((CommonToken) a10).getStopIndex());
				}
				com.github.funthomas424242.rezeptsammler.rezept.KategorieArt resolved = (com.github.funthomas424242.rezeptsammler.rezept.KategorieArt) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__KATEGORIE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_8, resolved, true);
				copyLocalizationInfos((CommonToken) a10, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 185);
	}
	
	a11 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_9, null, true);
		copyLocalizationInfos((CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 186, 188);
	}
	
	(
		(
			a12 = 'Quelle:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 189, 190);
			}
			
			(
				a13_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
						startIncompleteElement(element);
					}
					if (a13_0 != null) {
						if (a13_0 != null) {
							Object value = a13_0;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__QUELLE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_10_0_0_1, a13_0, true);
						copyLocalizationInfos(a13_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 191, 192);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 193, 194);
	}
	
	(
		(
			a14 = 'Ausreichend f\u00fcr' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 195);
			}
			
			(
				a15 = NUMBER				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
						startIncompleteElement(element);
					}
					if (a15 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PERSONEN), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a15).getLine(), ((CommonToken) a15).getCharPositionInLine(), ((CommonToken) a15).getStartIndex(), ((CommonToken) a15).getStopIndex());
						}
						java.lang.Long resolved = (java.lang.Long) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PERSONEN), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_11_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a15, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 196);
			}
			
			a16 = 'Personen.' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_11_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 197);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 198);
	}
	
	a17 = 'Letzte \u00c4nderung:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_12, null, true);
		copyLocalizationInfos((CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 199);
	}
	
	(
		a18 = DATUM		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
				startIncompleteElement(element);
			}
			if (a18 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DATUM");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__LETZTE_AENDERUNG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a18).getLine(), ((CommonToken) a18).getCharPositionInLine(), ((CommonToken) a18).getStartIndex(), ((CommonToken) a18).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__LETZTE_AENDERUNG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_13, resolved, true);
				copyLocalizationInfos((CommonToken) a18, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 200);
	}
	
	a19 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_14, null, true);
		copyLocalizationInfos((CommonToken)a19, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 201, 203);
	}
	
	(
		(
			a20_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Tag			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				if (a20_0 != null) {
					if (a20_0 != null) {
						Object value = a20_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__TAGS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_15, a20_0, true);
					copyLocalizationInfos(a20_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 204, 208);
	}
	
	(
		(
			a21_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				if (a21_0 != null) {
					if (a21_0 != null) {
						Object value = a21_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__PRODUKTE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_16, a21_0, true);
					copyLocalizationInfos(a21_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 209, 210);
	}
	
	(
		(
			a22_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				if (a22_0 != null) {
					if (a22_0 != null) {
						Object value = a22_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__ZUTATEN, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_17, a22_0, true);
					copyLocalizationInfos(a22_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 211, 212);
	}
	
	(
		(
			a23_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				if (a23_0 != null) {
					if (a23_0 != null) {
						Object value = a23_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__SCHRITTE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_18, a23_0, true);
					copyLocalizationInfos(a23_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 213);
		addExpectedElement(null, 214);
	}
	
	a24 = '--Zusatzinformationen--' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_19, null, true);
		copyLocalizationInfos((CommonToken)a24, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 215, 218);
		addExpectedElement(null, 219);
	}
	
	(
		(
			a25_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				if (a25_0 != null) {
					if (a25_0 != null) {
						Object value = a25_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__NOTIZEN, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_20, a25_0, true);
					copyLocalizationInfos(a25_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 220, 223);
		addExpectedElement(null, 224);
	}
	
	(
		(
			a26_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Bild			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
					startIncompleteElement(element);
				}
				if (a26_0 != null) {
					if (a26_0 != null) {
						Object value = a26_0;
						addObjectToList(element, com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.REZEPT__BILDER, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_21, a26_0, true);
					copyLocalizationInfos(a26_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 225);
		addExpectedElement(null, 226);
	}
	
	a27 = '}' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_22, null, true);
		copyLocalizationInfos((CommonToken)a27, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 227);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag returns [com.github.funthomas424242.rezeptsammler.rezept.StoffTag element = null]
@init{
}
:
	a0 = 'Stoff:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createStoffTag();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_12_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 228);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createStoffTag();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.STOFF_TAG__STOFF), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				com.github.funthomas424242.rezeptsammler.rezept.Stoff resolved = (com.github.funthomas424242.rezeptsammler.rezept.Stoff) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.STOFF_TAG__STOFF), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_12_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 229);
	}
	
	a2 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createStoffTag();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_12_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 230, 234);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag returns [com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag element = null]
@init{
}
:
	a0 = 'Tag:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBenutzerTag();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_13_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 235);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBenutzerTag();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BENUTZER_TAG__BEZEICHNUNG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BENUTZER_TAG__BEZEICHNUNG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_13_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 236);
	}
	
	a2 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBenutzerTag();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_13_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 237, 241);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag returns [com.github.funthomas424242.rezeptsammler.rezept.DiaetTag element = null]
@init{
}
:
	a0 = 'Di\u00e4t:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createDiaetTag();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_14_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 242);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createDiaetTag();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.DIAET_TAG__DIAET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				com.github.funthomas424242.rezeptsammler.rezept.DiaetArt resolved = (com.github.funthomas424242.rezeptsammler.rezept.DiaetArt) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.DIAET_TAG__DIAET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_14_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 243);
	}
	
	a2 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createDiaetTag();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_14_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 244, 248);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef returns [com.github.funthomas424242.rezeptsammler.rezept.ProduktRef element = null]
@init{
}
:
	a0 = 'ProduktRef:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 249);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				com.github.funthomas424242.rezeptsammler.rezept.Produkt proxy = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
				collectHiddenTokens(element);
				registerContextDependentProxy(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContextDependentURIFragmentFactory<com.github.funthomas424242.rezeptsammler.rezept.ProduktRef, com.github.funthomas424242.rezeptsammler.rezept.Produkt>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProduktRefProduktReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__PRODUKT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_1, proxy, true);
				copyLocalizationInfos((CommonToken) a1, element);
				copyLocalizationInfos((CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 250);
	}
	
	a2 = 'Menge:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 251);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__MENGE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				java.lang.Float resolved = (java.lang.Float) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PRODUKT_REF__MENGE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_3, resolved, true);
				copyLocalizationInfos((CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 252);
	}
	
	a4 = 'mal.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 253, 254);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat returns [com.github.funthomas424242.rezeptsammler.rezept.Zutat element = null]
@init{
}
:
	a0 = 'Zutat:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createZutat();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_16_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 255);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createZutat();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_16_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getZutat(), 256, 257);
	}
	
	(
		a2_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Menge		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createZutat();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ZUTAT__MENGE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_16_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 258, 259);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge returns [com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge element = null]
@init{
}
:
	a0 = 'Menge:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBestimmteMenge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 260);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBestimmteMenge();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__BETRAG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.Float resolved = (java.lang.Float) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__BETRAG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 261, 262);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBestimmteMenge();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__DETAILS), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__DETAILS), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17_0_0_2, resolved, true);
					copyLocalizationInfos((CommonToken) a2, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 263);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBestimmteMenge();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__EINHEIT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				com.github.funthomas424242.rezeptsammler.rezept.Masseinheit resolved = (com.github.funthomas424242.rezeptsammler.rezept.Masseinheit) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BESTIMMTE_MENGE__EINHEIT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17_0_0_3, resolved, true);
				copyLocalizationInfos((CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 264);
	}
	
	a4 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBestimmteMenge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 265, 266);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 267);
		addExpectedElement(null, 268, 270);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 271, 272);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge returns [com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge element = null]
@init{
}
:
	(
		a0 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createUnbestimmteMenge();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.UNBESTIMMTE_MENGE__MENGE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe resolved = (com.github.funthomas424242.rezeptsammler.rezept.MengenAngabe) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.UNBESTIMMTE_MENGE__MENGE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_18_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 273);
	}
	
	a1 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createUnbestimmteMenge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_18_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 274, 275);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 276);
		addExpectedElement(null, 277, 279);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 280, 281);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt returns [com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt element = null]
@init{
}
:
	a0 = 'Aktion:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createArbeitsschritt();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_19_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 282);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createArbeitsschritt();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__BESCHREIBUNG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_19_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getArbeitsschritt(), 283, 285);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 286);
		addExpectedElement(null, 287);
	}
	
	(
		(
			a2_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz			{
				if (terminateParsing) {
					throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
				}
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createArbeitsschritt();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ARBEITSSCHRITT__NOTIZ), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_19_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 288);
		addExpectedElement(null, 289);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp returns [com.github.funthomas424242.rezeptsammler.rezept.Tipp element = null]
@init{
}
:
	a0 = 'Tipp:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createTipp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_20_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 290);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createTipp();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.TIPP__TEXT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.TIPP__TEXT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_20_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 291, 294);
		addExpectedElement(null, 295);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar returns [com.github.funthomas424242.rezeptsammler.rezept.Kommentar element = null]
@init{
}
:
	a0 = 'Kommentar:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createKommentar();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_21_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 296);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createKommentar();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.KOMMENTAR__TEXT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.KOMMENTAR__TEXT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_21_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 297, 300);
		addExpectedElement(null, 301);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung returns [com.github.funthomas424242.rezeptsammler.rezept.Anmerkung element = null]
@init{
}
:
	a0 = 'Anmerkung:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAnmerkung();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_22_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 302);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAnmerkung();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ANMERKUNG__TEXT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.ANMERKUNG__TEXT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_22_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 303, 306);
		addExpectedElement(null, 307);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle returns [com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle element = null]
@init{
}
:
	a0 = '\u00fcbernommen' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 308);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt resolved = (com.github.funthomas424242.rezeptsammler.rezept.ModifikationsArt) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__MODIFIKATIONS_ART), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 309);
	}
	
	a2 = 'aus' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 310);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__BESCHREIBUNG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LITERATURQUELLE__BESCHREIBUNG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_3, resolved, true);
				copyLocalizationInfos((CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 311);
	}
	
	a4 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 312, 313);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle returns [com.github.funthomas424242.rezeptsammler.rezept.Personenquelle element = null]
@init{
}
:
	a0 = '\u00fcberliefert' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPersonenquelle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 314);
	}
	
	a1 = 'von' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPersonenquelle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 315);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPersonenquelle();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.PERSONENQUELLE__PERSONEN_BESCHREIBUNG), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 316);
	}
	
	a3 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPersonenquelle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 317, 318);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Bild returns [com.github.funthomas424242.rezeptsammler.rezept.Bild element = null]
@init{
}
:
	a0 = 'Bild:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild(), 319, 320);
	}
	
	(
		a1_0 = parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__ABLAGE_ORT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 321, 324);
	}
	
	(
		(
			a2 = 'Text:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 325);
			}
			
			(
				a3 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
						startIncompleteElement(element);
					}
					if (a3 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__BESCHREIBUNG), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__BESCHREIBUNG), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_2_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 326, 328);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 329, 331);
	}
	
	(
		(
			a4 = 'Lizenz:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 332);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
						startIncompleteElement(element);
					}
					if (a5 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__LIZENZ), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__LIZENZ), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_3_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 333, 334);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 335, 336);
	}
	
	(
		(
			a6 = 'Urheber:' {
				if (element == null) {
					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 337);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
					}
					if (element == null) {
						element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__URHEBER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.BILD__URHEBER), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_4_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 338);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 339);
	}
	
	a8 = '.' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 340);
		addExpectedElement(null, 341);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad returns [com.github.funthomas424242.rezeptsammler.rezept.InternetPfad element = null]
@init{
}
:
	a0 = 'URL:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createInternetPfad();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_26_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 342);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createInternetPfad();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.INTERNET_PFAD__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.INTERNET_PFAD__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_26_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 343, 346);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad returns [com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad element = null]
@init{
}
:
	a0 = 'FileName:' {
		if (element == null) {
			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLokalerPfad();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_27_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 347);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTerminateParsingException();
			}
			if (element == null) {
				element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLokalerPfad();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LOKALER_PFAD__FILE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.LOKALER_PFAD__FILE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_27_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 348, 351);
	}
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Menge returns [com.github.funthomas424242.rezeptsammler.rezept.Menge element = null]
:
	c0 = parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle returns [com.github.funthomas424242.rezeptsammler.rezept.Quelle element = null]
:
	c0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Tag returns [com.github.funthomas424242.rezeptsammler.rezept.Tag element = null]
:
	c0 = parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz returns [com.github.funthomas424242.rezeptsammler.rezept.Notiz element = null]
:
	c0 = parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad returns [com.github.funthomas424242.rezeptsammler.rezept.AblagePfad element = null]
:
	c0 = parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
ID:
	(('\'')('#')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+('\'') )
	{ _channel = 99; }
;
DATUM:
	(('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9')('0'..'9') ('0'..'9'))
;
NUMBER:
	(('0'..'9')+)
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;
QUOTED_6161_6161:
	(('==')(~('=')|'='~('='))*('=='))
;

