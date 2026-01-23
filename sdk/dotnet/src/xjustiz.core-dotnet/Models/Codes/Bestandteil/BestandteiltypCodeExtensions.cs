namespace xjustiz.core_dotnet.Models.Codes.Bestandteil;

/// <summary>
/// Erweiterungsmethoden für <see cref="BestandteiltypCode"/>.<br/>
/// <u><b>Component type code extensions:</b></u> Extension methods for <see cref="BestandteiltypCode"/>.
/// </summary>
public static class BestandteiltypCodeExtensions
{
    public static string ToCode(this BestandteiltypCode value)
    {
        var memberInfo = typeof(BestandteiltypCode).GetMember(value.ToString());
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