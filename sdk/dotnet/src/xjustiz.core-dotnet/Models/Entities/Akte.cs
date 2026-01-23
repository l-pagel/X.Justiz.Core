namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Akte.<br/>
/// <u><b>File:</b></u> Represents a file / case.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Akte
{
    /// <summary>
    /// Der Typ dient der eindeutigen Kennzeichnung von Schriftgutobjekten und entspricht dem xdomea-Typ 'IdentifikationObjektType'.<br/>
    /// <u><b>Identification:</b></u> The type serves to uniquely identify document objects and corresponds to the xdomea type 'IdentifikationObjektType'.
    /// </summary>
    [XmlElement("identifikation", Namespace = SchemeConstants.XJustiz_Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Identifikation Identifikation { get; set; } = new();

    /// <summary>
    /// Daten einer Akte, die bereits durch in X.Justiz oder X.Justiz Core definierten Datenfeldern abbildbar sind.<br/>
    /// <u><b>Case file data:</b></u> Data of a case file that can already be represented by data fields defined in X.Justiz or X.Justiz Core.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = SchemeConstants.XJustiz_Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public XjustizAkteFachspezifischeDaten FachspezifischeDaten { get; set; } = new();

    /// <summary>
    /// Daten einer Akte, die <u>nicht</u> durch in X.Justiz oder X.Justiz Core definierten Datenfeldern abbildbar sind.<br/>
    /// <u><b>Custom case file data:</b></u> Data of a case file that can <u>not</u> be represented by data fields defined in X.Justiz or X.Justiz Core.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = SchemeConstants.XJustiz_Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }
}