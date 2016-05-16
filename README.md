![logo](https://raw.github.com/FunThomas424242/rezept-dsl/master/Features/rezept.feature/rezeptdsl-100x100.png "Rezept DSL")rezept-dsl
===========

[![Build Status](https://travis-ci.org/FunThomas424242/rezept-dsl.svg?branch=master)](https://travis-ci.org/FunThomas424242/rezept-dsl)

Das Projekt realisiert ein  eclipse feature *Rezept DSL Feature* welches folgende Plugins bereitstellt:

* rezept Model = Definition der fachspezifischen Sprache (DSL) rezept.
* Acceleo Rezept 2 Maven Projekt = Generator der Rezeptbeschreibungen in Maven Projekte überführt
* EMFText Parser Plugin: rezept = Rezept DSL Parser
* EMFText UI Plugin: rezept = Rezept DSL Editor

Das Feature konnte eine zeitlang von bintray installiert werden. Da es aber mit emftext und der Build Automatisierung durch maven ständig zu Problemen kam wurde das Projekt eingestellt.
Zur Fortsetzung mit einer anderen Technologie (Xtext/Xtend) wurde ein neues Projekt in Leben gerufen: [rezept-dsl.xtext](https://github.com/FunThomas424242/rezept-dsl.xtext).

Installationsvorraussetzungen
-----------------------------
Es müssen bereits installiert sein:

* Eclipse Marketplace Client
* EMF - Eclipse Modeling Framework Core Runtime(Yoxos Marketplace)
* EMFText SDK (Yoxos Marketplace)
* EMFText Shared ANTLR 3.4.0 Runtime (Update Site: http://www.emftext.org/update_trunk)
* Acceleo SDK (Yoxos Marketplace) (http://download.eclipse.org/modeling/m2t/acceleo/updates/releases/3.4) 

Plugin aus Quellen bauen
------------------------
9. mvn clean im Projektwurzelverzeichnis ausführen
9. Alle Projekte in Eclipse importieren und Refresh ausführen
9. In Eclipse im Projekt com.github.funthomas424242.rezeptsammler.rezept "Generate All Text Resources" auf rezept.cs ausführen (rechte Maus Kontextmenü)
9. mvn install im Projektwurzelverzeichnis ausführen
Die Update Site für den Import befindet sich unter: <projectroot>/Deploying/rezept.site/target/rezept.site-x.x.x-SNAPSHOT.zip

Nützliche Quellen
-----------------

* http://tonnymadsen.blogspot.de/2013/05/tycho-and-pre-p2-update-sites.html
* https://wiki.eclipse.org/Tycho/Additional_Tools
* https://gist.github.com/hwellmann/6044835
* https://www.eclipse.org/forums/index.php/t/1073522/
* https://jaxenter.de/migration-auf-eclipse-4-einmal-angefangen-gibt-es-kein-zuruck-2132
* https://dirksmetric.wordpress.com/2012/08/01/tutorial-eclipse-rcp-e4-with-3-x-views-like-project-explorer-properties-etc/
* http://modelmoo.blogspot.de/2013/04/eclipse-modeling-framework-ui-e4.html
* http://www.vogella.com/tutorials/Eclipse4ExtendModel/article.html

