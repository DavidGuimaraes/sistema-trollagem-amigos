
CREATE SEQUENCE contato_id_contato_seq;
CREATE SEQUENCE hibernate_sequence START 1;

CREATE TABLE contato (
                id_contato BIGINT NOT NULL DEFAULT nextval('contato_id_contato_seq'),
                primeiro_nome VARCHAR(20) NOT NULL,
                sobrenome VARCHAR(30) NOT NULL,
                cod_pais VARCHAR NOT NULL,
                ddd INTEGER NOT NULL,
                numero INTEGER NOT NULL,
                email VARCHAR(50) NOT NULL,
                CONSTRAINT contato_pk PRIMARY KEY (id_contato)
);


ALTER SEQUENCE contato_id_contato_seq OWNED BY contato.id_contato;