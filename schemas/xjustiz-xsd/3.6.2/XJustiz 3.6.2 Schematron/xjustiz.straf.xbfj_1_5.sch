<?xml version="1.0" encoding="UTF-8"?>
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron"
            xmlns:xs="http://www.w3.org/2001/XMLSchema"
            queryBinding="xslt2">
   <sch:ns prefix="din91379" uri="urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08"/>
   <sch:ns prefix="gml" uri="http://www.opengis.net/gml/3.2"/>
   <sch:ns prefix="tns" uri="http://www.xjustiz.de"/>
   <sch:ns prefix="xml" uri="http://www.w3.org/XML/1998/namespace"/>
   <sch:ns prefix="xoev-code" uri="http://xoev.de/schemata/code/1_0"/>
   <sch:ns prefix="xoev-lc" uri="http://xoev.de/latinchars/1_1/datatypes"/>
   
   <sch:pattern>
      
      <!--Abstrakte Regeln-->
      
      <!-- SCH.STRAF.BFJ.0500100 (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0008" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0008"
            test="(count(tns:nachname.vater) &lt;= 1) and (count(tns:vorname.vater) &lt;= 1) and (count(tns:nachname.mutter) &lt;= 1) and (count(tns:vorname.mutter) &lt;= 1)">[SCH-STRAF.BFJ-0008] Grunddaten: Zu viele Kindelemente: Vor- und Nachname von Vater und Mutter dürfen jeweils nur einmal angegeben werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0013" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0013" test="count(tns:ausweisdokument) &lt;= 1">[SCH-STRAF.BFJ-0013] Grunddaten: Das Element 'ausweisdokument' darf hier höchstens einmal übermittelt werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0014" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0014" test="count(tns:ausweisart)=1">[SCH-STRAF.BFJ-0014] Grunddaten: Das Kindelement 'ausweisart' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0015" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0015" test="count(tns:ausweis.ID)=1">[SCH-STRAF.BFJ-0015] Grunddaten: Das Kindelement 'ausweis.ID' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0016" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0016" test="count(tns:zusatzinformation)=1">[SCH-STRAF.BFJ-0016] Grunddaten: Das Kindelement  'zusatzinformation' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0100" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0100"
            test="if (exists(.)) then exists(//tns:nachrichtencode.nachricht_101) else true()">[SCH-STRAF.BFJ-0100] Fachdaten: Das Element 'grund.behoerdenfuehrungszeugnis' darf nur in einem BZR-Antrag-Behördenführungszeugnis übermittelt werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0101" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0101"
            test="if (exists(.)) then exists(//tns:grund.behoerdenfuehrungszeugnis) else true()">[SCH-STRAF.BFJ-0101] Fachdaten: In einem BZR-Antrag-Behördenführungszeugnis muss das Element 'grund.behoerdenfuehrungszeugnis' übermittelt werden.</sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.0500200 (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0200" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0200"
            test="if (tns:steuerungsdaten/tns:nachrichtencode/code = 'B' and not(exists(tns:entscheidungsdaten/tns:inhaltDerEntscheidung/tns:textkennzahl))) then false() else true()">[SCH-STRAF.BFJ-0200] Bei einer Berichtigungsmitteilung zu einer Entscheidung im BZR (Nachrichtencode = B) muss mindestens eine Textkennzahl angegeben werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0201" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0201"
            test="if (//tns:empfaenger.sonstige = 'A2000') then exists(tns:uebermittelndeStelle) else true()">[SCH-STRAF.BFJ-0201] Fachdaten: Das Element 'uebermittelndeStelle' muss bei diesem Kommunikationsszenario angegeben werden.
         </sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.0500400 (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0400" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0400" test="count(tns:ereignis) = 1">[SCH-STRAF.BFJ-0400] Nachrichtenkopf: Das Element 'ereignis' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.0500500 (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0500" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0500"
            test="if (tns:textkennzahl/not(code = ('9000','9001'))) then exists(//tns:statistik) else true()">[SCH-STRAF.BFJ-0500] Fachdaten: Das Element 'statistik' ist immer verpflichtend, es sei denn, aus der Codeliste GZR.Textkennzahl werden die Werte '9000' oder '9001' verwendet.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0502" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0502"
            test="if (//tns:ereignis/code = ('023', '070')) then code = 'Z' else true()">
            [SCH-STRAF.BFJ-0502] Bei Berichtigungs- und Löschmitteilungen mit dem Ereignis 070 = Berichtigung oder 023 = Löschung ist der Code 'Z' zu verwenden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0503" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0503"
            test="if (tns:steuerungsdaten/tns:nachrichtencode/code = 'Z' and not(exists(tns:entscheidungsdaten/tns:inhaltDerEntscheidung/tns:textkennzahl))) then false() else true()">[SCH-STRAF.BFJ-0503] Fachdaten: Bei einer Berichtigungsmitteilung zu einer Entscheidung im GZR (Nachrichtencode = Z) muss mindestens eine Textkennzahl angegeben werden.</sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.100_200_500.Grunddaten (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0009" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0009" test="not(tns:geschlecht/code = '4')">[SCH-STRAF.BFJ-0009] Grunddaten: Das Element 'geschlecht' in 'natuerlichePerson' darf nicht mit '4' (=sächlich) kodiert werden.</sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.200_400_500.Grunddaten (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0017" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0017"
            test="if (exists(tns:anschrift/tns:anschriftstyp)) then (tns:anschrift/tns:anschriftstyp/code = '011' or tns:anschrift/tns:anschriftstyp/code = '012') else true()">
            [SCH-STRAF.BFJ-0017] Grunddaten: Im Element 'anschriftstyp' in 'natuerlichePerson' sind nur die Werte 'ohne festen Wohnsitz' (Code=011) und 'unbekannter Aufenthalt' (Code=012) zulässig.
         </sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.200_500 (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-2501" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-2501" test="count(tns:geschlecht)=1">[SCH-STRAF.BFJ-2501] Grunddaten: Das Element 'geschlecht' in 'natuerlichePerson' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-2502" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-2502" test="count(tns:kennzeichnung) = 1">[SCH-STRAF.BFJ-2502] Das Element 'kennzeichnung' in den Ordnungsdaten muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.400_500.Grunddaten (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0018" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0018" test="count(tns:angabenZurRechtsform)=1">[SCH-STRAF.BFJ-0018] Grunddaten: Das Element 'angabenZurRechtsform' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0019" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0019"
            test="if (exists(//tns:inlaendischesRegistergericht)) then (count(//tns:registerart)=1) else true()">[SCH-STRAF.BFJ-0019] Grunddaten: Bei der 'auswahl_registerbehoerde/inlaendischesRegistergericht' muss das Element 'registerart' genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0020" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0020" test="count(tns:registernummer)=1">[SCH-STRAF.BFJ-0020] Grunddaten: Das Element 'registernummer' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0021" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0021" test="count(tns:anschrift)=1">[SCH-STRAF.BFJ-0021] Grunddaten: Das Element 'anschrift' in 'organisation' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0022" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0022"
            test="count(tns:anschrift/tns:anschriftenzusatz)&lt;=1">[SCH-STRAF.BFJ-0022] Grunddaten: Das Element 'anschriftenzusatz' in 'organisation' darf höchstens einmal übermittelt werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0023" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0023"
            test="if (exists(tns:anschrift)) then (count(tns:anschrift/tns:ort)=1) else true()">[SCH-STRAF.BFJ-0023] Grunddaten: Das Element 'ort' in 'organisation/anschrift' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0024" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0024"
            test="if (exists(tns:auswahl_beteiligter/tns:natuerlichePerson)) then (//tns:nachrichtenkopf/tns:ereignis/code = '230') else true()">[SCH-STRAF.BFJ-0024] Grunddaten: Das Element 'natuerlichePerson' darf nur angegeben werden, wenn im 'nachrichtenkopf/ereignis' der Eintrag 'GZR natürliche Person' (Code = 230) ausgewählt wurde.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0025" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0025"
            test="if (exists(tns:auswahl_beteiligter/tns:organisation)) then (//tns:nachrichtenkopf/tns:ereignis/code = '229') else true()">[SCH-STRAF.BFJ-0025] Grunddaten: Das Element 'organisation' darf nur angegeben werden, wenn im 'nachrichtenkopf/ereignis' der Eintrag 'GZR juristische Person' (Code = 229) ausgewählt wurde.</sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.Grunddaten.Global (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0003" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0003" test="count(tns:verfahrensdaten) = 1">[SCH-STRAF.BFJ-0003] Grunddaten: Das Element 'verfahrensdaten' muss genau einmal vorkommen, da Kindelemente erwartet werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0004" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0004" test="count(tns:beteiligung) = 1">[SCH-STRAF.BFJ-0004] Grunddaten: Das Kindelement 'beteiligung' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0005" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0005" test="count(tns:vollerName/tns:geburtsname)=1">[SCH-STRAF.BFJ-0005] Grunddaten: Das Element 'geburtsname' in 'natuerlichePerson' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0006" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0006" test="count(tns:geburt)=1">[SCH-STRAF.BFJ-0006] Grunddaten: Das Element 'geburt' in 'natuerlichePerson' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0007" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0007"
            test="if (exists(tns:geburt)) then (count(tns:geburt/tns:geburtsdatum)=1 or count(tns:geburt/tns:geburtsdatum.unbekannt)=1) else true()">[SCH-STRAF.BFJ-0007] Grunddaten: Es ist in 'natuerlichePerson' entweder das Element 'geburtsdatum' oder das Element 'geburtsdatum.unbekannt' anzugeben.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0010" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0010" test="count(tns:anschrift) &lt;= 1">[SCH-STRAF.BFJ-0010] Grunddaten: Das Element 'anschrift' in 'natuerlichePerson' darf höchstens einmal übermittelt werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0011" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0011"
            test="count(tns:anschrift/tns:anschriftenzusatz) &lt;= 1">[SCH-STRAF.BFJ-0011] Grunddaten: Das Element 'anschriftenzusatz' in 'natuerlichePerson' darf hier höchstens einmal übermittelt werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-STRAF.BFJ-0012" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0012" test="count(tns:staatsangehoerigkeit) &lt;= 4">[SCH-STRAF.BFJ-0012] Grunddaten: Das Element 'staatsangehoerigkeit' in 'natuerlichePerson' darf höchstens viermal übermittelt werden.</sch:assert>
      </sch:rule>
      
      <!-- SCH.STRAF.BFJ.Nachrichtenkopf.Global (schRuleSet) -->
      <sch:rule id="rule-SCH-STRAF.BFJ-0001" abstract="true">
         <sch:assert id="SCH-STRAF.BFJ-0001" test="count(tns:aktenzeichen.absender) = 1">[SCH-STRAF.BFJ-0001] Nachrichtenkopf: Das Element 'aktenzeichen.absender' muss genau einmal vorkommen.</sch:assert>
      </sch:rule>
      
      
      <!--Konkrete Regeln-->

      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:nachrichtenkopf">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0001"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.auskunftserteilung.anfrage.0500400//tns:nachrichtenkopf">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0001"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0400"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:grunddaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0003"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.auskunftserteilung.anfrage.0500400//tns:grunddaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0003"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.mitteilung.0500200//tns:grunddaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0003"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500//tns:grunddaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0003"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:verfahrensdaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0004"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.auskunftserteilung.anfrage.0500400//tns:verfahrensdaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0004"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.mitteilung.0500200//tns:verfahrensdaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0004"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500//tns:verfahrensdaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0004"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:natuerlichePerson">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0005"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0006"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0007"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0009"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0010"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0011"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0012"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0013"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0017"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.auskunftserteilung.anfrage.0500400//tns:natuerlichePerson">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0005"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0006"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0007"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0010"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0011"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0012"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0017"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.mitteilung.0500200//tns:natuerlichePerson">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0005"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0006"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0007"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0009"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0010"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0011"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0012"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0017"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-2501"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500//tns:natuerlichePerson">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0005"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0006"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0007"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0009"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0010"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0011"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0012"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0017"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-2501"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:name.eltern">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0008"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:ausweisdokument">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0014"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0015"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0016"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.auskunftserteilung.anfrage.0500400//tns:organisation">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0018"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0021"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0022"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0023"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500//tns:organisation">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0018"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0021"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0022"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0023"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.auskunftserteilung.anfrage.0500400/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:registereintragung">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0019"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0020"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:organisation/tns:registereintragung">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0019"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0020"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.auskunftserteilung.anfrage.0500400/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0024"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0025"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0024"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0025"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:grund.behoerdenfuehrungszeugnis">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0100"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.auskunftserteilung.anfrage.0500100//tns:nachrichtencode.nachricht_101">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0101"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.mitteilung.0500200//tns:fachdaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0200"/>
         <sch:extends rule="rule-SCH-STRAF.BFJ-0201"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500/tns:fachdaten/tns:entscheidungsdaten/tns:inhaltDerEntscheidung/tns:textkennzahl">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0500"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500//tns:nachrichtencode">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0502"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500//tns:fachdaten">
         <sch:extends rule="rule-SCH-STRAF.BFJ-0503"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.bzr.mitteilung.0500200//tns:behoerdeErkennend">
         <sch:extends rule="rule-SCH-STRAF.BFJ-2502"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.straf.bfj.gzr.mitteilung.0500500//tns:behoerdeErkennend">
         <sch:extends rule="rule-SCH-STRAF.BFJ-2502"/>
      </sch:rule>

   </sch:pattern>
</sch:schema>
