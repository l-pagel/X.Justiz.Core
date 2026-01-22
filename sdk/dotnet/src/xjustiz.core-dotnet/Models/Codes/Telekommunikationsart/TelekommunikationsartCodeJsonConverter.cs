namespace xjustiz.core_dotnet.Models.Codes.Telekommunikationsart;

using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="TelekommunikationsartCode"/>.<br/>
/// <u><b>Telecommunication type code JSON converter:</b></u> JSON converter for <see cref="TelekommunikationsartCode"/>.
/// </summary>
public class TelekommunikationsartCodeJsonConverter : JsonConverter<TelekommunikationsartCode>
{
    public override TelekommunikationsartCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.GetString();
        if (TelekommunikationsartCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Telekommunikationsart: {value}");
    }

    public override void Write(Utf8JsonWriter writer, TelekommunikationsartCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
