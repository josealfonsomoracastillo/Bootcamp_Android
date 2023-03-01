CREATE SCHEMA `abp_4` ;
CREATE TABLE `abp_4`.`clientes` (
  `idclientes` INT NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(50) NOT NULL,
  `apellidos` VARCHAR(50) NOT NULL,
  `direccion` VARCHAR(70) NULL,
  `telefono` INT NULL,
  PRIMARY KEY (`idclientes`));
  
 CREATE TABLE `abp_4`.`ventas` (
  `idventa` INT NOT NULL AUTO_INCREMENT,
  `vendedor` VARCHAR(50) NULL,
  `cantidad_articulos` INT NOT NULL,
  `subtotal` INT NOT NULL,
  `impuesto` INT NOT NULL,
  `total` INT NOT NULL,
  `clientes_idclientes` INT NOT NULL,
  PRIMARY KEY (`idventa`),
  INDEX `clientes_idclientes_idx` (`clientes_idclientes` ASC) VISIBLE,
  CONSTRAINT `clientes_idclientes`
    FOREIGN KEY (`clientes_idclientes`)
    REFERENCES `abp_4`.`clientes` (`idclientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
INSERT INTO `abp_4`.`clientes` (`nombres`, `apellidos`, `direccion`, `telefono`) VALUES ('Stiven', 'fonseca', 'la cisterna', '44444323');
INSERT INTO `abp_4`.`clientes` (`nombres`, `apellidos`, `direccion`, `telefono`) VALUES ('Aljendro', 'fuentemayor', 'las condes', '2345645');
INSERT INTO `abp_4`.`clientes` (`nombres`, `apellidos`) VALUES ('Juanito', 'Alimaña');

/* Consultas de inserción*/
INSERT INTO `abp_4`.`ventas` (`vendedor`, `cantidad_articulos`, `subtotal`, `impuesto`, `total`, `clientes_idclientes`) VALUES ('Panasonic', '34', '340000', 340000*0.19, 340000*1.19, '2');
INSERT INTO `abp_4`.`ventas` (`vendedor`, `cantidad_articulos`, `subtotal`, `impuesto`, `total`, `clientes_idclientes`) VALUES ('Apple', '23', '230000', 230000*0.19, 230000*1.19, '2');
INSERT INTO `abp_4`.`ventas` (`vendedor`, `cantidad_articulos`, `subtotal`, `impuesto`, `total`, `clientes_idclientes`) VALUES ('Motorola', '22', '220000', 220000*0.19, 220000*1.19, '1');
INSERT INTO `abp_4`.`ventas` (`vendedor`, `cantidad_articulos`, `subtotal`, `impuesto`, `total`, `clientes_idclientes`) VALUES ('Apple', '21', '210000', 210000*0.19, 210000*1.19, '3');
INSERT INTO `abp_4`.`ventas` (`vendedor`, `cantidad_articulos`, `subtotal`, `impuesto`, `total`, `clientes_idclientes`) VALUES ('Motorola', '22', '220000', 220000*0.19, 220000*1.19, '1');

UPDATE abp_4.ventas SET total = subtotal + impuesto;

DELETE FROM abp_4.ventas WHERE clientes_idclientes = 1; 
DELETE FROM abp_4.clientes WHERE idclientes = 1;

