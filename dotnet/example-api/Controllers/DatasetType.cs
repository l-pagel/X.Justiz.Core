// <copyright file="DatasetType.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace example_api.Controllers;

/// <summary>
/// Available sample datasets.
/// </summary>
[System.Text.Json.Serialization.JsonConverter(typeof(System.Text.Json.Serialization.JsonStringEnumConverter))]
public enum DatasetType
{
    /// <summary>Inheritance Law</summary>
    Erbrecht,

    /// <summary>Tenancy Law</summary>
    Mietrecht,

    /// <summary>Labor Law</summary>
    Arbeitsrecht,

    /// <summary>Air Passenger Rights</summary>
    Fluggastrecht,
}
