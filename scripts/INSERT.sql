DELETE FROM man_pat;
DELETE FROM averia;
DELETE FROM aeronave;
DELETE FROM maniobra;
DELETE FROM patrulla;
DELETE FROM hangar;
DELETE FROM modelo;
DELETE FROM piloto;

INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (1, 'Bruno Cruz', '11223344A', 'M', 25);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (2, 'Cristian Castillo', '55667788B', 'M', 44);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (3, 'Roy Garcia', '99009900C', 'M', 31);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (4, 'Daniel Molina', '77338844D', 'M', 22);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (5, 'Enrique Arlucea', '22992288A', 'M', 29);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (6, 'Juan Antonio Infante', '11002266B', 'M', 25);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (7, 'Marco Palmero', '77559911C', 'M', 37);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (8, 'Javier Campos', '55336688D', 'M', 32);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (9, 'Maria Espinar', '00883333E', 'F', 19);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (10, 'Estrella Rodriguez', '44444444F', 'F', 26);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (11, 'Alicia Fernandez', '44772233G', 'F', 33);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (12, 'Isabel Cordero', '00669966H', 'F', 40);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (13, 'Carmen Duque', '88449900E', 'F', 28);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (14, 'Ana Vela', '11551111F', 'F', 22);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (15, 'Raquel Peña', '33440099G', 'F', 36);
INSERT INTO piloto (id, nombre, dni, sexo, edad) VALUES (16, 'Lucía Malet', '22443377H', 'F', 21);

INSERT INTO modelo (id, nombre) VALUES (1, 'F-35 Lightning II');
INSERT INTO modelo (id, nombre) VALUES (2, 'F-22 Raptor');
INSERT INTO modelo (id, nombre) VALUES (3, 'Eurofighter Typhoon');
INSERT INTO modelo (id, nombre) VALUES (4, 'Sukhoi Su-35');
INSERT INTO modelo (id, nombre) VALUES (5, 'Dassault Rafale');
INSERT INTO modelo (id, nombre) VALUES (6, 'Flanker-H');

INSERT INTO hangar (id, nombre, capacidad) VALUES (1, 'Hangar 1', 5);
INSERT INTO hangar (id, nombre, capacidad) VALUES (2, 'Hangar 2', 5);
INSERT INTO hangar (id, nombre, capacidad) VALUES (3, 'Hangar 3', 5);
INSERT INTO hangar (id, nombre, capacidad) VALUES (4, 'Hangar 4', 4);
INSERT INTO hangar (id, nombre, capacidad) VALUES (5, 'Hangar 5', 4);
INSERT INTO hangar (id, nombre, capacidad) VALUES (6, 'Hangar 6', 4);

INSERT INTO patrulla (id, nombre) VALUES (1, 'Alfa');
INSERT INTO patrulla (id, nombre) VALUES (2, 'Bravo');
INSERT INTO patrulla (id, nombre) VALUES (3, 'Charlie');
INSERT INTO patrulla (id, nombre) VALUES (4, 'Delta');
INSERT INTO patrulla (id, nombre) VALUES (5, 'Echo');

INSERT INTO maniobra (id, descripcion, fecha) VALUES (1, 'Entrenamiento conjunto de vuelo bajo', to_date('2021/08/16','yyyy/mm/dd'));
INSERT INTO maniobra (id, descripcion, fecha) VALUES (2, 'Tácticas de movimiento rápido', to_date('2022/03/03','yyyy/mm/dd'));
INSERT INTO maniobra (id, descripcion, fecha) VALUES (3, 'Entrenamiento de escolta', to_date('2022/12/23','yyyy/mm/dd'));
INSERT INTO maniobra (id, descripcion, fecha) VALUES (4, 'Maniobras avanzadas', to_date('2023/01/11','yyyy/mm/dd'));

INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (1, 'Falcon', 1, null, 4, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (2, 'Owl', 5, null, 6, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (3, 'Robin', 2, 6, 1, 1);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (4, 'Pigeon', 6, 10, 2, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (5, 'Woodpecker', 3, 2, 4, 3);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (6, 'Eagle', 1, null, 3, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (7, 'Sparrow', 1, null, 5, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (8, 'Albatross', 4, 7, 2, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (9, 'Crow', 6, null, 2, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (10, 'Vulture', 2, null, 3, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (11, 'Swan', 6, 1, 6, 3);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (12, 'Petrel', 6, null, 4, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (13, 'Gull', 3, 8, 1, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (14, 'Parrot', 2, 4, 2, 2);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (15, 'Stork', 4, null, 1, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (16, 'Starling', 5, 5, 4, 1);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (17, 'Crane', 4, null, 2, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (18, 'Pelican', 2, 9, 6, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (19, 'Goose', 5, null, 1, null);
INSERT INTO aeronave (id, nombre, id_modelo, id_piloto, id_hangar, id_patrulla) VALUES (20, 'Cuckoo', 4, 3, 5, 2);

INSERT INTO averia (id, id_aeronave, descripcion, fecha) VALUES (1, 5, 'Fallo en el motor', to_date('2021/04/14','yyyy/mm/dd'));

INSERT INTO man_pat (id_maniobra, id_patrulla) VALUES (1, 1);
INSERT INTO man_pat (id_maniobra, id_patrulla) VALUES (1, 4);
INSERT INTO man_pat (id_maniobra, id_patrulla) VALUES (2, 3);
INSERT INTO man_pat (id_maniobra, id_patrulla) VALUES (3, 2);
INSERT INTO man_pat (id_maniobra, id_patrulla) VALUES (3, 3);
INSERT INTO man_pat (id_maniobra, id_patrulla) VALUES (4, 1);
INSERT INTO man_pat (id_maniobra, id_patrulla) VALUES (4, 2);