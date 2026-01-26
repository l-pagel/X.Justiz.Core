namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Versicherung;
using Xunit;

public class VersicherungsTypCodeJsonTests
{
    [Theory]
    [InlineData("\"01\"", VersicherungsTypCode.Lebensversicherung)]
    [InlineData("\"Lebensversicherung\"", VersicherungsTypCode.Lebensversicherung)]
    [InlineData("\"000\"", VersicherungsTypCode.Alle_Sparten)]
    [InlineData("\"Alle Sparten\"", VersicherungsTypCode.Alle_Sparten)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, VersicherungsTypCode expected)
    {
        var result = JsonSerializer.Deserialize<VersicherungsTypCode>(json);
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        var code = VersicherungsTypCode.Lebensversicherung;
        var json = JsonSerializer.Serialize(code);
        Assert.Equal("\"01\"", json);
    }
}
