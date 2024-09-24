/*
==========
SQL Island
==========

Website: https://sql-island.informatik.uni-kl.de/

Antworten (Lösungen) zum Lernprogramm von Stefan Keller.

Das Schema mit den Daten sind in der Datei "sql_island_schema_daten.sql".

Hier nochmals die drei Tabellen (Tabellen- und Attributnamen klein-schreiben):
* dorf (dorfnr, name, haeuptling)
* bewohner (bewohnernr, name, dorfnr, geschlecht, beruf, gold, status)
* gegenstand (gegenstand, besitzer)

Die Lösungsantworten sind immer wie folgt strukturiert: zuerst die SQL-Abfrage, dann das Resultatset (mit Tabellenüberschriften), dann "Yeah!" als Abschluss. SQL-Wörter werden gross geschrieben; Funktionen und Tabellen- und Attributnamen klein. 

SELECT FROM WHERE ... bis GROUP BY und JOIN
INSERT, UPDATE, DELETE

LOS GEHT's!
*/ 


SELECT * FROM dorf

dorfnr	name	haeuptling
1	Affenstadt	1
2	Gurkendorf	6
3	Zwiebelhausen	13
Yeah!

SELECT * FROM bewohner

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
1	Paul Backmann	1	m	Baecker	850	friedlich
2	Ernst Peng	3	m	Waffenschmied	280	friedlich
3	Rita Ochse	1	w	Baecker	350	friedlich
4	Carl Ochse	1	m	Kaufmann	250	friedlich
5	Dirty Dieter	3	m	Schmied	650	boese
6	Gerd Schlachter	2	m	Metzger	4850	boese
7	Peter Schlachter	3	m	Metzger	3250	boese
8	Arthur Schneiderpaule	2	m	Pilot	490	gefangen
9	Tanja Trommler	1	w	Baecker	550	boese
10	Peter Trommler	1	m	Schmied	600	friedlich
11	Dirty Doerthe	3	w	Erntehelfer	10	boese
12	Otto Armleuchter	2	m	Haendler	680	friedlich
13	Fritz Dichter	3	m	Hoerbuchautor	420	friedlich
14	Enrico Zimmermann	3	m	Waffenschmied	510	boese
15	Helga Rasenkopf	2	w	Haendler	680	friedlich
16	Irene Hutmacher	1	w	Haendler	770	boese
17	Erich Rasenkopf	3	m	Metzger	990	friedlich
18	Rudolf Gaul	3	m	Hufschmied	390	friedlich
19	Anna Flysh	2	w	Metzger	2280	friedlich
Yeah!


SELECT * FROM bewohner WHERE beruf = 'Metzger'

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
6	Gerd Schlachter	2	m	Metzger	4850	boese
7	Peter Schlachter	3	m	Metzger	3250	boese
17	Erich Rasenkopf	3	m	Metzger	990	friedlich
19	Anna Flysh	2	w	Metzger	2280	friedlich
Yeah!


SELECT * FROM bewohner WHERE status = 'friedlich'

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
1	Paul Backmann	1	m	Baecker	850	friedlich
2	Ernst Peng	3	m	Waffenschmied	280	friedlich
3	Rita Ochse	1	w	Baecker	350	friedlich
4	Carl Ochse	1	m	Kaufmann	250	friedlich
10	Peter Trommler	1	m	Schmied	600	friedlich
12	Otto Armleuchter	2	m	Haendler	680	friedlich
13	Fritz Dichter	3	m	Hoerbuchautor	420	friedlich
15	Helga Rasenkopf	2	w	Haendler	680	friedlich
17	Erich Rasenkopf	3	m	Metzger	990	friedlich
18	Rudolf Gaul	3	m	Hufschmied	390	friedlich
19	Anna Flysh	2	w	Metzger	2280	friedlich
Yeah!


SELECT * FROM bewohner WHERE status = 'friedlich' AND beruf = 'Waffenschmied'

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
2	Ernst Peng	3	m	Waffenschmied	280	friedlich
Yeah!


SELECT * FROM bewohner WHERE status = 'friedlich' AND beruf LIKE '%schmied'

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
2	Ernst Peng	3	m	Waffenschmied	280	friedlich
10	Peter Trommler	1	m	Schmied	600	friedlich
18	Rudolf Gaul	3	m	Hufschmied	390	friedlich
Yeah!


INSERT INTO bewohner (name, dorfnr, geschlecht, beruf, gold, status) VALUES ('Fremder', 1, '?', '?', 0, '?')

Yeah!


SELECT bewohnernr FROM bewohner WHERE name = 'Fremder'

bewohnernr
20
Yeah!


SELECT gold FROM bewohner WHERE name = 'Fremder'

gold
0
Yeah!


SELECT * FROM gegenstand WHERE besitzer IS NULL

gegenstand	besitzer
Teekanne	NULL
Ring	NULL
Kaffeetasse	NULL
Eimer	NULL
Pappkarton	NULL
Gluehbirne	NULL
Yeah!


UPDATE gegenstand SET besitzer = 20 WHERE gegenstand = 'Kaffeetasse'

Yeah!


UPDATE gegenstand SET besitzer = 20 WHERE besitzer IS NULL

Yeah!


-- Diese Antwort war mühsam :-(
SELECT * FROM gegenstand WHERE besitzer = 20 ORDER BY gegenstand

gegenstand	besitzer
Eimer	20
Gluehbirne	20
Kaffeetasse	20
Pappkarton	20
Ring	20
Teekanne	20
Yeah!


SELECT * FROM bewohner WHERE (beruf = 'Haendler' OR beruf = 'Kaufmann') AND status = 'friedlich'

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
4	Carl Ochse	1	m	Kaufmann	250	friedlich
12	Otto Armleuchter	2	m	Haendler	680	friedlich
15	Helga Rasenkopf	2	w	Haendler	680	friedlich
Yeah!


UPDATE gegenstand SET besitzer = 15 WHERE gegenstand = 'Ring' OR gegenstand = 'Teekanne'

Yeah!


UPDATE bewohner SET gold = gold + 120 WHERE bewohnernr = 20

Yeah!


UPDATE bewohner SET name = 'Stefan' WHERE bewohnernr = 20

Yeah!


SELECT * FROM bewohner WHERE beruf = 'Bäcker' ORDER BY gold DESC

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
1	Paul Backmann	1	m	Baecker	850	friedlich
9	Tanja Trommler	1	w	Baecker	550	boese
3	Rita Ochse	1	w	Baecker	350	friedlich
Yeah!


UPDATE bewohner SET gold = gold + 100 - 150 WHERE bewohnernr = 20

Yeah!


INSERT INTO gegenstand (gegenstand, besitzer) VALUES ('Schwert', 20)

Yeah!


SELECT * FROM bewohner WHERE beruf = 'Pilot'

bewohnernr	name	dorfnr	geschlecht	beruf	gold	status
8	Arthur Schneiderpaule	2	m	Pilot	490	gefangen
Yeah!


SELECT dorf.name FROM dorf, bewohner WHERE dorf.dorfnr=bewohner.dorfnr AND bewohner.name = 'Dirty Dieter'
-- Besseres SQL: SELECT dorf.name FROM dorf JOIN bewohner USING(dorfnr) WHERE bewohner.name = 'Dirty Dieter'

name
Zwiebelhausen
Yeah!


SELECT bewohner.name FROM bewohner, dorf WHERE dorf.name = 'Zwiebelhausen' AND bewohner.bewohnernr = dorf.haeuptling
-- Besseres SQL: select bewohner.name from bewohner join dorf on haeuptling = bewohnernr where dorf.name = 'Zwiebelhausen'
              
name
Fritz Dichter
Yeah!


SELECT count(*) FROM bewohner, dorf WHERE dorf.dorfnr = bewohner.dorfnr AND dorf.name = 'Zwiebelhausen'
-- select count(*) from bewohner join dorf using (dorfnr) where dorf.name='Zwiebelhausen'

COUNT(*)
8
Yeah!


SELECT count(*) FROM bewohner, dorf WHERE dorf.dorfnr=bewohner.dorfnr AND dorf.name='Zwiebelhausen' AND bewohner.geschlecht='w'
-- Besseres SQL: select count(*) from bewohner join dorf using (dorfnr) where geschlecht='w' and dorf.name='Zwiebelhausen'

count(*)
1
Yeah!


SELECT DISTINCT bewohner.name FROM bewohner, dorf WHERE dorf.dorfnr=bewohner.dorfnr AND dorf.name='Zwiebelhausen' AND bewohner.geschlecht='w'
-- Besseres SQL: SELECT distinct b.name FROM bewohner b join dorf d using(dorfnr) WHERE d.name='Zwiebelhausen' AND b.geschlecht='w'

name
Dirty Doerthe
Yeah!


SELECT SUM(bewohner.gold) FROM bewohner, dorf WHERE dorf.dorfnr=bewohner.dorfnr AND dorf.name = 'Gurkendorf'

SUM(bewohner.gold)
8980
Yeah!


-- Das war schwierig!
SELECT sum(bewohner.gold) FROM bewohner, dorf WHERE dorf.dorfnr=bewohner.dorfnr AND (bewohner.beruf = 'Haendler' OR beruf = 'Kaufmann' OR beruf = 'Bäcker')
-- Besseres SQL: SELECT sum(b.gold) FROM bewohner b JOIN dorf d USING(dorfnr) WHERE b.beruf IN ('Haendler','Kaufmann','Bäcker')

sum(b.gold)
4130
Yeah!


SELECT beruf, sum(bewohner.gold), avg(bewohner.gold) FROM bewohner GROUP BY beruf ORDER BY avg(bewohner.gold)

beruf	SUM(bewohner.gold)	AVG(bewohner.gold)
Erntehelfer	10	10.0
?	70	70.0
Kaufmann	250	250.0
Hufschmied	390	390.0
Waffenschmied	790	395.0
Hoerbuchautor	420	420.0
Pilot	490	490.0
Baecker	1750	583.333333333333
Schmied	1250	625.0
Haendler	2130	710.0
Metzger	11370	2842.5
Yeah!


SELECT status, AVG(b.gold) FROM bewohner b GROUP BY status ORDER BY status 

status	AVG(b.gold)
?	70.0
boese	1512.85714285714
friedlich	706.363636363636
gefangen	490.0
Yeah!


DELETE FROM bewohner WHERE name = 'Dirty Dieter'

Yeah!


DELETE FROM bewohner WHERE name = 'Dirty Doerthe'

Yeah!


UPDATE bewohner SET status = 'friedlich' WHERE bewohnernr = 8

Yeah!


DELETE FROM bewohner WHERE bewohnernr = 20

Yeah!
