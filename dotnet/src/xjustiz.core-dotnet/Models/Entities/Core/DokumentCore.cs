namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein Dokument.<br/>
/// <u><b>Document:</b></u> Represents a document.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class DokumentCore : Dokument
{
    /// <summary>
    /// Fachspezifische Daten eines Dokuments.<br/>
    /// <u><b>Subject-specific data:</b></u> Specialized data of a document.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public new XjustizFachspezifischeDatenCore FachspezifischeDaten { get; set; } = new();
}
