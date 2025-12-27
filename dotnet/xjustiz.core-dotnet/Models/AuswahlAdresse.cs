namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class AuswahlAdresse
{
    [XmlElement("absender.sonstige", Namespace = XJustizExport.Tns)]
    public string? AbsenderSonstige { get; set; }

    [XmlElement("empfaenger.sonstige", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerSonstige { get; set; }

    [XmlElement("empfaenger.gericht", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerGericht { get; set; }

    [XmlElement("empfaenger.rvTraeger", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerRvTraeger { get; set; }

    [XmlElement("empfaenger.polizeibehoerde", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerPolizei { get; set; }
}
