namespace xjustiz.core_dotnet.Models.Entities;

using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Geschlecht;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert das Geschlecht einer Person als Code.<br/>
/// <u><b>Gender:</b></u> Represents the gender of a person as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Geschlecht : ICode<GeschlechtCode>
{
    public string ListVersionId { get; set; } = "2.0";

    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:de:xauslaender:codelist:geschlecht";

    public GeschlechtCode Code { get; set; }
}
