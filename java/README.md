# X.Justiz Core - Java SDK

> [!TIP]  
> **🌐 [Deutsche Version hier verfügbar](README_DE.md) 👈**


Java SDK for X.Justiz Core document transmission messages.

## Features

- **XML and JSON Support**: Supports both XML (canonical X.Justiz format) and JSON serialization
- **JAXB Compatible**: Full JAXB annotations for XML interoperability
- **Jackson Integration**: Uses Jackson for both JSON and XML serialization
- **German Property Names**: Uses German property names as defined in the .NET project

## Installation

The SDK is provided via Maven Central [[Link]](https://central.sonatype.com/artifact/de.xjustizcore.io/xjustiz-core). You can install it via Maven or Gradle:

### Maven

```xml
<dependency>
    <groupId>de.xjustizcore.io</groupId>
    <artifactId>xjustiz-core</artifactId>
    <version>0.3.0</version>
</dependency>
```

### Gradle

```kotlin
implementation("de.xjustizcore.io:xjustiz-core:0.3.0")
```

The latest version can be found on [Maven Central](https://central.sonatype.com/artifact/de.xjustizcore.io/xjustiz-core).

## Requirements

- Java 17+
- Gradle 8.5+

## Build

```bash
./gradlew build
```

## Running Tests

Run all tests with:

```bash
./gradlew test
```

Test reports are generated in `build/reports/tests/test/index.html`.

## Usage

### Basic Serialization

```java
import de.xjustiz.core.models.*;
import de.xjustiz.core.serialization.*;

// Create a message
var message = new UebermittlungSchriftgutobjekteNachricht();
var kopf = new Nachrichtenkopf();
kopf.setVersion("3.5.1");
kopf.setAktenzeichenAbsender(List.of("123 O 456/24"));
message.setKopf(kopf);

// Serialize to JSON
var serializer = XJustizSerializer.builder()
    .format(Format.JSON)
    .build();

String json = serializer.serializePretty(message);
```

### Deserialization

```java
String json = """
    {
        "Kopf": {
            "AktenzeichenAbsender": ["123 O 456/24"]
        }
    }
    """;

var message = serializer.deserialize(json, UebermittlungSchriftgutobjekteNachricht.class);
```

### XML Serialization

```java
var xmlSerializer = XJustizSerializer.createDefault(); // XML is the default
String xml = xmlSerializer.serializePretty(message);
```

## Utility Classes

The SDK includes several utility classes in `de.xjustiz.core.util`:

### XmlValidator

Validates XML files against X.Justiz XSD schemas:

```java
import de.xjustiz.core.util.XmlValidator;
import de.xjustiz.core.util.versioning.XJustizVersion;

List<String> errors = XmlValidator.validate("/path/to/file.xml", XJustizVersion.V3_5_1);
if (errors.isEmpty()) {
    System.out.println("XML is valid");
}
```

### Zipper

Creates XJustiz ZIP archives with XML and attachments:

```java
import de.xjustiz.core.util.Zipper;

// Create ZIP file
Path zipPath = Zipper.archiveToZipFile(message, Path.of("output.zip"), List.of(attachment1, attachment2));

// Or get as byte array
byte[] zipBytes = Zipper.archiveToZipBytes(message, attachments);
```

### Version Compatibility

Check version compatibility of messages:

```java
import de.xjustiz.core.util.versioning.CompatibilityChecker;

var result = CompatibilityChecker.check(message);
System.out.println("Compatible X.Justiz versions: " + result.getCompatibleXJustizVersions());
System.out.println("Compatible X.Justiz Core versions: " + result.getCompatibleXJustizCoreVersions());
```

### Version Conversion

Convert messages to a specific version:

```java
import de.xjustiz.core.util.converter.XJustizConverter;
import de.xjustiz.core.util.versioning.XJustizVersion;

var conversionResult = XJustizConverter.convert(message, XJustizVersion.V3_4_1);
var convertedMessage = conversionResult.getResult();
if (conversionResult.hasLostData()) {
    System.out.println("Lost data during conversion: " + conversionResult.getLostData());
}
```

## See Also

- **[📘 Specification for X.Justiz Core](../docs/Specification.md)** - Complete data model documentation
- **[README](../README.md)** - Project overview
- **[.NET SDK](../dotnet/README.md)** - .NET SDK documentation
- **[Example API](example-api/README.md)** - Spring Boot example application
- **[SDK Generation Workflow](../docs/SDK-GENERATION.md)** - How SDKs are kept in sync
- **[Changelog](../docs/Changelog.md)** - Version history

## License

MIT License - see [LICENSE](../LICENSE) for details.
