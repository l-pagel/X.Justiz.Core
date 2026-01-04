namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Fachspezifische Daten einer Akte.<br/>
/// <u><b>Subject-specific data of a file:</b></u> Specialized data of a file/case.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class XjustizAkteFachspezifischeDaten
{
    /// <summary>
    /// Bezeichnet den Aktentyp anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Feld "anzeigename" verwendet werden.<br/>
    /// <u><b>File type:</b></u> Designates the file type based on the predefined value list. This is deliberately kept concise for smooth exchange. For a more specific designation, the field 'anzeigename' (display name) can be used.
    /// </summary>
    [XmlElement("aktentyp", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Aktentyp Aktentyp { get; set; } = new();

    /// <summary>
    /// Der Anzeigename ermöglicht als Freitext die Übermittlung der Bezeichnung der Akte, wie sie im versendenden System angezeigt wird, bspw. als <a href='https://de.wikipedia.org/wiki/Rubrum'>Rubrum</a> (Max Muster ./. Sabine Schmidt).<br/>
    /// <u><b>Display name:</b></u> The display name allows the transmission of the designation of the file as it is displayed in the sending system as free text, e.g. as <a href='https://de.wikipedia.org/wiki/Rubrum'>Rubrum</a> (Max Muster ./. Sabine Schmidt).
    /// </summary>
    [XmlElement("anzeigename", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Anzeigename { get; set; }

    /// <summary>
    /// Hier steht das Aktenzeichen, unter dem die Station (siehe oben) das Verfahren führt.<br/>
    /// <u><b>File reference:</b></u> Here is the file reference under which the station (see above) conducts the proceeding.
    /// </summary>
    [XmlElement("aktenzeichen", Namespace = XJustizConstants.Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Aktenzeichen Aktenzeichen { get; set; } = new();

    //TODO: Add summary definitions to fields
    [XmlElement("ziel", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Ziel { get; set; }

    /// <summary>
    /// Freitext für Zusatznachricht zu Akte (Nachricht des Mandanten an den Anwalt/Notar)
    /// </summary>
    [XmlElement("nachricht", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Nachricht { get; set; }

    /// <summary>
    /// Freitext für Zusatznachricht zu Akte (Nachricht des Mandanten an den Anwalt/Notar)
    /// </summary>
    [XmlElement("sendungsmitteilung", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Sendungsmitteilung { get; set; }

    /// <summary>
    /// Freitext für Notizen zur Akte
    /// </summary>
    [XmlElement("notizen", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Notizen { get; set; }

    /// <summary>
    /// Rechgebiet (AreaOfLaw)
    /// </summary>
    [XmlElement("anliegen", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Anliegen { get; set; }

    /// <summary>
    /// Aktentyp (CaseType)
    /// </summary>
    [XmlElement("sachverhalt", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Sachverhalt { get; set; }

    [XmlElement("notarpraeferenz", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Notarpraeferenz { get; set; }

    [XmlElement("terminpraeferenz", Namespace = "")]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Terminpraeferenz { get; set; }
}
