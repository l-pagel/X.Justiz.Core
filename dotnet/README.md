# X.Justiz Core .NET SDK – Developer Documentation

> **🌐 Deutsche Version hier verfügbar: [README.md](https://github.com/l-pagel/X.Justiz.Core/tree/main/dotnet/README_DE.md) 👈**

This document describes the usage of the X.Justiz Core .NET SDK for software developers.

## Installation
The SDK is provided as a NuGet package. You can install it via the Package Manager Console or the .NET CLI:

```powershell
# .NET CLI
dotnet add package xjustiz.core-dotnet

# Package Manager Console
Install-Package xjustiz.core-dotnet
```
The latest version can be found on [nuget.org](https://www.nuget.org/packages/xjustiz.core-dotnet).

---

## Using the Data Model
The central model for data exchange is the `UebermittlungSchriftgutobjekteNachricht` class. It represents the standardized "envelope" for files and documents.

### Example: Creating a Message
```csharp
using xjustiz.core_dotnet.Models;

var message = new UebermittlungSchriftgutobjekteNachricht
{
    Kopf = new Nachrichtenkopf
    {
        Erstellungszeitpunkt = DateTime.UtcNow,
        EigeneNachrichtenId = Guid.NewGuid().ToString()
    },
    Grunddaten = new Grunddaten
    {
        // Case data, participants etc.
    },
    Schriftgutobjekte = new Schriftgutobjekte
    {
        // Files and documents
    }
};
```

---

## Codes and Code Lists
X.Justiz Core uses a structured system of codes (e.g., for roles, courts, document classes).

*   **X.Justiz Standards:** These are based on official definitions from [XRepository](https://www.xrepository.de/).
*   **X.Justiz Core Extensions:** Specific keys have been added for out-of-court scenarios (e.g., for specialized areas like succession law or tenancy law).
*   **Agnostic Usage:** The SDK abstracts the technical details of code list versioning while providing full control over the `listVersionID`.

The available codes can be found in the `xjustiz.core_dotnet.Models.Codes` namespace.

---

## Usage in Web APIs
The SDK is optimized for use in ASP.NET Core controllers and supports both **XML** and **JSON**.

### Controller Integration
```csharp
[ApiController]
[Route("api/xjustiz")]
public class MyController : ControllerBase
{
    // JSON Support (Standard in ASP.NET Core)
    [HttpPost("json")]
    public IActionResult ReceiveJson(UebermittlungSchriftgutobjekteNachricht message)
    {
        // Processing...
        return Ok();
    }

    // XML Support (requires .AddXmlSerializerFormatters() in Program.cs)
    [HttpPost("xml")]
    [Consumes("application/xml")]
    public IActionResult ReceiveXml([FromBody] UebermittlungSchriftgutobjekteNachricht message)
    {
        // Processing...
        return Ok();
    }
}
```
A complete example can be found in the [**example-api project**](https://github.com/l-pagel/X.Justiz.Core/tree/main/dotnet/example-api/Controllers/XJustizCoreController.cs).

---

## Reading and Writing Files
The SDK supports deserialization directly from files.

### Reading from JSON
```csharp
var jsonString = File.ReadAllText("akte.json");
var message = JsonSerializer.Deserialize<UebermittlungSchriftgutobjekteNachricht>(jsonString, new JsonSerializerOptions 
{ 
    PropertyNameCaseInsensitive = true 
});
```

### Reading from XML
```csharp
var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
using var stream = File.OpenRead("akte.xml");
var message = (UebermittlungSchriftgutobjekteNachricht?)serializer.Deserialize(stream);
```

---

## Main Utilities

### Compatibility Checker
Checks which X.Justiz or X.Justiz Core versions an instance of the model is compatible with (based on used fields and attributes).

```csharp
using xjustiz.core_dotnet.Util.Versioning;

var compatibility = CompatibilityChecker.Check(message);
Console.WriteLine($"Compatible with Core: {string.Join(", ", compatibility.CompatibleXJustizCoreVersions)}");
```

### X.Justiz Converter
Converts messages between different versions of X.Justiz Core.

```csharp
using xjustiz.core_dotnet.Util.Converter;

var converted = XJustizConverter.Convert(message, XJustizCoreVersion.V0_1_0).Result;
```

### Xml Validator
Validates XML files against the official X.Justiz XSD schemas. The SDK includes the schemas in the archive.

```csharp
using xjustiz.core_dotnet.Util;

var errors = await XmlValidator.ValidateAsync("path/to/file.xml", XJustizVersion.V3_5_1);
if (errors.Any()) { /* Error handling */ }
```

### Zipper
Creates X.Justiz-compliant ZIP archives containing both the XML message and the physical document attachments.

```csharp
using xjustiz.core_dotnet.Util;

var attachments = new List<string> { "document1.pdf", "attachment.jpg" };
await Zipper.ArchiveToZipFileAsync(message, "export.zip", attachments);
```

---
*Further examples can be found in the [/dotnet/example-api](https://github.com/l-pagel/X.Justiz.Core/tree/main/dotnet/example-api) folder.*

---

## See Also

- **[📘 Specification for X.Justiz Core](../docs/Specification.md)** - Complete data model documentation
- **[README](../README.md)** - Project overview
- **[Java SDK](../java/README.md)** - Java SDK documentation
- **[Integration Tests](test/xjustiz.core-dotnet.IntegrationTests/README.md)** - Cross-platform compatibility tests
- **[SDK Generation Workflow](../docs/SDK-GENERATION.md)** - How SDKs are kept in sync
- **[Changelog](../docs/Changelog.md)** - Version history
