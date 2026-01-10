namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Aktentyp;
using Xunit;

public class AktentypCodeJsonTests
{
    [Theory]
    [InlineData("\"001\"", AktentypCode.Zivilakte)]
    [InlineData("\"Zivilakte\"", AktentypCode.Zivilakte)]
    [InlineData("\"005\"", AktentypCode.Insolvenzakte)]
    [InlineData("\"Insolvenzakte\"", AktentypCode.Insolvenzakte)]
    [InlineData("\"017\"", AktentypCode.Andere_oder_Sonstige)]
    [InlineData("\"Andere / Sonstige\"", AktentypCode.Andere_oder_Sonstige)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, AktentypCode expected)
    {
        var result = JsonSerializer.Deserialize<AktentypCode>(json);
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        var code = AktentypCode.Strafakte;
        var json = JsonSerializer.Serialize(code);
        Assert.Equal("\"012\"", json);
    }
}
