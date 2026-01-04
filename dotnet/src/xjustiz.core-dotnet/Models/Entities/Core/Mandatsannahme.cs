namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Fachmodul für Außergerichtliche Kommunikation mit Informationen zur Mandatsannahme<br/>
/// <u><b>Client onboarding:</b></u> Specialized module for extrajudicial communication containing information on client onboarding.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Mandatsannahme
{
    //TODO: Add summary definitions to fields
    [XmlElement("titel", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Titel { get; set; }

    [XmlElement("ziel", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Ziel { get; set; }

    [XmlElement("haftungsausschlussText", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? HaftungsausschlussText { get; set; }

    [XmlElement("kontakteinwilligungserklärung", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? KontaktEinwilligungsErklaerung { get; set; }

    [XmlElement("abgesendet", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public DateTime Abgesendet { get; set; }

    [XmlElement("nachricht", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Nachricht { get; set; }

    [XmlElement("sendungsmitteilung", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Sendungsmitteilung { get; set; }

    [XmlElement("notizen", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Notizen { get; set; }

    [XmlElement("anliegen", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Anliegen { get; set; }

    [XmlElement("notarpraeferenz", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Notarpraeferenz { get; set; }

    [XmlElement("terminpraeferenz", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Terminpraeferenz { get; set; }

    [XmlElement("sachverhalt", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Sachverhalt { get; set; }
}
