namespace xjustiz.core_dotnet.Models.Helpers;

using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Enthält Konstanten für XJustiz-Namespaces.<br/>
/// <u><b>XJustiz constants:</b></u> Contains constants for XJustiz namespaces.
/// </summary>
public static class XJustizConstants
{
    public const string Tns = "http://www.xjustiz.de";
    public const string Xsi = "http://www.w3.org/2001/XMLSchema-instance";

    public static class LatestXJustizCoreVersion
    {
        public static XJustizCoreVersion Version => XJustizCoreVersion.V0_2_0;

        public static string VersionString
        {
            get
            {
                string name = Version.ToString();   // "V0_2_0"
                return name.TrimStart('V').Replace('_', '.'); // "0.2.0"
            }
        }

        public static XJustizVersion XJustizReferenzVersion => XJustizVersion.V3_5_1;

        public static string XJustizReferenzVersionString
        {
            get
            {
                string name = XJustizReferenzVersion.ToString();   // "V0_2_0"
                return name.TrimStart('V').Replace('_', '.'); // "0.2.0"
            }
        }
    }
}