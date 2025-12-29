<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz ZSSR
    Version 1.1.4 (Juli 2022; Korrekturen¹/Optimierungen² zu: SCH-ZSSR-0001²,SCH-ZSSR-0002², SCH-ZSSR-0003¹, SCH-ZSSR-0004², SCH-ZSSR-0005¹², SCH-ZSSR-0050², SCH-ZSSR-0051¹, SCH-ZSSR-0052¹, SCH-ZSSR-0055², SCH-ZSSR-0140¹, SCH-ZSSR-0195¹, SCH-ZSSR-0501², SCH-ZSSR-0502¹, SCH-ZSSR-0504¹, SCH-ZSSR-0525², SCH-ZSSR-0526¹², SCH-ZSSR-0527², SCH-ZSSR-0528¹², SCH-ZSSR-0550², SCH-ZSSR-0555², SCH-ZSSR-0560¹²)
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
						<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' darf hoechstens einmal vorkommen -->
						<sch:rule id="SCH-ZSSR-0001" abstract="true">
							<sch:assert test="count(tns:aktenzeichen.absender) &lt; 2" >[SCH-ZSSR-0001] Nachrichtenkopf: Das Element 'aktenzeichen.absender' darf höchstens einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' darf hoechstens einmal vorkommen -->
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
						<!-- Pattern: Das Element 'strasse' darf max. 35 Zeichen haben ({1,35}) -->
						<sch:rule context="$pfadNachricht2300002/tns:strasse">
							<sch:assert test="matches(., '^.{1,35}$')">[SCH-ZSSR-0003] Grunddaten: Das Element 'strasse' darf max. 35 Zeichen haben! (Pfad: '$pfadNachricht2300002/tns:strasse')</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0004" abstract="true">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999' -->
						<sch:rule context="$pfadNachricht2300002/tns:postleitzahl"> 
							<sch:assert test="matches(., '^\d{5}$') and . &gt; 999">[SCH-ZSSR-0004] Grunddaten: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999'! (Pfad '$pfad2Nachricht2300002')</sch:assert>
							<!-- alternativ, soweit von Schematron-Validator unterstützt: <sch:assert test="matches(., '^(?!00)\d{5}$', 'i;j')">[SCH-ZSSR-0004] Grunddaten: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999'! (Pfad '$pfad2Nachricht2300002')</sch:assert> -->
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0005" abstract="true">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben und Bindestrich) haben und beginnt mit einem Großbuchstaben (Großbuchstabe zzgl. {0,25}) -->
						<sch:rule context="$pfadNachricht2300002/tns:ort">
							<sch:assert test="matches(., '^[A-ZÄÖÜ][a-zäöüßA-ZÄÖÜ-]{0,25}$')">[SCH-ZSSR-0005] Grunddaten: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben und Bindestrich) haben und beginnt mit einem Großbuchstaben! (Pfad: '$pfadNachricht2300002/tns:ort')</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0006" abstract="true">
						<!-- Pattern: Das Element 'gegenstand' darf max. 500 Zeichen haben ({1,500}) -->
						<sch:rule context="$pfadNachricht2300002/tns:gegenstand">
							<sch:assert test="matches(., '^.{1,500}$')">[SCH-ZSSR-0006] Grunddaten: Das Element 'gegenstand' darf max. 500 Zeichen haben! (Pfad: '$pfadNachricht2300002/tns:gegenstand')</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0007" abstract="true">
						<!-- Pattern: Das Element 'titel' darf max. 25 Zeichen haben ({1,25}) -->
						<sch:rule context="$pfadNachricht2300002/tns:titel">
							<sch:assert test="matches(., '^.{1,25}$')">[SCH-ZSSR-0007] Grunddaten: Das Element 'titel' darf max. 25 Zeichen haben! (Pfad: '$pfadNachricht2300002/tns:titel')</sch:assert>
						</sch:rule>
					</sch:pattern>
		
					<sch:pattern id="SCH-ZSSR-0008" abstract="true">
						<!-- Pattern: Das Element 'vorname' darf max. 35 Zeichen haben ({1,35}) -->
						<sch:rule context="$pfadNachricht2300002/tns:vorname">
							<sch:assert test="matches(., '^.{1,35}$')">[SCH-ZSSR-0008] Grunddaten: Das Element 'vorname' darf max. 35 Zeichen haben! (Pfad: '$pfadNachricht2300002/tns:vorname')</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern id="SCH-ZSSR-0009" abstract="true">
						<!-- Pattern: Das Element 'rufname' darf max. 35 Zeichen haben ({1,35}) -->
						<sch:rule context="$pfadNachricht2300002/tns:rufname">
							<sch:assert test="matches(., '^.{1,35}$')">[SCH-ZSSR-0009] Grunddaten: Das Element 'rufname' darf max. 35 Zeichen haben! (Pfad: '$pfadNachricht2300002/tns:rufname')</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern id="SCH-ZSSR-0010" abstract="true">
						<!-- Pattern: Das Element 'nachname' darf max. 35 Zeichen haben ({1,35}) -->
						<sch:rule context="$pfadNachricht2300002/tns:nachname">
							<sch:assert test="matches(., '^.{1,35}$')">[SCH-ZSSR-0010] Grunddaten: Das Element 'nachname' darf max. 35 Zeichen haben! (Pfad: '$pfadNachricht2300002/tns:nachname')</sch:assert>
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
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift[tns:staat/tns:auswahl_staat/tns:staat/code = 'DE']"/>
						<sch:param name="pfad2Nachricht2300002" value="/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/tns:postleitzahl"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift[tns:staat/tns:auswahl_staat/tns:staat/code = 'DE']"/>
						<sch:param name="pfad2Nachricht2300002" value="/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/tns:postleitzahl"/>
					</sch:pattern>	
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift[tns:staat/tns:auswahl_staat/tns:staat/code = 'DE']"/>
						<sch:param name="pfad2Nachricht2300002" value="/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/tns:postleitzahl"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:sitz[tns:staat/tns:auswahl_staat/tns:staat/code = 'DE']"/>
						<sch:param name="pfad2Nachricht2300002" value="/tns:auswahl_beteiligter/tns:organisation/tns:sitz/tns:postleitzahl"/>
					</sch:pattern>							
			
					<sch:pattern is-a="SCH-ZSSR-0004">
						<!-- Pattern: Eine deutsche Postleitzahl muss folgende Bedingungen erfüllen: 5 Ziffern, nur Ziffern, PLZ größer als '00999' -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift[tns:staat/tns:auswahl_staat/tns:staat/code = 'DE']"/>
						<sch:param name="pfad2Nachricht2300002" value="/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/tns:postleitzahl"/>
					</sch:pattern>	
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben und Bindestrich) haben und beginnt mit einem Großbuchstaben (Großbuchstabe zzgl. {0,25}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit einem Großbuchstaben ({1,26}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift"/>
					</sch:pattern>

					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit einem Großbuchstaben ({1,26}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit Großbuchstaben ({1,26}) -->
						<sch:param name="pfadNachricht2300002" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:sitz"/>
					</sch:pattern>
			
					<sch:pattern is-a="SCH-ZSSR-0005">
						<!-- Pattern: Das Element 'ort' darf max. 26 Zeichen (nur Buchstaben) haben und beginnt mit einem Großbuchstaben ({1,26}) -->
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
						<!-- Kardinalitaet: Das Element 'verfahrensdaten' muss genau einmal vorkommen -->
						<sch:rule id="SCH-ZSSR-0020" abstract="true">
							<sch:assert test="count(tns:verfahrensdaten) = 1" >[SCH-ZSSR-0001] Grunddaten: Das Element 'verfahrensdaten' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'instanzdaten' muss genau einmal vorkommen -->
						<sch:rule id="SCH-ZSSR-0021" abstract="true">
							<sch:assert test="count(tns:instanzdaten) = 1" >[SCH-ZSSR-0021] Grunddaten: Das Element 'instanzdaten' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'verfahrensgegenstand' muss genau einmal vorkommen -->
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
						<!-- Kardinalitaet: Das Element 'aktenzeichen' muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
							<sch:assert test="count(tns:aktenzeichen) = 1" id="SCH-ZSSR-0045">[SCH-ZSSR-0045] Grunddaten: Das Element 'aktenzeichen' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'beteiligung' muss mind. zweimal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten">
							<sch:assert test="count(tns:beteiligung) &gt; 1" id="SCH-ZSSR-0050">[SCH-ZSSR-0050] Grunddaten: Das Element 'beteiligung' muss mindestens zweimal vorkommen (mind. ein Antragssteller und mind. ein Antragsgegner)!</sch:assert>
						</sch:rule>
					</sch:pattern>

					<sch:pattern>
						<!-- Kardinalitaet: Es muss mind. ein Antragssteller als Beteiligter (aus der Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 016) vorhanden sein -->
						<sch:rule context="/">
							<sch:assert test="if (descendant::tns:nachricht.zssr.einreichungSchutzschrift.2300002) then (//tns:beteiligung/tns:rolle/tns:rollenbezeichnung/code = '016') else true()" id="SCH-ZSSR-0051">[SCH-ZSSR-0051] Grunddaten: Es muss mind. ein Beteiligter in der Rolle des Antragssteller (Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 016) vorhanden sein!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Es muss mind. ein Antragsgegner als Beteiligter (aus der Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 015) vorhanden sein -->
						<sch:rule context="/">
							<sch:assert test="if (descendant::tns:nachricht.zssr.einreichungSchutzschrift.2300002) then (//tns:beteiligung/tns:rolle/tns:rollenbezeichnung/code = '015') else true()" id="SCH-ZSSR-0052">[SCH-ZSSR-0052] Grunddaten: Es muss mind. ein Beteiligter in der Rolle des Antragsgegners (Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 015) vorhanden sein!</sch:assert>
						</sch:rule>
					</sch:pattern>

					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'rolle' muss mind. einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
							<sch:assert test="count(tns:rolle) &gt; 0" id="SCH-ZSSR-0055">[SCH-ZSSR-0055] Grunddaten: Das Element 'rolle' muss mindestens einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'rollennummer' muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
							<sch:assert test="count(tns:rollennummer) = 1" id="SCH-ZSSR-0060">[SCH-ZSSR-0060] Grunddaten: Das Element 'rollennummer' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'rollenbezeichnung' muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
							<sch:assert test="count(tns:rollenbezeichnung) = 1" id="SCH-ZSSR-0065">[SCH-ZSSR-0065] Grunddaten: Das Element 'rollenbezeichnung' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'nr' muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
							<sch:assert test="count(tns:nr) = 1" id="SCH-ZSSR-0070">[SCH-ZSSR-0070] Grunddaten: Das Element 'nr' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'beteiligtennummer' muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
							<sch:assert test="count(tns:beteiligtennummer) = 1" id="SCH-ZSSR-0075">[SCH-ZSSR-0075] Grunddaten: Das Element 'beteiligtennummer' muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0080">[SCH-ZSSR-0080] Grunddaten: Das Element 'anschrift' (zu 'tns:auswahl_beteiligter/tns:ra.kanzlei/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0085">[SCH-ZSSR-0085] Grunddaten: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0090">[SCH-ZSSR-0090] Grunddaten: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0095">[SCH-ZSSR-0095] Grunddaten: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0100">[SCH-ZSSR-0100] Grunddaten: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/tns:staat/') muss genau einmal vorkommen (nur bis XJ-3.1.1 einschl. nötig; danach in XJ Pflicht!) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/tns:staat">
							<sch:assert test="count(tns:auswahl_staat) = 1" id="SCH-ZSSR-0105">[SCH-ZSSR-0105] Grunddaten: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift/tns:staat/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'vorname' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName">
							<sch:assert test="count(tns:vorname) = 1" id="SCH-ZSSR-0110">[SCH-ZSSR-0110] Grunddaten: Das Element 'vorname' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:vollerName/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>	
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0115">[SCH-ZSSR-0115] Grunddaten: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0120">[SCH-ZSSR-0120] Grunddaten: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0125">[SCH-ZSSR-0125] Grunddaten: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0130">[SCH-ZSSR-0130] Grunddaten: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0135">[SCH-ZSSR-0135] Grunddaten: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/tns:staat/') muss genau einmal vorkommen (nur bis XJ-3.1.1 einschl. nötig; danach in XJ Pflicht!) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/tns:staat">
							<sch:assert test="count(tns:auswahl_staat) = 1" id="SCH-ZSSR-0140">[SCH-ZSSR-0140] Grunddaten: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:raImVerfahren/tns:anschrift/tns:staat/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'vorname' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName">
							<sch:assert test="count(tns:vorname) = 1" id="SCH-ZSSR-0145">[SCH-ZSSR-0145] Grunddaten: Das Element 'vorname' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0150">[SCH-ZSSR-0150] Grunddaten: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0155">[SCH-ZSSR-0155] Grunddaten: Das Element 'strasse' (zu 'tns:auswahl_beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0160">[SCH-ZSSR-0160] Grunddaten: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>		
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0165">[SCH-ZSSR-0165] Grunddaten: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0170">[SCH-ZSSR-0170] Grunddaten: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/tns:staat/') muss genau einmal vorkommen (nur bis XJ-3.1.1 einschl. nötig; danach in XJ Pflicht!) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/tns:staat">
							<sch:assert test="count(tns:auswahl_staat) = 1" id="SCH-ZSSR-0175">[SCH-ZSSR-0175] Grunddaten: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift/tns:staat/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'sitz' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
							<sch:assert test="count(tns:sitz) = 1" id="SCH-ZSSR-0180">[SCH-ZSSR-0180] Grunddaten: Das Element 'sitz' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:sitz/tns:staat/') muss genau einmal vorkommen (nur bis XJ-3.1.1 einschl. nötig; danach in XJ Pflicht! Elternelement 'staat' soll hier NICHT Pflicht sein!) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:sitz/tns:staat">
							<sch:assert test="count(tns:auswahl_staat) = 1" id="SCH-ZSSR-0185">[SCH-ZSSR-0185] Grunddaten: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:sitz/tns:staat/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
							<sch:assert test="count(tns:anschrift) = 1" id="SCH-ZSSR-0190">[SCH-ZSSR-0190] Grunddaten: Das Element 'anschrift' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'anschriftenzusatz' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:anschriftenzusatz) &lt; 2" id="SCH-ZSSR-0195">[SCH-ZSSR-0195] Grunddaten: Das Element 'anschriftenzusatz' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') darf höchstens einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:strasse) = 1" id="SCH-ZSSR-0200">[SCH-ZSSR-0200] Grunddaten: Das Element 'strasse' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-ZSSR-0205">[SCH-ZSSR-0205] Grunddaten: Das Element 'postleitzahl' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:ort) = 1" id="SCH-ZSSR-0210">[SCH-ZSSR-0210] Grunddaten: Das Element 'ort' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
							<sch:assert test="count(tns:staat) = 1" id="SCH-ZSSR-0215">[SCH-ZSSR-0215] Grunddaten: Das Element 'staat' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
					
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/tns:staat/') muss genau einmal vorkommen (nur bis XJ-3.1.1 einschl. nötig; danach in XJ Pflicht!) -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/tns:staat">
							<sch:assert test="count(tns:auswahl_staat) = 1" id="SCH-ZSSR-0220">[SCH-ZSSR-0220] Grunddaten: Das Element 'auswahl_staat' (zu '/tns:auswahl_beteiligter/tns:organisation/tns:anschrift/tns:staat/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
			
					<sch:pattern>
						<!-- Kardinalitaet: Das Element 'angabenZurRechtsform' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen -->
						<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
							<sch:assert test="count(tns:angabenZurRechtsform) = 1" id="SCH-ZSSR-0225">[SCH-ZSSR-0225] Grunddaten: Das Element 'angabenZurRechtsform' (zu '/tns:auswahl_beteiligter/tns:organisation/') muss genau einmal vorkommen!</sch:assert>
						</sch:rule>
					</sch:pattern>
				<!-- /Individuelle Rules -->
				
			<!-- /ZSSR - GRUNDDATEN-GESCHAEFTSREGELN -->



			<!-- ZSSR - SGO-GESCHAEFTSREGELN: -->
		
				<!-- Abstrakte Rules -->
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokument' muss genau einmal vorkommen (1) -->
					<sch:rule id="SCH-ZSSR-0500" abstract="true">
						<sch:assert test="count(tns:dokument) = 1" >[SCH-ZSSR-0500] SGO: Das Element 'dokument' muss genau einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokument' muss mindestens einmal vorkommen (1..n) -->
					<sch:rule id="SCH-ZSSR-0501" abstract="true">
						<sch:assert test="count(tns:dokument) &gt; 0" >[SCH-ZSSR-0501] SGO: Das Element 'dokument' muss mindestens einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'dokumententyp' muss genau einmal vorkommen (1) -->
					<sch:rule id="SCH-ZSSR-0502" abstract="true">
						<sch:assert test="count(tns:dokumententyp) = 1" >[SCH-ZSSR-0502] SGO: Das Element 'dokumententyp' muss genau einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>

				<sch:pattern>
					<!-- Fester Wert: Das Boolean-Element 'akteneinsicht' muss immer den Wert 'false' haben -->
					<sch:rule id="SCH-ZSSR-0503" abstract="true">
						<sch:assert test=". = boolean(0)">[SCH-ZSSR-0503] SGO: Das Boolean-Element 'akteneinsicht' muss immer den Wert 'false' haben!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'datei' muss genau einmal vorkommen (1) -->					
					<sch:rule id="SCH-ZSSR-0504" abstract="true">
						<sch:assert test="count(tns:datei) = 1" >[SCH-ZSSR-0504] SGO: Das Element 'datei' muss genau einmal vorkommen!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Fester Wert: Das Boolean-Element 'ruecksendungEEB.erforderlich' muss immer den Wert 'false' haben -->
					<sch:rule id="SCH-ZSSR-0505" abstract="true">
						<sch:assert test=". = boolean(0)">[SCH-ZSSR-0505] SGO: Das Boolean-Element 'ruecksendungEEB.erforderlich' muss immer den Wert 'false' haben!</sch:assert>
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
					
					<!-- Kardinalitaet: Das Element 'dokument' muss mindestens einmal vorkommen (1..n) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte">
						<sch:extends rule="SCH-ZSSR-0501"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte">
						<sch:extends rule="SCH-ZSSR-0501"/>
					</sch:rule>
					
					<!-- Kardinalitaet: Das Element 'dokumententyp' und 'datei' muss genau einmal vorkommen (1) -->
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<!-- Kardinalitaet: Das Element 'dokumententyp' muss genau einmal vorkommen (1) -->
						<sch:extends rule="SCH-ZSSR-0502"/>
						<!-- Kardinalitaet: Das Element 'datei' muss genau einmal vorkommen (1) (Teil 1/2) -->
						<sch:extends rule="SCH-ZSSR-0504"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<!-- Kardinalitaet: Das Element 'dokumententyp' muss genau einmal vorkommen (1) -->
						<sch:extends rule="SCH-ZSSR-0502"/>
						<!-- Kardinalitaet: Das Element 'datei' muss genau einmal vorkommen (1) (Teil 1/2) -->
						<sch:extends rule="SCH-ZSSR-0504"/>
					</sch:rule>
					
					<!-- Fester Wert: Das Boolean-Element 'akteneinsicht' muss immer den Wert 'false' haben -->
					<sch:rule context="tns:nachricht.zssr.bestaetigung.2300001/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:akteneinsicht">
						<sch:extends rule="SCH-ZSSR-0503"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:akteneinsicht">
						<sch:extends rule="SCH-ZSSR-0503"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.fehlermeldung.2300003/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:akteneinsicht">
						<sch:extends rule="SCH-ZSSR-0503"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:akteneinsicht">
						<sch:extends rule="SCH-ZSSR-0503"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:akteneinsicht">
						<sch:extends rule="SCH-ZSSR-0503"/>
					</sch:rule>
					
					<!-- Kardinalitaet: Das Element 'datei' muss genau einmal vorkommen (1) (Teil 2/2) -->
					<sch:rule context="tns:nachricht.zssr.bestaetigung.2300001/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<sch:extends rule="SCH-ZSSR-0504"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.fehlermeldung.2300003/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<sch:extends rule="SCH-ZSSR-0504"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten">
						<sch:extends rule="SCH-ZSSR-0504"/>
					</sch:rule>
					
					<!-- Fester Wert: Das Boolean-Element 'ruecksendungEEB.erforderlich' muss immer den Wert 'false' haben -->
					<sch:rule context="tns:nachricht.zssr.bestaetigung.2300001/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:ruecksendungEEB.erforderlich">
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:ruecksendungEEB.erforderlich">
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.fehlermeldung.2300003/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:ruecksendungEEB.erforderlich">
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.mitteilungEinschlaegig.2300004/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:ruecksendungEEB.erforderlich">
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:ruecksendungEEB.erforderlich">
						<sch:extends rule="SCH-ZSSR-0505"/>
					</sch:rule>
				</sch:pattern>
				<!-- /Erweiterungen (extends) -->
		
		
				<!-- Abstrakte Pattern -->
				<sch:pattern id="SCH-ZSSR-0525" abstract="true">
					<!-- Sonstige Prüfung: Der Dateiname (welcher auch das Dateiformat und den Punkt als Trennzeichen enthält) darf die zulässige Anzahl von 90 Zeichen nicht überschritten -->
					<!-- Hier wird angegeben: 'Dateiname.DateiformatImKlartext' (Beispiel: Schutzschrift.pdf) -->									   
					<sch:rule context="$pfadNachricht/tns:dateiname">
						<sch:assert test="string-length(.) &lt; 91">[SCH-ZSSR-0525] SGO: Der Dateiname (welcher auch das Dateiformat und den Punkt als Trennzeichen enthält) darf die zulässige Zeichenanzahl von 90 nicht überschreiten!</sch:assert>
					</sch:rule>
				</sch:pattern>	
		
				<sch:pattern id="SCH-ZSSR-0526" abstract="true">
					<!-- Sonstige Prüfung: SGO: Der Dateiname (hier 'dateiname.bezugsdatei', welcher auch das tatsächliche Dateiformat und den Punkt als Trennzeichen enthält) darf die zulässige Zeichenanzahl von 90 nicht überschreiten -->
					<!-- Hier wird angegeben: 'Dateiname.DateiformatImKlartext' (Beispiel: Schutzschrift.pdf) -->
					<sch:rule context="$pfadNachricht/tns:dateiname.bezugsdatei">
						<sch:assert test="string-length(.) &lt; 91">[SCH-ZSSR-0526] SGO: Der Dateiname (hier 'dateiname.bezugsdatei', welcher auch das tatsächliche Dateiformat und den Punkt als Trennzeichen enthält) darf die zulässige Zeichenanzahl von 90 nicht überschreiten!</sch:assert>
					</sch:rule>
				</sch:pattern>	
		
				<sch:pattern id="SCH-ZSSR-0527" abstract="true">
					<!-- Pattern: Der Dateiname darf kein Kaufmannsund-Zeichen enthalten -->
					<sch:rule context="$pfadNachricht/tns:dateiname">
						<sch:assert test="not(matches(.,'[&amp;&#38;&#x0026;]'))">[SCH-ZSSR-0527] SGO: Der Dateiname darf kein Kaufmannsund-Zeichen enthalten!</sch:assert>
					</sch:rule>
				</sch:pattern>	
		
				<sch:pattern id="SCH-ZSSR-0528" abstract="true">
					<!-- Pattern: Der Dateiname (hier 'dateiname.bezugsdatei') darf kein Kaufmannsund-Zeichen enthalten -->
					<sch:rule context="$pfadNachricht/tns:dateiname.bezugsdatei">
						<sch:assert test="not(matches(.,'[&amp;&#38;&#x0026;]'))">[SCH-ZSSR-0528] SGO: Der Dateiname (hier 'dateiname.bezugsdatei') darf kein Kaufmannsund-Zeichen enthalten!</sch:assert>
					</sch:rule>
				</sch:pattern>
				<!-- /Abstrakte Pattern -->

				<!-- Parameter-Deklaration (param) -->
				<sch:pattern is-a="SCH-ZSSR-0525">
					<!-- Sonstige Prüfung: Der Dateiname darf zusammen mit dem Dateiformat die zulässige Anzahl von 90 Zeichen nicht überschritten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-ZSSR-0525">
					<!-- Sonstige Prüfung: Der Dateiname darf zusammen mit dem Dateiformat die zulässige Anzahl von 90 Zeichen nicht überschritten -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
		
				<sch:pattern is-a="SCH-ZSSR-0526">
					<!-- Sonstige Prüfung: Der Dateiname (hier 'dateiname.bezugsdatei' welcher auch das Dateiformat und den Punkt als Trennzeichen enthält) ist zu lang, da die zulässigen 90 Zeichen überschritten werden -->
					<sch:param name="pfadNachricht" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002/tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei"/>
				</sch:pattern>
				<sch:pattern is-a="SCH-ZSSR-0526">
					<!-- Sonstige Prüfung: Der Dateiname (hier 'dateiname.bezugsdatei' welcher auch das Dateiformat und den Punkt als Trennzeichen enthält) ist zu lang, da die zulässigen 90 Zeichen überschritten werden -->
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
				<!-- /Parameter-Deklaration (param) -->
		
		
				<!-- Individuelle Rules -->
				<sch:pattern>
					<!-- Sonstige Prüfung: Es existiert mind. ein Dokument mit 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '219|Schutzschrift' beim Element 'dokumententyp' (hier nur Nachricht 2300002; nicht Bereich Akte/Teilakte, die jedoch nicht vorkommen sollen!) -->
					<sch:rule context="/">
						<sch:assert test="if (descendant::tns:nachricht.zssr.einreichungSchutzschrift.2300002) then (//tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:dokumententyp/code = '219') else true()" id="SCH-ZSSR-0550">[SCH-ZSSR-0550] SGO: Es existiert nicht mind. ein Dokument mit einem 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '219|Schutzschrift' beim Element 'dokumententyp'!</sch:assert>
					</sch:rule>
				</sch:pattern>
		
				<sch:pattern>
					<!-- Sonstige Prüfung: Es existiert mind. ein Dokument mit 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '218|Rücknahme' beim Element 'dokumententyp' (hier nur Nachricht 2300005; nicht Bereich Akte/Teilakte, die jedoch nicht vorkommen sollen!) -->
					<sch:rule context="/">
						<sch:assert test="if (descendant::tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005) then (//tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:dokumententyp/code = '218') else true()" id="SCH-ZSSR-0555">[SCH-ZSSR-0555] SGO: Es existiert nicht mind. ein Dokument mit einem 'GDS.Dokumenttyp.Typ3' - Codelisten-Eintrag '218|Rücknahme' beim Element 'dokumententyp'!</sch:assert>
					</sch:rule>
				</sch:pattern>

				<sch:pattern>
					
					<!-- Sonstige Prüfung: Nur für Nachrichten 2300002 und 2300005, sowie nur für 'tns:schriftgutobjekte/tns:dokument' und nicht für 'tns:schriftgutobjekte/tns:akte/.../tns:dokument'! In einem Element 'dokument' (A) verweist ein Unterelement 'datei' (A) [Kardinalität: 1] mit dem weiteren Unterelement 'dateiname.bezugsdatei' [Kardinalität: 0..n] per Wert auf das in einem anderen(!), Geschwister - 'dokument' (B) im  Unterelement 'datei'(B) zwingend vorhandene, weitere Unterelement 'dateiname' als Bezugsdatei. Dieser referenzierte Instanz-Knoten 'dateiname' muss den gleichen Wert haben, wie 'dateiname.bezugsdatei' aus (A)! -->
					<!-- Beispiel: 'dokument' (B) mit 'datei' (B) hat folgende Unterelemente: 'dateiname' -> Schutzschrift.pdf, ('dateiformat' -> 018 [entspricht Codeschlüssel für 'pdf'; Element 'dateiformat' nur bis XJ-3.1; wird bei ZSSR jedoch nicht verwendet]), ('dateiname.bezugsdatei' [Element hier nicht vorhanden]); dokument (A) mit datei (A) hat folgende Unterelemente: 'dateiname' -> Schutzschrift.pkcs7, 'dateiformat' -> pkcs7, 'dateiname.bezugsdatei' -> Schutzschrift.pdf -->
					<!-- Achtung: Wenn Element 'dateiname.bezugsdatei' befüllt ist, muss dort (wie auch beim Element 'dateiname') immer ein Dateiformat mit einem vorangestellten Punkt mit angegeben werden (z.B.: 'Schutzschrift.pdf')! -->
					<sch:rule context="//tns:schriftgutobjekte/tns:dokument/tns:xjustiz.fachspezifischeDaten/tns:datei/tns:dateiname.bezugsdatei">
						<sch:assert test="if (ancestor::tns:nachricht.zssr.einreichungSchutzschrift.2300002 | ancestor::tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005) then (. = (../../../preceding-sibling::*/tns:xjustiz.fachspezifischeDaten/tns:datei/tns:dateiname|../../../following-sibling::*/tns:xjustiz.fachspezifischeDaten/tns:datei/tns:dateiname)) else true()" id="SCH-ZSSR-0560">[SCH-ZSSR-0560] SGO: Es existiert keine andere Datei mit einem Namen '<sch:value-of select="." />', wie unter 'dateiname.bezugsdatei' angegeben (wobei 'dateiname' und 'dateiname.bezugsdatei' immer ein tatsächliches Dateiformat mit einem vorangestellten Punkt enthalten müssen)!</sch:assert>
					</sch:rule>

				</sch:pattern>
				
				<!-- /Individuelle Rules -->

			<!-- /ZSSR - SGO-GESCHAEFTSREGELN -->



			<!-- ZSSR - FACHDATEN-GESCHAEFTSREGELN: -->
			
			   <!-- z.Zt. keine 'business rules'! -->
			   
			<!-- /ZSSR - FACHDATEN-GESCHAEFTSREGELN -->



			<!-- ZSSR - CODELISTEN-GESCHAEFTSREGELN: -->
			
			<!-- Abstrakte Pattern -->
				<!-- 'Code.GDS.Dokumentklasse.Typ3' -->
				<sch:pattern id="SCH-ZSSR-0900" abstract="true">
					<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumentklasse' -->
					<sch:rule context="$pfadNachrichtAlle//tns:xjustiz.fachspezifischeDaten/tns:dokumentklasse">
						<sch:assert test="code = ('001','005','015')">[SCH-ZSSR-0900] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Dokumentklasse' zum Element 'dokumentklasse' darf nur folgende Werte haben:'001','005' oder '015'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<!-- 'Code.GDS.Dokumenttyp.Typ3' -->
				<sch:pattern id="SCH-ZSSR-0905" abstract="true">
					<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
					<sch:rule context="$pfadNachrichtAlle//tns:xjustiz.fachspezifischeDaten/tns:dokumententyp">
						<sch:assert test="code = ('217','218','219')">[SCH-ZSSR-0905] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Dokumenttyp' zum Element 'dokumententyp' darf nur folgende Werte haben:'217','218' oder '219'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<!--         'Code.GDS.Ereignis.Typ3'         --> 
				<!--   entfällt wegen Nachrichtenkopf-Element --> 
				<!-- 'ereignis'(Typ 'Code.GDS.Ereignis.Typ3') -->  
				<!--        mit Kardinalität '0'!             -->
				
				<!-- 'Code.GDS.Rollenbezeichnung' -->
				<sch:pattern id="SCH-ZSSR-0915" abstract="true">
					<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
					<sch:rule context="$pfadNachrichtAlle//tns:beteiligung/tns:rolle/tns:rollenbezeichnung">
						<sch:assert test="code = ('015','016','088','132')">[SCH-ZSSR-0915] Codeliste: Der Codelistenschlüssel der Typ1-Codeliste 'GDS.Rollenbezeichnung' zum Element 'rollenbezeichnung' darf nur folgende Werte haben:'015','016','088' oder '132'!</sch:assert>
					</sch:rule>
				</sch:pattern>
			<!-- /Abstrakte Pattern -->
	
	
			<!-- Parameter-Deklaration (param) -->
			<sch:pattern is-a="SCH-ZSSR-0900">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumentklasse' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.bestaetigung.2300001"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0900">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumentklasse' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0900">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumentklasse' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.fehlermeldung.2300003"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0900">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumentklasse' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.mitteilungEinschlaegig.2300004"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0900">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumentklasse' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005"/>
			</sch:pattern>
			
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.bestaetigung.2300001"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.fehlermeldung.2300003"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.mitteilungEinschlaegig.2300004"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0905">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Dokumenttyp' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005"/>
			</sch:pattern>
			
			<sch:pattern is-a="SCH-ZSSR-0915">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung'; derzeit nicht für diese Nachricht benötigt, da Nachricht ohne Grunddaten! -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.bestaetigung.2300001"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0915">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.einreichungSchutzschrift.2300002"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0915">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung'; derzeit nicht für diese Nachricht benötigt, da Nachricht ohne Grunddaten! -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.fehlermeldung.2300003"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0915">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.mitteilungEinschlaegig.2300004"/>
			</sch:pattern>
			<sch:pattern is-a="SCH-ZSSR-0915">
				<!-- Eingeschränkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung'; derzeit nicht für diese Nachricht benötigt, da Nachricht ohne Grunddaten! -->
				<sch:param name="pfadNachrichtAlle" value="tns:nachricht.zssr.ruecknahmeSchutzschrift.2300005"/>
			</sch:pattern>
			<!-- /Parameter-Deklaration (param) -->
	
			<!-- /ZSSR - CODELISTEN-GESCHAEFTSREGELN -->
	
	<!-- /ZSSR - NACHRICHTEN -->
	

</sch:schema>