namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Fachspezifische Daten eines Dokuments.<br/>
/// <u><b>Subject-specific data:</b></u> Specialized data of a document.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class XjustizFachspezifischeDatenCore : XjustizFachspezifischeDaten
{
    /// <summary>
    /// Repräsentiert eine Datei.<br/>
    /// <u><b>File:</b></u> Represents a file.
    /// </summary>
    [XmlElement("datei", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public new DateiCore Datei { get; set; } = new();
}
