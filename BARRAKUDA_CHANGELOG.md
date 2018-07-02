# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/de/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [Unreleased]
Hier alle Änderungen fortschreiben, solange keine Releases gebaut werden. 
Der neueste Eintrag immer zuerst.
### Added
- YYYY-MM-DD hh:mm: 
- 2018-06-29 16:57: Fix #469 - Der Create-Dialog wird nun auch für nicht-abstrakte "Root"-Klassen generiert. Außerdem werden nun die Locales-Keys für den Dialog auch mit generiert. [!318](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/318)
- 2018-06-29 12:45: Implementierung von Properties in `application.yml` um das Caching für bestimmte Entitäts-Repositories gezielt aktivieren/deaktivieren zu können. [!317](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/317)
- 2018-06-28 14:55: Implementierung einer Methode `_safelyGet` in Polymer-Komponente `<domain>-<entität>-listelement` um Fluchtwert für eine mit `null` belegte Property zu ermöglichen. [!315](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/315)
- 2018-06-26 15:45: Refactor create-dialog für abstrakte Tabellen/Listen - geht wesentlich simpler mit Hyperlinks. [!314](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/314)
- 2018-06-26 15:15: Erweiterung der DSL um Definition einer optionalen `Bidirektionalen`-Relation. [!313](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/313)
- 2018-06-26 09:45: `@AttributeOverride` bei Valueobject-Attribut wird nur noch für Basisdatentypen und nicht für ValueObjects generiert. [!312](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/312)
- 2018-06-26 09:10: Listelement-Body navigiert bei Klick wieder auf definierte Route. [!311](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/311)
- 2018-06-25 14:30: Fix in `OptionsController` to supply only option endpoints for entities [!310](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/310)
- 2018-06-25 14:02: Wiederherstellung `onClick`-Verhalten beim Listelement [!300](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/300)
- 2018-06-25 13:50: Block, der die Persistence Imports definiert, außerhalb der for-Attribute Schleife geschoben, da davon unabhängig. [!309](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/309)
- 2018-06-25 09:35: Übernahme des Barrakuda Changelog als BARRAKUDA_CHANGELOG.md ins generierte Projekt ( Projekte pflegen gegebenfalls einen eigenen Changelog). [!307](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/307)
- 2018-06-25 09:20: Bei toOne Beziehungen werden bei Hinzufügen, wenn bereits ein Element ausgewählt ist, dieses mit dem neuen überschrieben. [!306](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/306)
- 2018-06-25 08:55: Label der Relationskomponenten in Update- und Createform auf den Relationsnamen geändert. [!304](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/304)
- 2018-06-22 15:18: Frontend Filter berücksichtigt nun alle potenziell vorhandenen Attribute (d.h. nun auch die von potenziell vorhandenen Kinderklassen). [!305](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/305)
- 2018-06-22 12:36: Präzisiere JSDoc für _domain und _entity Properties von Nebula.PolyglotBehavior. [!302](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/302)
- 2018-06-21 13:55: Bereitstellung CSS-Breitendefinition für View mit einer einzigen Lese-, Schreib- oder Update-Komponente. [!303](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/303)
- 2018-06-21 18:15: Fix: NPE bei optionalen Attributen im Frontend Filter (View). [!301](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/301)
- 2018-06-21 14:05: In Guimodel definierte MainView wird nun korrekt generiert. [!299](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/299)
- 2018-06-21 12:53: Je nicht abstrakte Entität (kein ValueObject) wird unter `service.services.persistence` ein EventListeners für JPA Events  generiert welcher in die jeweilige Entität als Annotation eingebunden sind. [!298](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/298)
- 2018-06-20 16:58: Frontend versendet nun einen PATCH-Request anstelle von mehreren PUT-Requests pro Entity-Update. [!296](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/296)
- 2018-06-20 16:10: Auslagern der CSS-Config aus `<domain>-<entity>-form.html` in `<domain>-<entity>-form-styles.html` welche nicht übergeneriert wird.  Anpassen der Textfeldlänge an in DSL definierter Maximallänge für "customTextType". [!297](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/297)
- 2018-06-19 16:50: Verwendung von `@JsonIdentityInfo` bei selbstreferenzierten relationalen Attributen um einen Kreisschluß über mehrere Entitäten hinweg zu vermeiden. [!294](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/294)
- 2018-06-19 14:00: JSDoc in GUI-Kommentaren korrigiert und erweitert. [!290](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/290)
- 2018-06-19 13:55: Exkludieren von selbstreferenzierenden relationalen Attributen aus der Lombock-Annotation @EqualsAndHashCode. [!291](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/291)
- 2018-06-19 10:15: Konfiguration der maximalen Formularbreite in Datei shared-styles.html. [!289](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/289)
- 2018-06-18 18:32: Setzt das Level für Package [domain].commons.unicode auf WARN herauf, damit in den Defaults nach dem Generieren der Unicode Filter nichts auf STDOUT loggt. [!288](https://git.muenchen.de/mdsd/barrakuda/merge_requests/288)
- 2018-06-18 13:49: Change data type of relations from List/ArrayList to Set/HashSet [!285](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/285)
- 2018-06-18 10:17: Relation Behavior: Sende `text/uri-list` MediaType an Spring REST Association Endpoints (gem. Spring Doku). [!283](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/283)
- 2018-06-15 14:05: Fix in Methode `createSingleQuery` um Suchstring mit Doppelpunkte zu erlauben (z.B. attribut:12:12:12`). Unit test für Methoden `checkQuery` und `getQueries` und Commons-Klasse `QueryService` um aktuelle Suchsyntax zu testen. [!282](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/282)
- 2018-06-15 09:00: Fix: Leere aktuelle Autocomplete-Auswahl, wenn der aktuelle Suchbegriff keine Ergebnisse liefert. [!281](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/281)
- 2018-06-14 14:42: Zeige Auswahldialog wenn in Tabelle/Liste zu einer abstrakten Entity auf NEU geklickt wird. Bei `Übergenerierung`: siehe [!280](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/280)
- 2018-06-14 12:48: Fix in Methode getQueries in QueryService um QueryStrings nach aktuellem Suchsyntax korrekt und stabil zu interpretieren. ([!279](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/279))
- 2018-06-13 10:06: Auslagern der redundanten Methoden im `<entity>_SearchController` in Klasse `QueryUtil` in commons-Lib ([!277](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/277)) 
- 2018-06-12 15:33: Zusätzliche Labels für jedes Attribut, sodass Tabellenüberschrift und Bezeichnung in Forms unabhängig vom exakten Namen setzbar sind. ([!270](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/270))
- 2018-06-12 15:28: Fix on method TestprojectRelationBehavior._saveRelationData to allow saving the entity with an attribute of emtpy toOne relation ([!276](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/276))
- 2018-06-12 14:38: Change error handling in method `TestprojectRelationBehavior.loadRelationData` in case of http response 404, due to 404 response on empty *ToOne relation ([!275](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/275))
- 2018-06-12 13:04: RessourceService - Avoidance of adding the same link to related entity several times ([!274](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/274))
- 2018-06-12 10:57: Avoiding NullPointerException in method NfcRequest.nfc due to possible null value at method Cookie.getDomain
- 2018-06-11 16:50: Fix of versions in bower.json by removing the version ranges ([!273](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/273))
- 2018-06-11 10:00: Relationsobjekte für GUI-Anzeige nicht mehr im data-Objekt, sondern in einem lokalen Feld im Simple-Relation-Tag; Alle Pfade in Backend umgestellt von `toLowerCase` auf `toFirstLower` ([!267](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/267)) 
- 2018-06-11 09:50: OptionController now contains all Relations; Fixed Problem with Relations to Entites that had camel-case Names; Fixed Search for Derived Classes (f.e. im searching an AbstractEntity with an indexed field out of a Derived class)  ([!264](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/264)) 
- 2018-06-08 14:17: Workaround CORS-Config ([!272](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/272)) 

## [2.0.3-SNAPSHOT] - 2018-06-08
### Added
- Barrakuda-Version ins Generat

## [2.0.2-SNAPSHOT] - 2018-06-08
### Added
- Fieldset Styling von ValueObjects angepasst - bei Übergenerierung siehe [Doku](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/269#custom-anpassung-bei-%C3%9Cbergenerierung)

## [2.0.1-SNAPSHOT] - 2018-06-07
### Added
- Einfuehrung CHANGELOG ([!265](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda/merge_requests/265))
