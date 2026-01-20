// <copyright file="ApiProcessManager.cs" company="X.Justiz Core">
// Copyright (c) X.Justiz Core. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests.Infrastructure;

using System.Diagnostics;
using System.Net;
using System.Net.Http;
using System.Net.Sockets;
using System.Runtime.InteropServices;

/// <summary>
/// Manages the lifecycle of Java and .NET API processes for integration testing.
/// Includes robust error handling for common setup issues.
/// </summary>
public class ApiProcessManager : IAsyncDisposable
{
    private const int DotNetPort = 5050;
    private const int JavaPort = 8080;
    private const int StartupTimeoutSeconds = 120;
    private const int HealthCheckIntervalMs = 1000;

    private readonly string repoRoot;
    private readonly List<string> startupErrors = new();
    private Process? dotNetProcess;
    private Process? javaProcess;

    public ApiProcessManager()
    {
        repoRoot = FindRepoRoot();
    }

    public string DotNetApiBaseUrl => $"http://localhost:{DotNetPort}";
    public string JavaApiBaseUrl => $"http://localhost:{JavaPort}";

    /// <summary>
    /// Gets any startup errors that occurred.
    /// </summary>
    public IReadOnlyList<string> StartupErrors => startupErrors.AsReadOnly();

    /// <summary>
    /// Validates the environment before starting APIs.
    /// </summary>
    public EnvironmentValidationResult ValidateEnvironment()
    {
        var result = new EnvironmentValidationResult();

        // Check .NET SDK
        result.DotNetSdkInstalled = IsDotNetSdkInstalled();
        if (!result.DotNetSdkInstalled)
        {
            result.Errors.Add("❌ .NET SDK not found. Please install .NET 8.0 SDK or later.");
        }

        // Check Java
        result.JavaInstalled = IsJavaInstalled(out var javaVersion);
        result.JavaVersion = javaVersion;
        if (!result.JavaInstalled)
        {
            result.Errors.Add("❌ Java not found. Please install Java 17 or later and ensure JAVA_HOME is set or java is in PATH.");
        }

        // Check Gradle wrapper
        var gradleWrapperPath = Path.Combine(repoRoot, "java", "gradlew.bat");
        result.GradleWrapperExists = File.Exists(gradleWrapperPath);
        if (!result.GradleWrapperExists)
        {
            result.Errors.Add($"❌ Gradle wrapper not found at: {gradleWrapperPath}");
        }

        // Check ports
        result.DotNetPortAvailable = IsPortAvailable(DotNetPort);
        if (!result.DotNetPortAvailable)
        {
            // result.Errors.Add($"❌ Port {DotNetPort} is already in use. Stop the process using it or change the port.");
            Log($"[WARN] Port {DotNetPort} is in use. Assuming .NET API is already running.");
        }

        result.JavaPortAvailable = IsPortAvailable(JavaPort);
        if (!result.JavaPortAvailable)
        {
            // result.Errors.Add($"❌ Port {JavaPort} is already in use. Stop the process using it or change the port.");
            Log($"[WARN] Port {JavaPort} is in use. Assuming Java API is already running.");
        }

        // Check example-api projects exist
        var dotNetApiPath = Path.Combine(repoRoot, "dotnet", "example-api", "example-api.csproj");
        result.DotNetApiExists = File.Exists(dotNetApiPath);
        if (!result.DotNetApiExists)
        {
            result.Errors.Add($"❌ .NET example-api not found at: {dotNetApiPath}");
        }

        var javaApiPath = Path.Combine(repoRoot, "java", "example-api", "build.gradle.kts");
        result.JavaApiExists = File.Exists(javaApiPath);
        if (!result.JavaApiExists)
        {
            result.Errors.Add($"❌ Java example-api not found at: {javaApiPath}");
        }

        // Check example datasets
        var datasetsPath = Path.Combine(repoRoot, "example-datasets");
        result.ExampleDatasetsExist = Directory.Exists(datasetsPath) && 
            Directory.GetFiles(datasetsPath, "*.json").Length > 0;
        if (!result.ExampleDatasetsExist)
        {
            result.Errors.Add($"❌ Example datasets not found at: {datasetsPath}");
        }

        result.IsValid = result.Errors.Count == 0;
        return result;
    }

    /// <summary>
    /// Starts both APIs and waits for them to be ready.
    /// Validates environment first.
    /// </summary>
    public async Task StartApisAsync()
    {
        var validation = ValidateEnvironment();
        
        if (!validation.IsValid)
        {
            var errorMessage = "Environment validation failed:\n" + string.Join("\n", validation.Errors);
            Log($"[FATAL] {errorMessage}");
            throw new InvalidOperationException(errorMessage);
        }

        Log("[INFO] Environment validation passed ✓");
        Log($"[INFO] Java version: {validation.JavaVersion}");
        Log($"[INFO] Repository root: {repoRoot}");

        await StartDotNetApiAsync();
        await StartJavaApiAsync();
    }

    /// <summary>
    /// Starts the .NET API.
    /// </summary>
    public async Task StartDotNetApiAsync()
    {
        if (!IsPortAvailable(DotNetPort))
        {
             Log($"[INFO] Port {DotNetPort} is in use. Skipping .NET API startup and attaching to existing process.");
             await WaitForApiHealthAsync(DotNetApiBaseUrl, ".NET API");
             return;
        }

        Log("[INFO] Starting .NET API...");
        
        var dotNetApiPath = Path.Combine(repoRoot, "dotnet", "example-api");
        
        var startInfo = new ProcessStartInfo
        {
            FileName = "dotnet",
            Arguments = $"run --urls {DotNetApiBaseUrl}",
            WorkingDirectory = dotNetApiPath,
            UseShellExecute = false,
            RedirectStandardOutput = true,
            RedirectStandardError = true,
            CreateNoWindow = true
        };

        dotNetProcess = new Process { StartInfo = startInfo };
        dotNetProcess.OutputDataReceived += (s, e) => { if (!string.IsNullOrEmpty(e.Data)) Log($"[.NET] {e.Data}"); };
        dotNetProcess.ErrorDataReceived += (s, e) => 
        { 
            if (!string.IsNullOrEmpty(e.Data)) 
            {
                Log($"[.NET ERR] {e.Data}");
                startupErrors.Add($".NET: {e.Data}");
            }
        };

        try
        {
            dotNetProcess.Start();
            dotNetProcess.BeginOutputReadLine();
            dotNetProcess.BeginErrorReadLine();
        }
        catch (Exception ex)
        {
            throw new InvalidOperationException($"Failed to start .NET API: {ex.Message}", ex);
        }

        await WaitForApiHealthAsync(DotNetApiBaseUrl, ".NET API");
    }

    /// <summary>
    /// Starts the Java API.
    /// </summary>
    public async Task StartJavaApiAsync()
    {
        if (!IsPortAvailable(JavaPort))
        {
             Log($"[INFO] Port {JavaPort} is in use. Skipping Java API startup and attaching to existing process.");
             await WaitForApiHealthAsync(JavaApiBaseUrl, "Java API");
             return;
        }

        Log("[INFO] Starting Java API...");
        
        var javaPath = Path.Combine(repoRoot, "java");
        
        ProcessStartInfo startInfo;
        
        if (RuntimeInformation.IsOSPlatform(OSPlatform.Windows))
        {
            // On Windows, use cmd.exe to run the batch file
            var gradleWrapperPath = Path.Combine(javaPath, "gradlew.bat");
            startInfo = new ProcessStartInfo
            {
                FileName = "cmd.exe",
                Arguments = $"/c \"{gradleWrapperPath}\" :example-api:bootRun",
                WorkingDirectory = javaPath,
                UseShellExecute = false,
                RedirectStandardOutput = true,
                RedirectStandardError = true,
                CreateNoWindow = true
            };
        }
        else
        {
            // On Unix, use the shell script directly
            var gradleWrapperPath = Path.Combine(javaPath, "gradlew");
            startInfo = new ProcessStartInfo
            {
                FileName = "/bin/bash",
                Arguments = $"-c \"{gradleWrapperPath} :example-api:bootRun\"",
                WorkingDirectory = javaPath,
                UseShellExecute = false,
                RedirectStandardOutput = true,
                RedirectStandardError = true,
                CreateNoWindow = true
            };
        }

        javaProcess = new Process { StartInfo = startInfo };
        javaProcess.OutputDataReceived += (s, e) => { if (!string.IsNullOrEmpty(e.Data)) Log($"[Java] {e.Data}"); };
        javaProcess.ErrorDataReceived += (s, e) => 
        { 
            if (!string.IsNullOrEmpty(e.Data)) 
            {
                Log($"[Java ERR] {e.Data}");
                startupErrors.Add($"Java: {e.Data}");
            }
        };

        try
        {
            javaProcess.Start();
            javaProcess.BeginOutputReadLine();
            javaProcess.BeginErrorReadLine();
        }
        catch (Exception ex)
        {
            throw new InvalidOperationException($"Failed to start Java API: {ex.Message}", ex);
        }

        await WaitForApiHealthAsync(JavaApiBaseUrl, "Java API");
    }

    private async Task WaitForApiHealthAsync(string baseUrl, string apiName)
    {
        using var httpClient = new HttpClient { Timeout = TimeSpan.FromSeconds(10) };
        var startTime = DateTime.UtcNow;
        var lastError = "";

        // Different Swagger URLs for each API
        var swaggerUrl = apiName.Contains("Java") 
            ? $"{baseUrl}/swagger-ui.html"  // Spring Boot with springdoc
            : $"{baseUrl}/swagger/index.html";  // ASP.NET Core

        Log($"[INFO] Waiting for {apiName} to become ready at {baseUrl}...");
        Log($"[INFO] Health check URL: {swaggerUrl}");

        while ((DateTime.UtcNow - startTime).TotalSeconds < StartupTimeoutSeconds)
        {
            // Check if process died
            var process = apiName.Contains(".NET") ? dotNetProcess : javaProcess;
            if (process != null && process.HasExited)
            {
                var exitCode = process.ExitCode;
                var errorMsg = $"{apiName} process exited unexpectedly with code {exitCode}";
                if (startupErrors.Count > 0)
                {
                    errorMsg += $"\nRecent errors:\n{string.Join("\n", startupErrors.TakeLast(10))}";
                }
                throw new InvalidOperationException(errorMsg);
            }

            try
            {
                // Try to hit the swagger endpoint to check if it's up
                var response = await httpClient.GetAsync(swaggerUrl);
                if (response.IsSuccessStatusCode)
                {
                    Log($"[INFO] ✓ {apiName} is ready at {baseUrl}");
                    return;
                }
                lastError = $"HTTP {(int)response.StatusCode}";
            }
            catch (HttpRequestException ex)
            {
                lastError = ex.Message;
            }
            catch (TaskCanceledException)
            {
                lastError = "Connection timeout";
            }

            var elapsed = (DateTime.UtcNow - startTime).TotalSeconds;
            if (elapsed % 10 < 1) // Log every ~10 seconds
            {
                Log($"[INFO] Still waiting for {apiName}... ({elapsed:F0}s elapsed, last: {lastError})");
            }

            await Task.Delay(HealthCheckIntervalMs);
        }

        var timeoutMessage = $"{apiName} did not start within {StartupTimeoutSeconds} seconds. Last error: {lastError}";
        if (startupErrors.Count > 0)
        {
            timeoutMessage += $"\nRecent errors:\n{string.Join("\n", startupErrors.TakeLast(10))}";
        }
        throw new TimeoutException(timeoutMessage);
    }

    public async ValueTask DisposeAsync()
    {
        Log("[INFO] Shutting down APIs...");
        await StopProcessAsync(dotNetProcess, ".NET API");
        await StopProcessAsync(javaProcess, "Java API");
        Log("[INFO] All APIs stopped.");
        GC.SuppressFinalize(this);
    }

    private static async Task StopProcessAsync(Process? process, string name)
    {
        if (process == null || process.HasExited)
            return;

        try
        {
            Log($"[INFO] Stopping {name}...");
            
            if (RuntimeInformation.IsOSPlatform(OSPlatform.Windows))
            {
                // On Windows, use taskkill to kill process tree
                var killProcess = Process.Start(new ProcessStartInfo
                {
                    FileName = "taskkill",
                    Arguments = $"/T /F /PID {process.Id}",
                    CreateNoWindow = true,
                    UseShellExecute = false,
                    RedirectStandardOutput = true,
                    RedirectStandardError = true
                });
                if (killProcess != null)
                {
                    await killProcess.WaitForExitAsync();
                }
            }
            else
            {
                process.Kill(entireProcessTree: true);
            }

            // Wait for process to fully exit
            using var cts = new CancellationTokenSource(TimeSpan.FromSeconds(10));
            try
            {
                await process.WaitForExitAsync(cts.Token);
            }
            catch (OperationCanceledException)
            {
                Log($"[WARN] {name} did not exit gracefully, forcing termination.");
                process.Kill();
            }
            
            Log($"[INFO] ✓ {name} stopped.");
        }
        catch (Exception ex)
        {
            Log($"[WARN] Error stopping {name}: {ex.Message}");
        }
        finally
        {
            process.Dispose();
        }
    }

    #region Environment Validation Helpers

    private static bool IsDotNetSdkInstalled()
    {
        try
        {
            var process = Process.Start(new ProcessStartInfo
            {
                FileName = "dotnet",
                Arguments = "--version",
                UseShellExecute = false,
                RedirectStandardOutput = true,
                CreateNoWindow = true
            });
            process?.WaitForExit(5000);
            return process?.ExitCode == 0;
        }
        catch
        {
            return false;
        }
    }

    private static bool IsJavaInstalled(out string version)
    {
        version = "Unknown";
        try
        {
            var process = new Process
            {
                StartInfo = new ProcessStartInfo
                {
                    FileName = "java",
                    Arguments = "-version",
                    UseShellExecute = false,
                    RedirectStandardOutput = true,
                    RedirectStandardError = true,
                    CreateNoWindow = true
                }
            };
            process.Start();
            // Java outputs version to stderr, not stdout
            var output = process.StandardError.ReadToEnd();
            process.WaitForExit(5000);
            
            if (process.ExitCode == 0 && !string.IsNullOrEmpty(output))
            {
                // Parse version from output like: openjdk version "17.0.1" 2021-10-19
                var lines = output.Split('\n');
                if (lines.Length > 0)
                {
                    version = lines[0].Trim();
                }
                return true;
            }
            return false;
        }
        catch
        {
            return false;
        }
    }

    private static bool IsPortAvailable(int port)
    {
        try
        {
            using var socket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
            socket.Bind(new IPEndPoint(IPAddress.Loopback, port));
            return true;
        }
        catch (SocketException)
        {
            return false;
        }
    }

    private static string FindRepoRoot()
    {
        // Try current directory first
        var dir = Directory.GetCurrentDirectory();
        while (dir != null)
        {
            if (Directory.Exists(Path.Combine(dir, ".git")))
            {
                return dir;
            }
            dir = Directory.GetParent(dir)?.FullName;
        }

        // Try to find from assembly location
        var assemblyLocation = typeof(ApiProcessManager).Assembly.Location;
        dir = Path.GetDirectoryName(assemblyLocation);
        while (dir != null)
        {
            if (Directory.Exists(Path.Combine(dir, ".git")))
            {
                return dir;
            }
            dir = Directory.GetParent(dir)?.FullName;
        }

        throw new InvalidOperationException(
            "Could not find repository root. Make sure you're running tests from within the X.Justiz.Core repository.");
    }

    #endregion

    private static void Log(string message)
    {
        Console.WriteLine($"[{DateTime.Now:HH:mm:ss}] {message}");
    }
}

/// <summary>
/// Result of environment validation.
/// </summary>
public class EnvironmentValidationResult
{
    public bool IsValid { get; set; }
    public bool DotNetSdkInstalled { get; set; }
    public bool JavaInstalled { get; set; }
    public string JavaVersion { get; set; } = "";
    public bool GradleWrapperExists { get; set; }
    public bool DotNetPortAvailable { get; set; }
    public bool JavaPortAvailable { get; set; }
    public bool DotNetApiExists { get; set; }
    public bool JavaApiExists { get; set; }
    public bool ExampleDatasetsExist { get; set; }
    public List<string> Errors { get; } = new();

    public override string ToString()
    {
        return $@"Environment Validation Result:
  .NET SDK: {(DotNetSdkInstalled ? "✓" : "✗")}
  Java: {(JavaInstalled ? $"✓ ({JavaVersion})" : "✗")}
  Gradle Wrapper: {(GradleWrapperExists ? "✓" : "✗")}
  Port {5050} (dotnet): {(DotNetPortAvailable ? "✓ Available" : "✗ In Use")}
  Port {8080} (java): {(JavaPortAvailable ? "✓ Available" : "✗ In Use")}
  .NET API: {(DotNetApiExists ? "✓" : "✗")}
  Java API: {(JavaApiExists ? "✓" : "✗")}
  Example Datasets: {(ExampleDatasetsExist ? "✓" : "✗")}
  Overall: {(IsValid ? "✓ VALID" : "✗ INVALID")}";
    }
}
