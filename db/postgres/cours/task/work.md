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

### Work 2

# task 1

### Work 3

# task 1 

### Work 4

# task 1 

```sql
CREATE TABLE schweiz.viertausender_ch
(
    gid integer NOT NULL,
    name text,
    hoehe integer,
    xcoor integer,
    ycoor integer,
    rang integer,
    gebirge text,
    schartenhoehe integer,
    schartenname text,
    erstbesteigung date,
    erstbesteiger text,
    webpage text,
    geom geometry(POINT,21781),
    PRIMARY KEY (gid)
);
```
### Work 5

# Task 1 

```sql
SELECT * FROM public.gemeinden 
	WHERE ST_Touches(
		geom::geometry,
		(SELECT geom FROM public.seen WHERE name = 'Zürichsee')::geometry
		)
	ORDER BY name ASC;
```

# Task 2

```sql
CREATE INDEX index_kt ON public.gemeinden (kt);
SELECT * FROM public.staedte WHERE ST_Within(
	geom::geometry, 
	(
		SELECT ST_Union(geom::geometry)
		FROM public.gemeinden 
		WHERE kt = 2 
	)::geometry
);
```

# Task 3 

```sql
SELECT * FROM public.staedte 
	WHERE ST_Within(
		geom::geometry, 
		(SELECT ST_Buffer(geom::geometry, 10000) FROM public.fluesse WHERE name = 'Emme')::geometry
	);
```

# Task 4

```sql

```

# Task 6

```sql
CREATE TABLE public.landesgrenze AS 
	SELECT ST_ExteriorRing(ST_Union(geom))::geometry(LINESTRING,21781) 
	AS geom 
	FROM public.gemeinden;
```

# Task 7

```sql
SELECT public.gemeinden.name, ST_length(
	ST_Intersection(
		public.gemeinden.geom,
		public.landesgrenze.geom
	)
) as len FROM public.gemeinden, public.landesgrenze
WHERE public.gemeinden.kt = 1
	AND ST_length(
		ST_Intersection(
			public.gemeinden.geom,
			public.landesgrenze.geom
		)
	) > 5000
ORDER BY len DESC;
```

### Work 6

# Task 0

```sql
UPDATE public.viertausender_ch
SET geom = ST_SetSRID(ST_MakePoint(public.viertausender_ch.xcoor, public.viertausender_ch.ycoor), 21781);
```

# task 1

```sql
SELECT name, ST_Distance(
		public.viertausender_ch.geom, 
		(SELECT geom FROM public.landesgrenze)::geometry
	)
	FROM public.viertausender_ch
	WHERE erstbesteigung < '1865-01-01'::date 
	AND ST_Distance(
		public.viertausender_ch.geom, 
		(SELECT geom FROM public.landesgrenze)::geometry
	) < 1000
```

# Task 2

```sql
SELECT s.name, f.name, 'Einfluss' AS aus_einfluss
	FROM public.seen s, public.fluesse f
	WHERE s.name IN ('Lac de Neuchâtel','Murtensee / Lac de Morat','Bielersee / Lac de Bienne')
	AND ST_Touches(ST_EndPoint(f.geom), s.geom)
UNION
SELECT s.name, f.name, 'Ausfluss' AS aus_einfluss
	 FROM public.seen s, public.fluesse f
	 WHERE s.name IN ('Lac de Neuchâtel','Murtensee / Lac de Morat','Bielersee / Lac de Bienne')
	 AND ST_Touches(ST_StartPoint(f.geom), s.geom)
ORDER BY 1, 3, 2;
```

# Task 8

```sql

```