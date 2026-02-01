# X.Justiz Core

> [!TIP]  
> **🌐 [Deutsche Version hier verfügbar](README_DE.md) 👈**

[![NuGet](https://img.shields.io/nuget/v/xjustiz.core-dotnet)](https://www.nuget.org/packages/xjustiz.core-dotnet)
[![Maven Central](https://img.shields.io/maven-central/v/de.xjustizcore.io/xjustiz-core)](https://central.sonatype.com/artifact/de.xjustizcore.io/xjustiz-core)  
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=l-pagel_X.Justiz.Core&metric=bugs)](https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core) [![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=l-pagel_X.Justiz.Core&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core) [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=l-pagel_X.Justiz.Core&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=l-pagel_X.Justiz.Core&metric=coverage)](https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core) [![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=l-pagel_X.Justiz.Core&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core)

X.Justiz Core is a lightweight schema for data exchange between software solutions in the legal ecosystem. It is based on the established X.Justiz standard and optimizes it for out-of-court communication and modern LegalTech scenarios.

## Table of Contents
- [Background](#background)
- [Motivation](#motivation)
- [Goals & Benefits](#goals--benefits)
- [X.Justiz Compatibility](#xjustiz-compatibility)
- [Key Features & Improvements](#key-features--improvements)
- [Usage of Codes](#usage-of-codes)
- [Implementation (SDKs)](#implementation-sdks)
- [Specification](#specification)
- [Sample Data](#sample-data)
- [Developer Resources](#developer-resources)

> [!NOTE]  
> **📘 Looking for technical details?**  
> Jump directly to the **[Specification for X.Justiz Core](/docs/Specification.md)** for data model documentation, code examples, and best practices.

## Background
The "Arbeitsgruppe Schnittstellen" (Interfaces Working Group) of the [**LegalTech Verband Deutschland**](https://www.legaltechverband.de/) developed this standard in 2024 to make the exchange of legal matters (files) more efficient.

The official [**X.Justiz standard**](https://xjustiz.justiz.de/) serves as the basis, as it is the established benchmark for electronic legal transactions (ERV) in Germany and is maintained by the Federal-State Commission (BLK-AG IT-Standards).

> [!IMPORTANT]  
>We want to hear from you! Whether you have questions, suggestions, bug-reports or want to contribute, we welcome engagement from everyone. Please join our discussions:
> 👉 **[GitHub Discussions](https://github.com/l-pagel/X.Justiz.Core/discussions)**

## Motivation
The classic X.Justiz standard is feature-rich but often too complex for rapid exchange between private market participants. X.Justiz Core addresses the following points:

*   **Reduced Complexity:** Limitation to a practice-relevant subset to avoid "noise" in data exchange.
*   **Modern Technology:** Support for document transfers via pre-signed URLs and format agnosticism (optimized for JSON and XML).
*   **Accessibility:** Bilingual documentation (German/English) for international development teams.
*   **Extension:** Introduction of new keys for legal matters (e.g., succession law, traffic law, tenancy law).
*   **Flexibility:** Flexible transmission of information for which no specific keys currently exist in X.Justiz.

## Goals & Benefits
The goal of X.Justiz Core is efficient interoperability:
*   **Efficiency:** Reduction of effort for individual interfaces between software providers.
*   **Innovation:** Rapid connection of marketplaces and specialized LegalTech products.
*   **Practice Orientation:** Specific extensions for common legal areas such as succession law, traffic law, or tenancy law.
*   **Open Source:** Provided free of charge to promote a networked ecosystem.

![X.Justiz Core](./.media/README/xjustizcore-venn_EN.drawio.svg)

With some compatibility trade-offs, X.Justiz Core data can also be used compatibly with older versions (up to 2.1.0).

## Key Features & Improvements
X.Justiz Core acts as a modern bridge between the official standard and the needs of private market participants:

*   **Established Foundation:** Built on the official **X.Justiz standard**, which is mandatory for German legal tech and justice communication.
*   **Optimized Documentation:** Developer-centric documentation in both German and English, reducing onboarding time for international teams.
*   **Ready-to-use SDKs:** Complete class libraries and code list mappings for .NET and Java, eliminating the need for manual XML/JSON parsing.
*   **Extended Code Lists:** Inclusion of proprietary code lists for areas not covered by the standard (e.g., **Insurers (Versicherer)**, **Insurance Types (Versicherungstyp)**).
*   **Independent Document Transfer:** Concept for transferring documents and attachments independently of the main message (e.g., via pre-signed URLs).
*   **Case File Details:** Additional properties to describe the "Sachverhalt" (facts of the case) tailored to legal tech requirements.
*   **Flexible Data Concept:** Enhanced capabilities to transfer generic or domain-specific data using an improved `Feld` / `Feldgruppe` concept.

## Usage of Codes
In X.Justiz Core, business data (such as countries, roles, or courts) are identified via standardized **codes / keys**. This ensures machine-readable uniqueness across system boundaries.

### Origin and Management
Most code lists are provided centrally by [**XRepository**](https://www.xrepository.de/). Each list is identifiable via a unique URI and a specific `versionlistid`. This allows for precise tracking of changes to the catalogs (e.g., new countries or changed role designations). For example:

| Entity | Versionlistid | Source |
| ----- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Country | 2024-08-01 | [XRepository](https://www.xrepository.de/api/xrepository/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat_2024-08-01:technischerBestandteilGenericode) |
| Country | 2023-02-24 | [XRepository](https://www.xrepository.de/api/xrepository/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat_2023-02-24:technischerBestandteilGenericode) |
| ...   | ...        | ...    |

### Application in Data Exchange
In some code lists, there are multiple definitions for individual codes. For instance, in the "Country" code list, the entry for "Germany" has the following values:

| Property | Value |
| --- | --- |
| **Key (Country)** | 000 |
| **Search term** | Deutschland |
| **Short name** | Deutschland |
| **Full name** | die Bundesrepublik Deutschland |
| **Nationality** | deutsch |
| **ISO-Alpha-3** | DEU |
| **ISO-Alpha-2** | DE |

Although the technical code (e.g., `000` for Germany) should primarily be used, X.Justiz also allows the use of alternative representations (e.g., `Deutschland`, `DE`, `DEU`, etc.). X.Justiz Core supports receiving / reading these alternative representations and can map them intelligently to ensure maximum flexibility during implementation.

We still recommend using the codes (e.g., `000` for Germany) primarily. The SDKs automatically use the technical codes when sending / writing data.

To facilitate development, we have integrated all relevant catalogs directly into our SDKs. Today, there are 3,397 codes in 26 different version lists across 8 main code types (Country, Role, Court, Document Class, etc.).

### X.Justiz Core Extensions
In addition to the standard X.Justiz catalogs, we have created **proprietary code lists** to support modern LegalTech scenarios where the standard lacks specific keys. This includes:
- **[Insurers (Versicherer)](/docs/codes/versicherer/)**: A comprehensive list of insurers (BaFin-based).
- **[Insurance Types (Versicherungstyp)](/docs/codes/versicherungstyp/)**: Definitions for different types of insurance coverage.

These lists are fully integrated into the SDKs as strongly-typed enums. For a complete list of available codes and their usage, please refer to the **[Data Model Reference in the Specification](/docs/Specification.md#4-data-model-reference)**.

We have placed special emphasis on developer efficiency: The SDKs include comprehensive class libraries for these codes, optimized with **German and English translations** directly in the source code. This makes development super fast, as modern IDEs will show documentation and meanings in both languages via IntelliSense.

## Implementation (SDKs)
To accelerate integration, the project provides software libraries.
They include:
- [Class library](/sdk/dotnet/src/xjustiz.core-dotnet/Models/)
- [Utility tools](/sdk/dotnet/src/xjustiz.core-dotnet/Util)
- [Code lists (X.Justiz & X.Justiz Core)](/sdk/dotnet/src/xjustiz.core-dotnet/Models/Codes)

The SDKs are available in the following languages:
-   ✅ [**.NET Code**](/sdk/dotnet) | [**nuget Package**](https://www.nuget.org/packages/xjustiz.core-dotnet) | [**Getting Started**](/sdk/dotnet/README.md)
-   ✅ [**Java**](/sdk/java) | [**Maven Package**](https://central.sonatype.com/artifact/de.xjustizcore.io/xjustiz-core) | [**Getting Started**](/sdk/java/README.md)
-   ⏳ **JavaScript / TypeScript** (In progress)
-   ⏳ **Python** (In progress)

## Specification

### X.Justiz Core
- [Specification for X.Justiz Core](/docs/Specification.md) - Comprehensive data model documentation
- [Validation rules as XSD](/schemas)
- [Lists of used codes](/sdk/dotnet/src/xjustiz.core-dotnet/Models/Codes)
- [Changelog](/docs/Changelog.md)
- [License](LICENSE)

### X.Justiz
- [Archive of all X.Justiz versions and specifications](/xjustiz-xsd)

## Sample Data

Comprehensive test data and scenarios are available to help you test your implementation:  
[**Browse Sample Data**](/sdk/test-data)

Includes examples for:
- Labor Law (Arbeitsrecht)
- Inheritance Law (Erbrecht)
- Traffic Law (Verkehrsrecht)
- Tenancy Law (Mietrecht)
- And more...

## Developer Resources
- [**🔧 SDK Generation Workflow**](/docs/SDK-GENERATION.md) - How cross-SDK consistency is maintained
- [**🧪 Integration Tests**](/sdk/dotnet/test/xjustiz.core-dotnet.IntegrationTests/README.md) - Cross-platform compatibility testing
