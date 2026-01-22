namespace xjustiz.core_dotnet.Models.Codes.Bestandteil;

using System.Text.Json;
using System.Text.Json.Serialization;

/// <summary>
/// JSON Konverter für <see cref="BestandteiltypCode"/>.<br/>
/// <u><b>Component type code JSON converter:</b></u> JSON converter for <see cref="BestandteiltypCode"/>.
/// </summary>
public class BestandteiltypCodeJsonConverter : JsonConverter<BestandteiltypCode>
{
    public override BestandteiltypCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.GetString();
        if (BestandteiltypCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Bestandteil: {value}");
    }

    public override void Write(Utf8JsonWriter writer, BestandteiltypCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
