namespace xjustiz.core_dotnet.Models.Codes.Rolle;

using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="RollenCode"/>.<br/>
/// <u><b>Role code JSON converter:</b></u> JSON converter for <see cref="RollenCode"/>.
/// </summary>
public class RollenCodeJsonConverter : JsonConverter<RollenCode>
{
    public override RollenCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var parsedNumber = reader.TryGetInt64(out var l)
            ? l.ToString()
            : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture);

        var value = reader.TokenType == JsonTokenType.Number
            ? parsedNumber
            : reader.GetString();

        if (RollenCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Rolle: {value}");
    }

    public override void Write(Utf8JsonWriter writer, RollenCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
