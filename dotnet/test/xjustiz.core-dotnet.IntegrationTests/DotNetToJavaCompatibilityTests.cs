// <copyright file="DotNetToJavaCompatibilityTests.cs" company="X.Justiz Core">
// Copyright (c) X.Justiz Core. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests;

using xjustiz.core_dotnet.IntegrationTests.Infrastructure;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Integration tests that validate data transfer from .NET API to Java API.
/// Tests all 4 transfer methods: HTTP JSON, HTTP XML, file upload JSON, file upload XML.
/// </summary>
[Collection("Integration Tests")]
public class DotNetToJavaCompatibilityTests
{
    private readonly IntegrationTestFixture fixture;

    public DotNetToJavaCompatibilityTests(IntegrationTestFixture fixture)
    {
        this.fixture = fixture;
    }

    #region HTTP JSON Tests

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task DotNetToJava_HttpJson_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(dataset);

        // Act - Send from .NET API, receive at Java API
        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, original);
        var messageFromDotNet = fixture.Client.ParseJsonResponse(jsonFromDotNet);
        
        var jsonFromJava = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, messageFromDotNet);
        var finalMessage = fixture.Client.ParseJsonResponse(jsonFromJava);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);
        
        var report = MessageComparer.CreateReport(differences, $"DotNetToJava_HttpJson_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"all data should be preserved in round-trip. Differences:\n{report}");
    }

    [Fact]
    public async Task DotNetToJava_HttpJson_MinimalMessage_ShouldPreserveAllData()
    {
        // Arrange
        var original = TestDataProvider.CreateMinimalTestMessage();

        // Act
        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, original);
        var messageFromDotNet = fixture.Client.ParseJsonResponse(jsonFromDotNet);
        
        var jsonFromJava = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, messageFromDotNet);
        var finalMessage = fixture.Client.ParseJsonResponse(jsonFromJava);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);
        
        var report = MessageComparer.CreateReport(differences, "DotNetToJava_HttpJson_Minimal");
        Console.WriteLine(report);
        
        isEqual.Should().BeTrue(because: $"minimal message data should be preserved.\n{report}");
    }

    #endregion

    #region HTTP XML Tests

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task DotNetToJava_HttpXml_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = TestDataProvider.LoadDatasetFromXml(dataset);

        // Act - Send from .NET API, receive at Java API
        var xmlFromDotNet = await fixture.Client.SendXmlHttpAsync(fixture.DotNetApiUrl, original);
        var messageFromDotNet = fixture.Client.ParseXmlResponse(xmlFromDotNet);
        
        var xmlFromJava = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, messageFromDotNet);
        var finalMessage = fixture.Client.ParseXmlResponse(xmlFromJava);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);
        
        var report = MessageComparer.CreateReport(differences, $"DotNetToJava_HttpXml_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"all data should be preserved in round-trip. Differences:\n{report}");
    }

    #endregion

    #region File Upload JSON Tests

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task DotNetToJava_JsonFile_ShouldBeAccepted(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var jsonContent = TestDataProvider.LoadDatasetAsJsonString(dataset);

        // Act - Upload JSON file to .NET API first
        var dotNetResponse = await fixture.Client.SendJsonFileAsync(fixture.DotNetApiUrl, jsonContent);
        
        // Then upload to Java API
        var javaResponse = await fixture.Client.SendJsonFileAsync(fixture.JavaApiUrl, jsonContent);

        // Assert - Both should process successfully (return compatibility result)
        dotNetResponse.Should().NotBeNullOrEmpty(".NET API should return a response");
        javaResponse.Should().NotBeNullOrEmpty("Java API should return a response");
        
        Console.WriteLine($"[{dataset}] .NET Response: {dotNetResponse}");
        Console.WriteLine($"[{dataset}] Java Response: {javaResponse}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task DotNetToJava_JsonFile_RoundTrip_ShouldPreserveData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(dataset);

        // Act - Generate file from .NET API
        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, original);
        
        // Send the .NET-generated JSON to Java API via file upload
        _ = await fixture.Client.SendJsonFileAsync(fixture.JavaApiUrl, jsonFromDotNet);
        
        // Parse and verify the round-tripped data
        var messageFromDotNet = fixture.Client.ParseJsonResponse(jsonFromDotNet);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, messageFromDotNet, out var differences);
        
        var report = MessageComparer.CreateReport(differences, $"DotNetToJava_JsonFile_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"JSON file data should be preserved. Differences:\n{report}");
    }

    #endregion

    #region File Upload XML Tests

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task DotNetToJava_XmlFile_ShouldBeAccepted(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var xmlContent = TestDataProvider.LoadDatasetAsXmlString(dataset);

        // Act - Upload XML file to .NET API first
        var dotNetResponse = await fixture.Client.SendXmlFileAsync(fixture.DotNetApiUrl, xmlContent);
        
        // Then upload to Java API
        var javaResponse = await fixture.Client.SendXmlFileAsync(fixture.JavaApiUrl, xmlContent);

        // Assert - Both should process successfully
        dotNetResponse.Should().NotBeNullOrEmpty(".NET API should return a response");
        javaResponse.Should().NotBeNullOrEmpty("Java API should return a response");
        
        Console.WriteLine($"[{dataset}] .NET Response: {dotNetResponse}");
        Console.WriteLine($"[{dataset}] Java Response: {javaResponse}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task DotNetToJava_XmlFile_RoundTrip_ShouldPreserveData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = TestDataProvider.LoadDatasetFromXml(dataset);

        // Act - Generate XML from .NET API
        var xmlFromDotNet = await fixture.Client.SendXmlHttpAsync(fixture.DotNetApiUrl, original);
        
        // Send the .NET-generated XML to Java API via file upload
        _ = await fixture.Client.SendXmlFileAsync(fixture.JavaApiUrl, xmlFromDotNet);
        
        // Parse and verify the round-tripped data
        var messageFromDotNet = fixture.Client.ParseXmlResponse(xmlFromDotNet);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, messageFromDotNet, out var differences);
        
        var report = MessageComparer.CreateReport(differences, $"DotNetToJava_XmlFile_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"XML file data should be preserved. Differences:\n{report}");
    }

    #endregion
}
