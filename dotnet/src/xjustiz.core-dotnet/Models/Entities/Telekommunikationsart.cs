namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Art der Telekommunikation als CodeValue.<br/>
/// <u><b>Telecommunication type:</b></u> Type of telecommunication as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Telekommunikationsart
{
    /// <summary>
    /// Mögliche Codes können der Codeliste CodeValue.INSO.IRI.Fehlercode entnommen werden.<br/>
    /// <u><b>CodeValue:</b></u> Possible codes can be taken from the code list CodeValue.INSO.IRI.Fehlercode.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Code { get; set; }
}
