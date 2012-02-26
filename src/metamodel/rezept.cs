SYNTAXDEF rezept
FOR <http://www.github.com/funthomas424242/language/rezept>
START RezeptModel


OPTIONS{
 reloadGeneratorModel="true";
 generateCodeFromGeneratorModel="true"; //wichtig um Fehler im Generat zu vermeiden
 disableLaunchSupport="false";
 usePredefinedTokens="true";
 //disableTokenSorting="false";
 //memoize="false";
 //resourcePluginID="net.sf.devtool.rezeptsammler.rezeptDSL.resource";
 //resourceUIPluginID="net.sf.devtool.rezeptsammler.rezeptDSL.ui";
 //basePackage="net.sf.devtool.rezeptsammler.rezeptDSL.resource";
 //srcFolder="src/main/java";
 //srcGenFolder="target/generated-sources";
 //uiSrcFolder="src/main/java";
 //uiSrcGenFolder="target/generated-sources";
}


TOKENS {
//	PRIORITIZE TEXT;
//	DEFINE TEXT  $('A'..'Z' | 'a'..'z'|'0'..'9'|'_'|'-')+ $;
//	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
//DEFINE TEXT $ ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+ $;
DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
//DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
DEFINE ID $('\'')('#')$ + TEXT + $('\'') $;
DEFINE DATUM $('\'')('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9')('0'..'9') ('0'..'9')('\'')$;
}



TOKENSTYLES {
	"DATUM" COLOR #00FF00 , BOLD;
	"ID" COLOR #404040 , BOLD;
	"Rezept" COLOR #7F0055, BOLD;
	"Titel:" COLOR #7F0055, BOLD;
	"Untertitel:" COLOR #7F0055, BOLD;
	"Kategorie" COLOR #7F0055, BOLD;
	
	"tipps" COLOR #7F0055, BOLD;
	"bewertung" COLOR #7F0055, BOLD;
	"schritte" COLOR #7F0055, BOLD;
	"produkte" COLOR #7F0055, BOLD;
	"letzteAenderung" COLOR #7F0055, BOLD;
	"zutaten" COLOR #7F0055, BOLD;
	"freiVon" COLOR #7F0055, BOLD;
	"armAn" COLOR #7F0055, BOLD;
	"RezeptSammlung" COLOR #7F0055, BOLD;
	"rezepte" COLOR #7F0055, BOLD;
	"programVersion" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"Modul" COLOR #7F0055, BOLD;
	"Produkt" COLOR #7F0055, BOLD;
	"Verpackung" COLOR #7F0055, BOLD;
	"ean" COLOR #7F0055, BOLD;
	"uba" COLOR #7F0055, BOLD;
	"preis" COLOR #7F0055, BOLD;
	"handler" COLOR #7F0055, BOLD;
	"hersteller" COLOR #7F0055, BOLD;
	"Quelle" COLOR #7F0055, BOLD;
	"Beschreibung" COLOR #7F0055, BOLD;
	"modifikationsArt" COLOR #7F0055, BOLD;
	"Arbeitsschritt" COLOR #7F0055, BOLD;
	"Tipp" COLOR #7F0055, BOLD;
	"text" COLOR #7F0055, BOLD;
	"Rank" COLOR #7F0055, BOLD;
	"ProduktRef" COLOR #7F0055, BOLD;
	"menge" COLOR #7F0055, BOLD;
	"produkt" COLOR #7F0055, BOLD;
	"Datum" COLOR #7F0055, BOLD;
	"datum" COLOR #7F0055, BOLD;
	"Zutat" COLOR #7F0055, BOLD;
	"einheit" COLOR #7F0055, BOLD;
}


RULES {
	RezeptModel ::= metadaten !0 elemente+ ;
	ModulBeschreibung ::= "Modul" name['"','"']  ";";
	ProjektBeschreibung ::=  "RezeptSammlung" "{" 
	             "groupId" "=" groupId['"','"'] ";" "artifactId" "=" artifactId['"','"'] ";"
	             "version" "=" version['"','"'] ";"
	             imports* "}";
	Import ::=  "import"  importedResource['"','"'] "." ;
	Produkt ::= "Produkt" name['"','"']  "{" 
				("Verpackung" ":" verpackung[])?
				("ean" ":" ean['"','"'])? ("uba" ":" uba['"','"'])? ("preis" ":" preis[])? ("handler" ":" handler['"','"'] )?
				("hersteller" ":" hersteller['"','"'])? "letzteAenderung" ":" letzteAenderung[DATUM] "}" ;
	Rezept ::= "Rezept" id['"','"'] "{" "Titel:" titel['"','"'] "." ("Untertitel:" untertitel['"','"'] ".")? 
				( quelle ) ? "letzte �nderung:" letzteAenderung[DATUM] "."
			    kategorien+ tipps* bewertung? produkte* zutaten+ schritte+ armAn* freiVon*
			    "}";
	StandardKategorie ::=  "Kategorie:" bezeichnung['"','"'] "." ; 
	BenutzerKategorie ::=  "Benutzerkategorie:" bezeichnung['"','"'] ".";
	ProduktRef ::= "produkt" ":" produkt[] "menge" ":" menge[] ".";
	Zutat ::= "Zutat" name['"','"'] "menge" ":" menge['"','"']  einheit['"','"'] ".";
	Arbeitsschritt ::= "Aktion" ":" beschreibung['"','"'] ".";
	Tipp ::= "Tipp" "{"  text['"','"'] "}";
	Rank ::= "Rank" "{" bewertung['"','"'] "}";
	Quelle ::= "Quelle:" "�bernommen" ":" modifikationsArt[] "aus" beschreibung['"','"'] "." ;
	Alergene ::= stoff['"','"'];
}