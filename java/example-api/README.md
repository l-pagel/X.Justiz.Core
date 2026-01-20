# X.Justiz Core Java Example API

This project demonstrates the usage of the X.Justiz Core Java library in a Spring Boot application, mirroring the functionality of the .NET example API.

## Endpoints

The API provides endpoints to:
- Check compatibility of X.Justiz messages (JSON/XML).
- Generate sample files (JSON/XML).
- Convert messages between versions.

Access the OpenAPI UI at: `http://localhost:8080/swagger-ui.html`

## Limitations

The underlying Java library currently lacks the versioning metadata (`@XJustizAvailability` annotations) that exists in the .NET library.
Therefore, the `CompatibilityChecker` and `XJustizConverter` in this project are currently **stubs** and do not perform actual validation or conversion logic. They pass through the data as-is or return "All Compatible".

## Running the Project

Run the application using Gradle from the `java` root directory:

```bash
./gradlew :example-api:bootRun
```
