namespace xjustiz.core_dotnet.UnitTests.Models.Codes;

using System.Text.Json;
using xjustiz.core_dotnet.Models.Codes.Bestandteil;
using Xunit;

public class BestandteiltypCodeJsonTests
{
    [Theory]
    [InlineData("\"001\"", BestandteiltypCode.Original)]
    [InlineData("\"Original\"", BestandteiltypCode.Original)]
    [InlineData("\"002\"", BestandteiltypCode.Repraesentat)]
    [InlineData("\"Repräsentat\"", BestandteiltypCode.Repraesentat)]
    [InlineData("\"012\"", BestandteiltypCode.hinlaufendes_eEB)]
    [InlineData("\"hinlaufendes eEB\"", BestandteiltypCode.hinlaufendes_eEB)]
    public void Deserialize_ShouldWorkForVariousInputs(string json, BestandteiltypCode expected)
    {
        var result = JsonSerializer.Deserialize<BestandteiltypCode>(json);
        Assert.Equal(expected, result);
    }

    [Fact]
    public void Serialize_ShouldReturnNumericCode()
    {
        var code = BestandteiltypCode.Signaturdatei;
        var json = JsonSerializer.Serialize(code);
        Assert.Equal("\"003\"", json);
    }
}
