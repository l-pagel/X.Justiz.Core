namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Fachspezifische Daten einer Akte. Ergänzt um Felder für die Mandatsannahme<br/>
/// <u><b>Subject-specific data of a file:</b></u> Specialized data of a file/case.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class XjustizAkteFachspezifischeDatenCore : XjustizAkteFachspezifischeDaten
{
    [XmlElement("ziel", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Ziel { get; set; }

    /// <summary>
    /// Freitext für Zusatznachricht zu Akte (Nachricht des Mandanten an den Anwalt/Notar)
    /// </summary>
    [XmlElement("nachricht", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Nachricht { get; set; }

    /// <summary>
    /// Freitext für Zusatznachricht zu Akte (Nachricht des Mandanten an den Anwalt/Notar)
    /// </summary>
    [XmlElement("sendungsmitteilung", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Sendungsmitteilung { get; set; }

    /// <summary>
    /// Freitext für Notizen zur Akte
    /// </summary>
    [XmlElement("notizen", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Notizen { get; set; }

    /// <summary>
    /// Rechgebiet (AreaOfLaw)
    /// </summary>
    [XmlElement("anliegen", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Anliegen { get; set; }

    /// <summary>
    /// Aktentyp (CaseType)
    /// </summary>
    [XmlElement("sachverhalt", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Sachverhalt { get; set; }

    [XmlElement("notarpraeferenz", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Notarpraeferenz { get; set; }

    [XmlElement("terminpraeferenz", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Terminpraeferenz { get; set; }
}