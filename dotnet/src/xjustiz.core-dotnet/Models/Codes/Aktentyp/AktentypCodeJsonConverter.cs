namespace xjustiz.core_dotnet.Models.Codes.Aktentyp;

using System.Text.Json;
using System.Text.Json.Serialization;

public class AktentypCodeJsonConverter : JsonConverter<AktentypCode>
{
    public override AktentypCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.GetString();
        if (AktentypCodeMapper.TryParse(value, out var result))
        {
            return result;
        }

        throw new JsonException($"Unknown Aktentyp: {value}");
    }

    public override void Write(Utf8JsonWriter writer, AktentypCode value, JsonSerializerOptions options)
    {
        writer.WriteStringValue(value.ToCode());
    }
}
