# X.Justiz Core

> [!TIP]  
> **🌐 [English version available here](README.md) 👈**

X.Justiz Core ist ein leichtgewichtiges Schema für den Datenaustausch zwischen Softwarelösungen im rechtlichen Ökosystem. Er basiert auf dem etablierten X.Justiz-Standard und optimiert diesen für die außergerichtliche Kommunikation und moderne LegalTech-Szenarien.

## Inhaltsverzeichnis
- [Hintergrund](#hintergrund)
- [Motivation](#motivation)
- [Ziele & Vorteile](#ziele--vorteile)
- [X.Justiz Kompatibilität](#xjustiz-kompatibilität)
- [Herausragende Merkmale & Verbesserungen](#herausragende-merkmale--verbesserungen)
- [Nutzung von Codes](#nutzung-von-codes)
- [Implementierung (SDKs)](#implementierung-sdk)
- [Spezifikation](#spezifikation)
- [Beispieldaten](#beispieldaten)
- [Entwickler-Ressourcen](#entwickler-ressourcen)

> [!NOTE]  
> **📘 Suchen Sie nach technischen Details?**  
> Springen Sie direkt zur **[Spezifikation für X.Justiz Core](/docs/Specification_DE.md)** für Datenmodell-Dokumentation, Code-Beispiele und Best Practices.

## Hintergrund
Die „Arbeitsgruppe Schnittstellen" des [**LegalTech Verband Deutschland**]( https://www.legaltechverband.de/ ) entwickelte 2024 diesen Standard, um den Austausch von Rechtsangelegenheiten (Akten) effizienter zu gestalten.

Als Basis dient der offizielle [**X.Justiz-Standard**]( https://xjustiz.justiz.de/ ), da dieser der etablierte Maßstab im elektronischen Rechtsverkehr (ERV) ist und von der Bund-Länder-Kommission (BLK-AG IT-Standards) gepflegt wird.

> [!IMPORTANT]  
> Wir freuen uns auf Ihre Beteiligung! Ob Fragen, Anregungen, Fehlermeldungen oder Mitwirkung am Standard – wir laden alle Nutzer ein, sich aktiv einzubringen. Besuchen Sie unsere Diskussionen:
> 👉 **[GitHub Discussions](https://github.com/l-pagel/X.Justiz.Core/discussions)**

## Motivation
Der klassische X.Justiz-Standard ist funktionsreich, jedoch für den schnellen Austausch zwischen privaten Marktteilnehmern oft zu komplex. X.Justiz Core adressiert folgende Punkte:

*   **Reduzierte Komplexität:** Beschränkung auf eine praxisrelevante Teilmenge, um „Noise" im Datenaustausch zu vermeiden.
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

Mit entsprechenden Kompatibilitätseinbußen können X.Justiz Core-Daten auch mit älteren Versionen (bis 2.1.0) kompatibel verwendet werden.

## Herausragende Merkmale & Verbesserungen
X.Justiz Core fungiert als moderne Brücke zwischen dem offiziellen Standard und den Bedürfnissen privater Marktteilnehmer:

*   **Etablierte Basis:** Basiert auf dem offiziellen **X.Justiz-Standard**, der für deutsche Legal Tech- und Justiz-Kommunikation obligatorisch ist.
*   **Optimierte Dokumentation:** Entwicklerzentrierte Dokumentation in Deutsch und Englisch, was die Einarbeitungszeit für internationale Teams verkürzt.
*   **Gebrauchsfertige SDKs:** Vollständige Klassenbibliotheken und Codelisten-Mappings für .NET und Java, was das manuelle XML/JSON-Parsing überflüssig macht.
*   **Erweiterte Codelisten:** Einbeziehung eigener Codelisten für Bereiche, die nicht durch den Standard abgedeckt sind (z. B. **Versicherer**, **Versicherungstyp**).
*   **Unabhängiger Dokumenttransfer:** Konzept für die unabhängige Übertragung von Dokumenten und Anhängen von der Hauptnachricht (z. B. über Pre-Signed URLs).
*   **Detaillierter Sachverhalt:** Zusätzliche Eigenschaften zur Beschreibung des Sachverhalts, zugeschnitten auf die Anforderungen im Legal Tech.
*   **Flexibles Datenkonzept:** Erweiterte Möglichkeiten zur Übertragung generischer oder fachspezifischer Daten durch ein verbessertes `Feld` / `Feldgruppe` Konzept.

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

Um Entwicklern die Arbeit zu erleichtern, haben wir alle relevanten Kataloge direkt in unsere SDKs integriert. Heute sind es 3.397 Codes in 26 verschiedenen Versionlisten aus 8 Haupt-Codetypen (Staat, Rolle, Gericht, Dokumentklasse, etc.).

### X.Justiz Core Erweiterungen
Zusätzlich zu den standardmäßigen X.Justiz-Katalogen haben wir **eigene Codelisten** erstellt, um moderne LegalTech-Szenarien zu unterstützen, in denen der Standard keine spezifischen Schlüssel bietet. Dies umfasst:
- **[Versicherer](/docs/codes/versicherer/)**: Eine umfassende Liste von Versicherern (BaFin-basiert).
- **[Versicherungstyp](/docs/codes/versicherungstyp/)**: Definitionen für verschiedene Arten des Versicherungsschutzes.

Diese Listen sind als stark typisierte Enums vollständig in die SDKs integriert. Eine vollständige Liste der verfügbaren Codes und deren Verwendung finden Sie in der **[Datenmodell-Referenz in der Spezifikation](/docs/Specification_DE.md#4-datenmodell-referenz)**.

Wir haben besonderen Wert auf die Entwicklereffizienz gelegt: Die SDKs enthalten umfassende Klassenbibliotheken für diese Codes, die mit **deutschen und englischen Übersetzungen** direkt im Quellcode optimiert wurden. Dies macht die Entwicklung extrem schnell, da moderne IDEs die Dokumentation und Bedeutung in beiden Sprachen über IntelliSense anzeigen.

## Implementierung (SDKs)
Um die Einbindung zu beschleunigen, stellt das Projekt Softwarebibliotheken bereit.  
Sie beinhalten:
- [Klassenbibliothek](/sdk/dotnet/src/xjustiz.core-dotnet/Models/)
- [Utility-Tools](/sdk/dotnet/src/xjustiz.core-dotnet/Util)
- [Code Listen (X.Justiz & X.Justiz Core)](/sdk/dotnet/src/xjustiz.core-dotnet/Models/Codes)

Die SDKs sind in folgenden Sprachen verfügbar:
-   ✅ [**.NET Code**](/sdk/dotnet) | [**nuget Paket**](https://www.nuget.org/packages/xjustiz.core-dotnet) | [**Erste Schritte**](/sdk/dotnet/README_DE.md)
-   ✅ [**Java**](/sdk/java) | [**Maven Paket**](https://central.sonatype.com/artifact/de.xjustizcore.io/xjustiz-core) | [**Erste Schritte**](/sdk/java/README_DE.md)
-   ⏳ **JavaScript / TypeScript** (In Arbeit)
-   ⏳ **Python** (In Arbeit)

## Spezifikation

### X.Justiz Core
- [Spezifikation für X.Justiz Core](/docs/Specification_DE.md) - Umfassende Datenmodell-Dokumentation
- [Validierungsregeln als XSD](/schemas)
- [Listen verwendeter Codes](/sdk/dotnet/src/xjustiz.core-dotnet/Models/Codes)
- [Änderungshistorie](/docs/Changelog_DE.md)
- [Lizenz](LICENSE)

### X.Justiz
- [Archiv aller X.Justiz Versionen und Spezifikationen](/xjustiz-xsd)

## Beispieldaten

Testdaten und Szenarien stehen zur Verfügung, um Ihre Implementierung zu testen:  
[**Beispieldaten**](/sdk/test-data)

Enthält Beispiele für:
- Arbeitsrecht
- Erbrecht
- Verkehrsrecht
- Mietrecht
- Und mehr...

## Entwickler-Ressourcen
- [**🔧 SDK-Generierungs-Workflow**](/docs/SDK-GENERATION_DE.md) - Wie die SDK-Konsistenz gewährleistet wird
- [**🧪 Integrationstests**](/sdk/dotnet/test/xjustiz.core-dotnet.IntegrationTests/README_DE.md) - Plattformübergreifende Kompatibilitätstests

## Qualitätssicherung
Das Projekt wird regelmäßig auf Qualität überprüft. Den aktuellen Status finden Sie auf SonarCloud:  
[![Quality Gate][badge-url]][link-url]

[badge-url]: https://sonarcloud.io/api/project_badges/quality_gate?project=l-pagel_X.Justiz.Core&token=63adaa7af33ae168a0611157ea45aaa0db36852f
[link-url]: https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core
