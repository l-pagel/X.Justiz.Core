namespace xjustiz.core_dotnet.Models.Codes.Versicherung;

/// <summary>
/// Erweiterungsmethoden für <see cref="VersicherungsCode"/>.<br/>
/// <u><b>Insurance code extensions:</b></u> Extension methods for <see cref="VersicherungsCode"/>.
/// </summary>
public static class VersicherungsCodeExtensions
{
    public static string ToCode(this VersicherungsCode value)
    {
        var memberInfo = typeof(VersicherungsCode).GetMember(value.ToString());
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
