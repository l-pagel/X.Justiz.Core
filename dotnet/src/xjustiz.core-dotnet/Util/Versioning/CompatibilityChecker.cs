namespace xjustiz.core_dotnet.Util.Versioning;

using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Überprüft die Kompatibilität von X.Justiz-Nachrichten mit verschiedenen X.Justiz- und X.Justiz-Core-Versionen.<br/>
/// <u><b>Compatibility Checker:</b></u> Checks the compatibility of X.Justiz messages with different X.Justiz and X.Justiz Core versions.
/// </summary>
public static class CompatibilityChecker
{
    /// <summary>
    /// Überprüft die Kompatibilität der übergebenen Nachricht.<br/>
    /// <u><b>Check compatibility:</b></u> Checks the compatibility of the provided message.
    /// </summary>
    /// <param name="model">
    /// Die zu prüfende Nachricht.<br/>
    /// <u><b>Message:</b></u> The message to check.
    /// </param>
    /// <returns>
    /// Das Ergebnis der Kompatibilitätsprüfung.<br/>
    /// <u><b>Result:</b></u> The result of the compatibility check.
    /// </returns>
    public static CompatibilityResult Check(UebermittlungSchriftgutobjekteNachricht model)
    {
        // Start with all known versions (excluding None)
        var xVersions = Enum.GetValues<XJustizVersion>()
             .Where(v => v != XJustizVersion.None)
             .ToList();

        var xCoreVersions = Enum.GetValues<XJustizCoreVersion>()
             .Where(v => typeof(XJustizCoreVersion).GetField(v.ToString())?.GetCustomAttribute<ForTestingOnlyAttribute>() == null)
             .ToList();

        CheckObject(model, xVersions, xCoreVersions);

        return new CompatibilityResult
        {
            CompatibleXJustizVersions = xVersions,
            CompatibleXJustizCoreVersions = xCoreVersions,
        };
    }

    private static void CheckObject(object? obj, List<XJustizVersion> xVersions, List<XJustizCoreVersion> xCoreVersions)
    {
        if (obj == null)
        {
            return;
        }

        if (xVersions.Count == 0 && xCoreVersions.Count == 0)
        {
            return;
        }

        Type type = obj.GetType();

        // Check Class Attributes (only for our models)
        if (IsXJustizModel(type))
        {
            ApplyAttributes(type.GetCustomAttributes(), xVersions, xCoreVersions);
        }

        CheckProperties(obj, xVersions, xCoreVersions);
    }

    private static void CheckProperties(object obj, List<XJustizVersion> xVersions, List<XJustizCoreVersion> xCoreVersions)
    {
        foreach (var prop in obj.GetType().GetProperties(BindingFlags.Public | BindingFlags.Instance))
        {
            // Skip indexers
            if (prop.GetIndexParameters().Length > 0)
            {
                continue;
            }

            if (TryGetPropertyValue(prop, obj, out var val) && val != null)
            {
                ApplyAttributes(prop.GetCustomAttributes(), xVersions, xCoreVersions);
                CheckValueRecursively(val, xVersions, xCoreVersions);
            }

            // Optimization: Stop if no versions left
            if (xVersions.Count == 0 && xCoreVersions.Count == 0)
            {
                return;
            }
        }
    }

    private static bool TryGetPropertyValue(PropertyInfo prop, object obj, out object? val)
    {
        try
        {
            val = prop.GetValue(obj);
            return true;
        }
        catch
        {
            val = null;
            return false;
        }
    }

    private static void CheckValueRecursively(object val, List<XJustizVersion> xVersions, List<XJustizCoreVersion> xCoreVersions)
    {
        if (val is string)
        {
            // String is IEnumerable but we treat it as primitive
            return;
        }

        if (val is IEnumerable enumerable)
        {
            foreach (var item in enumerable)
            {
                CheckObject(item, xVersions, xCoreVersions);
            }
        }
        else if (IsXJustizModel(val.GetType()))
        {
            CheckObject(val, xVersions, xCoreVersions);
        }
    }

    private static void ApplyAttributes(IEnumerable<Attribute> attributes, List<XJustizVersion> xVersions, List<XJustizCoreVersion> xCoreVersions)
    {
        foreach (var attr in attributes)
        {
            if (attr is XJustizAvailabilityAttribute xAttr)
            {
                // Remove versions that are NOT available
                // ToList() used to allow modification during iteration if we used remove (but RemoveAll handles list fine)
                xVersions.RemoveAll(v => !xAttr.IsAvailableIn(v));
            }
            else if (attr is XJustizCoreAvailabilityAttribute cAttr)
            {
                xCoreVersions.RemoveAll(v => !cAttr.IsAvailableIn(v));
            }
        }
    }

    private static bool IsXJustizModel(Type type)
    {
        // Check if the type is defined in the xjustiz assembly/namespace
        return type.Namespace?.StartsWith("xjustiz", StringComparison.OrdinalIgnoreCase) == true;
    }

    /// <summary>
    /// Das Ergebnis der Kompatibilitätsprüfung.<br/>
    /// <u><b>Compatibility Result:</b></u> The result of the compatibility check.
    /// </summary>
    public class CompatibilityResult
    {
        /// <summary>
        /// Eine Liste der kompatiblen X.Justiz-Versionen.<br/>
        /// <u><b>Compatible X.Justiz versions:</b></u> A list of compatible X.Justiz versions.
        /// </summary>
        public List<XJustizVersion> CompatibleXJustizVersions { get; set; } = [];

        /// <summary>
        /// Eine Liste der kompatiblen X.Justiz-Core-Versionen.<br/>
        /// <u><b>Compatible X.Justiz Core versions:</b></u> A list of compatible X.Justiz Core versions.
        /// </summary>
        public List<XJustizCoreVersion> CompatibleXJustizCoreVersions { get; set; } = [];
    }
}
