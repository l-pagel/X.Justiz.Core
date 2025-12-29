<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Pruefung von Geschaeftsregeln fuer den XJustiz-Fachdatensatz VSTR
    Version 1.6 (Dezember 2024; Änderung: Bei Regel SCH-VSTR-0062 wird neben dem Element 'beteiligter' nun auch das Element 'polizeibehoerde' ausgeschlossen) 
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />
	
	<!-- ===================================== -->
	<!--          Fachdatensatz VSTR           -->
	<!-- ===================================== -->

	
	<!-- VSTR - NACHRICHTEN -->
		
		<!-- VSTR - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
		
			<!-- Abstrakte Rules -->
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf hoechstens einmal vorkommen (Nachrichten: 1, 2, 3, 6) -->
				<sch:rule id="SCH-VSTR-0001" abstract="true">
					<sch:assert test="count(tns:aktenzeichen.absender) &lt; 2" >[SCH-VSTR-0001] Nachrichtenkopf: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf hoechstens einmal vorkommen (Nachrichten: 4, 7) -->
				<sch:rule id="SCH-VSTR-0002" abstract="true">
					<sch:assert test="count(tns:aktenzeichen.empfaenger) &lt; 2" >[SCH-VSTR-0002] Nachrichtenkopf: Das Element 'aktenzeichen.empfaenger' darf höchstens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Abstrakte Rules -->
			
			
			<!-- Erweiterungen (extends) zu 'Abstrakte Rules' -->
			<sch:pattern>	
				<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf hoechstens einmal vorkommen (Nachrichten: 1, 2, 3, 6) -->
				<sch:rule context="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001/tns:nachrichtenkopf">
					<sch:extends rule="SCH-VSTR-0001"/>
				</sch:rule>
				<sch:rule context="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002/tns:nachrichtenkopf">
					<sch:extends rule="SCH-VSTR-0001"/>
				</sch:rule>
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003/tns:nachrichtenkopf">
					<sch:extends rule="SCH-VSTR-0001"/>
				</sch:rule>
				<sch:rule context="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006/tns:nachrichtenkopf">
					<sch:extends rule="SCH-VSTR-0001"/>
				</sch:rule>
				
				<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf hoechstens einmal vorkommen (Nachrichten: 4, 7) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004/tns:nachrichtenkopf">
					<sch:extends rule="SCH-VSTR-0002"/>
				</sch:rule>
				<sch:rule context="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007/tns:nachrichtenkopf">
					<sch:extends rule="SCH-VSTR-0002"/>
				</sch:rule>
			</sch:pattern>
			<!-- /Erweiterungen (extends) zu 'Abstrakte Rules' -->
			
			
			<!-- Individuelle Rules -->
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_absender' - Element 'absender.rvTraeger' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:nachrichtenkopf/tns:auswahl_absender">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:absender.rvTraeger) = 0) else true()" id="SCH-VSTR-0005">[SCH-VSTR-0005] Nachrichtenkopf: Das 'auswahl_absender' - Element 'absender.rvTraeger' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_absender' - Element 'absender.gericht' darf nicht vorkommen (nur Nachricht 5) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.abdrucke.0900005/tns:nachrichtenkopf/tns:auswahl_absender">
					<sch:assert test="count(tns:absender.gericht) = 0" id="SCH-VSTR-0006">[SCH-VSTR-0006] Nachrichtenkopf: Das 'auswahl_absender' - Element 'absender.gericht' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_absender' - Element 'absender.polizeibehoerde' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:nachrichtenkopf/tns:auswahl_absender">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:absender.polizeibehoerde) = 0) else true()" id="SCH-VSTR-0007">[SCH-VSTR-0007] Nachrichtenkopf: Das 'auswahl_absender' - Element 'absender.polizeibehoerde' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_empfaenger' - Element 'empfaenger.rvTraeger' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:nachrichtenkopf/tns:auswahl_empfaenger">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:empfaenger.rvTraeger) = 0) else true()" id="SCH-VSTR-0010">[SCH-VSTR-0010] Nachrichtenkopf: Das 'auswahl_empfaenger' - Element 'empfaenger.rvTraeger' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Individuelle Rules -->
				
				
			<!-- Abstrakte Pattern -->
			<sch:pattern id="SCH-VSTR-0011" abstract="true">
				<!-- Kardinalitaet: Das 'auswahl_empfaenger' - Element 'empfaenger.sonstige' darf nicht vorkommen (nur Nachrichten 1, 2, 3, 6) -->
				<sch:rule context="$pfadNachrichtAlleOhne04050708/tns:nachrichtenkopf/tns:auswahl_empfaenger">
					<sch:assert test="count(tns:empfaenger.sonstige) = 0">[SCH-VSTR-0011] Nachrichtenkopf: Das 'auswahl_empfaenger' - Element 'empfaenger.sonstige' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Abstrakte Pattern -->
				
				
			<!-- Individuelle Rules -->
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_empfaenger' - Element 'empfaenger.gericht' darf nicht vorkommen (nur Nachricht 5) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.abdrucke.0900005/tns:nachrichtenkopf/tns:auswahl_empfaenger">
					<sch:assert test="count(tns:empfaenger.gericht) = 0" id="SCH-VSTR-0015">[SCH-VSTR-0015] Nachrichtenkopf: Das 'auswahl_empfaenger' - Element 'empfaenger.gericht' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_empfaenger' - Element 'empfaenger.polizeibehoerde' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:nachrichtenkopf/tns:auswahl_empfaenger">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:empfaenger.polizeibehoerde) = 0) else true()" id="SCH-VSTR-0016">[SCH-VSTR-0016] Nachrichtenkopf: Das 'auswahl_empfaenger' - Element 'empfaenger.polizeibehoerde' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen (alle Nachrichten 1 bis 8) -->
				<sch:rule context="//tns:nachrichtenkopf">
					<sch:assert test="count(tns:ereignis) = 1" id="SCH-VSTR-0020">[SCH-VSTR-0020] Nachrichtenkopf: Das Element 'ereignis' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Individuelle Rules -->

	
			<!-- Parameter-Deklaration (param) zu 'Abstrakte Pattern' (Nachrichtenkopf) -->
	
				<!-- Nachrichten 1, 2, 3, 6: -->
				<sch:pattern is-a="SCH-VSTR-0011">
					<sch:param name="pfadNachrichtAlleOhne04050708" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0011">
					<sch:param name="pfadNachrichtAlleOhne04050708" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0011">
					<sch:param name="pfadNachrichtAlleOhne04050708" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0011">
					<sch:param name="pfadNachrichtAlleOhne04050708" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
	
			<!-- /Parameter-Deklaration (param) zu 'Abstrakte Pattern' (Nachrichtenkopf) -->
	
		<!-- /VSTR - NACHRICHTENKOPF-GESCHAEFTSREGELN -->
	
	
	
		<!-- VSTR - GRUNDDATEN-GESCHAEFTSREGELN: -->
	
			<!-- Individuelle Rules -->
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'verfahrensdaten' muss vorhanden sein (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:grunddaten">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then exists(tns:verfahrensdaten) else true()" id="SCH-VSTR-0050">[SCH-VSTR-0050] Grunddaten: Das optionale Element 'verfahrensdaten' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'verfahrensnummer' darf in den Grunddaten nicht vorkommen, da in den Fachdaten vorhanden (nur Nachricht 5) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.abdrucke.0900005/tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:verfahrensnummer) = 0" id="SCH-VSTR-0055">[SCH-VSTR-0055] Grunddaten: Das Element 'verfahrensnummer' darf in den Grunddaten nicht vorkommen, da in den Fachdaten vorhanden!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Individuelle Rules -->


			<!-- Abstrakte Pattern -->
			<sch:pattern id="SCH-VSTR-0056" abstract="true">
				<!-- Kardinalitaet: Das optionale Element 'verfahrensnummer' muss vorhanden sein (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="exists(tns:verfahrensnummer)">[SCH-VSTR-0056] Grunddaten: Das optionale Element 'verfahrensnummer' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
					
			<sch:pattern id="SCH-VSTR-0060" abstract="true">
				<!-- Kardinalitaet: Das Element 'instanzdaten' muss genau zweimal vorkommen (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:instanzdaten) = 2">[SCH-VSTR-0060] Grunddaten: Das Element 'instanzdaten' muss genau zweimal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Abstrakte Pattern -->
	
	
			<!-- Individuelle Rules -->
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'instanzdaten' darf nicht vorkommen (nur Nachricht 5) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.abdrucke.0900005/tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:instanzdaten) = 0" id="SCH-VSTR-0061">[SCH-VSTR-0061] Grunddaten: Das Element 'instanzdaten' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Individuelle Rules -->
	
	
			<!-- Abstrakte Pattern -->
			<sch:pattern id="SCH-VSTR-0062" abstract="true">
				<!-- Kardinalitaet: Die 'auswahl_instanzbehoerde' - Elemente 'beteiligter' und 'polizeibehoerde' dürfen nicht vorkommen! (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten/tns:auswahl_instanzbehoerde">
					<sch:assert test="count(tns:beteiligter) = 0 and count(tns:polizeibehoerde) = 0">
						[SCH-VSTR-0062] Grunddaten: Die 'auswahl_instanzbehoerde'-Elemente 'beteiligter' und 'polizeibehoerde' dürfen nicht vorkommen!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern id="SCH-VSTR-0063" abstract="true">
				<!-- Kardinalitaet: Das optionale Element 'aktenzeichen' in 'instanzdaten' muss vorhanden sein! (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:aktenzeichen) = 1">[SCH-VSTR-0063] Grunddaten: Das optionale Element 'aktenzeichen' in 'instanzdaten' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern id="SCH-VSTR-0065" abstract="true">
				<!-- Kardinalitaet: Das optionale Element 'instanznummer' in 'instanzdaten' muss vorhanden sein! (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:instanznummer) = 1">[SCH-VSTR-0065] Grunddaten: Das optionale Element 'instanznummer' in 'instanzdaten' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern id="SCH-VSTR-0070" abstract="true">
				<!-- Kardinalitaet: Das optionale Element 'sachgebiet' in 'instanzdaten' muss vorhanden sein! (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:sachgebiet) = 1">[SCH-VSTR-0070] Grunddaten: Das optionale Element 'sachgebiet' in 'instanzdaten' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern id="SCH-VSTR-0075" abstract="true">
				<!-- Kardinalitaet: Das 'auswahl_aktenzeichen' - Element 'aktenzeichen.strukturiert' darf nicht vorkommen (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten/tns:aktenzeichen/tns:auswahl_aktenzeichen">
					<sch:assert test="count(tns:aktenzeichen.strukturiert) = 0">[SCH-VSTR-0075] Grunddaten: Das 'auswahl_aktenzeichen' - Element 'aktenzeichen.strukturiert' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern id="SCH-VSTR-0080" abstract="true">
				<!-- Kardinalitaet: Das Element 'beteiligung' muss genau einmal vorkommen (alle Nachrichten ausser Nachricht 5 und 8) -->
				<sch:rule context="$pfadNachrichtAlleOhne0508/tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:beteiligung) = 1">[SCH-VSTR-0080] Grunddaten: Das Element 'beteiligung' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			<!-- /Abstrakte Pattern -->
			
			
			<!-- Individuelle Rules -->
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rolle' muss genau einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:rolle) = 1) else true()" id="SCH-VSTR-0086">[SCH-VSTR-0086] Grunddaten: Das Element 'rolle' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollennummer' muss genau einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:rollennummer) = 1) else true()" id="SCH-VSTR-0090">[SCH-VSTR-0090] Grunddaten: Das Element 'rollennummer' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollenbezeichnung' muss genau einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:rollenbezeichnung) = 1) else true()" id="SCH-VSTR-0095">[SCH-VSTR-0095] Grunddaten: Das Element 'rollenbezeichnung' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'beteiligtennummer' muss in den Grunddaten vorkommen wegen der Referenz aus den Fachdaten (Element 'beteiligter.referenz') heraus (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:beteiligtennummer) = 1) else true()" id="SCH-VSTR-0100">[SCH-VSTR-0100] Grunddaten: Das Element 'beteiligtennummer' muss in den Grunddaten vorkommen wegen der Referenz aus den Fachdaten heraus (Element 'beteiligter.referenz')!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_beteiligter' - Element 'ra.kanzlei' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:ra.kanzlei) = 0) else true()" id="SCH-VSTR-0105">[SCH-VSTR-0105] Grunddaten: Das 'auswahl_beteiligter' - Element 'ra.kanzlei' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'vorname' in 'vollerName' zu 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:vorname) = 1) else true()" id="SCH-VSTR-0110">[SCH-VSTR-0110] Grunddaten: Das optionale Element 'vorname' in 'vollerName' zu 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'geburt' in 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:geburt) = 1) else true()" id="SCH-VSTR-0115">[SCH-VSTR-0115] Grunddaten: Das optionale Element 'geburt' in 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'geschlecht' in 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:geschlecht) = 1) else true()" id="SCH-VSTR-0130">[SCH-VSTR-0130] Grunddaten: Das optionale Element 'geschlecht' in 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'anschrift' in 'natuerlichePerson' muss mindestens einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:anschrift) &gt; 0) else true()" id="SCH-VSTR-0135">[SCH-VSTR-0135] Grunddaten: Das Element 'anschrift' in 'natuerlichePerson' muss mindestens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'anschriftstyp' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:anschriftstyp) = 1) else true()" id="SCH-VSTR-0140">[SCH-VSTR-0140] Grunddaten: Das optionale Element 'anschriftstyp' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'anschriftenzusatz' in 'anschrift' zu 'natuerlichePerson' darf höchstens einmal vorkommen! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:anschriftenzusatz) &lt; 2) else true()" id="SCH-VSTR-0145">[SCH-VSTR-0145] Grunddaten: Das optionale Element 'anschriftenzusatz' in 'anschrift' zu 'natuerlichePerson' darf höchstens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'strasse' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:strasse) = 1) else true()" id="SCH-VSTR-0150">[SCH-VSTR-0150] Grunddaten: Das optionale Element 'strasse' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'hausnummer' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:hausnummer) = 1) else true()" id="SCH-VSTR-0155">[SCH-VSTR-0155] Grunddaten: Das optionale Element 'hausnummer' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'postleitzahl' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:postleitzahl) = 1) else true()" id="SCH-VSTR-0160">[SCH-VSTR-0160] Grunddaten: Das optionale Element 'postleitzahl' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'ort' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:ort) = 1) else true()" id="SCH-VSTR-0165">[SCH-VSTR-0165] Grunddaten: Das optionale Element 'ort' in 'anschrift' zu 'natuerlichePerson' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_auskunftssperre' - Element 'auskunftssperre.details' in 'natuerlichePerson' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:auswahl_auskunftssperre">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then not(exists(tns:auskunftssperre.details)) else true()" id="SCH-VSTR-0175">[SCH-VSTR-0175] Grunddaten: Das 'auswahl_auskunftssperre' - Element 'auskunftssperre.details' in 'natuerlichePerson' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'angabenZurRechtsform' in 'organisation' muss genau einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:angabenZurRechtsform) = 1) else true()" id="SCH-VSTR-0180">[SCH-VSTR-0180] Grunddaten: Das Element 'angabenZurRechtsform' in 'organisation' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'sitz' in 'organisation' muss mindestens einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:sitz) &gt; 0) else true()" id="SCH-VSTR-0185">[SCH-VSTR-0185] Grunddaten: Das Element 'sitz' in 'organisation' muss mindestens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_registerbehoerde' - Element 'auslaendischeRegisterbehoerde' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:auswahl_registerbehoerde">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:auslaendischeRegisterbehoerde) = 0) else true()" id="SCH-VSTR-0190">[SCH-VSTR-0190] Grunddaten: Das 'auswahl_registerbehoerde' - Element 'auslaendischeRegisterbehoerde' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'registerart' unterhalb von 'inlaendischesRegistergericht' in 'organisation' muss genau einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:registereintragung/tns:auswahl_registerbehoerde/tns:inlaendischesRegistergericht">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:registerart) = 1) else true()" id="SCH-VSTR-0195">[SCH-VSTR-0195] Grunddaten: Das Element 'registerart' unterhalb von 'inlaendischesRegistergericht' in 'organisation' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'registernummer' in 'organisation' muss genau einmal vorkommen soweit es sich um ein inländisches Registergericht handelt (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:registereintragung[tns:auswahl_registerbehoerde/tns:inlaendischesRegistergericht]">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:registernummer) = 1) else true()" id="SCH-VSTR-0200">[SCH-VSTR-0200] Grunddaten: Das Element 'registernummer' in 'organisation' muss genau einmal vorkommen soweit es sich um ein inländisches Registergericht handelt!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'anschrift' in 'organisation' muss mindestens einmal vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:anschrift) &gt; 0) else true()" id="SCH-VSTR-0205">[SCH-VSTR-0205] Grunddaten: Das Element 'anschrift' in 'organisation' muss mindestens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'anschriftstyp' in 'anschrift' zu 'organisation' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:anschriftstyp) = 1) else true()" id="SCH-VSTR-0210">[SCH-VSTR-0210] Grunddaten: Das optionale Element 'anschriftstyp' in 'anschrift' zu 'organisation' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'anschriftenzusatz' in 'anschrift' zu 'organisation' darf hoechstens einmal vorkommen! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:anschriftenzusatz) &lt; 2) else true()" id="SCH-VSTR-0215">[SCH-VSTR-0215] Grunddaten: Das optionale Element 'anschriftenzusatz' in 'anschrift' zu 'organisation' darf höchstens einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'strasse' in 'anschrift' zu 'organisation' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:strasse) = 1) else true()" id="SCH-VSTR-0220">[SCH-VSTR-0220] Grunddaten: Das optionale Element 'strasse' in 'anschrift' zu 'organisation' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'hausnummer' in 'anschrift' zu 'organisation' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:hausnummer) = 1) else true()" id="SCH-VSTR-0225">[SCH-VSTR-0225] Grunddaten: Das optionale Element 'hausnummer' in 'anschrift' zu 'organisation' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'postleitzahl' in 'anschrift' zu 'organisation' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:postleitzahl) = 1) else true()" id="SCH-VSTR-0230">[SCH-VSTR-0230] Grunddaten: Das optionale Element 'postleitzahl' in 'anschrift' zu 'organisation' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das optionale Element 'ort' in 'anschrift' zu 'organisation' muss vorhanden sein! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:ort) = 1) else true()" id="SCH-VSTR-0235">[SCH-VSTR-0235] Grunddaten: Das optionale Element 'ort' in 'anschrift' zu 'organisation' muss vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'terminsdaten' (vormals 'auswahl_termin') darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:terminsdaten) = 0) else true()" id="SCH-VSTR-0300">[SCH-VSTR-0300] Grunddaten: Das Element 'terminsdaten' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<!-- /Individuelle Rules -->

	
			<!-- Parameter-Deklaration (param) zu 'Abstrakte Pattern' (Grunddaten) -->
			
				<!-- Nachricht 0900001: -->
				<sch:pattern is-a="SCH-VSTR-0056">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0060">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0062">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0063">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0065">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0070">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0075">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0080">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001"/>
				</sch:pattern>
	
				<!-- Nachricht 0900002: -->
				<sch:pattern is-a="SCH-VSTR-0056">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0060">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0062">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0063">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0065">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0070">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0075">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0080">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002"/>
				</sch:pattern>
	
				<!-- Nachricht 0900003: -->
				<sch:pattern is-a="SCH-VSTR-0056">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0060">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0062">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0063">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0065">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0070">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0075">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0080">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003"/>
				</sch:pattern>
				
				<!-- Nachricht 0900004: -->
				<sch:pattern is-a="SCH-VSTR-0056">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0060">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0062">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0063">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0065">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0070">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0075">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0080">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004"/>
				</sch:pattern>
				
				<!-- Nachricht 0900006: -->
				<sch:pattern is-a="SCH-VSTR-0056">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0060">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0062">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0063">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0065">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0070">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0075">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0080">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006"/>
				</sch:pattern>
				
				<!-- Nachricht 0900007: -->
				<sch:pattern is-a="SCH-VSTR-0056">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0060">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0062">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0063">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0065">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0070">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0075">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-VSTR-0080">
					<sch:param name="pfadNachrichtAlleOhne0508" value="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007"/>
				</sch:pattern>
			
			<!-- /Parameter-Deklaration (param) zu 'Abstrakte Pattern' (Grunddaten) -->
	
		
		<!-- /VSTR - GRUNDDATEN-GESCHAEFTSREGELN -->
		
		
		
		<!-- VSTR - SGO-GESCHAEFTSREGELN: -->
		
			<!-- z.Zt. keine 'business rules' -->
		
		<!-- /VSTR - SGO-GESCHAEFTSREGELN: -->
		
		
		
		<!-- VSTR - FACHDATEN-GESCHAEFTSREGELN: -->

			<sch:pattern>
				<!-- Kardinalitaet: Das 'auswahl_aktenzeichen' - Element 'aktenzeichen.strukturiert' darf nicht vorkommen (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:fachdaten//tns:auswahl_aktenzeichen" id="SCH-VSTR-0400">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then (count(tns:aktenzeichen.strukturiert) = 0) else true()">[SCH-VSTR-0400] Fachdaten: Das 'auswahl_aktenzeichen' - Element 'aktenzeichen.strukturiert' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			   
		<!-- /VSTR - FACHDATEN-GESCHAEFTSREGELN -->
		
		
		
		<!-- VSTR - CODELISTEN-GESCHAEFTSREGELN: -->
			
			<!-- 'Code.GDS.Ereignis.Typ3' -->
			<sch:pattern >
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '098|Entscheidung Schuldnerwiderspruch' (nur Nachricht 1) -->
				<sch:rule context="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '098'" id="SCH-VSTR-0501">[SCH-VSTR-0501] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'098'!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern >
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '099|Entscheidung Schuldnerwiderspruch Verarbeitungsbestätigung' (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '099'" id="SCH-VSTR-0502">[SCH-VSTR-0502] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'099'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern >
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '100|Schuldnerverzeichnis Eintragung Korrektur' (nur Nachricht 3) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '100'" id="SCH-VSTR-0503">[SCH-VSTR-0503] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'100'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern >
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '101|Schuldnerverzeichnis Verarbeitungsbestätigung Portal' (nur Nachricht 4) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '101'" id="SCH-VSTR-0504">[SCH-VSTR-0504] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'101'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '102|Schuldnerverzeichnisabdrucke' (nur Nachricht 5) -->
				<sch:rule context="tns:nachricht.vstr.schuldnerverzeichnis.abdrucke.0900005/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '102'" id="SCH-VSTR-0505">[SCH-VSTR-0505] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur den folgenden Wert haben: '102'!</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern >
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '103|Vermögensverzeichnis Übermittlung Korrektur' (nur Nachricht 6) -->
				<sch:rule context="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '103'" id="SCH-VSTR-0506">[SCH-VSTR-0506] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'103'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern >
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '104|Vermögensverzeichnis Übermittlungsbestätigung Portal' (nur Nachricht 7) -->
				<sch:rule context="tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '104'" id="SCH-VSTR-0507">[SCH-VSTR-0507] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'104'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern >
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '011|Fehler aufgetreten' (nur Nachricht 8) -->
				<sch:rule context="tns:nachricht.vstr.fehlermeldung.0900008/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '011'" id="SCH-VSTR-0508">[SCH-VSTR-0508] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'011'!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
	
			<!-- 'Code.GDS.Rollenbezeichnung.Typ3' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung'; nur Schlüssel|Wert '143|Schuldner(in)' (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligung/tns:rolle/tns:rollenbezeichnung">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then code = '143' else true()" id="SCH-VSTR-0520">[SCH-VSTR-0520] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Rollenbezeichnung' zum Element 'rollenbezeichnung' darf nur den folgenden Wert haben:'143'!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
				
			<!-- 'Code.GDS.Sachgebiet.Typ3' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Sachgebiet'; nur Schlüssel|Wert  '032|Schuldnerverzeichnissachen' und '050|Zwangsvollstreckungssachen' (nur Nachricht 1 und 2) -->
				<sch:rule context="//tns:sachgebiet">
					<sch:assert test="if (ancestor::tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.0900001|ancestor::tns:nachricht.vstr.entscheidung.schuldnerwiderspruch.eintragungsbestaetigung.0900002) then code = ('032','050') else true()" id="SCH-VSTR-0530">[SCH-VSTR-0530] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Sachgebiet' zum Element 'sachgebiet' darf nur folgende Werte haben:'032' oder'050'!</sch:assert>
				</sch:rule>
			</sch:pattern>
				
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Sachgebiet'; nur Schlüssel|Wert '018|Insolvenzsachen' und '032|Schuldnerverzeichnissachen' (nur Nachrichten 3 und 4) -->
				<sch:rule context="//tns:sachgebiet">
					<sch:assert test="if (ancestor::tns:nachricht.vstr.schuldnerverzeichnis.eintragung.korrektur.0900003|ancestor::tns:nachricht.vstr.schuldnerverzeichnis.verarbeitungsbestaetigung.portal.0900004) then code = ('018','032') else true()" id="SCH-VSTR-0532">[SCH-VSTR-0532] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Sachgebiet' zum Element 'sachgebiet' darf nur folgende Werte haben:'018' oder '032'!</sch:assert>
				</sch:rule>
			</sch:pattern>
				
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Sachgebiet'; nur Schlüssel|Wert '042|Vermögensverzeichnissachen' (nur Nachrichten 6 und 7) -->
				<sch:rule context="//tns:sachgebiet">
					<sch:assert test="if (ancestor::tns:nachricht.vstr.vermoegensverzeichnis.uebermittlung.korrektur.0900006|ancestor::tns:nachricht.vstr.vermoegensverzeichnis.uebermittlungsbestaetigung.portal.0900007) then code = '042' else true()" id="SCH-VSTR-0533">[SCH-VSTR-0533] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Sachgebiet' zum Element 'sachgebiet' darf nur den folgenden Wert haben:'042'!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
	
			<!-- 'Code.GDS.Registerart' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Registerart'; nur Schlüssel|Wert 'GnR|Genossenschaftsregister (AG)', 'HRA|Handelsregister (Einzelkaufleute, Personengesellschaften) (AG)', 'HRB|Handelsregister (Kapitalgesellschaften) (AG)', 'PR|Partnerschaftsregister (AG)', 'VR|Vereinsregister' und 'GsR|Gesellschaftsregister' (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:registerart">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then code = ('GnR','GsR','HRA','HRB','PR','VR') else true()" id="SCH-VSTR-0535">[SCH-VSTR-0535] Codeliste: Der Codelistenschlüssel der Typ1-Codeliste 'GDS.Registerart' zum Element 'registerart' darf nur folgende Werte haben:'GnR','HRA','HRB','PR','VR' oder 'GsR'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			
			<!-- 'Code.GDS.Rechtsform.Typ3' (Typ3 - Codeliste 'Rechtsformen') -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'Rechtsformen' (XUnternehmen); der verwendete Code der Codespalte zur Typ3-Codeliste 'Rechtsformen' (XUnternehmen) beim Element 'rechtsform' (unterhalb von 'angabenZurRechtsform' in 'organisation') darf nicht '681000' oder '682000' enthalten bzw. nicht die Zeichenkette 'Freitext' aus der Spalte 'Bezeichnung-kurz' enthalten! (alle Nachrichten ausser 0900008) -->
				<sch:rule context="//tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:angabenZurRechtsform/tns:rechtsform">
					<sch:assert test="if (not(ancestor::tns:nachricht.vstr.fehlermeldung.0900008)) then not(matches(code, '^(Freitext|Freitext +.*|681000|682000)$')) else true()" id="SCH-VSTR-0540">[SCH-VSTR-0540] Codeliste: Der verwendete Code der Codespalte zur Typ3-Codeliste 'Rechtsformen' (XUnternehmen) beim Element 'rechtsform' (unterhalb von 'angabenZurRechtsform' in 'organisation') darf nicht '681000' oder '682000' enthalten bzw. nicht die Zeichenkette 'Freitext' aus der Spalte 'Bezeichnung-kurz' enthalten!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
		<!-- /VSTR - CODELISTEN-GESCHAEFTSREGELN -->


	<!-- /VSTR - NACHRICHTEN  -->
		
	
</sch:schema>