<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_3100_musterfeststellungsklagenregister_1_x.xsd
    Version 1.1
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="tns"/>
    
    <!-- ================================================= -->
    <!--  Fachdatensatz Musterfeststellungsklagenregister  -->
    <!-- ================================================= -->
    
    <!-- Regeln für den Nachrichtenkopf -->
    <sch:pattern>
        <sch:rule context="//tns:nachrichtenkopf">
            
            <!-- Diese Zusicherung gilt für alle Nachrichten -->
            <sch:assert test="count(tns:aktenzeichen.absender) = 1" id="SCH-MFKREG-0001">
                [SCH-MFKREG-0001] Es muss genau ein Aktenzeichen des Absenders (Element 'aktenzeichen.absender') im Nachrichtenkopf übermittelt werden.
            </sch:assert>

            <!-- Diese Zusicherung gilt für alle Nachrichten außer 3100001 und 3100005-->
            <sch:assert id="SCH-MFKREG-0002" test="if (local-name(..) != 'nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001' and 
                                                       local-name(..) != 'nachricht.mfkreg.revision.3100005' and count(tns:aktenzeichen.empfaenger) != 1) 
                                                   then false() else true()">
                [SCH-MFKREG-0002] Es muss genau ein Aktenzeichen des Empfängers (Element 'aktenzeichen.empfaenger') im Nachrichtenkopf übermittelt werden.
            </sch:assert>

            <!-- Diese Zusicherung gilt für alle Nachrichten -->
            <sch:assert test="count(tns:ereignis) = 1" id="SCH-MFKREG-0003">
                [SCH-MFKREG-0003] Es muss genau ein Ereignis (Element 'ereignis') im Nachrichtenkopf übermittelt werden.
            </sch:assert>
            
        </sch:rule>
    </sch:pattern>
    
    
    <!-- Abstrakte Regeln für die Grunddaten (betrifft die Nachrichten 3100001 und 3100005) -->
  
    <sch:pattern>
        
        <sch:rule abstract="true" id="test.verfahrensdaten">
            <sch:assert id="SCH-MFKREG-0004" test="if (ancestor::tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001) 
                                                     then if (//tns:nachrichtenkopf/tns:ereignis/code = '217')
                                                            then exists(tns:verfahrensdaten) else true()  
                                                     else exists(tns:verfahrensdaten)">
                [SCH-MFKREG-0004] Element 'verfahrensdaten' fehlt: Bei den Grunddaten müssen Verfahrensdaten angegeben werden, 
                da Kindelemente zwingend erwartet werden.
            </sch:assert>
        </sch:rule>
        
        <sch:rule abstract="true" id="test.instanzdaten">
            <sch:assert test="exists(tns:instanzdaten)" id="SCH-MFKREG-0005">
                [SCH-MFKREG-0005] Element 'instanzdaten' fehlt: Es müssen Instanzdaten angegeben werden.
            </sch:assert>
        </sch:rule>
        
        <sch:rule abstract="true" id="test.aktenzeichen">
            <sch:assert test="exists(tns:aktenzeichen)" id="SCH-MFKREG-0006">
                [SCH-MFKREG-0006] Element 'aktenzeichen' fehlt: Bei den Instanzdaten muss ein Aktenzeichen angegeben werden.
            </sch:assert>
        </sch:rule>
        
        <sch:rule abstract="true" id="test.beteiligung">
            <sch:assert id="SCH-MFKREG-0007" test="if (ancestor::tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001) 
                                                     then if (//tns:nachrichtenkopf/tns:ereignis/code = '217')
                                                            then exists(tns:beteiligung) else true()
                                                     else exists(tns:beteiligung)">
                [SCH-MFKREG-0007] Element 'beteiligung' fehlt: Es muss mindestens ein Beteiligter angegeben werden.
            </sch:assert>
        </sch:rule>
        
        
        <sch:rule abstract="true" id="test.rolle">
            <sch:assert id="SCH-MFKREG-0008" test="if (ancestor::tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001) 
                                                     then if (//tns:nachrichtenkopf/tns:ereignis/code = '217')
                                                            then exists(tns:rolle) else true()  
                                                     else exists(tns:rolle)">
                [SCH-MFKREG-0008] Element 'rolle' fehlt (hier Pflichtelement, da Kindelemente zwingend angegeben werden müssen).
            </sch:assert>
            
            <sch:assert id="SCH-MFKREG-0009" test="if (ancestor::tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001) 
                                                     then if (//tns:nachrichtenkopf/tns:ereignis/code = '217')
                                                            then exists(tns:rolle/tns:rollennummer) else true()  
                                                     else exists(tns:rolle/tns:rollennummer)">
                [SCH-MFKREG-0009] Element 'rolle/rollennummer' fehlt: Es muss eine Rollennummer angegeben werden.
            </sch:assert>
            
            <sch:assert id="SCH-MFKREG-0010" test="if (ancestor::tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001) 
                                                     then if (//tns:nachrichtenkopf/tns:ereignis/code = '217')
                                                            then exists(tns:rolle/tns:rollenbezeichnung) else true()  
                                                     else exists(tns:rolle/tns:rollenbezeichnung)">
                [SCH-MFKREG-0010] Element 'rolle/rollenbezeichnung' fehlt: Es muss eine Rollenbezeichnung angegeben werden.
            </sch:assert>
            
            <!-- Zusicherungen 0011 gilt nur für Nachricht 3100001 -->
            <sch:assert id="SCH-MFKREG-0011" test="if (ancestor::tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001 and 
                                                       //tns:nachrichtenkopf/tns:ereignis/code = '217' and not(exists(tns:rolle/tns:nr))) 
                                                     then false() else true()">
                [SCH-MFKREG-0011] Element 'rolle/nr' fehlt: Bei Formular 1 (Bekanntmachung einer MFK) muss eine fortlaufende Nummerierung angegeben werden.
            </sch:assert>
            
            <sch:assert id="SCH-MFKREG-0012" test="if ((ancestor::tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001 and //tns:nachrichtenkopf/tns:ereignis/code = '217')
                                                       or ancestor::tns:nachricht.mfkreg.registerauszug.3100007)
                                                       then count(tns:rolle/tns:referenz) &lt;= 1 else true()">
                [SCH-MFKREG-0012] Element 'rolle/referenz': Es darf nur eine Referenz angegeben werden.
            </sch:assert>
        </sch:rule>


        <sch:rule abstract="true" id="test.beteiligtennummer">
            <sch:assert id="SCH-MFKREG-0013" test="exists(tns:beteiligtennummer)">
                [SCH-MFKREG-0013] Element 'beteiligtennummer' fehlt: Es muss eine Beteiligtennummer angegeben werden.
            </sch:assert>
        </sch:rule>
 
        <sch:rule abstract="true" id="test.anschrift">
            <sch:assert test="count(tns:anschrift) = 1" id="SCH-MFKREG-0014">
                [SCH-MFKREG-0014] Element 'anschrift': Es muss genau eine Anschrift angegeben werden.
            </sch:assert>
            <sch:assert test="exists(tns:anschrift/tns:postleitzahl)" id="SCH-MFKREG-0015">
                [SCH-MFKREG-0015] Element 'anschrift/postleitzahl' fehlt: Bei der Anschrift muss die Postleitzahl angegeben werden.
            </sch:assert>
            <sch:assert test="exists(tns:anschrift/tns:ort)" id="SCH-MFKREG-0016">
                [SCH-MFKREG-0016] Element 'anschrift/ort' fehlt: Bei der Anschrift muss der Ort angegeben werden.
            </sch:assert>
        </sch:rule>
        
        <!-- Zusicherung 0017 gilt nur für Nachricht 3100.001, Kommunikationsszenario Terminbestimmung -->
        <sch:rule abstract="true" id="test.terminsID">
            <sch:assert id="SCH-MFKREG-0017" test="if (//tns:nachrichtenkopf/tns:ereignis/code != '217') then exists(tns:terminsID) else true()">
                [SCH-MFKREG-0017] Element 'terminsID' fehlt: Es muss eine ID für den Termin angegeben werden.
            </sch:assert>
        </sch:rule>
        
        <!-- Zusicherungen 0018 und 0019 werden derzeit nur für Nachricht 3100.007 verwendet -->
        <sch:rule abstract="true" id="test.staat">
            <sch:assert test="exists(tns:staat)" id="SCH-MFKREG-0018">
                [SCH-MFKREG-0018] Element 'staat' fehlt: Bei der Anschrift muss der Staat angegeben werden.
            </sch:assert>
        </sch:rule>
        
        <sch:rule abstract="true" id="test.vorname">
            <sch:assert test="exists(tns:vorname)" id="SCH-MFKREG-0019">
                [SCH-MFKREG-0019] Element 'vorname' fehlt: Der Vorname des Beteiligten muss angegeben werden.
            </sch:assert>
        </sch:rule>
        
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für die Grunddaten der Nachricht 3100001 -->
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten">
            <sch:extends rule="test.verfahrensdaten"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten/tns:verfahrensdaten">
            <sch:extends rule="test.beteiligung"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>    
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
            <sch:extends rule="test.rolle"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
            <sch:extends rule="test.beteiligtennummer"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei">
            <sch:extends rule="test.anschrift"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
            <sch:extends rule="test.anschrift"/>
        </sch:rule>
    </sch:pattern>
   
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten/tns:verfahrensdaten/tns:terminsdaten">
            <sch:extends rule="test.terminsID"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.mfkreg.klagebekanntmachung_terminbestimmung.3100001/tns:grunddaten/tns:verfahrensdaten/tns:terminsdaten/tns:auswahl_terminsort/tns:gerichtsort">
            <sch:extends rule="test.anschrift"/>
        </sch:rule>
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für die Grunddaten der Nachricht 3100005 -->
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.revision.3100005/tns:grunddaten">
            <sch:extends rule="test.verfahrensdaten"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.revision.3100005/tns:grunddaten/tns:verfahrensdaten">
            <sch:extends rule="test.instanzdaten"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.revision.3100005/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten">
            <sch:extends rule="test.aktenzeichen"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.revision.3100005/tns:grunddaten/tns:verfahrensdaten">
            <sch:extends rule="test.beteiligung"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>    
        <sch:rule context="tns:nachricht.mfkreg.revision.3100005/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
            <sch:extends rule="test.rolle"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.revision.3100005/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
            <sch:extends rule="test.beteiligtennummer"/>
        </sch:rule>
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für die Beteiligtendaten in den Fachdaten der Nachricht 3100007 -->
    
    <sch:pattern>    
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung">
            <sch:extends rule="test.rolle"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter">
            <sch:extends rule="test.beteiligtennummer"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei">
            <sch:extends rule="test.anschrift"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson">
            <sch:extends rule="test.anschrift"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation">
            <sch:extends rule="test.anschrift"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:ra.kanzlei/tns:anschrift">
            <sch:extends rule="test.staat"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
            <sch:extends rule="test.staat"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:anschrift">
            <sch:extends rule="test.staat"/>
        </sch:rule>
    </sch:pattern>
    
    <sch:pattern>
        <sch:rule context="tns:nachricht.mfkreg.registerauszug.3100007/tns:fachdaten/tns:registerAuszuege/tns:anmeldung.beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:vollerName">
            <sch:extends rule="test.vorname"/>
        </sch:rule>
    </sch:pattern>
    
</sch:schema>
