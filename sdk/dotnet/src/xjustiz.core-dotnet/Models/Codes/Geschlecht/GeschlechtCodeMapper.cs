namespace xjustiz.core_dotnet.Models.Codes.Geschlecht;

/// <summary>
/// Mapper für <see cref="GeschlechtCode"/>.<br/>
/// <u><b>Gender code mapper:</b></u> Mapper for <see cref="GeschlechtCode"/>.
/// </summary>
public static class GeschlechtCodeMapper
{
    public static GeschlechtCode FromCode(string code)
    {
        return FromString(code);
    }

    public static GeschlechtCode FromString(string value)
    {
        if (TryParse(value, out var result))
        {
            return result;
        }

        throw new System.ArgumentException($"Unknown Geschlecht: {value}", nameof(value));
    }

    public static bool TryParse(string? value, out GeschlechtCode result)
    {
        result = default;
        if (string.IsNullOrEmpty(value))
        {
            return false;
        }

        switch (value)
        {
            case "0":
            case "u":
            case "unbekannt":
                result = GeschlechtCode.Unbekannt;
                return true;
            case "1":
            case "m":
            case "männlich":
                result = GeschlechtCode.Maennlich;
                return true;
            case "2":
            case "w":
            case "weiblich":
                result = GeschlechtCode.Weiblich;
                return true;
            case "3":
            case "d":
            case "divers":
                result = GeschlechtCode.Divers;
                return true;
            case "4":
            case "s":
            case "sächlich":
                result = GeschlechtCode.Saechlich;
                return true;
        }

        return System.Enum.TryParse(value, out result);
    }
}