CREATE SCHEMA abpro;
USE abpro;
CREATE TABLE IF NOT EXISTS capacitacion (
  `idCapacitacion` INT NOT NULL AUTO_INCREMENT,
   `rutCliente` VARCHAR(15) NOT NULL,
  `FechaCapacitacion` VARCHAR(15)  NULL,
  `HoraCapacitacion` time  NULL,
  `LugarCapacitacion` VARCHAR(50) NOT NULL,
  `DuracionCapacitacion` INT NOT NULL,
  `CantidadAsistentes` INT,
  PRIMARY KEY (`idCapacitacion`));
  
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('23465456-7', 'Lunes', '14:00', 'UNAB', '90', '4');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('24345654-K', 'martes', '09:35', 'PUC', '70', '5');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('22434555-9', 'miercoles', '16:35', 'USACH', '60', '7');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('21987345-3', 'martes', '10:00', 'UNAB', '90', '22');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('20345764-7', 'miercoles', '14:00', 'USACH', '90', '1');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('22444332-K', 'Lunes', '09:35', 'UNAB', '70', '12');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('21989734-2', 'viernes', '16:35', 'USACH', '45', '18');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('21457668-1', 'jueves', '16:35', 'PUC', '60', '22');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('22343999-9', 'miercoles', '14:00', 'ULA', '70', '45');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('23888945-2', 'martes', '09:35', 'PUC', '60', '45');
INSERT INTO `abpro`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('23456761-9', 'miercoles', '09:35', 'florida', '60', '50');

/* Consulta que obtenga todos los registros de la tabla sin filtro alguno, mostrando las
columnas identificador, hora, dia y rut de cliente (en ese orden).*/

select idCapacitacion, HoraCapacitacion,FechaCapacitacion,rutCliente from abpro.capacitacion; 




/* . Una consulta que obtenga todas las capacitaciones que duran una hora, y que tuvieron más de
30 asistentes. Debe desplegar todas las columnas sin un orden solicitado.*/ 

select * from capacitacion where DuracionCapacitacion = 60 AND CantidadAsistentes = 30;


/* Una consulta que obtenga las capacitaciones realizadas por el cliente de RUT 1-9 o 2-7,
y que el lugar es “La Florida”. Despliegue todas las columnas en el orden contrario a su
definición original.*/

SELECT * FROM capacitacion WHERE  rutCliente LIKE '%1-9' OR rutCliente LIKE '%2-7' and LugarCapacitacion = 'florida'; 

/* 4. Una consulta que obtenga todas las capacitaciones que han durado más de media hora,
pero menos de una hora y media, o bien que sus asistentes es menos que 10 personas. Se pide
mostrar el identificador de una tabla, y los campos indicados en la consulta.*/

SELECT idCapacitacion, DuracionCapacitacion, CantidadAsistentes FROM capacitacion WHERE  DuracionCapacitacion > 30 AND DuracionCapacitacion <= 90 OR CantidadAsistentes < 10; 


/* 5. Una consulta que obtenga las capacitaciones de los lunes, miércoles y viernes, que
tengan más de 50 asistentes y que hayan durado menos de media hora. Debe desplegar los
campos que estime prudente.consultas */

SELECT idCapacitacion, FechaCapacitacion, CantidadAsistentes, DuracionCapacitacion FROM capacitacion WHERE FechaCapacitacion IN ( 'lunes', 'miercoles','viernes' ) AND  CantidadAsistentes > 50 AND  DuracionCapacitacion < 30; 
