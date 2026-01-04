using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Staat;
using xjustiz.core_dotnet.Models.Entities;

/// <summary>
/// Unit tests for <see cref="Staat"/> and <see cref="StaatCode"/>.
/// </summary>
public class StaatTests
{
    /// <summary>
    /// Verifies that <see cref="Staat"/> serializes correctly with a valid code.
    /// </summary>
    [Fact]
    public void Serialize_Staat_ShouldProduceCorrectXml()
    {
        // Arrange
        // Code 124 is Belgium (Belgien)
        var staat = new Staat
        {
            Code = StaatCode.Belgien,
            ListVersionId = "2024-08-01",
        };

        var serializer = new XmlSerializer(typeof(Staat));
        using var writer = new StringWriter();

        // Act
        serializer.Serialize(writer, staat);
        var xml = writer.ToString();

        // Assert
        Assert.Contains(">124</", xml);
        Assert.Contains("listVersionID=\"2024-08-01\"", xml);
    }

    /// <summary>
    /// Verifies that <see cref="Staat"/> deserializes correctly from XML.
    /// </summary>
    [Fact]
    public void Deserialize_Staat_ShouldParseCorrectly()
    {
        // Arrange
        var xml = "<Staat listVersionID=\"2024-08-01\"><code xmlns=\"\">124</code></Staat>";
        var serializer = new XmlSerializer(typeof(Staat));
        using var reader = new StringReader(xml);

        // Act
        var staat = (Staat)serializer.Deserialize(reader);

        // Assert
        Assert.Equal(StaatCode.Belgien, staat.Code);
    }

    /// <summary>
    /// Verifies that <see cref="StaatCodeLists"/> contains expected codes.
    /// </summary>
    [Fact]
    public void StaatCodeLists_ShouldContainCodes()
    {
        // Arrange
        // 124 (Belgium) should be in both 2024 and 2023 lists

        // Act & Assert
        Assert.Contains(StaatCode.Belgien, StaatCodeLists.V2024_08_01);
        Assert.Contains(StaatCode.Belgien, StaatCodeLists.V2023_02_24);

        Assert.True(StaatCodeLists.V2024_08_01.Count > 190);
        Assert.True(StaatCodeLists.V2023_02_24.Count > 190);
    }
}
