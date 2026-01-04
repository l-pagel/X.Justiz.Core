namespace xjustiz.core_dotnet.Models.Codes.Gericht;

using System.Collections.Concurrent;
using System.Xml.Serialization;

public static class GerichtCodeExtensions
{
    private static readonly ConcurrentDictionary<GerichtCode, string> CodeCache = new();

    public static string ToCode(this GerichtCode code)
    {
        return CodeCache.GetOrAdd(code, c =>
        {
            var type = typeof(GerichtCode);
            var memberInfo = type.GetMember(c.ToString());
            if (memberInfo.Length > 0)
            {
                var attributes = memberInfo[0].GetCustomAttributes(typeof(XmlEnumAttribute), false);
                if (attributes.Length > 0)
                {
                    return ((XmlEnumAttribute)attributes[0]).Name!;
                }
            }

            return c.ToString();
        });
    }
}
