namespace xjustiz.core_dotnet.Models.Entities;

using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Gericht;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein Gericht als Code.<br/>
/// <u><b>Court:</b></u> Represents a court as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Gericht : ICode<GerichtCode>
{
    public string ListVersionId { get; set; } = "3.6";

    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.gerichte";

    public GerichtCode Code { get; set; }
}