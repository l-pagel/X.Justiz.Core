# Specification for X.Justiz Core

> [!TIP]  
> **🌐 [Deutsche Version hier verfügbar](Specification_DE.md) 👈**

This document provides a comprehensive specification of the X.Justiz Core data model, detailing its classes, properties, versioning, and usage patterns.

---

## Table of Contents

- [1. Root Object: UebermittlungSchriftgutobjekteNachricht](#1-root-object-uebermittlungschriftgutobjektenachricht)
  - [1.1 Overview](#11-overview)
  - [1.2 Structure](#12-structure)
  - [1.3 Basic Usage Examples](#13-basic-usage-examples)
- [2. Custom Data: Feld and Feldgruppe](#2-custom-data-feld-and-feldgruppe)
  - [2.1 When to Use Custom Fields](#21-when-to-use-custom-fields)
  - [2.2 Feld (Field)](#22-feld-field)
  - [2.3 Feldgruppe (Field Group)](#23-feldgruppe-field-group)
  - [2.4 Examples: Traffic Accident Case](#24-examples-traffic-accident-case)
- [3. File Attachments](#3-file-attachments)
  - [3.1 Attachment Options](#31-attachment-options)
  - [3.2 Using Datei (Standard X.Justiz)](#32-using-datei-standard-xjustiz)
  - [3.3 Using DateiCore (Extended)](#33-using-dateicore-extended)
  - [3.4 Artifact Types](#34-artifact-types)
- [4. Data Model Reference](#4-data-model-reference)
  - [4.1 Using the Table](#41-using-the-table)
  - [4.2 Complete Data Model](#42-complete-data-model)

---

## 1. Root Object: UebermittlungSchriftgutobjekteNachricht

### 1.1 Overview

The `UebermittlungSchriftgutobjekteNachricht` (Document Objects Transmission Message) is the **root object** for all data exchange in X.Justiz Core format. It serves as the standardized "envelope" that contains all information about a legal case, including metadata, participants, and documents.

This class is the primary entry point for:
- **Sending data**: Serialize an instance to JSON or XML to transmit legal case information
- **Receiving data**: Deserialize incoming JSON or XML into a strongly-typed object

### 1.2 Structure

The `UebermittlungSchriftgutobjekteNachricht` consists of three main components:

| Property | Type | Description |
|----------|------|-------------|
| **Kopf** | `NachrichtenkopfCore` | Message header containing metadata (version, timestamps, sender/receiver info) |
| **Grunddaten** | `Grunddaten` | Basic case data including procedure information and participants |
| **Schriftgutobjekte** | `Schriftgutobjekte` | The actual documents and files (Akten and Dokumente) |
| **SchemaLocation** | `string` | Optional XSD schema location for XML validation |

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
│       └── Beteiligungen (Participants)
└── Schriftgutobjekte
    ├── Akte[] (Files/Cases)
    └── Dokumente[] (Documents)
```

### 1.3 Basic Usage Examples

#### Creating a Message (C#)
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
        Absender = new AuswahlAdresse { AbsenderSonstige = "Law Firm ABC" },
        Empfaenger = new AuswahlAdresse { EmpfaengerSonstige = "Insurance XYZ" }
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

#### Creating a Message (Java)
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

### 1.4 Extensions over Standard X.Justiz

X.Justiz Core introduces several enhancements over the standard X.Justiz schema to improve usability and developer experience:

- **Simplified Models**: Core entities (like `VersicherungCore`) wrap complex X.Justiz structures into developer-friendly classes.
- **Enhanced Type Safety**: Fields that are generic strings in X.Justiz are mapped to strongly-typed Enums where possible (e.g., `VersichererCode`, `VersicherungsTypCode`).
- **Additional Metadata**: Classes like `DateiCore` provide extended metadata such as Hashes and Content-Type which are essential for modern applications but missing or optional in base X.Justiz.
- **Convenience Methods**: Helper properties (like `CodeForXml`) handle the complexity of X.Justiz code lists transparently.

These extensions are marked with an `x` in the [Data Model Reference](#4-data-model-reference) table.

---

## 2. Custom Data: Feld and Feldgruppe

### 2.1 When to Use Custom Fields

X.Justiz Core provides a comprehensive set of properties for common legal scenarios. However, there may be cases where you need to transmit information for which **no matching standard property exists**. 

For these situations, use the `AnwendungsspezifischeErweiterung` (Application-Specific Extension) with its `Feld` (Field) and `Feldgruppe` (Field Group) elements.

**Use custom fields when:**
- The information is domain-specific and not covered by standard properties
- You need to transmit structured data that doesn't fit the existing model
- Different systems have agreed on custom data exchange formats
- You need backward compatibility while waiting for standardization

### 2.2 Feld (Field)

A `Feld` represents a single key-value pair with optional metadata:

| Property | Type | Description |
|----------|------|-------------|
| **Name** | `string` | The identifier/key of the field |
| **Wert** | `string` | The value (always transmitted as string) |
| **Datentyp** | `string` | Optional: The data type (e.g., "string", "decimal", "date") |
| **Beschreibung** | `string` | Optional: Human-readable description |

> [!IMPORTANT]  
> **Best Practice: Always include `Datentyp`**  
> While `Datentyp` is technically optional, it is **highly recommended** to always specify it. This enables receiving systems to correctly parse and validate the value (e.g., converting "4500.00" to a decimal or "2024-01-15" to a date). Without `Datentyp`, the receiver must guess the intended data type, which can lead to interpretation errors.

### 2.3 Feldgruppe (Field Group)

A `Feldgruppe` allows you to group related fields together and even nest groups hierarchically:

| Property | Type | Description |
|----------|------|-------------|
| **Name** | `string` | The name of the group |
| **Beschreibung** | `string` | Optional: Description of the group's purpose |
| **Felder** | `List<Feld>` | Fields belonging to this group |
| **UnterFeldgruppen** | `List<Feldgruppe>` | Nested sub-groups |

### 2.4 Examples: Traffic Accident Case

Here's how to use `Feld` and `Feldgruppe` for a traffic accident (Verkehrsunfall) case:

#### Example 1: Accident Details as Fields (C#)
```csharp
var akte = new AkteCore
{
    Identifikation = new Identifikation { Id = "AKTE-001" },
    AnwendungsspezifischeErweiterung = new AnwendungsspezifischeErweiterung
    {
        Kennung = "verkehrsunfall-details",
        Name = "Traffic Accident Details",
        Beschreibung = "Extended data for traffic accident cases",
        Felder = new List<Feld>
        {
            new Feld 
            { 
                Name = "Unfallort", 
                Wert = "Hauptstraße 42, 10115 Berlin",
                Datentyp = "string",
                Beschreibung = "Location of the accident"
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
                Beschreibung = "Estimated damage amount in EUR"
            }
        }
    }
};
```

#### Example 2: Nested Groups for Vehicles and Witnesses (C#)
```csharp
var erweiterung = new AnwendungsspezifischeErweiterung
{
    Kennung = "verkehrsunfall-vollstaendig",
    Name = "Complete Traffic Accident Data",
    Feldgruppen = new List<Feldgruppe>
    {
        // Vehicle 1 Information
        new Feldgruppe
        {
            Name = "Fahrzeug_Mandant",
            Beschreibung = "Client's vehicle information",
            Felder = new List<Feld>
            {
                new Feld { Name = "Kennzeichen", Wert = "B-AB 1234" },
                new Feld { Name = "Fahrzeugtyp", Wert = "PKW" },
                new Feld { Name = "Hersteller", Wert = "Volkswagen" },
                new Feld { Name = "Modell", Wert = "Golf" },
                new Feld { Name = "Baujahr", Wert = "2020", Datentyp = "integer" }
            }
        },
        // Vehicle 2 Information (Opponent)
        new Feldgruppe
        {
            Name = "Fahrzeug_Gegner",
            Beschreibung = "Opponent's vehicle information",
            Felder = new List<Feld>
            {
                new Feld { Name = "Kennzeichen", Wert = "M-XY 5678" },
                new Feld { Name = "Fahrzeugtyp", Wert = "PKW" },
                new Feld { Name = "Hersteller", Wert = "BMW" },
                new Feld { Name = "Modell", Wert = "3er" }
            }
        },
        // Witnesses as nested group
        new Feldgruppe
        {
            Name = "Zeugen",
            Beschreibung = "Witness information",
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

#### Example 3: Traffic Accident in JSON Format
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

## 3. File Attachments

X.Justiz Core provides multiple ways to attach files and documents to a message. The choice depends on your use case and whether you're using standard X.Justiz compatibility or X.Justiz Core extensions.

### 3.1 Attachment Options

| Option | Class | Use Case |
|--------|-------|----------|
| **Standard** | `Datei` | X.Justiz compatibility, basic file metadata |
| **Extended** | `DateiCore` | Full metadata including hash, size, content type |
| **Bundled** | `BundlePathArtifact` | File included in ZIP archive |
| **Remote** | `HttpsArtifact` | File available via pre-signed URL |

### 3.2 Using Datei (Standard X.Justiz)

The `Datei` class provides basic file metadata compatible with standard X.Justiz:

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

### 3.3 Using DateiCore (Extended)

The `DateiCore` class (X.Justiz Core extension) provides comprehensive file metadata:

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
            Groesse = 2456789,  // Size in bytes
            Hash = new HashInfo
            {
                Algorithm = "SHA-256",
                Value = "a1b2c3d4e5f6..."
            },
            Bestandteil = new Bestandteiltyp { Code = BestandteiltypCode.Inhalt },
            Artefakte = new List<Artifact>
            {
                // See Artifact Types below
            }
        }
    }
};
```

### 3.4 Artifact Types

Artifacts define where the actual file content can be retrieved from:

#### BundlePathArtifact - Files in ZIP Archive
```csharp
// File is included in the same ZIP archive as the XML/JSON message
new BundlePathArtifact
{
    Pfad = "attachments/unfallbericht.pdf"
}
```

#### HttpsArtifact - Files via Pre-signed URL
```csharp
// File is available for download via a pre-signed URL
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

#### Complete Example - Multiple Artifacts
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
        // Primary: available in the ZIP bundle
        new BundlePathArtifact { Pfad = "documents/gutachten.pdf" },
        
        // Fallback: also available via HTTPS
        new HttpsArtifact
        {
            Url = "https://cdn.example.com/gutachten.pdf?token=xyz",
            ExpiresAtUtc = DateTime.UtcNow.AddDays(7)
        }
    }
};
```

---

## 4. Data Model Reference

### 4.1 Using the Table

The table below describes the hierarchy and evolution of the data model:

- **Class**: The bolded container class for a group of properties.
- **Property / Type**: The name of the field and its associated data type. Complex types (linked classes) are **bolded**.
- **Core Only**: Marked with an `x` if this specific class or property is a unique extension introduced by X.Justiz-Core.
- **Release X.Justiz**: The original X.Justiz version where this element was first introduced (marked as `-` for Core-only extensions).
- **Release Core**: The X.Justiz-Core version in which this element became available.

### 4.2 Complete Data Model

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
| **Selbstbeteiligung** | | x | - | 0.3.0 |
| | Property: SelbstbehaltBeteiligung <br/> Type: string | x | - | 0.3.0 |
| | Property: TeilweiseUmfassendeSelbstbeteiligung <br/> Type: string | x | - | 0.3.0 |
| | Property: UmfassendeSelbstbeteiligung <br/> Type: string | x | - | 0.3.0 |
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
| **Versicherer** | | x | - | 0.3.0 |
| | Property: Code <br/> Type: **VersichererCode** | x | - | 0.3.0 |
| | Property: ListVersionId <br/> Type: string | x | - | 0.3.0 |
| | Property: ListUri <br/> Type: string | x | - | 0.3.0 |
| **VersicherungCore** | | x | - | 0.3.0 |
| | Property: Versicherungsnummer <br/> Type: string | x | - | 0.3.0 |
| | Property: Versicherungsunternehmen <br/> Type: List<**Versicherer**> | x | - | 0.3.0 |
| | Property: Anschrift <br/> Type: **Anschrift** | x | - | 0.3.0 |
| | Property: ReferenzId <br/> Type: Guid | x | - | 0.3.0 |
| | Property: Versicherter <br/> Type: **AuswahlBeteiligter** | x | - | 0.3.0 |
| | Property: Schadensnummer <br/> Type: string | x | - | 0.3.0 |
| | Property: Versicherungstyp <br/> Type: **VersicherungsTyp** | x | - | 0.3.0 |
| | Property: Selbstbeteiligung <br/> Type: **Selbstbeteiligung** | x | - | 0.3.0 |
| | Property: AnwendungsspezifischeErweiterung <br/> Type: **AnwendungsspezifischeErweiterung** | x | - | 0.3.0 |
| **VersicherungsTyp** | | x | - | 0.3.0 |
| | Property: Code <br/> Type: **VersicherungsTypCode** | x | - | 0.3.0 |
| | Property: ListVersionId <br/> Type: string | x | - | 0.3.0 |
| | Property: ListUri <br/> Type: string | x | - | 0.3.0 |
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
| **StaatCode** | | | No | 3.1.1 | 0.2.0 |
| **TelekommunikationsartCode** | | | No | 3.2.1 | 0.2.0 |
| **VersichererCode** | Sources: [BaFin](https://portal.mvp.bafin.de/database/InstInfo/) | x | - | 0.3.0 |
| **VersicherungsTypCode** | Sources: [IHK](https://github.com/l-pagel/X.Justiz.Core/tree/main/docs) | x | - | 0.3.0 |

---

## See Also

- **[README](../README.md)** - Project overview and getting started
- **[Changelog](Changelog.md)** - Version history
- **[.NET SDK Documentation](../dotnet/README.md)** - .NET SDK usage guide
- **[Java SDK Documentation](../java/README.md)** - Java SDK usage guide
- **[Example Datasets](../example-datasets/)** - Sample data files
- **[SDK Generation Workflow](SDK-GENERATION.md)** - How SDKs are kept in sync
