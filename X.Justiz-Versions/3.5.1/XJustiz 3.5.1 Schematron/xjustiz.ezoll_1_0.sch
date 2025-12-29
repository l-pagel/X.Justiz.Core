<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Pruefung von Geschaeftsregeln fuer den 
    XJustiz-Fachdatensatz eZOLL
    Version 1.0.2 (Oktober 2023; Aenderung zu: SCH-EZOLL-0133 (Fehlerausgabetext hinsichtlich geaendertem Codelistendatentyp zu 'GDS.Rollenbezeichnung.Typ3' (zuvor Typ1) angepasst))
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />

	<!-- ===================================== -->
	<!--          Fachdatensatz eZOLL           -->
	<!-- ===================================== -->

	<!-- eZOLL - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
		<!-- eZOLL - NACHRICHTENKOPF abstrakte Regeln - ruleSet -->
	
		<sch:pattern id="SCH-EZOLL-0001" abstract="true">
			<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf">
				<sch:assert test="count(tns:aktenzeichen.absender) &lt; 2">[SCH-EZOLL-0001] Nachrichtenkopf: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen!</sch:assert>
			</sch:rule>	
		</sch:pattern>
	
		<sch:pattern id="SCH-EZOLL-0005" abstract="true">
			<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf höchstens einmal vorkommen -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf">
				<sch:assert test="count(tns:aktenzeichen.empfaenger) &lt; 2">[SCH-EZOLL-0005] Nachrichtenkopf: Das Element 'aktenzeichen.empfaenger' darf höchstens einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern id="SCH-EZOLL-0010" abstract="true">
			<!-- Auswahl: Das Element 'auswahl_absender/absender.gericht' darf nicht ausgewählt werden -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf/tns:auswahl_absender">
				<sch:assert test="count(tns:absender.gericht) = 0">[SCH-EZOLL-0010] Nachrichtenkopf: Das Element 'auswahl_absender/absender.gericht' darf nicht ausgewählt werden!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern id="SCH-EZOLL-0015" abstract="true">
			<!-- Auswahl: Das Element 'auswahl_empfaenger/empfaenger.gericht' darf nicht ausgewählt werden -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf/tns:auswahl_empfaenger">
				<sch:assert test="count(tns:empfaenger.gericht) = 0">[SCH-EZOLL-0015] Nachrichtenkopf: Das Element 'auswahl_empfaenger/empfaenger.gericht' darf nicht ausgewählt werden!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern id="SCH-EZOLL-0020" abstract="true">
			<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf">
				<sch:assert test="count(tns:ereignis) = 1">[SCH-EZOLL-0020] Nachrichtenkopf: Das Element 'ereignis' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern id="SCH-EZOLL-0025" abstract="true">
			<!-- Kardinalitaet: Die Elementgruppe 'herstellerinformation' muss genau einmal vorkommen -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf">
				<sch:assert test="count(tns:herstellerinformation) = 1">[SCH-EZOLL-0025] Nachrichtenkopf: Die Elementgruppe 'herstellerinformation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>	
	
		<sch:pattern id="SCH-EZOLL-0030" abstract="true">
			<!-- Kardinalitaet: Das Element 'herstellerinformation/nameDesProdukts' muss genau einmal vorkommen -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf/tns:herstellerinformation">
				<sch:assert test="count(tns:nameDesProdukts) = 1">[SCH-EZOLL-0030] Nachrichtenkopf: Das Element 'herstellerinformation/nameDesProdukts' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>	
	
		<sch:pattern id="SCH-EZOLL-0035" abstract="true">
			<!-- Kardinalitaet: Das Element 'herstellerinformation/herstellerDesProdukts' muss genau einmal vorkommen -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf/tns:herstellerinformation">
				<sch:assert test="count(tns:herstellerDesProdukts) = 1">[SCH-EZOLL-0035] Nachrichtenkopf: Das Element 'herstellerinformation/herstellerDesProdukts' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>	
	
		<sch:pattern id="SCH-EZOLL-0040" abstract="true">
			<!-- Kardinalitaet: Das Element 'herstellerinformation/version' muss genau einmal vorkommen -->
			<sch:rule context="$nachrichtenName/tns:nachrichtenkopf/tns:herstellerinformation">
				<sch:assert test="count(tns:version) = 1">[SCH-EZOLL-0040] Nachrichtenkopf: Das Element 'herstellerinformation/version' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>	
	
	<!-- eZOLL - NACHRICHTENKOPF - angewandte Regeln in Nachrichten-->
		<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen -->
		<sch:pattern is-a="SCH-EZOLL-0001">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0001">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0001">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0001">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>
		
		<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf höchstens einmal vorkommen -->
		<sch:pattern is-a="SCH-EZOLL-0005">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0005">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0005">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0005">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>

		<!-- Auswahl: Das Element 'auswahl_absender/absender.gericht' darf nicht ausgewählt werden -->
		<sch:pattern is-a="SCH-EZOLL-0010">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0010">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0010">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0010">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>

		<!-- Auswahl: Das Element 'auswahl_empfaenger/empfaenger.gericht' darf nicht ausgewählt werden -->
		<sch:pattern is-a="SCH-EZOLL-0015">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0015">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0015">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0015">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>	

		<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen -->
		<sch:pattern is-a="SCH-EZOLL-0020">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0020">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0020">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0020">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>	

		<!-- Kardinalitaet: Die Elementgruppe 'herstellerinformation' muss genau einmal vorkommen -->
		<sch:pattern is-a="SCH-EZOLL-0025">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0025">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0025">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0025">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>	

		<!-- Kardinalitaet: Das Element 'herstellerinformation/nameDesProdukts' muss genau einmal vorkommen -->	
		<sch:pattern is-a="SCH-EZOLL-0030">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0030">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0030">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0030">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>	

		<!-- Kardinalitaet: Das Element 'herstellerinformation/herstellerDesProdukts' muss genau einmal vorkommen -->	
		<sch:pattern is-a="SCH-EZOLL-0035">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0035">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0035">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0035">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>	

		<!-- Kardinalitaet: Das Element 'herstellerinformation/version' muss genau einmal vorkommen -->	
		<sch:pattern is-a="SCH-EZOLL-0040">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunft.2400001"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0040">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.auskunftsersuchen.2400002"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0040">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.fehlermeldung.2400003"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-EZOLL-0040">
			<sch:param name="nachrichtenName" value="tns:nachricht.ezoll.prueffallmeldung.2400004"/>
		</sch:pattern>	
	
	<!-- eZOLL - GRUNDDATEN-GESCHAEFTSREGELN: -->
		<!-- eZOLL - NACHRICHTEN ALLE -->
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'verfahrensdaten' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten">
				<sch:assert test="count(tns:verfahrensdaten) = 1" id="SCH-EZOLL-0045">[SCH-EZOLL-0045] Grunddaten: Das Element 'verfahrensdaten' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'beteiligung' muss mindestens einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten">
				<sch:assert test="count(tns:beteiligung) &gt; 0" id="SCH-EZOLL-0050">[SCH-EZOLL-0050] Grunddaten: Das Element 'beteiligung' muss mindestens einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'rollenbezeichnung' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
				<sch:assert test="count(tns:rollenbezeichnung) = 1" id="SCH-EZOLL-0055">[SCH-EZOLL-0055] Grunddaten: Das Element 'rollenbezeichnung' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'rolle/nr' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
				<sch:assert test="count(tns:nr) = 1" id="SCH-EZOLL-0060">[SCH-EZOLL-0060] Grunddaten: Das Element 'rolle/nr' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Auswahl: Das Element 'auswahl_beteiligter/ra.kanzlei' darf nicht ausgewählt werden -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter">
				<sch:assert test="count(tns:ra.kanzlei) = 0" id="SCH-EZOLL-0065">[SCH-EZOLL-0065] Grunddaten: Das Element 'auswahl_beteiligter/ra.kanzlei' darf nicht ausgewählt werden!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/vorname' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName">
				<sch:assert test="count(tns:vorname) = 1" id="SCH-EZOLL-0070">[SCH-EZOLL-0070] Grunddaten: Das Element 'vorname' in 'natuerlichePerson' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/anschrift' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
				<sch:assert test="count(tns:anschrift) = 1" id="SCH-EZOLL-0075">[SCH-EZOLL-0075] Grunddaten: Das Element 'anschrift' in 'natuerlichePerson' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/anschrift/anschriftstyp' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
				<sch:assert test="count(tns:anschriftstyp) = 1" id="SCH-EZOLL-0080">[SCH-EZOLL-0080] Grunddaten: Das Element 'anschriftstyp' in 'natuerlichePerson' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/anschrift/anschriftenzusatz' darf höchstens einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
				<sch:assert test="count(tns:anschriftenzusatz)  &lt; 2" id="SCH-EZOLL-0083">[SCH-EZOLL-0083] Grunddaten: Das Element 'anschriftenzusatz' in 'natuerlichePerson' darf höchstens einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/anschrift/strasse' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
				<sch:assert test="count(tns:strasse) = 1" id="SCH-EZOLL-0085">[SCH-EZOLL-0085] Grunddaten: Das Element 'strasse' in 'natuerlichePerson' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/anschrift/hausnummer' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
				<sch:assert test="count(tns:hausnummer) = 1" id="SCH-EZOLL-0087">[SCH-EZOLL-0087] Grunddaten: Das Element 'hausnummer' in 'natuerlichePerson' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/anschrift/postleitzahl' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
				<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-EZOLL-0090">[SCH-EZOLL-0090] Grunddaten: Das Element 'postleitzahl' in 'natuerlichePerson' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>	
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/anschrift/ort' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
				<sch:assert test="count(tns:ort) = 1" id="SCH-EZOLL-0093">[SCH-EZOLL-0093] Grunddaten: Das Element 'ort' in 'natuerlichePerson' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'natuerlichePerson/telekommunikation' darf höchstens einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
				<sch:assert test="count(tns:telekommunikation)  &lt; 2" id="SCH-EZOLL-0095">[SCH-EZOLL-0095] Grunddaten: Das Element 'telekommunikation' in 'natuerlichePerson' darf höchstens einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/kurzbezeichnung' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
				<sch:assert test="count(tns:kurzbezeichnung) = 1" id="SCH-EZOLL-0098">[SCH-EZOLL-0098] Grunddaten: Das Element 'kurzbezeichnung' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/sitz' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
				<sch:assert test="count(tns:sitz) = 1" id="SCH-EZOLL-0100">[SCH-EZOLL-0100] Grunddaten: Das Element 'sitz' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/sitz/postleitzahl' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:sitz">
				<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-EZOLL-0103">[SCH-EZOLL-0103] Grunddaten: Das Element 'sitz/postleitzahl' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
				<sch:assert test="count(tns:anschrift) = 1" id="SCH-EZOLL-0105">[SCH-EZOLL-0105] Grunddaten: Das Element 'anschrift' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift/anschriftstyp' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
				<sch:assert test="count(tns:anschriftstyp) = 1" id="SCH-EZOLL-0108">[SCH-EZOLL-0108] Grunddaten: Das Element 'anschriftstyp' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift/anschriftenzusatz' darf höchstens einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
				<sch:assert test="count(tns:anschriftenzusatz)  &lt; 2" id="SCH-EZOLL-0110">[SCH-EZOLL-0110] Grunddaten: Das Element 'anschriftenzusatz' in 'organisation' darf höchstens einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift/strasse' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
				<sch:assert test="count(tns:strasse) = 1" id="SCH-EZOLL-0113">[SCH-EZOLL-0113] Grunddaten: Das Element 'strasse' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift/hausnummer' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
				<sch:assert test="count(tns:hausnummer) = 1" id="SCH-EZOLL-0115">[SCH-EZOLL-0115] Grunddaten: Das Element 'hausnummer' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift/postfachnummer' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
				<sch:assert test="count(tns:postfachnummer) = 1" id="SCH-EZOLL-0118">[SCH-EZOLL-0118] Grunddaten: Das Element 'postfachnummer' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>	
			
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift/postleitzahl' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
				<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-EZOLL-0120">[SCH-EZOLL-0120] Grunddaten: Das Element 'postleitzahl' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>	
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'organisation/anschrift/ort' muss genau einmal vorkommen -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
				<sch:assert test="count(tns:ort) = 1" id="SCH-EZOLL-0123">[SCH-EZOLL-0123] Grunddaten: Das Element 'ort' in 'organisation' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>


	<!-- individuelle Regeln - Nachrichten - Fachdaten -->
		<!-- nachricht.ezoll.auskunftsersuchen.2400002 -->
		<sch:pattern>
			<!-- Eingeschraenkte Werte zur Codeliste 'EZOLL.Forderung' im Element forderung.einordnung -->
			<sch:rule context="tns:nachricht.ezoll.auskunftsersuchen.2400002/tns:fachdaten/tns:voraussetzungenAuskunftsersuchen/tns:forderung.einordnung">
				<sch:assert test="code = ('001','002','003','004')" id="SCH-EZOLL-0125">[SCH-EZOLL-0125] Fachdaten: Es dürfen zum Element 'forderung.einordnung' nur folgende Codelistenschlüssel der Codeliste 'EZOLL.Forderung' genutzt werden:'001','002','003','004'!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Eingeschraenkte Werte zur Codeliste 'EZOLL.Forderung' im Element forderung.bezeichnung -->
			<sch:rule context="tns:nachricht.ezoll.auskunftsersuchen.2400002/tns:fachdaten/tns:voraussetzungenAuskunftsersuchen/tns:forderung.bezeichnung">
				<sch:assert test="not(code = ('001','002','003','004'))" id="SCH-EZOLL-0126">[SCH-EZOLL-0126] Fachdaten: Es dürfen zum Element 'forderung.bezeichnung' nur Codelistenschlüssel der Codeliste 'EZOLL.Forderung' ab '005' genutzt werden!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Wenn Einordnung der Forderung '001', dann dürfen bei Bezeichnung der Forderung nur angegeben werden: '005','006','007','008','009','015' -->
			<sch:rule context="tns:nachricht.ezoll.auskunftsersuchen.2400002/tns:fachdaten/tns:voraussetzungenAuskunftsersuchen">
				<sch:assert test="if (tns:forderung.einordnung/code = '001') then tns:forderung.bezeichnung/code = ('005','006','007','008','009','015') else true()" id="SCH-EZOLL-0127">[SCH-EZOLL-0127] Fachdaten: Wenn Einordnung der Forderung '001', dann dürfen bei Bezeichnung der Forderung nur angegeben werden: '005','006','007','008','009','015'!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<sch:pattern>
			<!-- Wenn Einordnung der Forderung '002', dann dürfen bei Bezeichnung der Forderung nur angegeben werden: '010','011','012','015' -->
			<sch:rule context="tns:nachricht.ezoll.auskunftsersuchen.2400002/tns:fachdaten/tns:voraussetzungenAuskunftsersuchen">
				<sch:assert test="if (tns:forderung.einordnung/code = '002') then tns:forderung.bezeichnung/code = ('010','011','012','015') else true()" id="SCH-EZOLL-0128">[SCH-EZOLL-0128] Fachdaten: Wenn Einordnung der Forderung '002', dann dürfen bei Bezeichnung der Forderung nur angegeben werden: '010','011','012','015'!</sch:assert>
			</sch:rule>
		</sch:pattern>

		<sch:pattern>
			<!-- Wenn Einordnung der Forderung '003', dann dürfen bei Bezeichnung der Forderung nur angegeben werden: '007','008','013','014','015' -->
			<sch:rule context="tns:nachricht.ezoll.auskunftsersuchen.2400002/tns:fachdaten/tns:voraussetzungenAuskunftsersuchen">
				<sch:assert test="if (tns:forderung.einordnung/code = '003') then tns:forderung.bezeichnung/code = ('007','008','013','014','015') else true()" id="SCH-EZOLL-0129">[SCH-EZOLL-0129] Fachdaten: Wenn Einordnung der Forderung '003', dann dürfen bei Bezeichnung der Forderung nur angegeben werden: '007','008','013','014','015'!</sch:assert>
			</sch:rule>
		</sch:pattern>



	<!-- eZOLL - CODELISTEN-GESCHAEFTSREGELN: -->
		<!-- eZOLL - ALLE Nachrichten -->
		<!-- 'Code.GDS.Ereignis.Typ3' -->
		<sch:pattern>
			<!-- Eingeschraenkte Werte zur Codeliste 'GDS.Ereignis' -->
			<sch:rule context="//tns:nachrichtenkopf/tns:ereignis">
				<sch:assert test="code = ('005','006','007','008','009','010','011','012','222','223')" id="SCH-EZOLL-0130">[SCH-EZOLL-0130] Codeliste: Es dürfen zum Nachrichtenkopf-Element 'ereignis' nur folgende Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' genutzt werden: '005','006','007','008','009,'010','011','012','222','223'!</sch:assert>
			</sch:rule>
		</sch:pattern>
	
		<!-- 'Code.GDS.Rollenbezeichnung.Typ3' -->
		<sch:pattern>
			<!-- Eingeschraenkte Werte zur Codeliste 'GDS.Rollenbezeichnung' -->
			<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle/tns:rollenbezeichnung">
				<sch:assert test="code = ('089','143','228','229','230')" id="SCH-EZOLL-0133">[SCH-EZOLL-0133] Codeliste: Es dürfen zum Nachrichtenkopf-Element 'rollenbezeichnung' nur folgende Codelistenschlüssel der Typ3-Codeliste 'GDS.Rollenbezeichnung' genutzt werden: '089','143','228','229','230'!</sch:assert>
			</sch:rule>
		</sch:pattern>
		

    
</sch:schema>