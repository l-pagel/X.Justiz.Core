# X.Justiz Core SDK Plattformübergreifende Integrationstests

> [!TIP]  
> **🌐 [English version available here](README.md) 👈**

Dieses Projekt enthält Integrationstests, die die **vollständige Kompatibilität** zwischen den Java- und .NET-Implementierungen des X.Justiz Core SDKs validieren. Die Tests stellen sicher, dass Daten, die von einem SDK serialisiert wurden, vom anderen korrekt deserialisiert werden können, ohne Datenverlust oder Mapping-Fehler.

## 🎯 Zweck

Diese Tests stellen sicher, dass:
1. **Daten, die vom Java SDK serialisiert wurden, vom .NET SDK korrekt deserialisiert werden können** (und umgekehrt)
2. **Alle Felder und Eigenschaften korrekt zugeordnet sind** zwischen den beiden Implementierungen
3. **Keine Daten verloren gehen** während der plattformübergreifenden Kommunikation
4. **Sowohl JSON- als auch XML-Formate** über SDKs hinweg korrekt funktionieren

---

## 📋 Voraussetzungen

Bevor Sie die Integrationstests ausführen, stellen Sie sicher, dass Sie Folgendes installiert haben:

### Erforderliche Software

| Software | Mindestversion | Prüfung | Download |
|----------|----------------|--------------|----------|
| **.NET SDK** | 8.0 oder neuer | `dotnet --version` | [.NET herunterladen](https://dotnet.microsoft.com/download) |
| **Java JDK** | 17 oder neuer | `java -version` | [OpenJDK herunterladen](https://adoptium.net/) |
| **Gradle** | (enthalten via Wrapper) | N/A | Enthalten |

### Umgebungseinrichtung

#### Windows

1. **Installieren Sie das .NET 8.0 SDK**
   ```powershell
   # Installation überprüfen
   dotnet --version
   # Sollte ausgeben: 8.0.x oder höher
   ```

2. **Installieren Sie Java 17+**
   - Laden Sie es von [Adoptium](https://adoptium.net/) herunter oder verwenden Sie Ihre bevorzugte Distribution
   - Setzen Sie die `JAVA_HOME` Umgebungsvariable:
   ```powershell
   # Prüfen, ob JAVA_HOME gesetzt ist
   echo $env:JAVA_HOME
   
   # Falls nicht gesetzt, fügen Sie es zu Ihren Systemumgebungsvariablen hinzu:
   # JAVA_HOME = C:\Program Files\Eclipse Adoptium\jdk-17.x.x-hotspot (oder Ihr Java-Pfad)
   
   # Prüfen, ob Java zugreifbar ist
   java -version
   # Sollte ausgeben: openjdk version "17.x.x" oder höher
   ```

3. **Überprüfen Sie, ob die Ports verfügbar sind**
   - Port `5050` – Verwendet von der .NET API
   - Port `8080` – Verwendet von der Java API
   ```powershell
   # Prüfen, ob Ports belegt sind
   netstat -ano | findstr :5050
   netstat -ano | findstr :8080
   # Wenn keine Ausgabe erfolgt, sind die Ports verfügbar
   ```

#### Linux/macOS

1. **Installieren Sie das .NET 8.0 SDK**
   ```bash
   # Installation überprüfen
   dotnet --version
   ```

2. **Installieren Sie Java 17+**
   ```bash
   # Installation überprüfen
   java -version
   
   # Sicherstellen, dass JAVA_HOME gesetzt ist
   echo $JAVA_HOME
   ```

3. **Machen Sie den Gradle-Wrapper ausführbar** (falls erforderlich)
   ```bash
   chmod +x java/gradlew
   ```

---

## 🚀 Ausführen der Tests

### Über die Kommandozeile

```bash
# Navigieren Sie zum Verzeichnis der Integrationstests
cd dotnet/test/xjustiz.core-dotnet.IntegrationTests

# Alle Integrationstests ausführen
dotnet test

# Mit detaillierter Ausgabe ausführen
dotnet test --logger "console;verbosity=detailed"

# Bestimmte Testkategorie ausführen
dotnet test --filter "FullyQualifiedName~JavaToDotNet"
dotnet test --filter "FullyQualifiedName~DotNetToJava"
dotnet test --filter "FullyQualifiedName~FullRoundTrip"
```

### Über Visual Studio

1. Öffnen Sie die Projektmappe in Visual Studio 2022+
2. Erstellen Sie die Projektmappe (`Strg+Shift+B`)
3. Öffnen Sie den Test-Explorer (`Test → Test-Explorer` oder `Strg+E, T`)
4. Führen Sie die Integrationstests aus

### Über VS Code

1. Öffnen Sie den Workspace in VS Code
2. Installieren Sie die C# Dev Kit Erweiterung
3. Öffnen Sie das Testing-Panel
4. Führen Sie die Integrationstests aus

---

## 📊 Testszenarien

### 1. Java → .NET Datenübertragung
| Test | Beschreibung |
|------|-------------|
| `JavaToDotNet_HttpJson` | Java API serialisiert JSON, .NET API deserialisiert |
| `JavaToDotNet_HttpXml` | Java API serialisiert XML, .NET API deserialisiert |
| `JavaToDotNet_JsonFile` | JSON-Datei von Java API hochgeladen an .NET API |
| `JavaToDotNet_XmlFile` | XML-Datei von Java API hochgeladen an .NET API |

### 2. .NET → Java Datenübertragung
| Test | Beschreibung |
|------|-------------|
| `DotNetToJava_HttpJson` | .NET API serialisiert JSON, Java API deserialisiert |
| `DotNetToJava_HttpXml` | .NET API serialisiert XML, Java API deserialisiert |
| `DotNetToJava_JsonFile` | JSON-Datei von .NET API hochgeladen an Java API |
| `DotNetToJava_XmlFile` | XML-Datei von .NET API hochgeladen an Java API |

### 3. Full Round-Trip Tests (Vollständiger Kreislauf)
| Test | Beschreibung |
|------|-------------|
| `FullRoundTrip_JavaDotNetJava` | Java → .NET → Java (Datenstabilität prüfen) |
| `FullRoundTrip_DotNetJavaDotNet` | .NET → Java → .NET (Datenstabilität prüfen) |
| `MixedFormat_JsonToXmlToJson` | Formatübergreifende Konvertierungstests |
| `StressTest_MultipleRoundTrips` | Stabilitätstest mit 5 vollständigen Durchläufen |

### Testdatensätze
Alle Tests laufen gegen diese Beispieldatensätze aus `/example-datasets/`:
- `arbeitsrecht` – Arbeitsrechtfall
- `erbrecht` – Erbrechtfall
- `fluggastrecht` – Fluggastrechtfall
- `mietrecht` – Mietrechtfall

---

## 🏗 Architektur

```
xjustiz.core-dotnet.IntegrationTests/
├── Infrastructure/
│   ├── ApiProcessManager.cs    # Verwaltet API-Lebenszyklus mit robuster Fehlerbehandlung
│   ├── CrossApiClient.cs       # HTTP-Client für JSON/XML-Kommunikation
│   ├── MessageComparer.cs      # Utility für tiefen Vergleich zur Validierung
│   └── TestDataProvider.cs     # Lädt Testdatensätze
├── IntegrationTestFixture.cs   # xUnit Test-Fixture (geteilt über Tests)
├── JavaToDotNetCompatibilityTests.cs
├── DotNetToJavaCompatibilityTests.cs
├── FullRoundTripCompatibilityTests.cs
└── README.md
```

### Wie es funktioniert

1. **Test Fixture Initialisierung**
   - Validiert Umgebung (Java, .NET, Ports, Dateien)
   - Startet .NET API auf Port 5050
   - Startet Java API auf Port 8080
   - Wartet, bis beide APIs bereit sind

2. **Testausführung**
   - Lädt Testdaten aus Beispieldatensätzen
   - Sendet Daten zwischen APIs mittels HTTP
   - Vergleicht Original- und empfangene Daten
   - Meldet jegliche Unterschiede

3. **Bereinigung**
   - Stoppt beide API-Prozesse
   - Gibt alle Ressourcen frei

---

## 🔧 Fehlerbehebung

### Häufige Probleme

#### ❌ "Java not found" oder "JAVA_HOME not set"

**Lösung:**
1. Installieren Sie Java 17+ von [Adoptium](https://adoptium.net/)
2. Setzen Sie JAVA_HOME:
   - **Windows:** Systemeigenschaften → Umgebungsvariablen → Hinzufügen `JAVA_HOME`
   - **Linux/Mac:** Hinzufügen zu `~/.bashrc` oder `~/.zshrc`:
     ```bash
     export JAVA_HOME=/path/to/java
     export PATH=$JAVA_HOME/bin:$PATH
     ```

#### ❌ "Port 5050 (or 8080) is already in use"

**Lösung:**
Finden und stoppen Sie den Prozess, der den Port verwendet:
```powershell
# Windows - Prozess finden
netstat -ano | findstr :5050
# Prozess per PID beenden
taskkill /PID <PID> /F
```
```bash
# Linux/Mac - finden und beenden
lsof -i :5050
kill -9 <PID>
```

#### ❌ "Gradle wrapper not found" (gradlew.bat)

**Lösung:**
Der Gradle Wrapper sollte in `/java/gradlew.bat` sein. Wenn er fehlt:
```bash
cd java
gradle wrapper --gradle-version 8.5
```

#### ❌ Tests timeout waiting for APIs

**Mögliche Ursachen:**
1. **Erster Lauf:** Gradle lädt Abhängigkeiten herunter (kann einige Minuten dauern)
2. **Langsamer Rechner:** Erhöhen Sie `StartupTimeoutSeconds` in `ApiProcessManager.cs`
3. **Build-Fehler:** Prüfen Sie die Testausgabe auf Kompilierungsfehler

**Lösung:**
Versuchen Sie, die APIs zuerst manuell auszuführen:
```powershell
# Terminal 1 - Start .NET API
cd dotnet/example-api
dotnet run --urls http://localhost:5050

# Terminal 2 - Start Java API  
cd java
./gradlew :example-api:bootRun
```

#### ❌ Data comparison failures

Die Testausgabe zeigt genau, welche Felder abweichen. Häufige Ursachen:
- **DateTime-Präzision:** Automatisch behandelt (1 Sekunde Toleranz)
- **Null vs leere Collections:** Muss evtl. in `MessageComparer.cs` aktualisiert werden
- **Eigenschaftsnamen-Unterschiede:** Prüfen Sie JSON-Annotationen in beiden SDKs

---

## 🔄 Manuelles API-Testen

Wenn Sie die APIs manuell testen möchten:

### APIs starten

```powershell
# Terminal 1 - .NET API
cd dotnet/example-api
dotnet run --urls http://localhost:5050
# Swagger UI: http://localhost:5050/swagger

# Terminal 2 - Java API
cd java
./gradlew :example-api:bootRun
# Swagger UI: http://localhost:8080/swagger-ui.html
```

### Test-Endpunkte

Beide APIs stellen die gleichen Endpunkte bereit:
- `POST /XJustizCore/json` - Akzeptiert JSON-Nachricht
- `POST /XJustizCore/xml` - Akzeptiert XML-Nachricht
- `POST /XJustizCore/json-file` - Akzeptiert JSON-Datei-Upload
- `POST /XJustizCore/xml-file` - Akzeptiert XML-Datei-Upload
- `POST /XJustizCore/json/generate-file` - Generiert JSON-Ausgabe
- `POST /XJustizCore/xml/generate-file` - Generiert XML-Ausgabe

---

## 📝 Hinzufügen neuer Tests

1. Erstellen Sie eine neue Testklasse im Projekt
2. Fügen Sie das Attribut `[Collection("Integration Tests")]` hinzu
3. Injizieren Sie `IntegrationTestFixture` über den Konstruktor:
   ```csharp
   [Collection("Integration Tests")]
   public class MyNewTests
   {
       private readonly IntegrationTestFixture fixture;
       
       public MyNewTests(IntegrationTestFixture fixture)
       {
           this.fixture = fixture;
       }
       
       [Fact]
       public async Task MyTest()
       {
           // Verwenden Sie fixture.Client für API-Aufrufe
           // Verwenden Sie fixture.Comparer für Datenvalidierung
       }
   }
   ```

---

## Siehe auch

- **[📘 Spezifikation für X.Justiz Core](../../../docs/Specification_DE.md)** - Umfassende Datenmodell-Dokumentation
- **[README](../../../README_DE.md)** - Projektübersicht
- **[.NET SDK](../../README_DE.md)** - .NET SDK Dokumentation
- **[Java SDK](../../../java/README_DE.md)** - Java SDK Dokumentation
- **[SDK-Generierungs-Workflow](../../../docs/SDK-GENERATION_DE.md)** - Wie SDKs synchron gehalten werden

## 📄 Lizenz

Dieses Projekt ist Teil des X.Justiz Core SDKs und steht unter der MIT-Lizenz.
