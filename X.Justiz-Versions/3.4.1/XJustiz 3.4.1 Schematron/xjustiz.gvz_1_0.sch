<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz GVZ
    Version 1.0.3 (Juli 2022; Korrektur: SCH-GVZ-0031 und SCH-GVZ-0032; Optimierung: SCH-GVZ-0005, SCH-GVZ-0010, SCH-GVZ-0015, SCH-GVZ-0025, SCH-GVZ-0030, SCH-GVZ-0035)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />
	
	<!-- ===================================== -->
	<!--          Fachdatensatz GVZ            -->
	<!-- ===================================== -->


	<!-- GVZ - NACHRICHT 2500001 -->
	
		<!-- GVZ - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
	
			<!-- Individuelle Rules -->
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'herstellerinformation' muss vorkommen -->
				<sch:rule context="tns:nachricht.gvz.datenaustausch.2500001/tns:nachrichtenkopf">
					<sch:assert test="exists(tns:herstellerinformation)" id="SCH-GVZ-0005">[SCH-GVZ-0005] Nachrichtenkopf: Das Element 'herstellerinformation' muss vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<!-- /Individuelle Rules -->
	
		<!-- /GVZ - NACHRICHTENKOPF-GESCHAEFTSREGELN -->
	
	
	
		<!-- GVZ - GRUNDDATEN-GESCHAEFTSREGELN: -->
		
			<!-- Individuelle Rules -->
	
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'verfahrensdaten' muss vorkommen -->
				<sch:rule context="tns:nachricht.gvz.datenaustausch.2500001/tns:grunddaten">
					<sch:assert test="exists(tns:verfahrensdaten)" id="SCH-GVZ-0010">[SCH-GVZ-0010] Grunddaten: Das Element 'verfahrensdaten' muss vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'beteiligung' muss mind. zweimal vorkommen -->
				<sch:rule context="tns:nachricht.gvz.datenaustausch.2500001/tns:grunddaten/tns:verfahrensdaten">
					<sch:assert test="count(tns:beteiligung) &gt; 1" id="SCH-GVZ-0015">[SCH-GVZ-0015] Grunddaten: Das Element 'beteiligung' muss mindestens zweimal vorkommen! (In jeder Sonderakte müssen mindestens zwei Beteiligte vorhanden sein: Gläubiger und Schuldner.)</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rolle' muss genau einmal vorkommen -->
				<sch:rule context="tns:nachricht.gvz.datenaustausch.2500001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
					<sch:assert test="count(tns:rolle) = 1" id="SCH-GVZ-0020">[SCH-GVZ-0020] Grunddaten: Das Element 'rolle' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollennummer' muss vorkommen -->
				<sch:rule context="tns:nachricht.gvz.datenaustausch.2500001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="exists(tns:rollennummer)" id="SCH-GVZ-0025">[SCH-GVZ-0025] Grunddaten: Das Element 'rollennummer' muss vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
				
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'rollenbezeichnung' muss vorkommen -->
				<sch:rule context="tns:nachricht.gvz.datenaustausch.2500001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
					<sch:assert test="exists(tns:rollenbezeichnung)" id="SCH-GVZ-0030">[SCH-GVZ-0030] Grunddaten: Das Element 'rollenbezeichnung' muss vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Es muss mind. ein Gläubiger (aus der Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 089) vorhanden sein -->
				<sch:rule context="/">
					<sch:assert test="if (descendant::tns:nachricht.gvz.datenaustausch.2500001) then (//tns:beteiligung/tns:rolle/tns:rollenbezeichnung/code = '089') else true()" id="SCH-GVZ-0031">[SCH-GVZ-0031] Grunddaten: Es muss mind. ein Beteiligter in der Rolle des Gläubigers (Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 089) vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<sch:pattern>
				<!-- Kardinalitaet: Es muss ein Schuldner (aus der Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 143) vorhanden sein -->
				<sch:rule context="/">
					<sch:assert test="if (descendant::tns:nachricht.gvz.datenaustausch.2500001) then (//tns:beteiligung/tns:rolle/tns:rollenbezeichnung/code = '143') else true()" id="SCH-GVZ-0032">[SCH-GVZ-0032] Grunddaten: Es muss mind. ein Beteiligter in der Rolle des Schuldners (Codeliste 'GDS.Rollenbezeichnung', Schlüssel: 143) vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das organisation-Auswahl-Element 'ra.kanzlei' darf nicht vorkommen -->
				<sch:rule context="tns:nachricht.gvz.datenaustausch.2500001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter">
					<sch:assert test="not(exists(tns:ra.kanzlei))" id="SCH-GVZ-0035">[SCH-GVZ-0035] Grunddaten: Das 'organisation' - Auswahl-Element 'ra.kanzlei' darf nicht vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
		
			<!-- /Individuelle Rules -->
	
		<!-- /GVZ - GRUNDDATEN-GESCHAEFTSREGELN -->
		
		
	<!-- /GVZ - NACHRICHT 2500001 -->


</sch:schema>