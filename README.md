# X.Justiz-LegalTech Version 0.1.0
Ein Projekt zur Erweiterung des X.Justiz-Formats basierend auf XJustiz-Export (3.5.1)

## Setup / Herangehensweise

Um den XJustiz-Export sauber aufzubauen und zu prüfen, bin ich wie folgt vorgegangen:

### Werkzeuge & Unterlagen

- **OpenXML Editor**
    
    Zuerst installiert, um die **Struktur** des Schriftgut-Objekts (Akte, Dokumente, Kopf/Grunddaten) schnell **visuell** zu verstehen und anschließend die erzeugte **XJustiz-XML zu inspizieren und gegen die XSD zu validieren** (Elementreihenfolge, Namespaces, `xsi:schemaLocation`, Codes).
    
- **XJustiz Spezifikations-PDF (3.5.1)**
    
    Diente als Referenz, für genauere Informationen
    

### Vorgehen in Iterationen

1. **Verstehen & Abgrenzen**
    
    Mit OpenXML Editor + Spezifikation ermittelt, welche Elemente/Felder abbildbar sind und wo Erweiterungen nötig sind.
    
2. **Mapping aufsetzen**
    
    Im **`XJustizMapper`** Domain-Objekte (Fall, Beteiligte, Dokumente, Formular-Sections) auf XJustiz-Klassen gemappt, inkl. **Defaults/Platzhalter** und **Erweiterungen**.
    
3. **Proben erzeugen**
    
    Test-Exports mit typischen Variationen (mit/ohne Aktenzeichen, mehrere Beteiligte/Dateien, mit/ohne Formularwerte).
    
4. **Validieren (OpenXML Editor)**
    
    XML öffnen, Struktur/ Reihenfolge prüfen, **XSD-Validierung** (Namespaces, `xsi:schemaLocation`), Codes/ListVersionIDs abgleichen.
    
5. **Nachschärfen**
    
    Abweichungen im Mapper korrigiert, erneut exportiert – **iterativ** wiederholt.
    

### Zweck & Kontext

Der Nachrichtentyp **`nachricht.gds.uebermittlungSchriftgutobjekte.0005005`** ist der standardisierte **Umschlag** zur Übermittlung von **Akte(n)** und **Dokument(en)** inkl. Metadaten an Gerichte/Behörden (XSD: `xjustiz_0005_nachrichten_3_1.xsd`, Version 3.5.1).

Er gliedert sich in:

1. **`nachrichtenkopf`** – Version, Aktenzeichen, Zeitstempel, Absender/Empfänger, optionale eigene ID
2. **`grunddaten`** – Verfahrens-/Instanzdaten, Beteiligte (Rollen, Personen/Organisationen)
3. **`schriftgutobjekte`** – Akte(n) (mit anwendungsspezifischen Erweiterungen) & Dokument(e)

**Warum dieser Typ?** Er ist der kanonische Transportbehälter in XJustiz für „Casefile + Files“: interoperabel, XSD-validierbar und erweiterbar.

---

## Root-Aufbau (Entity: XJusticeExport)

```csharp
public class UebermittlungSchriftgutobjekteNachricht
{
    [XmlElement("nachrichtenkopf", Namespace = XJustizExport.Tns)]
    public Nachrichtenkopf Kopf { get; set; } = new();

    [XmlElement("grunddaten", Namespace = XJustizExport.Tns)]
    public Grunddaten? Grunddaten { get; set; }

    [XmlElement("schriftgutobjekte", Namespace = XJustizExport.Tns)]
    public Schriftgutobjekte? Schriftgutobjekte { get; set; }

    [XmlAttribute(AttributeName = "schemaLocation", Namespace = XJustizExport.Xsi)]
    public string SchemaLocation { get; set; } =
        $"{XJustizExport.Tns} xjustiz_0005_nachrichten_3_1.xsd";
}

```

### Bedeutung der Felder

- **`Kopf`** → `<nachrichtenkopf>` im Namespace `http://www.xjustiz.de`; enthält Metadaten der Nachricht.
- **`Grunddaten`** *(optional)* → `<grunddaten>`; Verfahrens-/Instanzdaten & Beteiligungen.
- **`Schriftgutobjekte`** *(optional)* → `<schriftgutobjekte>`; Akte + Dokumente.
- **`SchemaLocation`** → Attribut `xsi:schemaLocation` am Root; Hinweis für Validatoren, **wo die XSD liegt**.

> Damit xsi:schemaLocation geschrieben wird, beim Serialisieren das Prefix xsi registrieren: http://www.w3.org/2001/XMLSchema-instance.
> 

#### Hinweis zur **Validierung** (lokale Datei)

Für die XSD-Validierung kann die Schema-Datei per **file-URI** referenziert werden.

Beispiel (Leerzeichen **URL-encoden**!):

```
xsi:schemaLocation="http://www.xjustiz.de file:///C:/XJustiz%203.5.1%20XSD/xjustiz_0005_nachrichten_3_1.xsd"

```

- Links der **Namespace**, rechts der **vollqualifizierte Pfad** zur XSD (getrennt durch ein Leerzeichen).
- Pfade mit Leerzeichen als `%20` encoden (`XJustiz%203.5.1%20XSD`).
- Für reine Auslieferungen genügt oft ein **relativer** Pfad oder nur der Dateiname; für **lokale Prüfung** (z. B. im OpenXML Editor) ist der **absolute `file:///…`Pfad** zuverlässig.

---

## Namespaces

```csharp
public static class XJustizExport
{
    public const string Tns = "http://www.xjustiz.de";
    public const string Xsi = "http://www.w3.org/2001/XMLSchema-instance";
}

```

- **`Tns`**: Target Namespace des XJustiz-Schemas; alle Fach-Elemente liegen hier.
- **`Xsi`**: Namespace für Schema-Instance-Attribute (z. B. `xsi:schemaLocation`, `xsi:nil`).

Beim Serialisieren:

```csharp
var ns = new XmlSerializerNamespaces();
ns.Add(string.Empty, XJustizExport.Tns); // Default-NS
ns.Add("xsi", XJustizExport.Xsi);        // 'xsi' Prefix

```

---

## XML-Attributierung (Elementname, Namespace, Reihenfolge)

```csharp
[XmlElement("aktenzeichen.absender", Namespace = XJustizExport.Tns, Order = 1)]
public string[]? AktenzeichenAbsender { get; set; }

```

- **Elementname**: exakt wie angegeben (Punkte sind **Teil des Namens**, kein Pfad).
- **Namespace**: Element liegt im XJustiz-Namespace.
- **Order**: erzwingt Elementreihenfolge innerhalb der Klasse gemäß XSD.

---

## Export-Flow (FileExportService)

### Konfiguration

```csharp
public class FileExportConfiguration
{
    public ExportFileFormatType ExportFormat { get; set; } 
    = ExportFileFormatType.JustinLegal;

    public string? EmailAddress { get; set; }

    public bool? SendEmail { get; set; } = false;
}

```

- **`ExportFormat`** steuert XJusitz vs. Standard/JustinLegal.
- **Frontend** wählt Format in den Export-Settings.

### Branching & Mapping

```csharp
    private static async Task AddExportPayloadAsync(
    ZipArchive zip,
    ExportFileFormatType format,
    CaseFileView caseFileView,
    List<StorageObjectDto> exportFiles,
    string fileName)
    {
        switch (format)
        {
            case ExportFileFormatType.XJustiz:
                {
                    var xj = XJustizMapper.Map(caseFileView, exportFiles);
                    await XJustizExportUtil.AddXJustizXmlToZipAsync(zip, xj, fileName);
                    break;
                }

            case ExportFileFormatType.JustinLegal:
                {
                    var fe = FileExportMapper.Map(caseFileView);
                    await FileExportUtil.AddXmlToZipAsync(zip, fe, fileName);
                    break;
                }

            default:
                throw new InvalidOperationException($"Unsupported export format: {format}");
        }
    }

```

### ZIP-Erstellung & Inhalte

```csharp
 try
{
string tempZipPath = Path.Combine(Path.GetTempPath(), Path.GetRandomFileName());

using (var zip = ZipFile.Open(tempZipPath, ZipArchiveMode.Create))
{
await AddExportPayloadAsync(zip, fileExportConfig.ExportFormat, caseFileView, exportFiles, FileName);

await FileExportUtil.AddSummaryToZipAsync(zip, caseFileView, documentGenerationService);
await FileExportUtil.AddBlobsToZipAsync(zip, exportFiles, storageService, true);
}

```

**Ergebnis-ZIP enthält:**

1. das **Export-XML** (XJustiz oder Standard),
2. eine **Summary** (lesbare Übersicht),
3. alle **Blobs/Dokumente** aus `exportFiles`.

---

## Mapping-Übersicht (Domain → XJustiz)

### 1.1 Nachrichtenkopf (`nachrichtenkopf`)

| Domain | XJustiz | Logik/Quelle | Bemerkungen |
| --- | --- | --- | --- |
| `caseFile.FileNumber` | `Kopf.AktenzeichenAbsender[]` | gesetzt, wenn nicht leer | sonst `null` → Element fehlt |
| *(fix)* | `Kopf.AktenzeichenEmpfaenger[]` | `{ "NEU" }` | Platzhalter, in Caps |
| `caseFile.Submitted` | `Kopf.Erstellungszeitpunkt` | `EnsureUtc(Submitted)` oder `UtcNow` | UTC erzwungen |
| `caseFile.LawFirm?.Name` | `Kopf.Absender.AbsenderSonstige` | 1:1 | optional |
| *(fix)* | `Kopf.Empfaenger.EmpfaengerSonstige` | `"UNBEKANNT"` | Platzhalter, in Caps |
| *(neu)* | `Kopf.EigeneNachrichtenId` | `Guid.NewGuid().ToString()` | pro Export generiert |

### 1.2 Grunddaten (`grunddaten` → `verfahrensdaten`)

| Domain | XJustiz | Logik/Quelle | Bemerkungen |
| --- | --- | --- | --- |
| `caseFile.FileNumber` | `Verfahrensdaten.Verfahrensnummer` | 1:1 | optional |
| *(fix)* | `Instanzdaten.Instanznummer` | `"1"` | fix |
| `caseFile.IssueTypeString` | `Instanzdaten.Sachgebietszusatz` | Wert oder `"UNBEKANNT"` | Fallback in Caps |
| *(fix)* | `Gericht.ListVersionId` | `"3.5.1"` | fix |
| *(fix)* | `Gericht.Code` | `"UNBEKANNT"` | Platzhalter |

#### 1.2.1 Beteiligungen (`beteiligung[]`)

**Quellen:**

- `MainClient` → RollenCode **Antragsteller**
- `Clients` → **Beteiligter**
- `Opponents` → **Beklagter**
- `Witnesses` → **Zeuge**
- `Others` → **Sonstige**
- **NEU:** `Insurances` → **Sonstige** (als Organisation)

| Domain | XJustiz | Logik/Quelle | Bemerkungen |
| --- | --- | --- | --- |
| RollenCode | `Rolle.Rollenbezeichnung.Code` | aus `RoleCodes.*` | `ListVersionId="3.5.1"` |
| `ContactView.Type` | `AuswahlBeteiligter.NP`/`Org` | `LegalPerson` → `Org`, sonst `NP` | Verzweigung |
| **Natürliche Person** |  |  |  |
| `FirstName`/`LastName`/`Title` bzw. `Name` | `NP.VollerName` | parsing mit Fallbacks | `Rufname`, `Namensvorsatz` bleiben leer |
| `Addresses.FirstOrDefault()` | `NP.Anschrift` | via `ToAnschriftFromAddress` | siehe Adress-Mapping |
| `BankInfo` | `NP.Bankverbindung` | owner/IBAN/BIC | wenn alle leer → `null` |
| `EmailAddress`, `PhoneNumberString`, `FaxNumber` | `NP.Telekommunikation[]` | Codes: E-Mail **001**, Telefon **002**, Fax **003** | nur wenn Werte vorhanden |
| **Organisation** |  |  |  |
| `Name` | `Org.Bezeichnung.Aktuell` | Wert oder `"Unbenannte Organisation"` | Fallback |
| `Addresses.FirstOrDefault()` | `Org.Anschrift` | wie oben | optional |
| `BankInfo` | `Org.Bankverbindung` | wie oben | optional |
| `EmailAddress`, `PhoneNumberString`, `FaxNumber` | `Org.Telekommunikation[]` | Codes 001/002/003 | optional |
| **InsuranceView** | Organisation + Adresse | `InsuranceCompany` sonst `InsuranceTypeName` sonst `"Versicherung"`; Adresse via `ToAnschriftInsurance` | Rolle **Sonstige** |
| Sex | Geschlecht | Codes 001/002/003 |  |

#### Adress-Mapping (`ToAnschriftFromAddress`)

- **Straße** ← `Street`
- **Hausnummer** ← `HouseNumber`
- **PLZ** ← `PostCode`
- **Ort** ← `City`
- **Staat.Code** ← `Country`

> Wenn alle Felder leer ⇒ Anschrift = null.
> 
> 
> `Staat.ListVersionId = "3.5.1"` (aus Modell).
> 

#### Bank-Mapping (`ToBankverbindung`)

- **Kontoinhaber** ← `BankAccountOwner`
- **IBAN** ← `Iban`
- **BIC** ← `Bic`

> Wenn alle leer ⇒ null.
> 

#### Telekommunikation (`ToTelekommunikation`)

- E-Mail (`001`) ← `EmailAddress`
- Telefon (`002`) ← `PhoneNumberString`
- Fax (`003`) ← `FaxNumber`

> Nur angelegt, wenn Wert vorhanden.
> 

### 1.3 Schriftgutobjekte (`schriftgutobjekte`)

#### 1.3.1 Akte (eine)

| Domain | XJustiz | Logik/Quelle | Bemerkungen |
| --- | --- | --- | --- |
| *(neu)* | `Akte.Identifikation.Id` | `caseFile.id.toString()` | pro Export |
| *(fix)* | `Akte.Identifikation.NummerImUebergeordnetenContainer` | `"1"` | fix |
| `caseFile.Title` | `XjustizAkteFachspezifischeDaten.Anzeigename` | Wert oder `"Anzeigename nicht gefunden"` | Fallback aktualisiert |
| `caseFile.FileNumber` | `Aktenzeichen.Auswahl.Freitext` | Wert oder `"neu"` | Freitext |
| *(fix)* | `Aktentyp.Code` | `"001"` | fix |

#### AnwendungsspezifischeErweiterung (aus **Form Sections**)

- **Quelle:** `caseFile.Form.Sections`
- Pro Section wird **eine `Feldgruppe`** erzeugt:
    - `Feldgruppe.Name` = `PortalTitle` oder `Title`
    - `Feldgruppe.Beschreibung` = `section.EntitySchema.Type.ToString()`
    - **Direkte Felder** in der Section (nicht verschachtelt) → `Feld { Name, Wert }`
    - **Verschachtelte Felder** (Group/List/Options) → rekursiv in `UnterFeldgruppen`
- **Wertauflösung:**
    - zuerst via `DocumentKey`, sonst via `Id` (siehe `BuildValueLookup`)
- **Nur gesetzt**, wenn mind. **eine** Section Feld(er)/Gruppe(n) liefert.
- Kennung/Name: `"Mandatensoftware"`, `"JL.Portal"`.

#### 1.3.2 Dokumente (0..n)

| Domain | XJustiz | Logik/Quelle | Bemerkungen |
| --- | --- | --- | --- |
| *(neu)* | `Dokument.Identifikation.Id` | `Guid.NewGuid().ToString()` (fileId würde besser paasen aber nicht zugreifbar von storageObject) | pro Datei |
| Index `i` | `NummerImUebergeordnetenContainer` | `(i+1).ToString()` | 1-basiert |
| `caseFile.Submitted` | `Dokument.Erstellungszeitpunkt` | `EnsureUtc(Submitted)` oder `UtcNow` | konsistent |
| `StorageObjectDto.FileName/BlobName` | `Datei.Dateiname` | Fallback `"dokument"`, ggf. Extension aus `BlobName` ergänzen |  |
| Dateiendung | `Dokumentklasse.Code` | `pdf/doc/docx/rtf/odt→SCHRIFTSATZ`, `jpg/jpeg/png/tif/tiff→ANLAGE`, `xml→DOKUMENT`, sonst `UNBEKANNT` | `ListVersionId="3.5.1"` |
| *(fix)* | `Datei.Bestandteile[0]` | `ListVersionId="2.4", Code="001"` | fix |

---

## 2) Was ist (noch) **nicht** gemappt? (aus Domain vorhanden, aber im Mapper ungenutzt)

### 2.1 `CaseFileView`

- `Goal`, `DisclaimerText`, `ContactPermissionDeclaration`
- `HasApproximateTime`
- `CaseHeader`, `MainPersonSalutation`
- `Message`, `SubmittedDateString`, `SubmitMessage`
- `AppointmentPreference`, `NotaryPreference`, `Notes`
- `CustomEntities` *(Werte werden **nicht** mehr direkt als Felder gemappt; nur soweit sie über `Form.Sections`/`Values` in `BuildValueLookup` landen)*

### 2.2 `ContactView`

- `DateOfBirth`, `DateOfBirthString`
- `RegisterNumber`, `RegistryCourt`, `LegalForm`, `IsVatExempt`, `IsVatExemptString`
- `LegalPersonType`, `LegalPersonTypeString`
- `ContactPerson`, `LegalRepresentatives`
- `TypeString`, `LocalRef`, `DocumentKey`

### 2.3 `InsuranceView`

- `BaFinId`, `InsuranceNumber`, `PolicyHolderId`, `PolicyHolderName`, `CoInsuredNames`
- `ClaimNumber`, `VehicleLicensePlate`, `InsuredVehicleLicensePlate`
- `InsuranceType`, `InsuranceTypeName` *(nur als Fallback für Bezeichnung bei fehlender `InsuranceCompany` genutzt)*
- `VehicleInsuranceTypeName`, `LegalProtectionInsuranceTypeNamesString`
- `DeductibleDisplay`, `PartlyComprehensiveDeductibleDisplay`, `ComprehensiveDeductibleDisplay`
- `LocalRef`, `DocumentKey`

---

## 3) Was **kann nicht** gemappt werden? (fachlich/strukturell nicht vorgesehen)

- **Handelsregister & Rechtsform** (`RegisterNumber`, `RegistryCourt`, `LegalForm`): Keine Ziel-Properties im bereitgestellten Modell.
- **Komplexe Versicherungsdetails**
- **Feinere Datentypisierung**

---

## 4) Technische Defaults & generierte IDs

### 4.1 Defaults

| Ziel | Wert |
| --- | --- |
| `Kopf.Version (xjustizVersion)` | `"3.5.1"` |
| `xsi:schemaLocation` | `"http://www.xjustiz.de xjustiz_0005_nachrichten_3_1.xsd"` |
| `GerichtCode.ListVersionId` | `"3.5.1"` |
| `Rollenbezeichnung.ListVersionId` | `"3.5.1"` |
| `Staat.ListVersionId` | `"3.5.1"` |
| `Bestandteil.ListVersionId` | `"2.4"` |
| `Bestandteil.Code` | `"001"` |
| `Aktentyp.Code` | `"001"` |
| Platzhalter/Unbekannt | `"UNBEKANNT"`, `"NEU"` (in Caps) |

### 4.2 GUIDs (pro Export generiert)

| Ort | Feld | Erzeugung |
| --- | --- | --- |
| `Nachrichtenkopf` | `EigeneNachrichtenId` | `Guid.NewGuid().ToString()` |
| `Dokument[i].Identifikation` | `Id` | `Guid.NewGuid().ToString()` |
| `NummerImUebergeordnetenContainer` (Akte) | `"1"` | fix |
| `NummerImUebergeordnetenContainer` (Dokumente) | `(i+1).ToString()` | 1-basiert |

---
