// <copyright file="TestDataProvider.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests.Infrastructure;

using System.Text.Json;
using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Provides test data for integration tests, loading from example datasets.
/// </summary>
public static class TestDataProvider
{
    private static readonly string RepoRoot = FindRepoRoot();
    private static readonly string ExampleDatasetsPath = Path.Combine(RepoRoot, "docs", "examples");

    private static readonly JsonSerializerOptions JsonOptions = new()
    {
        PropertyNameCaseInsensitive = true,
        DefaultIgnoreCondition = JsonIgnoreCondition.WhenWritingNull,
    };

    /// <summary>
    /// Available test datasets.
    /// </summary>
    public enum Dataset
    {
        /// <summary>
        /// Arbeitsrecht
        /// </summary>
        Arbeitsrecht,

        /// <summary>
        /// Erbrecht
        /// </summary>
        Erbrecht,

        /// <summary>
        /// Fluggastrecht
        /// </summary>
        Fluggastrecht,

        /// <summary>
        /// Mietrecht
        /// </summary>
        Mietrecht,
    }

    /// <summary>
    /// Loads a test dataset as a message object from JSON.
    /// </summary>
    public static async Task<UebermittlungSchriftgutobjekteNachricht> LoadDatasetFromJsonAsync(Dataset dataset)
    {
        var filePath = GetDatasetPath(dataset, "json");
        using var stream = File.OpenRead(filePath);
        return await JsonSerializer.DeserializeAsync<UebermittlungSchriftgutobjekteNachricht>(stream, JsonOptions)
            ?? throw new InvalidOperationException($"Failed to load dataset: {dataset}");
    }

    /// <summary>
    /// Loads a test dataset as a message object from XML.
    /// </summary>
    public static UebermittlungSchriftgutobjekteNachricht LoadDatasetFromXml(Dataset dataset)
    {
        var filePath = GetDatasetPath(dataset, "xml");
        var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
        using var stream = File.OpenRead(filePath);
        return (UebermittlungSchriftgutobjekteNachricht)(serializer.Deserialize(stream)
            ?? throw new InvalidOperationException($"Failed to load dataset: {dataset}"));
    }

    /// <summary>
    /// Loads a test dataset as raw JSON string.
    /// </summary>
    public static string LoadDatasetAsJsonString(Dataset dataset)
    {
        var filePath = GetDatasetPath(dataset, "json");
        return File.ReadAllText(filePath);
    }

    /// <summary>
    /// Loads a test dataset as raw XML string.
    /// </summary>
    public static string LoadDatasetAsXmlString(Dataset dataset)
    {
        var filePath = GetDatasetPath(dataset, "xml");
        return File.ReadAllText(filePath);
    }

    /// <summary>
    /// Gets all available datasets for theory tests with strong type safety.
    /// </summary>
    public static TheoryData<Dataset> AllDatasets()
    {
        var theoryData = new TheoryData<Dataset>();
        Enum.GetValues<Dataset>().ToList().ForEach(theoryData.Add);
        return theoryData;
    }

    /// <summary>
    /// Creates a minimal test message for quick tests.
    /// </summary>
    public static UebermittlungSchriftgutobjekteNachricht CreateMinimalTestMessage()
    {
        return new UebermittlungSchriftgutobjekteNachricht
        {
            Kopf = new Models.Entities.Nachrichtenkopf
            {
                Version = "3.5.1",
                AktenzeichenAbsender = ["TEST-AZ-001"],
                AktenzeichenEmpfaenger = ["TEST-AZ-002"],
                Erstellungszeitpunkt = DateTime.UtcNow,
                EigeneNachrichtenId = "MSG-TEST-001",
            },
        };
    }

    private static string GetDatasetPath(Dataset dataset, string extension)
    {
        var fileName = $"{dataset.ToString().ToLowerInvariant()}.{extension}";
        var filePath = Path.Combine(ExampleDatasetsPath, fileName);

        if (!File.Exists(filePath))
        {
            throw new FileNotFoundException($"Dataset file not found: {filePath}");
        }

        return filePath;
    }

    private static string FindRepoRoot()
    {
        var dir = Directory.GetCurrentDirectory();
        while (dir != null)
        {
            if (Directory.Exists(Path.Combine(dir, ".git")))
            {
                return dir;
            }

            dir = Directory.GetParent(dir)?.FullName;
        }

        throw new InvalidOperationException("Could not find repository root");
    }
}