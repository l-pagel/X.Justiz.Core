namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Grunddaten der Nachricht.
/// Basic data of the message.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Grunddaten
{
    /// <summary>
    /// Verfahrensdaten nehmen alle Informationen auf, die das jeweilige Verfahren mit sich bringt.
    /// Procedures data captures all information that the respective procedure entails.
    /// </summary>
    [XmlElement("verfahrensdaten", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Verfahrensdaten? Verfahrensdaten { get; set; }
}
