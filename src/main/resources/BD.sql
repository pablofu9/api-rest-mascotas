DROP DATABASE IF EXISTS mascotas;
CREATE DATABASE mascotas;
Use mascotas;

CREATE TABLE perro(
                      id_perro int unsigned auto_increment primary key,
                      nombre_perro varchar(16) not null,
                      raza_perro varchar(30) not null,
                      peso INT not null,
                      color varchar(30) not null);

INSERT INTO perro(nombre_perro,raza_perro,peso,color) VALUES ('Gala','Pastor aleman',30,'Negro'),('Trufa','Perro de aguas',12,'Marron'),
                                                             ('Zeus','Doberman',32,'Negro'),('Luna','Cocker',8,'Marron');

