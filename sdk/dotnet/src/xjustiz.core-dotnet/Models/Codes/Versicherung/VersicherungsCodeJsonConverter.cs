namespace xjustiz.core_dotnet.Models.Codes.Versicherung;

using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="VersicherungsCode"/>.<br/>
/// <u><b>Insurance code JSON converter:</b></u> JSON converter for <see cref="VersicherungsCode"/>.
/// </summary>
public class VersicherungsCodeJsonConverter : JsonConverter<VersicherungsCode>
{
    public override VersicherungsCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.TokenType switch
        {
            JsonTokenType.Number => reader.TryGetInt64(out var longVal)
                ? longVal.ToString()
                : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture),

            JsonTokenType.String => reader.GetString(),

            _ => reader.GetString()
        };

        if (VersicherungsCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Versicherung: {value}");
    }

    public override void Write(Utf8JsonWriter writer, VersicherungsCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
