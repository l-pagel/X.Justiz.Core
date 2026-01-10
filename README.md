# X.Justiz Core [TL;DR]

> [!TIP]  
> **🌐 [Deutsche Version hier verfügbar](README_DE.md) 👈**

X.Justiz Core is a lightweight schema for data exchange between software solutions in the legal ecosystem. It is based on the established X.Justiz standard and optimizes it for out-of-court communication and modern LegalTech scenarios.

## Table of Contents
- [Background](#background)
- [Motivation](#motivation)
- [Goals & Benefits](#goals--benefits)
- [Implementation (SDKs)](#implementation-sdks)
- [Specification & Documentation](#specification--documentation)

## Background
The "Arbeitsgruppe Schnittstellen" (Interfaces Working Group) of the [**LegalTech Verband Deutschland**](https://www.legaltechverband.de/) developed this standard in 2024 to make the exchange of legal matters (files) more efficient.

The official [**X.Justiz standard**](https://xjustiz.justiz.de/) serves as the basis, as it is the established benchmark for electronic legal transactions (ERV) in Germany and is maintained by the Federal-State Commission (BLK-AG IT-Standards).

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

## Implementation (SDKs)
To accelerate integration, the project provides software libraries.
They include:
- [Class library](/dotnet/src/xjustiz.core-dotnet/Models/)
- [Utility tools](/dotnet/src/xjustiz.core-dotnet/Util)
- [Code lists (X.Justiz & X.Justiz Core)](/dotnet/src/xjustiz.core-dotnet/Models/Codes)

The SDKs are available in the following languages:
-   ✅ [**.NET Code**](/dotnet) | [**nuget Package**](https://www.nuget.org/packages/xjustiz.core-dotnet) | [**Getting Started**](/dotnet/README.md)
-   ⏳ **Java (Spring)** (In progress)
-   ⏳ **JavaScript / TypeScript** (In progress)
-   ⏳ **Python** (In progress)

## Specification & Documentation

### X.Justiz Core
- [Specification](Specification.md)
- [Validation rules as XSD](/X.Justiz-Core-Versions)
- [Example datasets](/example-datasets)
- [Lists of used codes](/dotnet/src/xjustiz.core-dotnet/Models/Codes)
- [Changelog (DE)](/Changelog_DE.md), [Changelog (EN)](/Changelog.md)
- [License](LICENSE)

### X.Justiz
- [Archive of all X.Justiz versions and specifications](/X.Justiz-Versions)

### Quality Assurance
The project is regularly checked for quality. You can find the current status on SonarCloud:  
[![Quality Gate][badge-url]][link-url]

[badge-url]: https://sonarcloud.io/api/project_badges/quality_gate?project=l-pagel_X.Justiz.Core&token=63adaa7af33ae168a0611157ea45aaa0db36852f
[link-url]: https://sonarcloud.io/summary/new_code?id=l-pagel_X.Justiz.Core
