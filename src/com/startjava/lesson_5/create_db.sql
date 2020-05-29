CREATE DATABASE jaegerTest;

CREATE TABLE JaegerTest (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark TEXT,
	height INTEGER,
	weight INTEGER,
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKILL INTEGER
);