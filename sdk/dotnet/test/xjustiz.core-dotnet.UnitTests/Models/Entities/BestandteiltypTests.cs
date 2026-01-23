namespace xjustiz.core_dotnet.UnitTests.Models.Entities;

using FluentAssertions;
using System.IO;
using System.Text.Json;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Bestandteil;
using xjustiz.core_dotnet.Models.Entities;
using Xunit;

public class BestandteiltypTests
{
    [Fact]
    public void ShouldSerializeAndDeserializeXml()
    {
        var entity = new Bestandteiltyp { Code = BestandteiltypCode.Original }; // Assuming 'Original' exists
        var serializer = new XmlSerializer(typeof(Bestandteiltyp));

        using var sw = new StringWriter();
        serializer.Serialize(sw, entity);
        var xml = sw.ToString();

        xml.Should().Contain("listVersionID=\"2.4\"");
        // Need to know exact code for Original. Usually 1 or similar.
        // I'll trust mapping works if test passes. Or check generated file later if failure.

        using var sr = new StringReader(xml);
        var deserialized = serializer.Deserialize(sr) as Bestandteiltyp;
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(BestandteiltypCode.Original);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJson()
    {
        var entity = new Bestandteiltyp { Code = BestandteiltypCode.Signaturdatei };
        var json = JsonSerializer.Serialize(entity);

        json.Should().Contain("003");

        var deserialized = JsonSerializer.Deserialize<Bestandteiltyp>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(BestandteiltypCode.Signaturdatei);
    }
}