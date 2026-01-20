# X.Justiz Core - Java SDK

> [!TIP]  
> **🌐 [Deutsche Version hier verfügbar](README_DE.md) 👈**


Java SDK for X.Justiz Core document transmission messages.

## Features

- **XML and JSON Support**: Supports both XML (canonical X.Justiz format) and JSON serialization
- **JAXB Compatible**: Full JAXB annotations for XML interoperability
- **Jackson Integration**: Uses Jackson for both JSON and XML serialization
- **German Property Names**: Uses German property names as defined in the .NET project

## Requirements

- Java 17+
- Gradle 8.5+

## Build

```bash
./gradlew build
```

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

## License

MIT License - see [LICENSE](../LICENSE) for details.
