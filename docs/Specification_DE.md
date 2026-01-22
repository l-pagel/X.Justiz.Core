# Spezifikation für X.Justiz Core

> [!TIP]  
> **🌐 [English version available here](Specification.md) 👈**

Dieses Dokument bietet eine umfassende Spezifikation des X.Justiz-Core-Datenmodells, einschließlich seiner Klassen, Eigenschaften, Versionierung und Nutzungsmuster.

---

## Inhaltsverzeichnis

- [1. Wurzelobjekt: UebermittlungSchriftgutobjekteNachricht](#1-wurzelobjekt-uebermittlungschriftgutobjektenachricht)
  - [1.1 Übersicht](#11-übersicht)
  - [1.2 Struktur](#12-struktur)
  - [1.3 Einfache Verwendungsbeispiele](#13-einfache-verwendungsbeispiele)
- [2. Benutzerdefinierte Daten: Feld und Feldgruppe](#2-benutzerdefinierte-daten-feld-und-feldgruppe)
  - [2.1 Wann benutzerdefinierte Felder verwenden](#21-wann-benutzerdefinierte-felder-verwenden)
  - [2.2 Feld](#22-feld)
  - [2.3 Feldgruppe](#23-feldgruppe)
  - [2.4 Beispiele: Verkehrsunfall](#24-beispiele-verkehrsunfall)
- [3. Dateianhänge](#3-dateianhänge)
  - [3.1 Anhänge-Optionen](#31-anhänge-optionen)
  - [3.2 Verwendung von Datei (Standard X.Justiz)](#32-verwendung-von-datei-standard-xjustiz)
  - [3.3 Verwendung von DateiCore (Erweitert)](#33-verwendung-von-dateicore-erweitert)
  - [3.4 Artefakt-Typen](#34-artefakt-typen)
- [4. Datenmodell-Referenz](#4-datenmodell-referenz)
  - [4.1 Verwendung der Tabelle](#41-verwendung-der-tabelle)
  - [4.2 Vollständiges Datenmodell](#42-vollständiges-datenmodell)

---

## 1. Wurzelobjekt: UebermittlungSchriftgutobjekteNachricht

### 1.1 Übersicht

Die `UebermittlungSchriftgutobjekteNachricht` (Schriftgutobjekte-Übermittlungsnachricht) ist das **Wurzelobjekt** für allen Datenaustausch im X.Justiz Core Format. Sie dient als standardisierte „Hülle", die alle Informationen über einen Rechtsfall enthält, einschließlich Metadaten, Beteiligten und Dokumenten.

Diese Klasse ist der primäre Einstiegspunkt für:
- **Daten senden**: Serialisieren Sie eine Instanz zu JSON oder XML, um Rechtsfallsinformationen zu übermitteln
- **Daten empfangen**: Deserialisieren Sie eingehende JSON- oder XML-Daten in ein stark typisiertes Objekt

### 1.2 Struktur

Die `UebermittlungSchriftgutobjekteNachricht` besteht aus drei Hauptkomponenten:

| Eigenschaft | Typ | Beschreibung |
|-------------|-----|--------------|
| **Kopf** | `NachrichtenkopfCore` | Nachrichtenkopf mit Metadaten (Version, Zeitstempel, Absender-/Empfängerinfo) |
| **Grunddaten** | `Grunddaten` | Grundlegende Falldaten einschließlich Verfahrensinformationen und Beteiligten |
| **Schriftgutobjekte** | `Schriftgutobjekte` | Die eigentlichen Dokumente und Dateien (Akten und Dokumente) |
| **SchemaLocation** | `string` | Optionale XSD-Schema-Position für XML-Validierung |

```
UebermittlungSchriftgutobjekteNachricht
├── Kopf (NachrichtenkopfCore)
│   ├── Version
│   ├── Version_XJustizCore
│   ├── Version_XJustizReferenz
│   ├── Erstellungszeitpunkt
│   ├── Absender / Empfaenger
│   └── AktenzeichenAbsender / AktenzeichenEmpfaenger
├── Grunddaten
│   └── Verfahrensdaten
│       ├── Verfahrensnummer
│       ├── Instanzdaten
│       └── Beteiligungen (Beteiligte)
└── Schriftgutobjekte
    ├── Akte[] (Akten)
    └── Dokumente[] (Dokumente)
```

### 1.3 Einfache Verwendungsbeispiele

#### Nachricht erstellen (C#)
```csharp
using xjustiz.core_dotnet.Models;

var message = new UebermittlungSchriftgutobjekteNachricht
{
    Kopf = new NachrichtenkopfCore
    {
        Version = "3.5.1",
        Version_XJustizCore = "0.2.0",
        Erstellungszeitpunkt = DateTime.UtcNow,
        EigeneNachrichtenId = Guid.NewGuid().ToString(),
        Absender = new AuswahlAdresse { AbsenderSonstige = "Kanzlei ABC" },
        Empfaenger = new AuswahlAdresse { EmpfaengerSonstige = "Versicherung XYZ" }
    },
    Grunddaten = new Grunddaten
    {
        Verfahrensdaten = new Verfahrensdaten
        {
            Verfahrensnummer = "2024-VU-12345"
        }
    },
    Schriftgutobjekte = new Schriftgutobjekte()
};
```

#### Nachricht erstellen (Java)
```java
import de.xjustiz.core.models.*;

var message = new UebermittlungSchriftgutobjekteNachricht();

var kopf = new NachrichtenkopfCore();
kopf.setVersion("3.5.1");
kopf.setVersionXJustizCore("0.2.0");
kopf.setErstellungszeitpunkt(LocalDateTime.now());
kopf.setEigeneNachrichtenId(UUID.randomUUID().toString());
message.setKopf(kopf);

var grunddaten = new Grunddaten();
var verfahrensdaten = new Verfahrensdaten();
verfahrensdaten.setVerfahrensnummer("2024-VU-12345");
grunddaten.setVerfahrensdaten(verfahrensdaten);
message.setGrunddaten(grunddaten);

message.setSchriftgutobjekte(new Schriftgutobjekte());
```

---

## 2. Benutzerdefinierte Daten: Feld und Feldgruppe

### 2.1 Wann benutzerdefinierte Felder verwenden

X.Justiz Core bietet einen umfassenden Satz von Eigenschaften für gängige rechtliche Szenarien. Es kann jedoch Fälle geben, in denen Sie Informationen übermitteln müssen, für die **keine passende Standardeigenschaft existiert**.

Für diese Situationen verwenden Sie die `AnwendungsspezifischeErweiterung` (Anwendungsspezifische Erweiterung) mit ihren `Feld`- und `Feldgruppe`-Elementen.

**Verwenden Sie benutzerdefinierte Felder wenn:**
- Die Information fachspezifisch ist und nicht durch Standardeigenschaften abgedeckt wird
- Sie strukturierte Daten übermitteln müssen, die nicht in das bestehende Modell passen
- Verschiedene Systeme sich auf benutzerdefinierte Austauschformate geeinigt haben
- Sie Rückwärtskompatibilität benötigen, während Sie auf Standardisierung warten

### 2.2 Feld

Ein `Feld` repräsentiert ein einzelnes Schlüssel-Wert-Paar mit optionalen Metadaten:

| Eigenschaft | Typ | Beschreibung |
|-------------|-----|--------------|
| **Name** | `string` | Der Bezeichner/Schlüssel des Feldes |
| **Wert** | `string` | Der Wert (wird immer als String übermittelt) |
| **Datentyp** | `string` | Optional: Der Datentyp (z.B. "string", "decimal", "date") |
| **Beschreibung** | `string` | Optional: Menschenlesbare Beschreibung |

### 2.3 Feldgruppe

Eine `Feldgruppe` ermöglicht es, verwandte Felder zusammenzufassen und sogar Gruppen hierarchisch zu verschachteln:

| Eigenschaft | Typ | Beschreibung |
|-------------|-----|--------------|
| **Name** | `string` | Der Name der Gruppe |
| **Beschreibung** | `string` | Optional: Beschreibung des Gruppenzwecks |
| **Felder** | `List<Feld>` | Felder, die zu dieser Gruppe gehören |
| **UnterFeldgruppen** | `List<Feldgruppe>` | Verschachtelte Untergruppen |

### 2.4 Beispiele: Verkehrsunfall

Hier zeigen wir, wie `Feld` und `Feldgruppe` für einen Verkehrsunfall-Fall verwendet werden:

#### Beispiel 1: Unfalldetails als Felder (C#)
```csharp
var akte = new AkteCore
{
    Identifikation = new Identifikation { Id = "AKTE-001" },
    AnwendungsspezifischeErweiterung = new AnwendungsspezifischeErweiterung
    {
        Kennung = "verkehrsunfall-details",
        Name = "Verkehrsunfall-Details",
        Beschreibung = "Erweiterte Daten für Verkehrsunfälle",
        Felder = new List<Feld>
        {
            new Feld 
            { 
                Name = "Unfallort", 
                Wert = "Hauptstraße 42, 10115 Berlin",
                Datentyp = "string",
                Beschreibung = "Ort des Unfalls"
            },
            new Feld 
            { 
                Name = "Unfalldatum", 
                Wert = "2024-01-15",
                Datentyp = "date"
            },
            new Feld 
            { 
                Name = "Unfallzeit", 
                Wert = "14:30",
                Datentyp = "time"
            },
            new Feld 
            { 
                Name = "Geschaetzte_Schadenshoehe", 
                Wert = "4500.00",
                Datentyp = "decimal",
                Beschreibung = "Geschätzte Schadenshöhe in EUR"
            }
        }
    }
};
```

#### Beispiel 2: Verschachtelte Gruppen für Fahrzeuge und Zeugen (C#)
```csharp
var erweiterung = new AnwendungsspezifischeErweiterung
{
    Kennung = "verkehrsunfall-vollstaendig",
    Name = "Vollständige Verkehrsunfall-Daten",
    Feldgruppen = new List<Feldgruppe>
    {
        // Fahrzeug 1 Information
        new Feldgruppe
        {
            Name = "Fahrzeug_Mandant",
            Beschreibung = "Fahrzeuginformationen des Mandanten",
            Felder = new List<Feld>
            {
                new Feld { Name = "Kennzeichen", Wert = "B-AB 1234" },
                new Feld { Name = "Fahrzeugtyp", Wert = "PKW" },
                new Feld { Name = "Hersteller", Wert = "Volkswagen" },
                new Feld { Name = "Modell", Wert = "Golf" },
                new Feld { Name = "Baujahr", Wert = "2020", Datentyp = "integer" }
            }
        },
        // Fahrzeug 2 Information (Gegner)
        new Feldgruppe
        {
            Name = "Fahrzeug_Gegner",
            Beschreibung = "Fahrzeuginformationen des Gegners",
            Felder = new List<Feld>
            {
                new Feld { Name = "Kennzeichen", Wert = "M-XY 5678" },
                new Feld { Name = "Fahrzeugtyp", Wert = "PKW" },
                new Feld { Name = "Hersteller", Wert = "BMW" },
                new Feld { Name = "Modell", Wert = "3er" }
            }
        },
        // Zeugen als verschachtelte Gruppe
        new Feldgruppe
        {
            Name = "Zeugen",
            Beschreibung = "Zeugeinformationen",
            UnterFeldgruppen = new List<Feldgruppe>
            {
                new Feldgruppe
                {
                    Name = "Zeuge_1",
                    Felder = new List<Feld>
                    {
                        new Feld { Name = "Name", Wert = "Max Mustermann" },
                        new Feld { Name = "Telefon", Wert = "+49 30 12345678" },
                        new Feld { Name = "War_Anwesend", Wert = "true", Datentyp = "boolean" }
                    }
                }
            }
        }
    }
};
```

#### Beispiel 3: Verkehrsunfall im JSON-Format
```json
{
  "Kopf": {
    "Version": "3.5.1",
    "Version_XJustizCore": "0.2.0",
    "Erstellungszeitpunkt": "2024-01-20T10:30:00Z",
    "AktenzeichenAbsender": ["2024-VU-001"]
  },
  "Grunddaten": {
    "Verfahrensdaten": {
      "Verfahrensnummer": "2024-VU-001"
    }
  },
  "Schriftgutobjekte": {
    "Akte": [{
      "Identifikation": { "Id": "AKTE-001" },
      "AnwendungsspezifischeErweiterung": {
        "Kennung": "verkehrsunfall",
        "Name": "Verkehrsunfall-Daten",
        "Felder": [
          { "Name": "Unfallort", "Wert": "Hauptstraße 42, Berlin" },
          { "Name": "Unfalldatum", "Wert": "2024-01-15", "Datentyp": "date" },
          { "Name": "Schadenshoehe_EUR", "Wert": "4500.00", "Datentyp": "decimal" }
        ],
        "Feldgruppen": [{
          "Name": "Fahrzeugdaten",
          "Felder": [
            { "Name": "Kennzeichen", "Wert": "B-AB 1234" },
            { "Name": "Fahrzeugtyp", "Wert": "PKW" }
          ]
        }]
      }
    }]
  }
}
```

---

## 3. Dateianhänge

X.Justiz Core bietet mehrere Möglichkeiten, Dateien und Dokumente an eine Nachricht anzuhängen. Die Wahl hängt von Ihrem Anwendungsfall ab und davon, ob Sie Standard-X.Justiz-Kompatibilität oder X.Justiz Core-Erweiterungen verwenden.

### 3.1 Anhänge-Optionen

| Option | Klasse | Anwendungsfall |
|--------|--------|----------------|
| **Standard** | `Datei` | X.Justiz-Kompatibilität, grundlegende Dateimetadaten |
| **Erweitert** | `DateiCore` | Vollständige Metadaten inkl. Hash, Größe, Content-Type |
| **Gebündelt** | `BundlePathArtifact` | Datei im ZIP-Archiv enthalten |
| **Fernzugriff** | `HttpsArtifact` | Datei verfügbar über Pre-signed URL |

### 3.2 Verwendung von Datei (Standard X.Justiz)

Die `Datei`-Klasse bietet grundlegende Dateimetadaten, kompatibel mit Standard-X.Justiz:

```csharp
var dokument = new Dokument
{
    Identifikation = new Identifikation { Id = "DOK-001" },
    FachspezifischeDaten = new XjustizFachspezifischeDaten
    {
        Dokumentklasse = new Dokumentklasse { Code = DokumentklasseCode.Anlagen },
        Datei = new Datei
        {
            Dateiname = "unfallbericht.pdf",
            Bestandteil = new Bestandteiltyp { Code = BestandteiltypCode.Inhalt }
        }
    }
};
```

### 3.3 Verwendung von DateiCore (Erweitert)

Die `DateiCore`-Klasse (X.Justiz Core-Erweiterung) bietet umfassende Dateimetadaten:

```csharp
var dokumentCore = new DokumentCore
{
    Identifikation = new Identifikation { Id = "DOK-002" },
    Erstellungszeitpunkt = DateTime.UtcNow,
    FachspezifischeDaten = new XjustizFachspezifischeDatenCore
    {
        Dokumentklasse = new Dokumentklasse { Code = DokumentklasseCode.Anlagen },
        Datei = new DateiCore
        {
            Dateiname = "unfallfotos.zip",
            Dateiendung = "zip",
            ContentType = "application/zip",
            Groesse = 2456789,  // Größe in Bytes
            Hash = new HashInfo
            {
                Algorithm = "SHA-256",
                Value = "a1b2c3d4e5f6..."
            },
            Bestandteil = new Bestandteiltyp { Code = BestandteiltypCode.Inhalt },
            Artefakte = new List<Artifact>
            {
                // Siehe Artefakt-Typen unten
            }
        }
    }
};
```

### 3.4 Artefakt-Typen

Artefakte definieren, wo der eigentliche Dateiinhalt abgerufen werden kann:

#### BundlePathArtifact - Dateien im ZIP-Archiv
```csharp
// Datei ist im selben ZIP-Archiv wie die XML/JSON-Nachricht enthalten
new BundlePathArtifact
{
    Pfad = "attachments/unfallbericht.pdf"
}
```

#### HttpsArtifact - Dateien über Pre-signed URL
```csharp
// Datei ist zum Download über eine Pre-signed URL verfügbar
new HttpsArtifact
{
    Url = "https://storage.example.com/files/unfallbericht.pdf?signature=abc123",
    ExpiresAtUtc = DateTime.UtcNow.AddHours(24),
    Header = new List<HttpHeader>
    {
        new HttpHeader { Key = "Authorization", Value = "Bearer token123" }
    }
}
```

#### Vollständiges Beispiel - Mehrere Artefakte
```csharp
var datei = new DateiCore
{
    Dateiname = "gutachten.pdf",
    Dateiendung = "pdf",
    ContentType = "application/pdf",
    Groesse = 1234567,
    Hash = new HashInfo
    {
        Algorithm = "SHA-256",
        Value = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
    },
    Artefakte = new List<Artifact>
    {
        // Primär: verfügbar im ZIP-Bundle
        new BundlePathArtifact { Pfad = "documents/gutachten.pdf" },
        
        // Fallback: auch über HTTPS verfügbar
        new HttpsArtifact
        {
            Url = "https://cdn.example.com/gutachten.pdf?token=xyz",
            ExpiresAtUtc = DateTime.UtcNow.AddDays(7)
        }
    }
};
```

---

## 4. Datenmodell-Referenz

### 4.1 Verwendung der Tabelle

Die folgende Tabelle beschreibt die Hierarchie und Entwicklung des Datenmodells:

- **Class**: Die fettgedruckte Container-Klasse für eine Gruppe von Eigenschaften.
- **Property / Type**: Der Name des Feldes und der zugehörige Datentyp. Komplexe Typen (verknüpfte Klassen) sind **fett** gedruckt.
- **Core Only**: Markiert mit einem `x`, wenn diese spezifische Klasse oder Eigenschaft eine Erweiterung ist, die exklusiv durch X.Justiz-Core eingeführt wurde.
- **Release X.Justiz**: Die ursprüngliche X.Justiz-Version, in der dieses Element erstmals eingeführt wurde (markiert mit `-` bei Core-only Erweiterungen).
- **Release Core**: Die X.Justiz-Core-Version, ab der dieses Element verfügbar ist.

### 4.2 Vollständiges Datenmodell

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

---

## Siehe auch

- **[README](../README_DE.md)** - Projektübersicht und Erste Schritte
- **[Änderungshistorie](Changelog_DE.md)** - Versionshistorie
- **[.NET SDK Dokumentation](../dotnet/README_DE.md)** - .NET SDK Benutzerhandbuch
- **[Java SDK Dokumentation](../java/README_DE.md)** - Java SDK Benutzerhandbuch
- **[Beispieldatensätze](../example-datasets/)** - Beispieldateien
- **[SDK-Generierungs-Workflow](SDK-GENERATION_DE.md)** - Wie SDKs synchron gehalten werden
