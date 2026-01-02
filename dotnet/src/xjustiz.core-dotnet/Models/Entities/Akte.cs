namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Akte.<br/>
/// <u><b>File:</b></u> Represents a file / case.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Akte
{
    /// <summary>
    /// Der Typ dient der eindeutigen Kennzeichnung von Schriftgutobjekten und entspricht dem xdomea-Typ 'IdentifikationObjektType'.<br/>
    /// <u><b>Identification:</b></u> The type serves to uniquely identify document objects and corresponds to the xdomea type 'IdentifikationObjektType'.
    /// </summary>
    [XmlElement("identifikation", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Identifikation Identifikation { get; set; } = new();

    /// <summary>
    /// In dieser Elementgruppe können Felder und/oder Feldgruppen, in denen mehrere Felder zusammengefasst sind, übermittelt werden. Da es hierfür keine festen Schema-Vorgaben gibt, darf diese Elementgruppe nur verwendet werden, wenn mit dem jeweiligen Kommunikationspartner Name und Inhalt der Felder und/oder Feldgruppen abgestimmt wurden. Es kann nicht davon ausgegangen werden, dass die hier hinterlegten Metadaten von Kommunikationspartnern, mit denen keine Absprachen erfolgten, ausgelesen werden können.<br/>
    /// <u><b>Application-specific extension:</b></u> In this element group, fields and/or field groups in which several fields are summarized can be transmitted. Since there are no fixed schema specifications for this, this element group may only be used if the name and content of the fields and/or field groups have been agreed with the respective communication partner. It cannot be assumed that the metadata deposited here can be read by communication partners with whom no agreements have been made.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }

    /// <summary>
    /// Fachspezifische Daten einer Akte.<br/>
    /// <u><b>Subject-specific data:</b></u> Specialized data of a file/case.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizConstants.Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public XjustizAkteFachspezifischeDaten FachspezifischeDaten { get; set; } = new();
}
