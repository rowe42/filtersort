# Testproject App

Dieses Projekt enthält das mittels [Barrakuda](https://gitp001.srv.ha3.dir.muenchen.de/mdsd/barrakuda) generierte Frontend `thefrontend` für Testproject auf Basis des [Polymer Starter Kits](https://github.com/Polymer/polymer-starter-kit).

### Setup

##### Vorbereitung

Das Projekt setzt einen JavaScript-Entwicklerarbeitsplatz voraus. Die Anleitung für dessen Setup ist [im JavaScriptEntwickler Wiki](http://wikifarmp001.srv.muenchen.de/JavaScriptEntwickler/index.php/Setup_Entwicklerarbeitsplatz) dokumentiert.

Anschließend die [Polymer CLI](https://github.com/Polymer/polymer-cli) via [npm](https://www.npmjs.com) installieren:

    npm install -g polymer-cli

Zum Abschluss noch [Bower](https://bower.io/), ebenfalls via [npm](https://www.npmjs.com) installieren:

    npm install -g bower

### Entwicklungsserver starten

Dieses Kommando hostet die App auf `http://localhost:8081`:

    polymer serve

### Build

Das `polymer build` Kommand baut die Polymer App für die Produktion. Die Build-Einstellungen können in der `polymer.json` konfiguriert werden.

Details zum Build siehe die ["building your project for production"](https://www.polymer-project.org/2.0/toolbox/build-for-production) der offiziellen Polymer Dokumentation.

### Tests ausführen

Dieses Kommando startet den [Web Component Tester](https://github.com/Polymer/web-component-tester) gegen die aktuelle auf der Maschine installierten Browser.

    polymer test

Damit die Tests starten, muss aktuell ein Internet-Proxy am System konfiguriert sein.

Für Firefox empfiehlt es sich, den Symlink `/usr/bin/firefox` auf einen aktuellen Firefox (z.B. 59 aufwärts) umzubiegen.

