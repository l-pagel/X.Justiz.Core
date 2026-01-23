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
        var value = reader.TokenType switch
        {
            JsonTokenType.Number => reader.TryGetInt64(out var longVal)
                ? longVal.ToString()
                : reader.GetDouble().ToString(System.Globalization.CultureInfo.InvariantCulture),

            JsonTokenType.String => reader.GetString(),

            _ => reader.GetString()
        };

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