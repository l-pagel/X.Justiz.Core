namespace xjustiz.core_dotnet.Models.Codes.Staat;

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="StaatCode"/>.<br/>
/// <u><b>Country code JSON converter:</b></u> JSON converter for <see cref="StaatCode"/>.
/// </summary>
public class StaatCodeJsonConverter : JsonConverter<StaatCode>
{
    public override StaatCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        if (reader.TokenType == JsonTokenType.String)
        {
            var stringValue = reader.GetString() ?? string.Empty;

            if (StaatCodeMapper.TryParse(stringValue, out var result))
            {
                return result;
            }
        }
        else if (reader.TokenType == JsonTokenType.Number && StaatCodeMapper.TryParse(reader.GetInt32().ToString().PadLeft(3, '0'), out var result))
        {
            return result;
        }

        throw new JsonException($"Unable to convert \"{reader.GetString()}\" to {nameof(StaatCode)}.");
    }

    public override void Write(Utf8JsonWriter writer, StaatCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}