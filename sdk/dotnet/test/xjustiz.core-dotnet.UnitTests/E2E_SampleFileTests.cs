namespace xjustiz.core_dotnet.UnitTests;

using System;
using System.IO;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Threading.Tasks;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;
using Xunit;

public class E2E_SampleFileTests
{
    private readonly string _datasetsPath;

    public E2E_SampleFileTests()
    {
        var currentDir = new DirectoryInfo(AppDomain.CurrentDomain.BaseDirectory);
        while (currentDir != null && !Directory.Exists(Path.Combine(currentDir.FullName, "sdk", "test-data")))
        {
            currentDir = currentDir.Parent;
        }

        if (currentDir != null)
        {
            _datasetsPath = Path.Combine(currentDir.FullName, "sdk", "test-data");
        }
        else
        {
            // Fallback to local if not found (though expected to be found)
            _datasetsPath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "docs", "examples");
        }
    }

    [Theory]
    [InlineData("arbeitsrecht")]
    [InlineData("erbrecht")]
    [InlineData("mietrecht")]
    [InlineData("fluggastrecht")]
    [InlineData("verkehrsunfall")]
    [InlineData("scenarios/arbeitsrecht_complex")]
    [InlineData("scenarios/erbrecht_complex")]
    [InlineData("scenarios/mietrecht_complex")]
    [InlineData("scenarios/fluggastrecht_complex")]
    [InlineData("scenarios/verkehrsunfall_complex")]
    public async Task Validate_Json_Sample_Files(string datasetName)
    {
        var jsonPath = Path.Combine(_datasetsPath, $"{datasetName}.json");
        Assert.True(File.Exists(jsonPath), $"JSON file not found: {jsonPath}");

        var jsonContent = await File.ReadAllTextAsync(jsonPath);
        var jsonSerializerOptions = new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true,
            ReadCommentHandling = JsonCommentHandling.Skip,
        };
        jsonSerializerOptions.Converters.Add(new NumberToStringConverter());
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

    private class NumberToStringConverter : JsonConverter<string?>
    {
        public override string? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            if (reader.TokenType == JsonTokenType.Number)
            {
                return reader.TryGetInt64(out var l) ? l.ToString() : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture);
            }

            if (reader.TokenType == JsonTokenType.String)
            {
                return reader.GetString();
            }

            using var doc = JsonDocument.ParseValue(ref reader);
            return doc.RootElement.ToString();
        }

        public override void Write(Utf8JsonWriter writer, string? value, JsonSerializerOptions options)
        {
            writer.WriteStringValue(value);
        }
    }
}
