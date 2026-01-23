namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Gericht;
using Xunit;

public class GerichtCodeJsonTests
{
    private readonly JsonSerializerOptions _options;

    public GerichtCodeJsonTests()
    {
        _options = new JsonSerializerOptions();
    }

    [Fact]
    public void Serialize_ShouldReturnCode_ForBGH()
    {
        // Arrange
        var code = GerichtCode.Bundesgerichtshof_Karlsruhe;

        // Act
        var json = JsonSerializer.Serialize(code, _options);

        // Assert
        Assert.Equal("\"A1000\"", json);
    }

    [Fact]
    public void Deserialize_FromCode_ShouldReturnBGH()
    {
        // Arrange
        var json = "\"A1000\"";

        // Act
        var result = JsonSerializer.Deserialize<GerichtCode>(json, _options);

        // Assert
        Assert.Equal(GerichtCode.Bundesgerichtshof_Karlsruhe, result);
    }

    [Fact]
    public void Deserialize_FromDescription_ShouldReturnBGH()
    {
        // Arrange
        var json = "\"Bundesgerichtshof Karlsruhe\"";

        // Act
        var result = JsonSerializer.Deserialize<GerichtCode>(json, _options);

        // Assert
        Assert.Equal(GerichtCode.Bundesgerichtshof_Karlsruhe, result);
    }

    [Fact]
    public void Serialize_ShouldReturnCode_ForAmtsgerichtBadenBaden()
    {
        // Arrange
        var code = GerichtCode.Amtsgericht_Baden_Baden;

        // Act
        var json = JsonSerializer.Serialize(code, _options);

        // Assert
        Assert.Equal("\"B1102\"", json);
    }

    [Fact]
    public void Deserialize_FromName_ShouldReturnAmtsgerichtBadenBaden()
    {
        // Arrange
        var json = "\"Amtsgericht Baden-Baden\"";

        // Act
        var result = JsonSerializer.Deserialize<GerichtCode>(json, _options);

        // Assert
        Assert.Equal(GerichtCode.Amtsgericht_Baden_Baden, result);
    }
}