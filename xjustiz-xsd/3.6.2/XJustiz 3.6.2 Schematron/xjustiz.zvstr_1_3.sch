<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz ZVSTR
    Version 1.3 (Änderung zur Vorversion: CR 24/026: Nachlieferung für XJustiz 3.5.1)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />
	
	<!-- ===================================== -->
	<!--          Fachdatensatz ZVSTR          -->
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
		
		<!-- /ZVSTR - NACHRICHTEN ALLE -->	
		
		<!-- Abstrakte Pattern -->
		
		<sch:pattern id="SCH-ZVSTR-0005" abstract="true">
			<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen -->
			<sch:rule context="$pfadNachricht2300001Und2300003/tns:nachrichtenkopf">
				<sch:assert test="count(tns:ereignis) = 1">[SCH-ZVSTR-0005] Nachrichtenkopf: Das Element 'ereignis' muss genau einmal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>
		
		<!-- Parameter-Deklaration (param) -->
		<sch:pattern is-a="SCH-ZVSTR-0005">
			<!-- Pattern: Das Element 'ereignis' muss genau einmal vorkommen -->
			<sch:param name="pfadNachricht2300001Und2300003" value="tns:nachricht.zvstr.durchsuchungsanordnung.2600001"/>
		</sch:pattern>

		<sch:pattern is-a="SCH-ZVSTR-0005">
			<!-- Pattern: Das Element 'ereignis' muss genau einmal vorkommen -->
			<sch:param name="pfadNachricht2300001Und2300003" value="tns:nachricht.zvstr.vollstreckungsauftrag.2600003"/>
		</sch:pattern>
		<!-- /Parameter-Deklaration (param) -->
		
		<!-- /Abstrakte Pattern -->
		
		<sch:pattern>
			<!-- Kardinalitaet: Das Element 'ereignis' muss genau einmal vorkommen -->
			<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002/tns:nachrichtenkopf">
				<sch:assert test="exists(tns:ereignis) and count(tns:ereignis) &lt; 3" id="SCH-ZVSTR-0006">[SCH-ZVSTR-0006] Nachrichtenkopf: Das Element 'ereignis' muss mindestens einmal, aber höchstens zweimal vorkommen!</sch:assert>
			</sch:rule>
		</sch:pattern>		
		
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
					<sch:assert test="count(tns:beteiligung) &gt; 1" id="SCH-ZVSTR-0025">[SCH-ZVSTR-0025] Grunddaten: Das Element 'beteiligung' muss mindestens zweimal vorkommen!</sch:assert>
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
					<sch:assert test="count(tns:rolle) = 1" id="SCH-ZVSTR-0045">[SCH-ZVSTR-0045] Grunddaten: Das Element 'rolle' muss genau einmal vorkommen!</sch:assert>
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
				<!-- Kardinalitaet: Zu jedem Beteiligten muss das Grunddaten-Element 'geschlecht' oder alternativ das Fachdaten-Element 'anrede.freitext' unter 'beteiligter.zusatz' vorhanden sein (wobei bei der Variante 'anrede.freitext' die 'rollennummer' beim Beteilgten mit der 'ref.rollennummer' im Fachdatenbereich 'beteilgter.zusatz' uebereinstimmen muss!)! -->
				<sch:rule context="//tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
					<sch:assert test="if (not(exists(current()//tns:geschlecht))) then exists(//tns:fachdaten/tns:beteiligter.zusatz/tns:anrede.freitext[../tns:ref.beteiligter/tns:ref.rollennummer=current()/tns:rolle/tns:rollennummer]) else true()" id="SCH-ZVSTR-071">[SCH-ZVSTR-0071] Grunddaten: Das Element 'geschlecht' muss vorkommen oder alternativ das Fachdaten-Element 'anrede.freitext' (wobei die Rollennummern aus der GDS-Beteiligung und dem Fachdatenelement 'beteiligter.zusatz/ref.beteiligter' übereinstimmen müssen)!</sch:assert>
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
	
	
	<!-- ZVSTR - FACHDATEN-GESCHAEFTSREGELN: -->	
	
		<!-- ZVSTR - NACHRICHTEN ALLE -->
	
			<!-- Individuelle Rules -->

			<sch:pattern>
				<!-- Kardinalitaet: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so dürfen Antragsdaten (komplexe Fachdaten-Element 'antragsdaten') nicht vorhanden sein! (nur Nachricht 1 und 2) -->
				<sch:rule context="//tns:nachrichtenkopf">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.durchsuchungsanordnung.2600001|ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002) then if (exists(tns:auswahl_absender/tns:absender.gericht)) then not(exists(../tns:fachdaten/tns:antragsdaten)) else true() else true()" id="SCH-ZVSTR-0110">
						[SCH-ZVSTR-0110] Fachdaten: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so dürfen Antragsdaten (komplexe Fachdaten-Element 'antragsdaten') nicht vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement 'beschlussdaten' vorhanden sein! (nur Nachricht 1 und 2) -->
				<sch:rule context="//tns:nachrichtenkopf">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.durchsuchungsanordnung.2600001|ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002) then if (exists(tns:auswahl_absender/tns:absender.gericht)) then exists(../tns:fachdaten/tns:beschlussdaten/tns:vomGerichtAuszufuellen) else true() else true()" id="SCH-ZVSTR-0115">
						[SCH-ZVSTR-0115] Fachdaten: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement 'beschlussdaten' vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul T das komplexe Fachdaten-Element 'vomGerichtAuszufuellen.modulT' unterhalb vom Elternelement 'beschlussdaten' vorhanden sein! (nur Nachricht 2) -->
				<sch:rule context="//tns:nachrichtenkopf">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002) then if (exists(tns:auswahl_absender/tns:absender.gericht)) then exists(../tns:fachdaten/tns:beschlussdaten/tns:vomGerichtAuszufuellen.modulT) else true() else true()" id="SCH-ZVSTR-0116">
						[SCH-ZVSTR-0116] Fachdaten: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul T das komplexe Fachdaten-Element 'vomGerichtAuszufuellen.modulT' unterhalb vom Elternelement 'beschlussdaten' vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul Q das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement '/beschlussdaten/anordnungNach850dZPO' vorhanden sein, wenn das Geschwister-Element 'anordnung.pfaendbarkeitBeiUnterhaltsanspruechen.850dZPO' mit dem Wert 'true' (fixed-Wert!) vorhanden ist! (nur Nachricht 2) -->
				<sch:rule context="//tns:nachrichtenkopf">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002) then if (exists(tns:auswahl_absender/tns:absender.gericht) and exists(../tns:fachdaten/tns:beschlussdaten/tns:anordnungNach850dZPO/tns:anordnung.pfaendbarkeitBeiUnterhaltsanspruechen.850dZPO)) then exists(../tns:fachdaten/tns:beschlussdaten/tns:anordnungNach850dZPO/tns:vomGerichtAuszufuellen) else true() else true()" id="SCH-ZVSTR-0117">[SCH-ZVSTR-0117] Fachdaten: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul Q das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement '/beschlussdaten/anordnungNach850dZPO' vorhanden sein, wenn das Geschwister-Element 'anordnung.pfaendbarkeitBeiUnterhaltsanspruechen.850dZPO' mit dem Wert 'true' vorhanden ist!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul R das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement '/beschlussdaten/anordnungNach850cAbsatz6ZPO' vorhanden sein, wenn das Geschwister-Element 'nichtBeruecksichtigungVonUnterhaltsberechtigten' mit dem Wert 'true' (fixed-Wert!) vorhanden ist! (nur Nachricht 2) -->
				<sch:rule context="//tns:nachrichtenkopf">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002) then if (exists(tns:auswahl_absender/tns:absender.gericht) and exists(../tns:fachdaten/tns:beschlussdaten/tns:anordnungNach850cAbsatz6ZPO/tns:nichtBeruecksichtigungVonUnterhaltsberechtigten)) then exists(../tns:fachdaten/tns:beschlussdaten/tns:anordnungNach850cAbsatz6ZPO/tns:vomGerichtAuszufuellen) else true() else true()" id="SCH-ZVSTR-0118">[SCH-ZVSTR-0118] Fachdaten: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul R das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement '/beschlussdaten/anordnungNach850cAbsatz6ZPO' vorhanden sein, wenn das Geschwister-Element 'nichtBeruecksichtigungVonUnterhaltsberechtigten' mit dem Wert 'true' vorhanden ist!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul S das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement '/beschlussdaten/anordnungNach850fAbsatz2ZPO' vorhanden sein, wenn das Geschwister-Element 'anordnungPfaendbarkeit.forderungAusUnerlaubterHandlung' mit dem Wert 'true' (fixed-Wert!) vorhanden ist! (nur Nachricht 2) -->
				<sch:rule context="//tns:nachrichtenkopf">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002) then if (exists(tns:auswahl_absender/tns:absender.gericht) and exists(../tns:fachdaten/tns:beschlussdaten/tns:anordnungNach850fAbsatz2ZPO/tns:anordnungPfaendbarkeit.forderungAusUnerlaubterHandlung)) then exists(../tns:fachdaten/tns:beschlussdaten/tns:anordnungNach850fAbsatz2ZPO/tns:vomGerichtAuszufuellen) else true() else true()" id="SCH-ZVSTR-0119">
						[SCH-ZVSTR-0119] Fachdaten: Ist das Element 'absender.gericht' im Nachrichtenkopf gewählt, so muss im Modul S das komplexe Fachdaten-Element 'vomGerichtAuszufuellen' unterhalb vom Elternelement '/beschlussdaten/anordnungNach850fAbsatz2ZPO' vorhanden sein, wenn das Geschwister-Element 'anordnungPfaendbarkeit.forderungAusUnerlaubterHandlung' mit dem Wert 'true' vorhanden ist!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Fachdaten: Im 'beschlussdaten'-Elternelement (Pflichtelement!) muss unterhalb des komplexen Elements 'forderung' mindestens eine Anteilsart vorliegen! (nur Nachricht 1) -->
				<sch:rule context="tns:nachricht.zvstr.durchsuchungsanordnung.2600001/tns:fachdaten">
					<sch:assert test="exists(tns:beschlussdaten/tns:forderung/child::element())" id="SCH-ZVSTR-0125">
						[SCH-ZVSTR-0125] Fachdaten: Ist das 'beschlussdaten'-Elternelement muss unterhalb des komplexen Elements 'forderung' mindestens eine Anteilsart vorliegen!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Fachdaten: Im 'beschlussdaten'-Elternelement (Pflichtelement!) muss unterhalb des komplexen Elternelements 'vomGerichtAuszufuellen' zum Element 'gruende' mindestens ein Grund angegeben werden! (nur Nachricht 1) -->
				<sch:rule context="tns:nachricht.zvstr.durchsuchungsanordnung.2600001/tns:fachdaten">
					<sch:assert test="exists(tns:beschlussdaten/tns:vomGerichtAuszufuellen/tns:gruende/child::element())" id="SCH-ZVSTR-0130">
						[SCH-ZVSTR-0130] Fachdaten: Im 'beschlussdaten'-Elternelement muss unterhalb des komplexen Elternelements 'vomGerichtAuszufuellen' zum Element 'gruende' mindestens ein Grund angegeben werden!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Kardinalitaet: Es muss mindestens eine der beiden Forderungsaufstellungen 'forderungsaufstellung.gewoehnlicheForderung' oder 'forderungsaufstellung.unterhaltsforderung' vorhanden sein! (nur Nachricht 3) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002/tns:fachdaten//tns:forderungsaufstellungen">
					<sch:assert test="exists(tns:forderungsaufstellung.gewoehnlicheForderung) or exists(tns:forderungsaufstellung.unterhaltsforderung)" id="SCH-ZVSTR-0136">
						[SCH-ZVSTR-0136] Fachdaten: Es muss mindestens eine der beiden Forderungsaufstellungen 'forderungsaufstellung.gewoehnlicheForderung' oder 'forderungsaufstellung.unterhaltsforderung' vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Wenn zu Zinsen das Element 'zinsendedatum' nicht vorhanden ist, so darf auch das dortige Element 'zinsbetrag.inEuro' nicht vorhanden sein! (nur Nachricht 2 und 3) -->
				<sch:rule context="//tns:fachdaten//element()[self::tns:zinsen|self::tns:zinsen.unterhaltsrueckstand]">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002 or ancestor::tns:nachricht.zvstr.vollstreckungsauftrag.2600003) then if (not(exists(tns:zinsangaben/tns:zinsendedatum))) then not(exists(tns:zinsbetrag.inEuro)) else true() else true()" id="SCH-ZVSTR-0140">
						[SCH-ZVSTR-0140] Fachdaten: Wenn zu Zinsen das Element 'zinsendedatum' nicht vorhanden ist, so darf auch das Element 'zinsbetrag.inEuro' nicht vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Wenn zu Zinsen das Element 'zinsendedatum' vorhanden ist, so muss auch das dortige Element 'zinsbetrag.inEuro'  vorhanden sein! (nur Nachricht 2 und 3) -->
				<sch:rule context="//tns:fachdaten//element()[self::tns:zinsen|self::tns:zinsen.unterhaltsrueckstand]">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002 or ancestor::tns:nachricht.zvstr.vollstreckungsauftrag.2600003) then if (exists(tns:zinsangaben/tns:zinsendedatum)) then exists(tns:zinsbetrag.inEuro) else true() else true()" id="SCH-ZVSTR-0141">
						[SCH-ZVSTR-0141] Fachdaten: Wenn zu Zinsen das Element 'zinsendedatum' vorhanden ist, so muss auch das Element 'zinsbetrag.inEuro' vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
				
			<sch:pattern>
				<!-- Kardinalitaet: Wenn zum 'Säumniszuschlag' das Element 'ende' vorhanden ist, so muss auch das dortige Geschwister-Element 'saeumniszuschlag.betrag' vorhanden sein! (nur Nachricht 2 und 3) -->
				<sch:rule context="//tns:fachdaten//element()[self::tns:saeumniszuschlag|self::tns:saeumniszuschlaege]">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002 or ancestor::tns:nachricht.zvstr.vollstreckungsauftrag.2600003) then if (exists(tns:ende)) then exists(tns:saeumniszuschlag.betrag) else true() else true()" id="SCH-ZVSTR-0145">
						[SCH-ZVSTR-0145] Fachdaten: Wenn zu einem Säumniszuschlag das Element 'ende' vorhanden ist, so muss auch das Element 'saeumniszuschlag.betrag' vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Kardinalitaet: Wenn zum 'Säumniszuschlag' das Element 'ende' nicht vorhanden ist, so darf auch das dortige Geschwister-Element 'saeumniszuschlag.betrag' nicht vorhanden sein! (nur Nachricht 2 und 3) -->
				<sch:rule context="//tns:fachdaten//element()[self::tns:saeumniszuschlag|self::tns:saeumniszuschlaege]">
					<sch:assert test="if (ancestor::tns:nachricht.zvstr.forderungspfaendung.2600002 or ancestor::tns:nachricht.zvstr.vollstreckungsauftrag.2600003) then if (not(exists(tns:ende))) then not(exists(tns:saeumniszuschlag.betrag)) else true() else true()" id="SCH-ZVSTR-0146">
						[SCH-ZVSTR-0146] Fachdaten: Wenn zu einem Säumniszuschlag das Element 'ende' nicht vorhanden ist, so darf auch das Element 'saeumniszuschlag.betrag' nicht vorhanden sein!
					</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<!-- Nachricht 1: Beschluss-Auswahl ist abhängig von Antrags-Auwahl -->
			<sch:pattern>
				<sch:rule context="tns:nachricht.zvstr.durchsuchungsanordnung.2600001/tns:fachdaten/tns:antragsdaten/tns:auswahl_erlassBeschluss.antragsBegruendung">
					<sch:assert test="if (exists(tns:antragsBegruendung.758aAbs.1ZPO)) then exists(//tns:beschlussdaten/tns:auswahl_beschluss/tns:durchsuchungsbeschluss) else true()" id="SCH-ZVSTR-0150">
						[SCH-ZVSTR-0150] Fachdaten: Ist das Element 'antragsBegruendung.758aAbs.1ZPO' befüllt, so darf im Beschlussteil nur das Element auswahl_beschluss/durchsuchungsbeschluss ausgewählt werden.
					</sch:assert>
				</sch:rule>
			</sch:pattern>
			<sch:pattern>
				<sch:rule context="tns:nachricht.zvstr.durchsuchungsanordnung.2600001/tns:fachdaten/tns:antragsdaten/tns:auswahl_erlassBeschluss.antragsBegruendung">
					<sch:assert test="if (exists(tns:antragsBegruendung.758aAbs.4ZPO)) then exists(//tns:beschlussdaten/tns:auswahl_beschluss/tns:beschluss.anordnungDerVollstreckungZurNachtzeitSonnUndFeiertage) else true()" id="SCH-ZVSTR-0151">
						[SCH-ZVSTR-0151] Fachdaten: Ist das Element 'antragsBegruendung.758aAbs.4ZPO' befüllt, so darf im Beschlussteil nur das Element auswahl_beschluss/beschluss.anordnungDerVollstreckungZurNachtzeitSonnUndFeiertage ausgewählt werden.
					</sch:assert>
				</sch:rule>
			</sch:pattern>
			<sch:pattern>
				<sch:rule context="tns:nachricht.zvstr.durchsuchungsanordnung.2600001/tns:fachdaten/tns:antragsdaten/tns:auswahl_erlassBeschluss.antragsBegruendung">
					<sch:assert test="if (exists(tns:antragsBegruendung.758aAbs.1UndAbs.4ZPO)) then exists(//tns:beschlussdaten/tns:auswahl_beschluss/tns:durchsuchungsbeschluss.beschlussAnordnungDerVollstreckungZurNachtzeitSonnUndFeiertage) else true()" id="SCH-ZVSTR-0152">
						[SCH-ZVSTR-0152] Fachdaten: Ist das Element 'antragsBegruendung.758aAbs.1UndAbs.4ZPO' befüllt, so darf im Beschlussteil nur das Element auswahl_beschluss/durchsuchungsbeschluss.beschlussAnordnungDerVollstreckungZurNachtzeitSonnUndFeiertage ausgewählt werden.
					</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<!-- Nachricht 2: Regeln für Zinsangaben -->
			<sch:pattern>
				
			</sch:pattern>

			<!-- /Individuelle Rules -->
	
		<!-- /ZVSTR - NACHRICHTEN ALLE -->
	
	<!-- /ZVSTR - FACHDATEN-GESCHAEFTSREGELN -->
	
	
	
	<!-- ZVSTR - CODELISTEN-GESCHAEFTSREGELN: -->	
			
			<!-- 'Code.GDS.Ereignis.Typ3' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '110|Antrag Durchsuchungsanordnung' (nur Nachricht 1) -->
				<sch:rule context="tns:nachricht.zvstr.durchsuchungsanordnung.2600001/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '110'" id="SCH-ZVSTR-0301">[SCH-ZVSTR-0301] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'110'!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '111|Antrag PfÜB gewöhnliche Forderungen', wenn das Element 'forderungsaufstellung.gewoehnlicheForderung' vorkommt - jedoch nicht das Element 'forderungsaufstellung.unterhaltsforderung' (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="if (exists(//tns:forderungsaufstellung.gewoehnlicheForderung) and not(exists(//tns:forderungsaufstellung.unterhaltsforderung))) then code = '111' else true()" id="SCH-ZVSTR-0305">[SCH-ZVSTR-0305] Codeliste: Wenn das Element 'forderungsaufstellung.gewoehnlicheForderung' vorkommt (jedoch nicht das Element 'forderungsaufstellung.unterhaltsforderung'), darf der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' nur den folgenden Wert haben: '111'!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '112|Antrag PfÜB Unterhaltsforderungen', wenn das Element 'forderungsaufstellung.unterhaltsforderung' vorkommt - jedoch nicht das Element 'forderungsaufstellung.gewoehnlicheForderung' vorkommt (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="if (exists(//tns:forderungsaufstellung.unterhaltsforderung) and not(exists(//tns:forderungsaufstellung.gewoehnlicheForderung))) then code = '112' else true()" id="SCH-ZVSTR-0306">[SCH-ZVSTR-0306] Codeliste: Wenn das Element 'forderungsaufstellung.unterhaltsforderung' vorkommt (jedoch nicht das Element 'forderungsaufstellung.gewoehnlicheForderung'), darf der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' nur den folgenden Wert haben: '112'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Werte '111|Antrag PfÜB gewöhnliche Forderungen' und/oder '112|Antrag PfÜB Unterhaltsforderungen', wenn beide PfUEB-Types zusammen vorkommen (oder fehlerhafter Weise, aber hier Schemtron-technisch zulässig, keiner von beiden PfUEB - Types vorkommt) (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = ('111', '112')" id="SCH-ZVSTR-0307">[SCH-ZVSTR-0307] Codeliste: Wenn die Elemente 'forderungsaufstellung.gewoehnlicheForderung' und 'forderungsaufstellung.unterhaltsforderung' zusammen vorkommen, darf der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' nur die folgenden Werte haben: '111', '112'!</sch:assert>
				</sch:rule>
			</sch:pattern>
			 
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '113|Vollstreckungsauftrag' (nur Nachricht 3) -->
				<sch:rule context="tns:nachricht.zvstr.vollstreckungsauftrag.2600003/tns:nachrichtenkopf/tns:ereignis">
					<sch:assert test="code = '113'" id="SCH-ZVSTR-0310">[SCH-ZVSTR-0310] Codeliste: Der Codelistenschlüssel der Typ3-Codeliste 'GDS.Ereignis' zum Nachrichtenkopf-Element 'ereignis' darf nur folgenden Wert haben:'113'!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<!-- 'Code.ZVSTR.Anlage' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Ereignis'; nur Schlüssel|Wert '110|Antrag Durchsuchungsanordnung' (nur Nachricht 1) -->
				<sch:rule context="tns:nachricht.zvstr.durchsuchungsanordnung.2600001">
					<sch:assert test="count(//tns:sendungsdaten.weitereAnlagen/tns:artDerAnlage[code = '006']) &lt; 2 and count(//tns:sendungsdaten.weitereAnlagen/tns:artDerAnlage[code = '014']) &lt; 2 and count(//tns:sendungsdaten.weitereAnlagen/tns:artDerAnlage[code = '023']) &lt; 2 and count(//tns:sendungsdaten.weitereAnlagen/tns:artDerAnlage[code = '025']) &lt; 2" id="SCH-ZVSTR-0315">[SCH-ZVSTR-0315] Codelisten: Beim Codelisten-Element 'artDerAnlage' unterhalb des jeweiligen Fachdaten-Elternelements 'sendungsdaten.weitereAnlagen' darf es zu den Codelisten-Einträgen '006', '014', '023' und '025' jeweils nur ein Vorkommen geben!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<!-- 'Code.GDS.Familienstand' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Familienstand' beim Auswahl-Element 'familienstand'; nur Schlüssel '001', '003', '007' oder '009' erlaubt (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002//tns:auswahl_familienstand/tns:familienstand">
					<sch:assert test="if (exists(.)) then code = ('001', '003', '007', '009') else true()" id="SCH-ZVSTR-0320">[SCH-ZVSTR-0320] Codelisten: Ist im Modul O zum Element 'auswahl_familienstand' das Auswahl-Element 'familienstand' vorhanden, so dürfen nur die Codelisten-Einträge '001', '003', '007' oder '009' vorhanden sein!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
			<!-- 'Code.GDS.Intervall' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Intervall' beim Auswahl-Element 'zahlungszeitraum'; nur Schlüssel '003', '004' oder '005' erlaubt (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002//tns:ii.renten/tns:auswahl_zahlungszeitraum/tns:zahlungszeitraum">
					<sch:assert test="if (exists(.)) then code = ('003', '004', '005') else true()" id="SCH-ZVSTR-0325">[SCH-ZVSTR-0325] Codelisten: In der Forderungsaufstellung 'Gewöhnliche Forderung' im Bereich 'Renten' sind bei einem vorhandenen Auswahl-Element 'zahlungszeitraum' nur die Codelisten-Einträge '003', '004' oder '005' zulässig!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<!-- 'Code.GDS.Intervall' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Intervall' beim Element 'zahlungsintervall'; nur Schlüssel '003', '004' oder '005' erlaubt (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002//tns:ii.renten/tns:zahlungsintervall">
					<sch:assert test="if (exists(.)) then code = ('003', '004', '005') else true()" id="SCH-ZVSTR-0330">[SCH-ZVSTR-0330] Codelisten: In der Forderungsaufstellung 'Gewöhnliche Forderung' im Bereich 'Renten' sind beim Element 'zahlungsintervall' nur die Codelisten-Einträge '003', '004' oder '005' zulässig!</sch:assert>
				</sch:rule>
			</sch:pattern>
			
			<!-- 'Code.GDS.Intervall' -->
			<sch:pattern>
				<!-- Eingeschraenkte Werteliste zur Codeliste 'GDS.Intervall' beim Element 'zahlungsintervall'; nur Schlüssel '003', '004' oder '005' erlaubt (nur Nachricht 2) -->
				<sch:rule context="tns:nachricht.zvstr.forderungspfaendung.2600002//tns:iv.statischeUnterhaltsrente/tns:zahlungsintervall">
					<sch:assert test="if (exists(.)) then code = ('003', '004', '005') else true()" id="SCH-ZVSTR-0335">[SCH-ZVSTR-0335] Codelisten: In der Forderungsaufstellung 'Unterhaltsforderung' im Bereich 'Statische Unterhaltsrente' sind beim Element 'zahlungsintervall' nur die Codelisten-Einträge '003', '004' oder '005' zulässig!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
	<!-- /ZVSTR - CODELISTEN-GESCHAEFTSREGELN -->
		
</sch:schema>