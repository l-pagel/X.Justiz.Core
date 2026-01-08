namespace xjustiz.core_dotnet.Models.Codes.Bestandteil;

public static class BestandteiltypCodeMapper
{
    public static BestandteiltypCode FromCode(string code)
    {
        return FromString(code);
    }

    public static BestandteiltypCode FromString(string value)
    {
        if (TryParse(value, out var result))
        {
            return result;
        }

        throw new System.ArgumentException($"Unknown Bestandteil: {value}", nameof(value));
    }

    public static bool TryParse(string? value, out BestandteiltypCode result)
    {
        result = default;
        if (string.IsNullOrEmpty(value))
        {
            return false;
        }

        switch (value)
        {
            case "001":
            case "Original":
                result = BestandteiltypCode.Original;
                return true;
            case "002":
            case "Repräsentat":
                result = BestandteiltypCode.Repraesentat;
                return true;
            case "003":
            case "Signaturdatei":
                result = BestandteiltypCode.Signaturdatei;
                return true;
            case "004":
            case "signierte Vorversion":
                result = BestandteiltypCode.signierte_Vorversion;
                return true;
            case "006":
            case "Transfervermerk":
                result = BestandteiltypCode.Transfervermerk;
                return true;
            case "010":
            case "Prüfvermerk":
                result = BestandteiltypCode.Pruefvermerk;
                return true;
            case "011":
            case "VHN":
                result = BestandteiltypCode.VHN;
                return true;
            case "012":
            case "hinlaufendes eEB":
                result = BestandteiltypCode.hinlaufendes_eEB;
                return true;
        }

        return false;
    }
}
