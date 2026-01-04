namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Collections.Generic;
using System.Xml.Serialization;

//TODO: What namespace to use for completely new fields and types
//TODO: Should we add this Type or rather extend Organisation
public class Versicherung
{
    [XmlElement("versicherungsnummer", Namespace = "")]
    public string? Versicherungsnummer { get; set; }

    [XmlElement("versicherungsunternehmen", Namespace = "")]
    public List<Organisation>? Versicherungsunternehmen { get; set; }

    [XmlElement("anschrift", Namespace = "")]
    public Anschrift? Anschrift { get; set; }

    [XmlElement("referenzid", Namespace = "")]
    public Guid? ReferenzId { get; set; }

    [XmlElement("versicherter", Namespace = "")]
    public AuswahlBeteiligter? Versicherter { get; set; }

    [XmlElement("schadensnummer", Namespace = "")]
    public string? Schadensnummer { get; set; }

    [XmlElement("versicherungstyp", Namespace = "")]
    public VersicherungsTyp? Versicherungstyp { get; set; }

    [XmlElement("rechtsschutsversicherungstyp", Namespace = "")]
    public RechtschutzVersicherungsTyp? RechtsschutzTyp { get; set; }

    [XmlElement("fahrzeug", Namespace = "")]
    public Fahrzeug? Fahrzeug { get; set; }

    [XmlElement("selbstbeteiligung", Namespace = "")]
    public Selbstbeteiligung? Selbstbeteiligung { get; set; }

    [XmlElement("anwendungsspezifischeErweiterung", Namespace = "")]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }
}

public class VersicherungsTyp
{
    [XmlElement("code", Namespace = "")]
    public string? Code { get; set; }
}

public class RechtschutzVersicherungsTyp
{
    [XmlElement("code", Namespace = "")]
    public string? Code { get; set; }
}

public class Fahrzeug
{
    [XmlElement("fahrzeugkennzeichen", Namespace = "")]
    public string? Fahrzeugkennzeichen { get; set; }

    [XmlElement("fahrzeugversicherungstyp", Namespace = "")]
    public FahrzeugversicherungsTyp? Fahrzeugversicherungstyp { get; set; }
}

public class FahrzeugversicherungsTyp
{
    [XmlElement("code", Namespace = "")]
    public string? Code { get; set; }
}

public class Selbstbeteiligung
{
    [XmlElement("selbstbehaltbeteiligung", Namespace = "")]
    public string? SelbstbehaltBeteiligung { get; set; }

    [XmlElement("teilweiseumfassendeSelbstbeteiligung", Namespace = "")]
    public string? TeilweiseUmfassendeSelbstbeteiligung { get; set; }

    [XmlElement("eumfassendeSelbstbeteiligung", Namespace = "")]
    public string? UmfassendeSelbstbeteiligung { get; set; }
}
