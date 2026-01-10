# X.Justiz-Core Data Model Specification

This document provides a comprehensive overview of the X.Justiz-Core data model, detailing its classes, properties, and relationships. It highlights the extensions introduced by X.Justiz-Core and indicates the original X.Justiz release versions for inherited elements.

| Class | Property | Type | X.Justiz Core Extension | Release Version (X.Justiz) | Release Version (Core) |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Akte** | | | No | 2.2.1 | 0.2.0 |
| | Identifikation | **Identifikation** | No | 2.2.1 | 0.2.0 |
| | AnwendungsspezifischeErweiterung | **AnwendungsspezifischeErweiterung** | No | 3.1.1 | 0.2.0 |
| | FachspezifischeDaten | **XjustizAkteFachspezifischeDaten** | No | 3.1.1 | 0.2.0 |
| **AkteCore** | | | Yes | - | 0.2.0 |
| | Identifikation | **Identifikation** | No | 2.2.1 | 0.2.0 |
| | AnwendungsspezifischeErweiterung | **AnwendungsspezifischeErweiterung** | No | 3.1.1 | 0.2.0 |
| | FachspezifischeDaten | **XjustizAkteFachspezifischeDatenCore** | Yes | - | 0.2.0 |
| **Aktentyp** | | | No | 2.1.0 | 0.2.0 |
| | Code | AktentypCode | No | 2.1.0 | 0.2.0 |
| **Aktenzeichen** | | | No | 2.1.0 | 0.2.0 |
| | Auswahl | **AuswahlAktenzeichen** | No | 3.1.1 | 0.2.0 |
| **Anschrift** | | | No | 2.1.0 | 0.2.0 |
| | Strasse | string | No | 2.1.0 | 0.2.0 |
| | Hausnummer | string | No | 2.1.0 | 0.2.0 |
| | Postleitzahl | string | No | 2.1.0 | 0.2.0 |
| | Ort | string | No | 2.1.0 | 0.2.0 |
| | Staat | **Staat** | No | 2.1.0 | 0.2.0 |
| **AnwendungsspezifischeErweiterung** | | | No | 2.1.0 | 0.2.0 |
| | Kennung | string | No | 2.1.0 | 0.2.0 |
| | Name | string | No | 2.1.0 | 0.2.0 |
| | Beschreibung | string | No | 2.1.0 | 0.2.0 |
| | Feldgruppen | List<**Feldgruppe**> | No | 2.1.0 | 0.2.0 |
| | Felder | List<**Feld**> | No | 2.1.0 | 0.2.0 |
| **Artifact** | | | Yes | - | 0.2.0 |
| **AuswahlAdresse** | | | No | 2.1.0 | 0.2.0 |
| | AbsenderSonstige | string | No | 2.1.0 | 0.2.0 |
| | EmpfaengerSonstige | string | No | 2.1.0 | 0.2.0 |
| | EmpfaengerGericht | string | No | 2.1.0 | 0.2.0 |
| | EmpfaengerRvTraeger | string | No | 2.1.0 | 0.2.0 |
| | EmpfaengerPolizei | string | No | 2.1.0 | 0.2.0 |
| **AuswahlAktenzeichen** | | | No | 2.1.0 | 0.2.0 |
| | Freitext | string | No | 2.1.0 | 0.2.0 |
| **AuswahlBeteiligter** | | | No | 2.1.0 | 0.2.0 |
| | NP | **NatuerlichePerson** | No | 2.1.0 | 0.2.0 |
| | Org | **Organisation** | No | 2.1.0 | 0.2.0 |
| **AuswahlInstanzbehoerde** | | | No | 3.1.1 | 0.2.0 |
| | Gericht | **Gericht** | No | 3.1.1 | 0.2.0 |
| **Bankverbindung** | | | No | 2.1.0 | 0.2.0 |
| | Kontoinhaber | string | No | 2.1.0 | 0.2.0 |
| | Iban | string | No | 2.1.0 | 0.2.0 |
| | Bic | string | No | 2.1.0 | 0.2.0 |
| **Bestandteiltyp** | | | No | 2.2.1 | 0.2.0 |
| | Code | BestandteiltypCode | No | 2.2.1 | 0.2.0 |
| **Beteiligter** | | | No | 2.1.0 | 0.2.0 |
| | Auswahl | **AuswahlBeteiligter** | No | 3.1.1 | 0.2.0 |
| **Beteiligung** | | | No | 2.1.0 | 0.2.0 |
| | Rolle | **Rolle** | No | 2.1.0 | 0.2.0 |
| | Beteiligter | **Beteiligter** | No | 2.1.0 | 0.2.0 |
| **Bezeichnung** | | | No | 2.1.0 | 0.2.0 |
| | Aktuell | string | No | 2.1.0 | 0.2.0 |
| **BundlePathArtifact** | | | Yes | - | 0.2.0 |
| | Pfad | string | Yes | - | 0.2.0 |
| **Datei** | | | No | 2.1.0 | 0.2.0 |
| | Dateiname | string | No | 2.1.0 | 0.2.0 |
| | Bestandteil | **Bestandteiltyp** | No | 2.1.0 | 0.2.0 |
| **DateiCore** | | | Yes | - | 0.2.0 |
| | Dateiname | string | No | 2.1.0 | 0.2.0 |
| | Bestandteil | **Bestandteiltyp** | No | 2.1.0 | 0.2.0 |
| | Dateiendung | string | Yes | - | 0.2.0 |
| | ContentType | string | Yes | - | 0.2.0 |
| | Groesse | long | Yes | - | 0.2.0 |
| | Hash | **HashInfo** | Yes | - | 0.2.0 |
| | Artefakte | List<**Artifact**> | Yes | - | 0.2.0 |
| **Dokument** | | | No | 2.1.0 | 0.2.0 |
| | Identifikation | **Identifikation** | No | 2.1.0 | 0.2.0 |
| | FachspezifischeDaten | **XjustizFachspezifischeDaten** | No | 3.1.1 | 0.2.0 |
| | Erstellungszeitpunkt | DateTime | No | 3.4.1 | 0.2.0 |
| **DokumentCore** | | | Yes | - | 0.2.0 |
| | Identifikation | **Identifikation** | No | 2.1.0 | 0.2.0 |
| | FachspezifischeDaten | **XjustizFachspezifischeDatenCore** | Yes | - | 0.2.0 |
| | Erstellungszeitpunkt | DateTime | No | 3.4.1 | 0.2.0 |
| **Dokumentklasse** | | | No | 2.1.0 | 0.2.0 |
| | Code | DokumentklasseCode | No | 2.1.0 | 0.2.0 |
| **Feld** | | | No | 2.1.0 | 0.2.0 |
| | Name | string | No | 2.1.0 | 0.2.0 |
| | Beschreibung | string | No | 2.1.0 | 0.2.0 |
| | Datentyp | string | No | 2.1.0 | 0.2.0 |
| | Wert | string | No | 2.1.0 | 0.2.0 |
| **Feldgruppe** | | | No | 2.1.0 | 0.2.0 |
| | Name | string | No | 2.1.0 | 0.2.0 |
| | Beschreibung | string | No | 2.1.0 | 0.2.0 |
| | UnterFeldgruppen | List<**Feldgruppe**> | No | 2.1.0 | 0.2.0 |
| | Felder | List<**Feld**> | No | 2.1.0 | 0.2.0 |
| **Gericht** | | | No | 2.1.0 | 0.2.0 |
| | Code | GerichtCode | No | 2.1.0 | 0.2.0 |
| **Geschlecht** | | | No | 2.1.0 | 0.2.0 |
| | Code | GeschlechtCode | No | 2.1.0 | 0.2.0 |
| **Grunddaten** | | | No | 2.1.0 | 0.2.0 |
| | Verfahrensdaten | **Verfahrensdaten** | No | 2.1.0 | 0.2.0 |
| **HashInfo** | | | Yes | - | 0.2.0 |
| | Algorithm | string | Yes | - | 0.2.0 |
| | Value | string | Yes | - | 0.2.0 |
| **HttpHeader** | | | Yes | - | 0.2.0 |
| | Key | string | Yes | - | 0.2.0 |
| | Value | string | Yes | - | 0.2.0 |
| **HttpsArtifact** | | | Yes | - | 0.2.0 |
| | Url | string | Yes | - | 0.2.0 |
| | ExpiresAtUtc | DateTime | Yes | - | 0.2.0 |
| | Header | List<**HttpHeader**> | Yes | - | 0.2.0 |
| **Identifikation** | | | No | 2.1.0 | 0.2.0 |
| | Id | string | No | 2.1.0 | 0.2.0 |
| | NummerImUebergeordnetenContainer | int | No | 2.1.0 | 0.2.0 |
| **Instanzdaten** | | | No | 3.1.1 | 0.2.0 |
| | Instanznummer | string | No | 3.1.1 | 0.2.0 |
| | Sachgebietszusatz | string | No | 3.1.1 | 0.2.0 |
| | AuswahlInstanzbehoerde | **AuswahlInstanzbehoerde** | No | 3.1.1 | 0.2.0 |
| **Nachrichtenkopf** | | | No | 2.1.0 | 0.2.0 |
| | Version | string | No | 2.1.0 | 0.2.0 |
| | AktenzeichenAbsender | string[] | No | 2.1.0 | 0.2.0 |
| | AktenzeichenEmpfaenger | string[] | No | 2.1.0 | 0.2.0 |
| | Erstellungszeitpunkt | DateTime | No | 2.1.0 | 0.2.0 |
| | Absender | **AuswahlAdresse** | No | 3.1.1 | 0.2.0 |
| | Empfaenger | **AuswahlAdresse** | No | 3.1.1 | 0.2.0 |
| | EigeneNachrichtenId | string | No | 3.1.1 | 0.2.0 |
| **NachrichtenkopfCore** | | | Yes | - | 0.2.0 |
| | Version | string | No | 2.1.0 | 0.2.0 |
| | Version_XJustizCore | string | Yes | - | 0.2.0 |
| | Version_XJustizReferenz | string | Yes | - | 0.2.0 |
| | AktenzeichenAbsender | string[] | No | 2.1.0 | 0.2.0 |
| | AktenzeichenEmpfaenger | string[] | No | 2.1.0 | 0.2.0 |
| | Erstellungszeitpunkt | DateTime | No | 2.1.0 | 0.2.0 |
| | Absender | **AuswahlAdresse** | No | 3.1.1 | 0.2.0 |
| | Empfaenger | **AuswahlAdresse** | No | 3.1.1 | 0.2.0 |
| | EigeneNachrichtenId | string | No | 3.1.1 | 0.2.0 |
| **NatuerlichePerson** | | | No | 2.1.0 | 0.2.0 |
| | VollerName | **VollerName** | No | 2.1.0 | 0.2.0 |
| | Geschlecht | **Geschlecht** | No | 2.1.0 | 0.2.0 |
| | Anschrift | **Anschrift** | No | 2.1.0 | 0.2.0 |
| | Telekommunikation | List<**Telekommunikation**> | No | 2.1.0 | 0.2.0 |
| | Bankverbindung | **Bankverbindung** | No | 2.1.0 | 0.2.0 |
| **NatuerlichePersonCore** | | | Yes | - | 0.2.0 |
| | VollerName | **VollerName** | No | 2.1.0 | 0.2.0 |
| | Geschlecht | **Geschlecht** | No | 2.1.0 | 0.2.0 |
| | Anschrift | **Anschrift** | No | 2.1.0 | 0.2.0 |
| | Telekommunikation | List<**Telekommunikation**> | No | 2.1.0 | 0.2.0 |
| | Bankverbindung | **Bankverbindung** | No | 2.1.0 | 0.2.0 |
| | AnwendungsspezifischeErweiterung | **AnwendungsspezifischeErweiterung** | No | 3.1.1 | 0.2.0 |
| **Organisation** | | | No | 2.1.0 | 0.2.0 |
| | Bezeichnung | **Bezeichnung** | No | 2.1.0 | 0.2.0 |
| | Anschrift | **Anschrift** | No | 2.1.0 | 0.2.0 |
| | Telekommunikation | List<**Telekommunikation**> | No | 2.1.0 | 0.2.0 |
| | Bankverbindung | **Bankverbindung** | No | 2.1.0 | 0.2.0 |
| **OrganisationCore** | | | Yes | - | 0.2.0 |
| | Bezeichnung | **Bezeichnung** | No | 2.1.0 | 0.2.0 |
| | Anschrift | **Anschrift** | No | 2.1.0 | 0.2.0 |
| | Telekommunikation | List<**Telekommunikation**> | No | 2.1.0 | 0.2.0 |
| | Bankverbindung | **Bankverbindung** | No | 2.1.0 | 0.2.0 |
| | AnwendungsspezifischeErweiterung | **AnwendungsspezifischeErweiterung** | No | 3.1.1 | 0.2.0 |
| **Rolle** | | | No | 2.4.0 | 0.2.0 |
| | Code | RollenCode | No | 2.4.0 | 0.2.0 |
| | ListVersionId | string | No | 2.4.0 | 0.2.0 |
| | ListUri | string | No | 2.4.0 | 0.2.0 |
| **Rollenbezeichnung** | | | No | 2.1.0 | 0.2.0 |
| | Code | RollenCode | No | 2.1.0 | 0.2.0 |
| | ListVersionId | string | No | 2.1.0 | 0.2.0 |
| | ListUri | string | No | 2.1.0 | 0.2.0 |
| **Schriftgutobjekte** | | | No | 3.1.1 | 0.2.0 |
| | Akte | List<**Akte**> | No | 3.1.1 | 0.2.0 |
| | Dokumente | List<**Dokument**> | No | 3.1.1 | 0.2.0 |
| **Staat** | | | No | 3.1.1 | 0.2.0 |
| | Code | StaatCode | No | 3.1.1 | 0.2.0 |
| **Telekommunikation** | | | No | 2.1.0 | 0.2.0 |
| | Telekommunikationsart | **Telekommunikationsart** | No | 2.1.0 | 0.2.0 |
| | Verbindung | string | No | 2.1.0 | 0.2.0 |
| **Telekommunikationsart** | | | No | 2.1.0 | 0.2.0 |
| | Code | string | No | 2.1.0 | 0.2.0 |
| **UebermittlungSchriftgutobjekteNachricht** | | | No | 3.1.1 | 0.2.0 |
| | Kopf | **NachrichtenkopfCore** | No | 3.1.1 | 0.2.0 |
| | Grunddaten | **Grunddaten** | No | 3.1.1 | 0.2.0 |
| | Schriftgutobjekte | **Schriftgutobjekte** | No | 3.1.1 | 0.2.0 |
| | SchemaLocation | string | No | 3.1.1 | 0.2.0 |
| **Verfahrensdaten** | | | No | 2.1.0 | 0.2.0 |
| | Verfahrensnummer | string | No | 2.1.0 | 0.2.0 |
| | Instanzdaten | **Instanzdaten** | No | 2.1.0 | 0.2.0 |
| | Beteiligungen | List<**Beteiligung**> | No | 2.1.0 | 0.2.0 |
| **Versicherung** | | | Yes | - | 0.2.0 |
| | Versicherungsnummer | string | Yes | - | 0.2.0 |
| | Versicherungsunternehmen | List<**Organisation**> | Yes | - | 0.2.0 |
| | Anschrift | **Anschrift** | Yes | - | 0.2.0 |
| | ReferenzId | Guid | Yes | - | 0.2.0 |
| | Versicherter | **AuswahlBeteiligter** | Yes | - | 0.2.0 |
| | Schadensnummer | string | Yes | - | 0.2.0 |
| | Versicherungstyp | **VersicherungsTyp** | Yes | - | 0.2.0 |
| | RechtsschutzTyp | **RechtschutzVersicherungsTyp** | Yes | - | 0.2.0 |
| | Fahrzeug | **Fahrzeug** | Yes | - | 0.2.0 |
| | Selbstbeteiligung | **Selbstbeteiligung** | Yes | - | 0.2.0 |
| | AnwendungsspezifischeErweiterung | **AnwendungsspezifischeErweiterung** | Yes | - | 0.2.0 |
| **VollerName** | | | No | 2.1.0 | 0.2.0 |
| | Vorname | string | No | 2.1.0 | 0.2.0 |
| | Rufname | string | No | 2.1.0 | 0.2.0 |
| | Titel | string | No | 2.1.0 | 0.2.0 |
| | Namensvorsatz | string | No | 2.1.0 | 0.2.0 |
| | Nachname | string | No | 2.1.0 | 0.2.0 |
| **XjustizAkteFachspezifischeDaten** | | | No | 3.1.1 | 0.2.0 |
| | Aktentyp | **Aktentyp** | No | 3.1.1 | 0.2.0 |
| | Anzeigename | string | No | 3.1.1 | 0.2.0 |
| | Aktenzeichen | **Aktenzeichen** | No | 3.1.1 | 0.2.0 |
| **XjustizAkteFachspezifischeDatenCore** | | | Yes | - | 0.2.0 |
| | Aktentyp | **Aktentyp** | No | 3.1.1 | 0.2.0 |
| | Anzeigename | string | No | 3.1.1 | 0.2.0 |
| | Aktenzeichen | **Aktenzeichen** | No | 3.1.1 | 0.2.0 |
| | Ziel | string | Yes | - | 0.2.0 |
| | Nachricht | string | Yes | - | 0.2.0 |
| | Sendungsmitteilung | string | Yes | - | 0.2.0 |
| | Notizen | string | Yes | - | 0.2.0 |
| | Anliegen | string | Yes | - | 0.2.0 |
| | Sachverhalt | string | Yes | - | 0.2.0 |
| | Notarpraeferenz | string | Yes | - | 0.2.0 |
| | Terminpraeferenz | string | Yes | - | 0.2.0 |
| **XjustizFachspezifischeDaten** | | | No | 3.1.1 | 0.2.0 |
| | Dokumentklasse | **Dokumentklasse** | No | 3.1.1 | 0.2.0 |
| | Datei | **Datei** | No | 3.1.1 | 0.2.0 |
| **XjustizFachspezifischeDatenCore** | | | Yes | - | 0.2.0 |
| | Dokumentklasse | **Dokumentklasse** | No | 3.1.1 | 0.2.0 |
| | Datei | **DateiCore** | Yes | - | 0.2.0 |
| **AktentypCode** | | | No | 2.1.0 | 0.2.0 |
| **BestandteiltypCode** | | | No | 2.2.1 | 0.2.0 |
| **DokumentklasseCode** | | | No | 2.1.0 | 0.2.0 |
| **GerichtCode** | | | No | 2.1.0 | 0.2.0 |
| **GeschlechtCode** | | | No | 2.1.0 | 0.2.0 |
| **RollenCode** | | | No | 2.1.0 | 0.2.0 |
| **StaatCode** | | | No | 3.1.1 | 0.2.0 |
