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
                Code = VersicherungsTypCode.Lebensversicherung,
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
        deserialized!.Versicherungstyp!.Code.Should().Be(VersicherungsTypCode.Lebensversicherung);
    }

    [Fact]
    public void ShouldSerializeAndDeserializeJson()
    {
        var entity = new VersicherungCore
        {
            Versicherungstyp = new VersicherungsTyp
            {
                Code = VersicherungsTypCode.Alle_Sparten,
            },
        };
        var json = JsonSerializer.Serialize(entity);

        // JsonPropertyName("code") on the Enum property.
        // It is nested in Versicherungstyp property of VersicherungCore.
        // VersicherungCore has [XmlElement("versicherungstyp")] public VersicherungsTyp? Versicherungstyp
        // Default JSON serialization will use property name unless annotated.
        // VersicherungsTyp has [JsonPropertyName("code")] on public VersicherungsTypCode Code.
        // So json should look like {"versicherungstyp": {"code": "000", ...}}

        json.Should().Contain("\"code\":\"000\"");

        var deserialized = JsonSerializer.Deserialize<VersicherungCore>(json);
        deserialized.Should().NotBeNull();
        deserialized!.Versicherungstyp.Should().NotBeNull();
        deserialized!.Versicherungstyp!.Code.Should().Be(VersicherungsTypCode.Alle_Sparten);
    }

    [Fact]
    public void ShouldDeserializeFromXmlFile()
    {
        var xmlPath = Path.Combine("test-data", "versicherung_core_sample.xml");

        using var fs = File.OpenRead(xmlPath);
        var serializer = new XmlSerializer(typeof(VersicherungCore));
        var entity = serializer.Deserialize(fs) as VersicherungCore;

        entity.Should().NotBeNull();
        entity!.Versicherungsnummer.Should().Be("V-123456");
        entity.Versicherungsunternehmen.Should().HaveCount(1);
        entity.Versicherungsunternehmen![0].Code.Should().Be(core_dotnet.Models.Codes.Versicherer.VersichererCode.Allianz_Versorgungskasse_Versicherungsverein_a_G);
        entity.Versicherungstyp.Should().NotBeNull();
        entity.Versicherungstyp!.Code.Should().Be(VersicherungsTypCode.Kraftfahrtversicherung);
    }

    [Fact]
    public void ShouldDeserializeFromJsonFile()
    {
        var jsonPath = Path.Combine("test-data", "versicherung_core_sample.json");

        using var fs = File.OpenRead(jsonPath);
        var entity = JsonSerializer.Deserialize<VersicherungCore>(fs);

        entity.Should().NotBeNull();
        entity!.Versicherungsnummer.Should().Be("V-123456");
        entity.Versicherungsunternehmen.Should().HaveCount(1);
        entity.Versicherungsunternehmen![0].Code.Should().Be(core_dotnet.Models.Codes.Versicherer.VersichererCode.Allianz_Versorgungskasse_Versicherungsverein_a_G);
        entity.Versicherungstyp.Should().NotBeNull();
        entity.Versicherungstyp!.Code.Should().Be(VersicherungsTypCode.Kraftfahrtversicherung);
    }
}
