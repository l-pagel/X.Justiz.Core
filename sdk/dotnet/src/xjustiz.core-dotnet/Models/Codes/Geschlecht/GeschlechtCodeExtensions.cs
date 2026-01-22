namespace xjustiz.core_dotnet.Models.Codes.Geschlecht;

/// <summary>
/// Erweiterungsmethoden für <see cref="GeschlechtCode"/>.<br/>
/// <u><b>Gender code extensions:</b></u> Extension methods for <see cref="GeschlechtCode"/>.
/// </summary>
public static class GeschlechtCodeExtensions
{
    public static string ToCode(this GeschlechtCode value)
    {
        var memberInfo = typeof(GeschlechtCode).GetMember(value.ToString());
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
