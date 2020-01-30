CREATE DATABASE PROYECTO;


CREATE TABLE PARQUENATURAL
(
  CODPN VARCHAR(4) NOT NULL
, NOMBRE VARCHAR(100) NOT NULL
, FECHADECLARACION DATE
, PRIMARY KEY (CODPN)
);

INSERT INTO parquenaturaL (codpn,nombre,fechadeclaracion) VALUE ('1111','Manu','1973-05-29');
INSERT INTO parquenaturaL (codpn,nombre,fechadeclaracion) VALUE ('1112','Huascaran','1975-07-01');
INSERT INTO parquenaturaL (codpn,nombre,fechadeclaracion) VALUE ('1113','AltoPurus','2004-11-20');

CREATE TABLE COMUNIDADAUTONOMA 
(
  CODCA VARCHAR(4) NOT NULL 
, NOMBRE VARCHAR(100) NOT NULL 
, ORGRESPONSABLE VARCHAR(100) NOT NULL
, PRIMARY KEY(CODCA) 
);

INSERT INTO comunidadautonoma (codca,nombre,orgresponsable) VALUE ('2221','ComunidadNacional','MinisterioDeAmbiente');

CREATE TABLE CA_PN
(
  CODCA VARCHAR(4) NOT NULL
, CODPN VARCHAR(4) NOT NULL
, SUPERFICIE FLOAT(7) NOT NULL
, PRIMARY KEY(CODCA,CODPN)
);
ALTER TABLE CA_PN ADD FOREIGN KEY(CODCA) REFERENCES COMUNIDADAUTONOMA(CODCA);
ALTER TABLE CA_PN ADD FOREIGN KEY(CODPN) REFERENCES PARQUENATURAL(CODPN);  

INSERT INTO ca_pn (codca,codpn,superficie) VALUE ('2221','1111','1909800');
INSERT INTO ca_pn (codca,codpn,superficie) VALUE ('2221','1112','340000');
INSERT INTO ca_pn (codca,codpn,superficie) VALUE ('2221','1113','2510694');

CREATE TABLE AREA 
(
  NOMBREA VARCHAR(20) NOT NULL 
, EXTENSION FLOAT(5) NOT NULL 
, CODPN VARCHAR(4) NOT NULL
, PRIMARY KEY(NOMBREA) 
);

ALTER TABLE AREA ADD FOREIGN KEY(CODPN) REFERENCES PARQUENATURAL(CODPN) ; 

INSERT INTO area (nombrea,extension,codpn) VALUE ('bosque1','800','1111');
INSERT INTO area (nombrea,extension,codpn) VALUE ('pampa1','500','1112');
INSERT INTO area (nombrea,extension,codpn) VALUE ('bosque2','1000','1113');

CREATE TABLE ESPECIE 
(
  CODESPECIE VARCHAR(4) NOT NULL 
, NOMBRECIENTIFICO VARCHAR(100) NOT NULL 
, NOMBREVULGAR VARCHAR(100) NOT NULL
, PRIMARY KEY (CODESPECIE) 
);

INSERT INTO especie (codespecie,nombrecientifico,nombrevulgar) VALUE ('3331','SapajusMacrocephalus','machinNegro');
INSERT INTO especie (codespecie,nombrecientifico,nombrevulgar) VALUE ('3332','ChorisiaSp.','lupuna');
INSERT INTO especie (codespecie,nombrecientifico,nombrevulgar) VALUE ('3333','HarpiaHarpyja','aguilaArpia');
INSERT INTO especie (codespecie,nombrecientifico,nombrevulgar) VALUE ('3334','SwieteniaMacrophylla','caoba');
INSERT INTO especie (codespecie,nombrecientifico,nombrevulgar) VALUE ('3335','PuyaRaimondii','puyaRaymondi');
INSERT INTO especie (codespecie,nombrecientifico,nombrevulgar) VALUE ('3336','Aurum','oro');

CREATE TABLE ANIMAL
(
  CODESPECIE VARCHAR(4) NOT NULL
, ALIMENTACION VARCHAR(100) NOT NULL
, PERIODOCELO VARCHAR(100) NOT NULL
, PRIMARY KEY (CODESPECIE)
);

ALTER TABLE ANIMAL ADD FOREIGN KEY(CODESPECIE) REFERENCES ESPECIE(CODESPECIE) ; 

INSERT INTO animal (codespecie,alimentacion,periodocelo) VALUE ('3331','frutas,insectos,flores','verano');
INSERT INTO animal (codespecie,alimentacion,periodocelo) VALUE ('3333','monos,perezosos,serpientes','primavera');

CREATE TABLE VEGETAL
(
  CODESPECIE VARCHAR(4) NOT NULL
, FLORACION BOOL NOT NULL
, PERIODOFLORACION VARCHAR(100) NOT NULL
, PRIMARY KEY (CODESPECIE)
);

ALTER TABLE VEGETAL ADD FOREIGN KEY(CODESPECIE) REFERENCES ESPECIE(CODESPECIE) ; 

INSERT INTO vegetal (codespecie,floracion,periodofloracion) VALUE ('3332',TRUE,'primavera');
INSERT INTO vegetal (codespecie,floracion,periodofloracion) VALUE ('3334',TRUE,'primavera');
INSERT INTO vegetal (codespecie,floracion,periodofloracion) VALUE ('3335',TRUE,'verano');

CREATE TABLE MINERAL
(
  CODESPECIE VARCHAR(4) NOT NULL
, TIPO VARCHAR(100) NOT NULL
, PRIMARY KEY(CODESPECIE)
);

ALTER TABLE MINERAL ADD FOREIGN KEY(CODESPECIE) REFERENCES ESPECIE(CODESPECIE) ; 

INSERT INTO mineral (codespecie,tipo) VALUE ('3336','metal');

CREATE TABLE E_A
(
  CODESPECIE VARCHAR(4) NOT NULL
, CODAREA VARCHAR(20) NOT NULL
, CANTINDIVIDUOS INTEGER(4) NOT NULL
, PRIMARY KEY(CODESPECIE,CODAREA)
);

ALTER TABLE E_A ADD FOREIGN KEY(CODESPECIE) REFERENCES ESPECIE(CODESPECIE) ; 
ALTER TABLE E_A ADD FOREIGN KEY(CODAREA) REFERENCES AREA(NOMBREA); 

INSERT INTO e_a (codespecie,codarea,cantindividuos) VALUE ('3331','bosque1','90');
INSERT INTO e_a (codespecie,codarea,cantindividuos) VALUE ('3332','bosque1','120');
INSERT INTO e_a (codespecie,codarea,cantindividuos) VALUE ('3333','bosque2','60');
INSERT INTO e_a (codespecie,codarea,cantindividuos) VALUE ('3334','bosque2','180');
INSERT INTO e_a (codespecie,codarea,cantindividuos) VALUE ('3335','pampa1','240');
INSERT INTO e_a (codespecie,codarea,cantindividuos) VALUE ('3336','pampa1','800');

CREATE TABLE PERSONAL 
(
  DNI VARCHAR(8) NOT NULL 
, NSS VARCHAR(11) NOT NULL
, NOMBRE VARCHAR(100) NOT NULL 
, DIRECCION VARCHAR(100) NOT NULL 
, TFNODOMICILIO INTEGER(7) 
, TFNOMOVIL INTEGER(9) 
, SUELDO FLOAT(5) NOT NULL 
, CODPN VARCHAR(4) NOT NULL 
, PRIMARY KEY(DNI)
);

ALTER TABLE PERSONAL ADD FOREIGN KEY(CODPN) REFERENCES PARQUENATURAL(CODPN); 
ALTER TABLE PERSONAL ADD UNIQUE(NSS);

INSERT INTO personal (dni,nss,nombre,direccion,tfnodomicilio,tfnomovil,sueldo,codpn) VALUE ('77556688','64821974613','jose','av.Este544','4953167','916482482','1500','1111');
INSERT INTO personal (dni,nss,nombre,direccion,tfnodomicilio,tfnomovil,sueldo,codpn) VALUE ('78146523','61846764312','maria','av.Norte649','3614124','994613584','1600','1112');
INSERT INTO personal (dni,nss,nombre,direccion,tfnodomicilio,tfnomovil,sueldo,codpn) VALUE ('10561314','84591354576','gilberto','av.Sur7244','5151566','91623054','1200','1113');

CREATE TABLE VISITANTE
(
  DNI VARCHAR(8) NOT NULL
, NOMBRE VARCHAR(100) NOT NULL
, DOMICILIO VARCHAR(100)
, PROFESION VARCHAR(100)
, PRIMARY KEY(DNI)
);

INSERT INTO visitante (dni,nombre,domicilio,profesion) VALUE ('59462819','ignacio','av.Oeste912','administrador');
INSERT INTO visitante (dni,nombre,domicilio,profesion) VALUE ('18654928','joel','av.Grande2612','contador');
INSERT INTO visitante (dni,nombre,domicilio,profesion) VALUE ('62185161','leslie','av.Principal712','abogada');
INSERT INTO visitante (dni,nombre,domicilio,profesion) VALUE ('81943155','katty','av.Central318','psicologa');
INSERT INTO visitante (dni,nombre,domicilio,profesion) VALUE ('69481314','leonardo','av.Ultima431','medico');

CREATE TABLE EXCURSION 
(
  CODEXCURSION VARCHAR(4) NOT NULL 
, FECHA DATE NOT NULL 
, TIPO VARCHAR(50) NOT NULL 
, CODPN VARCHAR(4) NOT NULL
, PRIMARY KEY (CODEXCURSION) 
);

ALTER TABLE EXCURSION ADD FOREIGN KEY(CODPN) REFERENCES PARQUENATURAL(CODPN) ; 

INSERT INTO excursion (codexcursion,fecha,tipo,codpn) VALUE ('4441','2020-01-15','pie',1111);
INSERT INTO excursion (codexcursion,fecha,tipo,codpn) VALUE ('4442','2020-01-10','pie',1112);
INSERT INTO excursion (codexcursion,fecha,tipo,codpn) VALUE ('4443','2020-01-3','pie',1113);

CREATE TABLE E_V
(
  CODEXCURSION VARCHAR(4) NOT NULL
, DNI VARCHAR(8) NOT NULL
, PRIMARY KEY(CODEXCURSION, DNI)
);

ALTER TABLE E_V ADD FOREIGN KEY(CODEXCURSION) REFERENCES EXCURSION(CODEXCURSION);
ALTER TABLE E_V ADD FOREIGN KEY(DNI) REFERENCES VISITANTE(DNI);

INSERT INTO e_v (codexcursion,dni) VALUE ('4441','59462819');
INSERT INTO e_v (codexcursion,dni) VALUE ('4441','18654928');
INSERT INTO e_v (codexcursion,dni) VALUE ('4442','62185161');
INSERT INTO e_v (codexcursion,dni) VALUE ('4443','81943155');
INSERT INTO e_v (codexcursion,dni) VALUE ('4442','69481314');

/*CONSULTAS

Mostrar los nombres de los parques naturales que posean areas menores a 900ha.*/


SELECT nombre FROM parquenatural WHERE codpn in (SELECT codpn FROM area WHERE extension < 600);

/*Mostrar la fecha de la excursion a la que estan inscritos los visitantes que tienen la profesion de contadores o medicos.*/

SELECT fecha FROM excursion WHERE codexcursion in (SELECT codexcursion FROM e_v WHERE dni in (SELECT dni FROM visitante WHERE profesion = 'contador' || profesion = 'medico'));

/*VISTA DE VISITANTE (NOMBRE Y PROFESION)*/

CREATE OR REPLACE VIEW VISITAS AS 
SELECT visitante.nombre,profesion FROM VISITANTE;

SELECT * FROM visitas;

/*VISTA DEL PERSONAL (DNI,NOMBRE,CODPN,NOMBRE DEL PARQUE NATURAL)*/

CREATE OR REPLACE VIEW info_basica_personal AS
SELECT personal.dni AS DNI ,personal.nombre AS Nombre_del_Personal ,personal.codpn AS Codigo_del_Parque_Natural ,parquenatural.nombre AS Nombre_del_Parque_Natural FROM personal,parquenatural WHERE personal.codpn = parquenatural.codpn ORDER BY personal.codpn;

SELECT * FROM info_basica_personal;
