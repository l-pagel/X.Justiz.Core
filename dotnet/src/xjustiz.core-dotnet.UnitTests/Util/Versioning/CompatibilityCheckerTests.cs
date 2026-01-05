namespace xjustiz.core_dotnet.UnitTests.Util.Versioning;

using System;
using System.Collections.Generic;
using System.Linq;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Entities;
using xjustiz.core_dotnet.Util.Versioning;
using Xunit;

public class CompatibilityCheckerTests
{
    [Fact]
    public void Check_ShouldReturnAllVersions_WhenObjectIsEmpty()
    {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        var result = CompatibilityChecker.Check(message);

        // Assert
        Assert.NotEmpty(result.CompatibleXJustizVersions);
        Assert.Contains(result.CompatibleXJustizVersions, v => v >= XJustizVersion.V3_1_1);
        Assert.NotEmpty(result.CompatibleXJustizCoreVersions);
    }

    [Fact]
    public void Check_ShouldRestrictVersions_WhenPropertyIntroducedLaterIsUsed()
    {
        // Arrange
        // AuswahlAktenzeichen introduced in V3_2_1
        var message = new UebermittlungSchriftgutobjekteNachricht
        {
            Schriftgutobjekte = new Schriftgutobjekte
            {
                Akte =
                [
                    new Akte
                    {
                        FachspezifischeDaten = new XjustizAkteFachspezifischeDaten
                        {
                            Aktenzeichen = new Aktenzeichen
                            {
                                 Auswahl = new AuswahlAktenzeichen
                                 {
                                     // Just having the object might trigger the check if the property holding it has attributes?
                                     // Aktenzeichen.Auswahl property has [XJustizAvailability(XJustizVersion.V3_1_1)]
                                     // But the CLASS AuswahlAktenzeichen has [XJustizAvailability(XJustizVersion.V3_2_1)]
                                     // CompatibilityChecker checks class attributes for nested objects too.
                                 },
                            },
                        },
                    },
                ],
            },
        };

        // Act
        var result = CompatibilityChecker.Check(message);

        // Assert
        // Should only contain versions >= V3_2_1
        Assert.All(result.CompatibleXJustizVersions, v => Assert.True(v >= XJustizVersion.V3_2_1));
        Assert.DoesNotContain(XJustizVersion.V3_1_1, result.CompatibleXJustizVersions);
    }

    [Fact]
    public void Check_ShouldRestrictVersions_WhenPropertyRemovedIsUsed()
    {
        // Arrange
        // PropertyWithRemovedUsed introduced in V3_2_1, removed in V3_3_1
        var message = new UebermittlungSchriftgutobjekteNachrichtWithRemovedPropertyInUse
        {
            PropertyWithRemovedUsed = 1,
        };

        // Act
        var result = CompatibilityChecker.Check(message);

        // Assert
        // Should be >= V3_2_1 AND < V3_3_1
        // In our enum, the only version that fits is V3_2_1
        Assert.Single(result.CompatibleXJustizVersions);
        Assert.Equal(XJustizVersion.V3_2_1, result.CompatibleXJustizVersions.First());
    }

    [Fact]
    public void Check_ShouldHandleCoreVersions()
    {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        var result = CompatibilityChecker.Check(message);

        // Assert
        Assert.Contains(XJustizCoreVersion.V1_0_0, result.CompatibleXJustizCoreVersions);
    }

    [Fact]
    public void Check_ShouldReturnCorrectVersions_WhenFullMessageIsProvided()
    {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht
        {
            Kopf = new Nachrichtenkopf
            {
                Version = "3.5.1",
                AktenzeichenAbsender = ["123/45", "XY-987"],
                AktenzeichenEmpfaenger = ["999/11", "ABC-000"],
                Erstellungszeitpunkt = new DateTime(2025, 12, 1, 10, 0, 0),
                Absender = new AuswahlAdresse
                {
                    AbsenderSonstige = "Rechtsanwalt Müller",
                    EmpfaengerSonstige = "Empfänger Sonstige",
                    EmpfaengerGericht = "AG Musterstadt",
                    EmpfaengerRvTraeger = "DRV Bund",
                    EmpfaengerPolizei = "Polizei Musterstadt",
                },
                Empfaenger = new AuswahlAdresse
                {
                    AbsenderSonstige = "Absender Sonstige",
                    EmpfaengerSonstige = "Frau Musterfrau",
                    EmpfaengerGericht = "AG Musterstadt",
                    EmpfaengerRvTraeger = "DRV",
                    EmpfaengerPolizei = "Kripo",
                },
                EigeneNachrichtenId = Guid.NewGuid().ToString(),
            },
            Grunddaten = new Grunddaten
            {
                Verfahrensdaten = new Verfahrensdaten
                {
                    Verfahrensnummer = "12 C 34/23",
                    Instanzdaten = new Instanzdaten
                    {
                        Instanznummer = "1",
                        Sachgebietszusatz = "Zivilsache",
                        AuswahlInstanzbehoerde = new AuswahlInstanzbehoerde
                        {
                            Gericht = new Code { CodeValue = "D12345", ListVersionId = "1.0", ListUri = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.gerichte" },
                        },
                    },
                    Beteiligungen =
                    [
                        new Beteiligung
                        {
                            Rolle = new Rolle
                            {
                                Rollenbezeichnung = new Code { CodeValue = "rolle.klaeger", ListVersionId = "1.0", ListUri = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung" },
                            },
                            Beteiligter = new Beteiligter
                            {
                                Auswahl = new AuswahlBeteiligter
                                {
                                    NP = new NatuerlichePerson
                                    {
                                        VollerName = new VollerName
                                        {
                                            Nachname = "Mustermann",
                                            Vorname = "Max",
                                            Titel = "Dr.",
                                            Namensvorsatz = "von",
                                            Rufname = "Max",
                                        },
                                        Anschrift = new Anschrift
                                        {
                                            Strasse = "Musterstraße",
                                            Hausnummer = "1",
                                            Postleitzahl = "12345",
                                            Ort = "Musterstadt",
                                            Staat = new Code { CodeValue = "DE", ListVersionId = "1.0" },
                                        },
                                        Telekommunikation =
                                        [
                                            new Telekommunikation
                                            {
                                                Telekommunikationsart = new Telekommunikationsart { Code = "Email" },
                                                verbindung = "max@mustermann.de",
                                            },
                                        ],
                                    },
                                    Org = new Organisation
                                    {
                                        Bezeichnung = new Bezeichnung
                                        {
                                            Aktuell = "Muster GmbH",
                                        },
                                    },
                                },
                            },
                        },
                    ],
                },
            },
            Schriftgutobjekte = new Schriftgutobjekte
            {
                Akte =
                [
                    new Akte
                    {
                        Identifikation = new Identifikation
                        {
                            Id = "uuid-1234",
                            NummerImUebergeordnetenContainer = "1",
                        },
                        AnwendungsspezifischeErweiterung = new AnwendungsspezifischeErweiterung
                        {
                            Kennung = "EXT-01",
                            Name = "Erweiterung",
                            Felder =
                            [
                                new Feld { Name = "Zusatz", Wert = "Info" },
                            ],
                            Feldgruppen =
                            [
                                new Feldgruppe
                                {
                                    Name = "Gruppe 1",
                                    Beschreibung = "Testgruppe",
                                    Felder = new List<Feld> { new Feld { Name = "Feld1", Wert = "Wert1" } },
                                },
                            ],
                        },
                        FachspezifischeDaten = new XjustizAkteFachspezifischeDaten
                        {
                            Aktentyp = new Code { CodeValue = "001" },
                            Anzeigename = "Hauptakte",
                            Aktenzeichen = new Aktenzeichen
                            {
                                Auswahl = new AuswahlAktenzeichen { },
                            },
                        },
                    },
                ],
                Dokumente =
                [
                    new Dokument
                    {
                        Identifikation = new Identifikation
                        {
                            Id = "uuid-5678",
                            NummerImUebergeordnetenContainer = "2",
                        },
                        Erstellungszeitpunkt = new DateTime(2025, 12, 1, 10, 30, 0),
                        FachspezifischeDaten = new XjustizFachspezifischeDaten
                        {
                            Dokumentklasse = new Code { CodeValue = "002", ListVersionId = "1.0", ListUri = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse" },
                            Datei = new Datei
                            {
                                Dateiname = "Klage.pdf",
                                Bestandteil = new Code { CodeValue = "001", ListVersionId = "2.4", ListUri = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp" },
                            },
                        },
                    },
                ],
            },
        };

        // Act
        var result = CompatibilityChecker.Check(message);
        var resultFromModel = message.GetCompatibility();

        // Assert
        Assert.NotEmpty(result.CompatibleXJustizVersions);
        Assert.NotEmpty(result.CompatibleXJustizCoreVersions);

        Assert.NotEmpty(resultFromModel.CompatibleXJustizVersions);
        Assert.NotEmpty(resultFromModel.CompatibleXJustizCoreVersions);

        Assert.Equal(result.CompatibleXJustizVersions, resultFromModel.CompatibleXJustizVersions);
        Assert.Equal(result.CompatibleXJustizCoreVersions, resultFromModel.CompatibleXJustizCoreVersions);

        Assert.Equal(message.Kopf.AktenzeichenAbsender.FirstOrDefault(), message.GetAktenzeichen());
    }

    internal class UebermittlungSchriftgutobjekteNachrichtWithRemovedPropertyInUse : UebermittlungSchriftgutobjekteNachricht
    {
        [XJustizAvailability(XJustizVersion.V3_2_1, Removed = XJustizVersion.V3_3_1)]
        [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
        public int PropertyWithRemovedUsed { get; set; }
    }
}
