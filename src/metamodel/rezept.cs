SYNTAXDEF rezept
FOR <http://www.github.com/funthomas424242/language/rezept>
START  ProjektBeschreibung, Rezeptliste, Produktliste 
 
//TODO extract product definitions IMPORTS{
//erDSL :  <http://www.emftext.org/language/erDSL> <../../../org.emftext.language.erDSL/metamodel/erDSL.ecore> 
//WITH SYNTAX erDSL  <../../../org.emftext.language.erDSL/metamodel/erDSL.cs>
//}

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
DEFINE NUMBER  $('0'..'9')+$;
}



TOKENSTYLES {
	"DATUM" COLOR #00FF00 , BOLD;
	"ID" COLOR #404040 , BOLD;
	"NUMBER" COLOR #00FF00, BOLD;
	"Rezept" COLOR #7F0055, BOLD;
	"Titel:", "Untertitel:", "Media Folder:" COLOR #7F0055, BOLD;
	"Kategorie:", "Ausreichend für","Personen." COLOR #7F0055, BOLD;
	"Tag:" COLOR #7F0055, BOLD;
	"Diät:" COLOR #7F0055, BOLD;
	"Stoff:" COLOR #7F0055, BOLD;
	"ProduktRef:" COLOR #7F0055, BOLD;
	"Produkt" COLOR #7F0055, BOLD;
	"RezeptSammlung" COLOR #7F0055, BOLD;
	"groupId","artifactId","version" COLOR #7F0055, BOLD;
	"Letzte Änderung:" COLOR #7F0055, BOLD;
	"Rezeptliste", "Produktliste" COLOR #7F0055, BOLD;
	"Verpackung:" COLOR #7F0055, BOLD;
	"EAN:" COLOR #7F0055, BOLD;
	"UBA:" COLOR #7F0055, BOLD;
	"Preis:" COLOR #7F0055, BOLD;
	"Händler:" COLOR #7F0055, BOLD;
	"Hersteller:" COLOR #7F0055, BOLD;
	"Quelle:", "übernommen", "aus"  COLOR #7F0055, BOLD;
	"Aktion:" COLOR #7F0055, BOLD;
	"Tipp:", "Anmerkung:", "Kommentar:" COLOR #7F0055, BOLD;
	"Zutat:", "Menge:", "mal." COLOR #7F0055, BOLD;
}


RULES {
	ProjektBeschreibung ::=  "RezeptSammlung" "{" 
	             "groupId" "=" groupId['"','"'] ";" "artifactId" "=" artifactId['"','"'] ";"
	             "version" "=" version['"','"'] ";"
	             imports* "}" buch;
	BuchBeschreibung ::= "Buch" "{" "Titel:" titel['"','"'] "Media Folder:" resourcesDir['"','"']"}";
	RezeptImport ::=  "import"  importedResource['"','"'] ";" ;
	Rezeptliste ::= "Rezeptliste" name['"','"']   ";" imports* rezepte+ ;	
	ProduktImport ::=  "import"  importedResource['"','"'] ";" ;
	Produktliste ::= "Produktliste" name['"','"']   ";"  produkte+ ;	             
	Produkt ::= "Produkt" name['"','"']  "{" 
				("Verpackung:" verpackung['"','"'] ".")?
				menge
				("EAN:" ean['"','"'] ".")? ("UBA:" uba['"','"'] ".")? 
				preis? 
				("Händler:" handler['"','"'] ".")?
				("Hersteller:" hersteller['"','"'] ".")? "Letzte Änderung:" datumLetzteAenderung[DATUM] "." "}" ;
	Preis ::= "Preis:" betrag['"','"'] waehrung['"','"'] ".";
	Rezept ::= "Rezept" id['"','"'] "{" 
				"Titel:" titel['"','"'] "." ("Untertitel:" untertitel['"','"'] ".")? "Kategorie:" kategorie['"','"'] "."
				quelle? ("Ausreichend für" personen[NUMBER] "Personen.")?
				"Letzte Änderung:" letzteAenderung[DATUM] "." tags+
				produkte* zutaten+ schritte+ notizen*				    
			    "}";
	StoffTag ::=  "Stoff:" stoff['"','"'] "." ; 
	BenutzerTag ::=  "Tag:" bezeichnung['"','"'] ".";
	DiaetTag ::= "Diät:" diaet['"','"'] "." ;
	ProduktRef ::= "ProduktRef:" produkt['"','"'] "Menge:" menge['"','"'] "mal.";
	Zutat ::= "Zutat:" name['"','"'] menge    ;
	BestimmteMenge ::= "Menge:" betrag['"','"'] einheit['"','"'] ".";
	UnbestimmteMenge ::= menge['"','"'] ".";
	Arbeitsschritt ::= "Aktion:" beschreibung['"','"'];
	Tipp ::= "Tipp:"  text['"','"'] ;
	Kommentar ::= "Kommentar:" text['"','"'] ;
	Anmerkung ::= "Anmerkung:" text['"','"'] ;
	Quelle ::= "Quelle:" "übernommen" modifikationsArt['"','"'] "aus" beschreibung['"','"'] "." ;
}