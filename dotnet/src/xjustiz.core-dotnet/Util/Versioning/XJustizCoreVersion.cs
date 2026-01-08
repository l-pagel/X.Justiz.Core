namespace xjustiz.core_dotnet.Util.Versioning;

public enum XJustizCoreVersion
{
    /// <summary>
    /// Beta-Version, gültig ab 01.01.2026<br/>
    /// Vate version, valid from 01.01.2026
    /// </summary>
    V0_2_0 = 020,

    /// <summary>
    /// Version ausschliesslich zum Testen<br/>
    /// Version for testing purposes only
    /// </summary>
    [ForTestingOnly("In unit tests for compatibility- / availablity checks")]
    V_TEST_NOT_AVAILABLE_YET = 9999,
}
