namespace xjustiz.core_dotnet.Models.Codes.Dokumentklasse;

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

public class DokumentklasseCodeJsonConverter : JsonConverter<DokumentklasseCode>
{
    public override DokumentklasseCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        if (reader.TokenType == JsonTokenType.String)
        {
            var stringValue = reader.GetString();
            if (DokumentklasseCodeMapper.TryParse(stringValue, out var result))
            {
                return result;
            }
        }

        throw new JsonException($"Unable to convert \"{reader.GetString()}\" to {nameof(DokumentklasseCode)}.");
    }

    public override void Write(Utf8JsonWriter writer, DokumentklasseCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
