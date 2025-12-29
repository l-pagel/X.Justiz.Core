namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Datei.
/// Represents a file.
/// </summary>
public class Datei
{
    /// <summary>
    /// Der Dateiname.
    /// The filename.
    /// </summary>
    [XmlElement("dateiname", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Dateiname { get; set; }

    /// <summary>
    /// Bestandteile der Datei.
    /// Components of the file.
    /// </summary>
    [XmlElement("bestandteil", Namespace = XJustizExport.Tns, Order = 2)]
    public List<Bestandteil> Bestandteile { get; set; } = new();
}
