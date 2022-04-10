#!/bin/bash
set -e
psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" << EOSQL
    CREATE USER admin WITH ENCRYPTED PASSWORD 'bosta';
    CREATE USER dbuser WITH ENCRYPTED PASSWORD 'merda';
    CREATE DATABASE relacionamentos;
    GRANT CREATE, CONNECT ON DATABASE relacionamentos TO admin;
    GRANT CONNECT ON DATABASE relacionamentos TO dbuser;
EOSQL