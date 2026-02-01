# Spezifikation: Fachspezifische Erweiterungen (Draft)

Dieses Dokument definiert die **neuen** Datenklassen, die im Rahmen der Erweiterung von XJustiz (`Fachspezifische_Erweiterungen.Außergerichtliche_Kommunikation`) erstellt werden müssen.
Es werden **nur** Felder aufgeführt, die nicht durch bestehende XJustiz-Standardentitäten (Person, Anschrift, Bankverbindung) abgebildet werden können.

## 1. Allgemeines Recht (Relevanz: 1)

**Klasse:** `AllgemeinesRecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Artumfang` | `String.Latin (Info)` |  |
| `Rechtsthema` | `String.Latin` |  |
| `BeschreibungIhresAnliegens` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `BeschreibungDesAnliegens` | `String.Latin` |  |
| `LiegenIhnenFotosSchreibenOderDokumenteVor` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `AktuellerStand` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Bestehender Rechtsstreit', 'Sonstiges', 'Allgemeine Beratung' |
| `Artumfang` | `String.Latin (Info)` |  |
| `BeispieleKönnenSeinDieKündigungAbwehrenSchadensersatzErwirkenOderUnterlassungErzwingen` | `String.Latin (Info)` |  |
| `ZielDesAnliegens` | `String.Latin` |  |

---

## 2. Arbeitsrecht: Arbeitnehmer (Relevanz: 4)

**Klasse:** `ArbeitsrechtArbeitnehmer`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `DetailsZumKündigungsschreiben` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Datumzeitpunkt` | `Date` |  |
| `GekündigtZum` | `Date` |  |
| `ZugestelltAm` | `Date` | _Kontext: Haben Sie bereits eine Kündigung ausgesprochen?_ |
| `UnterschriebeneKündigung` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `PostalischeKündigung` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `KündigungsschreibenHochladen` | `FileRef` |  |
| `Kündigungsgrund` | `Code (List)` | **Betriebsbedingte Kündigung:** Stellenabbau oft bei wirtschaftlicher Notsituation im Unternehmen <br> <br>**Personenbedingte Kündigung:** Arbeitnehmer ist dauerhaft nicht in der Lage der Tätigkeit nachzugehen (oft bei Unfall oder lange Krankheit) <br> <br> **Verhaltensbedingte Kündigung:** bei Fehlverhalten oder Pflichtverstoß des Arbeitnehmers<br>**Werte:** 'Verhaltensbedingt', 'Kein Grund angegben', 'Weiß ich nicht', 'Betriebsbedingt', 'Personenbedingt' |
| `WieBegründetIhrArbeitgeberDieKündigung` | `String.Latin (Info)` |  |
| `BeschreibenSieDieKündigungsgründeBitteStichpunktartig` | `String.Latin (Info)` |  |
| `Kündigungsgrund` | `String.Latin` |  |
| `AufhebungsvertragHochladen` | `FileRef` | _Kontext: Aufhebungsvertrag_ |
| `Allgemeines` | `String.Latin (Info)` |  |
| `IhreBerufsbezeichnung` | `String.Latin` |  |
| `MonatlichesBruttoeinkommen` | `Amount` |  |
| `Wochenarbeitsstunden` | `String.Latin` |  |
| `Wochenarbeitstage` | `String.Latin` |  |
| `BeginnDesArbeitsverhältnisses` | `String.Latin (Info)` |  |
| `VereinbarteProbezeit` | `String.Latin (Info)` |  |
| `BeginnDesArbeitsverhältnisses` | `Date` |  |
| `VereinbarteProbezeit` | `String.Latin` |  |
| `ArbeitsvertragLetzteGehaltsabrechnungHochladen` | `FileRef` |  |
| `Tarifvertrag` | `String.Latin` | _Kontext: Tarifvertrag_ |
| `Entgeltgruppe` | `String.Latin` | _Kontext: Tarifvertrag_ |
| `Erfahrungsstufe` | `String.Latin` | _Kontext: Tarifvertrag_ |
| `Artumfang` | `Code (List)` | Was wollen Sie mit einer Kündigungsschutzklage erreichen?<br>**Werte:** 'Bestmögliche Abfindung', 'Kündigung abwehren', 'Sonstiges' |
| `ZielbeschreibungOptional` | `String.Latin` |  |
| `Zwischenzeugnis` | `Code (List)` | **Werte:** 'Ja, aber unzufrieden', 'Nein', 'Keine Angabe', 'Ja' |
| `ZwischenUndArbeitszeugnisseHochladen` | `FileRef` |  |
| `HabenSieOffeneUrlaubstageOderÜberstunden` | `String.Latin (Info)` |  |
| `OffeneUrlaubstage` | `String.Latin` | _Kontext: Stehen noch offene Urlaubstage und Überstunden bis zum Kündigungszeitpunkt aus?_ |
| `OffeneÜberstunden` | `String.Latin` | _Kontext: Stehen noch offene Urlaubstage und Überstunden bis zum Kündigungszeitpunkt aus?_ |
| `BetriebsratmitgliedOÄ` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `WieVieleArbeitnehmerSindNachIhremWissenBeschäftigt` | `String.Latin (Info)` |  |
| `ZahlDerArbeitnehmer` | `String.Latin` |  |
| `Artumfang` | `Date` |  |
| `DauerDerProbezeit` | `String.Latin` | _Kontext: Wurde eine Probezeit vereinbart?_ |
| `EndeDerProbezeit` | `Date` | _Kontext: Wurde eine Probezeit vereinbart?_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `Branche` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Beruf` | `String.Latin` |  |
| `MonatsgehaltBrutto` | `Amount` |  |
| `ArbeitsstundenProWoche` | `String.Latin` |  |
| `ArbeitstageProWoche` | `String.Latin` |  |
| `Ausbildungsverhältnis` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Tarifvertrag_ |
| `VertraglicheKündigungsfrist` | `String.Latin` | _Kontext: Sieht der Arbeitsvertrag besondere Kündigungsfristen vor?_ |
| `FürWenGeltenDieseFristen` | `Code (List)` | _Kontext: Sieht der Arbeitsvertrag besondere Kündigungsfristen vor?_<br>**Werte:** 'Für den Arbeitgeber', 'Für den Arbeitnehmer' |
| `GrundDerBefristungen` | `String.Latin` | _Kontext: Wurde der Vertrag befristet?_ |
| `EndeDerBefristung` | `Date` | _Kontext: Wurde der Vertrag befristet?_ |
| `AnzahlDerBefristungen` | `Integer / String` | _Kontext: Wurde der Vertrag befristet?_ |
| `KündigungVorBefristungsende` | `String.Latin (Info)` | _Kontext: Wurde der Vertrag befristet?_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Wurde der Vertrag befristet?_ |
| `RegelungZurKündigungVorBefristungsende` | `String.Latin` | _Kontext: Wurde der Vertrag befristet?_ |
| `ArbeitsvertragOrTarifvertragHochladen` | `FileRef` |  |
| `Artumfang` | `Date` |  |
| `` | `Code (List)` | **Werte:** 'Schnellstmöglich', 'Weiß ich nicht', 'Zu folgendem Kündigungszeitpunkt' |
| `Kündigungszeitpunkt` | `Date` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Kündigungsgrund` | `String.Latin` |  |
| `Unterschrift` | `Code (List)` | _Kontext: Haben Sie bereits eine Kündigung ausgesprochen?_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Kündigungsform` | `Code (List)` | _Kontext: Haben Sie bereits eine Kündigung ausgesprochen?_<br>**Werte:** 'E-Mail', 'Brief mit Zustellurkunde', 'Andere Übermittlung', 'Persönliche Übergabe', 'Mündlich', 'Brief ohne Zustellurkunde' |
| `Empfangsnachweis` | `Code (List)` | _Kontext: Haben Sie bereits eine Kündigung ausgesprochen?_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `KündigungEmpfangsbekenntnisOrNachweisHochladen` | `FileRef` | _Kontext: Haben Sie bereits eine Kündigung ausgesprochen?_ |
| `AufhebungsvertragGewünscht` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Betriebsmittel` | `String.Latin` | _Kontext: Sind Sie in Besitz von Betriebsmitteln?_ |

---

## 3. Arbeitsrecht: Kündigungsschutz (Relevanz: 4)

**Klasse:** `ArbeitsrechtKündigungsschutz`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Abkömmlinge` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Betriebsangaben` | `String.Latin (Info)` |  |
| `ZahlDerArbeitnehmer` | `String.Latin` |  |
| `Branche` | `String.Latin` |  |
| `Artumfang` | `Date` |  |
| `WurdeEineProbezeitVereinbart` | `String.Latin (Info)` |  |
| `BeginnDesArbeitsverhältnisses` | `Date` |  |
| `DauerDerProbezeit` | `String.Latin` | _Kontext: Wurde eine Probezeit vereinbart?_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `Beruf` | `String.Latin` |  |
| `MonatsgehaltBrutto` | `Amount` |  |
| `ArbeitsstundenProWoche` | `String.Latin` |  |
| `ArbeitstageProWoche` | `String.Latin` |  |
| `ArbeitsvertragOrTarifvertragHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `GekündigtZum` | `Date` |  |
| `Kündigungsgrund` | `Code (List)` | **Werte:** 'Anderer Grund', 'Verhaltensbedingt', 'Betriebsbedingt', 'Kein Grund', 'Personenbedingt' |
| `BeschreibenSieDieKündigungsgründeStichpunktartig` | `String.Latin (Info)` |  |
| `Beschreibung` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `KündigungZugestelltAm` | `Date` |  |
| `WurdeDieKündigungHändischUnterschrieben` | `Code (List)` | _Kontext: Wurde bereits eine Kündigung ausgesprochen?_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Kündigungsform` | `Code (List)` | _Kontext: Wurde bereits eine Kündigung ausgesprochen?_<br>**Werte:** 'E-Mail', 'Brief mit Zustellurkunde', 'Andere Übermittlung', 'Persönliche Übergabe', 'Mündlich', 'Brief ohne Zustellurkunde' |
| `WurdeDerEmpfangGegengezeichnet` | `Code (List)` | _Kontext: Wurde bereits eine Kündigung ausgesprochen?_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Kündigungswiderspruch` | `Code (List)` | _Kontext: Wurde bereits eine Kündigung ausgesprochen?_<br>**Werte:** 'Nein', 'Ja' |
| `KündigungsschreibenEmpfangWiderspruchHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `KlageZugestelltAm` | `Date` |  |
| `KlageschriftAnlagenHochladen` | `FileRef` |  |
| `GerichtlicherTermin` | `Date` | _Kontext: Ladung_ |
| `LadungsschreibenHochladen` | `FileRef` |  |
| `WieVieleArbeitnehmerBeschäftigenSie` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `BetriebsratsmitgliedOÄ` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Schwangerschaft` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Elternzeit` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Pflegezeit` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Betriebsübergang` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `ZustimmungenHochladen` | `FileRef` | _Kontext: Liegen alle erforderlichen Zustimmungen der Aufsichtsbehörden vor?_ |
| `EndeDerProbezeit` | `Date` | _Kontext: Wurde eine Probezeit vereinbart?_ |
| `VertraglicheKündigungsfrist` | `String.Latin` | _Kontext: Sieht der Arbeitsvertrag besondere Kündigungsfristen vor?_ |
| `FürWenGeltenDieseFristen` | `Code (List)` | _Kontext: Sieht der Arbeitsvertrag besondere Kündigungsfristen vor?_<br>**Werte:** 'Für den Arbeitgeber', 'Für den Arbeitnehmer' |
| `GrundDerBefristungen` | `String.Latin` | _Kontext: Wurde der Vertrag befristet?_ |
| `EndeDerBefristung` | `Date` | _Kontext: Wurde der Vertrag befristet?_ |
| `AnzahlDerBefristungen` | `Integer / String` | _Kontext: Wurde der Vertrag befristet?_ |
| `KündigungVorBefristungsende` | `String.Latin (Info)` | _Kontext: Wurde der Vertrag befristet?_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Wurde der Vertrag befristet?_ |
| `RegelungZurKündigungVorBefristungsende` | `String.Latin` | _Kontext: Wurde der Vertrag befristet?_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `AusgeübteTätigkeit` | `String.Latin` |  |
| `Ausbildungsverhältnis` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `ArbeitsvertragHochladen` | `FileRef` |  |
| `Artumfang` | `Date` |  |
| `Kündigungszeitpunkt` | `Date` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Kündigungsgrund` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `KenntnisVomKündigungsgrund` | `Date` |  |
| `GrundDerAbmahnung` | `String.Latin` | _Kontext: Wurde bereits eine Abmahnung erteilt?_ |
| `DatumLetzterAbmahnung` | `Date` | _Kontext: Wurde bereits eine Abmahnung erteilt?_ |
| `AnzahlDerAbmahnungen` | `Integer / String` | _Kontext: Wurde bereits eine Abmahnung erteilt?_ |
| `AbmahnungEnHochladen` | `FileRef` | _Kontext: Wurde bereits eine Abmahnung erteilt?_ |
| `AusgestelltAm` | `Date` | _Kontext: Wurde bereits eine Kündigung ausgesprochen?_ |
| `ZugestelltAm` | `Date` | _Kontext: Wurde bereits eine Kündigung ausgesprochen?_ |
| `KündigungZustellnachweisHochladen` | `FileRef` | _Kontext: Wurde bereits eine Kündigung ausgesprochen?_ |
| `AufhebungsvertragMöglich` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `OffeneUrlaubstage` | `String.Latin` | _Kontext: Stehen noch offene Urlaubstage und Überstunden bis zum Kündigungszeitpunkt aus?_ |
| `OffeneÜberstunden` | `String.Latin` | _Kontext: Stehen noch offene Urlaubstage und Überstunden bis zum Kündigungszeitpunkt aus?_ |
| `Beteiligteperson` | `Code (List)` | _Kontext: Stehen noch offene Urlaubstage und Überstunden bis zum Kündigungszeitpunkt aus?_<br>**Werte:** 'Nein', 'Ja' |
| `HöheDerAbfindung` | `Amount` | _Kontext: Abfindungszahlung_ |
| `Betriebsmittel` | `String.Latin` | _Kontext: Ist der Arbeitnehmer noch in Besitz von Betriebsmitteln?_ |
| `BetriebsratOrPersonalrat` | `Code (List)` | _Kontext: Betriebsrat o.ä._<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `ZustimmungOrWiderspruchHochladen` | `FileRef` | _Kontext: Betriebsrat o.ä._ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Tarifvertrag_ |
| `Tarifvertrag` | `String.Latin` | _Kontext: Tarifvertrag_ |
| `` | `Code (List)` | **Werte:** 'Betriebsbedingt', 'Personenbedingt', 'Sonstiger Grund', 'Verhaltensbedingt' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Ist eine anderweitige Beschäftigung der Person in Ihrem Unternehmen ausgeschlossen?_ |
| `Grund` | `String.Latin` | _Kontext: Ist eine anderweitige Beschäftigung der Person in Ihrem Unternehmen ausgeschlossen?_ |
| `DauerDesArbeitsverhältnisses` | `String.Latin (Info)` |  |
| `EndeDesArbeitsverhältnisses` | `Date` |  |
| `Beendigungsinitiative` | `Code (List)` | **Werte:** 'Wunsch des Arbeitgebers', 'Sonstige Gründe', 'beidseitigem Wunsch', 'Wunsch des Arbeitsnehmers' |
| `WieLautetDieBerufsbezeichnungDerPerson` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `DatumDesAufhebungsvertrages` | `Date` | _Kontext: Gibt es einen Aufhebungsvertrag?_ |
| `DatumDesZeugnisses` | `Date` | _Kontext: Wurde bereits ein Arbeits- oder Zwischenzeugnis erteilt?_ |
| `AufhebungsvertragOrZeugnisHochladen` | `FileRef` |  |
| `WieSchätzenSieDieBetrieblichenLeistungenEin` | `String.Latin (Info)` |  |
| `Fachwissen` | `String.Latin (Info)` |  |
| `Fachwissen` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `AuffassungsgabeDenkUndUrteilsvermögen` | `String.Latin (Info)` |  |
| `AuffassungsgabeDenkUndUrteilsvermögen` | `Code (List)` | Comprehension<br>**Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `OrganisationsgeschickUndProblemlösungsbewusstsein` | `String.Latin (Info)` |  |
| `OrganisationsgeschickUndProblemlösungsbewusstsein` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `BelastbarkeitUndPflichtbewusstsein` | `String.Latin (Info)` |  |
| `BelastbarkeitUndPflichtbewusstsein` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `LeistungsbereitschaftUndEigeninitiative` | `String.Latin (Info)` |  |
| `LeistungsbereitschaftUndEigeninitiative` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `ArbeitsqualitätUndTempo` | `String.Latin (Info)` |  |
| `ArbeitsqualitätUndTempo` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `AusdrucksfähigkeitSprachlicheUndSchriftlicheLeistungen` | `String.Latin (Info)` |  |
| `Ausdrucksfähigkeit` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `TeamfähigkeitOrFührungsverhalten` | `String.Latin (Info)` |  |
| `TeamfähigkeitOrFührungsverhalten` | `Code (List)` | Teamwork<br>**Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `WieSchätzenSieDiePersönlichenLeistungenEin` | `String.Latin (Info)` |  |
| `KollegialesVerhalten` | `String.Latin (Info)` |  |
| `KollegialesVerhalten` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `VerhaltenGegenüberVorgesetzten` | `String.Latin (Info)` |  |
| `VerhaltenGegenüberVorgesetzten` | `Code (List)` | **Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `VerhaltenGegenüberKunden` | `String.Latin (Info)` |  |
| `VerhaltenGegenüberKunden` | `Code (List)` | BehavoirCustomers<br>**Werte:** 'Eingeschränkt erfüllt', 'Erfüllt', 'Erheblich übertroffen', 'Übertroffen', 'In hervorragender Weise übertroffen', 'Kaum erfüllt' |
| `Artumfang` | `Code (List)` | **Werte:** '1', '3', '4', '5', '2', '6' |
| `SonstigeAnmerkungen` | `String.Latin (Info)` |  |
| `SonstigeAnmerkungen` | `String.Latin` |  |

---

## 4. Ausländerrecht (Relevanz: 2)

**Klasse:** `Ausländerrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `WoSindSieGeboren` | `String.Latin (Info)` |  |
| `IhreKonfession` | `String.Latin (Info)` |  |
| `IhrFamilienstand` | `String.Latin (Info)` |  |
| `IhreKonfession` | `Code (List)` | **Werte:** 'Andere Religion', 'Keine Konfession', 'Hinduismus', 'Judentum', 'Christentum', 'Islam', 'Buddhismus' |
| `IhrFamilienstand` | `Code (List)` | **Werte:** 'Ledig', 'Sonstiger', 'Verheiratet', 'Verwitwet', 'Geschieden' |
| `PassOrAusweisdokumentHochladen` | `FileRef` |  |
| `GeplantesEinreisedatum` | `Date` |  |
| `Einreisedatum` | `Date` |  |
| `Datumzeitpunkt` | `Date` | _Kontext: Vorheriger Aufenthalt_ |
| `Berufsbezeichnung` | `String.Latin` | _Kontext: Arbeitsvertrag oä. >  Arbeitsverhältnis_ |
| `EinkommenOrLohn` | `Amount` | _Kontext: Arbeitsvertrag oä. >  Arbeitsverhältnis_ |
| `Arbeitsbeginn` | `Date` | _Kontext: Arbeitsvertrag oä. >  Arbeitsverhältnis_ |
| `WieVielGeldHabenSieMonatlichZurVerfügung` | `String.Latin (Info)` |  |
| `IhrErlernterBeruf` | `String.Latin (Info)` |  |
| `MonatlichVerfügbaresGeld` | `Amount` |  |
| `ErlernterBeruf` | `String.Latin` |  |
| `ArbeitsvertragOrAusbildungsvertragOrStudienbescheinigungHochladen` | `FileRef` | _Kontext: Arbeitsverhältnis_ |
| `Antragsdatum` | `Date` | _Kontext: Antrag gestellt_ |
| `Ablehnung` | `Code (List)` | _Kontext: Antrag gestellt_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `AntragSchriftstückeHochladen` | `FileRef` | _Kontext: Antrag gestellt_ |
| `PersönlicheAngaben` | `String.Latin (Info)` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Ehepartner / Partner', 'Sonstige', 'Kind', 'Anderes Familienmitglied', 'Elternteil' |
| `IhrAktuellerAufenthaltsstatus` | `String.Latin (Info)` |  |
| `Einreisedatum` | `Date` |  |
| `Aufenthaltsstatus` | `Code (List)` | **Werte:** 'Aufenthaltserlaubnis', 'Aufenthaltsduldung', 'Daueraufenthaltserlaubnis', 'Visum', 'Weiß ich nicht', 'Blaue Karte', 'Anderer Titel', 'ICT-Karte', 'Niederlassungserlaubnis' |
| `AusstellungsdatumIhresAufenthaltstitels` | `Date` |  |
| `AblaufdatumIhresAufenthaltstitels` | `Date` |  |
| `Ausstellungsdatum` | `Date` |  |
| `Ablaufdatum` | `Date` |  |
| `AufenthaltstitelSchriftstückeHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstige Gründe', 'Bestehende / beginnende Ausbildung', 'Familiäre Gründe', 'Weiß ich nicht', 'Bestehender / beginnender Job', 'Unzumutbares Herkunftsland' |
| `BeschreibenSieBitteStichpunktartigIhreSituation` | `String.Latin (Info)` |  |
| `Situation` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` | _Kontext: Abschiebeandrohung_ |
| `Datumzeitpunkt` | `Date` | _Kontext: Abschiebeandrohung_ |
| `FristZurAusreise` | `Date` | _Kontext: Abschiebeandrohung_ |
| `Zustellungsdatum` | `Date` | _Kontext: Abschiebeandrohung_ |
| `SchreibenHochladen` | `FileRef` | _Kontext: Abschiebeandrohung_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Bestehendes Abschiebeverbot', 'Anderer Status', 'Aufenthaltsduldung', 'Einreise noch nicht gestattet', 'Aufenthaltserlaubnis wurde erteilt', 'Weiß ich nicht', 'Asylantrag noch nicht gestellt', 'Einreise wurde abgelehnt' |
| `ErlaubnisOrAntragOrSchreibenHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | _Kontext: Asylstatus_<br>**Werte:** 'Asylantrag noch nicht entschieden', 'Anderer Status', 'Asylantrag abgelehnt', 'Weiß ich nicht', 'Asylantrag noch nicht gestellt', 'Asylantrag bewilligt' |
| `AusweisdokumentOrUnterlagenOrErlaubnisHochladen` | `FileRef` |  |
| `IhrBeabsichtigterOrAktuellerBeruf` | `String.Latin (Info)` |  |
| `BeabsichtigterOrAktuellerBeruf` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Sozialleistungen_ |
| `Bspw100JedenMonatFürEssen` | `String.Latin (Info)` | _Kontext: Sozialleistungen_ |
| `ArtUndHöheDerLeistung` | `String.Latin` | _Kontext: Sozialleistungen_ |
| `ZahlungsbelegHochladen` | `FileRef` | _Kontext: Sozialleistungen_ |
| `Wohnungskosten` | `Amount` | _Kontext: Unterkunft_ |
| `Sonderkosten` | `Amount` | _Kontext: Sonderausgaben_ |
| `ArtDerSonderausgaben` | `String.Latin` | _Kontext: Sonderausgaben_ |
| `RechnungenOrMietvertragHochladen` | `FileRef` |  |

---

## 5. Baurecht: Genehmigung (Relevanz: 2)

**Klasse:** `BaurechtGenehmigung`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Rolle` | `Code (List)` | **Werte:** 'Andere Rolle', 'Weiß ich nicht', 'Mieter / Pächter / Nutzer', 'Eigentümer', 'Ingenieur / Architekt' |
| `Vorhaben` | `Code (List)` | **Werte:** 'Neubau', 'Weiß ich nicht', 'Nutzungsänderung', 'Sanierung', 'Sonstiges Vorhaben', 'Umbau', 'Abriss' |
| `WieWirdDasGrundstückAktuellGenutzt` | `Code (List)` | **Werte:** 'Bebaut', 'Andere Nutzung', 'Unbebaut ', 'Weiß ich nicht', 'Unbebaut', 'Im Umbau' |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `BspwBauEinesEinfamilienhausesNachNeukaufOderWintergartenAnBestehendesHausBauen` | `String.Latin (Info)` |  |
| `GewünschteNutzung` | `String.Latin` |  |
| `AdresseDesGrundstückes` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Umgebung` | `String.Latin` |  |
| `Abwasseranschluss` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `ZuständigesAmtsgericht` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `GrundbuchVon` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `Gemarkung` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `GrundstückInM` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `Blattnr` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `BestandsverzeichnisNr` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `Flur` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `Flurstück` | `String.Latin` | _Kontext: Sind Ihnen die Grundbuchdaten bekannt?_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Grundstücksbelastungen_ |
| `Grundstücksbelastungen` | `String.Latin` | _Kontext: Grundstücksbelastungen_ |
| `Grundstückseigentümer` | `String.Latin` | _Kontext: Weitere Grundstückseigentümer_ |
| `GrundbuchauszugBauunterlagenKatasterplanOÄHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Vorhaben im Bau', 'Grundstückskauf', 'Bauplanung', 'Bauantrag gestellt', 'Anderer Stand', 'Bevorstehender Baubeginn', 'Abgeschlossener Bau' |
| `Artumfang` | `Code (List)` | **Werte:** 'Baugenehmigung erweitern', 'Bauvorbescheid beantragen', 'Weiß ich nicht', 'Anderes Ziel', 'Baugenehmigung beantragen' |
| `WollenSieDerKanzleiNochEtwasMitteilen` | `String.Latin (Info)` |  |
| `TeilenSieBitteAuchMitWennDieGenehmigungAusAkutenDringendenGründenSchnellstmöglichNötigIst` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `Anzahl` | `Integer / String` | _Kontext: Weitere Grundstückseigentümer_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Baugenehmigung beantragen', 'Bebauungsplan prüfen', 'Anderes Ziel' |
| `Datumzeitpunkt` | `Date` |  |
| `Zustellungsdatum` | `Date` |  |
| `Behörde` | `String.Latin` |  |
| `Ablehnung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Bauantrag vollständig abgelehnt', 'Andere Regelung', 'Genehmigung mit Auflagen / Bedingungen' |
| `FassenSieDieGründeBitteStichpunktartigZusammenBspwAbstandsflächenUnterschrittenSpitzdachStattFlachdachZugelassen` | `String.Latin (Info)` | _Kontext: Begründung_ |
| `Begründung` | `String.Latin` | _Kontext: Begründung_ |
| `AblehnungsbescheidHochladen` | `FileRef` |  |
| `WollenSieDerKanzleiNochEtwasZumBescheidMitteilen` | `String.Latin (Info)` |  |
| `Ordnungsverfügung` | `Code (List)` | **Werte:** 'Sonstige Anordnung', 'Baustopp / Stilllegung', 'Weiß ich nicht', 'Nutzungsuntersagung', 'Abriss / Beseitigung', 'Rückbau' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Fristende` | `Date` |  |
| `FassenSieDieGründeBitteStichpunktartigZusammenBspwGefahrDurchInstabilitätFehlendeBaugenehmigung` | `String.Latin (Info)` | _Kontext: Begründung_ |
| `Zwangsmittel` | `Code (List)` | **Werte:** 'Zwangsgeld', 'Unmittelbarer Zwang', 'Nein', 'Ersatzvornahme' |
| `BescheidKorrespondenzOÄHochladen` | `FileRef` |  |
| `Baugenehmigung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Datumzeitpunkt` | `Date` | _Kontext: Bauliche Änderungen_ |
| `BaulicheÄnderungen` | `String.Latin` | _Kontext: Bauliche Änderungen_ |
| `BaugenehmigungBauunterlagenOÄHochladen` | `FileRef` |  |

---

## 6. Baurecht: Mängel (Relevanz: 2)

**Klasse:** `BaurechtMängel`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `AdresseDesGrundstücks` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `BeschreibungArbeitsauftrag` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `VereinbarterBeginn` | `Date` |  |
| `VereinbartesEnde` | `Date` |  |
| `VertragMitUnternehmenHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Bevorstehende Bauarbeiten', 'Weiß ich nicht', 'Anderer Stand', 'Bevorstehender Baubeginn', 'Abgeschlossener Bau', 'Abgeschlossene Bauarbeiten', 'In der Bauphase' |
| `Artumfang` | `String.Latin (Info)` |  |
| `WoIstDerMangel` | `String.Latin (Info)` |  |
| `Mangelart` | `Code (List)` | **Werte:** 'Nasser Estrich', 'Undichtigkeit', 'Feuchter Keller', 'Beschädigung', 'Risse', 'Feuchtigkeit', 'Anderer Mangel' |
| `EigeneMangelbeschreibung` | `String.Latin` |  |
| `FotosVomMangelHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Kenntnisdatum` | `Date` |  |
| `MangelGerügt` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `BestehtDerMangelWeiterhin` | `Code (List)` | _Kontext: Nacherfüllungsversuch_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `SchriftverkehrHochladen` | `FileRef` |  |
| `WieWirdDasGrundstückAktuellBebaut` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Bebaut', 'Unbebaut ' |
| `Vorhaben` | `Code (List)` | **Werte:** 'Neubau', 'Abriss', 'Umbau / Sanierung', 'Sonstiges Vorhaben' |
| `AdresseDesGrundstückes` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `BspwSchädenBeimBauGeltendMachenKonfliktMitNachbarnEtc` | `String.Latin (Info)` |  |
| `Ziel` | `String.Latin` |  |
| `GrundbuchauszugBauunterlagenKatasterplanOÄHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Nachbar', 'Andere Person', 'Architekt / Ingenieur', 'Handwerker / Bauunternehmen', 'Miteigentümer' |

---

## 7. Baurecht: Nachbarschaft (Relevanz: 2)

**Klasse:** `BaurechtNachbarschaft`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Rolle` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Andere Rolle', 'Entfernter Nachbar', 'Angrenzender Nachbar' |
| `AdresseDesBauvorhabens` | `String.Latin` |  |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `Bauherr` | `String.Latin` |  |
| `Baubeginn` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Ja ', 'Nein' |
| `WieWurdeDasGrundstückBisherGenutzt` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Bebaut', 'Andere Nutzung', 'Unbebaut ' |
| `Artumfang` | `Code (List)` | **Werte:** 'Neubau', 'Weiß ich nicht', 'Sonstiges Vorhaben', 'Umbau', 'Abriss' |
| `Datumzeitpunkt` | `Date` |  |
| `Kenntnis` | `Date` |  |
| `Vorhaben` | `Code (List)` | **Werte:** 'Mitteilung durch Nachbarn', 'Öffentliche Bekanntmachung', 'Auf andere Art', 'Mitteilung durch Bauherren', 'Mit Baubeginn', 'Benachrichtigung vom Bauamt' |
| `DatumDerZustimmung` | `Date` | _Kontext: Widerspruch_ |
| `AdressatDerZustimmung` | `String.Latin` | _Kontext: Widerspruch_ |
| `DatumDesWiderspruchs` | `Date` | _Kontext: Widerspruch_ |
| `AdressatDesWiderspruchs` | `String.Latin` | _Kontext: Widerspruch_ |
| `BilderSchriftverkehrWiderspruchOÄHochladen` | `FileRef` |  |
| `Grundanlass` | `Code (List)` | **Werte:** 'Entgegen geltendem Bebauungsplan', 'Beschattung durch Vorhaben', 'Immissionen vom Grundstück', 'Keine Baugenehmigung', 'Anderer Grund', 'Optisch stark abweichend', 'Verstoß gegen Grunddienstbarkeiten', 'Abstand / Grenze unterschritten' |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `WollenSieDerKanzleiNochEtwasMitteilen` | `String.Latin (Info)` |  |
| `TeilenSieBitteAuchMitWennDieGenehmigungAusAkutenDringendenGründenSchnellstmöglichNötigIst` | `String.Latin (Info)` |  |

---

## 8. Erbrecht: Nachlass (Relevanz: 3)

**Klasse:** `ErbrechtNachlass`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Sterbedatum` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Nicht eheliche Lebensgemeinschaft', 'Verschwägert', 'Freundschaft / Bekannte', '(Stief-)Geschwister', 'Kind', 'Geschwister', '(Stief-)Kind', 'Elternteil', 'Sonstige Beziehung', 'Cousine / Cousin', 'Ehepartner' |
| `Sorgerecht` | `Code (List)` | **Werte:** 'Sorgerecht beim anderen Elternteil', 'Alleiniges Sorgerecht', 'Keine Angabe', 'Gemeinsames Sorgerecht' |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `AusschlagungFürIhrKind` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Datumzeitpunkt` | `Date` |  |
| `Datum` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Eigene Privatinsolvenz', 'Steuerliche Gründe', 'Auflagen / Bedingungen', 'Überschuldeter Nachlass', 'Persönliche Gründe', 'Sanierungsbedürftige Immobilie' |
| `SonstigeGründe` | `String.Latin` |  |
| `DatumDerAnnahme` | `Date` | _Kontext: Adressat Erbannahme_ |
| `AdressatDerAnnahme` | `String.Latin` | _Kontext: Adressat Erbannahme_ |
| `AnnahmeerklärungHochladen` | `FileRef` | _Kontext: Adressat Erbannahme_ |
| `Erbschaftsstellung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Miterbe', 'Vermächtnisnehmer / Beschenkter', 'Alleinerbe' |
| `HabenSieDokumenteZumErbfall` | `String.Latin (Info)` |  |
| `BspwSterbeurkundeTestamentErbscheinSchreibenVomNachlassgericht` | `String.Latin (Info)` |  |
| `DokumenteHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Nicht eheliche Lebensgemeinschaft', 'Verschwägert', 'Freundschaft / Bekannte', '(Stief-)Geschwister', '(Stief-)Kind', 'Weiß ich nicht', 'Elternteil', 'Sonstige Beziehung', 'Cousine / Cousin', 'Ehepartner' |
| `Datumzeitpunkt` | `Date` |  |
| `Datum` | `Date` |  |
| `WieHabenSieVomErbfallErfahren` | `Code (List)` | **Werte:** 'Testamentseröffnung', 'Erteilung eines Erbscheins', 'In sonstiger Weise' |
| `DatumDesErbscheins` | `Date` | _Kontext: Erbschein ausgestellt_ |
| `ErbscheinHochladen` | `FileRef` | _Kontext: Erbschein ausgestellt >  Erbschein vorhanden_ |
| `Datumzeitpunkt` | `Date` |  |
| `Ausschlagungserklärung` | `Date` |  |
| `WemHabenSieDieAusschlagungErklärt` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Notariell', 'Schriftlich', 'Mündlich', 'In sonstiger Form' |
| `AusschlagungserklärungHochladen` | `FileRef` | _Kontext: Ausschlagung_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `Anfechtungsgründe` | `Code (List)` | **Werte:** 'Wirkung meiner Erklärung', 'Form der Anfechtung', 'Überschuldung des Nachlasses', 'Anfechtungsmöglichkeit', 'Ausschlagungsmöglichkeit', 'Anfechtungsfrist' |
| `Anfechtungsgründe` | `Code (List)` | **Werte:** 'Mich getäuscht', 'Mich bedroht' |
| `BeschreibenSieStichpunktartigFallsAndereGründeVorliegen` | `String.Latin (Info)` |  |
| `WeitereGründe` | `String.Latin` |  |
| `HättenSieDasErbeBeiKenntnisAllerUmständeAngenommen` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Datumzeitpunkt` | `Date` |  |
| `Datum` | `Date` |  |
| `WieHabenSieVonDiesemGrundErfahren` | `String.Latin (Info)` |  |
| `UmstandDerKenntnis` | `String.Latin` |  |
| `Anfechtungserklärung` | `Date` | _Kontext: Haben Sie bereits die Anfechtung der Erbschaftsannahme erklärt? >  Haben Sie bereits die Anfechtung der Erbschaftsausschlagung erklärt?_ |
| `AdressatDerAnfechtungserklärung` | `String.Latin` | _Kontext: Haben Sie bereits die Anfechtung der Erbschaftsausschlagung erklärt?_ |
| `Artumfang` | `Code (List)` | _Kontext: Haben Sie bereits die Anfechtung der Erbschaftsausschlagung erklärt?_<br>**Werte:** 'Notariell', 'Schriftlich', 'Mündlich', 'In sonstiger Form' |
| `AnfechtungserklärungHochladen` | `FileRef` | _Kontext: Haben Sie bereits die Anfechtung der Erbschaftsannahme erklärt? >  Haben Sie bereits die Anfechtung der Erbschaftsausschlagung erklärt?_ |
| `GeburtsurkundeHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `SterbeurkundeHochladen` | `FileRef` |  |
| `DatumDesDokumentes` | `Date` | _Kontext: Testament / Erbvertrag_ |
| `TestamentOrErbvertragHochladen` | `FileRef` | _Kontext: Testament / Erbvertrag_ |
| `MöchtenSieDerKanzleiNochEtwasMitteilen` | `String.Latin (Info)` |  |
| `EigeneMitteilung` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `WieHabenSieVomErbfallErfahren` | `Code (List)` | **Werte:** 'Testamentseröffnung', 'Erteilung eines Erbscheins', 'In sonstiger Weise' |
| `DatumDerErklärung` | `Date` | _Kontext: Ausschlagung_ |
| `AdressatDerErklärung` | `String.Latin` | _Kontext: Ausschlagung_ |
| `DatumDesErbscheins` | `Date` | _Kontext: Erbschein vorhanden_ |
| `BeschreibenSieStichpunktartigFallsAndereGründeVorliegen` | `String.Latin (Info)` |  |
| `HättenSieDasErbeBeiKenntnisAllerUmständeAusgeschlagen` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `BeschreibenSieDenHergangStichpunktartig` | `String.Latin` |  |
| `WemHabenSieDieAnfechtungErklärt` | `String.Latin` | _Kontext: Haben Sie bereits die Anfechtung der Erbschaftsannahme erklärt?_ |
| `Artumfang` | `Code (List)` | _Kontext: Haben Sie bereits die Anfechtung der Erbschaftsannahme erklärt?_<br>**Werte:** 'Notariell', 'Schriftlich', 'Mündlich', 'In sonstiger Form' |
| `ErbeAngenommen` | `Code (List)` | Sie können das Erbe in verschiedener Art annehmen, bspw. durch ausdrückliche Annahmeerklärung gegenüber dem Gericht, durch Verwaltung des Nachlasses oder auch ohne eine Handlung oder Erklärung, wenn das Erbe nicht fristgerecht ausgeschlagen wurde. <br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Erbschein / Testament_ |
| `RelevantIstObDieVerstorbenePersonSieInEinemTestamentBenanntHatUndSieDarausEtwasErhaltenSollenBspwLautTestamentSollIchDasGrundstückZu20Bekommen` | `String.Latin (Info)` | _Kontext: Erbschein / Testament_ |
| `Testamentsinhalt` | `String.Latin` | _Kontext: Erbschein / Testament_ |
| `TestamentOrErbscheinHochladen` | `FileRef` | _Kontext: Erbschein / Testament_ |
| `HöheDerGesamterbmasse` | `Amount` | _Kontext: Kenntnis über Nachlass_ |
| `Eigenanteil` | `Amount` | _Kontext: Kenntnis über Nachlass_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Kenntnis über Nachlass_ |
| `Vermögensgegenstände` | `String.Latin` | _Kontext: Kenntnis über Nachlass_ |
| `AufforderungZurHerausgabe` | `Code (List)` | _Kontext: Wissen Sie, bei welchen Personen sich die Gegenstände befinden?_<br>**Werte:** 'Nein', 'Ja' |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `BeendigungDerErbengemeinschaft` | `Code (List)` | **Werte:** 'Verkauf des eigenen Erbteils und Erbengemeinschaft verlassen', 'Sonstige Option', 'Aufteilung unter allen Erben und Auflösung der Gemeinschaft', 'Weiß ich nicht', 'Kauf des Erbteils eines Miterben' |
| `SindDieseVersucheGescheitert` | `Code (List)` | _Kontext: Gab es bereits Versuche die Erbengemeinschaft aufzulösen?_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `SterbeurkundeTestamentErbscheinOÄHochladen` | `FileRef` |  |
| `BeziehungDesErblassers` | `Code (List)` | **Werte:** 'Getrennt', 'Sonstige Beziehung', 'Ledig', 'Weiß ich nicht', 'Verheiratet', 'Verwitwet', 'Geschieden', 'Lebensgemeinschaft' |
| `Artumfang` | `Code (List)` | **Werte:** 'Immobilien', 'Forderungen gegen Dritte', 'Kfz', 'Geldvermögen', 'Kunst', 'Anderes', 'Immaterielle Rechte', 'Sammlung', 'Tiere', 'Wertpapiere', 'Ansprüche aus Versicherung', 'Schmuck', 'Anteile an Unternehmen' |
| `EigeneBeschreibung` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Beteiligteperson` | `Amount` |  |
| `SoweitBekanntGebenSieBitteStichpunktartigWeitereDetailsAn` | `String.Latin (Info)` |  |
| `Details` | `String.Latin` |  |
| `RechnungVertragBilderOÄHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Offene Arztrechnung', 'Ansprüche des Ehepartners', 'Schulden aus Verträgen', 'Anderes', 'Steuernachzahlung Finanzamt' |
| `Artumfang` | `Code (List)` | **Werte:** 'Nicht eheliche Lebensgemeinschaft', 'Verschwägert', 'Freundschaft / Bekannte', '(Stief-)Geschwister', '(Stief-)Kind', 'Weiß ich nicht', 'Elternteil', 'Sonstige Beziehung', 'Cousine / Cousin', 'Ehepartner' |
| `WasGehörtNachIhremWissenAllesZumErbe` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin` |  |
| `Beteiligteperson` | `Amount` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Keiner der Gründe', 'Straftat gegen den Erblasser', 'Weiß ich nicht', 'Missachtung Unterhaltspflicht', 'Gefängnisstrafe durch Verurteilung' |

---

## 9. Erbrecht: Testamente (Relevanz: 3)

**Klasse:** `ErbrechtTestamente`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `GesamthöheDerSchulden` | `Amount` | _Kontext: Schulden >  Sind Ihnen Schulden dieser Person bekannt? >  Haben Sie Schulden?_ |
| `Sterbedatum` | `Date` | _Kontext: Verstorben_ |
| `Behinderungen` | `String.Latin` | _Kontext: Hat das Kind Behinderungen?_ |
| `ArtDesErbgegenstandes` | `String.Latin (Info)` |  |
| `ArtDesErbgegenstandes` | `String.Latin` |  |
| `Beteiligteperson` | `Amount` |  |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `BitteBennenenSieDiePersonenUndAnteileDieDenGegenstandErbenSollBspwFrauMüllerZu40HerrBuch60` | `String.Latin (Info)` |  |
| `Erbe` | `String.Latin` |  |
| `FallsDiesePersonenVersterbenSolltenSollDasErbeAnDerenErbenGehen` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `DatumDerVereinbarung` | `Date` | _Kontext: Bestehende Erbregelung_ |
| `WieWurdeDieseRegelungGetroffen` | `Code (List)` | _Kontext: Bestehende Erbregelung_<br>**Werte:** 'Notariell', 'Handschriftlich', 'Sonstige', 'Hinterlegung beim Amtsgericht' |
| `TestamentErbvertragOderVerfügungVonTodesWegenHochladen` | `FileRef` | _Kontext: Bestehende Erbregelung_ |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Kindesvormundschaft', 'Erbe unter Bedingung', 'Zeitliche Geltungsfrist', 'Pflicht zur Pflege', 'Enterbung', 'Sonstige Bestimmung', 'Nutzungsrecht / Wohnrecht', 'Erbschaftsreihenfolge', 'Ausschluss Neuheirat', 'Sonderstellung für Ehepartner' |
| `GebenSieStichpunktartigAnWasFürSieWichtigIst` | `String.Latin (Info)` |  |
| `Sonderbestimmungen` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Nicht eheliche Lebensgemeinschaft', 'Verschwägert', 'Freundschaft / Bekannte', 'Kind', 'Geschwister', 'Elternteil', 'Sonstige Beziehung', 'Cousine / Cousin', 'Ehepartner' |
| `BitteBenennenSieDiePersonenUndAnteileDieDenGegenstandErbenSollBspwFrauMüllerZu40HerrBuch60` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Andere Verträge_ |
| `Datumzeitpunkt` | `Date` | _Kontext: Andere Verträge_ |
| `Vereinbarung` | `String.Latin` | _Kontext: Andere Verträge_ |
| `VerträgeHochladen` | `FileRef` | _Kontext: Andere Verträge_ |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDerEheschließung` | `Date` |  |
| `Registernummer` | `String.Latin` |  |
| `Standesamt` | `String.Latin` |  |
| `DatumDesEhevertrages` | `Date` | _Kontext: Ehevertag_ |
| `EheurkundeOrEhevertragHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `SolltenSieKeinenGüterstandVereinbartHabenGiltDerGesetzlichenGüterstandDerZugewinngemeinschaft` | `String.Latin (Info)` |  |
| `` | `Code (List)` | **Werte:** 'Zugewinngemeinschaft', 'Sonstige Vereinbarungen', 'Weiß ich nicht', 'Gütergemeinschaft', 'Gütertrennung' |

---

## 10. Familienrecht: Abstammung (Relevanz: 4)

**Klasse:** `FamilienrechtAbstammung`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `GeburtsurkundeHochladen` | `FileRef` |  |
| `IhreAktuelleBeziehungZumKindesvater` | `Code (List)` | **Werte:** 'Getrennt', 'Keine Angabe', 'Ehe', 'Keine Beziehung', 'Geschieden', 'Lebensgemeinschaft' |
| `Grundanlass` | `Code (List)` | Beachten Sie, dass eine Anfechtung bei ernsthaften Zweifeln oder Beweisen gegen eine Vaterschaft möglich ist.<br>**Werte:** 'Sonstige Gründe', 'Nachgewiesen abweichende DNA', 'Vaterschaft biologisch ausgeschlossen', 'Keine soziale Bindung zum Kind' |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDerKenntnis` | `Date` |  |
| `DokumenteHochladen` | `FileRef` | _Kontext: Gibt es zur Anfechtung bereits Schriftverkehr? >  Gibt es Dokumente, die die Zweifel belegen?_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Getrennt', 'Keine Angabe', 'Ehe', 'Keine Beziehung', 'Geschieden', 'Lebensgemeinschaft' |
| `Artumfang` | `Code (List)` | **Werte:** 'Getrennt', 'Keine Angabe', 'Ehe', 'Keine Beziehung', 'Geschieden', 'Lebensgemeinschaft' |
| `Artumfang` | `Code (List)` | **Werte:** 'Leibliches Kind', 'Ehemann zum Zeitpunkt der Geburt', 'Keine Angabe', 'Kind der Lebenspartnerin', 'Vaterschaft offiziell anerkannt', 'Sonstige Beziehung' |
| `HeiratsurkundeVaterschaftsanerkennungOÄHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Getrennt', 'Keine Angabe', 'Lebenspartnerschaft', 'Ehe', 'Keine Beziehung', 'Geschieden' |
| `Anfechtungsgründe` | `Code (List)` | Beachten Sie, dass bei der Anfechtung ernsthafte Zweifel oder Beweise nötig sind. Einfach Annahmen reichen nicht.<br>**Werte:** 'Sonstige Gründe', 'Keine soziale Bindung zum Kind', 'Untreue der Mutter', 'Nachgewiesen abweichende DNA', 'Vaterschaft biologisch ausgeschlossen' |
| `Datumzeitpunkt` | `Date` |  |
| `IhreBeziehungZurKindesmutter` | `Code (List)` | **Werte:** 'Getrennt', 'Keine Angabe', 'Lebenspartnerschaft', 'Ehe', 'Keine Beziehung', 'Geschieden' |
| `IhreBeziehungZumKind` | `Code (List)` | **Werte:** 'Leibliches Kind', 'Kind der Lebenspartnerin', 'Keine Angabe', 'Sonstige Beziehung' |
| `ZustimmungZurVaterschaftZweifelhaft` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstiges Ziel', 'Weiß ich nicht', 'Sorgerecht für das Kind', 'Vaterschaft eines anderen Mannes anfechten', 'Vaterschaft anerkennen lassen' |

---

## 11. Familienrecht: Ehe (Relevanz: 4)

**Klasse:** `FamilienrechtEhe`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `IhrMonatlichesEinkommenNetto` | `String.Latin (Info)` |  |
| `Einkommen` | `Amount` |  |
| `MonatlichesEinkommenNetto` | `String.Latin (Info)` |  |
| `AngabenZurEhe` | `String.Latin (Info)` |  |
| `DatumDerEheschließung` | `Date` |  |
| `Standesamt` | `String.Latin` |  |
| `Registernummer` | `String.Latin` |  |
| `Ehevertrag` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `EheurkundeEhevertragHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Trennungsdatum` | `Date` |  |
| `RäumlicheTrennung` | `Date` | _Kontext: Leben Sie schon häuslich getrennt?_ |
| `Artumfang` | `String.Latin` |  |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `BitteSchildernSieStichpunktartigDieGründeDerTrennung` | `String.Latin (Info)` |  |
| `Trennungsgründe` | `String.Latin` |  |
| `Vereinbarung` | `String.Latin` | _Kontext: Nacheheliche Vereinbarung_ |
| `AbweichendeAdresse` | `String.Latin` | _Kontext: Weicht die Adresse des Kindes von Ihrer ab?_ |
| `Datumzeitpunkt` | `Date` |  |
| `Standesamt` | `String.Latin` |  |
| `Registernummer` | `String.Latin` |  |
| `EheurkundeOrEhevertragHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `GewünschterGüterstand` | `Code (List)` | **Werte:** 'Gütertrennung', 'Weiß ich nicht', 'Zugewinngemeinschaft', 'Gütergemeinschaft' |
| `ZugewinngemeinschaftEsHandeltSichUmDenGesetzlichenGüterstandDasVermögenJederPersonBleibtGetrenntImFalleEinerScheidungOderDesTodesErfolgtJedochEinFinanziellerAusgleichFürDasVermögenDasWährendDerEheEntstandenIstImSterbensfalleErhältDieÜberlebendePersonNebenDemPflichtteilEinenWeiterenZugewinnanteilVonDesErbvermögens` | `String.Latin (Info)` |  |
| `GütergemeinschaftDasVermögenWirdZuEinemGemeinschaftlichenGesamtvermögenDiesGiltFürAllesVorUndWährendDerEheErlangtVermögenBeidePersonenKönnenGleichermaßenÜberDasVermögenVerfügen` | `String.Latin (Info)` |  |
| `GütertrennungDasVermögenJederPersonBleibtGetrenntDieEhegattenSindGüterrechtlichNichtVerbundenJedePersonKannÜberDasEigeneVermögenVollständigFreiUndOhneZustimmungDerAnderenPersonVerfügenAuchÜberGegenständeDesEhelichenHaushaltesImFalleEinerScheidungOderDesTodesErfolgtKeinFinanziellerAusgleich` | `String.Latin (Info)` |  |
| `Pflichtteilsverzicht` | `String.Latin` | _Kontext: Wird eine Person auf den erbrechtlichen Pflichtteil verzichten?_ |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `DerVersorgungsausgleichDientDerGerechtenAufteilungFinanziellerUnterschiedeWennEinePersonInDerEheEinHöheresEinkommenErzielenKonnte` | `String.Latin (Info)` |  |
| `VerzichtVersorgungsausgleichBeiScheidung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `VerzichtEhegattenunterhaltBeiScheidung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `MöchtenSieBestimmteRegelungenAufnehmen` | `String.Latin (Info)` |  |
| `EigeneRegelungen` | `String.Latin` |  |
| `Beteiligteperson` | `Code (List)` | _Kontext: Erwerbsunfähigkeit_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Beteiligteperson` | `Code (List)` | _Kontext: Erwerbsunfähigkeit_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `DatumDerEheschließung` | `Date` |  |
| `AusschlussVersorgungsausgleich` | `Code (List)` | _Kontext: Ehevertrag/ Trennungsvereinbarung_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `EhevertragVereinbarungenHochladen` | `FileRef` | _Kontext: Ehevertrag/ Trennungsvereinbarung_ |
| `DatumDerScheidung` | `Date` | _Kontext: Scheidung_ |
| `ScheidungsbeschlussHochladen` | `FileRef` | _Kontext: Scheidung_ |
| `VereinbarungVersorgungsausgleich` | `String.Latin` | _Kontext: Vereinbarung Versorgungsausgleich_ |
| `Berechtigt` | `String.Latin` |  |
| `Art` | `Code (List)` | **Werte:** 'Zusatzversorgung des öffentlichen Dienstes', 'Weiß ich nicht', 'Gesetzliche Rentenversicherung', 'Ansprüche als Berufssoldat', 'Beamtenversorgung' |
| `VersicherungsorPersonalnummer` | `String.Latin (Info)` |  |
| `Personalnummer` | `String.Latin` |  |
| `BeginnDerAltersvorsorge` | `String.Latin (Info)` |  |
| `Eintrittsdatum` | `Date` |  |
| `LetzteRenteninformationBescheidOÄHochladen` | `FileRef` |  |
| `ArtDerPrivatenAltersvorsorge` | `Code (List)` | **Berufsständische Altersversorgung**: bei Freiberuflern und Landwirten <br> <br>**Private und Flexible Rentenversicherungen**: bspw. Riesterrente, Rürup-Rente, Kapitalbildende Lebensversicherung<br>**Werte:** 'Tarifvertragliche Zusatzversorgung', 'Private Kapitallebensversicherungen', 'Private / Flexible Rentenversicherung', 'Weiß ich nicht', 'Berufsständische Altersversorgung', 'Betriebliche Altersversorgung' |
| `PoliceVersicherungsscheinBescheideOÄHochladen` | `FileRef` |  |
| `GemeinsamesEigentum` | `Code (List)` | Sie und Ihr Partner haben dann gleiche Rechte und Ansprüche über die Gegenstände<br>**Werte:** 'Nein', 'Ja' |
| `Ausnahmen` | `String.Latin` | _Kontext: Weitere Regelung_ |
| `GemeinsameKostentragung` | `Amount (Currency)` | Bspw.: Miete, öffentliche Gebühren, Telefonanschluss, Lebensmittelkäufe<br>**Optionen:** 'Nein', 'Ja' |
| `Unterhaltsempfänger` | `String.Latin` | _Kontext: Trennungsunterhalt >  Unterhalt_ |
| `MonatlicheZahlung` | `Amount` | _Kontext: Trennungsunterhalt >  Unterhalt_ |
| `ZurückzugebendeGeschenke` | `String.Latin` | _Kontext: Schenkungswiderruf_ |
| `Vorsorgevollmacht` | `Code (List)` | Ein Partner entscheidet dann bspw. über wesentliche Entscheidungen, wenn eine Person schwer erkrankt<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `MöchtenSieWeitereRegelungenTreffen` | `String.Latin (Info)` |  |
| `WeitereRegelungen` | `String.Latin` |  |

---

## 12. Familienrecht: Sorgerecht (Relevanz: 4)

**Klasse:** `FamilienrechtSorgerecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `VaterschaftsanerkennungHochladen` | `FileRef` | _Kontext: Ist die Vaterschaft offiziell anerkannt? >  Ist Ihre Vaterschaft offiziell anerkannt?_ |
| `IhreBeziehungZurKindesmutter` | `Code (List)` | **Werte:** 'Getrennt', 'Keine Angabe', 'Ehe', 'Keine Beziehung', 'Geschieden', 'Lebensgemeinschaft' |
| `IhreBeziehungZumKind` | `Code (List)` | **Werte:** 'Leibliches Kind', 'Ehemann zum Zeitpunkt der Geburt', 'Keine Angabe', 'Kind der Lebenspartnerin', 'Vaterschaft offiziell anerkannt', 'Sonstige Beziehung' |
| `GeburtsurkundeHochladen` | `FileRef` |  |
| `Beteiligteperson` | `Code (List)` | Das Sorgerecht kann bei einer Person oder mehreren Personen liegen. Für ein geteiltes Sorgerecht wählen Sie bitte mehrere Personen<br>**Werte:** 'Amt', 'Kindesmutter', 'Andere Familienmitglieder', 'Kindesvater', 'Andere Person', 'Weiß ich nicht', 'Ich' |
| `GewünschtesSorgerecht` | `Code (List)` | Für ein geteiltes Sorgerecht wählen Sie bitte mehrere Personen<br>**Werte:** 'Amt', 'Kindesmutter', 'Andere Familienmitglieder', 'Kindesvater', 'Andere Person', 'Mir', 'Weiß ich nicht' |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Berechtigte Person kooperiert nicht', 'Missachtung des Umgangsrechts', 'Keiner der Gründe', 'Schlechte Beziehung zum Kind', 'Grobe Erziehungsfehler', 'Andere Gründe', 'Berechtigte Person unerreichbar', 'Gesundheitsgefährdung / Vernachlässigung' |
| `EinverständnisDerKindesmutter` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `MöchtenSieDerKanzleiNochEtwasMitteilen` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `IhreBeziehungZumKindesvater` | `Code (List)` | **Werte:** 'Getrennt', 'Keine Angabe', 'Ehe', 'Keine Beziehung', 'Geschieden', 'Lebensgemeinschaft' |
| `EinverständnisDesBerechtigten` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |

---

## 13. Familienrecht: Unterhalt (Relevanz: 4)

**Klasse:** `FamilienrechtUnterhalt`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `IhrMonatlichesEinkommenNetto` | `String.Latin (Info)` |  |
| `Nettoeinkommen` | `Amount` |  |
| `AngabenZurEhe` | `String.Latin (Info)` |  |
| `DatumDerEheschließung` | `Date` |  |
| `Standesamt` | `String.Latin` |  |
| `Registernummer` | `String.Latin` |  |
| `Ehevertrag` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `EheurkundeEhevertragHochladen` | `FileRef` |  |
| `AngabenZurTrennung` | `String.Latin (Info)` |  |
| `Trennungsdatum` | `Date` |  |
| `RäumlicheTrennungSeit` | `Date` | _Kontext: Häusliche Trennung_ |
| `DatumDerScheidung` | `Date` | _Kontext: Scheidung_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Auskunftsverlangen_ |
| `InhaltDerAuskunft` | `String.Latin` | _Kontext: Auskunftsverlangen_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Weitere Vermögenswerte_ |
| `BspwMeinAuto5500UhrMeinesMannes1500` | `String.Latin (Info)` | _Kontext: Weitere Vermögenswerte_ |
| `ArtUndInhaber` | `String.Latin` | _Kontext: Weitere Vermögenswerte_ |
| `Gesamtvermögen` | `Amount` | _Kontext: Weitere Vermögenswerte_ |
| `VereinbarteRegelung` | `String.Latin` | _Kontext: Vereinbarung Ehegattenunterhalt_ |
| `VereinbarungHochladen` | `FileRef` | _Kontext: Vereinbarung Ehegattenunterhalt_ |
| `EinkommenNetto` | `Amount` | _Kontext: Nettoeinkommen Partner bekannt_ |
| `Datumzeitpunkt` | `Date` |  |
| `RäumlicheTrennung` | `Date` | _Kontext: Häusliche Trennung_ |
| `Regelung` | `String.Latin` | _Kontext: Regelung zum Ehegattenunterhalt_ |

---

## 14. Gesellschaftsrecht: Gründung (Relevanz: 2)

**Klasse:** `GesellschaftsrechtGründung`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Beteiligteperson` | `String.Latin (Info)` | _Kontext: Vorstand_ |
| `Beschränkungen` | `String.Latin` | _Kontext: Vorstand_ |
| `Beteiligteperson` | `Code (List)` | Schatzmeister sind verantwortlich für die Finanzen des Vereins. Die Befugnis kann auf eine oder mehrere Personen übertragen werden.<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Schatzmeister` | `Code (List)` | Schatzmeister sind verantwortlich für die Finanzen des Vereins. Die Befugnis kann auf eine oder mehrere Personen übertragen werden.<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `AngabenZumVerein` | `String.Latin (Info)` |  |
| `Gründungsdatum` | `Date` |  |
| `Vereinssitz` | `String.Latin` |  |
| `GegenstandDesVereins` | `String.Latin (Info)` |  |
| `BeschreibenSieStichpunktartigWasDerVereinInhaltlichMachtWasIstDerZweck` | `String.Latin (Info)` |  |
| `Vereinszweck` | `String.Latin` |  |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `GründungsprotokollSitzungsprotokollSatzungOÄ` | `FileRef` |  |
| `WieVieleMitgliederGibtEsZumJetzigenZeitpunkt` | `Date` |  |
| `AnzahlAktuellerMitglieder` | `Integer / String` |  |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `TurnusDerMitgliederversammlung` | `String.Latin` |  |
| `JährlicherBeitrag` | `Amount` | _Kontext: Sollen von den Mitgliedern jährlich Mitgliedschaftsbeiträge erhoben werden?_ |
| `Aufnahmegebühr` | `Amount` | _Kontext: Soll bei der Aufnahme neuer Mitglieder eine Gebühr erhoben werden?_ |
| `PersönlicheSteueridentifikationsnummer` | `String.Latin (Info)` |  |
| `PersönlicheSteuerId` | `String.Latin` |  |
| `Insichgeschäft` | `Code (List)` | Die Befreiung bewirkt, dass Sie als Vertreter auf Seiten des Unternehmens sowie auf Seiten des Vertragspartners auftreten dürfen. Bspw. auf Käufer- und Verkäuferseite <br>_Kontext: Geschäftsführung_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Vertretungsbefugnis` | `Code (List)` | Die Geschäftsführung betrifft wirksame Handlungen intern in Unternehmen, die Vertretung betrifft wirksame Handlungen nach außen mit Vertragspartnern etc.<br>_Kontext: Geschäftsführung_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Beteiligteperson` | `Code (List)` | Abhängig vom Typ des Unternehmens haben die Gesellschafter eine Stammeinlage / Stammkapital in das Unternehmen einzuzahlen<br>**Werte:** 'Weiß ich nicht', 'Wertgegenstand', 'Geldeinzahlung', 'Keine Einlage' |
| `HöheDerEinlage` | `Amount` |  |
| `PersönlicheSteuerid` | `String.Latin (Info)` |  |
| `Insichgeschäft` | `Code (List)` | Die Befreiung bewirkt, dass die Person als Vertreter auf Seiten des Unternehmens sowie auf Seiten des Vertragspartners auftreten darf. Bspw. auf Käufer- und Verkäuferseite <br>_Kontext: Geschäftsführung_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Beteiligteperson` | `Code (List)` | Abhängig vom Typ des Unternehmens haben die Gesellschafter eine Stammeinlage / Stammkapital in das Unternehmen einzuzahlen<br>**Werte:** 'Weiß ich nicht', 'Wertgegenstand', 'Geldeinzahlung', 'Keine Einlage' |
| `WieSollDasUnternehmenHeißen` | `String.Latin (Info)` |  |
| `Unternehmenssitz` | `String.Latin` |  |
| `SollEsWeitereUnternehmenssitzeGeben` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `WieHochSollDasGesamtkapitalOrStammkapitalDesUnternehmensSein` | `String.Latin (Info)` |  |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `Gesamtkapital` | `Amount` |  |
| `GegenstandDesUnternehmens` | `String.Latin (Info)` |  |
| `BeschreibenSieStichpunktartigWasDasUnternehmenInhaltlichMachtWasIstDerZweckDesUnternehmens` | `String.Latin (Info)` |  |
| `Unternehmensgegenstand` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Gewinn-, Verlustbeteiligung >  Anteilsverteilung_ |
| `VerteilungDerAnteile` | `String.Latin` | _Kontext: Anteilsverteilung_ |
| `GewinnVerlustbeteiligung` | `String.Latin` | _Kontext: Gewinn-, Verlustbeteiligung_ |
| `UnterlagenHochladen` | `FileRef` | _Kontext: Gibt es bereits einen Gesellschaftsvertrag, Sitzungsprotokolle, Satzungsmuster o.ä.?_ |

---

## 15. Gesellschaftsrecht: Management (Relevanz: 2)

**Klasse:** `GesellschaftsrechtManagement`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Unternehmensgegenstand` | `String.Latin (Info)` |  |
| `BeschreibenSieStichpunktartigWasDasUnternehmenInhaltlichMachtWasIstDerZweckDesUnternehmens` | `String.Latin (Info)` |  |
| `Unternehmensgegenstand` | `String.Latin` |  |
| `Vertragsdaten` | `String.Latin (Info)` |  |
| `BeginnDerGeschäftsführung` | `Date` |  |
| `UrlaubstageProJahr` | `String.Latin` |  |
| `ZeitraumDerBefristung` | `String.Latin` | _Kontext: Soll der Vertrag zeitlich befristet werden?_ |
| `HauptberuflicheGeschäftsführung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `ArbeitsstundenProWoche` | `String.Latin` | _Kontext: Sollen feste Arbeitsstunden pro Woche vereinbart werden?_ |
| `ArbeitstageProWoche` | `String.Latin` | _Kontext: Sollen feste Arbeitsstunden pro Woche vereinbart werden?_ |
| `Betriebsmittel` | `String.Latin` | _Kontext: Werden der Person Betriebsmittel während der Geschäftsführung übertragen?_ |
| `GesellschafterbeschlussHochladen` | `FileRef` |  |
| `Gehalt` | `String.Latin (Info)` |  |
| `JahresgehaltBrutto` | `Amount` |  |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Kein Ausgleich', 'Freizeitausgleich', 'Vergütung', 'Sonstiges' |
| `VereinbarungZurGewinnbeteiligung` | `String.Latin` | _Kontext: Soll ein eine Gewinnbeteiligung vereinbart werden?_ |
| `Prämienvereinbarung` | `String.Latin` | _Kontext: Sollen sonstige Prämien oder Gratifikationen vereinbart werden?_ |
| `Tätigkeiten` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Tätigkeiten` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Soll die Geschäftsführung beschränkt werden?_ |
| `BeschränkungDerGeschäftsführung` | `String.Latin` | _Kontext: Soll die Geschäftsführung beschränkt werden?_ |
| `Insichgeschäft` | `Code (List)` | Diese Befreiung bewirkt, dass der Geschäftsführer auf Seiten des Unternehmens sowie auf Seiten des Vertragspartners auftreten darf, also auch Verträge mit sich selbst schließen darf <br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `SindDerPersonNebentätigkeitenErlaubt` | `String.Latin (Info)` |  |
| `Nebentätigkeiten` | `Code (List)` | **Werte:** 'Nein', 'Mit Zustimmung durch Gesellschafterversammlung', 'Nur innerhalb einer anderen Branche', 'Weiß ich nicht', 'Sonstige Regelung', 'Ja' |
| `Beteiligteperson` | `String.Latin` | _Kontext: Soll ein nachvertragliches Wettbewerbsverbot vereinbart werden?_ |
| `OrdentlicheKündigung` | `Code (List)` | Ohne ordentliche Kündigungsmöglichkeit bleibe eine Kündigung nur bei wichtigem Grund möglich<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `BesondereKündigungsgründe` | `String.Latin` | _Kontext: Sollen besondere Gründe für eine außerordentliche Kündigung vereinbart werden?_ |
| `Abfindung` | `Amount` | _Kontext: Soll bei Kündigung oder Amtsniederlegung eine Abfindung gezahlt werden?_ |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `Haftungsbeschränkung` | `Code (List)` | **Werte:** 'Befreiung bei Weisung der Gesellschafter', 'Nein', 'Weiß ich nicht', 'Haftung auf einen Höchstbetrag', 'Sonstige Regelung', 'Haftung bei Vorsatz und grober Fahrlässigkeit' |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `BspwDerAbschlussEinerHaftpflichtversicherungZugunstenDesGeschäftsführersDO` | `String.Latin (Info)` |  |
| `PflichtenDerGesellschaft` | `String.Latin` |  |

---

## 16. Gesellschaftsrecht: Unternehmensanteile (Relevanz: 2)

**Klasse:** `GesellschaftsrechtUnternehmensanteile`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Artumfang` | `String.Latin (Info)` |  |
| `Anteilsinhaber` | `String.Latin` |  |
| `GesellschaftsanteilIn` | `String.Latin` |  |
| `Beteiligteperson` | `Amount` |  |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `SindSieMitDemVerkäuferVerwandtOderVerschwägert` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Datumzeitpunkt` | `Date` | **Optionen:** 'Sofort', 'Weitere Bestimmungen', 'Keine Angabe', 'Nach vollständiger Gegenleistung' |
| `Artumfang` | `Code (List)` | **Werte:** 'Zahlung eines Kaufpreises', 'Tausch gegen andere Anteile', 'Sonstiges', 'Weiß ich nicht', 'Schenkung' |
| `WeitereBestimmungen` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` | _Kontext: Soll die Geschäftsleitung / Prokura geändert werden? >  Änderung_ |
| `NeuerSitz` | `String.Latin` | _Kontext: Sitzänderung_ |
| `ÄnderungDerGeschäftsführung` | `String.Latin` | _Kontext: Sonstige Änderungen >  Geschäftsführungsänderung_ |
| `SonstigeÄnderung` | `String.Latin` | _Kontext: Änderungswünsche_ |
| `PolitischExponiertePerson` | `Code (List)` | Dies umfasst Personen (einschließlich ihrer Familienmitglieder), die ein hochrangiges wichtiges öffentliches Amt auf nationaler und internationaler Ebene ausüben (bspw.: Regierungschefs, Botschafter, Mitglied der Europäischen Kommission, Mitglieder oberster Gerichte...<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Sprache` | `String.Latin` | _Kontext: Dolmetscher_ |
| `EinschränkungenOrBehinderungen` | `String.Latin` | _Kontext: Behinderungen_ |
| `Rolle` | `Code (List)` | **Werte:** 'Geschäftsführung ', 'Liquidator', 'Andere' |
| `Branche` | `String.Latin (Info)` |  |
| `Branche` | `String.Latin` |  |
| `SatzungVertragOÄHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Auflösungsgrund` | `Code (List)` | **Werte:** 'Unternehmenszweck unmöglich', 'Gerichtliche Entscheidung', 'Zeitablauf', 'Unternehmenszweck erreicht', 'Weiß ich nicht', 'Ausscheiden der Gesellschafter', 'Vermögenslosigkeit', 'Auflösungsbeschluss', 'Sonstiger Grund' |
| `AuslösungsbeschlussGerichtsentscheidungOÄHochladen` | `FileRef` |  |
| `NennenSieBitteStichpunktartigDieArtUndHöheDesVorhandenenVermögens` | `String.Latin (Info)` | _Kontext: Unverteiltes Vermögen_ |
| `VorhandenesVermögen` | `String.Latin` | _Kontext: Unverteiltes Vermögen_ |
| `NennenSieBitteStichpunktartigDieArtHöheUndGläubigerDerForderung` | `String.Latin (Info)` | _Kontext: Offene Forderungen_ |
| `BspwForderungAusKaufvertragVonXgmbh50000` | `String.Latin (Info)` | _Kontext: Offene Forderungen_ |
| `OffeneForderungen` | `String.Latin` | _Kontext: Offene Forderungen_ |
| `Gläubigerbenachrichtigung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `ForderungsverzeichnisBelegeGläubigerbenachrichtigungOÄHochladen` | `FileRef` |  |
| `IstDasStammkapitalVollEingezahlt` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `AngabenZumBeteiligtenGrundbesitz` | `String.Latin` | _Kontext: Grundbesitzbeteiligung_ |
| `HöheOffenerDarlehen` | `Amount` | _Kontext: Bestehen offenen Darlehen mit der Käuferseite?_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `SindKäuferinUndVerkäuferinMiteinanderVerwandtOderVerschwägert` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Datumzeitpunkt` | `Date` | **Optionen:** 'Sofort', 'Weitere Bestimmungen', 'Keine Angabe', 'Nach vollständiger Gegenleistung' |
| `Artumfang` | `Code (List)` | **Werte:** 'Zahlung eines Kaufpreises', 'Tausch gegen andere Anteile', 'Sonstiges', 'Weiß ich nicht', 'Schenkung' |
| `NeueSitz` | `String.Latin` | _Kontext: Sitzänderung_ |
| `Beteiligteperson` | `Code (List)` | _Kontext: Soll die Geschäftsleitung / Prokura geändert werden? >  Änderung_<br>**Werte:** 'Rechtsform', 'Veränderung bestehender Prokura', 'Abberufung Geschäftsführung', 'Gesellschaftsgegenstand', 'Satzung', 'Geschäftsadresse', 'Gesellschafteraustritt', 'Neubestellung Geschäftsführung', 'Gesellschaftereintritt', 'Beendigung einer Prokura', 'Name der Gesellschaft', 'Gesellschaftssitz', 'Zweigstelle', 'Gesellschafterhaftung', 'Stammkapital', 'Sonstige Änderungen', 'Bestellung einer Prokura' |
| `NennenSieBitteStichpunktartigDieGewünschteÄnderung` | `String.Latin (Info)` | _Kontext: Soll die Geschäftsleitung / Prokura geändert werden? >  Änderung_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Ist eine Auflösung der Gesellschaft gewünscht?_ |
| `DatumDerAuflösung` | `Date` | _Kontext: Ist eine Auflösung der Gesellschaft gewünscht?_ |
| `WurdeDerBeschlussÜberDieAuflösungDerGesellschaftBereitsGefasst` | `Code (List)` | _Kontext: Ist eine Auflösung der Gesellschaft gewünscht?_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `AngabenZurPersonFürDieLiquidation` | `String.Latin (Info)` | _Kontext: Ist eine Auflösung der Gesellschaft gewünscht?_ |
| `AnschriftDesLiquidators` | `String.Latin` | _Kontext: Ist eine Auflösung der Gesellschaft gewünscht?_ |
| `AuflösungsbeschlussHochladen` | `FileRef` | _Kontext: Ist eine Auflösung der Gesellschaft gewünscht?_ |

---

## 17. Gewerberecht: Erlaubnis (Relevanz: 2)

**Klasse:** `GewerberechtErlaubnis`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `EintrittDerInsolvenz` | `Date` | _Kontext: Insolvenz_ |
| `ArtDerInsolvenz` | `Code (List)` | _Kontext: Insolvenz_<br>**Werte:** 'Weiß ich nicht', 'Privat / Verbraucher', 'Unternehmen' |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `PersonalausweisFührungszeugnisHochladen` | `FileRef` |  |
| `AdresseDerGaststätte` | `String.Latin` |  |
| `Anzahl` | `Integer / String` | _Kontext: Zweigniederlassungen_ |
| `Räumlichkeiten` | `String.Latin (Info)` |  |
| `GesamtflächeDesInnenbereichsInM` | `String.Latin` |  |
| `GesamtflächeDesAußenbereichsInM` | `String.Latin` |  |
| `AnzahlDerGasträume` | `Integer / String` |  |
| `AnzahlDerPersonalräume` | `Integer / String` |  |
| `AnzahlDerLagerräume` | `Integer / String` |  |
| `AnzahlDerKüchen` | `Integer / String` |  |
| `AnzahlDerToiletten` | `Integer / String` |  |
| `WeitererBereiche` | `String.Latin` |  |
| `AnzahlDerStufen` | `Integer / String` | _Kontext: Zugang nicht barrierefrei_ |
| `GrundrissLageplanHochladen` | `FileRef` |  |
| `Betriebsart` | `String.Latin (Info)` |  |
| `BeschreibenSieBitteStichpunktartigDieVorgeseheneBetriebsartUndWasSieDenGästenAnbietenWollenBspwPizzarestaurantOderShishabar` | `String.Latin (Info)` |  |
| `Betriebsart` | `String.Latin` |  |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Rauchen` | `Code (List)` | **Werte:** 'Ja, in abgetrennten Räumen', 'Ja, in allen Räumen', 'Nein' |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Filmaufführungen', 'Verkaufsfläche', 'Anderes', 'Disko / Tanz', 'Sonstige Aufführungen', 'Musikveranstaltungen' |
| `Geschäftszeiten` | `String.Latin (Info)` |  |
| `NennenSieBitteWochentagUndÖffnungszeitenBspwDiSo12002300MontagGeschlossen` | `String.Latin (Info)` |  |
| `Geschäftszeiten` | `String.Latin` |  |
| `WieVielMitarbeitendeSindAngestellt` | `String.Latin (Info)` |  |
| `AnzahlDerMitarbeitenden` | `Integer / String` |  |
| `DatumDerBetriebsübernahme` | `Date` | _Kontext: Betriebsübernahme_ |
| `Beteiligteperson` | `Code (List)` | _Kontext: Betriebsübernahme_<br>**Werte:** 'Nein', 'Ja' |
| `Nutzung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Gemietet', 'Eigentum am Grundstück', 'Gepachtet' |
| `NutzungsvertragOrGrundbuchauszugHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Versicherungssumme` | `Amount` |  |
| `WasIstVersichert` | `String.Latin (Info)` |  |
| `Haftungsumfang` | `String.Latin` |  |
| `AdresseDerSpielhalle` | `String.Latin` |  |
| `AnzahlDerSpielgeräte` | `Integer / String` |  |
| `BeschreibenSieBitteStichpunktartigDieVorgeseheneBetriebsartUndWasSieDenGästenAnbietenWollenBspwCasinoMitPokerRouletteUndCocktails` | `String.Latin (Info)` |  |
| `Gewinnmöglichkeit` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Speisen', 'Musik-/ Filmaufführungen', 'Anderes', 'Disko / Tanz', 'Alkohol', 'Sonstige Aufführungen', 'Raucherbereich' |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Begleitung von Wert-/ Geldtransporten ', 'Gebäudeüberwachung ', 'Kauf-/ Warenhausdetektiv ', 'Zugangskontrollen Veranstaltungen', 'Personenschutz ', 'Fluggastkontrolle ' |
| `BeschreibenSieBitteStichpunktartigDieVorgeseheneBetriebsartBspwSecurityVorDemTanzclubOderBewachungVonPersonenOderBewachungVonGebäuden` | `String.Latin (Info)` |  |
| `HauptniederlassungDesBetriebes` | `String.Latin` |  |
| `BeschreibenSieDieDienstkleidungBitteStichpunktartigBspwDunkleKleidungGeschlosseneSchuhe` | `String.Latin (Info)` | _Kontext: Dienstkleidung_ |
| `Dienstkleidung` | `String.Latin` | _Kontext: Dienstkleidung_ |

---

## 18. Gewerberecht: Untersagung (Relevanz: 2)

**Klasse:** `GewerberechtUntersagung`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Rolle` | `Code (List)` | **Werte:** 'Stellvertretung', 'Andere Rolle', 'Inhaber' |
| `Datumzeitpunkt` | `Date` |  |
| `Zustellungsdatum` | `Date` |  |
| `Behörde` | `String.Latin` |  |
| `Ordnungsverfügung` | `Code (List)` | **Werte:** 'Entzug der Erlaubnis', 'Sonstige Anordnung', 'Erste Erlaubnis unter Auflagen / Bedingungen', 'Weiß ich nicht', 'Nachträgliche Auflagen / Bedingungen', 'Betriebsschließung' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Fristende` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Fehlende Erlaubnis', 'Unzuverlässigkeit', 'Andere', 'Keine Gründe angegeben', 'Beschwerden von Personen', 'Überschrittene Erlaubnis', 'Nicht erlaubnisfähig' |
| `FassenSieDieGründeBitteStichpunktartigZusammen` | `String.Latin (Info)` | _Kontext: Begründung_ |
| `Begründung` | `String.Latin` | _Kontext: Begründung_ |
| `Zwangsmittel` | `Code (List)` | **Werte:** 'Zwangsgeld', 'Unmittelbarer Zwang', 'Nein', 'Ersatzvornahme' |
| `BescheidKorrespondenzOÄHochladen` | `FileRef` |  |
| `Gewerbeerlaubnis` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Artumfang` | `Code (List)` | **Werte:** 'Makler / Vermittlung', 'Bewachung', 'Anderes Gewerbe', 'Weiß ich nicht', 'Spielhalle', 'Gaststätte' |
| `WollenSieDerKanzleiNochEtwasMitteilen` | `String.Latin (Info)` |  |
| `TeilenSieBitteAuchMitWennAkuteDringendeGründenVorliegen` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `Beteiligteperson` | `FileRef` |  |

---

## 19. Hochschulrecht (Relevanz: 1)

**Klasse:** `Hochschulrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `IhrStudiengang` | `String.Latin (Info)` |  |
| `Studiengang` | `String.Latin` |  |
| `Abschlussart` | `Code (List)` | **Werte:** 'Andere', 'Bachelor', 'Magister', 'Diplom', 'Master', 'Doktor / PhD', 'Staatsexamen' |
| `ImmatrikulationsorPersonalnummer` | `String.Latin (Info)` |  |
| `Immatrikulationsnummer` | `String.Latin` |  |
| `ImmatrikulationsbescheinigungenHochladen` | `FileRef` |  |
| `Prüfungsinformationen` | `String.Latin (Info)` |  |
| `Prüfungsfach` | `String.Latin` | _Kontext: Prüfungsausgleich_ |
| `BezeichnungDerPrüfung` | `String.Latin` | _Kontext: Prüfungsausgleich_ |
| `Prüfungsdatum` | `Date` | _Kontext: Prüfungsausgleich_ |
| `ErreichteNoteOrPunkte` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Datum` | `Date` |  |
| `Prüfungsart` | `Code (List)` | _Kontext: Prüfungsausgleich_<br>**Werte:** 'Schriftlich', 'Mündlich' |
| `` | `Code (List)` | _Kontext: Prüfungsausgleich_<br>**Werte:** 'Wiederholungsversuch', 'Erstversuch', 'Zwischenprüfung', 'Abschlussprüfung' |
| `PrüfungsbescheidKlausurOÄHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Parteiische Korrektoren', 'Anderer Grund', 'Falscher Täuschungsvorwurf', 'Akute Krankheit', 'Unfaire Bewertung ', 'Vorherige Krankmeldung', 'Unzumutbare äußere Faktoren', 'Vorheriger Prüfungsrücktritt' |
| `BeschreibenSieBitteStichpunktartigDieSituation` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `DatumDerRüge` | `Date` | _Kontext: Rüge_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `Ausbildungsabschluss` | `Code (List)` | **Werte:** 'Hochschulreife', 'Fachhochschulreife', 'Anderer', 'Berufsausbildung', 'Abitur' |
| `NoteDesAbschlusses` | `String.Latin` |  |
| `DatumDesAbschlusses` | `Date` |  |
| `AbschlusszeugnisHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Privat', 'Staatlich', 'Weiß ich nicht', 'Kirchlich' |
| `GewünschtesStudium` | `String.Latin (Info)` |  |
| `GewünschterStudienbeginn` | `Date` |  |
| `Nc` | `String.Latin` | _Kontext: NC_ |
| `Hochschule` | `String.Latin` | _Kontext: Vorherige Einschreibung_ |
| `DatumDerEinschreibung` | `Date` | _Kontext: Vorherige Einschreibung_ |
| `AnzahlDerKinder` | `Integer / String` | _Kontext: Kinder_ |
| `AlterDerKinder` | `String.Latin` | _Kontext: Kinder_ |
| `BeschreibenSieDieseBitteStichpunktartig` | `String.Latin (Info)` | _Kontext: Qualifikationen_ |
| `Qualifikationen` | `String.Latin` | _Kontext: Qualifikationen_ |
| `NachweiseZertifikateUrkundenHochladen` | `FileRef` | _Kontext: Qualifikationen_ |
| `Datumzeitpunkt` | `Date` |  |
| `DatumBescheid` | `Date` |  |
| `FassenSieBitteStichpunktartigDieBegründungFürDieAblehnungZusammen` | `String.Latin (Info)` |  |
| `Begründung` | `String.Latin` |  |
| `AblehnungsbescheidHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Rangstelle` | `String.Latin` |  |
| `Widerspruchsdatum` | `Date` | _Kontext: Widerspruch_ |
| `WiderspruchHochladen` | `FileRef` | _Kontext: Widerspruch_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `BeschreibenSieBenachteiligungenBitteStichpunktartigBspwAdhsSehbehinderungLeseRechtschreibschwächeChronischeSehnenscheidenentzündung` | `String.Latin (Info)` |  |
| `Nachteil` | `String.Latin` |  |
| `BeschreibenSieBitteStichpunktartigWieSichIhreBenachteiligungAuswirkt` | `String.Latin (Info)` |  |
| `BspwGeringereKonzentrationsfähigkeitNachCa2hTauberUndSchmerzenderArm` | `String.Latin (Info)` |  |
| `Auswirkungen` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Datum` | `Date` |  |
| `DatumDesAttestes` | `Date` | _Kontext: Attest_ |
| `AttestOrÄrztlicheUnterlagenHochladen` | `FileRef` | _Kontext: Attest_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Benutzung von Hilfsmitteln', 'Reorganisation von Lehrveranstaltungen', 'Sonstiges', 'Zeitliche Anpassung', 'Räumliche Anpassung', 'Zulassung zur Lehrveranstaltung', 'Dolmetscher' |

---

## 20. Immobilienrecht (Relevanz: 3)

**Klasse:** `Immobilienrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `AnzahlEigentümer` | `Integer / String` | _Kontext: Miteigentümer_ |
| `AdresseOrSitz` | `String.Latin` | _Kontext: Vertretung_ |
| `VertretungsvollmachtHochladen` | `FileRef` | _Kontext: Vertretung_ |
| `Steueridentifikationsnummer` | `String.Latin (Info)` |  |
| `SteuerId` | `String.Latin` |  |
| `Sprache` | `String.Latin` | _Kontext: Benötigt die Person nach Ihrem Wissen einen Dolmetscher? >  Benötigen Sie einen Dolmetscher?_ |
| `KörperlicheEinschränkungen` | `Code (List)` | Gemeint sind Einschränkungen, die das Hören, Schreiben, Sehen oder Sprechen beeinträchtigen<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `PolitischExponiert` | `Code (List)` | Dies umfasst Personen (einschließlich ihrer Familienmitglieder), die ein hochrangiges wichtiges öffentliches Amt auf nationaler und internationaler Ebene ausüben (bspw.: Regierungschefs, Botschafter, Mitglied der Europäischen Kommission, Mitglieder oberster Gerichte...<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `AnzahlKäufer` | `Integer / String` | _Kontext: Weiter Käufer_ |
| `KörperlicheEinschränkungen` | `Code (List)` | Gemeint sind Einschränkungen, die das Hören, Schreiben, Sehen oder Sprechen beeinträchtigen<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `PolitischExponiert` | `Code (List)` | Dies umfasst Personen (einschließlich ihrer Familienmitglieder), die ein hochrangiges wichtiges öffentliches Amt auf nationaler und internationaler Ebene ausüben (bspw.: Regierungschefs, Botschafter, Mitglied der Europäischen Kommission, Mitglieder oberster Gerichte...<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `GebenSieBitteDieGrundbuchdatenDesGrundstückesAn` | `String.Latin (Info)` |  |
| `ZuständigesAmtsgericht` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Grundbuch` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Bezirk` | `String.Latin` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Gemarkung` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `GrößeDesGrundstückes` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Gemarkung` | `String.Latin` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `GrundstückInM` | `String.Latin` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Blatt` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Bestandsverzeichnis` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Blattnr` | `String.Latin` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `BestandsverzeichnisNr` | `String.Latin` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Flur` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Flurstück` | `String.Latin (Info)` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Flur` | `String.Latin` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Flurstück` | `String.Latin` | _Kontext: Sind die Grundbuchdaten bekannt?_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Sind auf die Immobilie nach Ihrem Wissen Grundschulden im Grundbuch eingetragen? >  Sind auf die Immobilie Grundschulden im Grundbuch eingetragen?_ |
| `BestehendeGrundschulden` | `String.Latin` | _Kontext: Sind auf die Immobilie nach Ihrem Wissen Grundschulden im Grundbuch eingetragen? >  Sind auf die Immobilie Grundschulden im Grundbuch eingetragen?_ |
| `Artumfang` | `Code (List)` | _Kontext: Sind auf die Immobilie nach Ihrem Wissen Grundschulden im Grundbuch eingetragen? >  Sind auf die Immobilie Grundschulden im Grundbuch eingetragen?_<br>**Werte:** 'Darlehen sind noch offen, sollen aber vom Käufer übernommen werden', 'Darlehen sind bezahlt, die Löschungsunterlagen liegen vor', 'Keine Regelung bisher', 'Darlehen sind noch offen und werden aus dem Kaufpreis bezahlt', 'Andere Regelung', 'Darlehen sind bezahlt, der Notar soll Löschungsunterlagen einholen' |
| `Bebauung` | `Code (List)` | **Werte:** 'Einfamilienhaus', 'Mehrfamilienhaus', 'Bürogebäude', 'Sonstige Bebauung', 'Weiß ich nicht', 'Unbebaut', 'Reihenhaus' |
| `Nutzung` | `Code (List)` | **Werte:** 'Gewerblich', 'Leerstehend / Ungenutzt', 'Vermietet', 'Eigennutzung', 'Weiß ich nicht', 'Landwirtschaftlich', 'Gemischt' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Wird ein Sondernutzungsrecht mitverkauft?_ |
| `EinzuräumendeSondernutzungsrechte` | `String.Latin` | _Kontext: Wird ein Sondernutzungsrecht mitverkauft?_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Werden bewegliche Gegenstände mitverkauft?_ |
| `ZuVerkaufendeGegenstände` | `String.Latin` | _Kontext: Werden bewegliche Gegenstände mitverkauft?_ |
| `Kaufpreis` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Gesamtkaufpreis` | `Amount` |  |
| `DatumKaufpreis` | `Date` |  |
| `Zahlungsempfänger` | `String.Latin` | _Kontext: Wurden bereits (An-)Zahlungen geleistet?_ |
| `Zahlungshöhe` | `Amount` | _Kontext: Wurden bereits (An-)Zahlungen geleistet?_ |
| `AnWenIstDerKaufpreisZuZahlen` | `String.Latin (Info)` |  |
| `VerwandschaftDerParteien` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `AdresseDesMaklers` | `String.Latin` | _Kontext: Vermittlung durch Makler_ |

---

## 21. Insolvenzrecht: Privat (Relevanz: 3)

**Klasse:** `InsolvenzrechtPrivat`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `IhrFamilienstand` | `Code (List)` | **Werte:** 'Ledig', 'Geschieden', 'Verheiratet', 'Verwitwet', 'Sonstig' |
| `BestehendeForderung` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Vorstrafen` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `IhreAktuelleSituation` | `Code (List)` | **Werte:** 'Schule / Studium', 'Arbeitslos', 'Ruhestand', 'Hausfrau / Hausmann', 'Verbeamtet', 'Sonstige Situation', 'Angestellt', 'Selbstständig' |
| `BestehendeForderung` | `Code (List)` | _Kontext: Frühere Selbstständigkeit_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Grund` | `Code (List)` | Die Insolvenz droht bereits, wenn absehbar ist, dass fast alle Rechnungen nicht innerhalb von 3 Wochen gezahlt werden können <br>**Werte:** 'Weiß ich nicht', 'Bestehende Zahlungsunfähigkeit', 'Drohende Zahlungsunfähigkeit' |
| `AntragInnerhalb11Jahre` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Pfändung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `WieHochIstIhrAktuellesVermögenSchätzungsweise` | `String.Latin (Info)` |  |
| `Vermögenshöhe` | `Amount` |  |
| `Vermögensverhältnisse` | `String.Latin (Info)` |  |
| `NennenSieBitteArtUndHöheBspwBargeld500Job1500OrMonatAutoCa2800` | `String.Latin (Info)` |  |
| `Vermögen` | `String.Latin` |  |
| `Beteiligteperson` | `FileRef` |  |
| `Forderungshöhe` | `String.Latin (Info)` |  |
| `GeschätzteForderungshöhe` | `Amount` |  |
| `ArtDerForderung` | `Code (List)` | **Werte:** 'Versicherung', 'Unterhalt', 'Strafen', 'Kaufvertrag', 'Weiß ich nicht', 'Dienst- / Werkvertrag', 'Anderer Art', 'Miet- / Pachtvertrag', 'Kreditvertrag' |
| `Entstehungsdatum` | `Date` |  |
| `Entstehungsdatum` | `Date` |  |
| `DatumErstmaligerAufforderung` | `Date` | _Kontext: Mahnung_ |
| `RechnungBelegOÄHochladen` | `FileRef` |  |

---

## 22. Insolvenzrecht: Unternehmensinsolvenz (Relevanz: 3)

**Klasse:** `InsolvenzrechtUnternehmensinsolvenz`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `GegenstandDesUnternehmens` | `String.Latin (Info)` |  |
| `BeschreibungDesUnternehmensgegenstandes` | `String.Latin` |  |
| `HöheDesStammkapitals` | `String.Latin (Info)` |  |
| `Stammkapital` | `Amount` |  |
| `IstDasStammkapitalVollEingezahlt` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Grund` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Bestehende Zahlungsunfähigkeit', 'Drohende Zahlungsunfähigkeit' |
| `Bilanzsumme6Mio` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `UmsatzÜber12Mio` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `GesamthöheSozialversicherungsrückstände` | `Amount` | _Kontext: Offene Sozialversicherungsbeiträge_ |
| `GesamthöheGehaltsOrLohnrückstände` | `Amount` | _Kontext: Offene  Gehalts-/ Lohnrückstände_ |
| `AnzahlDerBeschäftigten` | `Integer / String` | _Kontext: > 50 Angestellte_ |
| `BestehendeAnstellung` | `Code (List)` | _Kontext: > 50 Angestellte_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `AdresseDerGeschäftsräume` | `String.Latin` | _Kontext: Geschäftsräume_ |
| `Geschäftsbetrieb` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Betriebsrat` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `LetzteSteuererklärung` | `String.Latin (Info)` |  |
| `JahrLetzterSteuererklärung` | `Date` |  |
| `ArtLetzterSteuererklärung` | `Code (List)` | **Werte:** 'Lohnsteuer', 'Umsatzsteuervoranmeldung', 'Umsatzsteuer', 'Weiß ich nicht', 'Gewerbesteuer' |
| `WieHochIstDasAktuelleBetriebsvermögenSchätzungsweise` | `String.Latin (Info)` |  |
| `Vermögenshöhe` | `Amount` |  |
| `Vermögensverhältnisse` | `String.Latin (Info)` |  |
| `Vermögen` | `String.Latin` |  |
| `Beteiligteperson` | `FileRef` |  |
| `Forderungshöhe` | `String.Latin (Info)` |  |
| `GeschätzteForderungshöhe` | `Amount` |  |
| `ArtDerForderung` | `Code (List)` | **Werte:** 'Versicherung', 'Strafen', 'Kaufvertrag', 'Weiß ich nicht', 'Dienst- / Werkvertrag', 'Anderer Art', 'Miet- / Pachtvertrag', 'Kreditvertrag' |
| `Entstehungsdatum` | `Date` |  |
| `Entstehungsdatum` | `Date` |  |
| `DatumErstmaligerAufforderung` | `Date` | _Kontext: Mahnung_ |
| `RechnungBelegOÄHochladen` | `FileRef` |  |

---

## 23. Medizinrecht (Relevanz: 2)

**Klasse:** `Medizinrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Behandler` | `String.Latin (Info)` |  |
| `WieLautetDieFacharztbezeichnung` | `String.Latin (Info)` |  |
| `Facharztbezeichnung` | `String.Latin` |  |
| `` | `String.Latin` |  |
| `Behandler` | `Date` |  |
| `BeginnDerBehandlung` | `Date` |  |
| `EndeDerBehandlung` | `Date` |  |
| `WeswegenHabenSieDenArztOrKlinikAufgesucht` | `String.Latin (Info)` |  |
| `Diagnose` | `String.Latin` |  |
| `Notfall` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Artumfang` | `String.Latin (Info)` |  |
| `BehandlungEn` | `String.Latin` |  |
| `UnterlagenHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | _Kontext: Aufklärung_<br>**Werte:** 'Schriftlich', 'Mündlich', 'Nur meine Angehörigen' |
| `VorherigesEinverständnis` | `Code (List)` | _Kontext: Aufklärung_<br>**Werte:** 'Nein', 'Teilweise', 'Ja' |
| `WorüberWurdenSieAufgeklärt` | `String.Latin (Info)` | _Kontext: Aufklärung Weiterbehandlung_ |
| `AufklärungWeiterbehandlung` | `String.Latin` | _Kontext: Aufklärung Weiterbehandlung_ |
| `AufklärungsbogenEinverständnisHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstige', 'Medizinischer Mitarbeiter', 'Weiß ich nicht', 'Mein Angehöriger', 'Anderer Patient' |
| `WorinBestandNachIhrerMeinungDerBehandlungsfehler` | `String.Latin (Info)` |  |
| `Behandlungsfehler` | `String.Latin` |  |
| `BeschreibungDerSchmerzen` | `String.Latin` | _Kontext: Schmerzen_ |
| `Andauernd` | `Code (List)` | _Kontext: Schmerzen_<br>**Werte:** 'Nein', 'Ja' |
| `BeschreibungDerBeeinträchtigungen` | `String.Latin` | _Kontext: Beeinträchtigungen_ |
| `UnterlagenFotosOÄHochladen` | `FileRef` |  |
| `Gesamthöhe` | `Amount` | _Kontext: Kosten_ |
| `BeschreibungDerKosten` | `Amount (Currency)` | _Kontext: Kosten_ |
| `RechnungEnOrBelegeOrSteuerbescheideVorBehandlungHochladen` | `FileRef` |  |
| `DatumAntrag` | `Date` | _Kontext: Antrag_ |
| `SchreibenHochladen` | `FileRef` | _Kontext: Antrag_ |

---

## 24. Mietrecht: Mieter (Relevanz: 5)

**Klasse:** `MietrechtMieter`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `AbweichendeAdresse` | `String.Latin` | _Kontext: Weicht die Adresse des Mietobjektes von Ihrer Adresse ab?_ |
| `Etage` | `String.Latin` |  |
| `WohnungslageLinksMitteRechts` | `String.Latin` |  |
| `AnzahlDerZimmer` | `Integer / String` |  |
| `FlächeInM` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstige Objekte (Grundstück, Gegenstände...)', 'Privater Wohnraum', 'Gewerberaum', 'Gemischt genutzte Räume' |
| `Datumzeitpunkt` | `Date` |  |
| `BeginnDesMietverhältnisses` | `Date` |  |
| `MietvertragHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `MonatsanfangMonatsmitte` | `String.Latin` |  |
| `Kaltmiete` | `Amount` |  |
| `Nebenkosten` | `Amount` |  |
| `EingangDerAbrechnung` | `Date` | _Kontext: BKA_ |
| `Abrechnungsjahr` | `String.Latin` | _Kontext: BKA_ |
| `BetriebskostenabrechnungHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Grund` | `Code (List)` | **Werte:** 'Betriebskosten sind laut Mietvertrag ausgeschlossen', 'Kostenpositionen sind unklar/ unvollständig', 'Betriebskosten wurden bereits bezahlt', 'Betriebskostenabrechnung ist zu spät', 'Betriebskosten sind viel zu hoch', 'Sonstiger Grund' |
| `EigeneAnmerkung` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstige Objekte (Grundstück, Gegenstände...)', 'Privater Wohnraum', 'Gewerberaum', 'Gemischt genutzte Räume' |
| `EndeDesMietverhältnisses` | `Date` | _Kontext: Befristung_ |
| `Mietzahlung` | `String.Latin (Info)` |  |
| `Kautionshöhe` | `Amount` | _Kontext: Wurde eine Kautionszahlung vereinbart?_ |
| `WurdeDieKautionVollständigGezahlt` | `Code (List)` | _Kontext: Wurde eine Kautionszahlung vereinbart?_<br>**Werte:** 'Nein', 'Ja' |
| `Artumfang` | `Code (List)` | **Werte:** 'Zahlungsverzug', 'Veräußerung des Mietobjektes', 'Fehlverhalten', 'Mietsicherheiten nicht geleistet', 'Eigenbedarf', 'Kein Grund angegeben', 'Sonstiger Grund', 'Ungenehmitgte Untervermietung' |
| `Grundanlass` | `String.Latin (Info)` |  |
| `GrundDerUnwirksamkeit` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sofort (fristlos)', 'Später', 'In 3 Monaten' |
| `KündigungHochladen` | `FileRef` |  |
| `DatumDerAbmahnung` | `Date` | _Kontext: Wurden Sie vor der Kündigung abgemahnt?_ |
| `DatumDesWiderspruchs` | `Date` | _Kontext: Haben Sie der Kündigung widersprochen?_ |
| `AbmahnungOrWiderspruchHochladen` | `FileRef` |  |
| `Ausnahmeumstände` | `Code (List)` | **Werte:** 'Schwere Krankheit', 'Schwangerschaft', 'Hohes Alter', 'Gebrechlichkeit', 'Keine geeignete Ersatzwohnung', 'Bevorstehende Abschlussprüfung', 'Kinder', 'Niedriges Einkommen' |
| `HatteDerVermieterKenntnisVonDiesemUmstand` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `` | `String.Latin` | _Kontext: Abweichende Adresse_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `Mangelart` | `String.Latin` |  |
| `WoBefindetSichDerMangel` | `String.Latin (Info)` |  |
| `BestandDerMangelBereitsBeimEinzug` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `BilderHochladen` | `FileRef` |  |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Unbekannt', 'Vermieter', 'Besucher', 'Ich/ Mitmieter/ Untermieter' |
| `Datumzeitpunkt` | `Date` |  |
| `KenntnisVomMangel` | `Date` |  |
| `DatumDerMangelanzeige` | `Date` | _Kontext: Mangelanzeige_ |
| `Artumfang` | `Code (List)` | _Kontext: Mangelanzeige_<br>**Werte:** 'Schriftlich', 'Mündlich' |
| `MangelanzeigeHochladen` | `FileRef` | _Kontext: Mangelanzeige_ |
| `WofürSindKostenEntstanden` | `Amount (Currency)` | _Kontext: Kosten_ |
| `Kostenauslöser` | `Amount (Currency)` | _Kontext: Kosten_ |
| `Gesamtkosten` | `Amount` | _Kontext: Kosten_ |
| `RechnungHochladen` | `FileRef` | _Kontext: Kosten_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Mangelbeseitigung', 'Sonstiges', 'Ersatz der Kosten', 'Minderung oder Rückzahlung der Miete', 'Kündigung' |
| `ZielbeschreibungOptional` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nebenmieter', 'Untermieter', 'Hauptmieter' |
| `AnzahlMitbewohner` | `Integer / String` | _Kontext: Weitere Mieter_ |
| `WohnungsgrößeInM` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `MonatlicheWarmmiete` | `String.Latin (Info)` |  |
| `MonatlichenNebenkosten` | `String.Latin (Info)` |  |
| `Gesamtmiete` | `Amount` |  |
| `VereinbartesEnddatum` | `Date` | _Kontext: Ist das Mietverhältnis auf eine bestimmte Zeit begrenzt?_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Modernisierungsmaßnahmen', 'Mietsache nicht nutzbar', 'Mieterhöhung', 'Wunsch nach Veränderung', 'Fehlverhalten des Vermieters', 'Sonstiger Grund' |
| `BeschreibenSieStichpunktartigDieGenauenUmständeDesKündigungsgrundes` | `String.Latin (Info)` |  |
| `Details` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sofort (fristlos)', 'Später', 'In 3 Monaten' |
| `VerfügtDiePersonÜberAusreichendFinanzielleMittel` | `Code (List)` | _Kontext: Nachmieter_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `KautionInEuro` | `Amount` | _Kontext: Haben Sie eine Kaution gezahlt?_ |
| `Kautionsrückzahlung` | `Code (List)` | _Kontext: Haben Sie eine Kaution gezahlt?_<br>**Werte:** 'Nein', 'Ja' |
| `WeitereSicherheiten` | `String.Latin` | _Kontext: Wurden weitere Mietsicherheiten vereinbart?_ |
| `ArtDerAufwendungen` | `String.Latin` | _Kontext: Haben Sie Baumaßnahmen oder Reparaturen an der Mietsache vorgenommen?_ |
| `GesamtkostenDerAufwendungen` | `Amount` | _Kontext: Haben Sie Baumaßnahmen oder Reparaturen an der Mietsache vorgenommen?_ |
| `GrundDerAufwendungen` | `String.Latin` | _Kontext: Haben Sie Baumaßnahmen oder Reparaturen an der Mietsache vorgenommen?_ |
| `GenehmigungDerAufwendungen` | `Code (List)` | _Kontext: Haben Sie Baumaßnahmen oder Reparaturen an der Mietsache vorgenommen?_<br>**Werte:** 'Nein', 'Ja' |
| `BelegeRechnungenSchriftverkehrHochladen` | `FileRef` | _Kontext: Haben Sie Baumaßnahmen oder Reparaturen an der Mietsache vorgenommen?_ |

---

## 25. Mietrecht: Vermieter (Relevanz: 5)

**Klasse:** `MietrechtVermieter`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `AnzahlDerVermieter` | `Integer / String` | _Kontext: Gibt es weitere Vermieter des Mietobjektes?_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nebenmieter', 'Untermieter', 'Hauptmieter' |
| `AbweichendeAdresse` | `String.Latin` | _Kontext: Weicht die Adresse des Mietobjektes von der des Mieters ab?_ |
| `Etage` | `String.Latin` |  |
| `WohnungslageLinksMitteRechts` | `String.Latin` |  |
| `AnzahlDerZimmer` | `Integer / String` |  |
| `WohnungsgrößeInM` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstige Objekte (Grundstück, Gegenstände...)', 'Privater Wohnraum', 'Gewerberaum', 'Gemischt genutzte Räume' |
| `Datumzeitpunkt` | `Date` |  |
| `BeginnDesMietverhältnisses` | `Date` |  |
| `EndeDesMietverhältnisses` | `Date` | _Kontext: Ist das Mietverhältnis zeitlich begrenzt? >  Ist das Mietverhältnis bereits beendet?_ |
| `MietvertragHochladen` | `FileRef` |  |
| `MonatlicheWarmmiete` | `String.Latin (Info)` |  |
| `MonatlichenNebenkosten` | `String.Latin (Info)` |  |
| `Gesamtmiete` | `Amount` |  |
| `Nebenkosten` | `Amount` |  |
| `Datumzeitpunkt` | `Date` |  |
| `MonatsanfangMonatsmitte` | `String.Latin` |  |
| `Kautionshöhe` | `Amount` | _Kontext: Kaution >  Kation >  Wurde eine Kautionszahlung vereinbart?_ |
| `WurdeDieKautionVollständigGezahlt` | `Code (List)` | _Kontext: Wurde eine Kautionszahlung vereinbart?_<br>**Werte:** 'Nein', 'Ja' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Monat` | `Code (List)` | **Werte:** 'Januar', 'Juli', 'Juni', 'Dezember', 'März', 'April', 'Oktober', 'Mai', 'Februar', 'November', 'August', 'September' |
| `HöheDesZahlungsverzugs` | `Amount` |  |
| `DatumDerAufforderung` | `Date` | _Kontext: Zahlungsaufforderung_ |
| `Artumfang` | `Code (List)` | _Kontext: Zahlungsaufforderung_<br>**Werte:** 'Schriftlich', 'Mündlich' |
| `ZahlungsaufforderungHochladen` | `FileRef` | _Kontext: Zahlungsaufforderung_ |
| `DatumDerKündigung` | `Date` | _Kontext: Kündigung >  Widerspruch_ |
| `Zahlungserfüllung` | `Code (List)` | _Kontext: Kündigung >  Zahlungsaufforderung_<br>**Werte:** 'Nein', 'Ja, aber nur teilweise', 'Ja, vollständig' |
| `KündigungHochladen` | `FileRef` | _Kontext: Kündigung_ |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDesGrundbucheintrags` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Kind / Stiefkind / Pflegekind', 'Großeltern', 'Geschwister', 'Eltern / Schwiegereltern', 'Neffe / Nichte', 'Haushaltshilfe/ Pflegepersonal', 'Ehepartner / eingetragene Lebenspartnerschaft', 'Enkel', 'Tante / Onkel', 'Cousine / Cousin' |
| `Artumfang` | `Code (List)` | **Werte:** 'Wunsch nach Veränderung - bessere Lage, Ausstattung...', 'Erhöhter Raumbedarf - Trennung/ Scheidung', 'Erhöhter Raumbedarf - Familienzuwachs', 'Berufliche Gründe - wesentlich näher zum Arbeitsplatz', 'Zusatzzimmer - für Gäste, Arbeitszimmer, Pflegepersonal', 'Hausverwaltung - Einzug zur Verwaltung', 'Gesundheitliche Gründe - barrierefreie Ausstattung...  ', 'Sonstiger Grund' |
| `BeschreibenSieStichpunktartigDieGenauenUmständeBeiSonstigenGründen` | `String.Latin (Info)` |  |
| `Kündigungsgrund` | `String.Latin` |  |
| `WurdeWiderspruchEingelegt` | `Code (List)` | _Kontext: Widerspruch_<br>**Werte:** 'Nein', 'Ja' |
| `KündigungOrWiderspruchHochladen` | `FileRef` |  |
| `HabenSieEineErsatzwohnung` | `Code (List)` | Relevant sind freistehende, oder in nächster Zeit frei werdende (Ersatz-)Wohnung, die im Eigentum des Vermieters stehen.<br>**Werte:** 'Nein', 'Ja' |
| `HabenSieKenntnisObBeiDerMietparteiDieNachfolgendenUmständeVorliegen` | `Code (List)` | **Werte:** 'Schwere Krankheit', 'Schwangerschaft', 'Hohes Alter', 'Gebrechlichkeit', 'Eigene Kinder', 'Keine geeignete Ersatzwohnung', 'Sonstige Härtegründe' |
| `Renovierungsarbeiten` | `String.Latin` | _Kontext: Renovierungspflicht_ |
| `Beräumt` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `WurdeDieKautionBereitsZurückgezahlt` | `Code (List)` | _Kontext: Kaution >  Haben Sie eine Kaution vom Mieter erhalten? >  Kation_<br>**Werte:** 'Nein', 'Ja' |
| `WeitereSicherheiten` | `String.Latin` | _Kontext: Weitere Sicherheiten >  Wurden weitere Mietsicherheiten vereinbart?_ |
| `EinzahlungsOrRückzahlungsbelegHochladen` | `FileRef` | _Kontext: Haben Sie eine Kaution vom Mieter erhalten?_ |
| `BestandDerMangelBereitsBeimEinzug` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `WoBefindetSichDerMangel` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Mangelart` | `String.Latin` |  |
| `BilderHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `KenntnisVomMangel` | `Date` |  |
| `Mangelanzeige` | `Date` | _Kontext: Mangelanzeige_ |
| `Artumfang` | `Code (List)` | _Kontext: Mangelanzeige_<br>**Werte:** 'Schriftlich', 'Mündlich' |
| `MangelanzeigeHochladen` | `FileRef` | _Kontext: Mangelanzeige_ |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Unbekannt', 'Mieter / Gäste', 'Vermieter', 'Hausverwaltung / Hausmeister' |
| `Beseitigung` | `Code (List)` | _Kontext: Wurde der Mangel inzwischen beseitigt?_<br>**Werte:** 'Durch den Mieter oder ein von ihm beauftragtes Unternehmen', 'Durch mich oder ein von mir beauftragtes Unternehmen ' |
| `Mangelbeseitigung` | `Date` | _Kontext: Wurde der Mangel inzwischen beseitigt?_ |
| `BeschreibenSieDieSituationStichpunktartigBspWasserrohrbruch` | `String.Latin (Info)` | _Kontext: Notsituation_ |
| `SituationDerMangelbeseitigung` | `String.Latin` | _Kontext: Notsituation_ |
| `Kostengläubiger` | `Amount (Currency)` | _Kontext: Kosten zulasten_<br>**Optionen:** 'Keine Angabe', 'Vermieter', 'Mietpartei' |
| `WofürSindKostenEntstanden` | `Amount (Currency)` | _Kontext: Kosten zulasten_ |
| `Kostenposten` | `Amount (Currency)` | _Kontext: Kosten zulasten_ |
| `Gesamtkosten` | `Amount` | _Kontext: Kosten zulasten_ |
| `RechnungHochladen` | `FileRef` | _Kontext: Kosten zulasten_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Ersatzkosten des Mieters abwehren', 'Zahlung der Miete', 'Kündigung des Mietverhältnisses', 'Ersatz eigener Kosten' |
| `FehlverhaltenDesMieters` | `Code (List)` | **Werte:** 'Sonstige Gründe', 'Übermäßige Tierhaltung', 'Ungenehmigte Untervermietung', 'Falschangaben bei Vertragsschluss', 'Störung des Hausfriedens', 'Mehrfach unpünktliche Mietzahlung', 'Drogenhandel/ Drogenanbau', 'Beleidigung/ Belästigung' |
| `Datumzeitpunkt` | `Date` |  |
| `Datumzeitpunkt` | `Date` |  |
| `BeschreibenSieStichpunktartigDieSituation` | `String.Latin (Info)` |  |
| `Situation` | `String.Latin` |  |
| `WiederholtesVerhalten` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `BildbeweiseOÄHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Zahlungsverzug', 'Veräußerung des Mietobjektes', 'Ungenehmigte Untervermietung', 'Mietsicherheiten nicht geleistet', 'Eigenbedarf', 'Fehlverhalten des Mieters', 'Mieter verstorben', 'Sonstiger Grund' |
| `BeschreibenSieStichpunktartigDieGenauenUmständeDesKündigungsgrundes` | `String.Latin (Info)` |  |
| `Details` | `String.Latin` |  |
| `GewünschterKündigungszeitpunkt` | `Code (List)` | **Werte:** 'Sofort (fristlos)', 'Weiß ich nicht', 'Später', 'In 3 Monaten' |
| `DatumDerAbmahnung` | `Date` | _Kontext: Haben Sie den Mieter abgemahnt?_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nebenmieter', 'Untermieter', 'Hauptmieter' |
| `Kündigungsdatum` | `Date` | _Kontext: Kündigung_ |
| `FormDerKündigung` | `Code (List)` | _Kontext: Kündigung_<br>**Werte:** 'Schriftlich', 'Mündlich' |
| `WurdeDerKündigungWidersprochen` | `Code (List)` | _Kontext: Kündigung_<br>**Werte:** 'Nein', 'Ja' |
| `KündigungWiderspruchGerichtsurteilOÄHochladen` | `FileRef` |  |
| `GegenständeDesMieters` | `String.Latin` | _Kontext: Gegenstände des Mieters_ |
| `Anzahl` | `Integer / String` | _Kontext: Schlüssel beim Mieters_ |
| `ArtDesSchlüssels` | `String.Latin` | _Kontext: Schlüssel beim Mieters_ |
| `Härtegründe` | `Code (List)` | **Werte:** 'Schwere Krankheit', 'Schwangerschaft', 'Hohes Alter', 'Gebrechlichkeit', 'Eigene Kinder', 'Keine geeignete Ersatzwohnung', 'Sonstige Härtegründe' |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `BeginnDesMietverhältnisses` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Zahlungsziel` | `String.Latin` |  |
| `Enddatum` | `Date` | _Kontext: Ist das Mietverhältnis bereits beendet?_ |
| `KautionInEuro` | `Amount` | _Kontext: Haben Sie eine Kaution vom Mieter erhalten?_ |
| `BegründungDesMieters` | `String.Latin` | _Kontext: Begründung Mieter_ |
| `EigeneAnmerkung` | `String.Latin` |  |

---

## 26. Sozialrecht (Relevanz: 3)

**Klasse:** `Sozialrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Datumzeitpunkt` | `Date` |  |
| `DatumDesAntrages` | `Date` | _Kontext: Antrag_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `AntragAufLeistungEn` | `String.Latin` |  |
| `AntragHochladen` | `FileRef` |  |
| `BeschreibungSituation` | `String.Latin` | _Kontext: Eilbedürftigkeit_ |
| `Artumfang` | `String.Latin (Info)` |  |
| `Anspruchsbegründung` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Zustellungsdatum` | `Date` |  |
| `Grundanlass` | `String.Latin (Info)` |  |
| `BegründungDerAblehnung` | `String.Latin` |  |
| `BescheidKorrespondenzOÄHochladen` | `FileRef` |  |
| `IhrFamilienstand` | `Code (List)` | **Werte:** 'Ledig', 'Verheiratet', 'Geschieden', 'Verwitwet' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Erkrankungen_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Erkrankungen_ |
| `ErkrankungUndHilfsmittel` | `String.Latin` | _Kontext: Erkrankungen_ |
| `Beteiligteperson` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Erkrankungen_ |
| `PersönlicheAngaben` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Erkrankungen_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Arbeitslosengeld', 'Unterhalt', 'Wohngeld', 'Bürgergeld', 'Ausbildung / Arbeit', 'Weiß ich nicht', 'Sonstiger Art', 'Grundsicherung' |
| `WieHochIstDieseEinnahmeMonatlich` | `String.Latin (Info)` |  |
| `HöheDerEinnahme` | `Amount` |  |
| `BelegeSozialversicherungsausweisOÄHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Unterhalt', 'Kosten für Hilfsmittel', 'Kosten für Kinder', 'Kosten für Medikamente', 'Mietzahlung', 'Kosten für Kleidung', 'Weiß ich nicht', 'Kosten für Tiere', 'Sonstige Ausgabe' |
| `WieHochIstDieseAusgabe` | `String.Latin (Info)` |  |
| `HöheDerAusgabe` | `Amount` |  |
| `Erwerbsfähigkeit` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Pflegestufe` | `String.Latin` | _Kontext: Pflegebedürftigkeit_ |
| `EintrittDerPflegebedürftigkeit` | `Date` | _Kontext: Pflegebedürftigkeit_ |
| `StationäreUnterbringung` | `Code (List)` | _Kontext: Pflegebedürftigkeit_<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `ErlernterBeruf` | `String.Latin` | _Kontext: Berufsausbildung o.ä._ |
| `ListenSieBitteIhreBerufeOrBeschäftigungenDerLetzten5JahreAuf` | `String.Latin (Info)` | _Kontext: Berufe der letzten 5 Jahre_ |
| `NachweiseGutachtenOÄHochladen` | `FileRef` | _Kontext: Pflegebedürftigkeit_ |
| `WurdeÜberDenAntragEntschieden` | `Code (List)` | _Kontext: Antrag_<br>**Werte:** 'Antrag bewilligt', 'Weiß ich nicht', 'Antrag unvollständig bewilligt', 'Noch keine Entscheidung', 'Antrag abgelehnt' |
| `AntragEntscheidungHochladen` | `FileRef` | _Kontext: Antrag_ |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Erkrankungen_ |
| `WieIstDerAktuellePflegegrad` | `String.Latin (Info)` |  |
| `AktuellerPflegegrad` | `Code (List)` | **Werte:** '1', '3', '4', 'Weiß ich nicht', '0', '5', '2' |
| `Datumzeitpunkt` | `Date` | **Optionen:** 'Weiß ich nicht', 'Vor weniger als 6 Monaten', 'Vor mehr als 6 Monaten' |
| `BewilligungHochladen` | `FileRef` |  |
| `BeschreibenSieBitteKurzDieBeeinträchtigungenUndDenVerlaufDerVerschlechterung` | `String.Latin (Info)` |  |
| `Leiden` | `String.Latin` |  |
| `PflegegutachtenHochladen` | `FileRef` | _Kontext: Pflegegutachten_ |
| `PflegeversichertennummerDerPflegebedürftigenPerson` | `String.Latin (Info)` |  |
| `Versichertennummer` | `String.Latin` |  |
| `DatumIhresAntrages` | `Date` | _Kontext: Neuer Antrag_ |
| `Bescheidung` | `Code (List)` | _Kontext: Neuer Antrag_<br>**Werte:** 'Weiß ich nicht', 'Keine Entscheidung', 'Teilweise / vollständige Ablehnung' |
| `AntragOrBescheidOÄHochladen` | `FileRef` | _Kontext: Neuer Antrag_ |

---

## 27. Steuerrecht (Relevanz: 3)

**Klasse:** `Steuerrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `IhreSteuernummer` | `String.Latin (Info)` |  |
| `ZuständigesFinanzamt` | `String.Latin (Info)` |  |
| `DieseFindenSieInDerRegelGanzObenAufDemSteuerbescheid` | `String.Latin (Info)` |  |
| `DasFürSieZuständigeFinanzamtFindenSieBspwHierHttpsOrorwwwBzstDeordeorserviceorbehoerdenwegweiserorfinanzamtsucheorgemfaorfinanzamtsucheNodeHtml` | `String.Latin (Info)` |  |
| `Steuernr` | `String.Latin` |  |
| `Finanzamt` | `String.Latin` |  |
| `IhreSteuerklasse` | `String.Latin (Info)` |  |
| `IhreSteuerklasseFindenSieBspwHierHttpsOrorwwwSteuertippsDeorfinanzamtformalitaetenorsteuerklassenorthemenSrsltidAfmboorf3h1wmoKqpis6mot8zscs6cvpkix0bg3fxktwz6znayvsf` | `String.Latin (Info)` |  |
| `IhreSteuerklasse` | `Code (List)` | **Werte:** 'Steuerklasse V', 'Steuerklasse I', 'Steuerklasse III', 'Steuerklasse IV', 'Steuerklasse II', 'Steuerklasse VI' |
| `Beruf` | `String.Latin` | _Kontext: Üben Sie einen Beruf aus?_ |
| `LetzteBekannteAnschrift` | `String.Latin` |  |
| `SteuernummerDesVerstorbenen` | `String.Latin (Info)` |  |
| `DieseFindenSieInDerRegelGanzObenAufDemSteuerbescheid` | `String.Latin (Info)` |  |
| `DasZuständigeFinanzamtFindenSieBspwHierHttpsOrorwwwBzstDeordeorserviceorbehoerdenwegweiserorfinanzamtsucheorgemfaorfinanzamtsucheNodeHtml` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Sterbedatum` | `Date` |  |
| `KenntnisVomVersterben` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Vermächtnisnehmer / Beschenkter', 'Nicht eheliche Lebensgemeinschaft', 'Verschwägert', 'Freundschaft / Bekannte', 'Kind', 'Geschwister', 'Elternteil', 'Sonstige Beziehung', 'Cousine / Cousin', 'Ehepartner' |
| `UmWasFürVerbindlichkeitenHandeltEsSich` | `String.Latin (Info)` | _Kontext: Sind Ihnen Verträge oder Schulden des Verstorbenen bekannt?_ |
| `Beteiligteperson` | `String.Latin (Info)` | _Kontext: Sind Ihnen Verträge oder Schulden des Verstorbenen bekannt?_ |
| `Verbindlichkeiten` | `String.Latin` | _Kontext: Sind Ihnen Verträge oder Schulden des Verstorbenen bekannt?_ |
| `HöheDerVerbindlichkeitenGesamt` | `Amount` | _Kontext: Sind Ihnen Verträge oder Schulden des Verstorbenen bekannt?_ |
| `WennIhnenDokumenteZumErbfallVorliegenLadenSieDieseBitteHoch` | `String.Latin (Info)` |  |
| `BspwErbscheinTestamentSchenkungsvertragSterbeurkundeOÄ` | `String.Latin (Info)` |  |
| `DokumenteHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Bebautes / unbebautes Grundstück', 'Anteile aus Kapitalgesellschaft', 'Betriebsvermögen', 'Bank- / Sparguthaben', 'Anderes', 'Anspruch aus Pflichtteil', 'Weiß ich nicht', 'Bausparguthaben', 'Wertpapiere', 'Bargeld', 'Land- / Forstwirtschaft', 'Ansprüche aus Versicherung' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Beteiligteperson` | `Amount` |  |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `Details` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | _Kontext: Partner_<br>**Werte:** 'Getrennt', 'Keine Angabe', 'Ehe', 'Sonstige Beziehung', 'Geschieden', 'Lebensgemeinschaft' |
| `Vermögensverhältnisse` | `Code (List)` | _Kontext: Partner_<br>**Werte:** 'Anteilige Kostentragung', 'Keine Angabe', 'Eheliche Gütergemeinschaft', 'Eheliche Gütertrennung', 'Sonstige Regelung', 'Eheliche Zugewinngemeinschaft' |
| `Artumfang` | `Code (List)` | **Werte:** 'Kapitalvermögen', 'Keine Einnahmen', 'Nichtselbstständige Arbeit', 'Weiß ich nicht', 'Weitere Einnahmen', 'Land- / Forstwirtschaft', 'Selbstständige Arbeit', 'Vermietung / Verpachtung' |
| `Artumfang` | `String.Latin (Info)` |  |
| `HöheProJahrInNetto` | `Amount` |  |
| `Einnahme` | `Code (List)` | **Werte:** 'Meine Einnahme', 'Einnahme meines Partners' |
| `BelegHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Dienstliche Bewirtungskosten', 'Reisekosten', 'Einrichtung  Zweitwohnung', 'Entfernungspauschale', 'Weiß ich nicht', 'Mitgliedschaftsbeitrag', 'Freibeträge', 'Arbeitsmittel', 'Unfallkosten', 'Dienstlicher Umzug', 'Kirchensteuer', 'Werbungskosten' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Ausgabe` | `Amount` |  |
| `Ausgabe` | `Code (List)` | **Werte:** 'Meine Einnahme', 'Einnahme meines Partners' |
| `Datumzeitpunkt` | `Date` |  |
| `Finanzamt` | `String.Latin (Info)` |  |
| `Zustellungsdatum` | `Date` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Abrechnungsjahr` | `String.Latin` |  |
| `SteuerbescheidHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Fehler` | `Code (List)` | **Werte:** 'Keine Berechnungsgrundlage', 'Rechenfehler', 'Weiß ich nicht', 'Andere Steuerklasse', 'Keine Erklärung zur Abrechnung', 'Tippfehler' |
| `Fehler` | `Code (List)` | **Werte:** 'Lohnsteuer', 'Einkommenssteuer', 'Kirchensteuer', 'Steuervorauszahlung' |
| `Fehler` | `Code (List)` | **Werte:** 'Arbeitszimmerkosten', 'Bewirtungskosten', 'Andere Einkünfte', 'Kosten aus Erststudium', 'Entfernungspauschale', 'Umzug / Zweitwohnung', 'Mitgliedschaftsbeitrag', 'Freibeträge', 'Werbungskosten', 'Arbeitsmittelkosten' |
| `EigeneAnmerkungen` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` |  |
| `SteuernummerDerPerson` | `String.Latin (Info)` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDerSchenkung` | `Date` |  |
| `GebenSieStichpunktartigDenGrundOrAnlassDerSchenkungAn` | `String.Latin (Info)` |  |
| `Grund` | `String.Latin` |  |
| `Gegenleistung` | `String.Latin` | _Kontext: Mussten Sie für die Schenkung eine Gegenleistung erbringen?_ |
| `Beteiligteperson` | `FileRef` |  |

---

## 28. Verkehrsrecht: Fahrerlaubnis (Relevanz: 5)

**Klasse:** `VerkehrsrechtFahrerlaubnis`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `IhreAktuellenPunkteInFlensburg` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `PunkteInFlensburg` | `String.Latin` | _Kontext: Fahrerlaubnis_ |
| `ZulassungZuFahrzeugklasseN` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `FahrzeugklasseN` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'B', 'A2', 'A', 'Sonstige', 'C', 'A1', 'BE', 'D' |
| `FührerscheinHochladen` | `FileRef` | _Kontext: Fahrerlaubnis_ |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDesVerstoßes` | `Date` |  |
| `Vorwurf` | `Code (List)` | **Werte:** 'Geschwindigkeitsverstoß', 'Verstoß in der Probezeit', 'Alkohol- / Drogenverstoß', 'Straftat', 'Alkohol / Drogen im Verkehr', 'Alkohol- / Drogenmissbrauch', 'Andere Person ohne Fahrerlaubnis fahren lassen', 'Führerschien in Deutschland unzulässig', 'Abgelaufene / entzogene Fahrerlaubnis', 'Abgelaufener / entzogener Führerschein', 'Fahren trotz Fahrverbotes', 'Fehlende körperliche / geistige Eignung', 'Sonstiges', 'Handy am Steuer', 'Fehlende Fahrerlaubnis für Fahrzeugart', 'Zweifel an körperlicher Eignung', 'Nie gültige Fahrerlaubnis gehabt', 'Führerschein in Verkehrskontrolle vergessen', 'Wiederholter Verkehrsverstoß', 'Weiß ich nicht', '8 Punkte oder mehr in Flensburg', 'Zweifel an psychischer Eignung', 'Verurteilte Straftat', 'Rotlichtverstoß' |
| `AngabeZumVorwurf` | `String.Latin (Info)` | _Kontext: Weiterer Verstoß_ |
| `WeitererVorwurf` | `String.Latin` | _Kontext: Weiterer Verstoß_ |
| `DatumDerZustellung` | `Date` | _Kontext: Bescheid erhalten_ |
| `EinspruchEingelegt` | `Code (List)` | _Kontext: Bescheid erhalten_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `LadenSieBitteSämtlicheUnterlagenZuDemVorfallHoch` | `FileRef` | _Kontext: Bescheid erhalten_ |
| `Grundanlass` | `String.Latin (Info)` |  |
| `Begründung` | `String.Latin` |  |
| `FührerscheinErforderlich` | `Code (List)` | **Werte:** 'Privat', 'Beruflich', 'Weiß ich nicht' |
| `AktuellerStatus` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'Gültige Fahrerlaubnis', 'Führerschein abgelaufen', 'Führerschein eingezogen', 'Fahrerlaubnis entzogen', 'Fahrerlaubnis abgelaufen' |
| `Vorwurf` | `String.Latin` | _Kontext: Weiterer Verstoß innerhalb 12 Monaten_ |
| `BescheidOrSchreibenOrEinspruchHochladen` | `FileRef` | Laden Sie bitte sämtliche Unterlagen zu dem Vorfall hoch |
| `Grundanlass` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` | _Kontext: Eigene Anmerkungen_ |
| `Artumfang` | `Code (List)` | **Werte:** 'E-Scooter', 'Lkw', 'Sonstige', 'Fahrrad', 'Moped/ Motorrad', 'Pkw' |
| `Fahrzeugkennzeichen` | `String.Latin (Info)` |  |
| `Fahrzeugkennzeichen` | `String.Latin` |  |
| `Eigentumsverhältnisse` | `Code (List)` | **Werte:** 'Fahrzeug geleast', 'Weiß ich nicht', 'Eigenes Fahrzeug', 'Fahrzeug gemietet/ geliehen' |
| `FührerscheinErforderlich` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'Privat', 'Beruflich', 'Weiß ich nicht' |
| `BeschreibungDesVorwurfes` | `String.Latin` |  |
| `AngabeZurVerletzungOrSchaden` | `String.Latin (Info)` | _Kontext: Mit Gefährdung_ |
| `Schadensumfang` | `String.Latin` | _Kontext: Mit Gefährdung_ |
| `WieLangeWirdDasFahrverbotAngeordnet` | `String.Latin (Info)` |  |
| `DauerDesFahrverbotes` | `String.Latin` |  |
| `Grundanlass` | `String.Latin (Info)` |  |
| `VorherigesFahrverbot` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |

---

## 29. Verkehrsrecht: Fahrzeug (Relevanz: 5)

**Klasse:** `VerkehrsrechtFahrzeug`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `IhreAktuellenPunkteInFlensburg` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `PunkteInFlensburg` | `String.Latin` | _Kontext: Fahrerlaubnis_ |
| `ZulassungZuFahrzeugklasseN` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `FahrzeugklasseN` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'B', 'A2', 'A', 'Sonstige', 'C', 'A1', 'BE', 'D' |
| `FührerscheinErforderlich` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'Privat', 'Beruflich', 'Weiß ich nicht' |
| `FührerscheinHochladen` | `FileRef` | _Kontext: Fahrerlaubnis_ |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDesVerstoßes` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Fahrzeugkennzeichen', 'Lackierung', 'Blitzerapp', 'Schalldämpfer / Auspuff', 'Zusatzteile', 'Sonstiges', 'Leuchtmittel', 'Fahrwerk', 'Innenausstattung', 'Felgen / Reifen', 'Fahrzeugspiegel' |
| `BeschreibungDesVorwurfes` | `String.Latin` |  |
| `AngabeZurVerletzungOrSchaden` | `String.Latin (Info)` | _Kontext: Mit Gefährdung_ |
| `Schadensumfang` | `String.Latin` | _Kontext: Mit Gefährdung_ |
| `BetriebserlaubnisTeilegutachtenAbnahmenachweisOÖHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'E-Scooter', '(E-)Fahrrad', 'Lkw', 'Sonstige', 'E-Fahrrad', 'Moped / Motorrad', 'Moped/ Motorrad', 'Wohnmobil', '(E)-Fahrrad', 'Pkw' |
| `Fahrzeugkennzeichen` | `String.Latin (Info)` |  |
| `Modell` | `String.Latin (Info)` |  |
| `Fahrzeugkennzeichen` | `String.Latin` |  |
| `Modell` | `String.Latin` |  |
| `Eigentumsverhältnisse` | `Code (List)` | **Werte:** 'Fahrzeug geleast', 'Weiß ich nicht', 'Eigenes Fahrzeug', 'Fahrzeug gemietet/ geliehen' |
| `Artumfang` | `Code (List)` | **Werte:** 'Bußgeld', 'Punkte in Flensburg', 'Weiß ich nicht', 'Weitere', 'Stilllegung' |
| `GebenSieBitteDieHöheOrDauerDerFolgeAn` | `String.Latin (Info)` |  |
| `HöheOrAnzahlOrDauer` | `Integer / String` |  |
| `DatumDerZustellung` | `Date` | _Kontext: Bescheid erhalten_ |
| `Artumfang` | `Code (List)` | _Kontext: Bescheid erhalten_<br>**Werte:** 'Lärm', 'Keine Begründung', 'Blendung', 'Zulässige Maximalgeschwindigkeit', 'Sonstige', 'Umweltgefährdung', 'Verkehrsgefährdung' |
| `EinspruchEingelegt` | `Code (List)` | _Kontext: Bescheid erhalten_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `BescheidOrSchreibenOrEinspruchHochladen` | `FileRef` | Laden Sie bitte sämtliche Unterlagen zu dem Vorfall hoch<br>_Kontext: Bescheid erhalten_ |
| `Grundanlass` | `String.Latin (Info)` |  |
| `Begründung` | `String.Latin` |  |
| `FührerscheinErforderlich` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'Privat', 'Beruflich', 'Weiß ich nicht' |
| `Artumfang` | `Code (List)` | **Werte:** 'Betriebserlaubnis nach Verschlechterung erloschen', 'Nie Betriebserlaubnis gehabt', 'Betriebserlaubnis bei Kontrolle nicht mitgeführt', 'Sonstiges', 'Betriebserlaubnis nach Umbau erloschen' |
| `BeschreibungDesVerstoßes` | `String.Latin` |  |
| `WurdeDasFahrzeugNochGefahren` | `Code (List)` | _Kontext: Im öffentlichen Straßenraum_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `WurdeDasFahrzeugAbgeschleppt` | `Code (List)` | _Kontext: Im öffentlichen Straßenraum_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Vorwurf` | `String.Latin` | _Kontext: Weiterer Verstoß innerhalb 12 Monaten_ |
| `IhreBisherigenPunkteInFlensburg` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `HuGültigBis` | `String.Latin (Info)` |  |
| `AblaufdatumTüvMonatorjahr` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Klingel / Hupe', 'Führerschein', 'Zulassungsbescheinigung Teil I', 'Sonstiges', 'Leuchtmittel', 'Helm', 'Warnweste', 'Warndreieck', 'Verbandskasten' |
| `Beschreibung` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Fahrzeugausstattung', 'Sonstiges', 'Karosserie', 'Reifen / Räder', 'Leuchtmittel', 'Fehlende Betriebserlaubnis', 'Motor / Fahrwerk', 'Fehlender TÜV' |
| `BeschreibungDesMangels` | `String.Latin` |  |

---

## 30. Verkehrsrecht: Ordnungswidrigkeiten (Relevanz: 5)

**Klasse:** `VerkehrsrechtOrdnungswidrigkeiten`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `WasWirdIhnenVorgeworfen` | `String.Latin (Info)` |  |
| `Vorwurf` | `Code (List)` | **Werte:** 'Parken im Halteverbot', 'Parken auf Behindertenparkplatz', 'Parken im Parkverbot', 'Parken auf Privatparkplatz', 'Sonstiges', 'Parken im Gefahrenbereich', 'Weiß ich nicht', 'Parkdauer überschritten', 'Parken auf Carsharing- / E-Parkplatz', 'Parken in 2. Reihe', 'Parken auf Fahrrad-/ Fußgängerweg' |
| `AngabeZurVerletzungOrSchaden` | `String.Latin (Info)` | _Kontext: Mit Gefährdung_ |
| `Schadensumfang` | `String.Latin` | _Kontext: Mit Gefährdung_ |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDerFeststellung` | `Date` |  |
| `UhrzeitDerFeststellung` | `Date` |  |
| `RechnungBelegKostennachweisHochladen` | `Amount (Currency)` | _Kontext: Abgeschleppt_ |
| `Artumfang` | `Code (List)` | **Werte:** 'E-Scooter', 'Moped / Motorrad', 'Sonstige', 'Lkw', 'Fahrrad', 'Pkw' |
| `Fahrzeugkennzeichen` | `String.Latin (Info)` |  |
| `Fahrzeugkennzeichen` | `String.Latin` |  |
| `Eigentumsverhältnisse` | `Code (List)` | **Werte:** 'Fahrzeug geleast', 'Weiß ich nicht', 'Eigenes Fahrzeug', 'Fahrzeug gemietet/ geliehen' |
| `GebenSieBitteDieHöheDesBußgeldesAn` | `String.Latin (Info)` |  |
| `HöheIn` | `Amount` |  |
| `DatumDerZustellung` | `Date` | _Kontext: Bescheid erhalten_ |
| `EinspruchEingelegt` | `Code (List)` | _Kontext: Bescheid erhalten_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `BescheidOrSchreibenOrEinspruchHochladen` | `FileRef` | Laden Sie bitte sämtliche Unterlagen zu dem Vorfall hoch<br>_Kontext: Bescheid erhalten_ |
| `Grundanlass` | `String.Latin (Info)` |  |
| `Begründung` | `String.Latin` |  |
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `IhreAktuellenPunkteInFlensburg` | `String.Latin (Info)` | _Kontext: Punkte >  Fahrerlaubnis_ |
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `PunkteInFlensburg` | `String.Latin` | _Kontext: Punkte >  Fahrerlaubnis_ |
| `ZulassungZuFahrzeugklasseN` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `FahrzeugklasseN` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'B', 'A2', 'A', 'Sonstige', 'C', 'A1', 'BE', 'D' |
| `FührerscheinErforderlich` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'Privat', 'Beruflich', 'Weiß ich nicht' |
| `FührerscheinHochladen` | `FileRef` | _Kontext: Fahrerlaubnis_ |
| `Vorwurf` | `Code (List)` | Abstand zum vorausfahrenden Fahrzeug weniger als...<br>**Werte:** '3/10 des Tachowertes', 'Zu hohe wöchentliche Lenkzeit ', '1/10 des Tachowertes', '2/10 des Tachowertes', '4/10 des Tachowertes', 'Zu geringe Pausenzeit', 'Zu geringe tägliche Ruhezeit ', 'Handy in der Hand oder am Ohr', 'Sonstiges', 'Telefonieren ohne Freisprechanlage', 'Weiß ich nicht', 'Blitzer-App benutzt', 'Zu geringe wöchentliche Ruhezeit ', 'Fahrt am Sonntag / Feiertag', 'Zu hohe tägliche Lenkzeit ', '5/10 des Tachowertes', 'Fahrzeugscreen bedient' |
| `Geschwindigkeit` | `Code (List)` | **Werte:** 'Unter 80 km/h', '101 - 130 km/h', 'Über 131 km/h', 'Weiß ich nicht', '81 - 100 km/h' |
| `DatumDesVerstoßes` | `Date` |  |
| `Feststellungsmittel` | `Code (List)` | **Werte:** 'Feste Verkehrsüberwachung', 'Mobile Verkehrsüberwachung', 'Verkehrskontrolle', 'Blitzer', 'Sonstiges', 'Weiß ich nicht', 'Mobiler Blitzer', 'Fester Blitzer', 'Ampelblitzer' |
| `Vorwurf` | `String.Latin` | _Kontext: Weiterer Verstoß innerhalb 12 Monaten_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Bußgeld', 'Punkte in Flensburg', 'Weiß ich nicht', 'Weitere', 'Fahrtenbuch', 'Haftstrafe', 'Probezeitverlängerung/ Aufbauseminar', 'Fahrverbot' |
| `GebenSieBitteDieHöheOrDauerDerFolgeAn` | `String.Latin (Info)` |  |
| `HöheOrAnzahlOrDauer` | `Integer / String` |  |
| `ArtDesFahrzeugs` | `String.Latin (Info)` |  |
| `Hersteller` | `String.Latin` |  |
| `Modell` | `String.Latin` |  |
| `ZulässigesGesamtgewicht` | `Code (List)` | **Werte:** '2,8 - 3,5 Tonnen', 'Über 3,5 - 7,5 Tonnen', 'Über 7,5 Tonnen' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Fahrzweck` | `Code (List)` | **Werte:** 'Personenbeförderung', 'Anderer Zweck', 'Gütertransporte', 'Weiß ich nicht' |
| `WieLangeWurdeDieZeitÜberschritten` | `String.Latin (Info)` |  |
| `Zeitverstoß` | `String.Latin` |  |
| `GebenSieBitteAuchAnWennBesondereUmständeVorlagenAusDenenSieDieVorgabenNichtEinhaltenKonnten` | `String.Latin (Info)` |  |
| `WeitereFolgen` | `String.Latin` |  |
| `GeschwindigkeitNachToleranzabzug` | `String.Latin (Info)` |  |
| `ZulässigeGeschwindigkeit` | `String.Latin (Info)` |  |
| `GemesseneGeschwindigkeitInKmorh` | `String.Latin` |  |
| `ZulässigeGeschwindigkeitInKmorh` | `String.Latin` | _Kontext: Zusätzlich Geschwindigkeitsverstoß_ |
| `Vorwurf` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Innerorts', 'Außerorts' |
| `BeschreibungDesVorwurfes` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `Vorwurf` | `Code (List)` | **Werte:** 'Zu hohe wöchentliche Lenkzeit ', 'Zu geringe Pausenzeit', 'Zu geringe tägliche Ruhezeit ', 'Sonstiges', 'Weiß ich nicht', 'Zu geringe wöchentliche Ruhezeit ', 'Fahrt am Sonntag / Feiertag', 'Zu hohe tägliche Lenkzeit ' |
| `Vorwurf` | `Code (List)` | **Werte:** 'Erst gelbe Ampel', 'Weiß ich nicht', 'Über eine Sekunde', 'Weniger als 1 Sekunde' |
| `GeschwindigkeitInKmorhNachToleranzabzug` | `String.Latin` | _Kontext: Zusätzlich Geschwindigkeitsverstoß_ |

---

## 31. Verkehrsrecht: Strafrecht (Relevanz: 5)

**Klasse:** `VerkehrsrechtStrafrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `IhreAktuellenPunkteInFlensburg` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `DatumDerFahrerlaubnis` | `Date` | _Kontext: Fahrerlaubnis_ |
| `PunkteInFlensburg` | `String.Latin` | _Kontext: Fahrerlaubnis_ |
| `ZulassungZuFahrzeugklasseN` | `String.Latin (Info)` | _Kontext: Fahrerlaubnis_ |
| `FahrzeugklasseN` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'B', 'A2', 'A', 'Sonstige', 'C', 'A1', 'BE', 'D' |
| `FührerscheinErforderlich` | `Code (List)` | _Kontext: Fahrerlaubnis_<br>**Werte:** 'Privat', 'Beruflich', 'Weiß ich nicht' |
| `FührerscheinHochladen` | `FileRef` | _Kontext: Fahrerlaubnis_ |
| `GemesseneAlkoholkonzentration` | `String.Latin (Info)` |  |
| `Beteiligteperson` | `String.Latin` |  |
| `Grundanlass` | `String.Latin (Info)` |  |
| `Begründung` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDesVerstoßes` | `Date` |  |
| `Feststellungsmittel` | `Code (List)` | **Werte:** 'Verkehrskontrolle', 'Blitzer', 'Blutentnahme', 'Weiß ich nicht', 'Atemalkoholtest' |
| `AngabeZurVerletzungOrSchaden` | `String.Latin (Info)` | _Kontext: Mit Gefährdung_ |
| `Schadensumfang` | `String.Latin` | _Kontext: Mit Gefährdung_ |
| `Vorwurf` | `String.Latin` | _Kontext: Vorheriger Drogenverstoß >  Weiterer Verstoß innerhalb 12 Monaten_ |
| `Artumfang` | `Code (List)` | **Werte:** 'E-Scooter', 'Moped / Motorrad', 'Sonstige', 'Lkw', 'Fahrrad', 'Pkw' |
| `Fahrzeugkennzeichen` | `String.Latin (Info)` |  |
| `Fahrzeugkennzeichen` | `String.Latin` |  |
| `Eigentumsverhältnisse` | `Code (List)` | **Werte:** 'Fahrzeug geleast', 'Weiß ich nicht', 'Eigenes Fahrzeug', 'Fahrzeug gemietet/ geliehen' |
| `Artumfang` | `Code (List)` | **Werte:** 'Bußgeld', 'Entzug der Fahrerlaubnis', 'Punkte in Flensburg', 'MPU', 'Weiß ich nicht', 'Weitere', 'Haftstrafe', 'Probezeitverlängerung/ Aufbauseminar', 'Fahrverbot' |
| `GebenSieBitteDieHöheOrDauerDerFolgeAn` | `String.Latin (Info)` |  |
| `HöheOrAnzahlOrDauer` | `Integer / String` |  |
| `DatumDerZustellung` | `Date` | _Kontext: Bescheid erhalten_ |
| `EinspruchEingelegt` | `Code (List)` | _Kontext: Bescheid erhalten_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `BescheidOrSchreibenOrEinspruchHochladen` | `FileRef` | Laden Sie bitte sämtliche Unterlagen zu dem Vorfall hoch<br>_Kontext: Bescheid erhalten_ |
| `WasWirdIhnenVorgeworfen` | `String.Latin (Info)` |  |
| `Beteiligteperson` | `String.Latin (Info)` |  |
| `ArtDerDrogeN` | `String.Latin` |  |
| `Beteiligteperson` | `String.Latin` |  |
| `BeschreibungDesVorwurfes` | `String.Latin` |  |

---

## 32. Verkehrsrecht: Unfall (Relevanz: 5)

**Klasse:** `VerkehrsrechtUnfall`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Rolle` | `Code (List)` | **Werte:** 'Zu Fuß', 'Sonstiges', 'Kfz', 'Fahrrad' |
| `AlkoholOderDrogeneinfluss` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Rolle` | `Code (List)` | **Werte:** 'Kfz', 'Sonstiges', 'Fahrrad', 'Weiß ich nicht', 'Zu Fuß' |
| `AlkoholOderDrogeneinfluss` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Artumfang` | `String.Latin` |  |
| `Rolle` | `Code (List)` | Häufig ist die Person, der das Fahrzeug gehört sowohl Halter, als auch Eigentümer<br>**Werte:** 'Fahrer / Fahrerin', 'Weiß ich nicht', 'Eigentümer / Eigentümerin', 'Fahrzeughalter / Fahrzeughalterin' |
| `Artumfang` | `Code (List)` | **Werte:** 'Andere', 'Roller', 'PKW', 'Fahrrad', 'LKW', 'Motorrad' |
| `Fahrzeugangaben` | `String.Latin (Info)` |  |
| `TragenSieBitteAlleInformationenEinDieSieÜberDasFahrzeugHaben` | `String.Latin (Info)` |  |
| `Hersteller` | `String.Latin` |  |
| `Modell` | `String.Latin` |  |
| `Kennzeichen` | `String.Latin` |  |
| `Fahrzeugbeschreibung` | `String.Latin (Info)` |  |
| `WennSieWeitereMerkmaleZBFarbeOderBaulicheMerkmaleKennenKönnenSieHierDasFahrzeugStichpunktartigBeschreiben` | `String.Latin (Info)` |  |
| `BeschreibungDesFahzeugs` | `String.Latin` |  |
| `WasWurdeBeschädigt` | `String.Latin (Info)` | _Kontext: Fahrzeugschaden_ |
| `WoIstDerSchaden` | `String.Latin (Info)` | _Kontext: Fahrzeugschaden_ |
| `Schadensart` | `String.Latin` | _Kontext: Fahrzeugschaden_ |
| `HöheDesSchadens` | `Amount` | _Kontext: Fahrzeugschaden_ |
| `WurdeEinGutachtenOderKostenvoranschlagZumSchadenErstellt` | `Amount (Currency)` | _Kontext: Fahrzeugschaden_<br>**Optionen:** 'Nein', 'Keine Angabe', 'Ja' |
| `FotosVomFahrzeugDokumenteGutachtenHochladen` | `FileRef` |  |
| `HergangDesUnfalls` | `String.Latin (Info)` |  |
| `Unfalldatum` | `Date` |  |
| `Unfallzeitpunkt` | `String.Latin` |  |
| `AllgemeinesZumUnfall` | `String.Latin (Info)` |  |
| `BitteVersuchenSieUnsInEinerKnappenBeschreibungMitzuteilenWieDerUnfallSichAusIhrerSichtEreignetHatWirBenötigenHierNurEinenGrobenÜberblickÜberDenHergangKeineAusführlicheErläuterung` | `String.Latin (Info)` |  |
| `UnfallbeschreibungOptional` | `String.Latin` |  |
| `Polizeibehörde` | `String.Latin` | _Kontext: Polizei_ |
| `LiegenIhnenNochWeitereFotosSkizzenOderDokumenteVomUnfallOderDenFahrzeugenVor` | `FileRef` |  |
| `Artumfang` | `String.Latin` |  |
| `Artumfang` | `String.Latin (Info)` |  |
| `FallsWeitereSachschädenEntstandenSindZBNotebookImKofferraumWurdeBeimUnfallBeschädigtKönnenSieDasHierStichpunktartigErfassen` | `String.Latin (Info)` |  |
| `ArtDesGegenstands` | `String.Latin` |  |
| `SchadenhöheOptional` | `Amount` |  |
| `InformationenZumSchaden` | `String.Latin` |  |
| `LiegenIhnenFotosOderDokumenteVor` | `FileRef` |  |
| `Artumfang` | `String.Latin` |  |
| `BitteBeschreibenSieDenPersonenschaden` | `String.Latin (Info)` |  |
| `BeginnDerKrankschreibungOrAu` | `Date` | _Kontext: Krankschreibung / AU_ |
| `EndeDerKrankschreibungOrAu` | `Date` | _Kontext: Krankschreibung / AU_ |
| `BeginnDesKrankenhausaufenthalts` | `Date` | _Kontext: Krankenhausaufenthalt_ |
| `EndeDesKrankenhausaufenthalts` | `Date` | _Kontext: Krankenhausaufenthalt_ |
| `LiegenIhnenArztberichteKrankschreibungAuFotosOderDokumenteVorOptional` | `FileRef` |  |

---

## 33. Versicherungsrecht (Relevanz: 3)

**Klasse:** `Versicherungsrecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `BspwAllianzAragDebekaHdi` | `String.Latin (Info)` |  |
| `BspwVersicherungPremiumBu75a7uxx` | `String.Latin (Info)` |  |
| `Tarif` | `String.Latin` |  |
| `Versicherungsbeginn` | `String.Latin (Info)` |  |
| `IhreVersicherungsnummer` | `String.Latin (Info)` |  |
| `Versicherungsbeginn` | `Date` |  |
| `Versicherungsnummer` | `String.Latin` |  |
| `VereinbarteSelbstbeteiligung` | `Amount` | _Kontext: Selbstbeteiligung_ |
| `VersicherungsscheinVertragsbedingungenHochladen` | `FileRef` |  |
| `Kaufdatum` | `Date` |  |
| `Kaufpreis` | `String.Latin (Info)` |  |
| `Kaufdatum` | `Date` |  |
| `Kaufpreis` | `Amount` | _Kontext: Gepäckschäden_ |
| `KaufrechnungFotosOÄHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `WoBefandSichDasFahrrad` | `String.Latin (Info)` |  |
| `Schadensdatum` | `Date` |  |
| `Schadensursachen` | `Code (List)` | **Werte:** 'Krankheit', 'Feuer', 'Fremde Verursachung', 'Sonstige Ursache', 'Beschädigung durch das Tier', 'Vandalismus / Diebstahl', 'Unfall mit einer Person', 'Andere', 'Behandlung des Tieres', 'Operation des Tieres', 'Unwetter', 'Unfall', 'Glasschaden', 'Glasbruch', 'Todesfall', 'Eigene Verursachung', 'Wasserschaden / Rohrbruch', 'Tierschaden', 'Erkrankung des Tieres', 'Einbruch / Diebstahl', 'Brand / Explosion', 'Umweltereignis / Tiere' |
| `BeschreibenSieBitteStichpunktartigWasPassiertIst` | `String.Latin (Info)` |  |
| `BeschreibungDesHergangs` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Anzeigedatum` | `Date` |  |
| `Schadennummer` | `String.Latin` | _Kontext: Antwort_ |
| `Ablehnung` | `Code (List)` | _Kontext: Antwort_<br>**Werte:** 'Sonstige Regulierung', 'Regulierung vollständig abgelehnt', 'Regulierung teilweise abgelehnt' |
| `FassenSieDieAblehnungsgründeBitteStichpunktartigZusammen` | `String.Latin (Info)` | _Kontext: Antwort_ |
| `BegründungAblehnung` | `String.Latin` | _Kontext: Antwort_ |
| `AnzeigeschreibenAblehnungsbescheidOÄHochladen` | `FileRef` |  |
| `Verwandtschaft` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `Schadensart` | `Code (List)` | _Kontext: Schaden / Verletzung_<br>**Werte:** 'Gegenstand', 'Körper / Geist' |
| `WasGenauWurdeBeschädigtOrVerletzt` | `String.Latin (Info)` | _Kontext: Schaden / Verletzung_ |
| `Schadensdetails` | `String.Latin` | _Kontext: Schaden / Verletzung_ |
| `GeschätzteSchadenhöhe` | `Amount` | _Kontext: Sachschäden >  Schaden / Verletzung_ |
| `BelegeFotosOÄHochladen` | `FileRef` |  |
| `WoIstDerSchadenEingetreten` | `String.Latin` |  |
| `Eigenverschulden` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Teilweise', 'Ja' |
| `WasIstPassiert` | `String.Latin (Info)` |  |
| `BeschreibenSieBitteStichpunktartigWasPassiertIst` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Bereich` | `Code (List)` | Auch Unfälle auf dem Weg von oder zu Ihrer Arbeit oder der Kita zählen i.d.R. zum Bereich Arbeit<br>**Werte:** 'Bei der Arbeit', 'Im Straßenverkehr', 'Sonstiges', 'Freizeitaktivität' |
| `Beteiligteperson` | `String.Latin` | _Kontext: Drogen- / Alkoholeinfluss_ |
| `BeschreibenSieBitteStichpunktartigWasPassiertIstGebenSieBitteAuchAnWennJemandVerletztWurde` | `String.Latin (Info)` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Ehepartner/ Partner', 'Sonstige', 'Kind', 'Freunde', 'Elternteil' |
| `Gegenansprüche` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Beteiligteperson` | `String.Latin` |  |
| `BeschreibenSieDieVerletzungenBitteStichpunktartigWennBekannt` | `String.Latin (Info)` |  |
| `Verletzungen` | `String.Latin` |  |
| `Behandler` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `AbgeschlosseneBehandlung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `ArzberichteEntlassungsbriefFotosOÄHochladen` | `FileRef` |  |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Sachschäden_ |
| `ArtDesGegenstands` | `String.Latin` | _Kontext: Sachschäden_ |
| `InformationenZumSchaden` | `String.Latin` | _Kontext: Sachschäden_ |
| `Schadensbeseitigung` | `Code (List)` | _Kontext: Sachschäden_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `FotosRechnungenOÄHochladen` | `FileRef` | _Kontext: Sachschäden_ |
| `AngabenZumTier` | `Code (List)` | **Werte:** 'Andere', 'Rind', 'Pferd', 'Schwein', 'Katze', 'Geflügel', 'Hund' |
| `Einsatzart` | `String.Latin` | _Kontext: Nutztier_ |
| `BelegFotoOÄHochladen` | `FileRef` | _Kontext: Schaden / Verletzung_ |
| `GeschätzteKostenhöhe` | `Amount (Currency)` | _Kontext: Kosten_ |
| `RechnungenFotosOÄHochladen` | `FileRef` | _Kontext: Kosten_ |
| `GeplanteReise` | `String.Latin (Info)` |  |
| `Reiseziel` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Verletzungen` | `String.Latin` |  |
| `Diagnose` | `String.Latin` | _Kontext: Stationäre Behandlung_ |
| `AufnahmeImKrankenhaus` | `Date` | _Kontext: Stationäre Behandlung_ |
| `EntlassungAusDemKrankenhaus` | `Date` | _Kontext: Stationäre Behandlung_ |
| `ArztberichteEntlassungsbriefFotosOÄHochladen` | `FileRef` | _Kontext: Stationäre Behandlung_ |
| `Kostenhöhe` | `Amount (Currency)` |  |
| `Kostenhöhe` | `Amount (Currency)` |  |
| `Kostenart` | `Amount (Currency)` | **Optionen:** 'Transport', 'Medikamente', 'Sonstige', 'Ärztliche Behandlung' |
| `Kostenschuldner` | `Amount (Currency)` |  |
| `RechnungBelegOÄHochladen` | `FileRef` |  |
| `WofürEntstandenDieKosten` | `Amount (Currency)` |  |
| `Kostenursache` | `Amount (Currency)` |  |
| `RechnungHochladen` | `FileRef` |  |
| `WasIstIhrZuletztAusgeübterBeruf` | `String.Latin (Info)` |  |
| `LetzterBeruf` | `String.Latin` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Ausbildung', 'Weiß ich nicht', 'Verbeamtet', 'Angestellt', 'Selbstständig' |
| `MusstenSieKörperlicheArbeitLeisten` | `Code (List)` | **Werte:** 'Keine körperliche Arbeit', 'Schwere körperliche Arbeit', 'Teilweise körperliche Arbeit', 'Leichte körperliche Arbeit' |
| `BitteBeschreibenSieStichpunktartigIhreAusgeübtenTätigkeiten` | `String.Latin (Info)` |  |
| `AusgeübteTätigkeiten` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Behandlungsbeginn` | `Date` |  |
| `Behandlungsende` | `Date` |  |
| `UnterlagenHochladen` | `FileRef` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Andere Ursache', 'Psychische Erkrankung', 'Unfall', 'Körperliche Erkrankung' |
| `Artumfang` | `String.Latin (Info)` |  |
| `Datumzeitpunkt` | `Date` |  |
| `Beginn` | `Date` |  |
| `Ende` | `Date` |  |
| `ArztberichteUnterlagenOÄHochladen` | `FileRef` |  |
| `Beteiligteperson` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Vollständig', 'Gar nicht', 'Teilweise' |
| `AnzeigeschreibenHochladen` | `FileRef` |  |
| `WiederaufnahmeDesBerufes` | `Code (List)` | _Kontext: Gutachten_<br>**Werte:** 'Weiß ich nicht', 'Vollständig', 'Über 50 %', 'Unter 50 %' |
| `GutachtenHochladen` | `FileRef` | _Kontext: Gutachten_ |
| `AblehnungsbescheidOÄHochladen` | `FileRef` | _Kontext: Antwort_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Beruf', 'Privat', 'Verkehr', 'Wohnen' |
| `VereinbarteWartezeit` | `String.Latin (Info)` |  |
| `Wartezeit` | `String.Latin` |  |
| `Datumzeitpunkt` | `Date` |  |
| `DatumDesVorfalls` | `Date` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Zeuge', 'Klagende Person', 'Andere Rolle', 'Beklagte Person' |
| `Artumfang` | `Code (List)` | **Werte:** 'Anderer Stand', 'Erste anwaltliche Beratung', 'Laufendes Gerichtsverfahren' |
| `Datumzeitpunkt` | `Date` |  |
| `BeziehungZurPerson` | `String.Latin` | _Kontext: Verwandtschaft_ |
| `Versicherungsumfang` | `Code (List)` | **Werte:** 'Haftpflichtversichert', 'Vollkaskoversichert', 'Teilkaskoversichert' |
| `Fahrzeugangaben` | `String.Latin (Info)` |  |
| `Art` | `Code (List)` | **Werte:** 'Andere', 'Lkw', 'Auto', 'Moped', 'Motorrad' |
| `Modell` | `String.Latin` |  |
| `Kennzeichen` | `String.Latin` |  |
| `KaufvertragBelegFotosOÄHochladen` | `FileRef` |  |
| `WoBefandSichDasFahrzeug` | `String.Latin (Info)` |  |
| `Verbindlichkeiten` | `Code (List)` | _Kontext: Fahrzeug gefahren_<br>**Werte:** 'Nein', 'Keine Angabe', 'Teilweise', 'Ja' |
| `Fahrtauglich` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Schaden` | `String.Latin (Info)` |  |
| `WasWurdeBeschädigt` | `String.Latin (Info)` |  |
| `Schaden` | `String.Latin` |  |
| `Reparatur` | `Code (List)` | **Werte:** 'Nein', 'Ja' |
| `FotosOrRechnungHochladen` | `FileRef` |  |
| `ArtDerReise` | `Code (List)` | **Werte:** 'Beruflich', 'Privat' |
| `Buchungsdatum` | `Date` |  |
| `Reisekosten` | `Amount` |  |
| `BuchungsbelegHochladen` | `FileRef` |  |
| `Grundanlass` | `Code (List)` | **Werte:** 'Todesfall', 'Stornierung der Fluggesellschaft', 'Schwangerschaft', 'Krankheit', 'Andere', 'Arbeitssituation', 'Umweltereignisse', 'Unfall' |
| `WessenGepäckIstBetroffen` | `String.Latin (Info)` | _Kontext: Gepäckschäden_ |
| `WasIstMitDemGepäckPassiert` | `String.Latin (Info)` | _Kontext: Gepäckschäden_ |
| `BetroffenePersonEn` | `String.Latin` | _Kontext: Gepäckschäden_ |
| `Status` | `Code (List)` | _Kontext: Gepäckschäden_<br>**Werte:** 'Zerstörung während des Fluges', 'Verlust während der Reise', 'Andere', 'Diebstahl während der Reise', 'Verlust durch Fluggesellschaft' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Gepäckschäden_ |
| `WurdeDafürEineGleichartigeSacheGekauft` | `String.Latin (Info)` | _Kontext: Gepäckschäden_ |
| `Beteiligteperson` | `Amount` | _Kontext: Gepäckschäden_ |
| `BelegRechnungOÄHochladen` | `FileRef` | _Kontext: Gepäckschäden_ |
| `AblehnungsbescheidOÄHochladen` | `FileRef` | _Kontext: Antwort_ |

---

## 34. Verwaltungsrecht: Religion (Relevanz: 2)

**Klasse:** `VerwaltungsrechtReligion`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `PersönlicheAngaben` | `String.Latin (Info)` |  |
| `Geburtenregisternummer` | `String.Latin` |  |
| `IhreKonfession` | `String.Latin (Info)` |  |
| `Konfession` | `String.Latin` |  |
| `Familienstand` | `Code (List)` | **Werte:** 'Keine Angabe', 'Ledig', 'Verheiratet', 'Verwitwet', 'Geschieden' |
| `Anzahl` | `Integer / String` | _Kontext: Haben Sie Kinder?_ |
| `GeburtsurkundeNDerKinderHochladen` | `FileRef` | _Kontext: Haben Sie Kinder?_ |
| `PersonalausweisReisepassOderEheurkundeHochladen` | `FileRef` |  |

---

## 35. Verwaltungsrecht: Tierhaltung (Relevanz: 2)

**Klasse:** `VerwaltungsrechtTierhaltung`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `IhreSteuerid` | `String.Latin (Info)` |  |
| `Steuerid` | `String.Latin` |  |
| `Geschlecht` | `String.Latin` |  |
| `Rasse` | `String.Latin` |  |
| `Alter` | `String.Latin` |  |
| `Farbe` | `String.Latin` |  |
| `VorhandeneHundesteuernummer` | `String.Latin` |  |
| `Chipnummer` | `String.Latin` |  |
| `GrundDerAnmeldung` | `Code (List)` | **Werte:** 'Neuer Hund', 'Umzug mit dem Hund' |
| `Datum` | `Date` |  |
| `Hundesteuernummer` | `String.Latin` |  |
| `GrundDerAbmeldung` | `Code (List)` | **Werte:** 'Abgabe des Hundes', 'Hund entlaufen', 'Hund verstorben', 'Umzug mit dem Hund' |

---

## 36. Verwaltungsrecht: Versammlung (Relevanz: 2)

**Klasse:** `VerwaltungsrechtVersammlung`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Versammlungsorganisation` | `String.Latin (Info)` |  |
| `Versammlungsdaten` | `String.Latin (Info)` |  |
| `TitelOrThemaDerVersammlung` | `String.Latin` |  |
| `DatumDesVersammlungsbeginns` | `Date` |  |
| `Startzeit` | `String.Latin` |  |
| `Endzeit` | `String.Latin` |  |
| `DauerDerVersammlung` | `String.Latin` |  |
| `GeschätzteAnzahlDerTeilnehmenden` | `Integer / String` |  |
| `BeschreibenSieBitteDenZweckUndAnlassDerVersammlung` | `String.Latin (Info)` |  |
| `ZweckOrAnlassDerVersammlung` | `String.Latin` |  |
| `BeschränkungTeilnehmerkreis` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `BeschreibenSieBitteDenStreckenverlauf` | `String.Latin (Info)` | _Kontext: Aufzug_ |
| `Streckenverlauf` | `String.Latin` | _Kontext: Aufzug_ |
| `BeschreibenSieBitteDenUmfangDesAngebots` | `String.Latin (Info)` | _Kontext: Verpflegung_ |
| `VerpflegungOrUnterhaltung` | `String.Latin` | _Kontext: Verpflegung_ |
| `Alternativdatum` | `Date` | _Kontext: Alternativdatum_ |
| `AnzahlVersammlungsordner` | `Integer / String` | _Kontext: Versammlungsordner_ |
| `FassenSieHilfsmittelBitteStichpunktartigZusammen` | `String.Latin (Info)` | _Kontext: Hilfsmittel_ |
| `Hilfsmittel` | `String.Latin` | _Kontext: Hilfsmittel_ |
| `Anzeigedatum` | `Date` | _Kontext: Anzeige_ |
| `Zustellungsdatum` | `Date` | _Kontext: Bescheid_ |
| `VerbotOrAuflagen` | `Code (List)` | _Kontext: Bescheid_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `FassenSieDieGründeFürEinVerbotOderAuflagenBitteStichpunktartigZusammen` | `String.Latin (Info)` | _Kontext: Bescheid_ |
| `Begründung` | `String.Latin` | _Kontext: Bescheid_ |
| `VersammlungsanzeigeOrBescheidHochladen` | `FileRef` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstiges Ziel', 'Kostenersatz für ausgefallene Versammlung', 'Klärung für künftige Versammlungen', 'Durchführung geplanter Versammlung' |
| `MöchtenSieDerKanzleiNochEtwasMitteilen` | `String.Latin (Info)` |  |
| `EigeneAnmerkungen` | `String.Latin` |  |

---

## 37. Vorsorgerecht (Relevanz: 2)

**Klasse:** `Vorsorgerecht`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `Steueridentifikationsnummer` | `String.Latin (Info)` |  |
| `SteuerId` | `String.Latin` |  |
| `Familienstand` | `Code (List)` | **Werte:** 'Ledig', 'Geschieden', 'Verheiratet', 'Verwitwet', 'Sonstig' |
| `Kinder` | `String.Latin` | _Kontext: Kinder >  Haben Sie Kinder?_ |
| `TestamentOrErbvertragHochladen` | `FileRef` | _Kontext: Testament_ |
| `FamilienstandDerPerson` | `Code (List)` | **Werte:** 'Ledig', 'Verheiratet', 'Geschieden', 'Verwitwet' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Beteiligteperson` | `Amount` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Adresse` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Grundbuchdaten` | `String.Latin (Info)` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `ZuständigesAmtsgericht` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Grundbuch` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Gemarkung` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `GrundstückInM` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Blattnr` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `BestandsverzeichnisNr` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Flur` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Flurstück` | `String.Latin` | _Kontext: Soll eine Immobilie verschenkt werden?_ |
| `Bebauung` | `Code (List)` | _Kontext: Soll eine Immobilie verschenkt werden?_<br>**Werte:** 'Einfamilienhaus', 'Mehrfamilienhaus', 'Bürogebäude', 'Sonstige Bebauung', 'Weiß ich nicht', 'Unbebaut', 'Reihenhaus' |
| `AngabenZurGesellschaft` | `String.Latin (Info)` | _Kontext: Unternehmenbeteiligung_ |
| `Registergericht` | `String.Latin` | _Kontext: Unternehmenbeteiligung_ |
| `Handelsregisternummer` | `String.Latin` | _Kontext: Unternehmenbeteiligung_ |
| `HöheDerÜbertragenenBeteiligungIn` | `String.Latin (Info)` | _Kontext: Unternehmenbeteiligung_ |
| `Beteiligteperson` | `String.Latin (Info)` | _Kontext: Unternehmenbeteiligung_ |
| `Beteilungshöhe` | `String.Latin` | _Kontext: Unternehmenbeteiligung_ |
| `Beteiligteperson` | `Amount` | _Kontext: Unternehmenbeteiligung_ |
| `Nutzungsvorbehalt` | `Code (List)` | _Kontext: Unternehmenbeteiligung_<br>**Werte:** 'Recht zum Behalten der Erträge', 'Kein Nutzungsvorbehalt' |
| `HöheDesGeldbetrages` | `String.Latin (Info)` | _Kontext: Geldbetrag_ |
| `Höhe` | `Amount` | _Kontext: Geldbetrag_ |
| `BezeichnungDerGegenstände` | `String.Latin (Info)` | _Kontext: Sonstige Gegenstände_ |
| `Bezeichnung` | `String.Latin` | _Kontext: Sonstige Gegenstände_ |
| `Beteiligteperson` | `Amount` | _Kontext: Sonstige Gegenstände_ |
| `Artumfang` | `Code (List)` | **Werte:** 'Sonstige', 'Vermeidung von Pflichtteilansprüchen', 'Gegenleistung für erbrachte Leistungen', 'Vorweggenommene Erbfolge', 'Steuerliches Motiv', 'Vermeidung von Sozialhilferegress' |
| `Gegenleistung` | `Code (List)` | **Werte:** 'Pflegeleistung', 'Schuldübernahme des Veräußerers', 'Keine Gegenleistung', 'Sonstiges', 'Zahlung eines laufenden Betrages', 'Einmalige Zahlung' |
| `TeilnahmeAllerAmTermin` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `Sprache` | `String.Latin` | _Kontext: Benötigt die Person einen Dolmetscher? >  Benötigt eine Peron nach Ihrem Wissen einen Dolmetscher? >  Benötigen Sie einen Dolmetscher?_ |
| `KörperlicheEinschränkungen` | `Code (List)` | Gemeint sind Einschränkungen, die das Hören, Schreiben, Sehen oder Sprechen beeinträchtigen<br>**Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `IhreRolle` | `String.Latin (Info)` |  |
| `Artumfang` | `Code (List)` | **Werte:** 'Bevollmächtigter', 'Sonstige', 'Vollmachtgeber' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Haben Sie körperliche Einschränkungen? >  Hat die Person körperliche Einschränkungen?_ |
| `Einschränkungen` | `String.Latin` | _Kontext: Haben Sie körperliche Einschränkungen? >  Hat die Person körperliche Einschränkungen?_ |
| `Rang` | `Code (List)` | Wählen Sie **optional** eine gewünscht Rangfolge, falls es mehrere Bevollmächtigte gibt. Andernfalls lassen Sie die Angabe frei oder wählen Sie **Keine Rangfolge**.<br>**Werte:** 'Gleichrangig', 'Keine Rangfolge', 'Erstrangig', 'Zweitrangig' |
| `VerwandtschaftZu` | `String.Latin` | _Kontext: Ist die Person mit einem Vollmachtgeber verwandt oder verschwägert?_ |
| `WieIstDerGradDerVerwandtschaftOrVerschägerung` | `String.Latin (Info)` | _Kontext: Ist die Person mit einem Vollmachtgeber verwandt oder verschwägert?_ |
| `Verwandtschaftsgrad` | `Code (List)` | _Kontext: Ist die Person mit einem Vollmachtgeber verwandt oder verschwägert?_<br>**Werte:** 'Verschwägert', 'Freundschaft / Bekannte', 'Kind', 'Lebensgefährte', 'Geschwister', 'Enkelkind', 'Elternteil', 'Sonstige Beziehung', 'Ehepartner' |
| `UmfassendeBefugnisse` | `Code (List)` | **Werte:** 'Ja (Regelfall)', 'Nein', 'Keine Angabe' |
| `ZentralesVorsorgeregister` | `Code (List)` | **Werte:** 'Nein', 'Keine Angabe', 'Ja' |
| `Artumfang` | `String.Latin (Info)` | _Kontext: Unternehmen_ |
| `Unternehmen` | `String.Latin` | _Kontext: Unternehmen_ |
| `AnmerkungenOrWünscheZurPatientenverfügung` | `String.Latin (Info)` | _Kontext: Patientenverfügung_ |
| `Patientenverfügung` | `String.Latin` | _Kontext: Patientenverfügung_ |

---

## 38. Zivilrecht: Forderungen (Relevanz: 5)

**Klasse:** `ZivilrechtForderungen`

| Property | Datentyp | Beschreibung / Wertevorrat |
|---|---|---|
| `IhreRolle` | `Code (List)` | **Werte:** 'Wohnungseigentümer (WEG)', 'Anspruchsinhaber', 'Vollstreckungsverwalter', 'Sonstiges', 'Insolvenzverwalter', 'Treuhänder' |
| `Anspruchsart` | `Code (List)` | **Werte:** 'Sonstiges', 'Geldzahlung' |
| `HauptforderungEn` | `String.Latin (Info)` |  |
| `Zinsen` | `String.Latin (Info)` |  |
| `Hauptforderung` | `Amount` |  |
| `Zinsen` | `Amount` |  |
| `Inkassokosten` | `String.Latin (Info)` |  |
| `SonstigeKosten` | `Amount (Currency)` |  |
| `Inkassokosten` | `Amount` |  |
| `Anspruchshöhe` | `Amount` |  |
| `EntstehungsdatumDesAnspruchs` | `Date` |  |
| `Datum` | `Date` |  |
| `OffeneGegenleistung` | `Code (List)` | **Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `VerträgeUrkundenBelegeUndRechnungenHochladen` | `FileRef` |  |
| `DatumAufforderung` | `Date` | _Kontext: Mahnung_ |
| `Reaktion` | `Code (List)` | _Kontext: Mahnung_<br>**Werte:** 'Weiß ich nicht', 'Nein', 'Ja' |
| `AufforderungUndReaktionHochladen` | `FileRef` | _Kontext: Mahnung_ |

---

