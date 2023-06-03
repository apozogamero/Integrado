DROP TABLE AVERIA;
DROP TABLE AERONAVE;
DROP TABLE USUARIO;
DROP TABLE MANIOBRA;
DROP TABLE MODELO;
DROP TABLE PILOTO;
DROP TABLE HANGAR;
DROP TABLE PATRULLA;

CREATE TABLE piloto (
    id NUMBER,
    nombre VARCHAR(50),
    dni VARCHAR(9),
    sexo CHAR(1),
    edad NUMBER,
    CONSTRAINT piloto_pk PRIMARY KEY (id)
);

CREATE TABLE modelo (
    id NUMBER,
    nombre VARCHAR(50),
    CONSTRAINT modelo_pk PRIMARY KEY (id)
);

CREATE TABLE hangar (
    id NUMBER,
    nombre VARCHAR(50),
    capacidad NUMBER,
    CONSTRAINT hangar_pk PRIMARY KEY (id)
);

CREATE TABLE patrulla (
    id NUMBER,
    nombre VARCHAR(50),
    CONSTRAINT patrulla_pk PRIMARY KEY (id)
);

CREATE TABLE maniobra (
    id NUMBER,
    id_patrulla NUMBER,
    descripcion VARCHAR(200),
    fecha DATE,
    CONSTRAINT maniobra_pk PRIMARY KEY (id),
    CONSTRAINT maniobra_fk_idpatrulla FOREIGN KEY (id_patrulla) REFERENCES patrulla (id)
);

CREATE TABLE usuario (
    id NUMBER,
    nombre VARCHAR(50)
);

CREATE TABLE aeronave (
    id NUMBER,
    nombre VARCHAR(50),
    id_modelo NUMBER,
    id_piloto NUMBER,
    id_hangar NUMBER,
    id_patrulla NUMBER,
    CONSTRAINT aeronave_pk PRIMARY KEY (id),
    CONSTRAINT aeronave_fk_idmodelo FOREIGN KEY (id_modelo) REFERENCES modelo (id),
    CONSTRAINT aeronave_fk_idpiloto FOREIGN KEY (id_piloto) REFERENCES piloto (id),
    CONSTRAINT aeronave_fk_idhangar FOREIGN KEY (id_hangar) REFERENCES hangar (id),
    CONSTRAINT aeronave_fk_idpatrulla FOREIGN KEY (id_patrulla) REFERENCES patrulla (id)
);

CREATE TABLE averia (
    id NUMBER,
    id_aeronave NUMBER,
    descripcion VARCHAR(50),
    fecha DATE,
    CONSTRAINT averia_pk PRIMARY KEY (id),
    CONSTRAINT averia_fk_idaeronave FOREIGN KEY (id_aeronave) REFERENCES aeronave (id)
);