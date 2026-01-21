// <copyright file="CrossApiClient.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests.Infrastructure;

using System.Globalization;
using System.Net.Http.Headers;
using System.Text;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Models.Helpers;

/// <summary>
/// Custom DateTime converter that handles various ISO 8601 formats from both Java and .NET.
/// </summary>
public class FlexibleDateTimeConverter : JsonConverter<DateTime>
{
    private static readonly string[] SupportedFormats =
    [
        "yyyy-MM-ddTHH:mm:ss.fffffffZ",
        "yyyy-MM-ddTHH:mm:ss.ffffffZ",
        "yyyy-MM-ddTHH:mm:ss.fffffZ",
        "yyyy-MM-ddTHH:mm:ss.ffffZ",
        "yyyy-MM-ddTHH:mm:ss.fffZ",
        "yyyy-MM-ddTHH:mm:ss.ffZ",
        "yyyy-MM-ddTHH:mm:ss.fZ",
        "yyyy-MM-ddTHH:mm:ssZ",
        "yyyy-MM-ddTHH:mm:ss.fffffffzzz",
        "yyyy-MM-ddTHH:mm:ss.ffffffzzz",
        "yyyy-MM-ddTHH:mm:ss.fffffzzz",
        "yyyy-MM-ddTHH:mm:ss.ffffzzz",
        "yyyy-MM-ddTHH:mm:ss.fffzzz",
        "yyyy-MM-ddTHH:mm:ss.ffzzz",
        "yyyy-MM-ddTHH:mm:ss.fzzz",
        "yyyy-MM-ddTHH:mm:sszzz",
        "yyyy-MM-ddTHH:mm:ss",
        "yyyy-MM-dd",
        "yyyy-MM-ddTHH:mm:ss.SSSSSSSXXX",
    ];

    public override DateTime Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        if (reader.TokenType == JsonTokenType.Null)
        {
            return default;
        }

        // Handle numeric timestamps (Unix epoch milliseconds or seconds)
        if (reader.TokenType == JsonTokenType.Number)
        {
            // Try reading as long (milliseconds)
            if (reader.TryGetInt64(out var unixTimeMs))
            {
                return DateTimeOffset.FromUnixTimeMilliseconds(unixTimeMs).UtcDateTime;
            }

            // Try reading as double (may have fractional seconds)
            if (reader.TryGetDouble(out var unixTimeDouble))
            {
                // Assume milliseconds if > 1 billion, otherwise seconds
                if (unixTimeDouble > 1_000_000_000_000)
                {
                    return DateTimeOffset.FromUnixTimeMilliseconds((long)unixTimeDouble).UtcDateTime;
                }
                else
                {
                    return DateTimeOffset.FromUnixTimeSeconds((long)unixTimeDouble).UtcDateTime;
                }
            }

            throw new JsonException($"Unable to read DateTime from number");
        }

        if (reader.TokenType == JsonTokenType.String)
        {
            var dateString = reader.GetString();
            if (string.IsNullOrEmpty(dateString))
            {
                return default;
            }

            // Try standard parsing first
            if (DateTime.TryParse(dateString, CultureInfo.InvariantCulture, DateTimeStyles.RoundtripKind, out var result))
            {
                return result;
            }

            // Try each known format
            foreach (var format in SupportedFormats)
            {
                if (DateTime.TryParseExact(dateString, format, CultureInfo.InvariantCulture, DateTimeStyles.RoundtripKind, out result))
                {
                    return result;
                }
            }

            // Try DateTimeOffset parsing for timezone offsets
            if (DateTimeOffset.TryParse(dateString, CultureInfo.InvariantCulture, DateTimeStyles.RoundtripKind, out var offsetResult))
            {
                return offsetResult.UtcDateTime;
            }

            throw new JsonException($"Unable to parse DateTime value: {dateString}");
        }

        throw new JsonException($"Unexpected token type for DateTime: {reader.TokenType}");
    }

    public override void Write(Utf8JsonWriter writer, DateTime value, JsonSerializerOptions options)
    {
        // Write in ISO 8601 format with Z suffix for UTC
        writer.WriteStringValue(value.ToUniversalTime().ToString("yyyy-MM-ddTHH:mm:ss.fffffffZ", CultureInfo.InvariantCulture));
    }
}

/// <summary>
/// HTTP client for sending data between Java and .NET APIs.
/// </summary>
public sealed class CrossApiClient : IDisposable
{
    private readonly HttpClient httpClient;
    private readonly JsonSerializerOptions jsonOptions;
    private bool disposed;

    public CrossApiClient()
    {
        httpClient = new HttpClient { Timeout = TimeSpan.FromSeconds(30) };
        jsonOptions = new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true,
            DefaultIgnoreCondition = JsonIgnoreCondition.WhenWritingNull,
            PropertyNamingPolicy = null,
            Converters =
            {
                new FlexibleDateTimeConverter(),
            },
        };
    }

    /// <summary>
    /// Sends a message as JSON via HTTP POST and receives the serialized message back.
    /// </summary>
    public async Task<string> SendJsonHttpAsync(string apiBaseUrl, UebermittlungSchriftgutobjekteNachricht message)
    {
        var json = JsonSerializer.Serialize(message, jsonOptions);
        var content = new StringContent(json, Encoding.UTF8, "application/json");

        var response = await httpClient.PostAsync($"{apiBaseUrl}/XJustizCore/json/generate-file?version=V0_2_0", content);
        response.EnsureSuccessStatusCode();

        return await response.Content.ReadAsStringAsync();
    }

    /// <summary>
    /// Parses JSON response into a message object.
    /// </summary>
    public UebermittlungSchriftgutobjekteNachricht ParseJsonResponse(string json)
    {
        return JsonSerializer.Deserialize<UebermittlungSchriftgutobjekteNachricht>(json, jsonOptions)
            ?? throw new InvalidOperationException("Failed to parse JSON response");
    }

    /// <summary>
    /// Sends a message as XML via HTTP POST and receives the serialized message back.
    /// </summary>
    public async Task<string> SendXmlHttpAsync(string apiBaseUrl, UebermittlungSchriftgutobjekteNachricht message)
    {
        var xml = SerializeToXml(message);
        var content = new StringContent(xml, Encoding.UTF8, "application/xml");

        var response = await httpClient.PostAsync($"{apiBaseUrl}/XJustizCore/xml/generate-file?version=V0_2_0", content);
        response.EnsureSuccessStatusCode();

        return await response.Content.ReadAsStringAsync();
    }

    /// <summary>
    /// Parses XML response into a message object.
    /// </summary>
    public static UebermittlungSchriftgutobjekteNachricht ParseXmlResponse(string xml)
    {
        var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
        using var reader = new StringReader(xml);
        return (UebermittlungSchriftgutobjekteNachricht)(serializer.Deserialize(reader)
            ?? throw new InvalidOperationException("Failed to parse XML response"));
    }

    /// <summary>
    /// Uploads a JSON file and receives the compatibility result back.
    /// </summary>
    public async Task<string> SendJsonFileAsync(string apiBaseUrl, string jsonContent, string fileName = "message.json")
    {
        using var content = new MultipartFormDataContent();
        var fileContent = new ByteArrayContent(Encoding.UTF8.GetBytes(jsonContent));
        fileContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");
        content.Add(fileContent, "file", fileName);

        var response = await httpClient.PostAsync($"{apiBaseUrl}/XJustizCore/json-file", content);
        response.EnsureSuccessStatusCode();

        return await response.Content.ReadAsStringAsync();
    }

    /// <summary>
    /// Uploads an XML file and receives the compatibility result back.
    /// </summary>
    public async Task<string> SendXmlFileAsync(string apiBaseUrl, string xmlContent, string fileName = "message.xml")
    {
        using var content = new MultipartFormDataContent();
        var fileContent = new ByteArrayContent(Encoding.UTF8.GetBytes(xmlContent));
        fileContent.Headers.ContentType = new MediaTypeHeaderValue("application/xml");
        content.Add(fileContent, "file", fileName);

        var response = await httpClient.PostAsync($"{apiBaseUrl}/XJustizCore/xml-file", content);
        response.EnsureSuccessStatusCode();

        return await response.Content.ReadAsStringAsync();
    }

    /// <summary>
    /// Sends a message from one API to another and parses the response.
    /// </summary>
    public async Task<UebermittlungSchriftgutobjekteNachricht> RoundTripJsonHttpAsync(
        string sourceApiUrl,
        string targetApiUrl,
        UebermittlungSchriftgutobjekteNachricht original)
    {
        // Source API serializes the message
        var jsonFromSource = await SendJsonHttpAsync(sourceApiUrl, original);

        // Target API deserializes and re-serializes
        var jsonFromTarget = await SendJsonHttpAsync(targetApiUrl, ParseJsonResponse(jsonFromSource));

        return ParseJsonResponse(jsonFromTarget);
    }

    /// <summary>
    /// Sends a message from one API to another via XML and parses the response.
    /// </summary>
    public async Task<UebermittlungSchriftgutobjekteNachricht> RoundTripXmlHttpAsync(
        string sourceApiUrl,
        string targetApiUrl,
        UebermittlungSchriftgutobjekteNachricht original)
    {
        // Source API serializes the message
        var xmlFromSource = await SendXmlHttpAsync(sourceApiUrl, original);

        // Target API deserializes and re-serializes
        var xmlFromTarget = await SendXmlHttpAsync(targetApiUrl, ParseXmlResponse(xmlFromSource));

        return ParseXmlResponse(xmlFromTarget);
    }

    public string SerializeToJson(UebermittlungSchriftgutobjekteNachricht message)
    {
        return JsonSerializer.Serialize(message, jsonOptions);
    }

    public static string SerializeToXml(UebermittlungSchriftgutobjekteNachricht message)
    {
        var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
        var ns = new XmlSerializerNamespaces();
        ns.Add(string.Empty, SchemeConstants.XJustiz_Tns);
        ns.Add("xsi", SchemeConstants.Xsi);

        using var writer = new StringWriter();
        serializer.Serialize(writer, message, ns);
        return writer.ToString().Replace("encoding=\"utf-16\"", "encoding=\"utf-8\"");
    }

    public void Dispose()
    {
        Dispose(true);
        GC.SuppressFinalize(this);
    }

    private void Dispose(bool disposing)
    {
        if (!disposed)
        {
            if (disposing)
            {
                httpClient.Dispose();
            }

            disposed = true;
        }
    }
}