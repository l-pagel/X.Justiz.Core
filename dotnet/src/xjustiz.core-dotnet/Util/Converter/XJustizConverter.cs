namespace xjustiz.core_dotnet.Util.Converter;

using System;
using System.Collections;
using System.Collections.Generic;
using System.Reflection;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Converter for X.Justiz and X.Justiz-Core messages.
/// Converts messages to a specific target version, filtering out unsupported properties.
/// </summary>
public static class XJustizConverter
{
    /// <summary>
    /// Converts the source message to the target X.Justiz version.
    /// </summary>
    /// <param name="source">The source message to convert.</param>
    /// <param name="targetVersion">The target X.Justiz version.</param>
    /// <returns>A result containing the converted message and a list of lost data.</returns>
    public static ConversionResult Convert(UebermittlungSchriftgutobjekteNachricht source, XJustizVersion targetVersion)
    {
        return ConvertInternal(source, targetVersion);
    }

    /// <summary>
    /// Converts the source message to the target X.Justiz-Core version.
    /// </summary>
    /// <param name="source">The source message to convert.</param>
    /// <param name="targetVersion">The target X.Justiz-Core version.</param>
    /// <returns>A result containing the converted message and a list of lost data.</returns>
    public static ConversionResult Convert(UebermittlungSchriftgutobjekteNachricht source, XJustizCoreVersion targetVersion)
    {
        return ConvertInternal(source, targetVersion);
    }

    /// <summary>
    /// Deep copies the object and filters properties based on version availability.
    /// </summary>
    /// <param name="source">The source.</param>
    /// <param name="targetVersion">The target version.</param>
    /// <param name="lostData">The lost data list.</param>
    /// <param name="context">The context path.</param>
    /// <returns>The copied object.</returns>
    internal static object? DeepCopy(object? source, Enum targetVersion, List<string> lostData, string context)
    {
        if (source == null)
        {
            return null;
        }

        var type = source.GetType();

        // 1. Check availability of the Type (Class/Enum) itself
        if (!IsSimple(type) && !IsAvailable(type, targetVersion))
        {
            lostData.Add($"Type '{type.Name}' is not available in {targetVersion.GetType().Name} {targetVersion}. (Context: {context})");
            return null;
        }

        // 2. Handle Simple Types (Primitives, Strings, Enums, DateTime, etc.)
        if (IsSimple(type))
        {
            return source;
        }

        // 3. Handle Collections (Arrays and Lists)
        if (typeof(IEnumerable).IsAssignableFrom(type))
        {
            return HandleCollection(source, type, targetVersion, lostData, context);
        }

        // 4. Handle Complex Objects (Classes)
        return HandleComplexObject(source, type, targetVersion, lostData, context);
    }

    internal static ConversionResult ConvertInternal(UebermittlungSchriftgutobjekteNachricht source, Enum targetVersion)
    {
        var lostData = new List<string>();
        // Root context name
        var result = (UebermittlungSchriftgutobjekteNachricht?)DeepCopy(source, targetVersion, lostData, typeof(UebermittlungSchriftgutobjekteNachricht).Name);

        return new ConversionResult
        {
            Result = result,
            LostData = lostData,
        };
    }

    private static object HandleCollection(object source, Type type, Enum targetVersion, List<string> lostData, string context)
    {
        if (type.IsArray)
        {
            var arr = (Array)source;
            var elementType = type.GetElementType() !;
            var validItems = new List<object?>();

            for (int i = 0; i < arr.Length; i++)
            {
                var val = arr.GetValue(i);
                var converted = DeepCopy(val, targetVersion, lostData, $"{context}[{i}]");
                if (converted != null)
                {
                    validItems.Add(converted);
                }
            }

            var newArr = Array.CreateInstance(elementType, validItems.Count);
            for (int i = 0; i < validItems.Count; i++)
            {
                newArr.SetValue(validItems[i], i);
            }

            return newArr;
        }
        else if (type.IsGenericType && type.GetGenericTypeDefinition() == typeof(List<>))
        {
            var list = (IList)Activator.CreateInstance(type) !;
            var sourceList = (IList)source;
            int i = 0;
            foreach (var item in sourceList)
            {
                var converted = DeepCopy(item, targetVersion, lostData, $"{context}[{i}]");
                if (converted != null)
                {
                    list.Add(converted);
                }

                i++;
            }

            return list;
        }

        return source;
    }

    private static object HandleComplexObject(object source, Type type, Enum targetVersion, List<string> lostData, string context)
    {
        var instance = Activator.CreateInstance(type);
        if (instance == null)
        {
            return null!;
        }

        foreach (var prop in type.GetProperties(BindingFlags.Public | BindingFlags.Instance))
        {
            if (!prop.CanRead || !prop.CanWrite || prop.GetIndexParameters().Length > 0)
            {
                continue;
            }

            // Check Property Availability
            if (!IsAvailable(prop, targetVersion))
            {
                var value = prop.GetValue(source);
                if (value != null)
                {
                    lostData.Add($"Property '{prop.Name}' in '{type.Name}' is not available in {targetVersion.GetType().Name} {targetVersion}. (Context: {context}.{prop.Name})");
                }

                continue;
            }

            var val = prop.GetValue(source);
            var convertedVal = DeepCopy(val, targetVersion, lostData, $"{context}.{prop.Name}");

            prop.SetValue(instance, convertedVal);
        }

        return instance;
    }

    private static bool IsSimple(Type type)
    {
        return type.IsPrimitive
            || type.IsEnum
            || type == typeof(string)
            || type == typeof(decimal)
            || type == typeof(DateTime)
            || type == typeof(Guid)
            || (type.IsGenericType && type.GetGenericTypeDefinition() == typeof(Nullable<>) && IsSimple(Nullable.GetUnderlyingType(type) !));
    }

    private static bool IsAvailable(MemberInfo member, Enum targetVersion)
    {
        if (targetVersion is XJustizVersion xv)
        {
            var attr = member.GetCustomAttribute<XJustizAvailabilityAttribute>();
            if (attr != null)
            {
                return attr.IsAvailableIn(xv);
            }
        }
        else if (targetVersion is XJustizCoreVersion xcv)
        {
            var attr = member.GetCustomAttribute<XJustizCoreAvailabilityAttribute>();
            if (attr != null)
            {
                return attr.IsAvailableIn(xcv);
            }
        }

        return true;
    }
}
