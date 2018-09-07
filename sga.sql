

CREATE TABLE `sga`.`persona` (
  `id_persona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  PRIMARY KEY (`id_persona`));


/*Sentencia INSERT*/
INSERT INTO persona values(null,'Juan','Perez');
INSERT INTO persona (nombre,apellido) values('Karla','Eseranza');
INSERT INTO persona (id_persona,nombre,apellido) values(null,'Eduardo','Alvarez');

/*Sentencia SELECT*/
SELECT * FROM persona;

/* Sentencia UPDATE*/
UPDATE persona SET nombre = 'Juanito' WHERE id_persona =1;

/*Sentencia DELETE*/
DELETE FROM persona WHERE id_persona=2;
