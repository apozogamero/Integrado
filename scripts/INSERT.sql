DELETE FROM aeronave;
DELETE FROM modelo;
DELETE FROM piloto;

INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (1, 'Paco Martinez', '26041986C', 'M', 25);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (2, 'Isidro Castillo', '19031812P', 'M', 44);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (3, 'Maria Gonzalez', '11072010E', 'F', 31);

INSERT INTO modelo (id, nombre) VALUES (1, 'F-16');
INSERT INTO modelo (id, nombre) VALUES (2, 'Z-7');

INSERT INTO aeronave (id, nombre, id_modelo, id_piloto) VALUES (1, 'Falcon', 2, 1);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto) VALUES (2, 'Eagle', 1, 2);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto) VALUES (3, 'Hawk', 1, 3);