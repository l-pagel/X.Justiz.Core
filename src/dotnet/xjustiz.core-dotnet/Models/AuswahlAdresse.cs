namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für Adressen (Absender oder Empfänger).
/// Selection structure for addresses (sender or receiver).
/// </summary>
public class AuswahlAdresse
{
    /// <summary>
    /// Sonstiger Absender.
    /// Other sender.
    /// </summary>
    [XmlElement("absender.sonstige", Namespace = XJustizExport.Tns)]
    public string? AbsenderSonstige { get; set; }

    /// <summary>
    /// Sonstiger Empfänger.
    /// Other receiver.
    /// </summary>
    [XmlElement("empfaenger.sonstige", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerSonstige { get; set; }

    /// <summary>
    /// Gericht als Empfänger.
    /// Court as receiver.
    /// </summary>
    [XmlElement("empfaenger.gericht", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerGericht { get; set; }

    /// <summary>
    /// Rentenversicherungsträger als Empfänger.
    /// Pension insurance carrier as receiver.
    /// </summary>
    [XmlElement("empfaenger.rvTraeger", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerRvTraeger { get; set; }

    /// <summary>
    /// Polizeibehörde als Empfänger.
    /// Police authority as receiver.
    /// </summary>
    [XmlElement("empfaenger.polizeibehoerde", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerPolizei { get; set; }
}
