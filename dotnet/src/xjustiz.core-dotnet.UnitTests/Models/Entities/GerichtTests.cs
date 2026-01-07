namespace xjustiz.core_dotnet.UnitTests.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Gericht;
using xjustiz.core_dotnet.Models.Entities;

/// <summary>
/// Unit tests for <see cref="Gericht"/> and <see cref="GerichtCode"/>.
/// </summary>
public class GerichtTests
{
    /// <summary>
    /// Verifies that <see cref="Gericht"/> serializes correctly with a valid code.
    /// </summary>
    [Fact]
    public void Serialize_Gericht_ShouldProduceCorrectXml()
    {
        // Arrange
        // Code B1102 is Amtsgericht Baden-Baden
        var gericht = new Gericht
        {
            Code = GerichtCode.Amtsgericht_Baden_Baden,
            ListVersionId = "3.6",
        };

        var serializer = new XmlSerializer(typeof(Gericht));
        using var writer = new StringWriter();

        // Act
        serializer.Serialize(writer, gericht);
        var xml = writer.ToString();

        // Assert
        Assert.Contains(">B1102</", xml);
        Assert.Contains("listVersionID=\"3.6\"", xml);
    }

    /// <summary>
    /// Verifies that <see cref="Gericht"/> deserializes correctly from XML.
    /// </summary>
    [Fact]
    public void Deserialize_Gericht_ShouldParseCorrectly()
    {
        // Arrange
        var xml = "<Gericht listVersionID=\"3.6\"><code>B1102</code></Gericht>";
        var serializer = new XmlSerializer(typeof(Gericht));
        using var reader = new StringReader(xml);

        // Act
        var gericht = serializer.Deserialize(reader) as Gericht;

        // Assert
        Assert.Equal(GerichtCode.Amtsgericht_Baden_Baden, gericht?.Code);
    }

    /// <summary>
    /// Verifies that <see cref="GerichtCodeLists"/> contains expected codes.
    /// </summary>
    [Fact]
    public void GerichtCodeLists_ShouldContainCodes()
    {
        // Arrange
        // B1102 should be in 3.6 and 3.5

        // Act & Assert
        Assert.Contains(GerichtCode.Amtsgericht_Baden_Baden, GerichtCodeLists.V3_6);
        Assert.Contains(GerichtCode.Amtsgericht_Baden_Baden, GerichtCodeLists.V3_5);

        Assert.True(GerichtCodeLists.V3_6.Count > 2000);
        Assert.True(GerichtCodeLists.V3_5.Count > 2000);
    }
}
