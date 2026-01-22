# X.Justiz Core - Java SDK

> [!TIP]  
> **🌐 [English version available here](README.md) 👈**

Java SDK für X.Justiz Core Dokumentenübermittlungsnachrichten.

## Funktionen

- **XML- und JSON-Unterstützung**: Unterstützt sowohl XML (kanonisches X.Justiz-Format) als auch JSON-Serialisierung
- **JAXB-Kompatibel**: Vollständige JAXB-Annotationen für XML-Interoperabilität
- **Jackson-Integration**: Verwendet Jackson für sowohl JSON- als auch XML-Serialisierung
- **Deutsche Eigenschaftsnamen**: Verwendet deutsche Eigenschaftsnamen wie im .NET-Projekt definiert

## Installation

Das SDK wird über Maven Central bereitgestellt [[Link]](https://central.sonatype.com/artifact/de.xjustizcore.io/xjustiz-core). Sie können es über Maven oder Gradle installieren:

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

Die aktuellste Version finden Sie auf [Maven Central](https://central.sonatype.com/artifact/de.xjustizcore.io/xjustiz-core).

## Anforderungen

- Java 17+
- Gradle 8.5+

## Build

```bash
./gradlew build
```

## Tests ausführen

Alle Tests ausführen mit:

```bash
./gradlew test
```

Testberichte werden in `build/reports/tests/test/index.html` generiert.

## Verwendung

### Einfache Serialisierung

```java
import de.xjustiz.core.models.*;
import de.xjustiz.core.serialization.*;

// Erstellen einer Nachricht
var message = new UebermittlungSchriftgutobjekteNachricht();
var kopf = new Nachrichtenkopf();
kopf.setVersion("3.5.1");
kopf.setAktenzeichenAbsender(List.of("123 O 456/24"));
message.setKopf(kopf);

// Serialisieren zu JSON
var serializer = XJustizSerializer.builder()
    .format(Format.JSON)
    .build();

String json = serializer.serializePretty(message);
```

### Deserialisierung

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

### XML Serialisierung

```java
var xmlSerializer = XJustizSerializer.createDefault(); // XML ist der Standard
String xml = xmlSerializer.serializePretty(message);
```

## Hilfsklassen

Das SDK enthält verschiedene Hilfsklassen in `de.xjustiz.core.util`:

### XmlValidator

Validiert XML-Dateien gegen X.Justiz XSD-Schemata:

```java
import de.xjustiz.core.util.XmlValidator;
import de.xjustiz.core.util.versioning.XJustizVersion;

List<String> errors = XmlValidator.validate("/pfad/zur/datei.xml", XJustizVersion.V3_5_1);
if (errors.isEmpty()) {
    System.out.println("XML ist gültig");
}
```

### Zipper

Erstellt XJustiz-ZIP-Archive mit XML und Anhängen:

```java
import de.xjustiz.core.util.Zipper;

// ZIP-Datei erstellen
Path zipPath = Zipper.archiveToZipFile(message, Path.of("ausgabe.zip"), List.of(anhang1, anhang2));

// Oder als Byte-Array erhalten
byte[] zipBytes = Zipper.archiveToZipBytes(message, anhaenge);
```

### Versionskompatibilität

Prüft die Versionskompatibilität von Nachrichten:

```java
import de.xjustiz.core.util.versioning.CompatibilityChecker;

var result = CompatibilityChecker.check(message);
System.out.println("Kompatible X.Justiz-Versionen: " + result.getCompatibleXJustizVersions());
System.out.println("Kompatible X.Justiz Core-Versionen: " + result.getCompatibleXJustizCoreVersions());
```

### Versionskonvertierung

Konvertiert Nachrichten in eine bestimmte Version:

```java
import de.xjustiz.core.util.converter.XJustizConverter;
import de.xjustiz.core.util.versioning.XJustizVersion;

var conversionResult = XJustizConverter.convert(message, XJustizVersion.V3_4_1);
var convertedMessage = conversionResult.getResult();
if (conversionResult.hasLostData()) {
    System.out.println("Während der Konvertierung verlorene Daten: " + conversionResult.getLostData());
}
```

## Lizenz

MIT Lizenz - siehe [LICENSE](../LICENSE) für Details.
