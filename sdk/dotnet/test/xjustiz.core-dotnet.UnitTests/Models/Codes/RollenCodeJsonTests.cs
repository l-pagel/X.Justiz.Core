namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Rolle;
using Xunit;

public class RollenCodeJsonTests
{
    [Theory]
    [InlineData("\"001\"", RollenCode.Abwesenheitspfleger)]
    [InlineData("\"Abwesenheitspfleger(in)\"", RollenCode.Abwesenheitspfleger)]
    [InlineData("\"016\"", RollenCode.Antragsteller)]
    [InlineData("\"Antragsteller(in)\"", RollenCode.Antragsteller)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, RollenCode expected)
    {
        var result = JsonSerializer.Deserialize<RollenCode>(json);
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        var code = RollenCode.Rechtsanwalt;
        var json = JsonSerializer.Serialize(code);
        Assert.Equal("\"135\"", json);
    }
}
