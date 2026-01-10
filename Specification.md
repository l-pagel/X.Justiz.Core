# X.Justiz-Core Data Model Specification

Dieses Dokument bietet einen umfassenden Überblick über das X.Justiz-Core-Datenmodell, einschließlich seiner Klassen, Eigenschaften und Versionierung.

### Verwendung der Tabelle
Die folgende Tabelle beschreibt die Hierarchie und Entwicklung des Datenmodells:
- **Class**: Die fettgedruckte Container-Klasse für eine Gruppe von Eigenschaften.
- **Property / Type**: Der Name des Feldes und der zugehörige Datentyp. Komplexe Typen (verknüpfte Klassen) sind **fett** gedruckt.
- **Core Only**: Markiert mit einem `x`, wenn diese spezifische Klasse oder Eigenschaft eine Erweiterung ist, die exklusiv durch X.Justiz-Core eingeführt wurde.
- **Release X.Justiz**: Die ursprüngliche X.Justiz-Version, in der dieses Element erstmals eingeführt wurde (markiert mit `-` bei Core-only Erweiterungen).
- **Release Core**: Die X.Justiz-Core-Version, ab der dieses Element verfügbar ist.

---

This document provides a comprehensive overview of the X.Justiz-Core data model, detailing its classes, properties, and versioning.

### Using the Table
The table below describes the hierarchy and evolution of the data model:
- **Class**: The bolded container class for a group of properties.
- **Property / Type**: The name of the field and its associated data type. Complex types (linked classes) are **bolded**.
- **Core Only**: Marked with an `x` if this specific class or property is a unique extension introduced by X.Justiz-Core.
- **Release X.Justiz**: The original X.Justiz version where this element was first introduced (marked as `-` for Core-only extensions).
- **Release Core**: The X.Justiz-Core version in which this element became available.  
  
&nbsp;
  
| Class | Property / Type | Core Only | Release X.Justiz | Release Core |
| :--- | :--- | :---: | :--- | :--- |
| **Akte** | | | 2.2.1 | 0.2.0 |
| | Property: Identifikation <br/> Type: **Identifikation** | | 2.2.1 | 0.2.0 |
| | Property: AnwendungsspezifischeErweiterung <br/> Type: **AnwendungsspezifischeErweiterung** | | 3.1.1 | 0.2.0 |
| | Property: FachspezifischeDaten <br/> Type: **XjustizAkteFachspezifischeDaten** | | 3.1.1 | 0.2.0 |
| **AkteCore** | | x | - | 0.2.0 |
| | Property: Identifikation <br/> Type: **Identifikation** | | 2.2.1 | 0.2.0 |
| | Property: AnwendungsspezifischeErweiterung <br/> Type: **AnwendungsspezifischeErweiterung** | | 3.1.1 | 0.2.0 |
| | Property: FachspezifischeDaten <br/> Type: **XjustizAkteFachspezifischeDatenCore** | x | - | 0.2.0 |
| **Aktentyp** | | | 2.1.0 | 0.2.0 |
| | Property: Code <br/> Type: AktentypCode | | 2.1.0 | 0.2.0 |
| **Aktenzeichen** | | | 2.1.0 | 0.2.0 |
| | Property: Auswahl <br/> Type: **AuswahlAktenzeichen** | | 3.1.1 | 0.2.0 |
| **Anschrift** | | | 2.1.0 | 0.2.0 |
| | Property: Strasse <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Hausnummer <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Postleitzahl <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Ort <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Staat <br/> Type: **Staat** | | 2.1.0 | 0.2.0 |
| **AnwendungsspezifischeErweiterung** | | | 2.1.0 | 0.2.0 |
| | Property: Kennung <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Name <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Beschreibung <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Feldgruppen <br/> Type: List<**Feldgruppe**> | | 2.1.0 | 0.2.0 |
| | Property: Felder <br/> Type: List<**Feld**> | | 2.1.0 | 0.2.0 |
| **Artifact** | | x | - | 0.2.0 |
| **AuswahlAdresse** | | | 2.1.0 | 0.2.0 |
| | Property: AbsenderSonstige <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: EmpfaengerSonstige <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: EmpfaengerGericht <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: EmpfaengerRvTraeger <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: EmpfaengerPolizei <br/> Type: string | | 2.1.0 | 0.2.0 |
| **AuswahlAktenzeichen** | | | 2.1.0 | 0.2.0 |
| | Property: Freitext <br/> Type: string | | 2.1.0 | 0.2.0 |
| **AuswahlBeteiligter** | | | 2.1.0 | 0.2.0 |
| | Property: NP <br/> Type: **NatuerlichePerson** | | 2.1.0 | 0.2.0 |
| | Property: Org <br/> Type: **Organisation** | | 2.1.0 | 0.2.0 |
| **AuswahlInstanzbehoerde** | | | 3.1.1 | 0.2.0 |
| | Property: Gericht <br/> Type: **Gericht** | | 3.1.1 | 0.2.0 |
| **Bankverbindung** | | | 2.1.0 | 0.2.0 |
| | Property: Kontoinhaber <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Iban <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Bic <br/> Type: string | | 2.1.0 | 0.2.0 |
| **Bestandteiltyp** | | | 2.2.1 | 0.2.0 |
| | Property: Code <br/> Type: BestandteiltypCode | | 2.2.1 | 0.2.0 |
| **Beteiligter** | | | 2.1.0 | 0.2.0 |
| | Property: Auswahl <br/> Type: **AuswahlBeteiligter** | | 3.1.1 | 0.2.0 |
| **Beteiligung** | | | 2.1.0 | 0.2.0 |
| | Property: Rolle <br/> Type: **Rolle** | | 2.1.0 | 0.2.0 |
| | Property: Beteiligter <br/> Type: **Beteiligter** | | 2.1.0 | 0.2.0 |
| **Bezeichnung** | | | 2.1.0 | 0.2.0 |
| | Property: Aktuell <br/> Type: string | | 2.1.0 | 0.2.0 |
| **BundlePathArtifact** | | x | - | 0.2.0 |
| | Property: Pfad <br/> Type: string | x | - | 0.2.0 |
| **Datei** | | | 2.1.0 | 0.2.0 |
| | Property: Dateiname <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Bestandteil <br/> Type: **Bestandteiltyp** | | 2.1.0 | 0.2.0 |
| **DateiCore** | | x | - | 0.2.0 |
| | Property: Dateiname <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Bestandteil <br/> Type: **Bestandteiltyp** | | 2.1.0 | 0.2.0 |
| | Property: Dateiendung <br/> Type: string | x | - | 0.2.0 |
| | Property: ContentType <br/> Type: string | x | - | 0.2.0 |
| | Property: Groesse <br/> Type: long | x | - | 0.2.0 |
| | Property: Hash <br/> Type: **HashInfo** | x | - | 0.2.0 |
| | Property: Artefakte <br/> Type: List<**Artifact**> | x | - | 0.2.0 |
| **Dokument** | | | 2.1.0 | 0.2.0 |
| | Property: Identifikation <br/> Type: **Identifikation** | | 2.1.0 | 0.2.0 |
| | Property: FachspezifischeDaten <br/> Type: **XjustizFachspezifischeDaten** | | 3.1.1 | 0.2.0 |
| | Property: Erstellungszeitpunkt <br/> Type: DateTime | | 3.4.1 | 0.2.0 |
| **DokumentCore** | | x | - | 0.2.0 |
| | Property: Identifikation <br/> Type: **Identifikation** | | 2.1.0 | 0.2.0 |
| | Property: FachspezifischeDaten <br/> Type: **XjustizFachspezifischeDatenCore** | x | - | 0.2.0 |
| | Property: Erstellungszeitpunkt <br/> Type: DateTime | | 3.4.1 | 0.2.0 |
| **Dokumentklasse** | | | 2.1.0 | 0.2.0 |
| | Property: Code <br/> Type: DokumentklasseCode | | 2.1.0 | 0.2.0 |
| **Feld** | | | 2.1.0 | 0.2.0 |
| | Property: Name <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Beschreibung <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Datentyp <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Wert <br/> Type: string | | 2.1.0 | 0.2.0 |
| **Feldgruppe** | | | 2.1.0 | 0.2.0 |
| | Property: Name <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Beschreibung <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: UnterFeldgruppen <br/> Type: List<**Feldgruppe**> | | 2.1.0 | 0.2.0 |
| | Property: Felder <br/> Type: List<**Feld**> | | 2.1.0 | 0.2.0 |
| **Gericht** | | | 2.1.0 | 0.2.0 |
| | Property: Code <br/> Type: GerichtCode | | 2.1.0 | 0.2.0 |
| **Geschlecht** | | | 2.1.0 | 0.2.0 |
| | Property: Code <br/> Type: GeschlechtCode | | 2.1.0 | 0.2.0 |
| **Grunddaten** | | | 2.1.0 | 0.2.0 |
| | Property: Verfahrensdaten <br/> Type: **Verfahrensdaten** | | 2.1.0 | 0.2.0 |
| **HashInfo** | | x | - | 0.2.0 |
| | Property: Algorithm <br/> Type: string | x | - | 0.2.0 |
| | Property: Value <br/> Type: string | x | - | 0.2.0 |
| **HttpHeader** | | x | - | 0.2.0 |
| | Property: Key <br/> Type: string | x | - | 0.2.0 |
| | Property: Value <br/> Type: string | x | - | 0.2.0 |
| **HttpsArtifact** | | x | - | 0.2.0 |
| | Property: Url <br/> Type: string | x | - | 0.2.0 |
| | Property: ExpiresAtUtc <br/> Type: DateTime | x | - | 0.2.0 |
| | Property: Header <br/> Type: List<**HttpHeader**> | x | - | 0.2.0 |
| **Identifikation** | | | 2.1.0 | 0.2.0 |
| | Property: Id <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: NummerImUebergeordnetenContainer <br/> Type: int | | 2.1.0 | 0.2.0 |
| **Instanzdaten** | | | 3.1.1 | 0.2.0 |
| | Property: Instanznummer <br/> Type: string | | 3.1.1 | 0.2.0 |
| | Property: Sachgebietszusatz <br/> Type: string | | 3.1.1 | 0.2.0 |
| | Property: AuswahlInstanzbehoerde <br/> Type: **AuswahlInstanzbehoerde** | | 3.1.1 | 0.2.0 |
| **Nachrichtenkopf** | | | 2.1.0 | 0.2.0 |
| | Property: Version <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: AktenzeichenAbsender <br/> Type: string[] | | 2.1.0 | 0.2.0 |
| | Property: AktenzeichenEmpfaenger <br/> Type: string[] | | 2.1.0 | 0.2.0 |
| | Property: Erstellungszeitpunkt <br/> Type: DateTime | | 2.1.0 | 0.2.0 |
| | Property: Absender <br/> Type: **AuswahlAdresse** | | 3.1.1 | 0.2.0 |
| | Property: Empfaenger <br/> Type: **AuswahlAdresse** | | 3.1.1 | 0.2.0 |
| | Property: EigeneNachrichtenId <br/> Type: string | | 3.1.1 | 0.2.0 |
| **NachrichtenkopfCore** | | x | - | 0.2.0 |
| | Property: Version <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Version_XJustizCore <br/> Type: string | x | - | 0.2.0 |
| | Property: Version_XJustizReferenz <br/> Type: string | x | - | 0.2.0 |
| | Property: AktenzeichenAbsender <br/> Type: string[] | | 2.1.0 | 0.2.0 |
| | Property: AktenzeichenEmpfaenger <br/> Type: string[] | | 2.1.0 | 0.2.0 |
| | Property: Erstellungszeitpunkt <br/> Type: DateTime | | 2.1.0 | 0.2.0 |
| | Property: Absender <br/> Type: **AuswahlAdresse** | | 3.1.1 | 0.2.0 |
| | Property: Empfaenger <br/> Type: **AuswahlAdresse** | | 3.1.1 | 0.2.0 |
| | Property: EigeneNachrichtenId <br/> Type: string | | 3.1.1 | 0.2.0 |
| **NatuerlichePerson** | | | 2.1.0 | 0.2.0 |
| | Property: VollerName <br/> Type: **VollerName** | | 2.1.0 | 0.2.0 |
| | Property: Geschlecht <br/> Type: **Geschlecht** | | 2.1.0 | 0.2.0 |
| | Property: Anschrift <br/> Type: **Anschrift** | | 2.1.0 | 0.2.0 |
| | Property: Telekommunikation <br/> Type: List<**Telekommunikation**> | | 2.1.0 | 0.2.0 |
| | Property: Bankverbindung <br/> Type: **Bankverbindung** | | 2.1.0 | 0.2.0 |
| **NatuerlichePersonCore** | | x | - | 0.2.0 |
| | Property: VollerName <br/> Type: **VollerName** | | 2.1.0 | 0.2.0 |
| | Property: Geschlecht <br/> Type: **Geschlecht** | | 2.1.0 | 0.2.0 |
| | Property: Anschrift <br/> Type: **Anschrift** | | 2.1.0 | 0.2.0 |
| | Property: Telekommunikation <br/> Type: List<**Telekommunikation**> | | 2.1.0 | 0.2.0 |
| | Property: Bankverbindung <br/> Type: **Bankverbindung** | | 2.1.0 | 0.2.0 |
| | Property: AnwendungsspezifischeErweiterung <br/> Type: **AnwendungsspezifischeErweiterung** | | 3.1.1 | 0.2.0 |
| **Organisation** | | | 2.1.0 | 0.2.0 |
| | Property: Bezeichnung <br/> Type: **Bezeichnung** | | 2.1.0 | 0.2.0 |
| | Property: Anschrift <br/> Type: **Anschrift** | | 2.1.0 | 0.2.0 |
| | Property: Telekommunikation <br/> Type: List<**Telekommunikation**> | | 2.1.0 | 0.2.0 |
| | Property: Bankverbindung <br/> Type: **Bankverbindung** | | 2.1.0 | 0.2.0 |
| **OrganisationCore** | | x | - | 0.2.0 |
| | Property: Bezeichnung <br/> Type: **Bezeichnung** | | 2.1.0 | 0.2.0 |
| | Property: Anschrift <br/> Type: **Anschrift** | | 2.1.0 | 0.2.0 |
| | Property: Telekommunikation <br/> Type: List<**Telekommunikation**> | | 2.1.0 | 0.2.0 |
| | Property: Bankverbindung <br/> Type: **Bankverbindung** | | 2.1.0 | 0.2.0 |
| | Property: AnwendungsspezifischeErweiterung <br/> Type: **AnwendungsspezifischeErweiterung** | | 3.1.1 | 0.2.0 |
| **Rolle** | | | 2.4.0 | 0.2.0 |
| | Property: Code <br/> Type: RollenCode | | 2.4.0 | 0.2.0 |
| | Property: ListVersionId <br/> Type: string | | 2.4.0 | 0.2.0 |
| | Property: ListUri <br/> Type: string | | 2.4.0 | 0.2.0 |
| **Rollenbezeichnung** | | | 2.1.0 | 0.2.0 |
| | Property: Code <br/> Type: RollenCode | | 2.1.0 | 0.2.0 |
| | Property: ListVersionId <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: ListUri <br/> Type: string | | 2.1.0 | 0.2.0 |
| **Schriftgutobjekte** | | | 3.1.1 | 0.2.0 |
| | Property: Akte <br/> Type: List<**Akte**> | | 3.1.1 | 0.2.0 |
| | Property: Dokumente <br/> Type: List<**Dokument**> | | 3.1.1 | 0.2.0 |
| **Staat** | | | 3.1.1 | 0.2.0 |
| | Property: Code <br/> Type: StaatCode | | 3.1.1 | 0.2.0 |
| **Telekommunikation** | | | 2.1.0 | 0.2.0 |
| | Property: Telekommunikationsart <br/> Type: **Telekommunikationsart** | | 2.1.0 | 0.2.0 |
| | Property: Verbindung <br/> Type: string | | 2.1.0 | 0.2.0 |
| **Telekommunikationsart** | | | 2.1.0 | 0.2.0 |
| | Property: Code <br/> Type: TelekommunikationsartCode | | 2.1.0 | 0.2.0 |
| **UebermittlungSchriftgutobjekteNachricht** | | | 3.1.1 | 0.2.0 |
| | Property: Kopf <br/> Type: **NachrichtenkopfCore** | | 3.1.1 | 0.2.0 |
| | Property: Grunddaten <br/> Type: **Grunddaten** | | 3.1.1 | 0.2.0 |
| | Property: Schriftgutobjekte <br/> Type: **Schriftgutobjekte** | | 3.1.1 | 0.2.0 |
| | Property: SchemaLocation <br/> Type: string | | 3.1.1 | 0.2.0 |
| **Verfahrensdaten** | | | 2.1.0 | 0.2.0 |
| | Property: Verfahrensnummer <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Instanzdaten <br/> Type: **Instanzdaten** | | 2.1.0 | 0.2.0 |
| | Property: Beteiligungen <br/> Type: List<**Beteiligung**> | | 2.1.0 | 0.2.0 |
| **Versicherung** | | x | - | 0.2.0 |
| | Property: Versicherungsnummer <br/> Type: string | x | - | 0.2.0 |
| | Property: Versicherungsunternehmen <br/> Type: List<**Organisation**> | x | - | 0.2.0 |
| | Property: Anschrift <br/> Type: **Anschrift** | x | - | 0.2.0 |
| | Property: ReferenzId <br/> Type: Guid | x | - | 0.2.0 |
| | Property: Versicherter <br/> Type: **AuswahlBeteiligter** | x | - | 0.2.0 |
| | Property: Schadensnummer <br/> Type: string | x | - | 0.2.0 |
| | Property: Versicherungstyp <br/> Type: **VersicherungsTyp** | x | - | 0.2.0 |
| | Property: RechtsschutzTyp <br/> Type: **RechtschutzVersicherungsTyp** | x | - | 0.2.0 |
| | Property: Fahrzeug <br/> Type: **Fahrzeug** | x | - | 0.2.0 |
| | Property: Selbstbeteiligung <br/> Type: **Selbstbeteiligung** | x | - | 0.2.0 |
| | Property: AnwendungsspezifischeErweiterung <br/> Type: **AnwendungsspezifischeErweiterung** | x | - | 0.2.0 |
| **VollerName** | | | 2.1.0 | 0.2.0 |
| | Property: Vorname <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Rufname <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Titel <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Namensvorsatz <br/> Type: string | | 2.1.0 | 0.2.0 |
| | Property: Nachname <br/> Type: string | | 2.1.0 | 0.2.0 |
| **XjustizAkteFachspezifischeDaten** | | | 3.1.1 | 0.2.0 |
| | Property: Aktentyp <br/> Type: **Aktentyp** | | 3.1.1 | 0.2.0 |
| | Property: Anzeigename <br/> Type: string | | 3.1.1 | 0.2.0 |
| | Property: Aktenzeichen <br/> Type: **Aktenzeichen** | | 3.1.1 | 0.2.0 |
| **XjustizAkteFachspezifischeDatenCore** | | x | - | 0.2.0 |
| | Property: Aktentyp <br/> Type: **Aktentyp** | | 3.1.1 | 0.2.0 |
| | Property: Anzeigename <br/> Type: string | | 3.1.1 | 0.2.0 |
| | Property: Aktenzeichen <br/> Type: **Aktenzeichen** | | 3.1.1 | 0.2.0 |
| | Property: Ziel <br/> Type: string | x | - | 0.2.0 |
| | Property: Nachricht <br/> Type: string | x | - | 0.2.0 |
| | Property: Sendungsmitteilung <br/> Type: string | x | - | 0.2.0 |
| | Property: Notizen <br/> Type: string | x | - | 0.2.0 |
| | Property: Anliegen <br/> Type: string | x | - | 0.2.0 |
| | Property: Sachverhalt <br/> Type: string | x | - | 0.2.0 |
| | Property: Notarpraeferenz <br/> Type: string | x | - | 0.2.0 |
| | Property: Terminpraeferenz <br/> Type: string | x | - | 0.2.0 |
| **XjustizFachspezifischeDaten** | | | 3.1.1 | 0.2.0 |
| | Property: Dokumentklasse <br/> Type: **Dokumentklasse** | | 3.1.1 | 0.2.0 |
| | Property: Datei <br/> Type: **Datei** | | 3.1.1 | 0.2.0 |
| **XjustizFachspezifischeDatenCore** | | x | - | 0.2.0 |
| | Property: Dokumentklasse <br/> Type: **Dokumentklasse** | | 3.1.1 | 0.2.0 |
| | Property: Datei <br/> Type: **DateiCore** | x | - | 0.2.0 |
| **AktentypCode** | | | No | 2.1.0 | 0.2.0 |
| **BestandteiltypCode** | | | No | 2.2.1 | 0.2.0 |
| **DokumentklasseCode** | | | No | 2.1.0 | 0.2.0 |
| **GerichtCode** | | | No | 2.1.0 | 0.2.0 |
| **GeschlechtCode** | | | No | 2.1.0 | 0.2.0 |
| **RollenCode** | | | No | 2.1.0 | 0.2.0 |
| **StaatCode** | | | No | 3.1.1 | 0.2.0 |
| **TelekommunikationsartCode** | | | No | 3.2.1 | 0.2.0 |
