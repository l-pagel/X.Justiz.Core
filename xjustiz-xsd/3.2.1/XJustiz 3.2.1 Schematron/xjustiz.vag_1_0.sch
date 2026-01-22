<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz VAG
    Version 1.0.3 (Oktober 2020; Ereignis-Code bei 'SCH-VAG-0130' und 'SCH-VAG-0135' von '92' nach '092' geaendert. Die Schematron-Regel 'SCH-VAG-0105' ist entfallen, da 'auswahl_staat' zu '/tns:organisation/tns:anschrift/tns:staat' bereits auf Schema-Ebene nun Pflichtelement ist. Name 'versorgungstra(e)ger' korrigiert. Elementname 'zumAnrecht' bei 'SCH-VAG-0120' und 'SCH-VAG-0125' korrigiert. ID in Fehlertext aufgenommen.)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />
	
	<!-- ===================================== -->
	<!--          Fachdatensatz VAG            -->
	<!-- ===================================== -->


	<!-- VAG - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
		
		<!-- VAG - NACHRICHTEN ALLE -->
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'aktenzeichen.absender' muss genau einmal vorkommen -->
			<sch:rule context="//tns:nachrichtenkopf">
				<sch:assert test="count(tns:aktenzeichen.absender) = 1" id="SCH-VAG-0001">[SCH-VAG-0001] Nachrichtenkopf: Das Element 'aktenzeichen.absender' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'aktenzeichen.empfaenger' muss genau einmal vorkommen -->
			<sch:rule context="//tns:nachrichtenkopf">
				<sch:assert test="count(tns:aktenzeichen.empfaenger) = 1" id="SCH-VAG-0002">[SCH-VAG-0002] Nachrichtenkopf: Das Element 'aktenzeichen.empfaenger' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen -->
			<sch:rule context="//tns:nachrichtenkopf">
				<sch:assert test="count(tns:ereignis) = 1" id="SCH-VAG-0005">[SCH-VAG-0005] Nachrichtenkopf: Das Element 'ereignis' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		
		<!-- /VAG - NACHRICHTEN ALLE -->
		
	<!-- /VAG - NACHRICHTENKOPF-GESCHAEFTSREGELN -->
	
	
	
	<!-- VAG - GRUNDDATEN-GESCHAEFTSREGELN: -->
	
		<!-- Abstrakte Rules -->
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'beteiligung' muss mindestens zweimal vorkommen -->
					<sch:rule id="SCH-VAG-0010" abstract="true">
						<sch:report test="count(tns:beteiligung) &lt; 2" >[SCH-VAG-0010] Grunddaten: Das Element 'beteiligung' muss mindestens zweimal vorkommen!</sch:report>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Kardinalitaet: Das Element 'beteiligung' muss mindestens dreimal vorkommen -->
					<sch:rule id="SCH-VAG-0015" abstract="true">
						<sch:report test="count(tns:beteiligung) &lt; 3" >[SCH-VAG-0015] Grunddaten: Das Element 'beteiligung' muss mindestens dreimal vorkommen!</sch:report>
					</sch:rule>
				</sch:pattern>
		<!-- /Abstrakte Pattern -->
		
		<!-- Erweiterungen (extends)-->
				<sch:pattern>	
					<!-- Kardinalitaet: Das Element 'beteiligung' muss mindestens zweimal vorkommen -->
					<sch:rule context="tns:nachricht.vag.auskunft.0250001/tns:grunddaten/tns:verfahrensdaten">
						<sch:extends rule="SCH-VAG-0010"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.vag.kurzmitteilung.versorgungstraegerZuGericht.0250008/tns:grunddaten/tns:verfahrensdaten">
						<sch:extends rule="SCH-VAG-0010"/>
					</sch:rule>
					
					<!-- Kardinalitaet: Das Element 'beteiligung' muss mindestens dreimal vorkommen -->
					<sch:rule context="tns:nachricht.vag.auskunftsersuchen.0250002/tns:grunddaten/tns:verfahrensdaten">
						<sch:extends rule="SCH-VAG-0015"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.vag.empfangsbestaetigung.0250003/tns:grunddaten/tns:verfahrensdaten">
						<sch:extends rule="SCH-VAG-0015"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.vag.gerichtlicheEntscheidung.0250006/tns:grunddaten/tns:verfahrensdaten">
						<sch:extends rule="SCH-VAG-0015"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.vag.kurzmitteilung.gerichtZuVersorgungstraeger.0250007/tns:grunddaten/tns:verfahrensdaten">
						<sch:extends rule="SCH-VAG-0015"/>
					</sch:rule>
					<sch:rule context="tns:nachricht.vag.rechtskraftmitteilung.0250009/tns:grunddaten/tns:verfahrensdaten">
						<sch:extends rule="SCH-VAG-0015"/>
					</sch:rule>
				</sch:pattern>
		<!-- /Erweiterungen (extends)-->				
						
						
		<!-- Individuelle Rules -->
		
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'verfahrensdaten' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten">
					<sch:assert test="count(tns:verfahrensdaten) = 1" id="SCH-VAG-0020">[SCH-VAG-0020] Grunddaten: Das Element 'verfahrensdaten' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'instanzdaten' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:instanzdaten) = 1" id="SCH-VAG-0025">[SCH-VAG-0025] Grunddaten: Das Element 'instanzdaten' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'sachgebiet' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:sachgebiet) = 1" id="SCH-VAG-0030">[SCH-VAG-0030] Grunddaten: Das Element 'sachgebiet' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'aktenzeichen' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
					<sch:assert test="count(tns:aktenzeichen) = 1" id="SCH-VAG-0035">[SCH-VAG-0035] Grunddaten: Das Element 'aktenzeichen' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rolle' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
					<sch:assert test="count(tns:rolle) = 1" id="SCH-VAG-0040">[SCH-VAG-0040] Grunddaten: Das Element 'rolle' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollennummer' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="count(tns:rollennummer) = 1" id="SCH-VAG-0045">[SCH-VAG-0045] Grunddaten: Das Element 'rollennummer' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollenbezeichnung' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="count(tns:rollenbezeichnung) = 1" id="SCH-VAG-0050">[SCH-VAG-0050] Grunddaten: Das Element 'rollenbezeichnung' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'vorname' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName">
					<sch:assert test="count(tns:vorname) = 1" id="SCH-VAG-0055">[SCH-VAG-0055] Grunddaten: Das natuerlichePerson-Element 'vorname' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'anschrift' muss mindestens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
					<sch:report test="count(tns:anschrift) &lt; 1" id="SCH-VAG-0060">[SCH-VAG-0060] Grunddaten: Das natuerlichePerson-Element 'anschrift' muss mindestens einmal vorkommen!</sch:report>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'anschriftstyp' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="count(tns:anschriftstyp) = 1" id="SCH-VAG-0065">[SCH-VAG-0065] Grunddaten: Das natuerlichePerson-Element 'anschriftstyp' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'postleitzahl' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-VAG-0070">[SCH-VAG-0070] Grunddaten: Das natuerlichePerson-Element 'postleitzahl' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das natuerlichePerson-Element 'ort' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
					<sch:assert test="count(tns:ort) = 1" id="SCH-VAG-0075">[SCH-VAG-0075] Grunddaten: Das natuerlichePerson-Element 'ort' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'anschrift' muss mindestens einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
					<sch:report test="count(tns:anschrift) &lt; 1" id="SCH-VAG-0080">[SCH-VAG-0080] Grunddaten: Das organisation-Element 'anschrift' muss mindestens einmal vorkommen!</sch:report>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'anschriftstyp' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="count(tns:anschriftstyp) = 1" id="SCH-VAG-0085">[SCH-VAG-0085] Grunddaten: Das organisation-Element 'anschriftstyp' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'postleitzahl' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="count(tns:postleitzahl) = 1" id="SCH-VAG-0090">[SCH-VAG-0090] Grunddaten: Das organisation-Element 'postleitzahl' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'ort' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="count(tns:ort) = 1" id="SCH-VAG-0095">[SCH-VAG-0095] Grunddaten: Das organisation-Element 'ort' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Element 'staat' muss genau einmal vorkommen -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
					<sch:assert test="count(tns:staat) = 1" id="SCH-VAG-0100">[SCH-VAG-0100] Grunddaten: Das organisation-Element 'staat' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
		<!-- /Individuelle Rules -->
		
	<!-- /VAG - GRUNDDATEN-GESCHAEFTSREGELN -->
		
		
		
	<!-- VAG - FACHDATEN-GESCHAEFTSREGELN -->
		
		<!-- Individuelle Rules -->
		
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'andereBezugsgroesse' muss genau einmal vorkommen, wenn das Element 'bezugsgroesse' den Codelistenwert '99' hat -->
				<sch:rule context="tns:nachricht.vag.auskunft.0250001/tns:fachdaten/tns:anrecht[tns:bezugsgroesse/code = '99']">
					<sch:assert test="count(tns:andereBezugsgroesse) = 1" id="SCH-VAG-0110">[SCH-VAG-0110] Fachdaten: Das Element 'andereBezugsgroesse' muss genau einmal vorkommen, wenn das Element 'bezugsgroesse' den Codelistenwert '99' hat!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'andereBezugsgroesse' darf nicht vorkommen, wenn das Element 'bezugsgroesse' nicht den Codelistenwert '99' hat -->
				<sch:rule context="tns:nachricht.vag.auskunft.0250001/tns:fachdaten/tns:anrecht[tns:bezugsgroesse/code != '99']">
					<sch:report test="count(tns:andereBezugsgroesse) = 1" id="SCH-VAG-0115">[SCH-VAG-0115] Fachdaten: Das Element 'andereBezugsgroesse' darf nicht vorkommen, wenn das Element 'bezugsgroesse' nicht den Codelistenwert '99' hat!</sch:report>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'andereBezugsgroesse' muss genau einmal vorkommen, wenn das Element 'bezugsgroesse' den Codelistenwert '99' hat -->
				<sch:rule context="tns:nachricht.vag.gerichtlicheEntscheidung.0250006/tns:fachdaten/tns:zumAnrecht[tns:bezugsgroesse/code = '99']">
					<sch:assert test="count(tns:andereBezugsgroesse) = 1" id="SCH-VAG-0120">[SCH-VAG-0120] Fachdaten: Das Element 'andereBezugsgroesse' muss genau einmal vorkommen, wenn das Element 'bezugsgroesse' den Codelistenwert '99' hat!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'andereBezugsgroesse' darf nicht vorkommen, wenn das Element 'bezugsgroesse' nicht den Codelistenwert '99' hat -->
				<sch:rule context="tns:nachricht.vag.gerichtlicheEntscheidung.0250006/tns:fachdaten/tns:zumAnrecht[tns:bezugsgroesse/code != '99']">
					<sch:report test="count(tns:andereBezugsgroesse) = 1" id="SCH-VAG-0125">[SCH-VAG-0125] Fachdaten: Das Element 'andereBezugsgroesse' darf nicht vorkommen, wenn das Element 'bezugsgroesse' nicht den Codelistenwert '99' hat!</sch:report>
				</sch:rule>
			</sch:pattern>
			
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'sachstandsmitteilung' muss mindestens einmal vorkommen, wenn das Nachrichtenkopf-Element 'ereignis' den Codelistenwert '092' hat -->
				<sch:rule context="tns:nachricht.vag.kurzmitteilung.versorgungstraegerZuGericht.0250008[tns:nachrichtenkopf/tns:ereignis/code = '092']">
					<sch:assert test="count(tns:fachdaten/tns:sachstandsmitteilung) &gt; 0" id="SCH-VAG-0130">[SCH-VAG-0130] Fachdaten: Das Element 'sachstandsmitteilung' muss mindestens einmal vorkommen, wenn das Nachrichtenkopf-Element 'ereignis' den Codelistenwert '092' hat!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'sachstandsmitteilung' darf nicht vorkommen, wenn das Nachrichtenkopf-Element 'ereignis' nicht den Codelistenwert '092' hat -->
				<sch:rule context="tns:nachricht.vag.kurzmitteilung.versorgungstraegerZuGericht.0250008[tns:nachrichtenkopf/tns:ereignis/code != '092']">
					<sch:report test="count(tns:fachdaten/tns:sachstandsmitteilung) &gt; 0" id="SCH-VAG-0135">[SCH-VAG-0135] Fachdaten: Das Element 'sachstandsmitteilung' darf nicht vorkommen, wenn das Nachrichtenkopf-Element 'ereignis' nicht den Codelistenwert '092' hat!</sch:report>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Familien-Element 'beginn' zur Ehezeit muss genau einmal vorkommen -->
				<sch:rule context="//tns:fachdaten/tns:familie/tns:ehezeit">
					<sch:assert test="count(tns:beginn) = 1" id="SCH-VAG-0140">[SCH-VAG-0140] Fachdaten: Das familie-Element 'beginn' zur Ehezeit muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Familien-Element 'ende' zur Ehezeit muss genau einmal vorkommen -->
				<sch:rule context="//tns:fachdaten/tns:familie/tns:ehezeit">
					<sch:assert test="count(tns:ende) = 1" id="SCH-VAG-0145">[SCH-VAG-0145] Fachdaten: Das familie-Element 'ende' zur Ehezeit muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
		<!-- /Individuelle Rules -->
		
	<!-- /VAG - FACHDATEN-GESCHAEFTSREGELN -->
		

		
	<!-- VAG - CODELISTEN-GESCHAEFTSREGELN: -->

			<!-- Individuelle Rules -->

				<!-- 'Code.GDS.Rollenbezeichnung' -->
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Rollenbezeichnung' -->
					<sch:rule context="//tns:beteiligung/tns:rolle/tns:rollenbezeichnung">
						<sch:assert test="code = ('015','016','181')" id="SCH-VAG-0200">[SCH-VAG-0200] Codeliste: Der Codelistenschlüssel der Typ1-Codeliste 'GDS.Rollenbezeichnung' zum Element 'rollenbezeichnung' darf nur folgende Werte haben:'015','016' oder '181'!</sch:assert>
					</sch:rule>
				</sch:pattern>

				<!-- 'Code.GDS.Ereignis.Typ3' --> 
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.auskunft.0250001/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('065','066','067','068','069','070','071','072')" id="SCH-VAG-0205">[SCH-VAG-0205] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'065','066','067','068','069','070','071' oder '072'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.auskunftsersuchen.0250002/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('073','074')" id="SCH-VAG-0210">[SCH-VAG-0210] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'073' oder '074'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.empfangsbestaetigung.0250003/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('075','076')" id="SCH-VAG-0215">[SCH-VAG-0215] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'075' oder '076'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.fehler.gerichtZuVersorgungstraeger.0250004/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('011','077')" id="SCH-VAG-0220">[SCH-VAG-0220] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'011' oder '077'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.fehler.versorgungstraegerZuGericht.0250005/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('011','077')" id="SCH-VAG-0225">[SCH-VAG-0225] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'011' oder '077'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.gerichtlicheEntscheidung.0250006/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('078','079','080')" id="SCH-VAG-0230">[SCH-VAG-0230] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'078','079' oder '080'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.kurzmitteilung.gerichtZuVersorgungstraeger.0250007/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('081','082','083','084','085','086','087','088','089','090','091')" id="SCH-VAG-0235">[SCH-VAG-0235] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'081','082','083','084','085','086','087','088','089','090' oder '091'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.kurzmitteilung.versorgungstraegerZuGericht.0250008/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('092','093','094','095','096')" id="SCH-VAG-0240">[SCH-VAG-0240] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgende Werte haben:'092','093','094','095' oder '096'!</sch:assert>
					</sch:rule>
				</sch:pattern>
				
				<sch:pattern>
					<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis' -->
					<sch:rule context="tns:nachricht.vag.rechtskraftmitteilung.0250009/tns:nachrichtenkopf/tns:ereignis">
						<sch:assert test="code = ('097')" id="SCH-VAG-0245">[SCH-VAG-0245] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Element 'ereignis' darf nur folgenden Wert haben:'097'!</sch:assert>
					</sch:rule>
				</sch:pattern>

			<!-- /Individuelle Rules -->
	
	<!-- /VAG - CODELISTEN-GESCHAEFTSREGELN -->
		


</sch:schema>