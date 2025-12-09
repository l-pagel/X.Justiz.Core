namespace XJustiz-Lite.Dotnet
{
    public static class XJustizMapper
    {
        public static UebermittlungSchriftgutobjekteNachricht Map(CaseFileView caseFile, List<StorageObjectDto> exportFiles)
        {
            return new UebermittlungSchriftgutobjekteNachricht
            {
                Kopf = new Nachrichtenkopf
                {
                    AktenzeichenAbsender = string.IsNullOrWhiteSpace(caseFile.FileNumber) ? null : new[] { caseFile.FileNumber },
                    AktenzeichenEmpfaenger = new[] { "NEU" },
                    Erstellungszeitpunkt = EnsureUtc(caseFile.Submitted == default ? DateTime.UtcNow : caseFile.Submitted),
                    Absender = new AuswahlAdresse { AbsenderSonstige = caseFile.LawFirm?.Name },
                    Empfaenger = new AuswahlAdresse { EmpfaengerSonstige = "UNBEKANNT" },
                    EigeneNachrichtenId = caseFile.Id.ToString(),
                },
                Grunddaten = new Grunddaten { Verfahrensdaten = BuildVerfahrensdaten(caseFile) },
                Schriftgutobjekte = BuildSchriftgutobjekte(caseFile, exportFiles),
            };
        }

        private static Verfahrensdaten BuildVerfahrensdaten(CaseFileView caseFile)
        {
            return new Verfahrensdaten
            {
                Verfahrensnummer = caseFile.FileNumber,
                Instanzdaten = new Instanzdaten
                {
                    Instanznummer = "1",
                    Sachgebietszusatz = string.IsNullOrWhiteSpace(caseFile.IssueTypeString) ? "UNBEKANNT" : caseFile.IssueTypeString,
                    AuswahlInstanzbehoerde = new AuswahlInstanzbehoerde
                    {
                        Gericht = new GerichtCode { ListVersionId = "3.5.1", Code = "UNBEKANNT" },
                    },
                },
                Beteiligungen = BuildAllBeteiligungen(caseFile),
            };
        }

        private static List<Beteiligung>? BuildAllBeteiligungen(CaseFileView caseFile)
        {
            var beteiligte = new List<(IEnumerable<ContactView>? Contacts, string Role)>
            {
                (new[] { caseFile.MainClient! }.Where(c => c != null), RoleCodes.Antragsteller),
                (caseFile.Clients,   RoleCodes.Beteiligter),
                (caseFile.Opponents, RoleCodes.Beklagter),
                (caseFile.Witnesses, RoleCodes.Zeuge),
                (caseFile.Others,    RoleCodes.Sonstige),
            };

            var result = beteiligte
                .Where(beteiligte => beteiligte.Contacts?.Any() == true)
                .SelectMany(beteiligte => beteiligte.Contacts!.Select(c => BuildBeteiligung(c, beteiligte.Role)))
                .ToList();

            if (caseFile.Insurances is { Count: > 0 })
            {
                var insuranceParties = caseFile.Insurances
                    .Select(ins => BuildBeteiligungForInsurance(ins, RoleCodes.Sonstige));
                result.AddRange(insuranceParties);
            }

            return result.Count > 0 ? result : null;
        }

        private static Beteiligung BuildBeteiligungForInsurance(InsuranceView ins, string rollenCode)
        {
            var bezeichnung = ins.InsuranceCompany;
            if (string.IsNullOrWhiteSpace(bezeichnung))
            {
                bezeichnung = !string.IsNullOrWhiteSpace(ins.InsuranceTypeName)
                    ? ins.InsuranceTypeName
                    : "Versicherung";
            }

            var org = new Organisation
            {
                Bezeichnung = new Bezeichnung
                {
                    Aktuell = bezeichnung,
                },
                Anschrift = ToAnschriftInsurance(ins),
            };

            return new Beteiligung
            {
                Rolle = new Rolle
                {
                    Rollenbezeichnung = new Rollenbezeichnung { ListVersionId = "3.5.1", Code = rollenCode },
                },
                Beteiligter = new Beteiligter
                {
                    Auswahl = new AuswahlBeteiligter { Org = org },
                },
            };
        }

        private static Beteiligung BuildBeteiligung(ContactView contact, string rollenCode)
        {
            var isOrg = contact.Type == DataTransfer.Enums.ContactType.LegalPerson;

            NatuerlichePerson? np = null;
            Organisation? org = null;

            if (!isOrg)
            {
                np = new NatuerlichePerson
                {
                    VollerName = ToVollerName(contact),
                    Geschlecht = ToGeschlecht(contact),
                    Anschrift = ToAnschriftBeteiligte(contact),
                    Bankverbindung = ToBankverbindung(contact),
                    Telekommunikation = ToTelekommunikation(contact),
                };
            }
            else
            {
                org = new Organisation
                {
                    Bezeichnung = new Bezeichnung
                    {
                        Aktuell = string.IsNullOrWhiteSpace(contact.Name) ? "Unbenannte Organisation" : contact.Name,
                    },
                    Anschrift = ToAnschriftBeteiligte(contact),
                    Bankverbindung = ToBankverbindung(contact),
                    Telekommunikation = ToTelekommunikation(contact),
                };
            }

            return new Beteiligung
            {
                Rolle = new Rolle
                {
                    Rollenbezeichnung = new Rollenbezeichnung { ListVersionId = "3.5.1", Code = rollenCode },
                },
                Beteiligter = new Beteiligter { Auswahl = new AuswahlBeteiligter { NP = np, Org = org } },
            };
        }

        private static VollerName ToVollerName(ContactView contact)
        {
            if (!string.IsNullOrWhiteSpace(contact.FirstName) && !string.IsNullOrWhiteSpace(contact.LastName))
            {
                return new VollerName { Vorname = contact.FirstName, Nachname = contact.LastName, Titel = contact.Title };
            }

            if (string.IsNullOrWhiteSpace(contact.Name))
            {
                return new VollerName { Nachname = contact.LastName ?? "unbekannt", Titel = contact.Title };
            }

            var parts = contact.Name.Trim().Split(' ', StringSplitOptions.RemoveEmptyEntries);

            return parts.Length switch
            {
                0 => new VollerName { Nachname = "unbekannt", Titel = contact.Title },
                1 => new VollerName { Nachname = parts[0], Titel = contact.Title },
                _ => new VollerName
                {
                    Vorname = string.Join(' ', parts, 0, parts.Length - 1),
                    Nachname = parts[parts.Length - 1],
                    Titel = contact.Title,
                },
            };
        }

        private static Anschrift? ToAnschriftBeteiligte(ContactView contact)
        {
            var addrs = contact.Addresses;
            if (addrs is null || addrs.Count == 0)
            {
                return null;
            }

            return ToAnschriftFromAddress(addrs[0]);
        }

        private static Anschrift? ToAnschriftInsurance(InsuranceView insurance)
        {
            return ToAnschriftFromAddress(insurance?.Address);
        }

        private static Anschrift? ToAnschriftFromAddress(object? addrObj)
        {
            if (addrObj is null)
            {
                return null;
            }

            var strasse = TryGet<string>(addrObj, "Street");
            var hausnr = TryGet<string>(addrObj, "HouseNumber");
            var plz = TryGet<string>(addrObj, "PostCode");
            var ort = TryGet<string>(addrObj, "City");
            var land = TryGet<string>(addrObj, "Country");

            if (strasse == null && hausnr == null && plz == null && ort == null && land == null)
            {
                return null;
            }

            return new Anschrift
            {
                Strasse = strasse,
                Hausnummer = hausnr,
                Postleitzahl = plz,
                Ort = ort,
                Staat = string.IsNullOrWhiteSpace(land) ? null : new Staat { Code = land },
            };
        }

        private static Bankverbindung? ToBankverbindung(ContactView contact)
        {
            var bankInfo = contact.BankInfo;
            if (bankInfo is null)
            {
                return null;
            }

            var holder = TryGet<string>(bankInfo, "BankAccountOwner");
            var iban = TryGet<string>(bankInfo, "Iban");
            var bic = TryGet<string>(bankInfo, "Bic");

            if (iban == null && bic == null && holder == null)
            {
                return null;
            }

            return new Bankverbindung { Kontoinhaber = holder, Iban = iban, Bic = bic };
        }

        private static List<Telekommunikation>? ToTelekommunikation(ContactView contact)
        {
            List<Telekommunikation>? list = null;

            void Add(string? value, string code)
            {
                if (string.IsNullOrWhiteSpace(value))
                {
                    return;
                }

                if (list is null)
                {
                    list = new List<Telekommunikation>();
                }

                list.Add(new Telekommunikation
                {
                    Telekommunikationsart = new Telekommunikationsart { code = code },
                    verbindung = value,
                });
            }

            Add(TryGet<string>(contact, "EmailAddress"), "001");
            Add(TryGet<string>(contact, "PhoneNumberString"), "002");
            Add(TryGet<string>(contact, "FaxNumber"), "003");

            return list;
        }

        private static Geschlecht ToGeschlecht(ContactView contact)
        {
            var code = contact.Sex switch
            {
                Sex.Male => "1",
                Sex.Female => "2",
                Sex.Diverse => "3",
                Sex.Unknown => "0",
                _ => "0",
            };

            return new Geschlecht { Code = code };
        }

        private static Schriftgutobjekte BuildSchriftgutobjekte(CaseFileView caseFile, List<StorageObjectDto> exportFiles)
        {
            var (feldgruppen, felder) = MapSectionsDtoToFeldgruppenUndFelder(caseFile);
            var nowUtc = EnsureUtc(caseFile.Submitted == default ? DateTime.UtcNow : caseFile.Submitted);

            var akteListe = new List<Akte>
    {
        new Akte
        {
            Identifikation = new Identifikation
            {
                Id = caseFile.Id.ToString(),
                NummerImUebergeordnetenContainer = "1",
            },
            AnwendungsspezifischeErweiterung =
                (feldgruppen?.Count > 0 || felder?.Count > 0)
                    ? new AnwendungsspezifischeErweiterung
                    {
                        Kennung = "Mandatensoftware",
                        Name = "JL.Portal",
                        Feldgruppen = feldgruppen,
                        Felder = felder,
                    }
                    : null,
            FachspezifischeDaten = new XjustizAkteFachspezifischeDaten
            {
                Aktentyp = new Aktentyp { Code = "001" },
                Anzeigename = string.IsNullOrWhiteSpace(caseFile.Title) ? "Anzeigename nicht gefunden" : caseFile.Title,
                Aktenzeichen = new Aktenzeichen
                {
                    Auswahl = new AuswahlAktenzeichen
                    {
                        Freitext = string.IsNullOrWhiteSpace(caseFile.FileNumber) ? "neu" : caseFile.FileNumber,
                    },
                },
            },
        },
    };

            var docs = new List<Dokument>();
            if (exportFiles != null && exportFiles.Count > 0)
            {
                for (int i = 0; i < exportFiles.Count; i++)
                {
                    var file = exportFiles[i];
                    var fileName = BuildDateiname(file);

                    var doc = new Dokument
                    {
                        Identifikation = new Identifikation
                        {
                            Id = Guid.NewGuid().ToString(),
                            NummerImUebergeordnetenContainer = (i + 1).ToString(),
                        },

                        FachspezifischeDaten = new XjustizFachspezifischeDaten
                        {
                            Dokumentklasse = new DokumentklasseCode
                            {
                                ListVersionId = "3.5.1",
                                Code = GuessDokumentklasseFromExtension(Path.GetExtension(fileName)),
                            },
                            Datei = new Datei
                            {
                                Dateiname = fileName,
                                Bestandteile = new List<Bestandteil>
                        {
                            new Bestandteil { ListVersionId = "2.4", Code = "001" },
                        },
                            },
                        },

                        Erstellungszeitpunkt = nowUtc,
                    };

                    docs.Add(doc);
                }
            }

            return new Schriftgutobjekte
            {
                Akte = akteListe,
                Dokumente = docs,
            };
        }

        private static bool IsCosmeticDef(DTOEditor.CustomFieldDefinitionDto fieldDefinition)
            => fieldDefinition.Type is DataTransfer.Enums.Editor.CustomFieldType.Title
                         or DataTransfer.Enums.Editor.CustomFieldType.Spacer
                         or DataTransfer.Enums.Editor.CustomFieldType.Description;

        private static (List<Feldgruppe>? Feldgruppen, List<Feld>? Felder)
     MapSectionsDtoToFeldgruppenUndFelder(CaseFileView caseFile)
        {
            var form = caseFile.Form;
            if (form?.Sections == null || form.Sections.Count == 0)
            {
                return (null, null);
            }

            var valueByKey = BuildValueLookup(caseFile);
            var sectionGroups = new List<Feldgruppe>();

            foreach (var section in form.Sections)
            {
                var sectionName =
                      TryGet<string>(section, "PortalTitle")
                   ?? TryGet<string>(section, "Title");

                var description = section.EntitySchema.Type.ToString() ?? "UNBEKANNT";

                var defsInSection =
                    (section.Tabs ?? new List<DTOEditor.FormTabDto>())
                    .SelectMany(t => t.Fields ?? new List<DTOEditor.CustomFieldDefinitionDto>())
                    .Where(d => d != null && !IsCosmeticDef(d))
                    .ToList();

                if (defsInSection.Count == 0)
                {
                    continue;
                }

                var directFields = defsInSection
                    .Where(d => !HasNested(d))
                    .Select(d => CreateFeldFromDefinition(d, valueByKey))
                    .OfType<Feld>()
                    .ToList();

                var nestedGroups = defsInSection
                    .Where(HasNested)
                    .Select(d => CreateFeldgruppeFromDefinition(d, valueByKey))
                    .OfType<Feldgruppe>()
                    .ToList();

                if (directFields.Count == 0 && nestedGroups.Count == 0)
                {
                    continue;
                }

                sectionGroups.Add(new Feldgruppe
                {
                    Name = sectionName,
                    Beschreibung = description,
                    Felder = directFields,
                    UnterFeldgruppen = nestedGroups,
                });
            }

            return (sectionGroups.Count > 0 ? sectionGroups : null, null);
        }

        private static bool HasNested(DTOEditor.CustomFieldDefinitionDto fieldDefinition)
            => (fieldDefinition.GroupOptions != null && fieldDefinition.GroupOptions.Count > 0)
            || (fieldDefinition.GroupFields != null && fieldDefinition.GroupFields.Count > 0)
            || (fieldDefinition.ListFields != null && fieldDefinition.ListFields.Count > 0);

        private static Feld? CreateFeldFromDefinition(DTOEditor.CustomFieldDefinitionDto fieldDefinition, Dictionary<string, string?> valueByKey)
        {
            if (HasNested(fieldDefinition))
            {
                return null;
            }

            var name = fieldDefinition.Text ?? fieldDefinition.DocumentKey ?? fieldDefinition.CardLabel ?? fieldDefinition.Type.ToString();
            if (string.IsNullOrWhiteSpace(name))
            {
                return null;
            }

            var v = ResolveValueForField(fieldDefinition, valueByKey);

            return new Feld
            {
                Name = name,
                Wert = v,
            };
        }

        private static Feldgruppe? CreateFeldgruppeFromDefinition(
            DTOEditor.CustomFieldDefinitionDto fieldDefinition,
            Dictionary<string, string?> valueByKey)
        {
            if (!HasNested(fieldDefinition))
            {
                return null;
            }

            var groupFields = (IEnumerable<DTOEditor.CustomFieldDefinitionDto>?)fieldDefinition.GroupFields
                            ?? Array.Empty<DTOEditor.CustomFieldDefinitionDto>();

            var listFields = (IEnumerable<DTOEditor.CustomFieldDefinitionDto>?)fieldDefinition.ListFields
                            ?? Array.Empty<DTOEditor.CustomFieldDefinitionDto>();

            var allFields = groupFields.Concat(listFields);

            var directFields = allFields
                .Select(d => CreateFeldFromDefinition(d, valueByKey))
                .OfType<Feld>()
                .ToList();

            var childGroupsFromDefs = allFields
                .Select(d => CreateFeldgruppeFromDefinition(d, valueByKey))
                .OfType<Feldgruppe>()
                .ToList();

            var options = (IEnumerable<DTOEditor.CustomFieldNestedGroupOptionDto>?)fieldDefinition.GroupOptions
                        ?? Array.Empty<DTOEditor.CustomFieldNestedGroupOptionDto>();

            var optionGroups = options
                .Select(opt =>
                {
                    var optDefs = (IEnumerable<DTOEditor.CustomFieldDefinitionDto>?)opt.GroupOptionFields
                                ?? Array.Empty<DTOEditor.CustomFieldDefinitionDto>();

                    var optFields = optDefs
                        .Select(g => CreateFeldFromDefinition(g, valueByKey))
                        .OfType<Feld>()
                        .ToList();

                    var optChildren = optDefs
                        .Select(g => CreateFeldgruppeFromDefinition(g, valueByKey))
                        .OfType<Feldgruppe>()
                        .ToList();

                    if (optFields.Count == 0 && optChildren.Count == 0)
                    {
                        return null;
                    }

                    return new Feldgruppe
                    {
                        Name = string.IsNullOrWhiteSpace(opt.Label) ? "Option" : opt.Label,
                        Beschreibung = string.Empty,
                        Felder = optFields,
                        UnterFeldgruppen = optChildren,
                    };
                })
                .OfType<Feldgruppe>()
                .ToList();

            var allChildren = childGroupsFromDefs.Concat(optionGroups).ToList();

            if (directFields.Count == 0 && allChildren.Count == 0)
            {
                return null;
            }

            return new Feldgruppe
            {
                Name = fieldDefinition.Text ?? fieldDefinition.DocumentKey ?? fieldDefinition.Type.ToString(),
                Beschreibung = fieldDefinition.Description ?? string.Empty,
                Felder = directFields,
                UnterFeldgruppen = allChildren,
            };
        }

        private static IEnumerable<CustomFieldValueView> GetAllValues(CaseFileView caseFile)
        {
            var head = caseFile.MainClient?.Values as IEnumerable<CustomFieldValueView>
            ?? Array.Empty<CustomFieldValueView>();

            return head
                .Concat(SelectManyOrEmpty(caseFile.Contacts, contact => contact?.Values))
                .Concat(SelectManyOrEmpty(caseFile.Clients, contact => contact?.Values))
                .Concat(SelectManyOrEmpty(caseFile.Opponents, contact => contact?.Values))
                .Concat(SelectManyOrEmpty(caseFile.Witnesses, contact => contact?.Values))
                .Concat(SelectManyOrEmpty(caseFile.Others, contact => contact?.Values))
                .Concat(SelectManyOrEmpty(caseFile.Insurances, insurance => insurance?.Values))
                .Concat(SelectManyOrEmpty(caseFile.CustomEntities, customEntity => customEntity?.Values));
        }

        private static IEnumerable<TOut> SelectManyOrEmpty<TIn, TOut>(
        IEnumerable<TIn>? seq, Func<TIn, IEnumerable<TOut>?> selector)
        {
            if (seq == null)
            {
                return Array.Empty<TOut>();
            }

            return seq.SelectMany(x => selector(x) ?? Array.Empty<TOut>());
        }

        private static Dictionary<string, string?> BuildValueLookup(CaseFileView caseFile)
        {
            var dict = new Dictionary<string, string?>(StringComparer.OrdinalIgnoreCase);

            foreach (var v in GetAllValues(caseFile))
            {
                if (!string.IsNullOrWhiteSpace(v.DocumentKey))
                {
                    dict[v.DocumentKey!] = v.Value;
                }

                if (v.CustomFieldDefinitionId != Guid.Empty)
                {
                    dict[v.CustomFieldDefinitionId.ToString()] = v.Value;
                }
            }

            return dict;
        }

        private static string? ResolveValueForField(DTOEditor.CustomFieldDefinitionDto fieldDefinition, Dictionary<string, string?> valueByKey)
        {
            if (!string.IsNullOrWhiteSpace(fieldDefinition.DocumentKey) && valueByKey.TryGetValue(fieldDefinition.DocumentKey, out var v1))
            {
                return v1;
            }

            var idKey = fieldDefinition.Id.ToString();
            if (valueByKey.TryGetValue(idKey, out var v2))
            {
                return v2;
            }

            return null;
        }

        private static DateTime EnsureUtc(DateTime dt)
            => dt.Kind == DateTimeKind.Utc ? dt : DateTime.SpecifyKind(dt, DateTimeKind.Utc);

        private static string BuildDateiname(StorageObjectDto file)
        {
            var name = file.FileName;
            if (string.IsNullOrWhiteSpace(name))
            {
                name = file.BlobName;
            }

            if (string.IsNullOrWhiteSpace(name))
            {
                name = "dokument";
            }

            var ext = Path.GetExtension(name);
            if (string.IsNullOrEmpty(ext) && !string.IsNullOrEmpty(file.BlobName))
            {
                var blobExt = Path.GetExtension(file.BlobName);
                if (!string.IsNullOrEmpty(blobExt))
                {
                    name += blobExt;
                }
            }

            return name;
        }

        private static string GuessDokumentklasseFromExtension(string? ext)
        {
            if (string.IsNullOrWhiteSpace(ext))
            {
                return "UNBEKANNT";
            }

            ext = ext.Trim('.').ToLowerInvariant();

            return ext switch
            {
                "pdf" or "doc" or "docx" or "rtf" or "odt" => "SCHRIFTSATZ",
                "jpg" or "jpeg" or "png" or "tif" or "tiff" => "ANLAGE",
                "xml" => "DOKUMENT",
                _ => "UNBEKANNT",
            };
        }

        private static T? TryGet<T>(object obj, string prop)
        {
            var pi = obj.GetType().GetProperty(prop);
            if (pi == null)
            {
                return default;
            }

            var val = pi.GetValue(obj);
            return val is T t ? t : default;
        }
    }
}
