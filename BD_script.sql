CREATE TABLE parquenatural
(
  codpn INT(8) NOT NULL AUTO_INCREMENT
, nombre VARCHAR(100) NOT NULL
, fechaDeclaracion DATE
, PRIMARY KEY (codpn)
);


CREATE TABLE area 
(
  coda INT(8) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(20) NOT NULL 
, extension FLOAT(5) NOT NULL 
, codpn INT(8) NOT NULL
, PRIMARY KEY(coda) 
);

ALTER TABLE area ADD FOREIGN KEY(codpn) REFERENCES parquenatural(codpn) ; 


CREATE TABLE especie 
(
  codespecie INT(8) NOT NULL AUTO_INCREMENT
, nombreCientifico VARCHAR(100) NOT NULL 
, nombreVulgar VARCHAR(100) NOT NULL
, PRIMARY KEY (codespecie) 
);


CREATE TABLE animal
(
  alimentacion VARCHAR(100) NOT NULL
, periodocelo VARCHAR(100) NOT NULL
, codespecie INT(8) NOT NULL
, PRIMARY KEY (codespecie)
);

ALTER TABLE animal ADD FOREIGN KEY(codespecie) REFERENCES especie(codespecie) ; 


CREATE TABLE vegetal
(
  floracion BOOLEAN NOT NULL
, periodoFloracion VARCHAR(100) NOT NULL
, codespecie INT(8) NOT NULL
, PRIMARY KEY (codespecie)
);

ALTER TABLE vegetal ADD FOREIGN KEY(codespecie) REFERENCES especie(codespecie) ; 


CREATE TABLE mineral
(
  tipo VARCHAR(100) NOT NULL
, codespecie INT(8) NOT NULL
, PRIMARY KEY(codespecie)
);

ALTER TABLE mineral ADD FOREIGN KEY(codespecie) REFERENCES especie(codespecie) ; 


CREATE TABLE e_a
(
  cantindividuos INT(4) NOT NULL
, codespecie INT(8) NOT NULL
, coda INT(8) NOT NULL
, PRIMARY KEY(codespecie, coda)
);

ALTER TABLE e_a ADD FOREIGN KEY(codespecie) REFERENCES especie(codespecie) ; 
ALTER TABLE e_a ADD FOREIGN KEY(coda) REFERENCES area(coda); 


CREATE TABLE personal 
(
  codpersonal INT(8) NOT NULL AUTO_INCREMENT
, nombre VARCHAR(100) NOT NULL 
, direccion VARCHAR(100) NOT NULL 
, tfnoDomicilio INT(7) 
, tfnMovil INT(9) 
, sueldo FLOAT(5) NOT NULL 
, codpn INT(8) NOT NULL 
, PRIMARY KEY(codpersonal)
);

ALTER TABLE personal ADD FOREIGN KEY(codpn) REFERENCES parquenatural(codpn);



CREATE TABLE visitante
(
  dni INT(8) NOT NULL
, nombre VARCHAR(100) NOT NULL
, domicilio VARCHAR(100)
, profesion VARCHAR(100)
, PRIMARY KEY(dni)
);


CREATE TABLE excursion 
(
  codexcursion INT(8) NOT NULL AUTO_INCREMENT
, fecha DATE NOT NULL
, hora DATE NOT NULL
, codpn INT(8) NOT NULL
, PRIMARY KEY (codexcursion) 
);

ALTER TABLE excursion ADD FOREIGN KEY(codpn) REFERENCES parquenatural(codpn) ; 


CREATE TABLE e_v
(
  codexcursion INT(8) NOT NULL
, dni INT(8) NOT NULL
, PRIMARY KEY(codexcursion, dni)
);

ALTER TABLE e_v ADD FOREIGN KEY(codexcursion) REFERENCES excursion(codexcursion);
ALTER TABLE e_v ADD FOREIGN KEY(dni) REFERENCES visitante(dni);
/*
/*CONSULTAS
Mostrar los nombres de los parques naturales que posean areas menores a 900ha.*/

/*
SELECT nombre FROM parquenatural WHERE codpn in (SELECT codpn FROM area WHERE extension < 600);*/

/*Mostrar la fecha de la excursion a la que estan inscritos los visitantes que tienen la profesion de contadores o medicos.*/

SELECT fecha FROM excursion WHERE codexcursion in (SELECT codexcursion FROM e_v WHERE dni in (SELECT dni FROM visitante WHERE profesion = 'contador' || profesion = 'medico'));

/*VISTA DE VISITANTE (NOMBRE Y PROFESION)*/

CREATE OR REPLACE VIEW VISITAS AS 
SELECT visitante.nombre,profesion FROM VISITANTE;

SELECT * FROM visitas;

/*VISTA DEL PERSONAL (DNI,NOMBRE,CODPN,NOMBRE DEL PARQUE NATURAL)*/

CREATE OR REPLACE VIEW info_basica_personal AS
SELECT personal.dni AS DNI ,personal.nombre AS Nombre_del_Personal ,personal.codpn AS Codigo_del_Parque_Natural ,parquenatural.nombre AS Nombre_del_Parque_Natural FROM personal,parquenatural WHERE personal.codpn = parquenatural.codpn ORDER BY personal.codpn;

SELECT * FROM info_basica_personal;*/
