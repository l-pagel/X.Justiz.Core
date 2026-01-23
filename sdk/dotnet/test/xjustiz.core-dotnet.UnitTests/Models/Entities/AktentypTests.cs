namespace xjustiz.core_dotnet.UnitTests.Models.Entities;

using FluentAssertions;
using System.IO;
using System.Text.Json;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Aktentyp;
using xjustiz.core_dotnet.Models.Entities;
using Xunit;

public class AktentypTests
{
    [Fact]
    public void ShouldSerializeAndDeserializeXml()
    {
        var entity = new Aktentyp { Code = AktentypCode.Zivilakte };
        var serializer = new XmlSerializer(typeof(Aktentyp));

        using var sw = new StringWriter();
        serializer.Serialize(sw, entity);
        var xml = sw.ToString();

        xml.Should().Contain("listVersionID=\"2.2\"");
        xml.Should().Contain("001"); // Code for Zivilakte

        using var sr = new StringReader(xml);
        var deserialized = serializer.Deserialize(sr) as Aktentyp;
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(AktentypCode.Zivilakte);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJson()
    {
        var entity = new Aktentyp { Code = AktentypCode.Betreuungsakte };
        var json = JsonSerializer.Serialize(entity);

        json.Should().Contain("\"code\":\"002\"");

        var deserialized = JsonSerializer.Deserialize<Aktentyp>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(AktentypCode.Betreuungsakte);
    }
}