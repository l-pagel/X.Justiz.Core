namespace xjustiz.core_dotnet.Models.Codes.Aktentyp;

public static class AktentypCodeMapper
{
    public static AktentypCode FromCode(string code)
    {
        return FromString(code);
    }

    public static AktentypCode FromString(string value)
    {
        if (TryParse(value, out var result))
        {
            return result;
        }

        throw new System.ArgumentException($"Unknown Aktentyp: {value}", nameof(value));
    }

    public static bool TryParse(string? value, out AktentypCode result)
    {
        result = default;
        if (string.IsNullOrEmpty(value))
        {
            return false;
        }

        switch (value)
        {
            case "001":
            case "Zivilakte":
                result = AktentypCode.Zivilakte;
                return true;
            case "002":
            case "Betreuungsakte":
                result = AktentypCode.Betreuungsakte;
                return true;
            case "003":
            case "Familienakte":
                result = AktentypCode.Familienakte;
                return true;
            case "004":
            case "Nachlassakte":
                result = AktentypCode.Nachlassakte;
                return true;
            case "005":
            case "Insolvenzakte":
                result = AktentypCode.Insolvenzakte;
                return true;
            case "006":
            case "Grundakte":
                result = AktentypCode.Grundakte;
                return true;
            case "007":
            case "Registerakte":
                result = AktentypCode.Registerakte;
                return true;
            case "008":
            case "Zwangsvollstreckungsakte":
                result = AktentypCode.Zwangsvollstreckungsakte;
                return true;
            case "009":
            case "Justizverwaltungsakte":
                result = AktentypCode.Justizverwaltungsakte;
                return true;
            case "010":
            case "Bußgeldakte":
                result = AktentypCode.Bussgeldakte;
                return true;
            case "011":
            case "Bewährungshilfeakte":
                result = AktentypCode.Bewaehrungshilfeakte;
                return true;
            case "012":
            case "Strafakte":
                result = AktentypCode.Strafakte;
                return true;
            case "013":
            case "Arbeitsgerichtsakte":
                result = AktentypCode.Arbeitsgerichtsakte;
                return true;
            case "014":
            case "Finanzgerichtsakte":
                result = AktentypCode.Finanzgerichtsakte;
                return true;
            case "015":
            case "Sozialgerichtsakte":
                result = AktentypCode.Sozialgerichtsakte;
                return true;
            case "016":
            case "Verwaltungsgerichtsakte":
                result = AktentypCode.Verwaltungsgerichtsakte;
                return true;
            case "017":
            case "Andere / Sonstige":
                result = AktentypCode.Andere_oder_Sonstige;
                return true;
            case "018":
            case "Behördenakte":
                result = AktentypCode.Behoerdenakte;
                return true;
            case "019":
            case "Hinterlegungsakte":
                result = AktentypCode.Hinterlegungsakte;
                return true;
            case "020":
            case "Gerichtsvollzieherverfahrensakte":
                result = AktentypCode.Gerichtsvollzieherverfahrensakte;
                return true;
            case "021":
            case "Gerichtsvollziehergeschäftsbuch DR I":
                result = AktentypCode.Gerichtsvollziehergeschaeftsbuch_DR_I;
                return true;
            case "022":
            case "Gerichtsvollziehergeschäftsbuch DR II":
                result = AktentypCode.Gerichtsvollziehergeschaeftsbuch_DR_II;
                return true;
            case "023":
            case "Gerichtsvollziehergeschäftsbuch KB I":
                result = AktentypCode.Gerichtsvollziehergeschaeftsbuch_KB_I;
                return true;
            case "024":
            case "Gerichtsvollziehergeschäftsbuch KB II":
                result = AktentypCode.Gerichtsvollziehergeschaeftsbuch_KB_II;
                return true;
        }

        return false;
    }
}
