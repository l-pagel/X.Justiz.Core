// <copyright file="FullRoundTripCompatibilityTests.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests;

using xjustiz.core_dotnet.IntegrationTests.Infrastructure;

/// <summary>
/// Full round-trip tests: data goes from one API to the other and back.
/// These tests validate that the complete cycle preserves all data integrity.
/// </summary>
[Collection("Integration Tests")]
public class FullRoundTripCompatibilityTests(IntegrationTestFixture fixture)
{
    private readonly IntegrationTestFixture fixture = fixture;

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task FullRoundTrip_JavaDotNetJava_Json_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(dataset);

        // Act - Java → .NET → Java
        // Step 1: Serialize with Java API
        var jsonFromJava1 = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, original);
        var afterJava1 = fixture.Client.ParseJsonResponse(jsonFromJava1);

        // Step 2: Serialize with .NET API
        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, afterJava1);
        var afterDotNet = fixture.Client.ParseJsonResponse(jsonFromDotNet);

        // Step 3: Serialize with Java API again
        var jsonFromJava2 = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, afterDotNet);
        var finalMessage = fixture.Client.ParseJsonResponse(jsonFromJava2);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"FullRoundTrip_J→D→J_Json_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"full round-trip Java→.NET→Java should preserve all data. Differences:\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task FullRoundTrip_DotNetJavaDotNet_Json_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(dataset);

        // Act - .NET → Java → .NET
        // Step 1: Serialize with .NET API
        var jsonFromDotNet1 = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, original);
        var afterDotNet1 = fixture.Client.ParseJsonResponse(jsonFromDotNet1);

        // Step 2: Serialize with Java API
        var jsonFromJava = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, afterDotNet1);
        var afterJava = fixture.Client.ParseJsonResponse(jsonFromJava);

        // Step 3: Serialize with .NET API again
        var jsonFromDotNet2 = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, afterJava);
        var finalMessage = fixture.Client.ParseJsonResponse(jsonFromDotNet2);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"FullRoundTrip_D→J→D_Json_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"full round-trip .NET→Java→.NET should preserve all data. Differences:\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task FullRoundTrip_JavaDotNetJava_Xml_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = TestDataProvider.LoadDatasetFromXml(dataset);

        // Act - Java → .NET → Java (XML)
        var xmlFromJava1 = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, original);
        var afterJava1 = fixture.Client.ParseXmlResponse(xmlFromJava1);

        var xmlFromDotNet = await fixture.Client.SendXmlHttpAsync(fixture.DotNetApiUrl, afterJava1);
        var afterDotNet = fixture.Client.ParseXmlResponse(xmlFromDotNet);

        var xmlFromJava2 = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, afterDotNet);
        var finalMessage = fixture.Client.ParseXmlResponse(xmlFromJava2);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"FullRoundTrip_J→D→J_Xml_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"full round-trip Java→.NET→Java (XML) should preserve all data. Differences:\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task FullRoundTrip_DotNetJavaDotNet_Xml_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange
        var original = TestDataProvider.LoadDatasetFromXml(dataset);

        // Act - .NET → Java → .NET (XML)
        var xmlFromDotNet1 = await fixture.Client.SendXmlHttpAsync(fixture.DotNetApiUrl, original);
        var afterDotNet1 = fixture.Client.ParseXmlResponse(xmlFromDotNet1);

        var xmlFromJava = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, afterDotNet1);
        var afterJava = fixture.Client.ParseXmlResponse(xmlFromJava);

        var xmlFromDotNet2 = await fixture.Client.SendXmlHttpAsync(fixture.DotNetApiUrl, afterJava);
        var finalMessage = fixture.Client.ParseXmlResponse(xmlFromDotNet2);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"FullRoundTrip_D→J→D_Xml_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"full round-trip .NET→Java→.NET (XML) should preserve all data. Differences:\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task MixedFormat_JsonToXmlToJson_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange - Start with JSON
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(dataset);

        // Act
        // Step 1: Send as JSON to .NET, receive as XML
        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, original);
        var afterDotNetJson = fixture.Client.ParseJsonResponse(jsonFromDotNet);

        // Step 2: Convert to XML via Java API
        var xmlFromJava = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, afterDotNetJson);
        var afterJavaXml = fixture.Client.ParseXmlResponse(xmlFromJava);

        // Step 3: Convert back to JSON via .NET API
        var jsonFromDotNet2 = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, afterJavaXml);
        var finalMessage = fixture.Client.ParseJsonResponse(jsonFromDotNet2);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"MixedFormat_Json→Xml→Json_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"mixed format round-trip should preserve all data. Differences:\n{report}");
    }

    [Theory]
    [MemberData(nameof(TestDataProvider.AllDatasets), MemberType = typeof(TestDataProvider))]
    public async Task MixedFormat_XmlToJsonToXml_ShouldPreserveAllData(TestDataProvider.Dataset dataset)
    {
        // Arrange - Start with XML
        var original = TestDataProvider.LoadDatasetFromXml(dataset);

        // Act
        // Step 1: Send as XML to Java, receive
        var xmlFromJava = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, original);
        var afterJavaXml = fixture.Client.ParseXmlResponse(xmlFromJava);

        // Step 2: Convert to JSON via .NET API
        var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, afterJavaXml);
        var afterDotNetJson = fixture.Client.ParseJsonResponse(jsonFromDotNet);

        // Step 3: Convert back to XML via Java API
        var xmlFromJava2 = await fixture.Client.SendXmlHttpAsync(fixture.JavaApiUrl, afterDotNetJson);
        var finalMessage = fixture.Client.ParseXmlResponse(xmlFromJava2);

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, finalMessage, out var differences);

        var report = MessageComparer.CreateReport(differences, $"MixedFormat_Xml→Json→Xml_{dataset}");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"mixed format round-trip should preserve all data. Differences:\n{report}");
    }

    [Fact]
    public async Task StressTest_MultipleRoundTrips_ShouldMaintainDataIntegrity()
    {
        // Arrange
        var original = await TestDataProvider.LoadDatasetFromJsonAsync(TestDataProvider.Dataset.Mietrecht);
        var current = original;

        // Act - 5 complete round-trips
        for (var i = 0; i < 5; i++)
        {
            var jsonFromDotNet = await fixture.Client.SendJsonHttpAsync(fixture.DotNetApiUrl, current);
            current = fixture.Client.ParseJsonResponse(jsonFromDotNet);

            var jsonFromJava = await fixture.Client.SendJsonHttpAsync(fixture.JavaApiUrl, current);
            current = fixture.Client.ParseJsonResponse(jsonFromJava);
        }

        // Assert
        var isEqual = fixture.Comparer.AreEqual(original, current, out var differences);

        var report = MessageComparer.CreateReport(differences, "StressTest_5RoundTrips");
        Console.WriteLine(report);

        isEqual.Should().BeTrue(because: $"data should remain stable after 5 complete round-trips. Differences:\n{report}");
    }
}
