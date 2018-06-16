CREATE TABLE IF NOT EXISTS server (id INTEGER IDENTITY PRIMARY KEY, hostname VARCHAR(64), group VARCHAR(32), created DATETIME, inserted BIGINT);
CREATE TABLE IF NOT EXISTS action (id INTEGER IDENTITY PRIMARY KEY, name VARCHAR(64), created DATETIME, inserted BIGINT);
CREATE TABLE IF NOT EXISTS protocol (id INTEGER IDENTITY PRIMARY KEY, server_id INTEGER, action_id INTEGER, status INTEGER, error_text VARCHAR(3000), created DATETIME, inserted BIGINT);