namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Grunddaten der Nachricht.
/// </summary>
public class Grunddaten
{
    /// <summary>
    /// Verfahrensdaten nehmen alle Informationen auf, die das jeweilige Verfahren mit sich bringt.
    /// </summary>
    [XmlElement("verfahrensdaten", Namespace = XJustizExport.Tns)]
    public Verfahrensdaten? Verfahrensdaten { get; set; }
}
