CREATE SCHEMA abpro02;
CREATE TABLE IF NOT EXISTS capacitacion (
  `idCapacitacion` INT NOT NULL AUTO_INCREMENT,
   `rutCliente` VARCHAR(15) NOT NULL,
  `FechaCapacitacion` VARCHAR(15)  NULL,
  `HoraCapacitacion` time  NULL,
  `LugarCapacitacion` VARCHAR(50) NOT NULL,
  `DuracionCapacitacion` INT NOT NULL,
  `CantidadAsistentes` INT,
  PRIMARY KEY (`idCapacitacion`));
  
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('23465456-7', 'Lunes', '14:00', 'UNAB', '90', '4');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('24345654-K', 'martes', '09:35', 'PUC', '70', '5');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('22434555-9', 'miercoles', '16:35', 'USACH', '60', '7');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('21987345-3', 'martes', '10:00', 'UNAB', '90', '22');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('20345764-7', 'miercoles', '14:00', 'USACH', '90', '1');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('22444332-K', 'Lunes', '09:35', 'UNAB', '70', '12');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('21989734-2', 'viernes', '16:35', 'USACH', '45', '18');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('21457668-1', 'jueves', '16:35', 'PUC', '60', '22');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('22343999-9', 'miercoles', '14:00', 'ULA', '70', '45');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('23888945-2', 'martes', '09:35', 'PUC', '60', '45');
INSERT INTO `abpro02`.`capacitacion` (`rutCliente`, `FechaCapacitacion`, `HoraCapacitacion`, `LugarCapacitacion`, `DuracionCapacitacion`, `CantidadAsistentes`) VALUES ('23456761-9', 'miercoles', '09:35', 'florida', '60', '50');

CREATE TABLE `abpro02`.`asistente` (
  `idasistente` INT NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(100) NOT NULL,
  `edad` INT NOT NULL,
  `capacitacion_idcapacitacion` INT NOT NULL,
  PRIMARY KEY (`idasistente`),
  INDEX `capacitacion_idcapacitacion_idx` (`capacitacion_idcapacitacion` ASC) VISIBLE,
  CONSTRAINT `capacitacion_idcapacitacion`
    FOREIGN KEY (`capacitacion_idcapacitacion`)
    REFERENCES `abpro02`.`capacitacion` (`idCapacitacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('José Alfonso', '32', '1');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Javier', '32', '3');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Sergio', '34', '2');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Marifer', '33', '4');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Daivid ', '24', '5');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Consuelo', '23', '6');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Javiera', '25', '6');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Ruben', '21', '7');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Stiven', '35', '7');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Barbara', '27', '7');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Daniela', '25', '11');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Francisco', '23', '10');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Simon', '31', '9');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Fede', '33', '8');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Chucho', '34', '11');
INSERT INTO `abpro02`.`asistente` (`nombres`, `edad`, `capacitacion_idcapacitacion`) VALUES ('Yoel', '45', '7');

UPDATE `abpro02`.`asistente` SET `nombres` = 'José  Mora' WHERE (`idasistente` = '1');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Javier Uzcategui' WHERE (`idasistente` = '2');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Sergio Lucena' WHERE (`idasistente` = '3');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Marifer Rondon' WHERE (`idasistente` = '4');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Daivid Petrovich' WHERE (`idasistente` = '5');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Consuelo Madagaspar' WHERE (`idasistente` = '6');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Javiera Di\'natteli' WHERE (`idasistente` = '7');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Ruben Gaspuso' WHERE (`idasistente` = '8');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Stiven Capriles' WHERE (`idasistente` = '9');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Barbara Guido' WHERE (`idasistente` = '10');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Daniela Melati' WHERE (`idasistente` = '11');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Francisco Oropeza' WHERE (`idasistente` = '12');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Simon Delamantie' WHERE (`idasistente` = '13');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Fede Prieto' WHERE (`idasistente` = '14');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Chucho Suarez' WHERE (`idasistente` = '15');
UPDATE `abpro02`.`asistente` SET `nombres` = 'Yoel Orlando' WHERE (`idasistente` = '16');

/* 1. Una consulta que despliegue todas las capacitaciones realizadas un lunes, que hayan
durado menos de una hora y media. */

Select  idCapacitacion, FechaCapacitacion, DuracionCapacitacion from  capacitacion where FechaCapacitacion = 'Lunes' and DuracionCapacitacion < 90;


/* 2. Una consulta que despliegue el listado de asistentes, mostrando el apellido y el nombre,
y el RUT del cliente, lugar y duración de la capacitación a la que asistió. */

Select SUBSTRING_INDEX(nombres, ' ', 1) as Nombres, substring_index(nombres, ' ', -1) as Apellidos, rutCliente, LugarCapacitacion, DuracionCapacitacion from asistente inner join capacitacion on asistente.idasistente = capacitacion.idCapacitacion;

/* 3. Una consulta que despliegue el listado de capacitaciones mostrando RUT del cliente, día
y hora, tales que la cantidad de asistentes registrada en el campo cantasistentes no
coincidacon la cantidad existente en la tabla Asistentes. */

Select idCapacitacion, rutCliente, FechaCapacitacion, HoraCapacitacion
from capacitacion
where CantidadAsistentes <> (select count(idasistente) from asistente); 


/* 4. Una consulta que muestre el listado de capacitaciones que tengan más de tres
asistentes registrados en la tabla respectiva. De la tabla de capacitaciones debe mostrar
el lugar, la duración, el día y la hora. */

Select LugarCapacitacion, DuracionCapacitacion, FechaCapacitacion, HoraCapacitacion
From capacitacion
where CantidadAsistentes > 3;