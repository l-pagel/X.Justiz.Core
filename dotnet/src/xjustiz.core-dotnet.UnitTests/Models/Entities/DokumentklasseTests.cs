namespace xjustiz.core_dotnet.UnitTests.Models.Entities;

using System.IO;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Dokumentklasse;
using xjustiz.core_dotnet.Models.Entities;
using Xunit;

/// <summary>
/// Unit tests for <see cref="Dokumentklasse"/> and <see cref="DokumentklasseCode"/>.
/// </summary>
public class DokumentklasseTests
{
    /// <summary>
    /// Verifies that <see cref="Dokumentklasse"/> serializes correctly with a valid code.
    /// </summary>
    [Fact]
    public void Serialize_Dokumentklasse_ShouldProduceCorrectXml()
    {
        // Arrange
        // Code 003 is Klage / Antrag
        var dokumentklasse = new Dokumentklasse
        {
            Code = DokumentklasseCode.Klage_Antrag,
            ListVersionId = "1.4",
        };

        var serializer = new XmlSerializer(typeof(Dokumentklasse));
        using var writer = new StringWriter();

        // Act
        serializer.Serialize(writer, dokumentklasse);
        var xml = writer.ToString();

        // Assert
        Assert.Contains(">003</", xml);
        Assert.Contains("listVersionID=\"1.4\"", xml);
    }

    /// <summary>
    /// Verifies that <see cref="Dokumentklasse"/> deserializes correctly from XML.
    /// </summary>
    [Fact]
    public void Deserialize_Dokumentklasse_ShouldParseCorrectly()
    {
        // Arrange
        var xml = "<Dokumentklasse listVersionID=\"1.4\"><code>003</code></Dokumentklasse>";
        var serializer = new XmlSerializer(typeof(Dokumentklasse));
        using var reader = new StringReader(xml);

        // Act
        var dokumentklasse = serializer.Deserialize(reader) as Dokumentklasse;

        // Assert
        Assert.Equal(DokumentklasseCode.Klage_Antrag, dokumentklasse?.Code);
    }

    /// <summary>
    /// Verifies that <see cref="DokumentklasseCodeLists"/> contains expected codes.
    /// </summary>
    [Fact]
    public void DokumentklasseCodeLists_ShouldContainCodes()
    {
        // Arrange
        // 003 should be in 1.4

        // Act & Assert
        Assert.Contains(DokumentklasseCode.Klage_Antrag, DokumentklasseCodeLists.V1_4);
        Assert.Contains(DokumentklasseCode.Urteil, DokumentklasseCodeLists.V1_4);
        Assert.Contains(DokumentklasseCode.Beschluss, DokumentklasseCodeLists.V1_0);

        Assert.True(DokumentklasseCodeLists.V1_4.Count > 10);
    }
}
