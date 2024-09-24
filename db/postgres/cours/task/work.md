### Work 1

postgresql intro

## Task 1

Step 1 create the datebase postgis_kurs_uster
```sql
CREATE DATABASE postgis_kurs_uster
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
```

Step 2 Create the extension postgis
```sql
CREATE EXTENSION IF NOT EXISTS  postgis
    SCHEMA public
    VERSION "3.1.1";
```

Step 3 Upload backup file
```bash
pg_restore --host "localhost" --port "5432" --username "postgres" --no-password --dbname "test" --verbose "C:\\Users\\gerth\\source\\repos\\3l-gee\\CHEATS~1\\db\\postgres\\cours\\taskData\\POSTGI~2.BAC"

pg_restore --host --port --username (--no-passoword) --dbname --verbose
```


Step 4 Create a new view 
```sql
CREATE VIEW TEST AS 
	SELECT * FROM public.fluesse ;
```

## Task 2

Step 1 : Version info
```sql
SELECT version();
SELECT postgis_full_version();
SELECT * FROM pg_extension
```

Step 2 : View analyse
- 

```sql
 SELECT bo.ogc_fid,
    bo._tid AS tid,
    198 AS gemeinde,
    bo.the_geom::geometry(Polygon,21781) AS the_geom,
    bo.geometrie_0 AS centx,
    bo.geometrie_1 AS centy,
    qu.qualitaet,
    ba.art_nr AS artnr,
    ba.nutzung,
    gebnr.gwr_egid,
    gebnr.nummer,
    gebnr.nutzungscode,
    nuco.nutzung AS nutzung_detailliert,
    bo.flaeche AS grundrissflaeche_gerundet
   FROM av.bodenbedeckung__boflaeche__areas bo
     LEFT JOIN av_helper.bb_art ba ON bo.art = ba.art_nr
     LEFT JOIN av.bodenbedeckung__gebaeudenummer gebnr ON bo._tid = gebnr.gebaeudenummer_von
     LEFT JOIN av_helper.qualitaetsstandard qu ON bo.qualitaet = qu.qualitaetscode
     LEFT JOIN av_helper.gvz_nutzungscodes nuco ON gebnr.nutzungscode = nuco.nutzungscode
  WHERE ba.art_nr >= 0 AND ba.art_nr <= 7
UNION
 SELECT bo.ogc_fid,
    bo._tid AS tid,
    194 AS gemeinde,
    bo.the_geom::geometry(Polygon,21781) AS the_geom,
    bo.geometrie_0 AS centx,
    bo.geometrie_1 AS centy,
    qu.qualitaet,
    ba.art_nr AS artnr,
    ba.nutzung,
    NULL::integer AS gwr_egid,
    gebnr.nummer,
    gebnr.nutzungscode,
    nuco.nutzung AS nutzung_detailliert,
    bo.flaeche AS grundrissflaeche_gerundet
   FROM av_greifensee.bodenbedeckung__boflaeche__areas bo
     LEFT JOIN av_helper.bb_art ba ON bo.art = ba.art_nr
     LEFT JOIN av_helper.gebaeudenummer_distinct gebnr ON bo._tid = gebnr.gebaeudenummer_von AND gebnr.gemeinde = 194
     LEFT JOIN av_helper.qualitaetsstandard qu ON bo.qualitaet = qu.qualitaetscode
     LEFT JOIN av_helper.gvz_nutzungscodes nuco ON gebnr.nutzungscode = nuco.nutzungscode
  WHERE ba.art_nr >= 0 AND ba.art_nr <= 7;
```


## Task 3 

```sql
SELECT * FROM raumplanung.nutzungszonen 
    WHERE bev_gesamt >50 
    AND bev_anteil_ch <75 
    AND bev_anteil_weiblich >55;
```

## Task 4 

Tip : type casting 
```sql
SELECT 13.99::int ;
-- => int           14 

SELECT '13.99'::numeric ;
-- => numeirc       13.99 

SELECT '13.99'::numeric::int::varchar ;
-- =>  varchar      "14"

SELECT '2024-10-10'::date + 10;
-- => date          "2024-10-20"
```

Tip : Concat 
```sql
SELECT 'Steve' || NULL;
-- =>               [null]

SELECT coalesce('Steve', Null);
-- =>               Steve
```

### Work 1