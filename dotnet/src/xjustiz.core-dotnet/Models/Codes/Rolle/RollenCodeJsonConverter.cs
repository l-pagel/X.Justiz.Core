namespace xjustiz.core_dotnet.Models.Codes.Rolle;

using System.Text.Json;
using System.Text.Json.Serialization;

public class RollenCodeJsonConverter : JsonConverter<RollenCode>
{
    public override RollenCode Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
    {
        var value = reader.GetString();
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
