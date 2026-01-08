namespace xjustiz.core_dotnet.Models.Helpers;

using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Enthält Konstanten für XJustiz-Namespaces.<br/>
/// <u><b>XJustiz constants:</b></u> Contains constants for XJustiz namespaces.
/// </summary>
public static class XJustizConstants
{
    /// <summary>
    /// Target Namespace für XJustiz.<br/>
    /// <u><b>Target namespace:</b></u> Target Namespace for XJustiz.
    /// </summary>
    public const string Tns = "http://www.xjustiz.de";

    /// <summary>
    /// XML Schema Instance Namespace.<br/>
    /// <u><b>XML schema instance namespace:</b></u> XML Schema Instance Namespace.
    /// </summary>
    public const string Xsi = "http://www.w3.org/2001/XMLSchema-instance";

    /// <summary>
    /// Enthält Informationen zur neuesten XJustiz-Core-Version.<br/>
    /// <u><b>Latest XJustiz core version:</b></u> Contains information about the latest XJustiz Core version.
    /// </summary>
    public static class LatestXJustizCoreVersion
    {
        /// <summary>
        /// Die neueste XJustiz-Core-Version.<br/>
        /// <u><b>Version:</b></u> The latest XJustiz Core version.
        /// </summary>
        public static XJustizCoreVersion Version => XJustizCoreVersion.V0_2_0;

        /// <summary>
        /// Die Zeichenkettendarstellung der neuesten XJustiz-Core-Version (z.B. '0.2.0').<br/>
        /// <u><b>Version string:</b></u> The string representation of the latest XJustiz Core version (e.g. '0.2.0').
        /// </summary>
        public static string VersionString
        {
            get
            {
                string name = Version.ToString();   // "V0_2_0"
                return name.TrimStart('V').Replace('_', '.'); // "0.2.0"
            }
        }

        /// <summary>
        /// Die referenzierte XJustiz-Version.<br/>
        /// <u><b>XJustiz reference version:</b></u> The referenced XJustiz version.
        /// </summary>
        public static XJustizVersion XJustizReferenzVersion => XJustizVersion.V3_5_1;

        /// <summary>
        /// Die Zeichenkettendarstellung der referenzierten XJustiz-Version (z.B. '3.5.1').<br/>
        /// <u><b>XJustiz reference version string:</b></u> The string representation of the referenced XJustiz version (e.g. '3.5.1').
        /// </summary>
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