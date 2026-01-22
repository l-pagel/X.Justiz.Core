<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Pruefung von Geschaeftsregeln fuer den XJustiz-Fachdatensatz ZSSR
    Version 1.4 (Änderungen: CR 24/020 und CR 24/022)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />
	
	<!-- ===================================== -->
	<!--          Fachdatensatz ZSSR           -->
	<!-- ===================================== -->


	<!-- ZSSR - NACHRICHTEN -->

			<!-- ZSSR - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
		
				<!-- Abstrakte Rules -->
				
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf hoechstens einmal vorkommen (nur Nachrichten: 2, 5) -->
						<sch:rule id="SCH-ZSSR-0001" abstract="true">
							<sch:assert test="count(tns:aktenzeichen.absender) &lt; 2" >[SCH-ZSSR-0001] Nachrichtenkopf: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf hoechstens einmal vorkommen (nur Nachrichten: 1, 3, 4) -->
						<sch:rule id="SCH-ZSSR-0002" abstract="true">
							<sch:assert test="count(tns:aktenzeichen.empfaenger) &lt; 2" >[SCH-ZSSR-0002] Nachrichtenkopf: Das Element 'aktenzeichen.empfaenger' darf höchstens einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
				<!-- /Abstrakte Rules -->
				
				
				<!-- Erweiterungen (extends)-->
				
					<sch:pattern>	
						<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf hoechstens einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:nachrichtenkopf">
							<sch:extends rule="SCH-ZSSR-0001"/>
						</sch:rule>
						
						<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:nachrichtenkopf">
							<sch:extends rule="SCH-ZSSR-0001"/>
						</sch:rule>
						
						<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf hoechstens einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.bestaetigung.2300001/tns:nachrichtenkopf">
							<sch:extends rule="SCH-ZSSR-0002"/>
						</sch:rule>
						
						<sch:rule context="tns:nachricht.zssr.fehlermeldung.2300003/tns:nachrichtenkopf">
							<sch:extends rule="SCH-ZSSR-0002"/>
						</sch:rule>
						
						<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:nachrichtenkopf">
							<sch:extends rule="SCH-ZSSR-0002"/>
						</sch:rule>
					</sch:pattern>
					
				<!-- /Erweiterungen (extends) -->
			
			<!-- /ZSSR - NACHRICHTENKOPF-GESCHAEFTSREGELN -->
			
			
			
			<!-- ZSSR - GRUNDDATEN-GESCHAEFTSREGELN: -->
	
				<!-- Abstrakte Pattern -->
				
					<sch:pattern id="SCH-ZSSR-0003" abstract="true">
						<!-- Pattern: Das Element 'strasse' darf max. 35 Zeichen haben ({1,35}) (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:strasse">
							<sch:assert test="matches(., '^.{1,35}$')">[SCH-ZSSR-0003] Grunddaten: Das Element 'strasse' darf max. 35 Zeichen haben!</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0004" abstract="true">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfuellen: 5 Ziffern, nur Ziffern, PLZ groesser als '00999' (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:postleitzahl"> 
							<sch:assert test="matches(., '^\d{5}$') and . &gt; 999">[SCH-ZSSR-0004] Grunddaten: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999'!</sch:assert>
							<!-- alternativ, soweit von Schematron-Validator unterstuetzt: <sch:assert test="matches(., '^(?!00)\d{5}$', 'i;j')">[SCH-ZSSR-0004] Grunddaten: Eine deutsche Postleitzahl muss folgende Bedingungen erfuellen: 5 Ziffern, nur Ziffern, PLZ größer als '00999'!</sch:assert> -->
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern id="SCH-ZSSR-0005" abstract="true">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen haben und muss mit einem Grossbuchstaben der 'DIN SPEC 91379 Datentyp B' beginnen! (Nicht notwendigerweise nur von A bis Z - auch auslaendisch, wie z.B. Ø (skandinavisch) erlaubt!) (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:ort">
							<sch:assert test="matches(., '^\p{Lu}') and matches(., '^.{1,26}$')">[SCH-ZSSR-0005] Grunddaten: Das Element 'ort' darf max. 26 Zeichen haben und muss mit einem Großbuchstaben der 'DIN SPEC 91379 Datentyp B' beginnen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern id="SCH-ZSSR-0006" abstract="true">
						<!-- Pattern: Das Element 'gegenstand' darf max. 500 Zeichen haben ({1,500}) (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:gegenstand">
							<sch:assert test="matches(., '^.{1,500}$')">[SCH-ZSSR-0006] Grunddaten: Das Element 'gegenstand' darf max. 500 Zeichen haben!</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0007" abstract="true">
						<!-- Pattern: Das Element 'titel' darf max. 25 Zeichen haben ({1,25}) (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:titel">
							<sch:assert test="matches(., '^.{0,25}$')">[SCH-ZSSR-0007] Grunddaten: Das Element 'titel' darf max. 25 Zeichen haben!</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0008" abstract="true">
						<!-- Pattern: Das Element 'vorname' darf max. 35 Zeichen haben ({1,35}) (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:vorname">
							<sch:assert test="matches(., '^.{1,35}$')">[SCH-ZSSR-0008] Grunddaten: Das Element 'vorname' darf max. 35 Zeichen haben!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern id="SCH-ZSSR-0009" abstract="true">
						<!-- Pattern: Das Element 'rufname' darf max. 35 Zeichen haben ({1,35}) (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:rufname">
							<sch:assert test="matches(., '^.{0,35}$')">[SCH-ZSSR-0009] Grunddaten: Das Element 'rufname' darf max. 35 Zeichen haben!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern id="SCH-ZSSR-0010" abstract="true">
						<!-- Pattern: Das Element 'nachname' darf max. 35 Zeichen haben ({1,35}) (nur Nachricht: 2) -->
						<sch:rule context="$pfadNachricht2300002/tns:nachname">
							<sch:assert test="matches(., '^.{1,35}$')">[SCH-ZSSR-0010] Grunddaten: Das Element 'nachname' darf max. 35 Zeichen haben!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
				<!-- /Abstrakte Pattern -->
			

				<!-- Parameter-Deklaration (param) -->
				
					<sch:pattern is-a="SCH-ZSSR-0003">
						<!-- Pattern: Das Element 'strasse' darf max. 35 Zeichen haben {1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift"/>
					</sch:pattern>
					
					<sch:pattern is-a="SCH-ZSSR-0003">
						<!-- Pattern: Das Element 'strasse' darf max. 35 Zeichen haben ({1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift"/>
					</sch:pattern>
					
					<sch:pattern is-a="SCH-ZSSR-0003">
						<!-- Pattern: Das Element 'strasse' darf max. 35 Zeichen haben ({1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0003">
						<!-- Pattern: Das Element 'strasse' darf max. 35 Zeichen haben ({1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfuellen: 5 Ziffern, nur Ziffern, PLZ groesser als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift[tns:staat/code = '000']"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfuellen: 5 Ziffern, nur Ziffern, PLZ groesser als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift[tns:staat/code = '000']"/>
					</sch:pattern>	
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfuellen: 5 Ziffern, nur Ziffern, PLZ groesser als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift[tns:staat/code = '000']"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfuellen: 5 Ziffern, nur Ziffern, PLZ groesser als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:sitz[tns:staat/code = '000']"/>
					</sch:pattern>							
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfuellen: 5 Ziffern, nur Ziffern, PLZ groesser als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift[tns:staat/code = '000']"/>
					</sch:pattern>	
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben und Bindestrich) haben und beginnt mit einem Grossbuchstaben (Grossbuchstabe zzgl. {0,25}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit einem Grossbuchstaben ({1,26}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift"/>
					</sch:pattern>

					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit einem Grossbuchstaben ({1,26}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit Grossbuchstaben ({1,26}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:sitz"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit einem Grossbuchstaben ({1,26}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0006">
						<!-- Pattern: Das Element 'gegenstand' darf max. 500 Zeichen haben ({1,500}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten/tns:verfahrensgegenstand"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0007">
						<!-- Pattern: Das Element 'titel' darf max. 25 Zeichen haben ({1,25}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0007">
						<!-- Pattern: Das Element 'titel' darf max. 25 Zeichen haben ({1,25}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0008">
						<!-- Pattern: Das Element 'vorname' darf max. 35 Zeichen haben {1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName"/>
					</sch:pattern>
					
					<sch:pattern is-a="SCH-ZSSR-0008">
						<!-- Pattern: Das Element 'vorname' darf max. 35 Zeichen haben {1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName"/>
					</sch:pattern>
				
					<sch:pattern is-a="SCH-ZSSR-0009">
						<!-- Pattern: Das Element 'rufname' darf max. 35 Zeichen haben {1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName"/>
					</sch:pattern>
					
					<sch:pattern is-a="SCH-ZSSR-0009">
						<!-- Pattern: Das Element 'rufname' darf max. 35 Zeichen haben {1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName"/>
					</sch:pattern>
				
					<sch:pattern is-a="SCH-ZSSR-0010">
						<!-- Pattern: Das Element 'nachname' darf max. 35 Zeichen haben {1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName"/>
					</sch:pattern>
					
					<sch:pattern is-a="SCH-ZSSR-0010">
						<!-- Pattern: Das Element 'nachname' darf max. 35 Zeichen haben {1,35}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName"/>
					</sch:pattern>
					
				<!-- /Parameter-Deklaration (param) -->
			
			
				<!-- Abstrakte Rules -->
				
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'verfahrensdaten' muss genau einmal vorkommen (nur Nachrichten: 2, 4) -->
						<sch:rule id="SCH-ZSSR-0020" abstract="true">
							<sch:assert test="count(tns:verfahrensdaten) = 1" >[SCH-ZSSR-0020] Grunddaten: Das Element 'verfahrensdaten' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'instanzdaten' muss genau einmal vorkommen (nur Nachrichten: 2, 4) -->
						<sch:rule id="SCH-ZSSR-0021" abstract="true">
							<sch:assert test="count(tns:instanzdaten) = 1" >[SCH-ZSSR-0021] Grunddaten: Das Element 'instanzdaten' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'verfahrensgegenstand' muss genau einmal vorkommen (nur Nachrichten: 2, 4) -->
						<sch:rule id="SCH-ZSSR-0022" abstract="true">
							<sch:assert test="count(tns:verfahrensgegenstand) = 1" >[SCH-ZSSR-0022] Grunddaten: Das Element 'verfahrensgegenstand' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
				<!-- /Abstrakte Rules -->
		
		
				<!-- Erweiterungen -->
				
					<!-- Kardinalitaet: Das Element 'verfahrensdaten' muss genau einmal vorkommen -->
					<sch:pattern>
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten">
							<sch:extends rule="SCH-ZSSR-0020"/>
						</sch:rule>
						<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:grunddaten">
							<sch:extends rule="SCH-ZSSR-0020"/>
						</sch:rule>
					</sch:pattern>
			
					<!-- Kardinalitaet: Das Element 'instanzdaten' muss genau einmal vorkommen -->
					<sch:pattern>
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten">
							<sch:extends rule="SCH-ZSSR-0021"/>
						</sch:rule>
						<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:grunddaten/tns:verfahrensdaten">
							<sch:extends rule="SCH-ZSSR-0021"/>
						</sch:rule>
					</sch:pattern>
			
					<!-- Kardinalitaet: Das Element 'verfahrensgegenstand' muss genau einmal vorkommen -->
					<sch:pattern>
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
							<sch:extends rule="SCH-ZSSR-0022"/>
						</sch:rule>
						<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
							<sch:extends rule="SCH-ZSSR-0022"/>
						</sch:rule>
					</sch:pattern>
					
				<!-- /Erweiterungen -->
		
		
				<!-- Individuelle Rules -->
				
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'aktenzeichen' muss genau einmal vorkommen (nur Nachricht: 4) -->
						<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
							<sch:assert test="count(tns:aktenzeichen) = 1" id="SCH-ZSSR-0045">[SCH-ZSSR-0045] Grunddaten: Das Element 'aktenzeichen' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>

					<sch:pattern>
						<!-- Kardinalitaet: Es muss mind. ein Antragssteller als Beteiligter (aus der Codeliste 'GDS.Rollenbezeichnung', Schluessel: 016) vorhanden sein (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten">
							<sch:assert test="count(tns:beteiligung[tns:rolle/tns:rollenbezeichnung/code = '016']) &gt; 0 or //tns:unbekannterAntragsteller = true()" id="SCH-ZSSR-0051">
								[SCH-ZSSR-0051] Grunddaten: Es muss mind. ein Beteiligter in der Rolle des Antragssteller (Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 016) vorhanden oder das Element 'unbekannterAntragsteller' gesetzt sein!
							</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Es muss mind. ein Antragsgegner als Beteiligter (aus der Codeliste 'GDS.Rollenbezeichnung', Schluessel: 015) vorhanden sein (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten">
							<sch:assert test="count(tns:beteiligung[tns:rolle/tns:rollenbezeichnung/code = '015']) &gt; 0" id="SCH-ZSSR-0052">[SCH-ZSSR-0052] Grunddaten: Es muss mind. ein Beteiligter in der Rolle des Antragsgegners (Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 015) vorhanden sein!</sch:assert>
						</sch:rule>
					</sch:pattern>

					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'rolle' muss mind. einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
							<sch:assert test="count(tns:rolle) &gt; 0" id="SCH-ZSSR-0055">[SCH-ZSSR-0055] Grunddaten: Das Element 'rolle' muss mindestens einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'rollennummer' muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
							<sch:assert test="count(tns:rollennummer) = 1" id="SCH-ZSSR-0060">[SCH-ZSSR-0060] Grunddaten: Das Element 'rollennummer' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'rollenbezeichnung' muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
							<sch:assert test="count(tns:rollenbezeichnung) = 1" id="SCH-ZSSR-0065">[SCH-ZSSR-0065] Grunddaten: Das Element 'rollenbezeichnung' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Eindeutige Nummer innerhalb der gleichen Rollenbezeichnung: Das Feld '//grunddaten/verfahrensdaten/beteiligung/rolle/nr' muss ueber alle Beteiligungen hinweg ('//grunddaten/verfahrensdaten/beteiligung') bei gleicher Rollenbezeichnung ('/rolle/rollenbezeichnung/code') eindeutig sein, wobei ein fehlendes Element 'nr' dem Wert '1' (Default-Wert) entspricht (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
							<sch:assert test="(count(//tns:rolle[tns:nr=current()/tns:nr and tns:rollenbezeichnung/code=current()/tns:rollenbezeichnung/code]) &lt; 2) and (count(//tns:rolle[(tns:nr='1' or not(exists(tns:nr))) and (current()/tns:nr='1' or not(exists(current()/tns:nr))) and tns:rollenbezeichnung/code=current()/tns:rollenbezeichnung/code]) &lt; 2)" id="SCH-ZSSR-0070">[SCH-ZSSR-0070] Grunddaten: Der Wert des Elements 'nr' zum Elternelement 'rolle' ist - über alle Beteiligungs - Rollen mit der gleichen Rollenbezeichnung hinweg - nicht eindeutig! (Hinweis: ein fehlendes Rollen - Element 'nr' entspricht einem vorhandenem Rollen - Element 'nr' mit dem Default-Wert '1'!)</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'beteiligtennummer' muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
							<sch:assert test="count(tns:beteiligtennummer) = 1" id="SCH-ZSSR-0075">[SCH-ZSSR-0075] Grunddaten: Das Element 'beteiligtennummer' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0080">[SCH-ZSSR-0080] Grunddaten: Das Element 'anschrift' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0085">[SCH-ZSSR-0085] Grunddaten: Das Element 'strasse' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0090">[SCH-ZSSR-0090] Grunddaten: Das Element 'postleitzahl' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0095">[SCH-ZSSR-0095] Grunddaten: Das Element 'ort' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0100">[SCH-ZSSR-0100] Grunddaten: Das Element 'staat' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'vorname' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName">
							<sch:assert test="count(tns:vorname) = 1" id="SCH-ZSSR-0110">[SCH-ZSSR-0110] Grunddaten: Das Element 'vorname' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>	
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0115">[SCH-ZSSR-0115] Grunddaten: Das Element 'anschrift' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0120">[SCH-ZSSR-0120] Grunddaten: Das Element 'strasse' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0125">[SCH-ZSSR-0125] Grunddaten: Das Element 'postleitzahl' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0130">[SCH-ZSSR-0130] Grunddaten: Das Element 'ort' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0135">[SCH-ZSSR-0135] Grunddaten: Das Element 'staat' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'vorname' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName">
							<sch:assert test="count(tns:vorname) = 1" id="SCH-ZSSR-0145">[SCH-ZSSR-0145] Grunddaten: Das Element 'vorname' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0150">[SCH-ZSSR-0150] Grunddaten: Das Element 'anschrift' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0155">[SCH-ZSSR-0155] Grunddaten: Das Element 'strasse' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0160">[SCH-ZSSR-0160] Grunddaten: Das Element 'postleitzahl' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>		
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0165">[SCH-ZSSR-0165] Grunddaten: Das Element 'ort' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0170">[SCH-ZSSR-0170] Grunddaten: Das Element 'staat' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'sitz' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
							<sch:assert test="count(tns:sitz) = 1" id="SCH-ZSSR-0180">[SCH-ZSSR-0180] Grunddaten: Das Element 'sitz' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0190">[SCH-ZSSR-0190] Grunddaten: Das Element 'anschrift' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschriftenzusatz' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:anschriftenzusatz) &lt; 2" id="SCH-ZSSR-0195">[SCH-ZSSR-0195] Grunddaten: Das Element 'anschriftenzusatz' darf höchstens einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0200">[SCH-ZSSR-0200] Grunddaten: Das Element 'strasse' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0205">[SCH-ZSSR-0205] Grunddaten: Das Element 'postleitzahl' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0210">[SCH-ZSSR-0210] Grunddaten: Das Element 'ort' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0215">[SCH-ZSSR-0215] Grunddaten: Das Element 'staat' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'angabenZurRechtsform' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen (nur Nachricht: 2) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
							<sch:assert test="count(tns:angabenZurRechtsform) = 1" id="SCH-ZSSR-0225">[SCH-ZSSR-0225] Grunddaten: Das Element 'angabenZurRechtsform' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
		
				<!-- /Individuelle Rules -->
				
				
				<!-- Abstrakte Rules -->
				
				<sch:pattern id="SCH-ZSSR-0230" abstract="true">
					<!-- Sicherstellung des neuen 'DESTATIS-BEV-Code' - Codes gemaess Codeliste 'BfJ Staat' zu den Elementen 'staat' ('ausstellenderStaat', 'staatsangehoerigkeit', 'herkunftsland'):  genau 3 Ziffern, nur Ziffern (numerisch) (nur Nachrichten: 2, 4) -->
					<sch:rule context="$pfadNachricht2300002_2300004//tns:staat|$pfadNachricht2300002_2300004//tns:staatsangehoerigkeit|$pfadNachricht2300002_2300004//tns:herkunftsland|$pfadNachricht2300002_2300004//tns:ausstellenderStaat">
						<sch:assert test="matches(code, '^\d{3}$')">[SCH-ZSSR-0230] Grunddaten: Der Codelistenschlüssel der Typ3-Codeliste 'BfJ Staat' zu den Elementen 'staat' ('ausstellenderStaat', 'staatsangehoerigkeit', 'herkunftsland') muss numerisch und dreistellig sein (Codespalte 'DESTATIS-BEV-Code'; z.B. '000' für Deutschland)!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<!-- /Abstrakte Rules -->
				
				
				<!-- Erweiterungen (extends)-->
				
				<sch:pattern is-a="SCH-ZSSR-0230">
					<!-- Sicherstellung des neuen 'DESTATIS-BEV-Code' - Codes gemaess Codeliste 'BfJ Staat' zu den Elementen 'staat' ('ausstellenderStaat', 'staatsangehoerigkeit', 'herkunftsland'):  genau 3 Ziffern, nur Ziffern (numerisch) -->
					<sch:param name="pfadNachricht2300002_2300004" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002"/>
				</sch:pattern>
	
				<sch:pattern is-a="SCH-ZSSR-0230">
					<!-- Sicherstellung des neuen 'DESTATIS-BEV-Code' - Codes gemaess Codeliste 'BfJ Staat' zu den Elementen 'staat' ('ausstellenderStaat', 'staatsangehoerigkeit', 'herkunftsland'):  genau 3 Ziffern, nur Ziffern (numerisch) -->
					<sch:param name="pfadNachricht2300002_2300004" value="tns:nachricht.zssr.mitteilungEinschlaegig.2300004"/>
				</sch:pattern>
				
				<!-- /Erweiterungen (extends)-->
				
				
				<!-- Individuelle Rules -->
				
				<sch:pattern>
					<!-- Eindeutige Beteiligtennummer: Das Element '//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:beteiligtennummer' muss unter allen Beteiligungen eindeutig sein (nur Nachricht: 2) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
						<sch:assert test="count(//tns:beteiligter[tns:beteiligtennummer=current()/tns:beteiligtennummer]) &lt; 2" id="SCH-ZSSR-0235">[SCH-ZSSR-0235] Grunddaten: Der Wert zum  Element 'beteiligtennummer' ist unter allen Beteiligungen nicht eindeutig!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eindeutige Rollennummer: Das Element '//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle/tns:rollennummer' muss innerhalb aller Rollen eindeutig sein (nur Nachricht: 2) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
						<sch:assert test="count(//tns:rolle[tns:rollennummer=current()/tns:rollennummer]) &lt; 2" id="SCH-ZSSR-0240">[SCH-ZSSR-0240] Grunddaten: Der Wert zum  Element 'rollennummer' ist innerhalb aller Rollen nicht eindeutig!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Zuweisung des Prozessbevollmaechtigten: Das Element '//grunddaten/verfahrensdaten/beteiligung/rolle' mit der Rollenbezeichnung ('/rollenbezeichnung') '132|Prozessbevollmächtigter' muss das Kindelement '/referenz/ref.rollennummer' aufweisen (nur Nachricht: 2) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
						<sch:assert test="if (tns:rollenbezeichnung/code = '132') then exists(tns:referenz/tns:ref.rollennummer) else true()" id="SCH-ZSSR-0245">[SCH-ZSSR-0245] Grunddaten: Das Element '/grunddaten/verfahrensdaten/beteiligung/rolle' mit der Rollenbezeichnung ('/rollenbezeichnung') '132|Prozessbevollmächtigter' muss das Kindelement '/referenz/ref.rollennummer' aufweisen!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Aufloesung der Referenzen zwischen Rollen: Das Element '//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle/tns:referenz/tns:ref.rollennummer' muss in seinem Wert dem Element '/tns:rollennummer' eines anderen Elternelements '//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle' entsprechen (nur Nachricht: 2) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle/tns:referenz/tns:ref.rollennummer">
						<sch:assert test="exists(//tns:rolle[tns:rollennummer=current() and not(current()/../../tns:rollennummer=current())])" id="SCH-ZSSR-0250">[SCH-ZSSR-0250] Grunddaten: Der Wert zum Element '/grunddaten/verfahrensdaten/beteiligung/rolle/referenz/ref.rollennummer' entspricht mit seinem Wert nicht dem Element '/rollennummer' eines anderen Elternelements '/grunddaten/verfahrensdaten/beteiligung/rolle'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Genau ein erster Antragsgegner: Es muss genau ein Element '//grunddaten/verfahrensdaten/beteiligung/rolle' mit der Rollenbezeichnung ('/rollenbezeichnung') '015|Antragsgegner' geben, dessen Kindelement '/nr' den Wert '1' aufweist bzw. nicht definiert ist, was auf Grund des Default-Werts ebenfalls '1' entspricht  (nur Nachricht: 2) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten">
						<sch:assert test="count(//tns:beteiligung/tns:rolle[tns:rollenbezeichnung/code = '015' and (tns:nr = '1' or count(tns:nr) = 0)]) = 1" id="SCH-ZSSR-0255">[SCH-ZSSR-0255] Grunddaten: Es existiert nicht genau ein Element '/grunddaten/verfahrensdaten/beteiligung/rolle' mit der Rollenbezeichnung ('/rollenbezeichnung') '015|Antragsgegner', dessen Kindelement '/nr' den Wert '1' aufweist bzw. nicht definiert ist, was auf Grund des Default-Wertes ebenfalls '1' entspricht!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Sofern Elemente '/grunddaten/verfahrensdaten/beteiligung/rolle' mit der Rollenbezeichnung ('/rollenbezeichnung') '132|Prozessbevollmächtigter' existieren: Genau ein erster Prozessbevollmaechtigter: Es muss genau ein Element '//grunddaten/verfahrensdaten/beteiligung/rolle' mit der Rollenbezeichnung ('/rollenbezeichnung') '132|Prozessbevollmächtigter' geben, dessen Kindelement '/nr' den Wert '1' aufweist bzw. nicht definiert ist, was auf Grund des Default-Werts ebenfalls '1' entspricht (nur Nachricht: 2) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten">
						<sch:assert test="count(//tns:beteiligung/tns:rolle[tns:rollenbezeichnung/code = '132']) = 0 or count(//tns:beteiligung/tns:rolle[tns:rollenbezeichnung/code = '132' and (tns:nr = '1' or count(tns:nr) = 0)]) = 1" id="SCH-ZSSR-0260">[SCH-ZSSR-0260] Grunddaten: Die Geschäftsregel "Sofern Elemente '/grunddaten/verfahrensdaten/beteiligung/rolle' mit der Rollenbezeichnung ('/rollenbezeichnung') '132|Prozessbevollmächtigter' existieren, muss es unter Diesen genau ein Element geben, dessen Kindelement '/nr' den Wert '1' aufweist bzw. nicht definiert ist, was auf Grund des Default-Wertes ebenfalls '1' entspricht." ist nicht erfüllt!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<!-- /Individuelle Rules -->
				
			<!-- /ZSSR - GRUNDDATEN-GESCHAEFTSREGELN -->



			<!-- ZSSR - SGO-GESCHAEFTSREGELN: -->
		
				<!-- Abstrakte Rules -->
				
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokument' muss genau einmal vorkommen (1) (nur Nachrichten: 1, 3, 4) -->
					<sch:rule id="SCH-ZSSR-0500" abstract="true">
						<sch:assert test="count(tns:dokument) = 1" >[SCH-ZSSR-0500] SGO: Das Element 'dokument' muss genau einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokument' muss mindestens einmal vorkommen (1..n) (nur Nachrichten: 2, 5) -->
					<sch:rule id="SCH-ZSSR-0501" abstract="true">
						<sch:assert test="count(tns:dokument) &gt; 0" >[SCH-ZSSR-0501] SGO: Das Element 'dokument' muss mindestens einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokumententyp' muss genau einmal vorkommen (1) (nur Nachrichten: 2, 5) -->
					<sch:rule id="SCH-ZSSR-0502" abstract="true">
						<sch:assert test="count(tns:dokumententyp) = 1" >[SCH-ZSSR-0502] SGO: Das Element 'dokumententyp' muss genau einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'datei' (1..n) kann mehrfach vorkommen - jedoch mit Bestandteil-Typ '001|Original' muss das Element 'datei' genau einmal vorkommen (1) (alle Nachrichten) -->				
					<sch:rule id="SCH-ZSSR-0504" abstract="true">
						<sch:assert test="count(tns:datei[tns:bestandteil/code = '001']) = 1" >[SCH-ZSSR-0504] SGO: Das Element 'datei' mit Bestandteil-Typ '001|Original' muss genau einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Kardinalitaet: Das optionale Element 'ruecksendungEEB.erforderlich' mit dem festen Wert 'true' darf nicht vorkommen! (alle Nachrichten) -->
					<sch:rule id="SCH-ZSSR-0505" abstract="true">
						<sch:assert test="not(exists(tns:ruecksendungEEB.erforderlich))">[SCH-ZSSR-0505] SGO: Das optionale Element 'ruecksendungEEB.erforderlich' mit dem festen Wert 'true' darf nicht vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<!-- /Abstrakte Rules -->
		
		
				<!-- Erweiterungen (extends)-->
				
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokument' muss genau einmal vorkommen (1) -->
					<sch:rule context="tns:nachricht.zssr.bestaetigung.2300001/tns:schriftgutobjekte">
						<sch:extends rule="SCH-ZSSR-0500"/>
					</sch:rule>
					
					<sch:rule context="tns:nachricht.zssr.fehlermeldung.2300003/tns:schriftgutobjekte">
						<sch:extends rule="SCH-ZSSR-0500"/>
					</sch:rule>
					
					<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:schriftgutobjekte">
						<sch:extends rule="SCH-ZSSR-0500"/>
					</sch:rule>
				</sch:pattern>		
				
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokument' muss mindestens einmal vorkommen (1..n) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte">
						<sch:extends rule="SCH-ZSSR-0501"/>
					</sch:rule>
					
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte">
						<sch:extends rule="SCH-ZSSR-0501"/>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<!-- Kardinalitaet: Das Element 'dokumententyp' muss genau einmal vorkommen (1) -->
						<sch:extends rule="SCH-ZSSR-0502"/>
						<!-- Kardinalitaet: Das Element 'datei' mit Bestandteil-Typ '001|Original' muss genau einmal vorkommen (1) (Teil 1/2) -->
						<sch:extends rule="SCH-ZSSR-0504"/>
						<!-- Kardinalitaet: Das optionale Element 'ruecksendungEEB.erforderlich' mit dem festen Wert 'true' darf nicht vorkommen! (Teil 1/2) -->
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
					
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<!-- Kardinalitaet: Das Element 'dokumententyp' muss genau einmal vorkommen (1) -->
						<sch:extends rule="SCH-ZSSR-0502"/>
						<!-- Kardinalitaet: Das Element 'datei' mit Bestandteil-Typ '001|Original' muss genau einmal vorkommen (1) (Teil 1/2) -->
						<sch:extends rule="SCH-ZSSR-0504"/>
						<!-- Kardinalitaet: Das optionale Element 'ruecksendungEEB.erforderlich' mit dem festen Wert 'true' darf nicht vorkommen! (Teil 1/2) -->
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
				</sch:pattern>

				<sch:pattern>
					<sch:rule context="tns:nachricht.zssr.bestaetigung.2300001/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<!-- Kardinalitaet: Das Element 'datei' mit Bestandteil-Typ '001|Original' muss genau einmal vorkommen (1) (Teil 2/2) -->
						<sch:extends rule="SCH-ZSSR-0504"/>
						<!-- Kardinalitaet: Das optionale Element 'ruecksendungEEB.erforderlich' mit dem festen Wert 'true' darf nicht vorkommen! (Teil 2/2) -->
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
					
					<sch:rule context="tns:nachricht.zssr.fehlermeldung.2300003/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<!-- Kardinalitaet: Das Element 'datei' mit Bestandteil-Typ '001|Original' muss genau einmal vorkommen (1) (Teil 2/2) -->
						<sch:extends rule="SCH-ZSSR-0504"/>
						<!-- Kardinalitaet: Das optionale Element 'ruecksendungEEB.erforderlich' mit dem festen Wert 'true' darf nicht vorkommen! (Teil 2/2) -->
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
					
					<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<!-- Kardinalitaet: Das Element 'datei' mit Bestandteil-Typ '001|Original' muss genau einmal vorkommen (1) (Teil 2/2) -->
						<sch:extends rule="SCH-ZSSR-0504"/>
						<!-- Kardinalitaet: Das optionale Element 'ruecksendungEEB.erforderlich' mit dem festen Wert 'true' darf nicht vorkommen! (Teil 2/2) -->
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
				</sch:pattern>
	
				<!-- /Erweiterungen (extends) -->	
	
	
				<!-- Abstrakte Pattern -->
				
				<sch:pattern id="SCH-ZSSR-0525" abstract="true">
					<!-- Sonstige Pruefung: Der Dateiname (welcher auch das Dateiformat und den Punkt als Trennzeichen enthaelt) darf die zulaessige Anzahl von 90 Zeichen nicht ueberschritten (nur Nachrichten: 2, 5) -->
					<!-- Hier wird angegeben: 'Dateiname.DateiformatImKlartext' (Beispiel: Schutzschrift.pdf) -->									   
					<sch:rule context="$pfadNachricht/tns:dateiname">
						<sch:assert test="string-length(.) &lt; 91">[SCH-ZSSR-0525] SGO: Der Dateiname (Element 'dateiname', welches auch das Dateiformat und den Punkt als Trennzeichen enthält) darf die zulässige Zeichenanzahl von 90 nicht überschreiten!</sch:assert>
					</sch:rule>
				</sch:pattern>	
		
				<sch:pattern id="SCH-ZSSR-0526" abstract="true">
					<!-- Sonstige Pruefung: SGO: Der Dateiname (hier 'dateiname.bezugsdatei', welcher auch das tatsaechliche Dateiformat und den Punkt als Trennzeichen enthaelt) darf die zulaessige Zeichenanzahl von 90 nicht ueberschreiten (nur Nachrichten: 2, 5) -->
					<!-- Hier wird angegeben: 'Dateiname.DateiformatImKlartext' (Beispiel: Schutzschrift.pdf) -->
					<sch:rule context="$pfadNachricht/tns:dateiname.bezugsdatei">
						<sch:assert test="string-length(.) &lt; 91">[SCH-ZSSR-0526] SGO: Der Dateiname (hier Element 'dateiname.bezugsdatei', welches auch das tatsächliche Dateiformat und den Punkt als Trennzeichen enthält) darf die zulässige Zeichenanzahl von 90 nicht überschreiten!</sch:assert>
					</sch:rule>
				</sch:pattern>	
		
				<sch:pattern id="SCH-ZSSR-0527" abstract="true">
					<!-- Pattern: Der Dateiname darf kein Kaufmannsund-Zeichen enthalten (nur Nachrichten: 2, 5) -->
					<sch:rule context="$pfadNachricht/tns:dateiname">
						<sch:assert test="not(matches(.,'[&amp;&#38;&#x0026;]'))">[SCH-ZSSR-0527] SGO: Der Dateiname (Element 'dateiname') darf kein Kaufmannsund-Zeichen enthalten!</sch:assert>
					</sch:rule>
				</sch:pattern>	
		
				<sch:pattern id="SCH-ZSSR-0528" abstract="true">
					<!-- Pattern: Der Dateiname (hier 'dateiname.bezugsdatei') darf kein Kaufmannsund-Zeichen enthalten (nur Nachrichten: 2, 5) -->
					<sch:rule context="$pfadNachricht/tns:dateiname.bezugsdatei">
						<sch:assert test="not(matches(.,'[&amp;&#38;&#x0026;]'))">[SCH-ZSSR-0528] SGO: Der Dateiname (hier Element 'dateiname.bezugsdatei') darf kein Kaufmannsund-Zeichen enthalten!</sch:assert>
					</sch:rule>
				</sch:pattern>

				<sch:pattern id="SCH-ZSSR-0529" abstract="true">
					<!-- Pattern: Das Element '//schriftgutobjekte/dokument/xjustiz.fachspezifischeDaten/datei/dateiname' darf nur folgende Datei-Endungen erlauben: .pdf, .pdfa, .rtf, .xml, .doc, .docx, .p7, .p7s, .p7b, .p7m, .pkcs7 (Flag 'i' fuer erlaubte Gross-/Kleinschreibung ('case-insensitiv') (nur Nachrichten: 2, 5) -->
					<sch:rule context="$pfadNachricht/tns:dateiname">
						<sch:assert test="matches(.,'\.(pdf|pdfa|rtf|xml|doc|docx|p7|p7s|p7b|p7m|pkcs7)$', 'i')">[SCH-ZSSR-0529] SGO: Der Dateiname (Element 'dateiname') darf nur folgende Datei-Endungen haben: .pdf, .pdfa, .rtf, .xml, .doc, .docx, .p7, .p7s, .p7b, .p7m, .pkcs7!</sch:assert>
					</sch:rule>
				</sch:pattern>
	
				<!-- /Abstrakte Pattern -->


				<!-- Parameter-Deklaration (param) -->
				
				<sch:pattern is-a="SCH-ZSSR-0525">
					<!-- Sonstige Pruefung: Der Dateiname darf zusammen mit dem Dateiformat die zulaessige Anzahl von 90 Zeichen nicht ueberschritten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-ZSSR-0525">
					<!-- Sonstige Pruefung: Der Dateiname darf zusammen mit dem Dateiformat die zulaessige Anzahl von 90 Zeichen nicht ueberschritten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
		
				<sch:pattern is-a="SCH-ZSSR-0526">
					<!-- Sonstige Pruefung: Der Dateiname (hier 'dateiname.bezugsdatei' welcher auch das Dateiformat und den Punkt als Trennzeichen enthaelt) ist zu lang, da die zulaessigen 90 Zeichen ueberschritten werden -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-ZSSR-0526">
					<!-- Sonstige Pruefung: Der Dateiname (hier 'dateiname.bezugsdatei' welcher auch das Dateiformat und den Punkt als Trennzeichen enthaelt) ist zu lang, da die zulaessigen 90 Zeichen ueberschritten werden -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
		
				<sch:pattern is-a="SCH-ZSSR-0527">
					<!-- Pattern: Der Dateiname darf kein Kaufmannsund-Zeichen enthalten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-ZSSR-0527">
					<!-- Pattern: Der Dateiname darf kein Kaufmannsund-Zeichen enthalten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
		
				<sch:pattern is-a="SCH-ZSSR-0528">
					<!-- Pattern: Der Dateiname (hier 'dateiname.bezugsdatei') darf kein Kaufmannsund-Zeichen enthalten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-ZSSR-0528">
					<!-- Pattern: Der Dateiname (hier 'dateiname.bezugsdatei') darf kein Kaufmannsund-Zeichen enthalten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
	
				<sch:pattern is-a="SCH-ZSSR-0529">
					<!-- Pattern: Das Element //schriftgutobjekte/dokument/xjustiz.fachspezifischeDaten/datei/dateiname darf nur folgende Datei-Endungen erlauben: .pdf, .pdfa, .rtf, .xml, .doc, .docx, .p7, .p7s, .p7b, .p7m, .pkcs7 (Flag 'i' fuer erlaubte Gross-/Kleinschreibung ('case-insensitiv') -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-ZSSR-0529">
					<!-- Pattern: Das Element //schriftgutobjekte/dokument/xjustiz.fachspezifischeDaten/datei/dateiname darf nur folgende Datei-Endungen erlauben: .pdf, .pdfa, .rtf, .xml, .doc, .docx, .p7, .p7s, .p7b, .p7m, .pkcs7 (Flag 'i' fuer erlaubte Gross-/Kleinschreibung ('case-insensitiv') -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				
				<!-- /Parameter-Deklaration (param) -->
		
		
				<!-- Individuelle Rules -->
	
				<sch:pattern>
					<!-- Sonstige Pruefung: Es existiert mind. ein Dokument mit 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '219|Schutzschrift' beim Element 'dokumententyp' und einem 'GDS.Dokumentklasse.Typ3' - Codelisten-Eintrag '015|Schreiben' beim Element 'dokumentklasse' (nicht Bereich 'akte'|'akte/teilakte', die jedoch auch nicht vorkommen duerfen!) (nur Nachricht: 2) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte">
						<sch:assert test="count(//tns:dokument[tns:xjustiz.fachspezifischeDaten/tns:dokumententyp/code = '219' and tns:xjustiz.fachspezifischeDaten/tns:dokumentklasse/code = '015']) &gt; 0" id="SCH-ZSSR-0550">[SCH-ZSSR-0550] SGO: Es existiert nicht mind. ein Dokument mit einem 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '219|Schutzschrift' beim Element 'dokumententyp' und einem 'GDS.Dokumentklasse.Typ3' - Codelisten-Eintrag '015|Schreiben' beim Element 'dokumentklasse'!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Sonstige Pruefung: Es existiert mind. ein Dokument mit 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '218|Rücknahme' beim Element 'dokumententyp' und einem 'GDS.Dokumentklasse.Typ3' - Codelisten-Eintrag '015|Schreiben' beim Element 'dokumentklasse' (nicht Bereich 'akte'|'akte/teilakte', die jedoch auch nicht vorkommen duerfen!) (nur Nachricht: 5) -->
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte">
						<sch:assert test="count(//tns:dokument[tns:xjustiz.fachspezifischeDaten/tns:dokumententyp/code = '218' and tns:xjustiz.fachspezifischeDaten/tns:dokumentklasse/code = '015']) &gt; 0" id="SCH-ZSSR-0555">[SCH-ZSSR-0555] SGO: Es existiert nicht mind. ein Dokument mit einem 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '218|Rücknahme' beim Element 'dokumententyp' und einem 'GDS.Dokumentklasse.Typ3' - Codelisten-Eintrag '015|Schreiben' beim Element 'dokumentklasse'!</sch:assert>
					</sch:rule>
				</sch:pattern>

				<sch:pattern>
					 <!--Sonstige Pruefung: nur fuer 'tns:schriftgutobjekte/tns:dokument' und nicht fuer 'tns:schriftgutobjekte/tns:akte/.../tns:dokument'! In einem Element 'dokument' (A) verweist ein Unterelement 'datei' (A) [Kardinalitaet: 1..n] mit dem weiteren Unterelement 'dateiname.bezugsdatei' [Kardinalitaet: 0..n] per Wert in demselben(!) 'dokument' (A) auf das im  weiteren Unterelement 'datei'(B) zwingend vorhandene, weitere Unterelement 'dateiname' als Bezugsdatei. Dieser referenzierte Instanz-Knoten 'dateiname' muss den gleichen Wert haben, wie 'dateiname.bezugsdatei' aus 'dokument' (A)! 
					 Beispiel: 'dokument' (A) mit 'datei' (A) hat folgende Unterelemente: 'dateiname' -> Schutzschrift.pdf; dokument (A) mit datei (B) hat folgende Unterelemente: 'dateiname' -> Schutzschrift.pkcs7, 'dateiname.bezugsdatei' -> Schutzschrift.pdf 
					 Achtung: Wenn Element 'dateiname.bezugsdatei' (mehrfaches Vorkommen moeglich!) befuellt ist, muss dort (wie auch beim Element 'dateiname') immer ein Dateiformat mit einem vorangestellten Punkt mit angegeben werden (z.B.: '.pdf' - also insgesamt z.B. 'Schutzschrift.pdf')! (alle Nachrichten)  --> 
					<sch:rule context="//tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei/tns:dateiname.bezugsdatei">
						<sch:assert test="count((../preceding-sibling::tns:datei|../following-sibling::tns:datei)[tns:dateiname = current()]) = 1" id="SCH-ZSSR-0560">[SCH-ZSSR-0560] SGO: Es existiert im selben Dokument keine andere Datei mit einem Namen '<sch:value-of select="." />', wie unter 'dateiname.bezugsdatei' angegeben (wobei 'dateiname' und 'dateiname.bezugsdatei' immer ein tatsächliches Dateiformat mit einem vorangestellten Punkt enthalten müssen)!</sch:assert>
					</sch:rule>
				</sch:pattern>

				<sch:pattern>
					<!-- Sonstige Pruefung: Schriftgutobjekte duerfen lediglich Dokumente und keine Akten enthalten! (alle Nachrichten) -->
					<sch:rule context="//tns:schriftgutobjekte">
						<sch:assert test="not(exists(tns:akte))" id="SCH-ZSSR-0565">[SCH-ZSSR-0565] SGO: Schriftgutobjekte dürfen lediglich Dokumente und keine Akten enthalten!</sch:assert>
					</sch:rule>
				</sch:pattern>
	
				<sch:pattern>
					<!-- Nachricht 2300002: Ein Dokument, das nicht den Dokumenttyp 'Schutzschrift' aufweist, benötigt einen Verweis auf eine Schutzschrift -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<sch:assert test="tns:dokumententyp/code = '219' or (tns:verweis/tns:verweistyp/code = '002' and 
																			  (some $element in //tns:xjustiz.fachspezifischeDaten 
																			     satisfies ($element/tns:dokumententyp/code = '219' and $element/../tns:identifikation/tns:id = tns:verweis/tns:bezugsdokument/tns:ref.sgo)))"
							id="SCH-ZSSR-0570">[SCH-ZSSR-0570] Ein Dokument, das nicht den Dokumenttyp 'Schutzschrift' aufweist, muss einen Verweis vom Verweistyp 'Anlage' auf eine Schutzschrift enthalten! 
						</sch:assert>
					</sch:rule>
				</sch:pattern>
	
				<sch:pattern>
					<!-- Nachricht 2300005: Ein Dokument, das nicht den Dokumenttyp 'Rücknahme' aufweist, benötigt einen Verweis auf eine Rücknahme -->
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<sch:assert test="tns:dokumententyp/code = '218' or (tns:verweis/tns:verweistyp/code = '002' and 
																			  (some $element in //tns:xjustiz.fachspezifischeDaten 
																				 satisfies ($element/tns:dokumententyp/code = '218' and $element/../tns:identifikation/tns:id = tns:verweis/tns:bezugsdokument/tns:ref.sgo)))" 
							id="SCH-ZSSR-0571">[SCH-ZSSR-0571] Ein Dokument, das nicht den Dokumenttyp 'Rücknahme' aufweist, muss einen Verweis vom Verweistyp 'Anlage' auf eine Rücknahme enthalten! 
						</sch:assert>
					</sch:rule>
				</sch:pattern>

				<!-- /Individuelle Rules -->

			<!-- /ZSSR - SGO-GESCHAEFTSREGELN -->



			<!-- ZSSR - FACHDATEN-GESCHAEFTSREGELN: -->
			
				<!-- Individuelle Rules -->
				
				<sch:pattern>
					<!-- Angabe der Registernummer: Das Element '//fachdaten/verfahrensdaten/registernummer' darf nicht leer sein (nur Nachricht: 5) -->
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:fachdaten/tns:verfahrensdaten">
						<sch:assert test="normalize-space(tns:registernummer) != ''" id="SCH-ZSSR-0600">[SCH-ZSSR-0600] Fachdaten: Das Element '/fachdaten/verfahrensdaten/registernummer' darf nicht leer sein!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Angabe des Ruecknahmecodes: Das Element '//fachdaten/verfahrensdaten/ruecknahmecode' darf nicht leer sein (nur Nachricht: 5) -->
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:fachdaten/tns:verfahrensdaten">
						<sch:assert test="normalize-space(tns:ruecknahmecode) != ''" id="SCH-ZSSR-0605">[SCH-ZSSR-0605] Fachdaten: Das Element '/fachdaten/verfahrensdaten/ruecknahmecode' darf nicht leer sein!</sch:assert>
					</sch:rule>
				</sch:pattern>
				 
				<!-- /Individuelle Rules -->
			   
			<!-- /ZSSR - FACHDATEN-GESCHAEFTSREGELN -->



			<!-- ZSSR - CODELISTEN-GESCHAEFTSREGELN: -->

			<!-- Individuelle Rules -->

				<!-- 'Code.GDS.Bestandteiltyp' (alle Nachrichten) -->
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Bestandteiltyp' (nur Schluessel-Werte 001 (Original) und 003 (Signaturdatei)) -->
					<sch:rule context="//tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei/tns:bestandteil">
						<sch:assert test="code = ('001','003')" id="SCH-ZSSR-0920">[SCH-ZSSR-0920] Codeliste: Der Codelistenschlüssel der Typ1-Codeliste 'GDS.Bestandteiltyp' zum Element 'bestandteil' darf nur folgende Werte haben: '001' oder '003'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
			<!-- /Individuelle Rules -->
				
			<!-- Abstrakte Pattern -->
			
				<!-- 'Code.GDS.Dokumenttyp.Typ3' (codeWert '217': nur Nachrichten: 1, 3, 4; codeWert '218': nur Nachricht: 5; codeWert '219': nur Nachricht: 2) -->
				<sch:pattern id="SCH-ZSSR-0905" abstract="true">
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
					<sch:rule context="$pfadNachricht//tns:xjustiz.fachspezifischeDaten/tns:dokumententyp">
						<sch:assert test="code = $codeWert">[SCH-ZSSR-0905] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Dokumenttyp' zum Element 'dokumententyp' darf nur den Wert $codeWert haben!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<!-- 'Code.GDS.Rollenbezeichnung.Typ3' (nur Nachrichten: 2, 4) -->
				<sch:pattern id="SCH-ZSSR-0915" abstract="true">
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
					<sch:rule context="$pfadNachricht2300002_2300004//tns:beteiligung/tns:rolle/tns:rollenbezeichnung">
						<sch:assert test="code = ('015','016','088','132')">[SCH-ZSSR-0915] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Rollenbezeichnung' zum Element 'rollenbezeichnung' darf nur folgende Werte haben:'015','016','088' oder '132'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
			<!-- /Abstrakte Pattern -->
	

			<!-- Parameter-Deklaration (param) -->
			
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachricht" value="tns:nachricht.zssr.bestaetigung.2300001"/>
				<sch:param name="codeWert" value="217"/>
			</sch:pattern>
			
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachricht" value="tns:nachricht.zssr.fehlermeldung.2300003"/>
				<sch:param name="codeWert" value="217"/>
			</sch:pattern>
			
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachricht" value="tns:nachricht.zssr.mitteilungEinschlaegig.2300004"/>
				<sch:param name="codeWert" value="217"/>
			</sch:pattern>
	
			<sch:pattern is-a="SCH-ZSSR-0915">
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
				<sch:param name="pfadNachricht2300002_2300004" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002"/>
			</sch:pattern>
			
			<sch:pattern is-a="SCH-ZSSR-0915">
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
				<sch:param name="pfadNachricht2300002_2300004" value="tns:nachricht.zssr.mitteilungEinschlaegig.2300004"/>
			</sch:pattern>
			
			<!-- /Parameter-Deklaration (param) -->
	
			<!-- /ZSSR - CODELISTEN-GESCHAEFTSREGELN -->
	
	<!-- /ZSSR - NACHRICHTEN -->
	

</sch:schema>