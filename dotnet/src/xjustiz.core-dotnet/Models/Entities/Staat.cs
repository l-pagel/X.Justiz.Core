namespace xjustiz.core_dotnet.Models.Entities;

using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Staat;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert einen Staat als Code.<br/>
/// <u><b>Country:</b></u> Represents a country / state as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Staat : ICode<StaatCode>
{
    public string ListVersionId { get; set; } = "3.5.1";

    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat";

    public StaatCode Code { get; set; }
}
