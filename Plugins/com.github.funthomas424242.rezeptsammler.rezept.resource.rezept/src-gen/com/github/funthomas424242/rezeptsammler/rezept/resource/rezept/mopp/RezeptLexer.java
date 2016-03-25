// $ANTLR 3.4

	package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RezeptLexer extends Lexer {
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

    	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
    	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
    	
    	public void reportError(RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RezeptLexer() {} 
    public RezeptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RezeptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Rezept.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:20:7: ( '--Zusatzinformationen--' )
            // Rezept.g:20:9: '--Zusatzinformationen--'
            {
            match("--Zusatzinformationen--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:21:7: ( '.' )
            // Rezept.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:22:7: ( ';' )
            // Rezept.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:23:7: ( '=' )
            // Rezept.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:24:7: ( 'Absatz:' )
            // Rezept.g:24:9: 'Absatz:'
            {
            match("Absatz:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:25:7: ( 'Aktion:' )
            // Rezept.g:25:9: 'Aktion:'
            {
            match("Aktion:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:26:7: ( 'Anmerkung:' )
            // Rezept.g:26:9: 'Anmerkung:'
            {
            match("Anmerkung:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:27:7: ( 'Ausreichend f\\u00fcr' )
            // Rezept.g:27:9: 'Ausreichend f\\u00fcr'
            {
            match("Ausreichend f\u00fcr"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:28:7: ( 'Autor:' )
            // Rezept.g:28:9: 'Autor:'
            {
            match("Autor:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:29:7: ( 'Bild:' )
            // Rezept.g:29:9: 'Bild:'
            {
            match("Bild:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:30:7: ( 'Buch' )
            // Rezept.g:30:9: 'Buch'
            {
            match("Buch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:31:7: ( 'Di\\u00e4t:' )
            // Rezept.g:31:9: 'Di\\u00e4t:'
            {
            match("Di\u00e4t:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:32:7: ( 'EAN:' )
            // Rezept.g:32:9: 'EAN:'
            {
            match("EAN:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:33:7: ( 'FileName:' )
            // Rezept.g:33:9: 'FileName:'
            {
            match("FileName:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:34:7: ( 'H\\u00e4ndler:' )
            // Rezept.g:34:9: 'H\\u00e4ndler:'
            {
            match("H\u00e4ndler:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:35:7: ( 'Hersteller:' )
            // Rezept.g:35:9: 'Hersteller:'
            {
            match("Hersteller:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:36:7: ( 'Kategorie:' )
            // Rezept.g:36:9: 'Kategorie:'
            {
            match("Kategorie:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:37:7: ( 'Kommentar:' )
            // Rezept.g:37:9: 'Kommentar:'
            {
            match("Kommentar:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:38:7: ( 'Letzte \\u00c4nderung:' )
            // Rezept.g:38:9: 'Letzte \\u00c4nderung:'
            {
            match("Letzte \u00c4nderung:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:39:7: ( 'Lizenz:' )
            // Rezept.g:39:9: 'Lizenz:'
            {
            match("Lizenz:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:40:7: ( 'Lizenzhinweis:' )
            // Rezept.g:40:9: 'Lizenzhinweis:'
            {
            match("Lizenzhinweis:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:41:7: ( 'Lizenztext:' )
            // Rezept.g:41:9: 'Lizenztext:'
            {
            match("Lizenztext:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:42:7: ( 'Media Folder:' )
            // Rezept.g:42:9: 'Media Folder:'
            {
            match("Media Folder:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:43:7: ( 'Menge:' )
            // Rezept.g:43:9: 'Menge:'
            {
            match("Menge:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:44:7: ( 'ModifikationsNotiz:' )
            // Rezept.g:44:9: 'ModifikationsNotiz:'
            {
            match("ModifikationsNotiz:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:45:7: ( 'Nachname:' )
            // Rezept.g:45:9: 'Nachname:'
            {
            match("Nachname:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:46:7: ( 'Organisation:' )
            // Rezept.g:46:9: 'Organisation:'
            {
            match("Organisation:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:47:7: ( 'Personen.' )
            // Rezept.g:47:9: 'Personen.'
            {
            match("Personen."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:48:7: ( 'Preis:' )
            // Rezept.g:48:9: 'Preis:'
            {
            match("Preis:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:49:7: ( 'Produkt' )
            // Rezept.g:49:9: 'Produkt'
            {
            match("Produkt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:50:7: ( 'ProduktRef:' )
            // Rezept.g:50:9: 'ProduktRef:'
            {
            match("ProduktRef:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:51:7: ( 'Produktliste' )
            // Rezept.g:51:9: 'Produktliste'
            {
            match("Produktliste"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:52:7: ( 'Quelle:' )
            // Rezept.g:52:9: 'Quelle:'
            {
            match("Quelle:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:53:7: ( 'Rezept' )
            // Rezept.g:53:9: 'Rezept'
            {
            match("Rezept"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:54:7: ( 'RezeptSammlung' )
            // Rezept.g:54:9: 'RezeptSammlung'
            {
            match("RezeptSammlung"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:55:7: ( 'Rezeptliste' )
            // Rezept.g:55:9: 'Rezeptliste'
            {
            match("Rezeptliste"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:56:7: ( 'Stoff:' )
            // Rezept.g:56:9: 'Stoff:'
            {
            match("Stoff:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:57:7: ( 'Tag:' )
            // Rezept.g:57:9: 'Tag:'
            {
            match("Tag:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:58:7: ( 'Text:' )
            // Rezept.g:58:9: 'Text:'
            {
            match("Text:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:59:7: ( 'Tipp:' )
            // Rezept.g:59:9: 'Tipp:'
            {
            match("Tipp:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:60:7: ( 'Titel:' )
            // Rezept.g:60:9: 'Titel:'
            {
            match("Titel:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:61:7: ( 'UBA:' )
            // Rezept.g:61:9: 'UBA:'
            {
            match("UBA:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:62:7: ( 'URL:' )
            // Rezept.g:62:9: 'URL:'
            {
            match("URL:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:63:7: ( 'Untertitel:' )
            // Rezept.g:63:9: 'Untertitel:'
            {
            match("Untertitel:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:64:7: ( 'Urheber:' )
            // Rezept.g:64:9: 'Urheber:'
            {
            match("Urheber:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:65:7: ( 'Ver\\u00f6ffentlicht am:' )
            // Rezept.g:65:9: 'Ver\\u00f6ffentlicht am:'
            {
            match("Ver\u00f6ffentlicht am:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:66:7: ( 'Verpackung:' )
            // Rezept.g:66:9: 'Verpackung:'
            {
            match("Verpackung:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:67:7: ( 'Vorname:' )
            // Rezept.g:67:9: 'Vorname:'
            {
            match("Vorname:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:68:7: ( 'Vorwort:' )
            // Rezept.g:68:9: 'Vorwort:'
            {
            match("Vorwort:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:69:7: ( 'Zutat:' )
            // Rezept.g:69:9: 'Zutat:'
            {
            match("Zutat:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:70:7: ( '\\u00fcberliefert' )
            // Rezept.g:70:9: '\\u00fcberliefert'
            {
            match("\u00fcberliefert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:71:7: ( '\\u00fcbernommen' )
            // Rezept.g:71:9: '\\u00fcbernommen'
            {
            match("\u00fcbernommen"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:72:7: ( 'artifactId' )
            // Rezept.g:72:9: 'artifactId'
            {
            match("artifactId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:73:7: ( 'aus' )
            // Rezept.g:73:9: 'aus'
            {
            match("aus"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:74:7: ( 'groupId' )
            // Rezept.g:74:9: 'groupId'
            {
            match("groupId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:75:7: ( 'import produkte' )
            // Rezept.g:75:9: 'import produkte'
            {
            match("import produkte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:76:7: ( 'import rezepte' )
            // Rezept.g:76:9: 'import rezepte'
            {
            match("import rezepte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:77:7: ( 'mal.' )
            // Rezept.g:77:9: 'mal.'
            {
            match("mal."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:78:7: ( 'siteURL' )
            // Rezept.g:78:9: 'siteURL'
            {
            match("siteURL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:79:7: ( 'version' )
            // Rezept.g:79:9: 'version'
            {
            match("version"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:80:7: ( 'von' )
            // Rezept.g:80:9: 'von'
            {
            match("von"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:81:7: ( '{' )
            // Rezept.g:81:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:82:7: ( '}' )
            // Rezept.g:82:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5149:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Rezept.g:5150:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Rezept.g:5150:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Rezept.g:5150:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Rezept.g:5150:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Rezept.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5153:3: ( ( ( '\\'' ) ( '#' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '\\'' ) ) )
            // Rezept.g:5154:2: ( ( '\\'' ) ( '#' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '\\'' ) )
            {
            // Rezept.g:5154:2: ( ( '\\'' ) ( '#' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '\\'' ) )
            // Rezept.g:5154:3: ( '\\'' ) ( '#' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ( '\\'' )
            {
            // Rezept.g:5154:3: ( '\\'' )
            // Rezept.g:5154:4: '\\''
            {
            match('\''); 

            }


            // Rezept.g:5154:9: ( '#' )
            // Rezept.g:5154:10: '#'
            {
            match('#'); 

            }


            // Rezept.g:5154:14: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Rezept.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            // Rezept.g:5154:60: ( '\\'' )
            // Rezept.g:5154:61: '\\''
            {
            match('\''); 

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DATUM"
    public final void mDATUM() throws RecognitionException {
        try {
            int _type = DATUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5157:6: ( ( ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // Rezept.g:5158:2: ( ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // Rezept.g:5158:2: ( ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            // Rezept.g:5158:3: ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) '.' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('.'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('.'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATUM"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5160:7: ( ( ( '0' .. '9' )+ ) )
            // Rezept.g:5161:2: ( ( '0' .. '9' )+ )
            {
            // Rezept.g:5161:2: ( ( '0' .. '9' )+ )
            // Rezept.g:5161:3: ( '0' .. '9' )+
            {
            // Rezept.g:5161:3: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Rezept.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5163:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Rezept.g:5164:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Rezept.g:5164:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Rezept.g:5164:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Rezept.g:5164:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Rezept.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5166:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Rezept.g:5167:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5170:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Rezept.g:5171:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Rezept.g:5171:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Rezept.g:5171:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Rezept.g:5171:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\n') ) {
                    alt5=1;
                }
                else {
                    alt5=2;
                }
            }
            else if ( (LA5_0=='\n') ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Rezept.g:5171:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Rezept.g:5171:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Rezept.g:5171:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5174:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Rezept.g:5175:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Rezept.g:5175:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Rezept.g:5175:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Rezept.g:5175:3: ( '\"' )
            // Rezept.g:5175:4: '\"'
            {
            match('\"'); 

            }


            // Rezept.g:5175:8: (~ ( '\"' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Rezept.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // Rezept.g:5175:17: ( '\"' )
            // Rezept.g:5175:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34"

    // $ANTLR start "QUOTED_6161_6161"
    public final void mQUOTED_6161_6161() throws RecognitionException {
        try {
            int _type = QUOTED_6161_6161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Rezept.g:5177:17: ( ( ( '==' ) (~ ( '=' ) | '=' ~ ( '=' ) )* ( '==' ) ) )
            // Rezept.g:5178:2: ( ( '==' ) (~ ( '=' ) | '=' ~ ( '=' ) )* ( '==' ) )
            {
            // Rezept.g:5178:2: ( ( '==' ) (~ ( '=' ) | '=' ~ ( '=' ) )* ( '==' ) )
            // Rezept.g:5178:3: ( '==' ) (~ ( '=' ) | '=' ~ ( '=' ) )* ( '==' )
            {
            // Rezept.g:5178:3: ( '==' )
            // Rezept.g:5178:4: '=='
            {
            match("=="); 



            }


            // Rezept.g:5178:9: (~ ( '=' ) | '=' ~ ( '=' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='=') ) {
                    int LA7_1 = input.LA(2);

                    if ( ((LA7_1 >= '\u0000' && LA7_1 <= '<')||(LA7_1 >= '>' && LA7_1 <= '\uFFFF')) ) {
                        alt7=2;
                    }


                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '<')||(LA7_0 >= '>' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Rezept.g:5178:10: ~ ( '=' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // Rezept.g:5178:17: '=' ~ ( '=' )
            	    {
            	    match('='); 

            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // Rezept.g:5178:28: ( '==' )
            // Rezept.g:5178:29: '=='
            {
            match("=="); 



            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_6161_6161"

    public void mTokens() throws RecognitionException {
        // Rezept.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | COMMENT | ID | DATUM | NUMBER | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 | QUOTED_6161_6161 )
        int alt8=72;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // Rezept.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // Rezept.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // Rezept.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // Rezept.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // Rezept.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // Rezept.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // Rezept.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // Rezept.g:1:52: T__20
                {
                mT__20(); 


                }
                break;
            case 9 :
                // Rezept.g:1:58: T__21
                {
                mT__21(); 


                }
                break;
            case 10 :
                // Rezept.g:1:64: T__22
                {
                mT__22(); 


                }
                break;
            case 11 :
                // Rezept.g:1:70: T__23
                {
                mT__23(); 


                }
                break;
            case 12 :
                // Rezept.g:1:76: T__24
                {
                mT__24(); 


                }
                break;
            case 13 :
                // Rezept.g:1:82: T__25
                {
                mT__25(); 


                }
                break;
            case 14 :
                // Rezept.g:1:88: T__26
                {
                mT__26(); 


                }
                break;
            case 15 :
                // Rezept.g:1:94: T__27
                {
                mT__27(); 


                }
                break;
            case 16 :
                // Rezept.g:1:100: T__28
                {
                mT__28(); 


                }
                break;
            case 17 :
                // Rezept.g:1:106: T__29
                {
                mT__29(); 


                }
                break;
            case 18 :
                // Rezept.g:1:112: T__30
                {
                mT__30(); 


                }
                break;
            case 19 :
                // Rezept.g:1:118: T__31
                {
                mT__31(); 


                }
                break;
            case 20 :
                // Rezept.g:1:124: T__32
                {
                mT__32(); 


                }
                break;
            case 21 :
                // Rezept.g:1:130: T__33
                {
                mT__33(); 


                }
                break;
            case 22 :
                // Rezept.g:1:136: T__34
                {
                mT__34(); 


                }
                break;
            case 23 :
                // Rezept.g:1:142: T__35
                {
                mT__35(); 


                }
                break;
            case 24 :
                // Rezept.g:1:148: T__36
                {
                mT__36(); 


                }
                break;
            case 25 :
                // Rezept.g:1:154: T__37
                {
                mT__37(); 


                }
                break;
            case 26 :
                // Rezept.g:1:160: T__38
                {
                mT__38(); 


                }
                break;
            case 27 :
                // Rezept.g:1:166: T__39
                {
                mT__39(); 


                }
                break;
            case 28 :
                // Rezept.g:1:172: T__40
                {
                mT__40(); 


                }
                break;
            case 29 :
                // Rezept.g:1:178: T__41
                {
                mT__41(); 


                }
                break;
            case 30 :
                // Rezept.g:1:184: T__42
                {
                mT__42(); 


                }
                break;
            case 31 :
                // Rezept.g:1:190: T__43
                {
                mT__43(); 


                }
                break;
            case 32 :
                // Rezept.g:1:196: T__44
                {
                mT__44(); 


                }
                break;
            case 33 :
                // Rezept.g:1:202: T__45
                {
                mT__45(); 


                }
                break;
            case 34 :
                // Rezept.g:1:208: T__46
                {
                mT__46(); 


                }
                break;
            case 35 :
                // Rezept.g:1:214: T__47
                {
                mT__47(); 


                }
                break;
            case 36 :
                // Rezept.g:1:220: T__48
                {
                mT__48(); 


                }
                break;
            case 37 :
                // Rezept.g:1:226: T__49
                {
                mT__49(); 


                }
                break;
            case 38 :
                // Rezept.g:1:232: T__50
                {
                mT__50(); 


                }
                break;
            case 39 :
                // Rezept.g:1:238: T__51
                {
                mT__51(); 


                }
                break;
            case 40 :
                // Rezept.g:1:244: T__52
                {
                mT__52(); 


                }
                break;
            case 41 :
                // Rezept.g:1:250: T__53
                {
                mT__53(); 


                }
                break;
            case 42 :
                // Rezept.g:1:256: T__54
                {
                mT__54(); 


                }
                break;
            case 43 :
                // Rezept.g:1:262: T__55
                {
                mT__55(); 


                }
                break;
            case 44 :
                // Rezept.g:1:268: T__56
                {
                mT__56(); 


                }
                break;
            case 45 :
                // Rezept.g:1:274: T__57
                {
                mT__57(); 


                }
                break;
            case 46 :
                // Rezept.g:1:280: T__58
                {
                mT__58(); 


                }
                break;
            case 47 :
                // Rezept.g:1:286: T__59
                {
                mT__59(); 


                }
                break;
            case 48 :
                // Rezept.g:1:292: T__60
                {
                mT__60(); 


                }
                break;
            case 49 :
                // Rezept.g:1:298: T__61
                {
                mT__61(); 


                }
                break;
            case 50 :
                // Rezept.g:1:304: T__62
                {
                mT__62(); 


                }
                break;
            case 51 :
                // Rezept.g:1:310: T__63
                {
                mT__63(); 


                }
                break;
            case 52 :
                // Rezept.g:1:316: T__64
                {
                mT__64(); 


                }
                break;
            case 53 :
                // Rezept.g:1:322: T__65
                {
                mT__65(); 


                }
                break;
            case 54 :
                // Rezept.g:1:328: T__66
                {
                mT__66(); 


                }
                break;
            case 55 :
                // Rezept.g:1:334: T__67
                {
                mT__67(); 


                }
                break;
            case 56 :
                // Rezept.g:1:340: T__68
                {
                mT__68(); 


                }
                break;
            case 57 :
                // Rezept.g:1:346: T__69
                {
                mT__69(); 


                }
                break;
            case 58 :
                // Rezept.g:1:352: T__70
                {
                mT__70(); 


                }
                break;
            case 59 :
                // Rezept.g:1:358: T__71
                {
                mT__71(); 


                }
                break;
            case 60 :
                // Rezept.g:1:364: T__72
                {
                mT__72(); 


                }
                break;
            case 61 :
                // Rezept.g:1:370: T__73
                {
                mT__73(); 


                }
                break;
            case 62 :
                // Rezept.g:1:376: T__74
                {
                mT__74(); 


                }
                break;
            case 63 :
                // Rezept.g:1:382: T__75
                {
                mT__75(); 


                }
                break;
            case 64 :
                // Rezept.g:1:388: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 65 :
                // Rezept.g:1:396: ID
                {
                mID(); 


                }
                break;
            case 66 :
                // Rezept.g:1:399: DATUM
                {
                mDATUM(); 


                }
                break;
            case 67 :
                // Rezept.g:1:405: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 68 :
                // Rezept.g:1:412: TEXT
                {
                mTEXT(); 


                }
                break;
            case 69 :
                // Rezept.g:1:417: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 70 :
                // Rezept.g:1:428: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 71 :
                // Rezept.g:1:438: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;
            case 72 :
                // Rezept.g:1:451: QUOTED_6161_6161
                {
                mQUOTED_6161_6161(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\44\2\uffff\1\52\23\44\1\uffff\6\44\4\uffff\1\127\4\uffff"+
        "\1\44\2\uffff\11\44\1\uffff\30\44\1\uffff\10\44\1\127\1\uffff\10"+
        "\44\1\uffff\35\44\1\uffff\1\44\1\u00b2\5\44\1\u00b8\1\uffff\1\127"+
        "\7\44\1\u00c0\1\uffff\21\44\1\uffff\3\44\2\uffff\2\44\1\uffff\4"+
        "\44\1\uffff\1\44\1\uffff\2\44\1\uffff\2\44\1\uffff\6\44\2\uffff"+
        "\21\44\2\uffff\7\44\2\uffff\12\44\1\uffff\6\44\2\uffff\4\44\1\uffff"+
        "\2\44\1\u011a\2\uffff\5\44\1\uffff\6\44\2\uffff\6\44\2\uffff\6\44"+
        "\1\u0134\1\uffff\2\44\1\uffff\6\44\1\u013d\1\uffff\1\u0140\1\u0141"+
        "\17\44\1\uffff\3\44\1\uffff\1\44\2\uffff\1\44\5\uffff\3\44\1\uffff"+
        "\6\44\1\uffff\1\44\1\uffff\10\44\1\uffff\2\44\2\uffff\12\44\1\u0174"+
        "\2\44\1\uffff\1\44\1\uffff\2\44\1\uffff\2\44\1\u017c\3\uffff\1\44"+
        "\1\uffff\3\44\1\u0181\1\44\1\uffff\3\44\2\uffff\2\44\1\uffff\1\44"+
        "\1\u0189\2\44\1\uffff\7\44\1\uffff\3\44\1\u0196\1\uffff";
    static final String DFA8_eofS =
        "\u0197\uffff";
    static final String DFA8_minS =
        "\1\11\1\55\2\uffff\1\75\1\142\2\151\1\101\1\151\1\145\1\141\2\145"+
        "\1\141\1\162\1\145\1\165\1\145\1\164\1\141\1\102\1\145\1\165\1\142"+
        "\2\162\1\155\1\141\1\151\1\145\4\uffff\1\55\4\uffff\1\132\2\uffff"+
        "\1\163\1\164\1\155\1\163\1\154\1\143\1\u00e4\1\116\1\154\1\uffff"+
        "\1\162\1\164\1\155\1\164\1\172\2\144\1\143\1\147\1\162\2\145\1\172"+
        "\1\157\1\147\1\170\1\160\1\101\1\114\1\164\1\150\2\162\1\164\1\145"+
        "\1\164\1\163\1\157\1\160\1\154\1\164\1\162\1\156\1\55\1\uffff\1"+
        "\165\1\141\1\151\1\145\1\162\1\157\1\144\1\150\1\uffff\1\72\1\145"+
        "\1\163\1\145\1\155\1\172\1\145\1\151\1\147\1\151\1\150\1\141\1\163"+
        "\1\151\1\144\1\154\1\145\1\146\1\72\1\164\1\160\1\145\2\72\2\145"+
        "\1\160\1\156\1\141\1\162\1\151\1\55\1\165\1\157\1\56\1\145\1\163"+
        "\1\55\1\uffff\1\55\1\163\1\164\1\157\1\162\1\145\1\162\1\72\1\55"+
        "\1\uffff\1\116\1\164\1\147\1\145\1\164\1\156\1\141\1\145\1\146\2"+
        "\156\1\157\1\163\1\165\1\154\1\160\1\146\1\uffff\2\72\1\154\2\uffff"+
        "\1\162\1\142\1\uffff\2\141\1\157\1\164\1\154\1\146\1\uffff\1\160"+
        "\1\162\1\uffff\1\125\1\151\1\uffff\1\141\1\172\1\156\1\153\1\151"+
        "\1\72\2\uffff\1\141\1\145\1\157\1\156\1\145\1\172\1\40\1\72\1\151"+
        "\1\141\1\151\1\156\1\72\1\153\1\145\1\164\1\72\2\uffff\1\72\1\164"+
        "\1\145\1\143\1\155\1\162\1\72\2\uffff\1\141\1\111\1\164\1\122\1"+
        "\157\1\164\2\72\1\165\1\143\1\uffff\1\155\1\154\1\162\1\164\1\40"+
        "\1\72\2\uffff\1\153\1\155\1\163\1\145\1\uffff\1\164\1\72\1\55\2"+
        "\uffff\1\151\1\162\1\153\1\145\1\164\1\uffff\1\143\1\144\1\40\1"+
        "\114\1\156\1\172\2\uffff\1\156\1\150\1\145\1\154\1\151\1\141\2\uffff"+
        "\1\151\1\145\1\141\1\145\1\141\1\156\1\55\1\uffff\1\141\1\151\1"+
        "\uffff\1\164\1\72\1\165\2\72\1\164\1\55\1\160\2\55\1\151\1\147\1"+
        "\145\1\72\2\145\1\162\1\156\1\170\1\164\1\72\1\164\1\56\1\145\1"+
        "\151\1\uffff\1\155\1\163\1\145\1\uffff\1\156\2\uffff\1\111\5\uffff"+
        "\1\156\1\72\1\156\1\uffff\1\162\2\72\1\167\1\164\1\151\1\uffff\1"+
        "\151\1\uffff\1\146\1\163\1\155\1\164\1\154\1\147\1\144\1\146\1\uffff"+
        "\1\144\1\72\2\uffff\1\145\1\72\2\157\1\72\1\164\1\154\1\145\2\72"+
        "\1\55\1\157\1\40\1\uffff\1\151\1\uffff\2\156\1\uffff\1\145\1\165"+
        "\1\55\3\uffff\1\162\1\uffff\2\163\1\72\1\55\1\156\1\uffff\1\155"+
        "\1\72\1\116\2\uffff\1\147\1\141\1\uffff\1\157\1\55\2\164\1\uffff"+
        "\2\151\1\157\1\172\1\156\1\72\1\145\1\uffff\1\156\3\55\1\uffff";
    static final String DFA8_maxS =
        "\1\u00fc\1\55\2\uffff\1\75\2\165\1\151\1\101\1\151\1\u00e4\1\157"+
        "\1\151\1\157\1\141\2\162\1\165\1\145\1\164\1\151\1\162\1\157\1\165"+
        "\1\142\1\165\1\162\1\155\1\141\1\151\1\157\4\uffff\1\172\4\uffff"+
        "\1\132\2\uffff\1\163\1\164\1\155\1\164\1\154\1\143\1\u00e4\1\116"+
        "\1\154\1\uffff\1\162\1\164\1\155\1\164\1\172\1\156\1\144\1\143\1"+
        "\147\1\162\1\157\1\145\1\172\1\157\1\147\1\170\1\164\1\101\1\114"+
        "\1\164\1\150\2\162\1\164\1\145\1\164\1\163\1\157\1\160\1\154\1\164"+
        "\1\162\1\156\1\172\1\uffff\1\165\1\141\1\151\1\145\1\162\1\157\1"+
        "\144\1\150\1\uffff\1\72\1\145\1\163\1\145\1\155\1\172\1\145\1\151"+
        "\1\147\1\151\1\150\1\141\1\163\1\151\1\144\1\154\1\145\1\146\1\72"+
        "\1\164\1\160\1\145\2\72\2\145\1\u00f6\1\167\1\141\1\162\1\151\1"+
        "\172\1\165\1\157\1\56\1\145\1\163\1\172\1\uffff\1\172\1\163\1\164"+
        "\1\157\1\162\1\145\1\162\1\72\1\172\1\uffff\1\116\1\164\1\147\1"+
        "\145\1\164\1\156\1\141\1\145\1\146\2\156\1\157\1\163\1\165\1\154"+
        "\1\160\1\146\1\uffff\2\72\1\154\2\uffff\1\162\1\142\1\uffff\2\141"+
        "\1\157\1\164\1\156\1\146\1\uffff\1\160\1\162\1\uffff\1\125\1\151"+
        "\1\uffff\1\141\1\172\1\156\1\153\1\151\1\72\2\uffff\1\141\1\145"+
        "\1\157\1\156\1\145\1\172\1\40\1\72\1\151\1\141\1\151\1\156\1\72"+
        "\1\153\1\145\1\164\1\72\2\uffff\1\72\1\164\1\145\1\143\1\155\1\162"+
        "\1\72\2\uffff\1\141\1\111\1\164\1\122\1\157\1\164\2\72\1\165\1\143"+
        "\1\uffff\1\155\1\154\1\162\1\164\1\40\1\164\2\uffff\1\153\1\155"+
        "\1\163\1\145\1\uffff\1\164\1\72\1\172\2\uffff\1\151\1\162\1\153"+
        "\1\145\1\164\1\uffff\1\143\1\144\1\40\1\114\1\156\1\172\2\uffff"+
        "\1\156\1\150\1\145\1\154\1\151\1\141\2\uffff\1\151\1\145\1\141\1"+
        "\145\1\141\1\156\1\172\1\uffff\1\141\1\151\1\uffff\1\164\1\72\1"+
        "\165\2\72\1\164\1\172\1\162\2\172\1\151\1\147\1\145\1\72\2\145\1"+
        "\162\1\156\1\170\1\164\1\72\1\164\1\56\1\145\1\151\1\uffff\1\155"+
        "\1\163\1\145\1\uffff\1\156\2\uffff\1\111\5\uffff\1\156\1\72\1\156"+
        "\1\uffff\1\162\2\72\1\167\1\164\1\151\1\uffff\1\151\1\uffff\1\146"+
        "\1\163\1\155\1\164\1\154\1\147\1\144\1\146\1\uffff\1\144\1\72\2"+
        "\uffff\1\145\1\72\2\157\1\72\1\164\1\154\1\145\2\72\1\172\1\157"+
        "\1\40\1\uffff\1\151\1\uffff\2\156\1\uffff\1\145\1\165\1\172\3\uffff"+
        "\1\162\1\uffff\2\163\1\72\1\172\1\156\1\uffff\1\155\1\72\1\116\2"+
        "\uffff\1\147\1\141\1\uffff\1\157\1\172\2\164\1\uffff\2\151\1\157"+
        "\1\172\1\156\1\72\1\145\1\uffff\1\156\2\55\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\3\33\uffff\1\76\1\77\1\100\1\101\1\uffff\1\104\1"+
        "\105\1\106\1\107\1\uffff\1\110\1\4\11\uffff\1\17\42\uffff\1\103"+
        "\10\uffff\1\14\46\uffff\1\102\11\uffff\1\15\21\uffff\1\46\3\uffff"+
        "\1\52\1\53\2\uffff\1\56\6\uffff\1\66\2\uffff\1\72\2\uffff\1\75\6"+
        "\uffff\1\12\1\13\21\uffff\1\47\1\50\7\uffff\1\63\1\64\12\uffff\1"+
        "\11\6\uffff\1\27\1\30\4\uffff\1\35\3\uffff\1\45\1\51\5\uffff\1\62"+
        "\6\uffff\1\5\1\6\6\uffff\1\23\1\24\7\uffff\1\41\2\uffff\1\42\31"+
        "\uffff\1\36\3\uffff\1\55\1\uffff\1\60\1\61\1\uffff\1\67\1\70\1\71"+
        "\1\73\1\74\3\uffff\1\16\6\uffff\1\32\1\uffff\1\34\10\uffff\1\7\2"+
        "\uffff\1\21\1\22\15\uffff\1\20\1\uffff\1\26\2\uffff\1\37\3\uffff"+
        "\1\54\1\57\1\65\1\uffff\1\10\5\uffff\1\44\3\uffff\1\33\1\40\2\uffff"+
        "\1\25\4\uffff\1\43\7\uffff\1\31\4\uffff\1\1";
    static final String DFA8_specialS =
        "\u0197\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\45\1\46\1\uffff\1\45\1\46\22\uffff\1\45\1\uffff\1\47\4\uffff"+
            "\1\42\5\uffff\1\1\1\2\1\41\12\43\1\uffff\1\3\1\uffff\1\4\3\uffff"+
            "\1\5\1\6\1\44\1\7\1\10\1\11\1\44\1\12\2\44\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\3\44\1\27\4\uffff"+
            "\1\44\1\uffff\1\31\5\44\1\32\1\44\1\33\3\44\1\34\5\44\1\35\2"+
            "\44\1\36\4\44\1\37\1\uffff\1\40\176\uffff\1\30",
            "\1\50",
            "",
            "",
            "\1\51",
            "\1\53\10\uffff\1\54\2\uffff\1\55\6\uffff\1\56",
            "\1\57\13\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\176\uffff\1\64",
            "\1\66\15\uffff\1\67",
            "\1\70\3\uffff\1\71",
            "\1\72\11\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76\14\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103\3\uffff\1\104\3\uffff\1\105",
            "\1\106\17\uffff\1\107\33\uffff\1\110\3\uffff\1\111",
            "\1\112\11\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116\2\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\11\uffff\1\125",
            "",
            "",
            "",
            "",
            "\1\44\2\uffff\12\126\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "",
            "",
            "",
            "",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150\11\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156\11\uffff\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165\3\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\44\1\u0087\1\uffff\12\u0088\7\uffff\32\44\4\uffff\1\44\1"+
            "\uffff\32\44",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ac\u0085\uffff\1\u00ab",
            "\1\u00ad\10\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\2\uffff\12\u0088\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db\1\uffff\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f\55\uffff\1\u0110\13\uffff\1\u0111",
            "",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\44\2\uffff\12\44\7\uffff\22\44\1\u0118\7\44\4\uffff\1\44"+
            "\1\uffff\13\44\1\u0119\16\44",
            "",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "",
            "",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\44\2\uffff\12\44\7\uffff\21\44\1\u0132\10\44\4\uffff\1\44"+
            "\1\uffff\13\44\1\u0133\16\44",
            "",
            "\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u013e\1\uffff\1\u013f",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "",
            "",
            "\1\u0155",
            "",
            "",
            "",
            "",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u018a",
            "\1\u018b",
            "",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | COMMENT | ID | DATUM | NUMBER | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 | QUOTED_6161_6161 );";
        }
    }
 

}