namespace xjustiz.core_dotnet.Models.Codes.Versicherer;

public static class VersichererCodeMapper
{
    public static bool TryParse(string? value, out VersichererCode result)
    {
        if (string.IsNullOrEmpty(value))
        {
            result = default;
            return false;
        }

        // Fallback to iterating
        foreach(VersichererCode code in System.Enum.GetValues(typeof(VersichererCode)))
        {
             if (code.ToCode() == value)
             {
                 result = code;
                 return true;
             }
        }

        result = default;
        return false;
    }
}