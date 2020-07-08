create database passageiro;

create table passageiro (
	id BIGINT NOT NULL,
	nome VARCHAR(255) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	rg VARCHAR(15) NOT NULL,
	sexo VARCHAR(5) NOT NULL,
	data_nascimento DATE NOT NULL,
	endereco VARCHAR(255) NOT NULL,
	numero INTEGER NOT NULL,
	bairro VARCHAR(50) NOT NULL,
	cidade VARCHAR(100) NOT NULL,
	estado VARCHAR(2) NOT NULL,
	cep VARCHAR(8) NOT NULL,
	email VARCHAR(255),
	CONSTRAINT passageiro_pk PRIMARY KEY (id)
);

create table reserva (
	id BIGINT NOT NULL,
	data_reserva DATE NOT NULL,
	hora_reserva BIGINT NOT NULL,
	passageiro_fk BIGINT NOT NULL,
	CONSTRAINT reserva_pk PRIMARY KEY (id)
);

ALTER TABLE reserva ADD CONSTRAINT passageiro_fk
FOREIGN KEY (passageiro_fk)
REFERENCES passageiro (id)
ON DELETE CASCADE ON UPDATE CASCADE;

CREATE SEQUENCE passageiro_id_seq START 1;

ALTER TABLE passageiro ALTER COLUMN id SET DEFAULT nextval('passageiro_id_seq');

CREATE SEQUENCE reserva_id_seq START 1;

ALTER TABLE reserva ALTER COLUMN id SET DEFAULT nextval('reserva_id_seq');




