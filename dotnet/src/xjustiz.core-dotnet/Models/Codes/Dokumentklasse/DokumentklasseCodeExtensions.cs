namespace xjustiz.core_dotnet.Models.Codes.Dokumentklasse;

using System.Collections.Concurrent;
using System.Xml.Serialization;

public static class DokumentklasseCodeExtensions
{
    private static readonly ConcurrentDictionary<DokumentklasseCode, string> CodeCache = new();

    public static string ToCode(this DokumentklasseCode code)
    {
        return CodeCache.GetOrAdd(code, c =>
        {
            var type = typeof(DokumentklasseCode);
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
