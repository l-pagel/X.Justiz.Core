# X.Justiz Core Java Beispiel-API

> [!TIP]  
> **🌐 [English version available here](README.md) 👈**

Dieses Projekt demonstriert die Verwendung der X.Justiz Core Java-Bibliothek in einer Spring Boot-Anwendung und spiegelt die Funktionalität der .NET Beispiel-API wider.

## Endpunkte

Die API bietet Endpunkte um:
- Kompatibilität von X.Justiz-Nachrichten zu prüfen (JSON/XML).
- Beispieldateien zu generieren (JSON/XML).
- Nachrichten zwischen Versionen zu konvertieren.

Zugriff auf die OpenAPI-Oberfläche unter: `http://localhost:8080/swagger-ui.html`

## Einschränkungen

Der zugrundeliegenden Java-Bibliothek fehlen derzeit die Versionierungs-Metadaten (`@XJustizAvailability`-Annotationen), die in der .NET-Bibliothek existieren.
Daher sind der `CompatibilityChecker` und `XJustizConverter` in diesem Projekt derzeit **Stubs (Platzhalter)** und führen keine tatsächliche Validierungs- oder Konvertierungslogik aus. Sie leiten die Daten unverändert weiter oder geben „All Compatible“ zurück.

## Ausführen des Projekts

Führen Sie die Anwendung mit Gradle aus dem `java`-Stammverzeichnis aus:

```bash
./gradlew :example-api:bootRun
```
