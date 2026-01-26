namespace xjustiz.core_dotnet.Models.Codes.Versicherer;

public static class VersichererCodeExtensions
{
    public static string ToCode(this VersichererCode value)
    {
        var memberInfo = typeof(VersichererCode).GetMember(value.ToString());
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