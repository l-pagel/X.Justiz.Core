namespace xjustiz.core_dotnet.UnitTests.Models.Entities;

using FluentAssertions;
using System.IO;
using System.Text.Json;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Entities;
using Xunit;
using TKCode = xjustiz.core_dotnet.Models.Codes.Telekommunikationsart.TelekommunikationsartCode;

public class TelekommunikationsartTests
{
    [Fact]
    public void ShouldSerializeAndDeserializeXml()
    {
        var entity = new Telekommunikationsart { Code = TKCode.Email };
        var serializer = new XmlSerializer(typeof(Telekommunikationsart));

        using var sw = new StringWriter();
        serializer.Serialize(sw, entity);
        var xml = sw.ToString();

        xml.Should().Contain("listVersionID=\"2.2\"");
        xml.Should().Contain(">001<"); // Code '001'

        using var sr = new StringReader(xml);
        var deserialized = serializer.Deserialize(sr) as Telekommunikationsart;
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(TKCode.Email);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJson()
    {
        var entity = new Telekommunikationsart { Code = TKCode.Fax };
        var json = JsonSerializer.Serialize(entity);

        // JsonConverter writes ToCode() -> '002'
        json.Should().Contain("\"code\":\"002\"");

        var deserialized = JsonSerializer.Deserialize<Telekommunikationsart>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(TKCode.Fax);
    }
}