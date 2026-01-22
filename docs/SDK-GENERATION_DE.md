# SDK-Generierungs-Workflow

> [!TIP]  
> **🌐 [English version available here](SDK-GENERATION.md) 👈**

Dieses Dokument erklärt, wie die Konsistenz der SDKs über verschiedene Programmiersprachen hinweg in diesem Open-Source-Projekt gewahrt wird.

## Übersicht

Das **.NET-Projekt** ist die **„Single Source of Truth“** (einzige Quelle der Wahrheit) für alle Modelle. Die Modelle des Java-SDKs werden manuell gepflegt und gegen das generierte JSON-Schema geprüft, um Parität sicherzustellen.

```
.NET Models → JSON Schema
                    ↓
         Parity Tests prüfen Java-Übereinstimmung
```

## Funktionsweise

### 1. Schema-Generierung

Wenn sich .NET-Modelle ändern, generiert das `XsdGenerator`-Projekt folgendes neu:
- XSD-Dateien (für XML-Validierung)
- JSON-Schema (`schemas/xjustiz-core.schema.json`)

### 2. Java SDK

Die Java-Modelle werden manuell in `java/src/main/java/de/xjustiz/core/models/` erstellt.

Automatisierte Paritätstests überprüfen, ob die Java-Modelle:
- Für alle Core-Typen existieren
- Eigenschaften besitzen, die dem JSON-Schema entsprechen
- Korrekte Jackson-Annotationen verwenden

### 3. Paritätsprüfung

Die Pipeline führt aus:
- **Java `SchemaParityTest`** – Prüft, ob Java-Modelle dem Schema entsprechen
- **Build & Test** – Stellt sicher, dass aller Java-Code kompiliert und Tests bestehen

Wird eine Abweichung gefunden, schlägt die Pipeline **fehl**.

## Für Mitwirkende

### Ändern von .NET-Modellen

1. Ändern Sie die .NET-Modelle in `dotnet/src/xjustiz.core-dotnet/Models/`
2. Pushen Sie Ihre Änderungen
3. Die Pipeline generiert das JSON-Schema neu
4. **Aktualisieren Sie manuell** die entsprechenden Java-Modelle bei Bedarf
5. Paritätstests werden fehlschlagen, wenn die Java-Modelle nicht übereinstimmen

### Synchronisieren der Java-Modelle von .NET

Verwenden Sie das Synchronisierungsskript, um Java-Modelle automatisch basierend auf .NET-Modellen zu aktualisieren:

```powershell
python scripts/sync-java-models.py
```

Das Skript wird:
- Alle C#-Modelldateien in `dotnet/src/xjustiz.core-dotnet/Models/Entities/` parsen
- Entsprechende Java-Klassen mit korrekten Annotationen generieren
- Berichten, was erstellt, aktualisiert oder unverändert geblieben ist

### Lokales Ausführen der Paritätstests

```bash
# Java Paritätstests (via Gradle)
cd java && gradle test --tests "*SchemaParityTest*"
```

## Verzeichnisstruktur

```
X.Justiz.Core/
├── dotnet/src/xjustiz.core-dotnet/     # Source of Truth
│   └── Models/                          # .NET Modelle (hier bearbeiten)
├── schemas/
│   └── xjustiz-core.schema.json        # Generiert aus .NET
├── java/src/main/java/de/xjustiz/core/
│   ├── models/                          # Java Modelle (synchronisiert von .NET)
│   └── serialization/                   # Handgeschriebene Hilfsprogramme
└── scripts/
    └── sync-java-models.py              # Synchronisiert Java-Modelle von .NET
```

---

## Siehe auch

- **[README](../README_DE.md)** - Projektübersicht
- **[Spezifikation](Specification_DE.md)** - Vollständige Datenmodell-Spezifikation
- **[.NET SDK](../dotnet/README_DE.md)** - .NET SDK Dokumentation
- **[Java SDK](../java/README_DE.md)** - Java SDK Dokumentation
- **[Integrationstests](../dotnet/test/xjustiz.core-dotnet.IntegrationTests/README_DE.md)** - Plattformübergreifende Tests
