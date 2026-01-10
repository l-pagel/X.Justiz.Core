namespace xjustiz.core_dotnet.Util.Versioning;

using System;

/// <summary>
/// Legt die Verfügbarkeit basierend auf der XJustiz-Version fest.<br/>
/// <u><b>XJustiz availability attribute:</b></u> Defines availability based on the XJustiz version.
/// </summary>
[AttributeUsage(AttributeTargets.Class | AttributeTargets.Property | AttributeTargets.Enum | AttributeTargets.Field)]
public sealed class XJustizAvailabilityAttribute(XJustizVersion introduced)
    : VersionAvailabilityAttribute((int)introduced)
{
    public XJustizVersion IntroducedIn => (XJustizVersion)IntroducedRaw;

    public XJustizVersion Removed
    {
        get => (XJustizVersion)RemovedRaw;
        set => RemovedRaw = (int)value;
    }

    public bool IsAvailableIn(XJustizVersion version)
        => IsAvailableRaw((int)version);
}
