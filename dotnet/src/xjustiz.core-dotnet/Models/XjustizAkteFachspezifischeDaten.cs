namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Entities;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Fachspezifische Daten einer Akte.
/// Specialized data of a file/case.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class XjustizAkteFachspezifischeDaten
{
    /// <summary>
    /// Bezeichnet den Aktentyp anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Feld "anzeigename" verwendet werden.
    /// Designates the file type based on the predefined value list. This is deliberately kept concise for smooth exchange. For a more specific designation, the field 'anzeigename' (display name) can be used.
    /// </summary>
    [XmlElement("aktentyp", Namespace = XJustizExport.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Aktentyp Aktentyp { get; set; } = new();

    /// <summary>
    /// Der Anzeigename ermöglicht als Freitext die Übermittlung der Bezeichnung der Akte, wie sie im versendenden System angezeigt wird. Hier können spezifischere Informationen zum Aktennamen übermittelt werden, als dies im Rahmen der Werteliste zum Aktentyp möglich ist, z.B. "Asylakte" als nähere Spezifizierung des Aktentyps "Behördenakte".
    /// The display name allows the transmission of the designation of the file as it is displayed in the sending system as free text. More specific information on the file name can be transmitted here than is possible within the framework of the value list for the file type, e.g., 'Asylakte' (asylum file) as a more specific specification of the file type 'Behördenakte' (authority file).
    /// </summary>
    [XmlElement("anzeigename", Namespace = XJustizExport.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Anzeigename { get; set; }

    /// <summary>
    /// Hier steht das Aktenzeichen, unter dem die Station (siehe oben) das Verfahren führt.
    /// Here is the file reference under which the station (see above) conducts the proceeding.
    /// </summary>
    [XmlElement("aktenzeichen", Namespace = XJustizExport.Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Aktenzeichen Aktenzeichen { get; set; } = new();
}
