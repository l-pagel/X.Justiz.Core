namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;

/// <summary>
/// Auswahlstruktur für eine Instanzbehörde.
/// </summary>
public class AuswahlInstanzbehoerde
{
    /// <summary>
    /// Hier ist die jeweilige XJustiz-ID des Gerichts oder der Staatsanwaltschaft aus der Codeliste anzugeben.
    /// </summary>
    [XmlElement("gericht", Namespace = XJustizExport.Tns)]
    public GerichtCode? Gericht { get; set; }
}
