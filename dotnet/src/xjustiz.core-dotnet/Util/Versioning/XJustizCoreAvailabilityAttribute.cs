namespace xjustiz.core_dotnet.Util.Versioning;

using System;

/// <summary>
/// Legt die Verfügbarkeit basierend auf der X.Justiz Core-Version fest.<br/>
/// <u><b>XJustiz core availability attribute:</b></u> Defines availability based on the XJustiz Core version.
/// </summary>
[AttributeUsage(AttributeTargets.Class | AttributeTargets.Property | AttributeTargets.Enum | AttributeTargets.Field)]
public sealed class XJustizCoreAvailabilityAttribute(XJustizCoreVersion introduced)
    : VersionAvailabilityAttribute((int)introduced)
{
    public XJustizCoreVersion IntroducedIn => (XJustizCoreVersion)IntroducedRaw;

    public XJustizCoreVersion Removed
    {
        get => (XJustizCoreVersion)RemovedRaw;
        set => RemovedRaw = (int)value;
    }

    public bool IsAvailableIn(XJustizCoreVersion version)
        => IsAvailableRaw((int)version);
}