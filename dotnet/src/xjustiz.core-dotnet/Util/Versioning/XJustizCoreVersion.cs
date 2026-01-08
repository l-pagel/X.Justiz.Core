namespace xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Definiert die XJustiz-Core-Versionen.<br/>
/// <u><b>XJustiz core version:</b></u> Defines the XJustiz Core versions.
/// </summary>
[System.Text.Json.Serialization.JsonConverter(typeof(System.Text.Json.Serialization.JsonStringEnumConverter))]
public enum XJustizCoreVersion
{
    /// <summary>
    /// Beta-Version, gültig ab 01.01.2026<br/>
    /// Beta version, valid from 01.01.2026
    /// </summary>
    V0_2_0 = 020,

    /// <summary>
    /// Version ausschliesslich zum Testen<br/>
    /// Version for testing purposes only
    /// </summary>
    [ForTestingOnly("In unit tests for compatibility- / availablity checks")]
    V_TEST_NOT_AVAILABLE_YET = 9999,
}
