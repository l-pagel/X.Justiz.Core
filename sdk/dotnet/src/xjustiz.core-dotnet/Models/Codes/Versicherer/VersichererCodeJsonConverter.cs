namespace xjustiz.core_dotnet.Models.Codes.Versicherer;

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

public class VersichererCodeJsonConverter : JsonConverter<VersichererCode>
{
    public override VersichererCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.TokenType switch
        {
            JsonTokenType.Number => reader.TryGetInt64(out var longVal)
                ? longVal.ToString()
                : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture),
            JsonTokenType.String => reader.GetString(),
            _ => reader.GetString()
        };

        if (VersichererCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Versicherer: {value}");
    }

    public override void Write(Utf8JsonWriter writer, VersichererCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}