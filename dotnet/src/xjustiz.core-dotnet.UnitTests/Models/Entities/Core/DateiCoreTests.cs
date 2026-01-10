namespace xjustiz.core_dotnet.UnitTests.Models.Entities.Core;

using FluentAssertions;
using System;
using System.IO;
using System.Text.Json;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Entities.Core;
using Xunit;

public class DateiCoreTests
{
    [Fact]
    public void ShouldSerializeAndDeserializeXmlWithArtifacts()
    {
        var entity = new DateiCore
        {
            Dateiname = "test_123.pdf",
            Dateiendung = ".pdf",
            ContentType = "application/pdf",
            Groesse = 1024,
            Hash = new HashInfoCore { Algorithm = "SHA-256", Value = "ABCDEF" },
            Artefakte =
            [
                new BundlePathArtifactCore { Path = "files/test.pdf" },
                new HttpsArtifactCore
                {
                    Url = "https://example.com/test.pdf",
                    ExpiresAtUtc = new DateTime(2026, 1, 1, 12, 0, 0, DateTimeKind.Utc),
                    Headers =
                    [
                        new HttpHeaderCore { Name = "Authorization", Value = "Bearer token" },
                    ],
                },
            ],
        };

        var serializer = new XmlSerializer(typeof(DateiCore));

        using var sw = new StringWriter();
        serializer.Serialize(sw, entity);
        var xml = sw.ToString();

        xml.Should().Contain("<dateiendung>.pdf</dateiendung>");
        xml.Should().Contain("<groesse>1024</groesse>");
        xml.Should().Contain("<hash>");
        xml.Should().Contain("<algorithmus>SHA-256</algorithmus>");
        xml.Should().Contain("<bundlePfad>");
        xml.Should().Contain("<https>");
        xml.Should().Contain("<url>https://example.com/test.pdf</url>");

        using var sr = new StringReader(xml);
        var deserialized = serializer.Deserialize(sr) as DateiCore;
        deserialized.Should().NotBeNull();
        deserialized!.Dateiname.Should().Be(entity.Dateiname);
        deserialized.Artefakte.Should().HaveCount(2);
        deserialized.Artefakte[0].Should().BeOfType<BundlePathArtifactCore>();
        deserialized.Artefakte[1].Should().BeOfType<HttpsArtifactCore>();
        ((HttpsArtifactCore)deserialized.Artefakte[1]).Headers.Should().HaveCount(1);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJsonWithArtifacts()
    {
        var entity = new DateiCore
        {
            Dateiname = "test_123.pdf",
            Dateiendung = ".pdf",
            ContentType = "application/pdf",
            Hash = new HashInfoCore { Value = "123456" },
            Artefakte =
            [
                new BundlePathArtifactCore { Path = "bundle/file.pdf" },
                new HttpsArtifactCore { Url = "https://cdn.com/file.pdf" },
            ],
        };

        var json = JsonSerializer.Serialize(entity);

        json.Should().Contain("\"fileExtension\":\".pdf\"");
        json.Should().Contain("\"type\":\"bundle-path\"");
        json.Should().Contain("\"type\":\"https\"");

        var deserialized = JsonSerializer.Deserialize<DateiCore>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Artefakte.Should().HaveCount(2);
        deserialized.Artefakte[0].Should().BeOfType<BundlePathArtifactCore>();
        deserialized.Artefakte[1].Should().BeOfType<HttpsArtifactCore>();
        ((BundlePathArtifactCore)deserialized.Artefakte[0]).Path.Should().Be("bundle/file.pdf");
    }
}
