namespace example_api;

using Microsoft.OpenApi.Any;
using Microsoft.OpenApi.Models;
using Swashbuckle.AspNetCore.SwaggerGen;
using System.Reflection;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Schema filter to remove enum values marked with [ForTestingOnly] from Swagger documentation.
/// </summary>
public class RemoveForTestingOnlyEnumValuesFilter : ISchemaFilter
{
    public void Apply(OpenApiSchema schema, SchemaFilterContext context)
    {
        if (context.Type.IsEnum)
        {
            var enumFields = context.Type.GetFields(BindingFlags.Public | BindingFlags.Static);
            var fieldsToRemove = enumFields
                .Where(f => f.IsDefined(typeof(ForTestingOnlyAttribute), false))
                .Select(f => f.Name)
                .ToList();

            if (fieldsToRemove.Count != 0 && schema.Enum != null)
            {
                var newEnumValues = new List<IOpenApiAny>();

                foreach (var field in enumFields)
                {
                    if (fieldsToRemove.Contains(field.Name))
                    {
                        continue;
                    }

                    // Check if Swagger is using strings or integers for this schema
                    if (schema.Type == "string")
                    {
                        newEnumValues.Add(new OpenApiString(field.Name));
                    }
                    else if (schema.Type == "integer")
                    {
                        var value = field.GetRawConstantValue();
                        if (value is int intValue)
                        {
                            newEnumValues.Add(new OpenApiInteger(intValue));
                        }
                    }
                }

                if (newEnumValues.Count != 0)
                {
                    schema.Enum = newEnumValues;
                }
            }
        }
    }
}
