namespace xjustiz.core_dotnet.Models.Codes.Gericht;

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="GerichtCode"/>.<br/>
/// <u><b>Court code JSON converter:</b></u> JSON converter for <see cref="GerichtCode"/>.
/// </summary>
public class GerichtCodeJsonConverter : JsonConverter<GerichtCode>
{
    public override GerichtCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.TokenType switch
        {
            JsonTokenType.Number => reader.TryGetInt64(out var longVal)
                ? longVal.ToString()
                : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture),

            JsonTokenType.String => reader.GetString(),

            _ => reader.GetString()
        };

        if (GerichtCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unable to convert \"{value}\" to {nameof(GerichtCode)}.");
    }

    public override void Write(Utf8JsonWriter writer, GerichtCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}