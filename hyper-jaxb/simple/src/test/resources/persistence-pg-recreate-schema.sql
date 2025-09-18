-- HyperJAXB test schema: biscuit
BEGIN;
DROP SCHEMA IF EXISTS simple CASCADE;
CREATE SCHEMA simple;
GRANT ALL ON SCHEMA simple TO postgres
COMMENT ON SCHEMA simple IS 'HyperJAXB test schema';
COMMIT;
