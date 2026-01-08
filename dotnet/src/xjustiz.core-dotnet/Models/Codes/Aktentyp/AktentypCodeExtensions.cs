namespace xjustiz.core_dotnet.Models.Codes.Aktentyp;

public static class AktentypCodeExtensions
{
    public static string ToCode(this AktentypCode value)
    {
        var memberInfo = typeof(AktentypCode).GetMember(value.ToString());
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
