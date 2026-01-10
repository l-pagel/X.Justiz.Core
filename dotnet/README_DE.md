# X.Justiz Core .NET SDK – Dokumentation für Entwickler

> **🌐 English version available here: [README.md](https://github.com/l-pagel/X.Justiz.Core/tree/main/dotnet/README.md) 👈**

Dieses Dokument beschreibt die Nutzung des X.Justiz Core .NET SDKs für Softwareentwickler im deutschen Rechtswesen.

## Installation
Das SDK wird als NuGet-Paket bereitgestellt. Sie können es über die Paket-Manager-Konsole oder die .NET CLI installieren:

```powershell
# .NET CLI
dotnet add package xjustiz.core-dotnet

# Paket-Manager Konsole
Install-Package xjustiz.core-dotnet
```
Die aktuelle Version finden Sie auf [nuget.org](https://www.nuget.org/packages/xjustiz.core-dotnet).

---

## Das Datenmodell nutzen
Das zentrale Modell für den Datenaustausch ist die Klasse `UebermittlungSchriftgutobjekteNachricht`. Sie bildet den standardisierten "Umschlag" für Akten und Dokumente ab.

### Beispiel: Erstellen einer Nachricht
```csharp
using xjustiz.core_dotnet.Models;

var nachricht = new UebermittlungSchriftgutobjekteNachricht
{
    Kopf = new Nachrichtenkopf
    {
        Erstellungszeitpunkt = DateTime.UtcNow,
        EigeneNachrichtenId = Guid.NewGuid().ToString()
    },
    Grunddaten = new Grunddaten
    {
        // Verfahrensdaten, Beteiligte etc.
    },
    Schriftgutobjekte = new Schriftgutobjekte
    {
        // Akten und Dokumente
    }
};
```

---

## Codes und Codelisten
X.Justiz Core nutzt ein strukturiertes System von Codes (z. B. für Rollen, Gerichte, Dokumentklassen).

*   **X.Justiz Standards:** Diese basieren auf den offiziellen Definitionen von [XRepository](https://www.xrepository.de/).
*   **X.Justiz Core Erweiterungen:** Für außergerichtliche Szenarien wurden spezifische Keys hinzugefügt (z.B. für Fachgebiete wie Erbrecht oder Mietrecht).
*   **Agnostische Nutzung:** Das SDK abstrahiert die technischen Details der Codelisten-Versionierung, bietet aber gleichzeitig volle Kontrolle über die `listVersionID`.

Die verfügbaren Codes finden Sie im Namespace `xjustiz.core_dotnet.Models.Codes`.

---

## Nutzung in Web-APIs
Das SDK ist für die Nutzung in ASP.NET Core Controllern optimiert und unterstützt sowohl **XML** als auch **JSON**.

### Controller Integration
```csharp
[ApiController]
[Route("api/xjustiz")]
public class MyController : ControllerBase
{
    // JSON Support (Standard in ASP.NET Core)
    [HttpPost("json")]
    public IActionResult ReceiveJson(UebermittlungSchriftgutobjekteNachricht nachricht)
    {
        // Verarbeitung...
        return Ok();
    }

    // XML Support (erfordert .AddXmlSerializerFormatters() in Program.cs)
    [HttpPost("xml")]
    [Consumes("application/xml")]
    public IActionResult ReceiveXml([FromBody] UebermittlungSchriftgutobjekteNachricht nachricht)
    {
        // Verarbeitung...
        return Ok();
    }
}
```
Ein vollständiges Beispiel finden Sie im [**example-api Projekt**](https://github.com/l-pagel/X.Justiz.Core/tree/main/dotnet/example-api/Controllers/XJustizCoreController.cs).

---

## Dateien lesen und schreiben
Das SDK unterstützt die Deserialisierung direkt aus Dateien.

### Aus JSON lesen
```csharp
var jsonString = File.ReadAllText("akte.json");
var nachricht = JsonSerializer.Deserialize<UebermittlungSchriftgutobjekteNachricht>(jsonString, new JsonSerializerOptions 
{ 
    PropertyNameCaseInsensitive = true 
});
```

### Aus XML lesen
```csharp
var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
using var stream = File.OpenRead("akte.xml");
var nachricht = (UebermittlungSchriftgutobjekteNachricht?)serializer.Deserialize(stream);
```

---

## Main Utilities (Werkzeuge)

### Compatibility Checker
Prüft, mit welchen X.Justiz- oder X.Justiz Core Versionen eine Instanz des Modells kompatibel ist (basierend auf verwendeten Feldern und Attributen).

```csharp
using xjustiz.core_dotnet.Util.Versioning;

var compatibility = CompatibilityChecker.Check(nachricht);
Console.WriteLine($"Kompatibel mit Core: {string.Join(", ", compatibility.CompatibleXJustizCoreVersions)}");
```

### X.Justiz Converter
Konvertiert Nachrichten zwischen verschiedenen Versionen von X.Justiz Core.

```csharp
using xjustiz.core_dotnet.Util.Converter;

var converted = XJustizConverter.Convert(nachricht, XJustizCoreVersion.V0_1_0).Result;
```

### Xml Validator
Validiert XML-Dateien gegen die offiziellen XSD-Schemata von X.Justiz. Das SDK liefert die Schemata im Archiv mit.

```csharp
using xjustiz.core_dotnet.Util;

var errors = await XmlValidator.ValidateAsync("pfad/zur/datei.xml", XJustizVersion.V3_5_1);
if (errors.Any()) { /* Fehlerbehandlung */ }
```

### Zipper
Erstellt X.Justiz-konforme ZIP-Archive, die sowohl die XML-Nachricht als auch die physischen Dokumentanhänge enthalten.

```csharp
using xjustiz.core_dotnet.Util;

var attachments = new List<string> { "dokument1.pdf", "anhang.jpg" };
await Zipper.ArchiveToZipFileAsync(nachricht, "export.zip", attachments);
```

---
*Weiterführende Beispiele finden Sie im [/dotnet/example-api](https://github.com/l-pagel/X.Justiz.Core/tree/main/dotnet/example-api) Ordner.*
