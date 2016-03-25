![logo](https://raw.github.com/FunThomas424242/rezept-dsl/master/Features/rezept.feature/rezeptdsl-100x100.png "Rezept DSL")rezept-dsl
===========

Version 1.0.2
-------------

* Generator: Versions Upgrade der Github Maven Tools auf 0.12
* Feature: Lizenz Text und URL hinzugefügt
* Ecore: Neue Kategorie Frühstück
* Ecore: ecorediag konvertiert in aird Diagram (Sirius Editor)
* Ecore: Umlaute in Literalen korrigiert
* Maven: Buildprozess automatisiert für Generierung aus ecore Modell



Version 1.0.1
-------------

* Die Kardinalität der Rezeptimports wird von * auf + geändert. Somit muss mindestens ein Rezept in ein Buch
importiert werden. Das macht Sinn, da Rezepte nicht mehr direkt in den Büchern beschrieben werden können. 
* upgrade to acceleo 3.4
* upgrade to eclipse kepler 3.4 sr1
* fixed issue 3 maven plugin versions upgrade
* Umlaute werden aktuell wieder unterstützt


Version 1.0.0
-------------

* Erste vollständig nutzbare Version der Sprache *rezept*
* Bereistellung eines Editors mit dem Rezepte in der Sprache *rezept* erstellt und editiert werden können.
* Beritstellung eines Generators welcher aus den Rezeptbeschreibungen einzelne Docbook Projekte erzeugt.
Aus diesen Projekten können über Maven, Bücher in verschiedenen Formaten generiert werden. 
* Die Bücher werden gemäß den Voreinstellungen in den Formaten pdf und webhelp erzeugt. Durch entfernen der 
Kommentierung können weitere Formate erzeugt werden.

