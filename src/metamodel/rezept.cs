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
DEFINE DATUM $('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9')('0'..'9') ('0'..'9')$;
}



TOKENSTYLES {
	"DATUM" COLOR #00FF00 , BOLD;
	"ID" COLOR #404040 , BOLD;
	"Rezept" COLOR #7F0055, BOLD;
	"Titel:" COLOR #7F0055, BOLD;
	"Untertitel:" COLOR #7F0055, BOLD;
	"Kategorie:" COLOR #7F0055, BOLD;
	"Tag:" COLOR #7F0055, BOLD;
	"Di�t:" COLOR #7F0055, BOLD;
	"Stoff:" COLOR #7F0055, BOLD;
	"ProduktRef:" COLOR #7F0055, BOLD;
	"Produkt" COLOR #7F0055, BOLD;
	"RezeptSammlung" COLOR #7F0055, BOLD;
	"groupId","artifactId","version" COLOR #7F0055, BOLD;
	"Letzte �nderung:" COLOR #7F0055, BOLD;
	"Modul" COLOR #7F0055, BOLD;
	"Verpackung:" COLOR #7F0055, BOLD;
	"EAN:" COLOR #7F0055, BOLD;
	"UBA:" COLOR #7F0055, BOLD;
	"Preis:" COLOR #7F0055, BOLD;
	"H�ndler:" COLOR #7F0055, BOLD;
	"Hersteller:" COLOR #7F0055, BOLD;
	"Quelle:" COLOR #7F0055, BOLD;
	"Aktion:" COLOR #7F0055, BOLD;
	"Tipp:" COLOR #7F0055, BOLD;
	"Rank:" COLOR #7F0055, BOLD;
	"Menge:", "mal."COLOR #7F0055, BOLD;
	"Zutat:" COLOR #7F0055, BOLD;
}


RULES {
	RezeptModel ::= metadaten ;
	ModulBeschreibung ::= "Modul" name['"','"']   ";" imports* elemente+;
	ProjektBeschreibung ::=  "RezeptSammlung" "{" 
	             "groupId" "=" groupId['"','"'] ";" "artifactId" "=" artifactId['"','"'] ";"
	             "version" "=" version['"','"'] ";"
	             imports* "}";
	Import ::=  "import"  importedResource['"','"'] ";" ;
	Produkt ::= "Produkt" name['"','"']  "{" 
				("Verpackung:" verpackung['"','"'] ".")?
				menge
				("EAN:" ean['"','"'] ".")? ("UBA:" uba['"','"'] ".")? 
				preis? 
				("H�ndler:" handler['"','"'] ".")?
				("Hersteller:" hersteller['"','"'] ".")? "Letzte �nderung:" datumLetzteAenderung[DATUM] "." "}" ;
	Preis ::= "Preis:" betrag['"','"'] waehrung['"','"'] ".";
	Rezept ::= "Rezept" id['"','"'] "{" 
				"Titel:" titel['"','"'] "." ("Untertitel:" untertitel['"','"'] ".")? "Kategorie:" kategorie['"','"'] "."
				"Letzte �nderung:" letzteAenderung[DATUM] "." tags+
				produkte* zutaten+ schritte+
				quelle? bewertung? tipps*    
			    "}";
	StoffTag ::=  "Stoff:" stoff['"','"'] "." ; 
	BenutzerTag ::=  "Tag:" bezeichnung['"','"'] ".";
	DiaetTag ::= "Di�t:" diaet['"','"'] "." ;
	ProduktRef ::= "ProduktRef:" produkt['"','"'] "Menge:" menge['"','"'] "mal.";
	Zutat ::= "Zutat:" name['"','"'] menge    ;
	Menge ::= "Menge:" betrag['"','"'] einheit['"','"'] ".";
	Arbeitsschritt ::= "Aktion:" beschreibung['"','"'];
	Tipp ::= "Tipp:"  text['"','"'] ;
	Rank ::= "Rank:" bewertung['"','"'] ;
	Quelle ::= "Quelle:" "�bernommen" ":" modifikationsArt['"','"'] "aus" beschreibung['"','"'] "." ;
}