namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Geschlecht;
using Xunit;

public class GeschlechtCodeJsonTests
{
    [Theory]
    [InlineData("\"0\"", GeschlechtCode.Unbekannt)]
    [InlineData("\"u\"", GeschlechtCode.Unbekannt)]
    [InlineData("\"unbekannt\"", GeschlechtCode.Unbekannt)]
    [InlineData("\"1\"", GeschlechtCode.Maennlich)]
    [InlineData("\"m\"", GeschlechtCode.Maennlich)]
    [InlineData("\"männlich\"", GeschlechtCode.Maennlich)]
    [InlineData("\"2\"", GeschlechtCode.Weiblich)]
    [InlineData("\"w\"", GeschlechtCode.Weiblich)]
    [InlineData("\"weiblich\"", GeschlechtCode.Weiblich)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, GeschlechtCode expected)
    {
        var result = JsonSerializer.Deserialize<GeschlechtCode>(json);
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        var code = GeschlechtCode.Divers;
        var json = JsonSerializer.Serialize(code);
        Assert.Equal("\"3\"", json);
    }
}
