namespace xjustiz.core_dotnet.Util.Versioning;

using System;

/// <summary>
/// Basisklasse für Versionsverfügbarkeitsattribute.<br/>
/// <u><b>Version availability attribute:</b></u> Base class for version availability attributes.
/// </summary>
public abstract class VersionAvailabilityAttribute(int introduced)
    : Attribute
{
    protected int IntroducedRaw { get; } = introduced;

    protected int RemovedRaw { get; set; }

    protected bool IsAvailableRaw(int version)
    {
        if (version < IntroducedRaw)
        {
            return false;
        }

        return RemovedRaw == 0 || version < RemovedRaw;
    }
}