CREATE SCHEMA abp_1;
CREATE TABLE abp_1.ventas(
idventas int auto_increment, 
comprador varchar(45) null,
vendedor varchar(45)null,
cantaarticulos int null,
subtotal int null,
impuesto int null,
total int null,
primary key (idventas));



INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('L. Jacksonn', 'Osiris', 4, 140000, 140000*0.19, 140000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Samuel', 'Dchoes', 2, 70000, 70000*0.19, 70000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Vladimir', 'Adidas', 5, 175000, 175000*0.19, 175000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Andrew', 'Fallen', 7, 245000, 245000*0.19, 245000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('José Alfonso', 'Ipath', 7, 245000, 245000*0.19, 245000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Paty', 'Ipath', 12, 420000, 420000*0.19, 420000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Margarita', 'Adidas', 3, 105000, 105000*0.19, 105000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Alejandra', 'Adidas', 2, 70000, 70000*0.19, 70000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Monica', 'Fallen', 1, 35000, 35000*0.19, 35000*1.19);
INSERT INTO `abp_1`.`ventas` (`comprador`, `vendedor`, `cantaarticulos`, `subtotal`, `impuesto`, `total`) VALUES ('Luna', 'Osiris', 1, 700, 35000*0.19, 35000*1.19);


select * from abp_1.ventas where cantaarticulos > 2;
select idventas, comprador, cantaarticulos from abp_1.ventas where subtotal < 1000;
select total, impuesto, subtotal, cantaarticulos,vendedor,comprador,idventas from abp_1.ventas where vendedor = 'Adidas' and total >= 5000; 
select vendedor, comprador, total from abp_1.ventas  where comprador = 'Luna' or vendedor = 'Osiris';
select * from abp_1.ventas where idventas in (2,5,6,9);