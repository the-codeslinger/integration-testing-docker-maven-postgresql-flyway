CREATE SEQUENCE public.hibernate_sequence
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1;

CREATE TABLE headphone_entity (
	id int8 NOT NULL,
	model varchar(255) NULL,
	CONSTRAINT headphone_entity_pkey PRIMARY KEY (id)
);