namespace xjustiz.core_dotnet.Models.Codes.Staat;

using System.Collections.Concurrent;
using System.Xml.Serialization;

/// <summary>
/// Erweiterungsmethoden für <see cref="StaatCode"/>.<br/>
/// <u><b>Country code extensions:</b></u> Extension methods for <see cref="StaatCode"/>.
/// </summary>
public static class StaatCodeExtensions
{
    private static readonly ConcurrentDictionary<StaatCode, string> CodeCache = new();

    public static string ToCode(this StaatCode staatCode)
    {
        return CodeCache.GetOrAdd(staatCode, sc =>
        {
            var type = typeof(StaatCode);
            var memberInfo = type.GetMember(sc.ToString());
            if (memberInfo.Length > 0)
            {
                var attributes = memberInfo[0].GetCustomAttributes(typeof(XmlEnumAttribute), false);
                if (attributes.Length > 0)
                {
                    return ((XmlEnumAttribute)attributes[0]).Name!;
                }
            }

            return sc.ToString();
        });
    }
}
