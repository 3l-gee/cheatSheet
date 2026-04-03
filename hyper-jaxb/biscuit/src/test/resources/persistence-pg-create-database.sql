-- PostgreSQL
-- Create the HYPERJAXB database.

BEGIN;
CREATE DATABASE biscuit OWNER postgres ENCODING 'UTF8';
COMMIT;

SELECT datname, datdba, encoding as enc, datcollate, datctype, dattablespace as dts
  FROM pg_database
  WHERE datistemplate = false;
