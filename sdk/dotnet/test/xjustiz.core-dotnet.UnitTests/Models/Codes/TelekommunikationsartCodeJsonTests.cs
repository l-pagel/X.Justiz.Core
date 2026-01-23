namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using Xunit;
using TKCode = xjustiz.core_dotnet.Models.Codes.Telekommunikationsart.TelekommunikationsartCode;

public class TelekommunikationsartCodeJsonTests
{
    [Theory]
    [InlineData("\"001\"", TKCode.Email)]
    [InlineData("\"email\"", TKCode.Email)]
    [InlineData("\"e-mail\"", TKCode.Email)]
    [InlineData("\"002\"", TKCode.Fax)]
    [InlineData("\"fax\"", TKCode.Fax)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, TKCode expected)
    {
        var result = JsonSerializer.Deserialize<TKCode>(json);
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        var code = TKCode.Internet;
        var json = JsonSerializer.Serialize(code);
        Assert.Equal("\"003\"", json);
    }
}