# X.Justiz Core [TL;DR]

> [!TIP]  
> ** :us: [English version available here](README.md) 👈**

X.Justiz Core ist ein leichtgewichtiges Schema für den Datenaustausch zwischen Softwarelösungen im rechtlichen Ökosystem. Er basiert auf dem etablierten X.Justiz-Standard und optimiert diesen für die außergerichtliche Kommunikation und moderne LegalTech-Szenarien.

## Inhaltsverzeichnis
- [Hintergrund](#hintergrund)
- [Motivation](#motivation)
- [Ziele & Vorteile](#ziele--vorteile)
- [Implementierung (SDKs)](#implementierung-sdk)
- [Spezifikation & Dokumentation](#spezifikation--dokumentation)

## Hintergrund
Die „Arbeitsgruppe Schnittstellen“ des [**LegalTech Verband Deutschland**]( https://www.legaltechverband.de/ ) entwickelte 2024 diesen Standard, um den Austausch von Rechtsangelegenheiten (Akten) effizienter zu gestalten.

Als Basis dient der offizielle [**X.Justiz-Standard**]( https://xjustiz.justiz.de/ ), da dieser der etablierte Maßstab im elektronischen Rechtsverkehr (ERV) ist und von der Bund-Länder-Kommission (BLK-AG IT-Standards) gepflegt wird.

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

## Implementierung (SDKs)
Um die Einbindung zu beschleunigen, stellt das Projekt Softwarebibliotheken bereit:

-   ✅ [**.NET Code**](/dotnet) | [**nuget Paket**](https://www.nuget.org/packages/xjustiz.core-dotnet)
-   ⏳ **Java (Spring)** (In Arbeit)
-   ⏳ **JavaScript / TypeScript** (In Arbeit)
-   ⏳ **Python** (In Arbeit)

## Spezifikation & Dokumentation

- [X.Justiz Core Spezifikation](Specification.md)
- [X.Justiz Core Versionen als XSD](/X.Justiz-Core-Versions)
- [Beipieldatensätze](/example-datasets)
- [Archiv aller X.Justiz Versionen](/X.Justiz-Versions)
- [Änderungshistorie (DE)](/Changelog_DE.md), [Änderungshistorie (EN)](/Changelog.md)
- [Lizenz](LICENSE)

Das Projekt wird regelmäßig auf Qualität überprüft. Den aktuellen Status finden Sie auf SonarCloud:

[![Quality Gate][badge-url]][link-url]

[badge-url]: https://sonarcloud.io/api/project_badges/quality_gate?project=l-pagel_X.Justiz.Core&token=63adaa7af33ae168a0611157ea45aaa0db36852f
[link-url]: https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core
