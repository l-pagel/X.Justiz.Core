namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Akte.<br/>
/// <u><b>File:</b></u> Represents a file / case.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class AkteCore : Akte
{
    /// <summary>
    /// Fachspezifische Daten einer Akte.<br/>
    /// <u><b>Subject-specific data:</b></u> Specialized data of a file/case.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizConstants.Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public new XjustizAkteFachspezifischeDatenCore FachspezifischeDaten { get; set; } = new();
}
