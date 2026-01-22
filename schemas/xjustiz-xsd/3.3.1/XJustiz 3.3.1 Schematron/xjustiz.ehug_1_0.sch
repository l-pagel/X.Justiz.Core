<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz EHUG
    Version 1.0.3 (Juli 2022; Korrektur¹/Optimierungen² zu:  SCH-EHUG-0030¹, SCH-EHUG-0040², SCH-EHUG-0045², SCH-EHUG-0050², SCH-EHUG-0055²)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />

	<!-- ===================================== -->
	<!--          Fachdatensatz EHUG           -->
	<!-- ===================================== -->


	<!-- EHUG - NACHRICHT 2100001 -->

			<!-- EHUG - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001/tns:nachrichtenkopf">
					<sch:assert test="count(tns:ereignis) = 1" id="SCH-EHUG-0005">[SCH-EHUG-0005] Nachrichtenkopf: Das Element 'ereignis' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Existenz: Das Element 'absender.sonstige' muss verwendet werden -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001/tns:nachrichtenkopf/tns:auswahl_absender">
					<sch:assert test="exists(tns:absender.sonstige)" id="SCH-EHUG-0010">[SCH-EHUG-0010] Nachrichtenkopf: Das in EHUG verpflichtende Element 'absender.sonstige' wurde nicht verwendet! Bitte das Absender-Auswahlelement ändern!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Fester Wert: Der Wert 'Bundesamt für Justiz' ist fuer das Element 'absender.sonstige' vorgeschrieben -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001/tns:nachrichtenkopf/tns:auswahl_absender/tns:absender.sonstige">
					<sch:assert test=". = 'Bundesamt für Justiz'" id="SCH-EHUG-0015">[SCH-EHUG-0015] Nachrichtenkopf: Das Element 'absender.sonstige' enthält nicht den festgelegten Wert 'Bundesamt für Justiz'!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Existenz: Das Element 'empfaenger.gericht' muss verwendet werden -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001/tns:nachrichtenkopf/tns:auswahl_empfaenger">
					<sch:assert test="exists(tns:empfaenger.gericht)" id="SCH-EHUG-0020">[SCH-EHUG-0020] Nachrichtenkopf: Das in EHUG verpflichtende Element 'empfaenger.gericht' wurde nicht verwendet! Bitte das Empfänger-Auswahlelement ändern!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Fester Wert: Der Wert 'R3200' ist fuer das Element 'empfaenger.gericht/code' vorgeschrieben -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001/tns:nachrichtenkopf/tns:auswahl_empfaenger/tns:empfaenger.gericht">
					<sch:assert test="code = 'R3200'" id="SCH-EHUG-0025">[SCH-EHUG-0025] Nachrichtenkopf: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Gericht' zum Element 'empfaenger.gericht' enthält nicht die festgelegte XJustiz-ID 'R3200' für das LG Bonn!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
		
		
			<!-- EHUG - GRUNDDATEN-GESCHAEFTSREGELN: -->
			<sch:pattern>
				<!-- Gesamtanzahl: Das Pflichtelement 'gegenstand' muss (auch insgesamt) genau einmal vorkommen (im Grunde Kardinalitäts-Verschärfung fuer optionale Vorfahren-Elemente 'instanzdaten' und 'verfahrensgegenstand' von '0..n' auf '1') -->
				<sch:rule context="/">
					<sch:assert test="count(//tns:gegenstand) = 1" id="SCH-EHUG-0030">[SCH-EHUG-0030] Grunddaten: Das Pflichtelement 'gegenstand' muss (auch insgesamt) genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Fester Wert: Der Wert 'EHUG' ist fuer das Element 'gegenstand' vorgeschrieben: -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001/tns:grunddaten//tns:verfahrensgegenstand">
					<sch:assert test="tns:gegenstand = 'EHUG'" id="SCH-EHUG-0035">[SCH-EHUG-0035] Grunddaten: Das Element 'gegenstand' darf nur den Wert 'EHUG' haben!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
		
		
			<!-- EHUG - FACHDATEN-GESCHAEFTSREGELN: -->
			<sch:pattern>
				<!-- Existenz/Bedingung: Wenn Element 'eingang.einspruch' 'ja' ('true'), muss Element 'datum.einspruch' vorhanden sein -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001//tns:eingang.einspruch">
					<sch:assert test="if(. = boolean(1)) then exists(following-sibling::tns:datum.einspruch) else true()" id="SCH-EHUG-0040">[SCH-EHUG-0040] Fachdaten: Wenn das Element 'eingang.einspruch' den technischen Wert 'true' hat (entspricht inhaltlich 'ja'), muss das Element 'datum.einspruch' vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Existenz/Bedingung: Wenn Element 'eingang.einspruch' 'nein' ('false'), darf Element 'datum.einspruch' nicht vorhanden sein -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001//tns:eingang.einspruch">
					<sch:assert test="if(. = boolean(0)) then not(exists(following-sibling::tns:datum.einspruch)) else true()" id="SCH-EHUG-0045">[SCH-EHUG-0045] Fachdaten: Wenn das Element 'eingang.einspruch' den technischen Wert 'false' hat (entspricht inhaltlich 'nein'), darf das Element 'datum.einspruch' nicht vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Existenz/Bedingung: Wenn Element 'eingang.einspruch' 'ja' ('true'), muss Element 'datum.einspruch.eingang' vorhanden sein -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001//tns:eingang.einspruch">
					<sch:assert test="if(. = boolean(1)) then exists(following-sibling::tns:datum.einspruch.eingang) else true()" id="SCH-EHUG-0050">[SCH-EHUG-0050] Fachdaten: Wenn das Element 'eingang.einspruch' den technischen Wert 'true' hat (entspricht inhaltlich 'ja'), muss das Element 'datum.einspruch.eingang' vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern>
				<!-- Existenz/Bedingung: Wenn Element 'eingang.einspruch' 'nein' ('false'), darf Element 'datum.einspruch.eingang' nicht vorhanden sein -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001//tns:eingang.einspruch">
					<sch:assert test="if(. = boolean(0)) then not(exists(following-sibling::tns:datum.einspruch.eingang)) else true()" id="SCH-EHUG-0055">[SCH-EHUG-0055] Fachdaten: Wenn das Element 'eingang.einspruch' den technischen Wert 'false' hat (entspricht inhaltlich 'nein'), darf das Element 'datum.einspruch.eingang' nicht vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			
			
			<!-- EHUG - CODELISTEN-GESCHAEFTSREGELN: -->
			
			<!-- 'Code.GDS.Dokumentklasse.Typ3' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Dokumentklasse' -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001//tns:xjustiz.fachspezifischeDaten/tns:dokumentklasse">
					<sch:assert test="code = ('001','003','005','006','007','008','009','010','011','012','013','014','015','016','017','018','019')" id="SCH-EHUG-0060">[SCH-EHUG-0060] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Dokumentklasse' zum Element 'dokumentklasse' darf nur folgende Werte haben:'001','003','005','006','007','008','009','010','011','012','013','014','015','016','017','018' oder '019'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<!-- 'Code.GDS.Dokumenttyp.Typ3' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001//tns:xjustiz.fachspezifischeDaten/tns:dokumententyp">
					<sch:assert test="code = ('044','122','127','143','144','163','164','165','184','185','206','214','220')" id="SCH-EHUG-0065">[SCH-EHUG-0065] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Dokumenttyp' zum Element 'dokumententyp' darf nur folgende Werte haben:'044','122','127','143','144','163','164','165','184','185','206','214' oder '220'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<!-- 'Code.GDS.Ereignis.Typ3' --> 
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = ('001','002','003','004')" id="SCH-EHUG-0070">[SCH-EHUG-0070] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben: '001','002','003' oder '004'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<!-- 'Code.GDS.Rollenbezeichnung' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
				<sch:rule context="tns:nachricht.ehug.uebergabe.2100001//tns:beteiligung/tns:rolle/tns:rollenbezeichnung">
					<sch:assert test="code = ('040','041','088','093','132','152','165','169','173','206','207','225','227','265')" id="SCH-EHUG-0075">[SCH-EHUG-0075] Codeliste: Der Codelistenschlüssel der Typ1-Codeliste 'GDS.Rollenbezeichnung' zum Element 'rollenbezeichnung' darf nur folgende Werte haben:'040','041','088','093','132','152','165','169','173','206','207','225','227' oder '265'!</sch:assert>
				</sch:rule>
			</sch:pattern>


			<!-- /EHUG - CODELISTEN-GESCHAEFTSREGELN -->
		
	<!-- /EHUG - NACHRICHT 2100001 -->

    
</sch:schema>