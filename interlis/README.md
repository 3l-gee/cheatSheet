# Interlis


## ili2pg use case

ili2pg is used to format, load, expoor and validate serialized versions of interlis. this implementation focuses on the postgresql version of ili2db.

´´´bash
java -jar "C:\Program Files\interlis\ili2pg\ili2pg-5.1.0\ili2pg-5.1.0.jar" ^ # ili2pg-***.jar path
  --schemaimport ^                           # Tells ili2pg to create the database schema based on the INTERLIS model
  --dbhost localhost ^                       # DB host
  --dbport 5432 ^                            # DB port
  --dbdatabase HBKDB ^                       # DB name
  --dbusr postgres ^                         # DB user
  --dbpwd postgres ^                         # DB password
  --models CadastreOfObstacleLimitationSurfaces_V2 ^  # INTERLIS model(s) used (must match the XTF)
  --dbschema public ^                        # Target database schema (use "public" or any custom name)
  --defaultSrsCode 2056 ^                    # Default spatial reference system (e.g., EPSG:2056 for CH)
  --createGeomIdx                            # Automatically create spatial indexes on geometry columns
´´´

´´´bash
java -jar "C:\Program Files\interlis\ili2pg\ili2pg-5.1.0\ili2pg-5.1.0.jar" ^ # ili2pg-***.jar path
  --import ^                                # Tells ili2pg to import data from XTF/ITF file
  --deleteData ^                            # Deletes existing data in tables before inserting new data
  --trace ^                                 # Enables detailed debug-level logging (helpful for troubleshooting)
  --dbhost localhost ^                      # DB host
  --dbport 5432 ^                           # DB port
  --dbdatabase HBKDB ^                      # DB name
  --dbusr postgres ^                        # DB user
  --dbpwd postgres ^                        # DB password
  --dbschema public ^                       # Schema name (must match schema used during schemaimport)
  --models CadastreOfObstacleLimitationSurfaces_V2 ^  # (Recommended) Ensures correct model is used during import
  --log log.txt ^                           # Writes output and error logs to specified log file
  LSZF.xtf                                  # The XTF file containing the data to import
´´´

