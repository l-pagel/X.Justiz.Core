# X.Justiz Core - Java SDK

> [!TIP]  
> **🌐 [English version available here](README.md) 👈**

Java SDK für X.Justiz Core Dokumentenübermittlungsnachrichten.

## Funktionen

- **XML- und JSON-Unterstützung**: Unterstützt sowohl XML (kanonisches X.Justiz-Format) als auch JSON-Serialisierung
- **JAXB-Kompatibel**: Vollständige JAXB-Annotationen für XML-Interoperabilität
- **Jackson-Integration**: Verwendet Jackson für sowohl JSON- als auch XML-Serialisierung
- **Deutsche Eigenschaftsnamen**: Verwendet deutsche Eigenschaftsnamen wie im .NET-Projekt definiert

## Anforderungen

- Java 17+
- Gradle 8.5+

## Build

```bash
./gradlew build
```

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

## Lizenz

MIT Lizenz - siehe [LICENSE](../LICENSE) für Details.
