namespace xjustiz.core_dotnet.UnitTests.Models.Entities;

using FluentAssertions;
using System.IO;
using System.Text.Json;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Rolle;
using xjustiz.core_dotnet.Models.Entities;
using Xunit;

public class RolleTests
{
    [Fact]
    public void ShouldSerializeAndDeserializeXml()
    {
        var entity = new Rolle { Code = RollenCode.Angeklagte };
        var serializer = new XmlSerializer(typeof(Rolle));

        using var sw = new StringWriter();
        serializer.Serialize(sw, entity);
        var xml = sw.ToString();

        xml.Should().Contain("listVersionID=\"3.6\"");

        using var sr = new StringReader(xml);
        var deserialized = serializer.Deserialize(sr) as Rolle;
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(RollenCode.Angeklagte);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJson()
    {
        // Use specific generated member for Unternehmen
        var entity = new Rolle { Code = RollenCode.Unternehmen_378 };
        var json = JsonSerializer.Serialize(entity);

        // Expect code or name depending on JSON settings.
        // My JsonConverter uses ToCode() which returns XmlEnum attribute ("378").
        json.Should().Contain("\"code\":\"378\"");

        var deserialized = JsonSerializer.Deserialize<Rolle>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Code.Should().Be(RollenCode.Unternehmen_378);
    }
}
