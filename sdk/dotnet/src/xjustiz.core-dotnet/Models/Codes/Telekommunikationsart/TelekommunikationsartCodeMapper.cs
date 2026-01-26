namespace xjustiz.core_dotnet.Models.Codes.Telekommunikationsart;

/// <summary>
/// Mapper für <see cref="TelekommunikationsartCode"/>.<br/>
/// <u><b>Telecommunication type code mapper:</b></u> Mapper for <see cref="TelekommunikationsartCode"/>.
/// </summary>
public static class TelekommunikationsartCodeMapper
{
    public static TelekommunikationsartCode FromCode(string code)
    {
        return FromString(code);
    }

    public static TelekommunikationsartCode FromString(string value)
    {
        if (TryParse(value, out var result))
        {
            return result;
        }

        throw new System.ArgumentException($"Unknown Telekommunikationsart: {value}", nameof(value));
    }

    public static bool TryParse(string? value, out TelekommunikationsartCode result)
    {
        result = default;
        if (string.IsNullOrEmpty(value))
        {
            return false;
        }

        switch (value)
        {
            case "001":
            case "email":
            case "e-mail":
                result = TelekommunikationsartCode.Email;
                return true;
            case "002":
            case "fax":
                result = TelekommunikationsartCode.Fax;
                return true;
            case "003":
            case "internet":
                result = TelekommunikationsartCode.Internet;
                return true;
            case "004":
            case "mobiltelefon":
                result = TelekommunikationsartCode.Mobiltelefon;
                return true;
            case "005":
            case "pager":
                result = TelekommunikationsartCode.Pager;
                return true;
            case "006":
            case "sonstige":
                result = TelekommunikationsartCode.Sonstige;
                return true;
            case "007":
            case "telefon":
                result = TelekommunikationsartCode.Telefon;
                return true;
            case "008":
            case "rechtsverbindlicher elektronischer kommunikationsweg":
                result = TelekommunikationsartCode.RechtsverbindlicherElektronischerKommunikationsweg;
                return true;
        }

        return System.Enum.TryParse(value, true, out result);
    }
}