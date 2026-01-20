# X.Justiz Core SDK Cross-Platform Integration Tests

> [!TIP]  
> **🌐 [Deutsche Version hier verfügbar](README_DE.md) 👈**


This project contains integration tests that validate **full compatibility** between the Java and .NET implementations of the X.Justiz Core SDK. The tests ensure that data serialized by one SDK can be correctly deserialized by the other, with no data loss or mapping errors.

## 🎯 Purpose

These tests ensure that:
1. **Data serialized by the Java SDK can be correctly deserialized by the .NET SDK** (and vice versa)
2. **All fields and properties are correctly mapped** between the two implementations
3. **No data is lost** during cross-platform communication
4. **Both JSON and XML formats** work correctly across SDKs

---

## 📋 Prerequisites

Before running the integration tests, ensure you have the following installed:

### Required Software

| Software | Minimum Version | How to Check | Download |
|----------|----------------|--------------|----------|
| **.NET SDK** | 8.0 or later | `dotnet --version` | [Download .NET](https://dotnet.microsoft.com/download) |
| **Java JDK** | 17 or later | `java -version` | [Download OpenJDK](https://adoptium.net/) |
| **Gradle** | (included via wrapper) | N/A | Included |

### Environment Setup

#### Windows

1. **Install .NET 8.0 SDK**
   ```powershell
   # Verify installation
   dotnet --version
   # Should output: 8.0.x or higher
   ```

2. **Install Java 17+**
   - Download from [Adoptium](https://adoptium.net/) or use your preferred distribution
   - Set `JAVA_HOME` environment variable:
   ```powershell
   # Check if JAVA_HOME is set
   echo $env:JAVA_HOME
   
   # If not set, add to your system environment variables:
   # JAVA_HOME = C:\Program Files\Eclipse Adoptium\jdk-17.x.x-hotspot (or your Java path)
   
   # Verify Java is accessible
   java -version
   # Should output: openjdk version "17.x.x" or higher
   ```

3. **Verify ports are available**
   - Port `5050` - Used by .NET API
   - Port `8080` - Used by Java API
   ```powershell
   # Check if ports are in use
   netstat -ano | findstr :5050
   netstat -ano | findstr :8080
   # If no output, ports are available
   ```

#### Linux/macOS

1. **Install .NET 8.0 SDK**
   ```bash
   # Verify installation
   dotnet --version
   ```

2. **Install Java 17+**
   ```bash
   # Verify installation
   java -version
   
   # Ensure JAVA_HOME is set
   echo $JAVA_HOME
   ```

3. **Make Gradle wrapper executable** (if needed)
   ```bash
   chmod +x java/gradlew
   ```

---

## 🚀 Running the Tests

### From Command Line

```bash
# Navigate to the integration tests directory
cd dotnet/test/xjustiz.core-dotnet.IntegrationTests

# Run all integration tests
dotnet test

# Run with detailed output
dotnet test --logger "console;verbosity=detailed"

# Run specific test category
dotnet test --filter "FullyQualifiedName~JavaToDotNet"
dotnet test --filter "FullyQualifiedName~DotNetToJava"
dotnet test --filter "FullyQualifiedName~FullRoundTrip"
```

### From Visual Studio

1. Open the solution in Visual Studio 2022+
2. Build the solution (`Ctrl+Shift+B`)
3. Open Test Explorer (`Test → Test Explorer` or `Ctrl+E, T`)
4. Run the integration tests

### From VS Code

1. Open the workspace in VS Code
2. Install the C# Dev Kit extension
3. Open the Testing panel
4. Run the integration tests

---

## 📊 Test Scenarios

### 1. Java → .NET Data Transfer
| Test | Description |
|------|-------------|
| `JavaToDotNet_HttpJson` | Java API serializes JSON, .NET API deserializes |
| `JavaToDotNet_HttpXml` | Java API serializes XML, .NET API deserializes |
| `JavaToDotNet_JsonFile` | JSON file from Java API uploaded to .NET API |
| `JavaToDotNet_XmlFile` | XML file from Java API uploaded to .NET API |

### 2. .NET → Java Data Transfer
| Test | Description |
|------|-------------|
| `DotNetToJava_HttpJson` | .NET API serializes JSON, Java API deserializes |
| `DotNetToJava_HttpXml` | .NET API serializes XML, Java API deserializes |
| `DotNetToJava_JsonFile` | JSON file from .NET API uploaded to Java API |
| `DotNetToJava_XmlFile` | XML file from .NET API uploaded to Java API |

### 3. Full Round-Trip Tests
| Test | Description |
|------|-------------|
| `FullRoundTrip_JavaDotNetJava` | Java → .NET → Java (verify data stability) |
| `FullRoundTrip_DotNetJavaDotNet` | .NET → Java → .NET (verify data stability) |
| `MixedFormat_JsonToXmlToJson` | Cross-format conversion testing |
| `StressTest_MultipleRoundTrips` | 5 complete round-trips stability test |

### Test Datasets
All tests run against these example datasets from `/example-datasets/`:
- `arbeitsrecht` - Labor law case
- `erbrecht` - Inheritance law case
- `fluggastrecht` - Airline passenger rights case
- `mietrecht` - Tenancy law case

---

## 🏗 Architecture

```
xjustiz.core-dotnet.IntegrationTests/
├── Infrastructure/
│   ├── ApiProcessManager.cs    # Manages API lifecycle with robust error handling
│   ├── CrossApiClient.cs       # HTTP client for JSON/XML communication
│   ├── MessageComparer.cs      # Deep comparison utility for validation
│   └── TestDataProvider.cs     # Loads test datasets
├── IntegrationTestFixture.cs   # xUnit test fixture (shared across tests)
├── JavaToDotNetCompatibilityTests.cs
├── DotNetToJavaCompatibilityTests.cs
├── FullRoundTripCompatibilityTests.cs
└── README.md
```

### How It Works

1. **Test Fixture Initialization**
   - Validates environment (Java, .NET, ports, files)
   - Starts .NET API on port 5050
   - Starts Java API on port 8080
   - Waits for both APIs to become healthy

2. **Test Execution**
   - Loads test data from example datasets
   - Sends data between APIs using HTTP
   - Compares original and received data
   - Reports any differences

3. **Cleanup**
   - Stops both API processes
   - Releases all resources

---

## 🔧 Troubleshooting

### Common Issues

#### ❌ "Java not found" or "JAVA_HOME not set"

**Solution:**
1. Install Java 17+ from [Adoptium](https://adoptium.net/)
2. Set JAVA_HOME:
   - **Windows:** System Properties → Environment Variables → Add `JAVA_HOME`
   - **Linux/Mac:** Add to `~/.bashrc` or `~/.zshrc`:
     ```bash
     export JAVA_HOME=/path/to/java
     export PATH=$JAVA_HOME/bin:$PATH
     ```

#### ❌ "Port 5050 (or 8080) is already in use"

**Solution:**
Find and stop the process using the port:
```powershell
# Windows - find process
netstat -ano | findstr :5050
# Kill process by PID
taskkill /PID <PID> /F
```
```bash
# Linux/Mac - find and kill
lsof -i :5050
kill -9 <PID>
```

#### ❌ "Gradle wrapper not found" (gradlew.bat)

**Solution:**
The Gradle wrapper should be in `/java/gradlew.bat`. If missing:
```bash
cd java
gradle wrapper --gradle-version 8.5
```

#### ❌ Tests timeout waiting for APIs

**Possible causes:**
1. **First run:** Gradle downloads dependencies (can take several minutes)
2. **Slow machine:** Increase `StartupTimeoutSeconds` in `ApiProcessManager.cs`
3. **Build errors:** Check the test output for compilation errors

**Solution:**
Try running the APIs manually first:
```powershell
# Terminal 1 - Start .NET API
cd dotnet/example-api
dotnet run --urls http://localhost:5050

# Terminal 2 - Start Java API  
cd java
./gradlew :example-api:bootRun
```

#### ❌ Data comparison failures

The test output will show exactly which fields differ. Common causes:
- **DateTime precision:** Handled automatically (1-second tolerance)
- **Null vs empty collections:** May need to update `MessageComparer.cs`
- **Property name differences:** Check JSON annotations in both SDKs

---

## 🔄 Manual API Testing

If you want to test the APIs manually:

### Start APIs

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

### Test Endpoints

Both APIs expose the same endpoints:
- `POST /XJustizCore/json` - Accept JSON message
- `POST /XJustizCore/xml` - Accept XML message
- `POST /XJustizCore/json-file` - Accept JSON file upload
- `POST /XJustizCore/xml-file` - Accept XML file upload
- `POST /XJustizCore/json/generate-file` - Generate JSON output
- `POST /XJustizCore/xml/generate-file` - Generate XML output

---

## 📝 Adding New Tests

1. Create a new test class in the project
2. Add `[Collection("Integration Tests")]` attribute
3. Inject `IntegrationTestFixture` via constructor:
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
           // Use fixture.Client for API calls
           // Use fixture.Comparer for data validation
       }
   }
   ```

---

## 📄 License

This project is part of the X.Justiz Core SDK and is licensed under MIT.
