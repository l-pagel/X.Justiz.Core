namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Dokumentklasse;
using Xunit;

public class DokumentklasseCodeJsonTests
{
    private readonly JsonSerializerOptions _options;

    public DokumentklasseCodeJsonTests()
    {
        _options = new JsonSerializerOptions();
    }

    [Fact]
    public void Serialize_ShouldReturnCode_ForKlageAntrag()
    {
        // Arrange
        var code = DokumentklasseCode.Klage_Antrag;

        // Act
        var json = JsonSerializer.Serialize(code, _options);

        // Assert
        Assert.Equal("\"003\"", json);
    }

    [Fact]
    public void Deserialize_FromCode_ShouldReturnKlageAntrag()
    {
        // Arrange
        var json = "\"003\"";

        // Act
        var result = JsonSerializer.Deserialize<DokumentklasseCode>(json, _options);

        // Assert
        Assert.Equal(DokumentklasseCode.Klage_Antrag, result);
    }

    [Fact]
    public void Deserialize_FromDescription_ShouldReturnKlageAntrag()
    {
        // Arrange
        var json = "\"Klage / Antrag\"";

        // Act
        var result = JsonSerializer.Deserialize<DokumentklasseCode>(json, _options);

        // Assert
        Assert.Equal(DokumentklasseCode.Klage_Antrag, result);
    }

    [Fact]
    public void Serialize_ShouldReturnCode_ForUrteil()
    {
        // Arrange
        var code = DokumentklasseCode.Urteil;

        // Act
        var json = JsonSerializer.Serialize(code, _options);

        // Assert
        Assert.Equal("\"006\"", json);
    }

    [Fact]
    public void Deserialize_FromName_ShouldReturnUrteil()
    {
        // Arrange
        var json = "\"Urteil\"";

        // Act
        var result = JsonSerializer.Deserialize<DokumentklasseCode>(json, _options);

        // Assert
        Assert.Equal(DokumentklasseCode.Urteil, result);
    }
}
