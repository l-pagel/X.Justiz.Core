# X.Justiz Core 0.2.0-beta

> [!TIP]  
> **🌐 [English version available here](README.md) 👈**

X.Justiz Core ist ein leichtgewichtiges Schema für den Datenaustausch zwischen Softwarelösungen im rechtlichen Ökosystem. Er basiert auf dem etablierten X.Justiz-Standard und optimiert diesen für die außergerichtliche Kommunikation und moderne LegalTech-Szenarien.

## Inhaltsverzeichnis
- [Hintergrund](#hintergrund)
- [Motivation](#motivation)
- [Ziele & Vorteile](#ziele--vorteile)
- [X.Justiz Kompatibilität](#xjustiz-kompatibilität)
- [Nutzung von Codes](#nutzung-von-codes)
- [Implementierung (SDKs)](#implementierung-sdk)
- [Spezifikation & Dokumentation](#spezifikation--dokumentation)

## Hintergrund
Die „Arbeitsgruppe Schnittstellen“ des [**LegalTech Verband Deutschland**]( https://www.legaltechverband.de/ ) entwickelte 2024 diesen Standard, um den Austausch von Rechtsangelegenheiten (Akten) effizienter zu gestalten.

Als Basis dient der offizielle [**X.Justiz-Standard**]( https://xjustiz.justiz.de/ ), da dieser der etablierte Maßstab im elektronischen Rechtsverkehr (ERV) ist und von der Bund-Länder-Kommission (BLK-AG IT-Standards) gepflegt wird.

> [!IMPORTANT]  
> Wir freuen uns auf Ihre Beteiligung! Ob Fragen, Anregungen, Fehlermeldungen oder Mitwirkung am Standard – wir laden alle Nutzer ein, sich aktiv einzubringen. Besuchen Sie unsere Diskussionen:
> 👉 **[GitHub Discussions](https://github.com/l-pagel/X.Justiz.Core/discussions)**

## Motivation
Der klassische X.Justiz-Standard ist funktionsreich, jedoch für den schnellen Austausch zwischen privaten Marktteilnehmern oft zu komplex. X.Justiz Core adressiert folgende Punkte:

*   **Reduzierte Komplexität:** Beschränkung auf eine praxisrelevante Teilmenge, um „Noise“ im Datenaustausch zu vermeiden.
*   **Moderne Technik:** Unterstützung von Dokumentenübertragungen via Pre-Signed URLs und Format-Agnostik (optimiert für JSON und XML).
*   **Zugänglichkeit:** Zweisprachige Dokumentation (Deutsch/Englisch) für internationale Entwicklerteams.
*   **Erweiterung:** Einführung neuer Schlüssel für Rechtsangelegenheiten (z.B. Erbrecht, Verkehrsrecht, Mietrecht).
*   **Flexibilität:** Flexible Übermittlung von Sachverhalten, für die bisher keine spezifischen Schlüssel in X.Justiz existieren.

## Ziele & Vorteile
Das Ziel von X.Justiz Core ist eine effiziente Interoperabilität:
*   **Effizienz:** Reduzierung des Aufwandes für individuelle Schnittstellen zwischen Software-Anbietern.
*   **Innovation:** Schnelle Anbindung von Marktplätzen und spezialisierten LegalTech-Produkten.
*   **Praxisnähe:** Spezifische Erweiterungen für gängige Rechtsgebiete wie Erbrecht, Verkehrsrecht oder Mietrecht.
*   **Open Source:** Kostenfreie Bereitstellung zur Förderung eines vernetzten Ökosystems.

![X.Justiz Core](./.media/README/xjustizcore-venn_DE.drawio.svg)

## X.Justiz Kompatibilität
X.Justiz Core ist vollständig kompatibel mit **X.Justiz 3.2.1 bis X.Justiz 3.6.2**.  
Mit entsprechenden Kompatibilitätseinbußen können X.Justiz Core-Daten auch mit älteren Versionen (bis 2.1.0) kompatibel verwendet werden.

## Nutzung von Codes
In X.Justiz Core werden Fachdaten (wie Staaten, Rollen oder Gerichte) über standardisierte **Codes /Schlüssel** identifiziert. Dies gewährleistet eine maschinenlesbare Eindeutigkeit über Systemgrenzen hinweg.

### Herkunft und Verwaltung
Die meisten Codelisten werden zentral vom [**XRepository**](https://www.xrepository.de/) bereitgestellt. Jede Liste ist über eine eindeutige URI und eine spezifische `versionlistid` identifizierbar. Dies ermöglicht es, Änderungen an den Katalogen (z.B. neue Staaten oder geänderte Rollenbezeichnungen) präzise zu tracken. Bspw.:

| Entität | Versionlistid | Quelle |
| ----- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Staat | 2024-08-01 | [XRepository](https://www.xrepository.de/api/xrepository/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat_2024-08-01:technischerBestandteilGenericode) |
| Staat | 2023-02-24 | [XRepository](https://www.xrepository.de/api/xrepository/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat_2023-02-24:technischerBestandteilGenericode) |
| ...   | ...        | ...        |

### Anwendung im Datenaustausch
In einigen Code Listen gibt es Mehrfachdefinitionen für die einzelnen Codes. In der Code-Liste "Staat" gibt es bspw. den Eintrag für "Deutschland" mit folgenden Werten:

| Merkmal | Wert |
| --- | --- |
| **Schlüssel (Staat)** | 000 |
| **Suchbegriff** | Deutschland |
| **Kurzname** | Deutschland |
| **Vollständiger Name** | die Bundesrepublik Deutschland |
| **Staatsangehörigkeit** | deutsch |
| **ISO-Alpha-3** | DEU |
| **ISO-Alpha-2** | DE |

Obwohl primär der technische Code (z.B. `000` für Deutschland) verwendet werden sollte, ist laut X.Justiz auch die Verwendung der Alternativrepräsentationen (z.B. `Deutschland`, `DE`, `DEU`, usw.) erlaubt. X.Justiz Core unterstützt auch das Empfangen / Lesen der entsprechenden Alternativrepräsentationen und können diese intelligent mappen, um eine maximale Flexibilität bei der Implementierung zu gewährleisten.

Wir legen dennoch nahe, primär die Codes (z.B. `000` für Deutschland) zu verwenden. Die SDKs verwenden beim Senden / Schreiben der Daten automatisch die technische Codes.

### Umfang im Projekt
Um Entwicklern die Arbeit zu erleichtern, haben wir alle relevanten Kataloge direkt in unsere SDKs integriert. Heute sind es 3.397 Codes in 26 verschiedenen Versionlisten aus 8 Haupt-Codetypen (Staat, Rolle, Gericht, Dokumentklasse, etc.).

Besonderen Wert haben wir auf die Dokumentation gelegt: Alle Codes wurden von uns aufwendig **zweisprachig (Deutsch und Englisch)** mit Beschreibungen und Zusammenfassungen versehen, um auch internationalen Entwicklungsteams den Einstieg in das deutsche Rechtswesen zu erleichtern.

## Implementierung (SDKs)
Um die Einbindung zu beschleunigen, stellt das Projekt Softwarebibliotheken bereit.  
Sie beinhalten:
- [Klassenbibliothek](/dotnet/src/xjustiz.core-dotnet/Models/)
- [Utility-Tools](/dotnet/src/xjustiz.core-dotnet/Util)
- [Code Listen (X.Justiz & X.Justiz Core)](/dotnet/src/xjustiz.core-dotnet/Models/Codes)

Die SDKs sind in folgenden Sprachen verfügbar:
-   ✅ [**.NET Code**](/dotnet) | [**nuget Paket**](https://www.nuget.org/packages/xjustiz.core-dotnet) | [**Erste Schritte**](/dotnet/README_DE.md)
-   ⏳ **Java (Spring)** (In Arbeit)
-   ⏳ **JavaScript / TypeScript** (In Arbeit)
-   ⏳ **Python** (In Arbeit)

## Spezifikation & Dokumentation

### X.Justiz Core
- [Spezifikation](Specification.md)
- [Validierungsregeln als XSD](/X.Justiz-Core-Versions)
- [Beipieldatensätze](/example-datasets)
- [Listen verwendeter Codes](/dotnet/src/xjustiz.core-dotnet/Models/Codes)
- [Änderungshistorie (DE)](/Changelog_DE.md), [Änderungshistorie (EN)](/Changelog.md)
- [Lizenz](LICENSE)

### X.Justiz
- [Archiv aller X.Justiz Versionen und Spezifikationen](/X.Justiz-Versions)

## Qualitätssicherung
Das Projekt wird regelmäßig auf Qualität überprüft. Den aktuellen Status finden Sie auf SonarCloud:  
[![Quality Gate][badge-url]][link-url]

[badge-url]: https://sonarcloud.io/api/project_badges/quality_gate?project=l-pagel_X.Justiz.Core&token=63adaa7af33ae168a0611157ea45aaa0db36852f
[link-url]: https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core
