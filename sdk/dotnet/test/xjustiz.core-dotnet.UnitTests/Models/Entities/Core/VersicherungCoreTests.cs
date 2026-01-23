namespace xjustiz.core_dotnet.UnitTests.Models.Entities.Core;

using FluentAssertions;
using System.IO;
using System.Text.Json;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Versicherung;
using xjustiz.core_dotnet.Models.Entities.Core;
using Xunit;

public class VersicherungCoreTests
{
    [Fact]
    public void ShouldSerializeAndDeserializeXml()
    {
        var entity = new VersicherungCore
        {
            Versicherungstyp = new VersicherungsTyp
            {
                Code = VersicherungsCode.Lebensversicherung,
            },
        };
        var serializer = new XmlSerializer(typeof(VersicherungCore));

        using var sw = new StringWriter();
        serializer.Serialize(sw, entity);
        var xml = sw.ToString();

        // Check namespace (assuming standard namespace usage)
        xml.Should().Contain("listVersionID=\"1.0\"");
        xml.Should().Contain("code>01</code>"); // It is an Element 'code', not attribute in the class definition I updated.
                                                // Wait, VersicherungsTyp has [XmlElement("code")], but I also added XML attributes listVersionID/listURI.
                                                // Let's check the generated XML structure.
        /*
        public class VersicherungsTyp : ICode<...>
        {
            [XmlAttribute("listVersionID")]
            public string ListVersionId ...
            [XmlElement("code")]
            public string CodeForXml ...
        }
        */
        // So <versicherungstyp listVersionID="1.0" ...>
        //      <code ...>01</code>
        //    </versicherungstyp>

        xml.Should().Contain("code>01</code>");

        using var sr = new StringReader(xml);
        var deserialized = serializer.Deserialize(sr) as VersicherungCore;
        deserialized.Should().NotBeNull();
        deserialized!.Versicherungstyp.Should().NotBeNull();
        deserialized!.Versicherungstyp!.Code.Should().Be(VersicherungsCode.Lebensversicherung);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJson()
    {
        var entity = new VersicherungCore
        {
            Versicherungstyp = new VersicherungsTyp
            {
                Code = VersicherungsCode.Alle_Sparten,
            },
        };
        var json = JsonSerializer.Serialize(entity);

        // JsonPropertyName("code") on the Enum property.
        // It is nested in Versicherungstyp property of VersicherungCore.
        // VersicherungCore has [XmlElement("versicherungstyp")] public VersicherungsTyp? Versicherungstyp
        // Default JSON serialization will use property name unless annotated.
        // VersicherungsTyp has [JsonPropertyName("code")] on public VersicherungsCode Code.
        // So json should look like {"versicherungstyp": {"code": "000", ...}}

        json.Should().Contain("\"code\":\"000\"");

        var deserialized = JsonSerializer.Deserialize<VersicherungCore>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Versicherungstyp.Should().NotBeNull();
        deserialized!.Versicherungstyp!.Code.Should().Be(VersicherungsCode.Alle_Sparten);
    }
}