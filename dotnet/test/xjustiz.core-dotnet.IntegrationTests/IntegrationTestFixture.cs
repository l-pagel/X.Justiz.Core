// <copyright file="IntegrationTestFixture.cs" company="X.Justiz Core">
// Copyright (c) X.Justiz Core. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests;

using xjustiz.core_dotnet.IntegrationTests.Infrastructure;

/// <summary>
/// Shared fixture that manages API lifecycle across all integration tests.
/// Both APIs are started once and shared across all tests in the collection.
/// </summary>
public class IntegrationTestFixture : IAsyncLifetime
{
    private readonly ApiProcessManager apiManager;

    public IntegrationTestFixture()
    {
        apiManager = new ApiProcessManager();
        Client = new CrossApiClient();
        Comparer = new MessageComparer(
            // Paths that may differ and should be ignored
            "SchemaLocation" // Schema location may have minor formatting differences
        );
    }

    /// <summary>
    /// Gets the base URL for the .NET API.
    /// </summary>
    public string DotNetApiUrl => apiManager.DotNetApiBaseUrl;

    /// <summary>
    /// Gets the base URL for the Java API.
    /// </summary>
    public string JavaApiUrl => apiManager.JavaApiBaseUrl;

    /// <summary>
    /// Gets the cross-API HTTP client.
    /// </summary>
    public CrossApiClient Client { get; }

    /// <summary>
    /// Gets the message comparer for validation.
    /// </summary>
    public MessageComparer Comparer { get; }

    public async Task InitializeAsync()
    {
        Console.WriteLine(new string('=', 70));
        Console.WriteLine("  X.Justiz Core SDK - Cross-Platform Integration Tests");
        Console.WriteLine(new string('=', 70));
        Console.WriteLine();

        // First, validate the environment
        Console.WriteLine("Validating environment...");
        var validation = apiManager.ValidateEnvironment();
        Console.WriteLine(validation.ToString());
        Console.WriteLine();

        if (!validation.IsValid)
        {
            Console.WriteLine(new string('!', 70));
            Console.WriteLine("  ENVIRONMENT VALIDATION FAILED");
            Console.WriteLine("  Please fix the issues above before running the tests.");
            Console.WriteLine("  See README.md for setup instructions.");
            Console.WriteLine(new string('!', 70));
            throw new InvalidOperationException(
                "Environment validation failed. See console output for details.");
        }

        Console.WriteLine("Starting APIs...");
        Console.WriteLine();

        try
        {
            await apiManager.StartApisAsync();
            Console.WriteLine();
            Console.WriteLine(new string('=', 70));
            Console.WriteLine("  ✓ Both APIs are ready for testing!");
            Console.WriteLine($"    .NET API: {DotNetApiUrl}");
            Console.WriteLine($"    Java API: {JavaApiUrl}");
            Console.WriteLine(new string('=', 70));
            Console.WriteLine();
        }
        catch (Exception ex)
        {
            Console.WriteLine();
            Console.WriteLine(new string('!', 70));
            Console.WriteLine($"  FAILED TO START APIs");
            Console.WriteLine($"  Error: {ex.Message}");
            
            if (apiManager.StartupErrors.Count > 0)
            {
                Console.WriteLine();
                Console.WriteLine("  Recent errors:");
                foreach (var error in apiManager.StartupErrors.TakeLast(10))
                {
                    Console.WriteLine($"    - {error}");
                }
            }
            
            Console.WriteLine();
            Console.WriteLine("  See README.md for troubleshooting tips.");
            Console.WriteLine(new string('!', 70));
            throw;
        }
    }

    public async Task DisposeAsync()
    {
        Console.WriteLine("=".PadRight(60, '='));
        Console.WriteLine("Shutting down Integration Test APIs...");
        Console.WriteLine("=".PadRight(60, '='));

        Client.Dispose();
        await apiManager.DisposeAsync();
    }
}

/// <summary>
/// Collection definition for integration tests.
/// All tests in this collection share the same fixture instance.
/// </summary>
[CollectionDefinition("Integration Tests")]
public class IntegrationTestCollection : ICollectionFixture<IntegrationTestFixture>
{
    // This class has no code, it's just a marker for xUnit
}
