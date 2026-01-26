namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Eine Organisation (juristische Person).<br/>
/// <u><b>Organization:</b></u> An organization (legal entity).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class OrganisationCore : Organisation
{
    /// <summary>
    /// In dieser Elementgruppe können Felder und/oder Feldgruppen, in denen mehrere Felder zusammengefasst sind, übermittelt werden. Da es hierfür keine festen Schema-Vorgaben gibt, darf diese Elementgruppe nur verwendet werden, wenn mit dem jeweiligen Kommunikationspartner Name und Inhalt der Felder und/oder Feldgruppen abgestimmt wurden. Es kann nicht davon ausgegangen werden, dass die hier hinterlegten Metadaten von Kommunikationspartnern, mit denen keine Absprachen erfolgten, ausgelesen werden können.<br/>
    /// <u><b>Application-specific extension:</b></u> In this element group, fields and/or field groups in which several fields are summarized can be transmitted. Since there are no fixed schema specifications for this, this element group may only be used if the name and content of the fields and/or field groups have been agreed with the respective communication partner. It cannot be assumed that the metadata deposited here can be read by communication partners with whom no agreements have been made.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = SchemeConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }
}