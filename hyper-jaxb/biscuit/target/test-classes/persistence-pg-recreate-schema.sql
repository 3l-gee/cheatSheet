-- HyperJAXB test schema: biscuit
BEGIN;
DROP SCHEMA IF EXISTS biscuit CASCADE;
CREATE SCHEMA biscuit;
GRANT ALL ON SCHEMA biscuit TO postgres
COMMENT ON SCHEMA biscuit IS 'HyperJAXB test schema';
COMMIT;
