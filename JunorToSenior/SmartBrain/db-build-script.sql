-- Database: smart-brain

-- DROP DATABASE "smart-brain";

CREATE DATABASE "smart-brain"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Polish_Poland.1250'
    LC_CTYPE = 'Polish_Poland.1250'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

COMMENT ON DATABASE "smart-brain"
    IS 'smart-brain-api database';
	
CREATE TABLE IF NOT EXISTS users (
	id serial PRIMARY KEY,
	name VARCHAR(100),
	email text UNIQUE NOT NULL,
	entiries BIGINT DEFAULT 0,
	joined TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS login (
	id serial PRIMARY KEY,
	hash varchar(100) NOT NULL,
	email text UNIQUE NOT NULL
);

	
	