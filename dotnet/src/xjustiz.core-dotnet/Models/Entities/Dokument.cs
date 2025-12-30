namespace xjustiz.core_dotnet.Models.Entities;

using System;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein Dokument.
/// Represents a document.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Dokument
{
    /// <summary>
    /// Sofern zu einem Dokument, z.B. bei der Übersendung einer inzwischen fortgeschriebenen Behördenakte, erneut Dateien übermittelt werden, soll für das Dokument im Element 'identifikation/id' die gleiche UUID wie bei der ersten Übermittlung angegeben werden. Auf diese Weise kann der Empfänger durch Vergleich der UUIDs erkennen, ob zu diesem Dokument bereits Dateien übermittelt wurden.
    /// If files are transmitted again for a document, e.g., when sending a now updated authority file, the same UUID should be specified for the document in the element 'identifikation/id' as for the first transmission. In this way, the recipient can recognize by comparing the UUIDs whether files have already been transmitted for this document.
    /// </summary>
    [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public Identifikation Identifikation { get; set; } = new();

    /// <summary>
    /// Fachspezifische Daten eines Dokuments.
    /// Specialized data of a document.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    public XjustizFachspezifischeDaten FachspezifischeDaten { get; set; } = new();

    /// <summary>
    /// Dieses Element gibt Auskunft darüber, zu welchem Zeitpunkt das Dokument im System erstellt wurde.
    /// This element provides information about when the document was created in the system.
    /// </summary>
    [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, DataType = "dateTime", Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_4_1)]
    public DateTime? Erstellungszeitpunkt { get; set; }
}
