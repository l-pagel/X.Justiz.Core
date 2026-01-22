namespace xjustiz.core_dotnet.UnitTests;

using System;
using System.IO;
using System.Text.Json;
using System.Threading.Tasks;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;
using Xunit;

public class E2E_SampleFileTests
{
    private readonly string _datasetsPath;

    public E2E_SampleFileTests()
    {
        _datasetsPath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "docs", "examples");
    }

    [Theory]
    [InlineData("arbeitsrecht")]
    [InlineData("erbrecht")]
    [InlineData("mietrecht")]
    [InlineData("fluggastrecht")]
    public async Task Validate_Json_Sample_Files(string datasetName)
    {
        var jsonPath = Path.Combine(_datasetsPath, $"{datasetName}.json");
        Assert.True(File.Exists(jsonPath), $"JSON file not found: {jsonPath}");

        var jsonContent = await File.ReadAllTextAsync(jsonPath);
        var jsonSerializerOptions = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
        var options = jsonSerializerOptions;

        UebermittlungSchriftgutobjekteNachricht? message = null;
        try
        {
            message = JsonSerializer.Deserialize<UebermittlungSchriftgutobjekteNachricht>(jsonContent, options);
        }
        catch (JsonException ex)
        {
            Assert.Fail($"JSON Deserialization failed for {datasetName}: {ex.Message} at path {ex.Path} | LineNumber: {ex.LineNumber} | BytePosition: {ex.BytePositionInLine}");
        }

        Assert.NotNull(message);

        // Verify we can serialize this to XML (this triggers XmlSerializer reflection check)
        var xmlSerializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
        using var stringWriter = new StringWriter();
        xmlSerializer.Serialize(stringWriter, message);
        var xmlOutput = stringWriter.ToString();
        Assert.NotEmpty(xmlOutput);
    }

    [Theory]
    [InlineData("arbeitsrecht")]
    [InlineData("erbrecht")]
    [InlineData("mietrecht")]
    [InlineData("fluggastrecht")]
    public async Task Validate_Xml_Sample_Files(string datasetName)
    {
        var xmlPath = Path.Combine(_datasetsPath, $"{datasetName}.xml");
        Assert.True(File.Exists(xmlPath), $"XML file not found: {xmlPath}");

        using var stream = File.OpenRead(xmlPath);
        var xmlSerializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));

        UebermittlungSchriftgutobjekteNachricht? message = null;
        try
        {
            message = (UebermittlungSchriftgutobjekteNachricht?)xmlSerializer.Deserialize(stream);
        }
        catch (InvalidOperationException ex)
        {
            Assert.Fail($"XML Deserialization failed for {datasetName}: {ex.Message} {ex.InnerException?.Message}");
        }

        Assert.NotNull(message);

        // Verify we can serialize it back
        using var stringWriter = new StringWriter();
        xmlSerializer.Serialize(stringWriter, message);
        var xmlOutput = stringWriter.ToString();
        Assert.NotEmpty(xmlOutput);
    }
}
