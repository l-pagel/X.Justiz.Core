// <copyright file="MessageComparer.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace xjustiz.core_dotnet.IntegrationTests.Infrastructure;

using System.Collections;
using System.Reflection;

/// <summary>
/// Deep comparison utility for UebermittlungSchriftgutobjekteNachricht and nested models.
/// Provides detailed reports of any differences found between two object graphs.
/// </summary>
public class MessageComparer(params string[] ignoredPaths)
{
    private readonly List<string> differences = [];
    private readonly HashSet<string> ignoredPaths = new(ignoredPaths, StringComparer.OrdinalIgnoreCase);

    /// <summary>
    /// Compares two objects deeply and returns a list of differences.
    /// </summary>
    /// <typeparam name="T">The type of the objects being compared.</typeparam>
    /// <param name="expected">The expected object instance (the baseline).</param>
    /// <param name="actual">The actual object instance to check for deviations.</param>
    /// <param name="path">The breadcrumb path used for tracking nested properties during recursion. Defaults to "root".</param>
    /// <returns>A read-only list of strings, where each string describes a specific difference found.</returns>
    public IReadOnlyList<string> Compare<T>(T? expected, T? actual, string path = "root")
    {
        differences.Clear();
        CompareObjects(expected, actual, path);
        return differences.AsReadOnly();
    }

    /// <summary>
    /// Compares two objects and returns true if they are equivalent.
    /// </summary>
    /// <typeparam name="T">The type of the objects to compare.</typeparam>
    /// <param name="expected">The expected object instance.</param>
    /// <param name="actual">The actual object instance to be compared against the expected one.</param>
    /// <param name="foundDifferences">When this method returns, contains a list of strings describing the differences found, if any.</param>
    /// <returns>True if the objects are equivalent (no differences found); otherwise, false.</returns>
    public bool AreEqual<T>(T? expected, T? actual, out IReadOnlyList<string> foundDifferences)
    {
        foundDifferences = Compare(expected, actual);
        return foundDifferences.Count == 0;
    }

    /// <summary>
    /// Creates a detailed comparison report.
    /// </summary>
    public static string CreateReport(IReadOnlyList<string> differences, string testName)
    {
        if (differences.Count == 0)
        {
            return $"[{testName}] ✓ All data matched successfully";
        }

        var sb = new System.Text.StringBuilder();
        sb.AppendLine($"[{testName}] ✗ Found {differences.Count} difference(s):");
        sb.AppendLine(new string('-', 60));

        foreach (var diff in differences.Take(50)) // Limit to first 50 differences
        {
            sb.AppendLine($"  • {diff}");
        }

        if (differences.Count > 50)
        {
            sb.AppendLine($"  ... and {differences.Count - 50} more differences");
        }

        return sb.ToString();
    }

    private void CompareObjects(object? expected, object? actual, string path)
    {
        // Check if path should be ignored
        if (ignoredPaths.Any(p => path.Contains(p, StringComparison.OrdinalIgnoreCase)))
        {
            return;
        }

        // Handle nulls
        if (expected == null && actual == null)
        {
            return;
        }

        // Handle null vs empty collection equivalence
        if (expected == null && actual is IEnumerable en && !en.Cast<object>().Any())
        {
            return;
        }

        if (actual == null && expected is IEnumerable en2 && !en2.Cast<object>().Any())
        {
            return;
        }

        if (expected == null)
        {
            differences.Add($"{path}: Expected null, but got value '{actual}'");
            return;
        }

        if (actual == null)
        {
            differences.Add($"{path}: Expected '{expected}', but got null");
            return;
        }

        var type = expected.GetType();

        // Handle primitives and simple types
        if (IsSimpleType(type))
        {
            CompareSimpleValues(expected, actual, path);
            return;
        }

        // Handle strings
        if (type == typeof(string))
        {
            if (!string.Equals((string)expected, (string)actual, StringComparison.Ordinal))
            {
                differences.Add($"{path}: String mismatch - Expected '{expected}', Actual '{actual}'");
            }

            return;
        }

        // Handle collections
        if (expected is IEnumerable expectedEnumerable && actual is IEnumerable actualEnumerable)
        {
            CompareCollections(expectedEnumerable, actualEnumerable, path);
            return;
        }

        // Handle complex objects
        CompareComplexObjects(expected, actual, path);
    }

    private void CompareSimpleValues(object expected, object actual, string path)
    {
        // Handle DateTime specially - compare with tolerance
        if (expected is DateTime expectedDate && actual is DateTime actualDate)
        {
            // Allow 1 second tolerance for datetime comparisons
            if (Math.Abs((expectedDate - actualDate).TotalSeconds) > 1)
            {
                differences.Add($"{path}: DateTime mismatch - Expected '{expectedDate:O}', Actual '{actualDate:O}'");
            }

            return;
        }

        // Handle DateTimeOffset
        if (expected is DateTimeOffset expectedOffset && actual is DateTimeOffset actualOffset)
        {
            if (Math.Abs((expectedOffset - actualOffset).TotalSeconds) > 1)
            {
                differences.Add($"{path}: DateTimeOffset mismatch - Expected '{expectedOffset:O}', Actual '{actualOffset:O}'");
            }

            return;
        }

        // Handle decimals with tolerance
        if (expected is decimal expectedDecimal && actual is decimal actualDecimal)
        {
            if (Math.Abs(expectedDecimal - actualDecimal) > 0.0001m)
            {
                differences.Add($"{path}: Decimal mismatch - Expected '{expected}', Actual '{actual}'");
            }

            return;
        }

        // Handle doubles with tolerance
        if (expected is double expectedDouble && actual is double actualDouble)
        {
            if (Math.Abs(expectedDouble - actualDouble) > 0.0001)
            {
                differences.Add($"{path}: Double mismatch - Expected '{expected}', Actual '{actual}'");
            }

            return;
        }

        // General equality
        if (!expected.Equals(actual))
        {
            differences.Add($"{path}: Value mismatch - Expected '{expected}', Actual '{actual}'");
        }
    }

    private void CompareCollections(IEnumerable expected, IEnumerable actual, string path)
    {
        var expectedList = expected.Cast<object?>().ToList();
        var actualList = actual.Cast<object?>().ToList();

        if (expectedList.Count != actualList.Count)
        {
            differences.Add($"{path}: Collection count mismatch - Expected {expectedList.Count} items, Actual {actualList.Count} items");
            // Continue comparing up to the minimum count
        }

        var minCount = Math.Min(expectedList.Count, actualList.Count);
        for (var i = 0; i < minCount; i++)
        {
            CompareObjects(expectedList[i], actualList[i], $"{path}[{i}]");
        }

        // Report missing items
        for (var i = minCount; i < expectedList.Count; i++)
        {
            differences.Add($"{path}[{i}]: Missing expected item '{expectedList[i]}'");
        }

        // Report extra items
        for (var i = minCount; i < actualList.Count; i++)
        {
            differences.Add($"{path}[{i}]: Unexpected extra item '{actualList[i]}'");
        }
    }

    private void CompareComplexObjects(object expected, object actual, string path)
    {
        var expectedType = expected.GetType();
        var actualType = actual.GetType();

        // Types should be compatible
        if (!expectedType.IsAssignableFrom(actualType) && !actualType.IsAssignableFrom(expectedType))
        {
            differences.Add($"{path}: Type mismatch - Expected '{expectedType.Name}', Actual '{actualType.Name}'");
            return;
        }

        // Compare all public properties
        var properties = expectedType.GetProperties(BindingFlags.Public | BindingFlags.Instance)
            .Where(p => p.CanRead && p.GetIndexParameters().Length == 0);

        foreach (var property in properties)
        {
            try
            {
                var expectedValue = property.GetValue(expected);
                var actualValue = property.GetValue(actual);
                CompareObjects(expectedValue, actualValue, $"{path}.{property.Name}");
            }
            catch (Exception ex)
            {
                differences.Add($"{path}.{property.Name}: Error accessing property - {ex.Message}");
            }
        }
    }

    private static bool IsSimpleType(Type type)
    {
        return type.IsPrimitive
            || type.IsEnum
            || type == typeof(decimal)
            || type == typeof(DateTime)
            || type == typeof(DateTimeOffset)
            || type == typeof(TimeSpan)
            || type == typeof(Guid);
    }
}
