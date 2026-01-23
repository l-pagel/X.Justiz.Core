namespace xjustiz.core_dotnet.Models.Codes.Dokumentklasse;

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="DokumentklasseCode"/>.<br/>
/// <u><b>Document class code JSON converter:</b></u> JSON converter for <see cref="DokumentklasseCode"/>.
/// </summary>
public class DokumentklasseCodeJsonConverter : JsonConverter<DokumentklasseCode>
{
    public override DokumentklasseCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.TokenType == JsonTokenType.Number
            ? (reader.TryGetInt64(out var l) ? l.ToString() : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture))
            : reader.GetString();

        if (DokumentklasseCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unable to convert \"{value}\" to {nameof(DokumentklasseCode)}.");
    }

    public override void Write(Utf8JsonWriter writer, DokumentklasseCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
