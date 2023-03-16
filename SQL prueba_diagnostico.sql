CREATE SCHEMA `prueba_diagnostico` ;
DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;
CREATE TABLE fabricante (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL
);
CREATE TABLE producto (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
precio DOUBLE NOT NULL,
id_fabricante INT UNSIGNED NOT NULL,
FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)
);
INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');
INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);


-- 1. Lista el nombre de todos los productos que hay en la tabla producto.

Select nombre from producto;

--  2. Lista los nombres y los precios de todos los productos de la tabla producto.

Select nombre, precio from producto;

-- 3. Lista todas las columnas de la tabla producto

Select * from  producto;

-- 4. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).
 
select nombre as 'nombre de los productos', 
precio as 'euros', round(precio*1.063,2) as 'dólares' 
from producto; 

-- 5. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).
-- Utiliza los siguientes alias para las columnas: nombre de producto, euros, dólares.

Select nombre as 'nombre de producto', 
precio as 'euros', round(precio*1.063,2) as 'dólares'
from producto; 

-- 6. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los
-- nombres a mayúscula

select upper(nombre) as 'Nombres en mayuscula', precio 
from producto;

-- 7. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los
-- nombres a minúscula.

select lower(nombre) as 'Nombres en minúscula', precio
from producto; 

-- 8. Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en
-- mayúsculas los dos primeros caracteres del nombre del fabricante.

select nombre, concat(ucase(left(nombre,2)), 
substring(nombre,3)) as 'Nombre Fabricante'
from fabricante;

-- 9. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor
-- del precio.


select nombre, round(precio) as precio
from producto;

-- 10. Lista los nombres y los precios de todos los productos de la tabla producto, 
-- truncando el valor del precio para mostrarlo sin ninguna cifra decimal.

select nombre, round(precio,0) as 'precio_truncado'
from producto;

-- 11. Lista el identificador de los fabricantes que tienen productos en la tabla producto.

select distinct id_fabricante
from fabricante
inner join producto on id_fabricante; 

-- 12. Lista el identificador de los fabricantes que tienen productos en la tabla producto, eliminando los
-- identificadores que aparecen repetidos

select distinct id_fabricante
from producto;

-- 13. Lista los nombres de los fabricantes ordenados de forma ascendente.

Select nombre
from fabricante
order by nombre asc; 

-- 14. Lista los nombres de los fabricantes ordenados de forma descendente.

select nombre
from fabricante
order by nombre desc;

-- 15. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente
-- y en segundo lugar por el precio de forma descendente.

select nombre, precio
from producto
order by nombre asc, precio desc; 

-- 16. Devuelve una lista con las 5 primeras filas de la tabla fabricante


select *
from fabricante limit 5;


-- 17. Devuelve una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también
-- se debe incluir en la respuesta.

select * 
from fabricante limit 2 offset 3;


-- 18. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER
-- BY y LIMIT)

select nombre, precio
from producto
order by precio asc limit 1; 

-- 19. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER
-- BY y LIMIT)

select nombre, precio
from producto
order by precio desc limit 1;

-- 20. Lista el nombre de todos los productos del fabricante 
-- cuyo identificador de fabricante es igual a 2.

select nombre 
from producto 
where id_fabricante = 2;


-- 21. Lista el nombre de los productos que tienen un precio menor o igual a 120.

select nombre 
from producto 
where precio <= 120;

-- 22. Lista el nombre de los productos que tienen un precio mayor o igual a 400.

select nombre 
from producto
where precio >= 400; 


-- 23. Lista el nombre de los productos que no tienen un precio mayor o igual a 400.

select nombre
from producto
where precio < 400; 

-- 24. Lista todos los productos que tengan un precio entre 80 y 300. Sin utilizar el
-- operador BETWEEN.

select *
from producto 
where precio between 80 and 300;


-- 25. Lista todos los productos que tengan un precio entre 60 y 200. Utilizando el operador BETWEEN.

select * 
from producto
where precio between 60 and 200;

-- 26. Lista todos los productos que tengan un precio mayor que 200 y que el identificador de
-- fabricante sea igual a 6.


select *
from producto 
where precio > 200 and id_fabricante = 6;

-- 27. Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Sin utilizar el
-- operador IN.

select *
from producto
where id_fabricante in (1, 2, 3); 


-- 28. Lista todos los productos donde el identificador de fabricante sea 1, 3 o 7. Utilizando el
-- operador IN.

select *
from producto
where id_fabricante in (1, 2, 7); 

-- 29. Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar 
-- por 100 el valor del precio). Cree un alias para la columna que contiene el precio 
-- que se llame céntimos.

select nombre, precio*100 as 'céntimos'
from producto;

-- 30. Lista los nombres de los fabricantes cuyo nombre empiece por la letra S.

select nombre
from fabricante
where nombre like 's%';

-- 31. Lista los nombres de los fabricantes cuyo nombre termine por la vocal e.

select nombre
from fabricante
where nombre like '%e'; 

-- 32. Lista los nombres de los fabricantes cuyo nombre contenga el carácter w

select nombre 
from fabricante
where nombre like '%w%';


-- 33. Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres


select nombre 
from fabricante
where length(nombre) = 4; 

-- 34. Devuelve una lista con el nombre de todos los productos que contienen la cadena
--  Portátil en el nombre.

select nombre
from producto
where nombre like '%Portátil%'; 


-- 35. Devuelve una lista con el nombre de todos los productos que contienen la 
-- cadena Monitor en el nombre y tienen un precio inferior a 215 .


select nombre
from producto
where nombre like '%Monitor%' and precio < 215; 


-- 36. Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180.
-- Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por
-- el nombre (en orden ascendente).

select precio, nombre  
from producto
where precio >= 180
order by precio desc, nombre asc;

/* Consultas multitabla (Composición interna) */


--  1. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de
-- todos los productos de la base de datos.

select producto.nombre, producto.precio, fabricante.nombre
from producto
inner join fabricante 
on fabricante.id = producto.id_fabricante;


-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los
-- productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden
-- alfabético

Select producto.nombre as nombre_producto, precio, fabricante.nombre as nombre_fabricante
from producto
inner join fabricante
on producto.id_fabricante = fabricante.id
order by fabricante.nombre asc;


-- 3. Devuelve una lista con el identificador del producto, nombre del producto, identificador 
-- del fabricante y nombre del fabricante, de todos los productos de la base de datos.


select producto.id as id_producto, producto.nombre as nombre_producto, fabricante.id as id_fabricante
from producto
inner join fabricante
on producto.id_fabricante = fabricante.id;


-- 4. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del 
-- producto más barato.


Select producto.nombre as Nombre_Producto, 
producto.precio,
fabricante.nombre as Nombre_Fabricante
from producto
join fabricante on producto.id_fabricante = fabricante.id
where producto.precio = (select min(precio) from producto);


-- 5. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más caro.

Select producto.nombre as Nombre_producto, 
producto.precio, fabricante.nombre as Nombre_fabricante
from producto
join fabricante on producto.id_fabricante = fabricante.id
where producto.precio = (select MAX(precio) from producto);

-- 6. Devuelve una lista de todos los productos del fabricante Lenovo.

Select  producto.id, producto.nombre, producto.precio
from producto
join fabricante on producto.id_fabricante = fabricante.id
where fabricante.nombre = 'lenovo'; 

-- 7. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que
-- 200

select producto.nombre, producto.precio
from producto
join fabricante on producto.id_fabricante = fabricante.id
where fabricante.nombre = 'crucial' and producto.precio > 200;


-- 8. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packardy 
-- Seagate. Sin utilizar el operador IN.


select producto.nombre, producto.precio
from producto
join fabricante on producto.id_fabricante = fabricante.id
where fabricante.nombre = 'Asus' or  fabricante.nombre = 'Hewlett-Packardy' 
or fabricante.nombre=  'Seagate';

-- 9. Devuelve un listado con todos los productos de los fabricantes Asus,
-- Hewlett-Packardy Seagate. Utilizando el operador IN
 
SELECT producto.nombre, producto.precio
FROM producto
JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE fabricante.nombre IN ('Asus', 'Hewlett-Packard', 'Seagate');

-- 10. Devuelve un listado con el nombre y el precio de todos los productos de los fabricantes cuyo
-- nombre termine por la vocal e.