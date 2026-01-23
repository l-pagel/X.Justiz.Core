namespace xjustiz.core_dotnet.Models.Codes.Versicherung;

using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="VersicherungsTypCode"/>.<br/>
/// <u><b>Insurance code JSON converter:</b></u> JSON converter for <see cref="VersicherungsTypCode"/>.
/// </summary>
public class VersicherungsTypCodeJsonConverter : JsonConverter<VersicherungsTypCode>
{
    public override VersicherungsTypCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.TokenType switch
        {
            JsonTokenType.Number => reader.TryGetInt64(out var longVal)
                ? longVal.ToString()
                : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture),

            JsonTokenType.String => reader.GetString(),

            _ => reader.GetString()
        };

        if (VersicherungsTypCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Versicherung: {value}");
    }

    public override void Write(Utf8JsonWriter writer, VersicherungsTypCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
