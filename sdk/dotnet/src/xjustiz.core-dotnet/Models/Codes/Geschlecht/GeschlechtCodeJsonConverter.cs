namespace xjustiz.core_dotnet.Models.Codes.Geschlecht;

using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="GeschlechtCode"/>.<br/>
/// <u><b>Gender code JSON converter:</b></u> JSON converter for <see cref="GeschlechtCode"/>.
/// </summary>
public class GeschlechtCodeJsonConverter : JsonConverter<GeschlechtCode>
{
    public override GeschlechtCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var parsedNumber = reader.TryGetInt64(out var l)
            ? l.ToString()
            : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture);

        var value = reader.TokenType == JsonTokenType.Number
            ? parsedNumber
            : reader.GetString();

        if (GeschlechtCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Geschlecht: {value}");
    }

    public override void Write(Utf8JsonWriter writer, GeschlechtCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
