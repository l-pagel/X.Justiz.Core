namespace xjustiz.core_dotnet.UnitTests.Models.Entities;

using System.IO;
using System.Text.Json;
using System.Xml.Serialization;
using FluentAssertions;
using xjustiz.core_dotnet.Models.Codes.Geschlecht;
using xjustiz.core_dotnet.Models.Entities;
using Xunit;

public class GeschlechtTests
{
    [Fact]
    public void ShouldSerializeAndDeserializeXml()
    {
        var entity = new Geschlecht { Code = GeschlechtCode.Maennlich };
        var serializer = new XmlSerializer(typeof(Geschlecht));

        using var sw = new StringWriter();
        serializer.Serialize(sw, entity);
        var xml = sw.ToString();

        xml.Should().Contain("listVersionID=\"2.1\"");
        xml.Should().Contain(">1<"); // Code '1'

        using var sr = new StringReader(xml);
        var deserialized = serializer.Deserialize(sr) as Geschlecht;
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(GeschlechtCode.Maennlich);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJson()
    {
        var entity = new Geschlecht { Code = GeschlechtCode.Weiblich };
        var json = JsonSerializer.Serialize(entity);

        // JsonConverter writes ToCode() -> '2'
        json.Should().Contain("\"code\":\"2\"");

        var deserialized = JsonSerializer.Deserialize<Geschlecht>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(GeschlechtCode.Weiblich);
    }
}
