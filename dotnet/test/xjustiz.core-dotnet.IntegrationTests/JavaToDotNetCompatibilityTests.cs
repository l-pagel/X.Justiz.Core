// <copyright file="JavaToDotNetCompatibilityTests.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests;

using xjustiz.core_dotnet.IntegrationTests.Infrastructure;

/// <summary>
/// Integration tests that validate data transfer from Java API to .NET API.
/// Tests all 4 transfer methods: HTTP JSON, HTTP XML, file upload JSON, file upload XML.
/// </summary>
[Collection("Integration Tests")]
public class JavaToDotNetCompatibilityTests
{
    private readonly IntegrationTestFixture fixture;

    public JavaToDotNetCompatibilityTests(IntegrationTestFixture fixture) => this.fixture = fixture;

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task JavaToDotNet_HttpJson_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(dataset);

        // Act - Send from Java API, receive at .NET API
        var jsonFromJava = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, original);
        var messageFromJava = fixture.Client.ParseJsonResponse(jsonFromJava);

        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, messageFromJava);
        var finalMessage = fixture.Client.ParseJsonResponse(jsonFromDotNet);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"JavaToDotNet_HttpJson_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"all data should be preserved in round-trip. Differences:\n{report}");
    }

    [Fact]
    public async Task JavaToDotNet_HttpJson_MinimalMessage_ShouldPreserveAllData()
    {
        // Arrange
        var original = TestDataProvider.CreateMinimalTestMessage();

        // Act
        var jsonFromJava = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, original);
        var messageFromJava = fixture.Client.ParseJsonResponse(jsonFromJava);

        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, messageFromJava);
        var finalMessage = fixture.Client.ParseJsonResponse(jsonFromDotNet);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, "JavaToDotNet_HttpJson_Minimal");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"minimal message data should be preserved.\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task JavaToDotNet_HttpXml_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = TestDataProvider.LoadDatasetFromXml(dataset);

        // Act - Send from Java API, receive at .NET API
        var xmlFromJava = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, original);
        var messageFromJava = fixture.Client.ParseXmlResponse(xmlFromJava);

        var xmlFromDotNet = await fixture.Client.SendXmlHttpAsync(fixture.DotNetApiUrl, messageFromJava);
        var finalMessage = fixture.Client.ParseXmlResponse(xmlFromDotNet);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"JavaToDotNet_HttpXml_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"all data should be preserved in round-trip. Differences:\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task JavaToDotNet_JsonFile_ShouldBeAccepted(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var jsonContent = TestDataProvider.LoadDatasetAsJsonString(dataset);

        // Act - Upload JSON file to Java API first
        var javaResponse = await fixture.Client.SendJsonFileAsync(fixture.JavaApiUrl, jsonContent);

        // Then upload to .NET API
        var dotNetResponse = await fixture.Client.SendJsonFileAsync(fixture.DotNetApiUrl, jsonContent);

        // Assert - Both should process successfully (return compatibility result)
        javaResponse.Should().NotBeNullOrEmpty("Java API should return a response");
        dotNetResponse.Should().NotBeNullOrEmpty(".NET API should return a response");

        // Both responses should contain "Compatible" or similar
        Console.WriteLine($"[{dataset}] Java Response: {javaResponse}");
        Console.WriteLine($"[{dataset}] .NET Response: {dotNetResponse}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task JavaToDotNet_JsonFile_RoundTrip_ShouldPreserveData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(dataset);
        _ = fixture.Client.SerializeToJson(original);

        // Act - Generate file from Java API
        var jsonFromJava = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, original);

        // Send the Java-generated JSON to .NET API via file upload
        _ = await fixture.Client.SendJsonFileAsync(fixture.DotNetApiUrl, jsonFromJava);

        // Parse and verify the round-tripped data
        var messageFromJava = fixture.Client.ParseJsonResponse(jsonFromJava);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, messageFromJava, out var differences);

        var report = MessageComparer.CreateReport(differences, $"JavaToDotNet_JsonFile_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"JSON file data should be preserved. Differences:\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task JavaToDotNet_XmlFile_ShouldBeAccepted(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var xmlContent = TestDataProvider.LoadDatasetAsXmlString(dataset);

        // Act - Upload XML file to Java API first
        var javaResponse = await fixture.Client.SendXmlFileAsync(fixture.JavaApiUrl, xmlContent);

        // Then upload to .NET API
        var dotNetResponse = await fixture.Client.SendXmlFileAsync(fixture.DotNetApiUrl, xmlContent);

        // Assert - Both should process successfully
        javaResponse.Should().NotBeNullOrEmpty("Java API should return a response");
        dotNetResponse.Should().NotBeNullOrEmpty(".NET API should return a response");

        Console.WriteLine($"[{dataset}] Java Response: {javaResponse}");
        Console.WriteLine($"[{dataset}] .NET Response: {dotNetResponse}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task JavaToDotNet_XmlFile_RoundTrip_ShouldPreserveData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = TestDataProvider.LoadDatasetFromXml(dataset);

        // Act - Generate XML from Java API
        var xmlFromJava = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, original);

        // Send the Java-generated XML to .NET API via file upload
        _ = await fixture.Client.SendXmlFileAsync(fixture.DotNetApiUrl, xmlFromJava);

        // Parse and verify the round-tripped data
        var messageFromJava = fixture.Client.ParseXmlResponse(xmlFromJava);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, messageFromJava, out var differences);

        var report = MessageComparer.CreateReport(differences, $"JavaToDotNet_XmlFile_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"XML file data should be preserved. Differences:\n{report}");
    }
}
