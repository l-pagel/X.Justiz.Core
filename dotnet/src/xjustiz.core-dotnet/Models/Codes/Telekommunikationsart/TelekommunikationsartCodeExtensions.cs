namespace xjustiz.core_dotnet.Models.Codes.Telekommunikationsart;

/// <summary>
/// Erweiterungsmethoden für <see cref="TelekommunikationsartCode"/>.<br/>
/// <u><b>Telecommunication type code extensions:</b></u> Extension methods for <see cref="TelekommunikationsartCode"/>.
/// </summary>
public static class TelekommunikationsartCodeExtensions
{
    public static string ToCode(this TelekommunikationsartCode value)
    {
        var memberInfo = typeof(TelekommunikationsartCode).GetMember(value.ToString());
        if (memberInfo.Length > 0)
        {
            var attributes = memberInfo[0].GetCustomAttributes(typeof(System.Xml.Serialization.XmlEnumAttribute), false);
            if (attributes.Length > 0)
            {
                return ((System.Xml.Serialization.XmlEnumAttribute)attributes[0]).Name!;
            }
        }

        return value.ToString();
    }
}
