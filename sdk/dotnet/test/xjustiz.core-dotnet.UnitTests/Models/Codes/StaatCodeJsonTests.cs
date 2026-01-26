namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Staat;
using Xunit;

public class StaatCodeJsonTests
{
    [Theory]
    [InlineData("\"000\"", StaatCode.Deutschland)]
    [InlineData("\"Deutschland\"", StaatCode.Deutschland)]
    [InlineData("\"DE\"", StaatCode.Deutschland)]
    [InlineData("\"DEU\"", StaatCode.Deutschland)]
    [InlineData("\"deutsch\"", StaatCode.Deutschland)]
    [InlineData("\"die Bundesrepublik Deutschland\"", StaatCode.Deutschland)]
    [InlineData("\"124\"", StaatCode.Belgien)]
    [InlineData("\"Belgien\"", StaatCode.Belgien)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, StaatCode expected)
    {
        // Act
        var result = JsonSerializer.Deserialize<StaatCode>(json);

        // Assert
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        // Arrange
        var code = StaatCode.Deutschland;

        // Act
        var json = JsonSerializer.Serialize(code);

        // Assert
        Assert.Equal("\"000\"", json);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode_ForBelgien()
    {
        // Arrange
        var code = StaatCode.Belgien;

        // Act
        var json = JsonSerializer.Serialize(code);

        // Assert
        Assert.Equal("\"124\"", json);
    }
}
