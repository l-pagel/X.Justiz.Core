namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Grunddaten der Nachricht.
/// Basic data of the message.
/// </summary>
public class Grunddaten
{
    /// <summary>
    /// Die Verfahrensdaten.
    /// The proceeding data.
    /// </summary>
    [XmlElement("verfahrensdaten", Namespace = XJustizExport.Tns)]
    public Verfahrensdaten? Verfahrensdaten { get; set; }
}
