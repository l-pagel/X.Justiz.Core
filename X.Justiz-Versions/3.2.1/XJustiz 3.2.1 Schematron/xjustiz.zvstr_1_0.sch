<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz ZVSTR
    Version 1.0.2 (März 2021; 'SCH-ZVSTR-0075', SCH-ZVSTR-0100' korrigiert)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />
	
	<!-- ===================================== -->
	<!--          Fachdatensatz ZVSTR            -->
	<!-- ===================================== -->

	
	<!-- ZVSTR - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
		
		<!-- ZVSTR - NACHRICHTEN ALLE -->

		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen -->
			<sch:rule context="//tns:nachrichtenkopf">
				<sch:assert test="count(tns:aktenzeichen.absender) &lt; 2" id="SCH-ZVSTR-0001">[SCH-ZVSTR-0001] Nachrichtenkopf: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf höchstens einmal vorkommen -->
			<sch:rule context="//tns:nachrichtenkopf">
				<sch:assert test="count(tns:aktenzeichen.empfaenger) &lt; 2" id="SCH-ZVSTR-0002">[SCH-ZVSTR-0002] Nachrichtenkopf: Das Element 'aktenzeichen.empfaenger' darf höchstens einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen -->
			<sch:rule context="//tns:nachrichtenkopf">
				<sch:assert test="count(tns:ereignis) = 1" id="SCH-ZVSTR-0005">[SCH-ZVSTR-0005] Nachrichtenkopf: Das Element 'ereignis' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		
		<!-- /ZVSTR - NACHRICHTEN ALLE -->
		
		
	<!-- /ZVSTR - NACHRICHTENKOPF-GESCHAEFTSREGELN -->
	
	
	
	<!-- ZVSTR - GRUNDDATEN-GESCHAEFTSREGELN: -->
	
		<!-- ZVSTR - NACHRICHTEN ALLE -->
						
			<!-- Individuelle Rules -->
		
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'verfahrensdaten' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten">
					<sch:assert test="count(tns:verfahrensdaten) = 1" id="SCH-ZVSTR-0010">[SCH-ZVSTR-0010] Grunddaten: Das Element 'verfahrensdaten' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'verfahrensnummer' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:verfahrensnummer) = 1" id="SCH-ZVSTR-0015">[SCH-ZVSTR-0015] Grunddaten: Das Element 'verfahrensnummer' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'instanzdaten' muss genau zweimal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:instanzdaten) = 2" id="SCH-ZVSTR-0020">[SCH-ZVSTR-0020] Grunddaten: Das Element 'instanzdaten' muss genau zweimal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
				
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'beteiligung' muss mindestens zweimal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten">
					<sch:report test="count(tns:beteiligung) &lt; 2" id="SCH-ZVSTR-0025">[SCH-ZVSTR-0025] Grunddaten: Das Element 'beteiligung' muss mindestens zweimal vorkommen!</sch:report>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'instanznummer' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:instanznummer) = 1" id="SCH-ZVSTR-0030">[SCH-ZVSTR-0030] Grunddaten: Das Element 'instanznummer' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'sachgebiet' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:sachgebiet) = 1" id="SCH-ZVSTR-0035">[SCH-ZVSTR-0035] Grunddaten: Das Element 'sachgebiet' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
				
			<sch:pattern>
				<!-- Kardinalitaet: Das instanzdaten-Element 'aktenzeichen' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:aktenzeichen) = 1" id="SCH-ZVSTR-0040">[SCH-ZVSTR-0040] Grunddaten: Das instanzdaten-Element 'aktenzeichen' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rolle' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
					<sch:assert test="count(tns:rolle) = 1" id="SCH-ZVSTR-0045">[SCH-ZVSTR-0015] Grunddaten: Das Element 'rolle' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollennummer' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="count(tns:rollennummer) = 1" id="SCH-ZVSTR-0050">[SCH-ZVSTR-0050] Grunddaten: Das Element 'rollennummer' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollenbezeichnung' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="count(tns:rollenbezeichnung) = 1" id="SCH-ZVSTR-0055">[SCH-ZVSTR-0055] Grunddaten: Das Element 'rollenbezeichnung' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das ra.kanzlei-Element 'anschrift' muss mindestens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei">
					<sch:assert test="count(tns:anschrift) &gt; 0" id="SCH-ZVSTR-0060">[SCH-ZVSTR-0060] Grunddaten: Das ra.kanzlei-Element 'anschrift' muss mindestens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'weitererName' darf höchstens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName">
					<sch:assert test="count(tns:weitererName) &lt; 2" id="SCH-ZVSTR-0065">[SCH-ZVSTR-0065] Grunddaten: Das natuerlichePerson-Element 'weitererName' darf höchstens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'geschlecht' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:assert test="count(tns:geschlecht) = 1" id="SCH-ZVSTR-070">[SCH-ZVSTR-0070] Grunddaten: Das natuerlichePerson-Element 'geschlecht' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'anschrift' muss mindestens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:assert test="count(tns:anschrift) &gt; 0" id="SCH-ZVSTR-0075">[SCH-ZVSTR-0075] Grunddaten: Das natuerlichePerson-Element 'anschrift' muss mindestens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'staatsangehoerigkeit' darf höchstens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:assert test="count(tns:staatsangehoerigkeit) &lt; 2" id="SCH-ZVSTR-0080">[SCH-ZVSTR-0080] Grunddaten: Das natuerlichePerson-Element 'staatsangehoerigkeit' darf höchstens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'bankverbindung' darf höchstens zweimal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:assert test="count(tns:bankverbindung) &lt; 3" id="SCH-ZVSTR-0085">[SCH-ZVSTR-0085] Grunddaten: Das natuerlichePerson-Element 'bankverbindung' darf höchstens zweimal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'angabenZurRechtsform' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:assert test="count(tns:angabenZurRechtsform) = 1" id="SCH-ZVSTR-0090">[SCH-ZVSTR-0090] Grunddaten: Das organisation-Element 'angabenZurRechtsform' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'sitz' darf höchstens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:assert test="count(tns:sitz) &lt; 2" id="SCH-ZVSTR-0095">[SCH-ZVSTR-0095] Grunddaten: Das organisation-Element 'sitz' darf höchstens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'anschrift' muss mindestens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:assert test="count(tns:anschrift) &gt; 0" id="SCH-ZVSTR-0100">[SCH-ZVSTR-0100] Grunddaten: Das organisation-Element 'anschrift' muss mindestens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'bankverbindung' darf höchstens zweimal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:assert test="count(tns:bankverbindung) &lt; 3" id="SCH-ZVSTR-0105">[SCH-ZVSTR-0105] Grunddaten: Das organisation-Element 'bankverbindung' darf höchstens zweimal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<!-- /Individuelle Rules -->
		
		<!-- /ZVSTR - NACHRICHTEN ALLE -->
		
		
	<!-- /ZVSTR - GRUNDDATEN-GESCHAEFTSREGELN -->
		
	
</sch:schema>