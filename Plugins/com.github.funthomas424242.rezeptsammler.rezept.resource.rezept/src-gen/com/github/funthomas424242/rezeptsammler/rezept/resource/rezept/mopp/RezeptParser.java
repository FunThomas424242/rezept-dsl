// $ANTLR 3.4

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


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RezeptParser extends RezeptANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DATUM", "ID", "LINEBREAK", "NUMBER", "QUOTED_34_34", "QUOTED_6161_6161", "TEXT", "WHITESPACE", "'--Zusatzinformationen--'", "'.'", "';'", "'='", "'Absatz:'", "'Aktion:'", "'Anmerkung:'", "'Ausreichend f\\u00fcr'", "'Autor:'", "'Bild:'", "'Buch'", "'Di\\u00e4t:'", "'EAN:'", "'FileName:'", "'H\\u00e4ndler:'", "'Hersteller:'", "'Kategorie:'", "'Kommentar:'", "'Letzte \\u00c4nderung:'", "'Lizenz:'", "'Lizenzhinweis:'", "'Lizenztext:'", "'Media Folder:'", "'Menge:'", "'ModifikationsNotiz:'", "'Nachname:'", "'Organisation:'", "'Personen.'", "'Preis:'", "'Produkt'", "'ProduktRef:'", "'Produktliste'", "'Quelle:'", "'Rezept'", "'RezeptSammlung'", "'Rezeptliste'", "'Stoff:'", "'Tag:'", "'Text:'", "'Tipp:'", "'Titel:'", "'UBA:'", "'URL:'", "'Untertitel:'", "'Urheber:'", "'Ver\\u00f6ffentlicht am:'", "'Verpackung:'", "'Vorname:'", "'Vorwort:'", "'Zutat:'", "'\\u00fcberliefert'", "'\\u00fcbernommen'", "'artifactId'", "'aus'", "'groupId'", "'import produkte'", "'import rezepte'", "'mal.'", "'siteURL'", "'version'", "'von'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int COMMENT=4;
    public static final int DATUM=5;
    public static final int ID=6;
    public static final int LINEBREAK=7;
    public static final int NUMBER=8;
    public static final int QUOTED_34_34=9;
    public static final int QUOTED_6161_6161=10;
    public static final int TEXT=11;
    public static final int WHITESPACE=12;

    // delegates
    public RezeptANTLRParserBase[] getDelegates() {
        return new RezeptANTLRParserBase[] {};
    }

    // delegators


    public RezeptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RezeptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(76 + 1);
         

    }

    public String[] getTokenNames() { return RezeptParser.tokenNames; }
    public String getGrammarFileName() { return "Rezept.g"; }


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
    	



    // $ANTLR start "start"
    // Rezept.g:563:1: start returns [ EObject element = null] : (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;

        int start_StartIndex = input.index();

        com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung c0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste c1 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Produktliste c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Rezept.g:564:2: ( (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste ) EOF )
            // Rezept.g:565:2: (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, 0, 2);
            		expectedElementsIndexOfLastCompleteElement = 2;
            	}

            // Rezept.g:570:2: (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt1=1;
                }
                break;
            case 48:
                {
                alt1=2;
                }
                break;
            case 44:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // Rezept.g:571:3: c0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung_in_start82);
                    c0=parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; }

                    }
                    break;
                case 2 :
                    // Rezept.g:572:8: c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste_in_start96);
                    c1=parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; }

                    }
                    break;
                case 3 :
                    // Rezept.g:573:8: c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste_in_start110);
                    c2=parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; }

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_start117); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung"
    // Rezept.g:581:1: parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung returns [com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung element = null] : a0= 'RezeptSammlung' a1= '{' a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) a5= ';' a6= 'artifactId' a7= '=' (a8= QUOTED_34_34 ) a9= ';' a10= 'version' a11= '=' (a12= QUOTED_34_34 ) a13= ';' a14= 'Media Folder:' (a15= QUOTED_34_34 ) a16= ';' ( (a17= 'siteURL' a18= '=' (a19= QUOTED_34_34 ) a20= ';' ) )? a21= '}' (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung a22_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Rezept.g:584:2: (a0= 'RezeptSammlung' a1= '{' a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) a5= ';' a6= 'artifactId' a7= '=' (a8= QUOTED_34_34 ) a9= ';' a10= 'version' a11= '=' (a12= QUOTED_34_34 ) a13= ';' a14= 'Media Folder:' (a15= QUOTED_34_34 ) a16= ';' ( (a17= 'siteURL' a18= '=' (a19= QUOTED_34_34 ) a20= ';' ) )? a21= '}' (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung ) )
            // Rezept.g:585:2: a0= 'RezeptSammlung' a1= '{' a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) a5= ';' a6= 'artifactId' a7= '=' (a8= QUOTED_34_34 ) a9= ';' a10= 'version' a11= '=' (a12= QUOTED_34_34 ) a13= ';' a14= 'Media Folder:' (a15= QUOTED_34_34 ) a16= ';' ( (a17= 'siteURL' a18= '=' (a19= QUOTED_34_34 ) a20= ';' ) )? a21= '}' (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung )
            {
            a0=(Token)match(input,47,FOLLOW_47_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung143); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 3);
            	}

            a1=(Token)match(input,74,FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung157); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 4);
            	}

            a2=(Token)match(input,67,FOLLOW_67_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung171); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 5);
            	}

            a3=(Token)match(input,16,FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung185); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 6);
            	}

            // Rezept.g:641:2: (a4= QUOTED_34_34 )
            // Rezept.g:642:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung203); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 7);
            	}

            a5=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung224); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 8);
            	}

            a6=(Token)match(input,65,FOLLOW_65_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung238); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 9);
            	}

            a7=(Token)match(input,16,FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung252); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 10);
            	}

            // Rezept.g:719:2: (a8= QUOTED_34_34 )
            // Rezept.g:720:3: a8= QUOTED_34_34
            {
            a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung270); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 11);
            	}

            a9=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung291); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_9, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 12);
            	}

            a10=(Token)match(input,72,FOLLOW_72_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung305); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_10, null, true);
            		copyLocalizationInfos((CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 13);
            	}

            a11=(Token)match(input,16,FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung319); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_11, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 14);
            	}

            // Rezept.g:797:2: (a12= QUOTED_34_34 )
            // Rezept.g:798:3: a12= QUOTED_34_34
            {
            a12=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung337); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 15);
            	}

            a13=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung358); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_13, null, true);
            		copyLocalizationInfos((CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 16);
            	}

            a14=(Token)match(input,35,FOLLOW_35_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung372); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_14, null, true);
            		copyLocalizationInfos((CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 17);
            	}

            // Rezept.g:861:2: (a15= QUOTED_34_34 )
            // Rezept.g:862:3: a15= QUOTED_34_34
            {
            a15=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung390); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 18);
            	}

            a16=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung411); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_16, null, true);
            		copyLocalizationInfos((CommonToken)a16, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 19, 20);
            	}

            // Rezept.g:911:2: ( (a17= 'siteURL' a18= '=' (a19= QUOTED_34_34 ) a20= ';' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==71) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Rezept.g:912:3: (a17= 'siteURL' a18= '=' (a19= QUOTED_34_34 ) a20= ';' )
                    {
                    // Rezept.g:912:3: (a17= 'siteURL' a18= '=' (a19= QUOTED_34_34 ) a20= ';' )
                    // Rezept.g:913:4: a17= 'siteURL' a18= '=' (a19= QUOTED_34_34 ) a20= ';'
                    {
                    a17=(Token)match(input,71,FOLLOW_71_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung434); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_17_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a17, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 21);
                    			}

                    a18=(Token)match(input,16,FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung454); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_17_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a18, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 22);
                    			}

                    // Rezept.g:941:4: (a19= QUOTED_34_34 )
                    // Rezept.g:942:5: a19= QUOTED_34_34
                    {
                    a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung480); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 23);
                    			}

                    a20=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung513); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_17_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a20, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 24);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 25);
            	}

            a21=(Token)match(input,75,FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung546); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProjektBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_0_0_0_18, null, true);
            		copyLocalizationInfos((CommonToken)a21, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung(), 26);
            	}

            // Rezept.g:1012:2: (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung )
            // Rezept.g:1013:3: a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung
            {
            pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung564);
            a22_0=parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung"
    // Rezept.g:1042:1: parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung returns [com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung element = null] : a0= 'Buch' a1= '{' ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport ) )* a3= 'Titel:' (a4= QUOTED_34_34 ) a5= ';' ( (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Autor ) )+ ( (a7= 'Vorwort:' (a8= QUOTED_34_34 ) ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )* ) )? ( (a10_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz ) )? ( (a11= 'Ver\\u00f6ffentlicht am:' (a12= DATUM ) a13= '.' ) )? a14= '}' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a8=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        com.github.funthomas424242.rezeptsammler.rezept.RezeptImport a2_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Autor a6_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Absatz a9_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Lizenz a10_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Rezept.g:1045:2: (a0= 'Buch' a1= '{' ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport ) )* a3= 'Titel:' (a4= QUOTED_34_34 ) a5= ';' ( (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Autor ) )+ ( (a7= 'Vorwort:' (a8= QUOTED_34_34 ) ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )* ) )? ( (a10_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz ) )? ( (a11= 'Ver\\u00f6ffentlicht am:' (a12= DATUM ) a13= '.' ) )? a14= '}' )
            // Rezept.g:1046:2: a0= 'Buch' a1= '{' ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport ) )* a3= 'Titel:' (a4= QUOTED_34_34 ) a5= ';' ( (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Autor ) )+ ( (a7= 'Vorwort:' (a8= QUOTED_34_34 ) ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )* ) )? ( (a10_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz ) )? ( (a11= 'Ver\\u00f6ffentlicht am:' (a12= DATUM ) a13= '.' ) )? a14= '}'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung597); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 27);
            	}

            a1=(Token)match(input,74,FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung611); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 28);
            		addExpectedElement(null, 29);
            	}

            // Rezept.g:1075:2: ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==69) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Rezept.g:1076:3: (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport )
            	    {
            	    // Rezept.g:1076:3: (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport )
            	    // Rezept.g:1077:4: a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung634);
            	    a2_0=parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 30);
            		addExpectedElement(null, 31);
            	}

            a3=(Token)match(input,53,FOLLOW_53_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung660); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 32);
            	}

            // Rezept.g:1118:2: (a4= QUOTED_34_34 )
            // Rezept.g:1119:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung678); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 33);
            	}

            a5=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung699); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 34);
            	}

            // Rezept.g:1168:2: ( (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Autor ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Rezept.g:1169:3: (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Autor )
            	    {
            	    // Rezept.g:1169:3: (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Autor )
            	    // Rezept.g:1170:4: a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Autor
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung722);
            	    a6_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Autor();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 35);
            		addExpectedElement(null, 36);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 37);
            		addExpectedElement(null, 38, 39);
            	}

            // Rezept.g:1199:2: ( (a7= 'Vorwort:' (a8= QUOTED_34_34 ) ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )* ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==61) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Rezept.g:1200:3: (a7= 'Vorwort:' (a8= QUOTED_34_34 ) ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )* )
                    {
                    // Rezept.g:1200:3: (a7= 'Vorwort:' (a8= QUOTED_34_34 ) ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )* )
                    // Rezept.g:1201:4: a7= 'Vorwort:' (a8= QUOTED_34_34 ) ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )*
                    {
                    a7=(Token)match(input,61,FOLLOW_61_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung757); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_7_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 40);
                    			}

                    // Rezept.g:1215:4: (a8= QUOTED_34_34 )
                    // Rezept.g:1216:5: a8= QUOTED_34_34
                    {
                    a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung783); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 41, 42);
                    				addExpectedElement(null, 43, 44);
                    			}

                    // Rezept.g:1252:4: ( (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Rezept.g:1253:5: (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz )
                    	    {
                    	    // Rezept.g:1253:5: (a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz )
                    	    // Rezept.g:1254:6: a9_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz
                    	    {
                    	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung829);
                    	    a9_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 45, 46);
                    				addExpectedElement(null, 47, 48);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 49);
            		addExpectedElement(null, 50, 51);
            	}

            // Rezept.g:1289:2: ( (a10_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Rezept.g:1290:3: (a10_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz )
                    {
                    // Rezept.g:1290:3: (a10_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz )
                    // Rezept.g:1291:4: a10_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung891);
                    a10_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 52, 53);
            	}

            // Rezept.g:1317:2: ( (a11= 'Ver\\u00f6ffentlicht am:' (a12= DATUM ) a13= '.' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==58) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Rezept.g:1318:3: (a11= 'Ver\\u00f6ffentlicht am:' (a12= DATUM ) a13= '.' )
                    {
                    // Rezept.g:1318:3: (a11= 'Ver\\u00f6ffentlicht am:' (a12= DATUM ) a13= '.' )
                    // Rezept.g:1319:4: a11= 'Ver\\u00f6ffentlicht am:' (a12= DATUM ) a13= '.'
                    {
                    a11=(Token)match(input,58,FOLLOW_58_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung926); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 54);
                    			}

                    // Rezept.g:1333:4: (a12= DATUM )
                    // Rezept.g:1334:5: a12= DATUM
                    {
                    a12=(Token)match(input,DATUM,FOLLOW_DATUM_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung952); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 55);
                    			}

                    a13=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung985); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_9_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 56);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 57);
            	}

            a14=(Token)match(input,75,FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung1018); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBuchBeschreibung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_1_0_0_10, null, true);
            		copyLocalizationInfos((CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz"
    // Rezept.g:1408:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz returns [com.github.funthomas424242.rezeptsammler.rezept.Absatz element = null] : a0= 'Absatz:' ( ( (a1= QUOTED_6161_6161 ) ) )? (a2= QUOTED_34_34 ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Absatz parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Absatz element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Rezept.g:1411:2: (a0= 'Absatz:' ( ( (a1= QUOTED_6161_6161 ) ) )? (a2= QUOTED_34_34 ) )
            // Rezept.g:1412:2: a0= 'Absatz:' ( ( (a1= QUOTED_6161_6161 ) ) )? (a2= QUOTED_34_34 )
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz1047); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAbsatz();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_2_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 58, 59);
            	}

            // Rezept.g:1426:2: ( ( (a1= QUOTED_6161_6161 ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUOTED_6161_6161) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Rezept.g:1427:3: ( (a1= QUOTED_6161_6161 ) )
                    {
                    // Rezept.g:1427:3: ( (a1= QUOTED_6161_6161 ) )
                    // Rezept.g:1428:4: (a1= QUOTED_6161_6161 )
                    {
                    // Rezept.g:1428:4: (a1= QUOTED_6161_6161 )
                    // Rezept.g:1429:5: a1= QUOTED_6161_6161
                    {
                    a1=(Token)match(input,QUOTED_6161_6161,FOLLOW_QUOTED_6161_6161_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz1076); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 60);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 61);
            	}

            // Rezept.g:1471:2: (a2= QUOTED_34_34 )
            // Rezept.g:1472:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz1126); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 62, 63);
            		addExpectedElement(null, 64, 65);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Autor"
    // Rezept.g:1513:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Autor returns [com.github.funthomas424242.rezeptsammler.rezept.Autor element = null] : a0= 'Autor:' a1= '{' a2= 'Vorname:' (a3= QUOTED_34_34 ) a4= 'Nachname:' (a5= QUOTED_34_34 ) ( (a6= 'Organisation:' (a7= QUOTED_34_34 ) ) )? a8= 'ModifikationsNotiz:' (a9= QUOTED_34_34 ) a10= '}' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Autor parse_com_github_funthomas424242_rezeptsammler_rezept_Autor() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Autor element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Autor_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Rezept.g:1516:2: (a0= 'Autor:' a1= '{' a2= 'Vorname:' (a3= QUOTED_34_34 ) a4= 'Nachname:' (a5= QUOTED_34_34 ) ( (a6= 'Organisation:' (a7= QUOTED_34_34 ) ) )? a8= 'ModifikationsNotiz:' (a9= QUOTED_34_34 ) a10= '}' )
            // Rezept.g:1517:2: a0= 'Autor:' a1= '{' a2= 'Vorname:' (a3= QUOTED_34_34 ) a4= 'Nachname:' (a5= QUOTED_34_34 ) ( (a6= 'Organisation:' (a7= QUOTED_34_34 ) ) )? a8= 'ModifikationsNotiz:' (a9= QUOTED_34_34 ) a10= '}'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1162); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 66);
            	}

            a1=(Token)match(input,74,FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1176); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 67);
            	}

            a2=(Token)match(input,60,FOLLOW_60_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1190); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 68);
            	}

            // Rezept.g:1559:2: (a3= QUOTED_34_34 )
            // Rezept.g:1560:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1208); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 69);
            	}

            a4=(Token)match(input,38,FOLLOW_38_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1229); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 70);
            	}

            // Rezept.g:1609:2: (a5= QUOTED_34_34 )
            // Rezept.g:1610:3: a5= QUOTED_34_34
            {
            a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1247); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 71, 72);
            	}

            // Rezept.g:1645:2: ( (a6= 'Organisation:' (a7= QUOTED_34_34 ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Rezept.g:1646:3: (a6= 'Organisation:' (a7= QUOTED_34_34 ) )
                    {
                    // Rezept.g:1646:3: (a6= 'Organisation:' (a7= QUOTED_34_34 ) )
                    // Rezept.g:1647:4: a6= 'Organisation:' (a7= QUOTED_34_34 )
                    {
                    a6=(Token)match(input,39,FOLLOW_39_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1277); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 73);
                    			}

                    // Rezept.g:1661:4: (a7= QUOTED_34_34 )
                    // Rezept.g:1662:5: a7= QUOTED_34_34
                    {
                    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1303); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 74);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 75);
            	}

            a8=(Token)match(input,37,FOLLOW_37_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1349); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 76);
            	}

            // Rezept.g:1718:2: (a9= QUOTED_34_34 )
            // Rezept.g:1719:3: a9= QUOTED_34_34
            {
            a9=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1367); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 77);
            	}

            a10=(Token)match(input,75,FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1388); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAutor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_3_0_0_9, null, true);
            		copyLocalizationInfos((CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 78);
            		addExpectedElement(null, 79);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 80);
            		addExpectedElement(null, 81, 82);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_com_github_funthomas424242_rezeptsammler_rezept_Autor_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Autor"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz"
    // Rezept.g:1776:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz returns [com.github.funthomas424242.rezeptsammler.rezept.Lizenz element = null] : a0= 'Lizenzhinweis:' (a1= QUOTED_34_34 ) ( (a2= 'Lizenztext:' (a3= TEXT ) ) )? ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Lizenz parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Lizenz element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Rezept.g:1779:2: (a0= 'Lizenzhinweis:' (a1= QUOTED_34_34 ) ( (a2= 'Lizenztext:' (a3= TEXT ) ) )? )
            // Rezept.g:1780:2: a0= 'Lizenzhinweis:' (a1= QUOTED_34_34 ) ( (a2= 'Lizenztext:' (a3= TEXT ) ) )?
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1417); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLizenz();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_4_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 83);
            	}

            // Rezept.g:1794:2: (a1= QUOTED_34_34 )
            // Rezept.g:1795:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1435); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 84, 86);
            	}

            // Rezept.g:1830:2: ( (a2= 'Lizenztext:' (a3= TEXT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Rezept.g:1831:3: (a2= 'Lizenztext:' (a3= TEXT ) )
                    {
                    // Rezept.g:1831:3: (a2= 'Lizenztext:' (a3= TEXT ) )
                    // Rezept.g:1832:4: a2= 'Lizenztext:' (a3= TEXT )
                    {
                    a2=(Token)match(input,34,FOLLOW_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1465); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLizenz();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_4_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 87);
                    			}

                    // Rezept.g:1846:4: (a3= TEXT )
                    // Rezept.g:1847:5: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1491); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 88, 89);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 90, 91);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport"
    // Rezept.g:1897:1: parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport returns [com.github.funthomas424242.rezeptsammler.rezept.RezeptImport element = null] : a0= 'import rezepte' (a1= QUOTED_34_34 ) a2= ';' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.RezeptImport parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.RezeptImport element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Rezept.g:1900:2: (a0= 'import rezepte' (a1= QUOTED_34_34 ) a2= ';' )
            // Rezept.g:1901:2: a0= 'import rezepte' (a1= QUOTED_34_34 ) a2= ';'
            {
            a0=(Token)match(input,69,FOLLOW_69_in_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport1552); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptImport();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_5_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 92);
            	}

            // Rezept.g:1915:2: (a1= QUOTED_34_34 )
            // Rezept.g:1916:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport1570); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 93);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport1591); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptImport();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_5_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBuchBeschreibung(), 94);
            		addExpectedElement(null, 95);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste"
    // Rezept.g:1975:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste returns [com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste element = null] : a0= 'Rezeptliste' (a1= QUOTED_34_34 ) a2= ';' ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport ) )* ( (a4_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept ) )+ ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        com.github.funthomas424242.rezeptsammler.rezept.ProduktImport a3_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Rezept a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Rezept.g:1978:2: (a0= 'Rezeptliste' (a1= QUOTED_34_34 ) a2= ';' ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport ) )* ( (a4_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept ) )+ )
            // Rezept.g:1979:2: a0= 'Rezeptliste' (a1= QUOTED_34_34 ) a2= ';' ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport ) )* ( (a4_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept ) )+
            {
            a0=(Token)match(input,48,FOLLOW_48_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1620); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 96);
            	}

            // Rezept.g:1993:2: (a1= QUOTED_34_34 )
            // Rezept.g:1994:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1638); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 97);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1659); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezeptliste();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_6_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 98, 99);
            	}

            // Rezept.g:2043:2: ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==68) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Rezept.g:2044:3: (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport )
            	    {
            	    // Rezept.g:2044:3: (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport )
            	    // Rezept.g:2045:4: a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1682);
            	    a3_0=parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 100, 101);
            	}

            // Rezept.g:2071:2: ( (a4_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Rezept.g:2072:3: (a4_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept )
            	    {
            	    // Rezept.g:2072:3: (a4_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept )
            	    // Rezept.g:2073:4: a4_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1717);
            	    a4_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 102);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport"
    // Rezept.g:2104:1: parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport returns [com.github.funthomas424242.rezeptsammler.rezept.ProduktImport element = null] : a0= 'import produkte' (a1= QUOTED_34_34 ) a2= ';' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.ProduktImport parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.ProduktImport element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Rezept.g:2107:2: (a0= 'import produkte' (a1= QUOTED_34_34 ) a2= ';' )
            // Rezept.g:2108:2: a0= 'import produkte' (a1= QUOTED_34_34 ) a2= ';'
            {
            a0=(Token)match(input,68,FOLLOW_68_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport1758); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktImport();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_7_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 103);
            	}

            // Rezept.g:2122:2: (a1= QUOTED_34_34 )
            // Rezept.g:2123:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport1776); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 104);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport1797); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktImport();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_7_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 105, 106);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste"
    // Rezept.g:2181:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste returns [com.github.funthomas424242.rezeptsammler.rezept.Produktliste element = null] : a0= 'Produktliste' (a1= QUOTED_34_34 ) a2= ';' ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt ) )+ ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Produktliste parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Produktliste element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        com.github.funthomas424242.rezeptsammler.rezept.Produkt a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Rezept.g:2184:2: (a0= 'Produktliste' (a1= QUOTED_34_34 ) a2= ';' ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt ) )+ )
            // Rezept.g:2185:2: a0= 'Produktliste' (a1= QUOTED_34_34 ) a2= ';' ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt ) )+
            {
            a0=(Token)match(input,44,FOLLOW_44_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1826); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktliste();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_8_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 107);
            	}

            // Rezept.g:2199:2: (a1= QUOTED_34_34 )
            // Rezept.g:2200:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1844); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 108);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1865); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktliste();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_8_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(), 109);
            	}

            // Rezept.g:2249:2: ( (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Rezept.g:2250:3: (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt )
            	    {
            	    // Rezept.g:2250:3: (a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt )
            	    // Rezept.g:2251:4: a3_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1888);
            	    a3_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(), 110);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt"
    // Rezept.g:2282:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt returns [com.github.funthomas424242.rezeptsammler.rezept.Produkt element = null] : a0= 'Produkt' (a1= QUOTED_34_34 ) a2= '{' ( (a3= 'Verpackung:' (a4= QUOTED_34_34 ) a5= '.' ) )? (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge ) ( (a7= 'EAN:' (a8= QUOTED_34_34 ) a9= '.' ) )? ( (a10= 'UBA:' (a11= QUOTED_34_34 ) a12= '.' ) )? ( (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Preis ) )? ( (a14= 'H\\u00e4ndler:' (a15= QUOTED_34_34 ) a16= '.' ) )? ( (a17= 'Hersteller:' (a18= QUOTED_34_34 ) a19= '.' ) )? a20= 'Letzte \\u00c4nderung:' (a21= DATUM ) a22= '.' a23= '}' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Produkt parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Produkt element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;
        Token a23=null;
        com.github.funthomas424242.rezeptsammler.rezept.Menge a6_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Preis a13_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Rezept.g:2285:2: (a0= 'Produkt' (a1= QUOTED_34_34 ) a2= '{' ( (a3= 'Verpackung:' (a4= QUOTED_34_34 ) a5= '.' ) )? (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge ) ( (a7= 'EAN:' (a8= QUOTED_34_34 ) a9= '.' ) )? ( (a10= 'UBA:' (a11= QUOTED_34_34 ) a12= '.' ) )? ( (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Preis ) )? ( (a14= 'H\\u00e4ndler:' (a15= QUOTED_34_34 ) a16= '.' ) )? ( (a17= 'Hersteller:' (a18= QUOTED_34_34 ) a19= '.' ) )? a20= 'Letzte \\u00c4nderung:' (a21= DATUM ) a22= '.' a23= '}' )
            // Rezept.g:2286:2: a0= 'Produkt' (a1= QUOTED_34_34 ) a2= '{' ( (a3= 'Verpackung:' (a4= QUOTED_34_34 ) a5= '.' ) )? (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge ) ( (a7= 'EAN:' (a8= QUOTED_34_34 ) a9= '.' ) )? ( (a10= 'UBA:' (a11= QUOTED_34_34 ) a12= '.' ) )? ( (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Preis ) )? ( (a14= 'H\\u00e4ndler:' (a15= QUOTED_34_34 ) a16= '.' ) )? ( (a17= 'Hersteller:' (a18= QUOTED_34_34 ) a19= '.' ) )? a20= 'Letzte \\u00c4nderung:' (a21= DATUM ) a22= '.' a23= '}'
            {
            a0=(Token)match(input,42,FOLLOW_42_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1929); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 111);
            	}

            // Rezept.g:2300:2: (a1= QUOTED_34_34 )
            // Rezept.g:2301:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1947); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 112);
            	}

            a2=(Token)match(input,74,FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1968); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 113);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 114, 115);
            	}

            // Rezept.g:2351:2: ( (a3= 'Verpackung:' (a4= QUOTED_34_34 ) a5= '.' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==59) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Rezept.g:2352:3: (a3= 'Verpackung:' (a4= QUOTED_34_34 ) a5= '.' )
                    {
                    // Rezept.g:2352:3: (a3= 'Verpackung:' (a4= QUOTED_34_34 ) a5= '.' )
                    // Rezept.g:2353:4: a3= 'Verpackung:' (a4= QUOTED_34_34 ) a5= '.'
                    {
                    a3=(Token)match(input,59,FOLLOW_59_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1991); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 116);
                    			}

                    // Rezept.g:2367:4: (a4= QUOTED_34_34 )
                    // Rezept.g:2368:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2017); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 117);
                    			}

                    a5=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2050); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_3_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 118, 119);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 120, 121);
            	}

            // Rezept.g:2424:2: (a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge )
            // Rezept.g:2425:3: a6_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge
            {
            pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2087);
            a6_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Menge();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 122, 123);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 124);
            		addExpectedElement(null, 125, 127);
            	}

            // Rezept.g:2452:2: ( (a7= 'EAN:' (a8= QUOTED_34_34 ) a9= '.' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Rezept.g:2453:3: (a7= 'EAN:' (a8= QUOTED_34_34 ) a9= '.' )
                    {
                    // Rezept.g:2453:3: (a7= 'EAN:' (a8= QUOTED_34_34 ) a9= '.' )
                    // Rezept.g:2454:4: a7= 'EAN:' (a8= QUOTED_34_34 ) a9= '.'
                    {
                    a7=(Token)match(input,25,FOLLOW_25_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2114); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 128);
                    			}

                    // Rezept.g:2468:4: (a8= QUOTED_34_34 )
                    // Rezept.g:2469:5: a8= QUOTED_34_34
                    {
                    a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2140); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 129);
                    			}

                    a9=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2173); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_5_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 130);
                    				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 131);
                    				addExpectedElement(null, 132, 134);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 135);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 136);
            		addExpectedElement(null, 137, 139);
            	}

            // Rezept.g:2529:2: ( (a10= 'UBA:' (a11= QUOTED_34_34 ) a12= '.' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Rezept.g:2530:3: (a10= 'UBA:' (a11= QUOTED_34_34 ) a12= '.' )
                    {
                    // Rezept.g:2530:3: (a10= 'UBA:' (a11= QUOTED_34_34 ) a12= '.' )
                    // Rezept.g:2531:4: a10= 'UBA:' (a11= QUOTED_34_34 ) a12= '.'
                    {
                    a10=(Token)match(input,54,FOLLOW_54_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2215); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 140);
                    			}

                    // Rezept.g:2545:4: (a11= QUOTED_34_34 )
                    // Rezept.g:2546:5: a11= QUOTED_34_34
                    {
                    a11=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2241); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 141);
                    			}

                    a12=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2274); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_6_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 142);
                    				addExpectedElement(null, 143, 145);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 146);
            		addExpectedElement(null, 147, 149);
            	}

            // Rezept.g:2604:2: ( (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Preis ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Rezept.g:2605:3: (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Preis )
                    {
                    // Rezept.g:2605:3: (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Preis )
                    // Rezept.g:2606:4: a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Preis
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2316);
                    a13_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Preis();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 150, 152);
            	}

            // Rezept.g:2632:2: ( (a14= 'H\\u00e4ndler:' (a15= QUOTED_34_34 ) a16= '.' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Rezept.g:2633:3: (a14= 'H\\u00e4ndler:' (a15= QUOTED_34_34 ) a16= '.' )
                    {
                    // Rezept.g:2633:3: (a14= 'H\\u00e4ndler:' (a15= QUOTED_34_34 ) a16= '.' )
                    // Rezept.g:2634:4: a14= 'H\\u00e4ndler:' (a15= QUOTED_34_34 ) a16= '.'
                    {
                    a14=(Token)match(input,27,FOLLOW_27_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2351); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_8_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a14, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 153);
                    			}

                    // Rezept.g:2648:4: (a15= QUOTED_34_34 )
                    // Rezept.g:2649:5: a15= QUOTED_34_34
                    {
                    a15=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2377); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 154);
                    			}

                    a16=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2410); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_8_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a16, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 155, 156);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 157, 158);
            	}

            // Rezept.g:2705:2: ( (a17= 'Hersteller:' (a18= QUOTED_34_34 ) a19= '.' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Rezept.g:2706:3: (a17= 'Hersteller:' (a18= QUOTED_34_34 ) a19= '.' )
                    {
                    // Rezept.g:2706:3: (a17= 'Hersteller:' (a18= QUOTED_34_34 ) a19= '.' )
                    // Rezept.g:2707:4: a17= 'Hersteller:' (a18= QUOTED_34_34 ) a19= '.'
                    {
                    a17=(Token)match(input,28,FOLLOW_28_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2452); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a17, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 159);
                    			}

                    // Rezept.g:2721:4: (a18= QUOTED_34_34 )
                    // Rezept.g:2722:5: a18= QUOTED_34_34
                    {
                    a18=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2478); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 160);
                    			}

                    a19=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2511); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_9_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a19, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 161);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 162);
            	}

            a20=(Token)match(input,31,FOLLOW_31_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2544); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_10, null, true);
            		copyLocalizationInfos((CommonToken)a20, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 163);
            	}

            // Rezept.g:2792:2: (a21= DATUM )
            // Rezept.g:2793:3: a21= DATUM
            {
            a21=(Token)match(input,DATUM,FOLLOW_DATUM_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2562); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 164);
            	}

            a22=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2583); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_12, null, true);
            		copyLocalizationInfos((CommonToken)a22, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 165);
            	}

            a23=(Token)match(input,75,FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2597); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProdukt();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_9_0_0_13, null, true);
            		copyLocalizationInfos((CommonToken)a23, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(), 166);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Preis"
    // Rezept.g:2861:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Preis returns [com.github.funthomas424242.rezeptsammler.rezept.Preis element = null] : a0= 'Preis:' (a1= QUOTED_34_34 ) (a2= QUOTED_34_34 ) a3= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Preis parse_com_github_funthomas424242_rezeptsammler_rezept_Preis() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Preis element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Preis_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Rezept.g:2864:2: (a0= 'Preis:' (a1= QUOTED_34_34 ) (a2= QUOTED_34_34 ) a3= '.' )
            // Rezept.g:2865:2: a0= 'Preis:' (a1= QUOTED_34_34 ) (a2= QUOTED_34_34 ) a3= '.'
            {
            a0=(Token)match(input,41,FOLLOW_41_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2626); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPreis();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_10_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 167);
            	}

            // Rezept.g:2879:2: (a1= QUOTED_34_34 )
            // Rezept.g:2880:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2644); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 168);
            	}

            // Rezept.g:2915:2: (a2= QUOTED_34_34 )
            // Rezept.g:2916:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2669); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 169);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2690); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPreis();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_10_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 170, 172);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_com_github_funthomas424242_rezeptsammler_rezept_Preis_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Preis"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept"
    // Rezept.g:2970:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept returns [com.github.funthomas424242.rezeptsammler.rezept.Rezept element = null] : a0= 'Rezept' (a1= QUOTED_34_34 ) a2= '{' a3= 'Titel:' (a4= QUOTED_34_34 ) a5= '.' ( (a6= 'Untertitel:' (a7= QUOTED_34_34 ) a8= '.' ) )? a9= 'Kategorie:' (a10= QUOTED_34_34 ) a11= '.' ( (a12= 'Quelle:' (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle ) ) )? ( (a14= 'Ausreichend f\\u00fcr' (a15= NUMBER ) a16= 'Personen.' ) )? a17= 'Letzte \\u00c4nderung:' (a18= DATUM ) a19= '.' ( (a20_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tag ) )+ ( (a21_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef ) )* ( (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat ) )+ ( (a23_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt ) )+ a24= '--Zusatzinformationen--' ( (a25_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )* ( (a26_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Bild ) )* a27= '}' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Rezept parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Rezept element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a24=null;
        Token a27=null;
        com.github.funthomas424242.rezeptsammler.rezept.Quelle a13_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Tag a20_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.ProduktRef a21_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Zutat a22_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt a23_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Notiz a25_0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Bild a26_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Rezept.g:2973:2: (a0= 'Rezept' (a1= QUOTED_34_34 ) a2= '{' a3= 'Titel:' (a4= QUOTED_34_34 ) a5= '.' ( (a6= 'Untertitel:' (a7= QUOTED_34_34 ) a8= '.' ) )? a9= 'Kategorie:' (a10= QUOTED_34_34 ) a11= '.' ( (a12= 'Quelle:' (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle ) ) )? ( (a14= 'Ausreichend f\\u00fcr' (a15= NUMBER ) a16= 'Personen.' ) )? a17= 'Letzte \\u00c4nderung:' (a18= DATUM ) a19= '.' ( (a20_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tag ) )+ ( (a21_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef ) )* ( (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat ) )+ ( (a23_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt ) )+ a24= '--Zusatzinformationen--' ( (a25_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )* ( (a26_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Bild ) )* a27= '}' )
            // Rezept.g:2974:2: a0= 'Rezept' (a1= QUOTED_34_34 ) a2= '{' a3= 'Titel:' (a4= QUOTED_34_34 ) a5= '.' ( (a6= 'Untertitel:' (a7= QUOTED_34_34 ) a8= '.' ) )? a9= 'Kategorie:' (a10= QUOTED_34_34 ) a11= '.' ( (a12= 'Quelle:' (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle ) ) )? ( (a14= 'Ausreichend f\\u00fcr' (a15= NUMBER ) a16= 'Personen.' ) )? a17= 'Letzte \\u00c4nderung:' (a18= DATUM ) a19= '.' ( (a20_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tag ) )+ ( (a21_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef ) )* ( (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat ) )+ ( (a23_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt ) )+ a24= '--Zusatzinformationen--' ( (a25_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )* ( (a26_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Bild ) )* a27= '}'
            {
            a0=(Token)match(input,46,FOLLOW_46_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2719); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 173);
            	}

            // Rezept.g:2988:2: (a1= QUOTED_34_34 )
            // Rezept.g:2989:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2737); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 174);
            	}

            a2=(Token)match(input,74,FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2758); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 175);
            	}

            a3=(Token)match(input,53,FOLLOW_53_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2772); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 176);
            	}

            // Rezept.g:3052:2: (a4= QUOTED_34_34 )
            // Rezept.g:3053:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2790); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 177);
            	}

            a5=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2811); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 178, 179);
            	}

            // Rezept.g:3102:2: ( (a6= 'Untertitel:' (a7= QUOTED_34_34 ) a8= '.' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==56) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Rezept.g:3103:3: (a6= 'Untertitel:' (a7= QUOTED_34_34 ) a8= '.' )
                    {
                    // Rezept.g:3103:3: (a6= 'Untertitel:' (a7= QUOTED_34_34 ) a8= '.' )
                    // Rezept.g:3104:4: a6= 'Untertitel:' (a7= QUOTED_34_34 ) a8= '.'
                    {
                    a6=(Token)match(input,56,FOLLOW_56_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2834); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 180);
                    			}

                    // Rezept.g:3118:4: (a7= QUOTED_34_34 )
                    // Rezept.g:3119:5: a7= QUOTED_34_34
                    {
                    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2860); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 181);
                    			}

                    a8=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2893); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_6_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 182);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 183);
            	}

            a9=(Token)match(input,29,FOLLOW_29_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2926); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 184);
            	}

            // Rezept.g:3189:2: (a10= QUOTED_34_34 )
            // Rezept.g:3190:3: a10= QUOTED_34_34
            {
            a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2944); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 185);
            	}

            a11=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2965); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_9, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 186, 188);
            	}

            // Rezept.g:3239:2: ( (a12= 'Quelle:' (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Rezept.g:3240:3: (a12= 'Quelle:' (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle ) )
                    {
                    // Rezept.g:3240:3: (a12= 'Quelle:' (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle ) )
                    // Rezept.g:3241:4: a12= 'Quelle:' (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle )
                    {
                    a12=(Token)match(input,45,FOLLOW_45_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2988); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_10_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 189, 190);
                    			}

                    // Rezept.g:3255:4: (a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle )
                    // Rezept.g:3256:5: a13_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3014);
                    a13_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 191, 192);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 193, 194);
            	}

            // Rezept.g:3288:2: ( (a14= 'Ausreichend f\\u00fcr' (a15= NUMBER ) a16= 'Personen.' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Rezept.g:3289:3: (a14= 'Ausreichend f\\u00fcr' (a15= NUMBER ) a16= 'Personen.' )
                    {
                    // Rezept.g:3289:3: (a14= 'Ausreichend f\\u00fcr' (a15= NUMBER ) a16= 'Personen.' )
                    // Rezept.g:3290:4: a14= 'Ausreichend f\\u00fcr' (a15= NUMBER ) a16= 'Personen.'
                    {
                    a14=(Token)match(input,20,FOLLOW_20_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3064); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_11_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a14, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 195);
                    			}

                    // Rezept.g:3304:4: (a15= NUMBER )
                    // Rezept.g:3305:5: a15= NUMBER
                    {
                    a15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3090); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 196);
                    			}

                    a16=(Token)match(input,40,FOLLOW_40_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3123); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_11_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a16, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 197);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 198);
            	}

            a17=(Token)match(input,31,FOLLOW_31_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3156); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_12, null, true);
            		copyLocalizationInfos((CommonToken)a17, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 199);
            	}

            // Rezept.g:3375:2: (a18= DATUM )
            // Rezept.g:3376:3: a18= DATUM
            {
            a18=(Token)match(input,DATUM,FOLLOW_DATUM_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3174); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 200);
            	}

            a19=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3195); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_14, null, true);
            		copyLocalizationInfos((CommonToken)a19, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 201, 203);
            	}

            // Rezept.g:3425:2: ( (a20_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tag ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24||(LA24_0 >= 49 && LA24_0 <= 50)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Rezept.g:3426:3: (a20_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tag )
            	    {
            	    // Rezept.g:3426:3: (a20_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tag )
            	    // Rezept.g:3427:4: a20_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tag
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3218);
            	    a20_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Tag();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 204, 208);
            	}

            // Rezept.g:3453:2: ( (a21_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Rezept.g:3454:3: (a21_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef )
            	    {
            	    // Rezept.g:3454:3: (a21_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef )
            	    // Rezept.g:3455:4: a21_0= parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3253);
            	    a21_0=parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 209, 210);
            	}

            // Rezept.g:3481:2: ( (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==62) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Rezept.g:3482:3: (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat )
            	    {
            	    // Rezept.g:3482:3: (a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat )
            	    // Rezept.g:3483:4: a22_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3288);
            	    a22_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 211, 212);
            	}

            // Rezept.g:3509:2: ( (a23_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Rezept.g:3510:3: (a23_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt )
            	    {
            	    // Rezept.g:3510:3: (a23_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt )
            	    // Rezept.g:3511:4: a23_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3323);
            	    a23_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 213);
            		addExpectedElement(null, 214);
            	}

            a24=(Token)match(input,13,FOLLOW_13_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3349); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_19, null, true);
            		copyLocalizationInfos((CommonToken)a24, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 215, 218);
            		addExpectedElement(null, 219);
            	}

            // Rezept.g:3553:2: ( (a25_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19||LA28_0==30||LA28_0==52) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Rezept.g:3554:3: (a25_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz )
            	    {
            	    // Rezept.g:3554:3: (a25_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz )
            	    // Rezept.g:3555:4: a25_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3372);
            	    a25_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 220, 223);
            		addExpectedElement(null, 224);
            	}

            // Rezept.g:3582:2: ( (a26_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Bild ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==22) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Rezept.g:3583:3: (a26_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Bild )
            	    {
            	    // Rezept.g:3583:3: (a26_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Bild )
            	    // Rezept.g:3584:4: a26_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Bild
            	    {
            	    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3407);
            	    a26_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Bild();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 225);
            		addExpectedElement(null, 226);
            	}

            a27=(Token)match(input,75,FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3433); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createRezept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_11_0_0_22, null, true);
            		copyLocalizationInfos((CommonToken)a27, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(), 227);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag"
    // Rezept.g:3630:1: parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag returns [com.github.funthomas424242.rezeptsammler.rezept.StoffTag element = null] : a0= 'Stoff:' (a1= QUOTED_34_34 ) a2= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.StoffTag parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.StoffTag element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Rezept.g:3633:2: (a0= 'Stoff:' (a1= QUOTED_34_34 ) a2= '.' )
            // Rezept.g:3634:2: a0= 'Stoff:' (a1= QUOTED_34_34 ) a2= '.'
            {
            a0=(Token)match(input,49,FOLLOW_49_in_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag3462); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createStoffTag();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_12_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 228);
            	}

            // Rezept.g:3648:2: (a1= QUOTED_34_34 )
            // Rezept.g:3649:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag3480); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 229);
            	}

            a2=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag3501); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createStoffTag();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_12_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 230, 234);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag"
    // Rezept.g:3703:1: parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag returns [com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag element = null] : a0= 'Tag:' (a1= QUOTED_34_34 ) a2= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Rezept.g:3706:2: (a0= 'Tag:' (a1= QUOTED_34_34 ) a2= '.' )
            // Rezept.g:3707:2: a0= 'Tag:' (a1= QUOTED_34_34 ) a2= '.'
            {
            a0=(Token)match(input,50,FOLLOW_50_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag3530); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBenutzerTag();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_13_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 235);
            	}

            // Rezept.g:3721:2: (a1= QUOTED_34_34 )
            // Rezept.g:3722:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag3548); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 236);
            	}

            a2=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag3569); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBenutzerTag();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_13_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 237, 241);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag"
    // Rezept.g:3776:1: parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag returns [com.github.funthomas424242.rezeptsammler.rezept.DiaetTag element = null] : a0= 'Di\\u00e4t:' (a1= QUOTED_34_34 ) a2= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.DiaetTag parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.DiaetTag element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Rezept.g:3779:2: (a0= 'Di\\u00e4t:' (a1= QUOTED_34_34 ) a2= '.' )
            // Rezept.g:3780:2: a0= 'Di\\u00e4t:' (a1= QUOTED_34_34 ) a2= '.'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag3598); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createDiaetTag();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_14_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 242);
            	}

            // Rezept.g:3794:2: (a1= QUOTED_34_34 )
            // Rezept.g:3795:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag3616); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 243);
            	}

            a2=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag3637); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createDiaetTag();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_14_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 244, 248);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef"
    // Rezept.g:3849:1: parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef returns [com.github.funthomas424242.rezeptsammler.rezept.ProduktRef element = null] : a0= 'ProduktRef:' (a1= QUOTED_34_34 ) a2= 'Menge:' (a3= QUOTED_34_34 ) a4= 'mal.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.ProduktRef parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.ProduktRef element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Rezept.g:3852:2: (a0= 'ProduktRef:' (a1= QUOTED_34_34 ) a2= 'Menge:' (a3= QUOTED_34_34 ) a4= 'mal.' )
            // Rezept.g:3853:2: a0= 'ProduktRef:' (a1= QUOTED_34_34 ) a2= 'Menge:' (a3= QUOTED_34_34 ) a4= 'mal.'
            {
            a0=(Token)match(input,43,FOLLOW_43_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3666); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 249);
            	}

            // Rezept.g:3867:2: (a1= QUOTED_34_34 )
            // Rezept.g:3868:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3684); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 250);
            	}

            a2=(Token)match(input,36,FOLLOW_36_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3705); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 251);
            	}

            // Rezept.g:3921:2: (a3= QUOTED_34_34 )
            // Rezept.g:3922:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3723); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 252);
            	}

            a4=(Token)match(input,70,FOLLOW_70_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3744); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createProduktRef();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_15_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 253, 254);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat"
    // Rezept.g:3976:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat returns [com.github.funthomas424242.rezeptsammler.rezept.Zutat element = null] : a0= 'Zutat:' (a1= QUOTED_34_34 ) (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Zutat parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Zutat element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        com.github.funthomas424242.rezeptsammler.rezept.Menge a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Rezept.g:3979:2: (a0= 'Zutat:' (a1= QUOTED_34_34 ) (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge ) )
            // Rezept.g:3980:2: a0= 'Zutat:' (a1= QUOTED_34_34 ) (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge )
            {
            a0=(Token)match(input,62,FOLLOW_62_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat3773); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createZutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_16_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 255);
            	}

            // Rezept.g:3994:2: (a1= QUOTED_34_34 )
            // Rezept.g:3995:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat3791); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getZutat(), 256, 257);
            	}

            // Rezept.g:4030:2: (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge )
            // Rezept.g:4031:3: a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Menge
            {
            pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat3816);
            a2_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Menge();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 258, 259);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge"
    // Rezept.g:4061:1: parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge returns [com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge element = null] : a0= 'Menge:' (a1= QUOTED_34_34 ) ( (a2= QUOTED_34_34 ) )? (a3= QUOTED_34_34 ) a4= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Rezept.g:4064:2: (a0= 'Menge:' (a1= QUOTED_34_34 ) ( (a2= QUOTED_34_34 ) )? (a3= QUOTED_34_34 ) a4= '.' )
            // Rezept.g:4065:2: a0= 'Menge:' (a1= QUOTED_34_34 ) ( (a2= QUOTED_34_34 ) )? (a3= QUOTED_34_34 ) a4= '.'
            {
            a0=(Token)match(input,36,FOLLOW_36_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3849); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBestimmteMenge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 260);
            	}

            // Rezept.g:4079:2: (a1= QUOTED_34_34 )
            // Rezept.g:4080:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3867); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 261, 262);
            	}

            // Rezept.g:4115:2: ( (a2= QUOTED_34_34 ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==QUOTED_34_34) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==QUOTED_34_34) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // Rezept.g:4116:3: (a2= QUOTED_34_34 )
                    {
                    // Rezept.g:4116:3: (a2= QUOTED_34_34 )
                    // Rezept.g:4117:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3897); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 263);
            	}

            // Rezept.g:4153:2: (a3= QUOTED_34_34 )
            // Rezept.g:4154:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3931); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 264);
            	}

            a4=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3952); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBestimmteMenge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_17_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 265, 266);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 267);
            		addExpectedElement(null, 268, 270);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 271, 272);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge"
    // Rezept.g:4211:1: parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge returns [com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge element = null] : (a0= QUOTED_34_34 ) a1= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Rezept.g:4214:2: ( (a0= QUOTED_34_34 ) a1= '.' )
            // Rezept.g:4215:2: (a0= QUOTED_34_34 ) a1= '.'
            {
            // Rezept.g:4215:2: (a0= QUOTED_34_34 )
            // Rezept.g:4216:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge3985); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 273);
            	}

            a1=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge4006); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createUnbestimmteMenge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_18_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 274, 275);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProdukt(), 276);
            		addExpectedElement(null, 277, 279);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 280, 281);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt"
    // Rezept.g:4273:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt returns [com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt element = null] : a0= 'Aktion:' (a1= QUOTED_34_34 ) ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )? ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        com.github.funthomas424242.rezeptsammler.rezept.Notiz a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Rezept.g:4276:2: (a0= 'Aktion:' (a1= QUOTED_34_34 ) ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )? )
            // Rezept.g:4277:2: a0= 'Aktion:' (a1= QUOTED_34_34 ) ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )?
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt4035); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createArbeitsschritt();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_19_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 282);
            	}

            // Rezept.g:4291:2: (a1= QUOTED_34_34 )
            // Rezept.g:4292:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt4053); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getArbeitsschritt(), 283, 285);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 286);
            		addExpectedElement(null, 287);
            	}

            // Rezept.g:4329:2: ( (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19||LA31_0==30||LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Rezept.g:4330:3: (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz )
                    {
                    // Rezept.g:4330:3: (a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz )
                    // Rezept.g:4331:4: a2_0= parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt4083);
                    a2_0=parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 288);
            		addExpectedElement(null, 289);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp"
    // Rezept.g:4363:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp returns [com.github.funthomas424242.rezeptsammler.rezept.Tipp element = null] : a0= 'Tipp:' (a1= QUOTED_34_34 ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Tipp parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Tipp element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Rezept.g:4366:2: (a0= 'Tipp:' (a1= QUOTED_34_34 ) )
            // Rezept.g:4367:2: a0= 'Tipp:' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,52,FOLLOW_52_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp4124); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createTipp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_20_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 290);
            	}

            // Rezept.g:4381:2: (a1= QUOTED_34_34 )
            // Rezept.g:4382:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp4142); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 291, 294);
            		addExpectedElement(null, 295);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar"
    // Rezept.g:4423:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar returns [com.github.funthomas424242.rezeptsammler.rezept.Kommentar element = null] : a0= 'Kommentar:' (a1= QUOTED_34_34 ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Kommentar parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Kommentar element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Rezept.g:4426:2: (a0= 'Kommentar:' (a1= QUOTED_34_34 ) )
            // Rezept.g:4427:2: a0= 'Kommentar:' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar4178); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createKommentar();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_21_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 296);
            	}

            // Rezept.g:4441:2: (a1= QUOTED_34_34 )
            // Rezept.g:4442:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar4196); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 297, 300);
            		addExpectedElement(null, 301);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung"
    // Rezept.g:4483:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung returns [com.github.funthomas424242.rezeptsammler.rezept.Anmerkung element = null] : a0= 'Anmerkung:' (a1= QUOTED_34_34 ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Anmerkung parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Anmerkung element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Rezept.g:4486:2: (a0= 'Anmerkung:' (a1= QUOTED_34_34 ) )
            // Rezept.g:4487:2: a0= 'Anmerkung:' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung4232); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createAnmerkung();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_22_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 302);
            	}

            // Rezept.g:4501:2: (a1= QUOTED_34_34 )
            // Rezept.g:4502:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung4250); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 303, 306);
            		addExpectedElement(null, 307);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle"
    // Rezept.g:4543:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle returns [com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle element = null] : a0= '\\u00fcbernommen' (a1= QUOTED_34_34 ) a2= 'aus' (a3= QUOTED_34_34 ) a4= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Rezept.g:4546:2: (a0= '\\u00fcbernommen' (a1= QUOTED_34_34 ) a2= 'aus' (a3= QUOTED_34_34 ) a4= '.' )
            // Rezept.g:4547:2: a0= '\\u00fcbernommen' (a1= QUOTED_34_34 ) a2= 'aus' (a3= QUOTED_34_34 ) a4= '.'
            {
            a0=(Token)match(input,64,FOLLOW_64_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4286); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 308);
            	}

            // Rezept.g:4561:2: (a1= QUOTED_34_34 )
            // Rezept.g:4562:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4304); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 309);
            	}

            a2=(Token)match(input,66,FOLLOW_66_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4325); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 310);
            	}

            // Rezept.g:4611:2: (a3= QUOTED_34_34 )
            // Rezept.g:4612:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4343); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 311);
            	}

            a4=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4364); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLiteraturquelle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_23_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 312, 313);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle"
    // Rezept.g:4666:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle returns [com.github.funthomas424242.rezeptsammler.rezept.Personenquelle element = null] : a0= '\\u00fcberliefert' a1= 'von' (a2= QUOTED_34_34 ) a3= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Personenquelle parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Personenquelle element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // Rezept.g:4669:2: (a0= '\\u00fcberliefert' a1= 'von' (a2= QUOTED_34_34 ) a3= '.' )
            // Rezept.g:4670:2: a0= '\\u00fcberliefert' a1= 'von' (a2= QUOTED_34_34 ) a3= '.'
            {
            a0=(Token)match(input,63,FOLLOW_63_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4393); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPersonenquelle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 314);
            	}

            a1=(Token)match(input,73,FOLLOW_73_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4407); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPersonenquelle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 315);
            	}

            // Rezept.g:4698:2: (a2= QUOTED_34_34 )
            // Rezept.g:4699:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4425); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 316);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4446); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createPersonenquelle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_24_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 317, 318);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Bild"
    // Rezept.g:4753:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Bild returns [com.github.funthomas424242.rezeptsammler.rezept.Bild element = null] : a0= 'Bild:' (a1_0= parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad ) ( (a2= 'Text:' (a3= QUOTED_34_34 ) ) )? ( (a4= 'Lizenz:' (a5= QUOTED_34_34 ) ) )? ( (a6= 'Urheber:' (a7= QUOTED_34_34 ) ) )? a8= '.' ;
    public final com.github.funthomas424242.rezeptsammler.rezept.Bild parse_com_github_funthomas424242_rezeptsammler_rezept_Bild() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Bild element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Bild_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        com.github.funthomas424242.rezeptsammler.rezept.AblagePfad a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }

            // Rezept.g:4756:2: (a0= 'Bild:' (a1_0= parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad ) ( (a2= 'Text:' (a3= QUOTED_34_34 ) ) )? ( (a4= 'Lizenz:' (a5= QUOTED_34_34 ) ) )? ( (a6= 'Urheber:' (a7= QUOTED_34_34 ) ) )? a8= '.' )
            // Rezept.g:4757:2: a0= 'Bild:' (a1_0= parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad ) ( (a2= 'Text:' (a3= QUOTED_34_34 ) ) )? ( (a4= 'Lizenz:' (a5= QUOTED_34_34 ) ) )? ( (a6= 'Urheber:' (a7= QUOTED_34_34 ) ) )? a8= '.'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4475); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getBild(), 319, 320);
            	}

            // Rezept.g:4771:2: (a1_0= parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad )
            // Rezept.g:4772:3: a1_0= parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad
            {
            pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4493);
            a1_0=parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 321, 324);
            	}

            // Rezept.g:4797:2: ( (a2= 'Text:' (a3= QUOTED_34_34 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Rezept.g:4798:3: (a2= 'Text:' (a3= QUOTED_34_34 ) )
                    {
                    // Rezept.g:4798:3: (a2= 'Text:' (a3= QUOTED_34_34 ) )
                    // Rezept.g:4799:4: a2= 'Text:' (a3= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,51,FOLLOW_51_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4520); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 325);
                    			}

                    // Rezept.g:4813:4: (a3= QUOTED_34_34 )
                    // Rezept.g:4814:5: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4546); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 326, 328);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 329, 331);
            	}

            // Rezept.g:4856:2: ( (a4= 'Lizenz:' (a5= QUOTED_34_34 ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Rezept.g:4857:3: (a4= 'Lizenz:' (a5= QUOTED_34_34 ) )
                    {
                    // Rezept.g:4857:3: (a4= 'Lizenz:' (a5= QUOTED_34_34 ) )
                    // Rezept.g:4858:4: a4= 'Lizenz:' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,32,FOLLOW_32_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4601); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 332);
                    			}

                    // Rezept.g:4872:4: (a5= QUOTED_34_34 )
                    // Rezept.g:4873:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4627); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 333, 334);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 335, 336);
            	}

            // Rezept.g:4915:2: ( (a6= 'Urheber:' (a7= QUOTED_34_34 ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Rezept.g:4916:3: (a6= 'Urheber:' (a7= QUOTED_34_34 ) )
                    {
                    // Rezept.g:4916:3: (a6= 'Urheber:' (a7= QUOTED_34_34 ) )
                    // Rezept.g:4917:4: a6= 'Urheber:' (a7= QUOTED_34_34 )
                    {
                    a6=(Token)match(input,57,FOLLOW_57_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4682); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 337);
                    			}

                    // Rezept.g:4931:4: (a7= QUOTED_34_34 )
                    // Rezept.g:4932:5: a7= QUOTED_34_34
                    {
                    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4708); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 338);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 339);
            	}

            a8=(Token)match(input,14,FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4754); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createBild();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_25_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezept(), 340);
            		addExpectedElement(null, 341);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, parse_com_github_funthomas424242_rezeptsammler_rezept_Bild_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Bild"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad"
    // Rezept.g:4994:1: parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad returns [com.github.funthomas424242.rezeptsammler.rezept.InternetPfad element = null] : a0= 'URL:' (a1= QUOTED_34_34 ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.InternetPfad parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.InternetPfad element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }

            // Rezept.g:4997:2: (a0= 'URL:' (a1= QUOTED_34_34 ) )
            // Rezept.g:4998:2: a0= 'URL:' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,55,FOLLOW_55_in_parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad4783); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createInternetPfad();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_26_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 342);
            	}

            // Rezept.g:5012:2: (a1= QUOTED_34_34 )
            // Rezept.g:5013:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad4801); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 343, 346);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad"
    // Rezept.g:5053:1: parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad returns [com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad element = null] : a0= 'FileName:' (a1= QUOTED_34_34 ) ;
    public final com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }

            // Rezept.g:5056:2: (a0= 'FileName:' (a1= QUOTED_34_34 ) )
            // Rezept.g:5057:2: a0= 'FileName:' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad4837); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = com.github.funthomas424242.rezeptsammler.rezept.RezeptFactory.eINSTANCE.createLokalerPfad();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptGrammarInformationProvider.REZEPT_27_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 347);
            	}

            // Rezept.g:5071:2: (a1= QUOTED_34_34 )
            // Rezept.g:5072:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad4855); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 348, 351);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Menge"
    // Rezept.g:5112:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Menge returns [com.github.funthomas424242.rezeptsammler.rezept.Menge element = null] : (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge );
    public final com.github.funthomas424242.rezeptsammler.rezept.Menge parse_com_github_funthomas424242_rezeptsammler_rezept_Menge() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Menge element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Menge_StartIndex = input.index();

        com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge c0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }

            // Rezept.g:5113:2: (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            else if ( (LA35_0==QUOTED_34_34) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // Rezept.g:5114:2: c0= parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge4887);
                    c0=parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Rezept.g:5115:4: c1= parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge4897);
                    c1=parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, parse_com_github_funthomas424242_rezeptsammler_rezept_Menge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Menge"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle"
    // Rezept.g:5119:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle returns [com.github.funthomas424242.rezeptsammler.rezept.Quelle element = null] : (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle );
    public final com.github.funthomas424242.rezeptsammler.rezept.Quelle parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Quelle element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle_StartIndex = input.index();

        com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle c0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Personenquelle c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }

            // Rezept.g:5120:2: (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==64) ) {
                alt36=1;
            }
            else if ( (LA36_0==63) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // Rezept.g:5121:2: c0= parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle4918);
                    c0=parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Rezept.g:5122:4: c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle4928);
                    c1=parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Tag"
    // Rezept.g:5126:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Tag returns [com.github.funthomas424242.rezeptsammler.rezept.Tag element = null] : (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag );
    public final com.github.funthomas424242.rezeptsammler.rezept.Tag parse_com_github_funthomas424242_rezeptsammler_rezept_Tag() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Tag element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Tag_StartIndex = input.index();

        com.github.funthomas424242.rezeptsammler.rezept.StoffTag c0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag c1 =null;

        com.github.funthomas424242.rezeptsammler.rezept.DiaetTag c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }

            // Rezept.g:5127:2: (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt37=1;
                }
                break;
            case 50:
                {
                alt37=2;
                }
                break;
            case 24:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // Rezept.g:5128:2: c0= parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag4949);
                    c0=parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Rezept.g:5129:4: c1= parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag4959);
                    c1=parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Rezept.g:5130:4: c2= parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag4969);
                    c2=parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, parse_com_github_funthomas424242_rezeptsammler_rezept_Tag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Tag"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz"
    // Rezept.g:5134:1: parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz returns [com.github.funthomas424242.rezeptsammler.rezept.Notiz element = null] : (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung );
    public final com.github.funthomas424242.rezeptsammler.rezept.Notiz parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.Notiz element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz_StartIndex = input.index();

        com.github.funthomas424242.rezeptsammler.rezept.Tipp c0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Kommentar c1 =null;

        com.github.funthomas424242.rezeptsammler.rezept.Anmerkung c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }

            // Rezept.g:5135:2: (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar |c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt38=1;
                }
                break;
            case 30:
                {
                alt38=2;
                }
                break;
            case 19:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // Rezept.g:5136:2: c0= parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz4990);
                    c0=parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Rezept.g:5137:4: c1= parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz5000);
                    c1=parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Rezept.g:5138:4: c2= parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz5010);
                    c2=parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz"



    // $ANTLR start "parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad"
    // Rezept.g:5142:1: parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad returns [com.github.funthomas424242.rezeptsammler.rezept.AblagePfad element = null] : (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad );
    public final com.github.funthomas424242.rezeptsammler.rezept.AblagePfad parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad() throws RecognitionException {
        com.github.funthomas424242.rezeptsammler.rezept.AblagePfad element =  null;

        int parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad_StartIndex = input.index();

        com.github.funthomas424242.rezeptsammler.rezept.InternetPfad c0 =null;

        com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }

            // Rezept.g:5143:2: (c0= parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad |c1= parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            else if ( (LA39_0==26) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Rezept.g:5144:2: c0= parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad_in_parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad5031);
                    c0=parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Rezept.g:5145:4: c1= parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad
                    {
                    pushFollow(FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad_in_parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad5041);
                    c1=parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste_in_start96 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste_in_start110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung185 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung203 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung238 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung252 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung270 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung305 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung319 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung358 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung372 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung390 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_71_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung434 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung454 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung480 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung546 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung611 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung634 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_53_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung660 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung678 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung699 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung722 = new BitSet(new long[]{0x2400000200200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_61_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung757 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung783 = new BitSet(new long[]{0x0400000200020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung829 = new BitSet(new long[]{0x0400000200020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung891 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_58_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DATUM_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung952 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz1047 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_QUOTED_6161_6161_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz1076 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Absatz1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1176 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1190 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1208 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1229 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1247 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1303 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1349 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Autor1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1417 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1435 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1465 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Lizenz1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport1552 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport1570 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1620 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1638 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1659 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1682 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste1717 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_68_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport1758 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport1776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1826 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1844 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1865 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produktliste1888 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1929 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1968 = new BitSet(new long[]{0x0800001000000200L});
    public static final BitSet FOLLOW_59_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt1991 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2017 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2050 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2087 = new BitSet(new long[]{0x004002009A000000L});
    public static final BitSet FOLLOW_25_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2114 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2140 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2173 = new BitSet(new long[]{0x0040020098000000L});
    public static final BitSet FOLLOW_54_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2215 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2241 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2274 = new BitSet(new long[]{0x0000020098000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2316 = new BitSet(new long[]{0x0000000098000000L});
    public static final BitSet FOLLOW_27_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2351 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2377 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2410 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_28_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2452 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2511 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DATUM_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2562 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Produkt2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2644 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2669 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Preis2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2719 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2758 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2772 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2790 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2811 = new BitSet(new long[]{0x0100000020000000L});
    public static final BitSet FOLLOW_56_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2834 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2860 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2893 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2926 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2944 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2965 = new BitSet(new long[]{0x0000200080100000L});
    public static final BitSet FOLLOW_45_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept2988 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3014 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3064 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3090 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3123 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DATUM_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3195 = new BitSet(new long[]{0x0006000001000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3218 = new BitSet(new long[]{0x4006080001000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3253 = new BitSet(new long[]{0x4000080000000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3288 = new BitSet(new long[]{0x4000000000040000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3323 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3349 = new BitSet(new long[]{0x0010000040480000L,0x0000000000000800L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3372 = new BitSet(new long[]{0x0010000040480000L,0x0000000000000800L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3407 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Rezept3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag3462 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag3480 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag3530 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag3548 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag3598 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag3616 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3666 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3684 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3705 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat3773 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat3791 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Zutat3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3849 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3867 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3897 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3931 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge3985 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt4035 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt4053 = new BitSet(new long[]{0x0010000040080002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp4124 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar4178 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung4232 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4325 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4343 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4407 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4425 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4475 = new BitSet(new long[]{0x0080000004000000L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4493 = new BitSet(new long[]{0x0208000100004000L});
    public static final BitSet FOLLOW_51_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4520 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4546 = new BitSet(new long[]{0x0200000100004000L});
    public static final BitSet FOLLOW_32_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4601 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4627 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_57_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4682 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Bild4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad4783 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad4837 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Menge4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Quelle4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_StoffTag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Tag4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Tipp_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Kommentar_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung_in_parse_com_github_funthomas424242_rezeptsammler_rezept_Notiz5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad_in_parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad_in_parse_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad5041 = new BitSet(new long[]{0x0000000000000002L});

}