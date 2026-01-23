namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Versicherung;
using Xunit;

public class VersicherungsCodeJsonTests
{
    [Theory]
    [InlineData("\"01\"", VersicherungsCode.Lebensversicherung)]
    [InlineData("\"Lebensversicherung\"", VersicherungsCode.Lebensversicherung)]
    [InlineData("\"000\"", VersicherungsCode.Alle_Sparten)]
    [InlineData("\"Alle Sparten\"", VersicherungsCode.Alle_Sparten)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, VersicherungsCode expected)
    {
        var result = JsonSerializer.Deserialize<VersicherungsCode>(json);
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        var code = VersicherungsCode.Lebensversicherung;
        var json = JsonSerializer.Serialize(code);
        Assert.Equal("\"01\"", json);
    }
}