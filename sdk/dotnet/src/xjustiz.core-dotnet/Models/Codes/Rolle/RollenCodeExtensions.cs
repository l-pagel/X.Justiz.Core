namespace xjustiz.core_dotnet.Models.Codes.Rolle;

/// <summary>
/// Erweiterungsmethoden für <see cref="RollenCode"/>.<br/>
/// <u><b>Role code extensions:</b></u> Extension methods for <see cref="RollenCode"/>.
/// </summary>
public static class RollenCodeExtensions
{
    public static string ToCode(this RollenCode value)
    {
        var memberInfo = typeof(RollenCode).GetMember(value.ToString());
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