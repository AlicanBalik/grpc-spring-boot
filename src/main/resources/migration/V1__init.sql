CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE users
(
    id                 UUID               DEFAULT uuid_generate_v4() PRIMARY KEY,
    username           TEXT      NOT NULL,
    password           TEXT      NOT NULL,
    created_by         TEXT      NOT NULL,
    created_date       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    last_modified_by   TEXT      NOT NULL,
    last_modified_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    UNIQUE (username)
);