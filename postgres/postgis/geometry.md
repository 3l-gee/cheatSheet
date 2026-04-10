# PostGIS - geometry

## Validity

Validity is a multifaceted concept involving syntax, topology, dimensional constraints, and internal structure. In PostGIS, a geometry may be syntactically valid (correct WKT/WKB format) while still being topologically invalid according to the OGC Simple Features Specification (SFS).

The Open Geospatial Consortium (OGC) defines the rules determining whether a geometry is valid. A geometry is considered OGC-valid when all its elements respect the topological and structural constraints of its type, including:

* dimensionality
* boundaries
* intersections
* relationships between interior, boundary, and exterior
* arrangement

PostGIS has a built-in function that verifies features against the Open Geospatial Consortium (OGC) Simple Features Specification.
```SQL
SELECT ST_IsValid(geom);
SELECT ST_IsValidReason(geom);
SELECT ST_MakeValid(geom);
```

## Simple geometry

### Point 
A Point is a 0-dimensional geometry that represents a single location in coordinate space.

```SQL
POINT (1 2)
POINT Z (1 2 3)
POINT M (1 2 3)
POINT ZM (1 2 3 4)
```

### LineString 
A LineString is a 1-dimensional line formed by a contiguous sequence of line segments.

```SQL
LINESTRING (1 2, 3 4, 5 6)                 -- simple
LINESTRING (1 2, 3 4, 5 6, 1 2)            -- simple, closed
LINESTRING (0 0, 4 4, 4 0, 0 4)            -- complex
LINESTRING (0 0, 4 4, 4 0, 0 4, 0 0)       -- complex, closed
LINESTRING Z (0 0 0, 3 3 3, 4 4 4)
LINESTRING ZM (0 0 0 0, 3 3 3 3, 4 4 4 4)  

-- OGC Conforme
LINESTRING EMPTY

-- not OGC Conforme
LINESTRING (1 1)
LINESTRING (1 1, 1 1)
```

### LinearRing
A LinearRing is a LineString which is both closed and simple. The first and last points must be equal, and the line must not self-intersect.

```SQL
 LINEARRING (0 0, 4 0, 4 4, 0 4, 0 0)  -- must be simple and closed

-- OGC Conforme
LINEARRING EMPTY
```

### Polygon 
A Polygon is a 2-dimensional planar region, delimited by an exterior boundary (the shell) and zero or more interior boundaries (holes). Each boundary is a LinearRing.

```SQL
POLYGON ((0 0, 4 0, 4 4, 0 4, 0 0))  -- no hole
POLYGON (
  (0 0, 10 0, 10 10, 0 10, 0 0),     -- hole
  (2 2, 4 2, 4 4, 2 4, 2 2)
)
POLYGON Z ((0 0 0, 4 0 0, 4 4 0, 0 4 0, 0 0 0))
POLYGON ZM ((0 0 0 1, 4 0 0 2, 4 4 0 3, 0 4 0 4, 0 0 0 1))
```

## Multi geometry

### MultiPoint

### MultiLineString

### MultiPolygon

### GeometryCollection

## Curves geometry

### CircularString

### CompoundCurve

### CurvePolygon

### MultiCurve

### MultiSurface




