use abp_2;
CREATE TABLE clientes (
  idcliente INT NOT NULL,
  nombres VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  direccion VARCHAR(70) NOT NULL,
  telefono INT NOT NULL,
  PRIMARY KEY (idcliente)
);

CREATE TABLE ventas (
  idventa INT NOT NULL,
  vendedor VARCHAR(50),
  cantarticulos INT NOT NULL,
  subtotal INT NOT NULL,
  impuesto INT NOT NULL,
  total INT NOT NULL,
  clientes_idcliente INT NOT NULL,
  PRIMARY KEY (idventa),
  FOREIGN KEY (clientes_idcliente) REFERENCES clientes (idcliente)
);

INSERT INTO clientes VALUES (1,'Antonia','Aranda','Calle Los Aromos #123',991111111);
INSERT INTO clientes VALUES (2,'Bernarda','Barros','Pasaje Manuel Balmaceda #456',992222222);
INSERT INTO clientes VALUES (3,'Carlos','Costa','Avenida Simón Bolivar #789',993333333);

INSERT INTO ventas VALUES (1,'Andrés Aranda',3,4500,500,5000,1);
INSERT INTO ventas VALUES (2,NULL,2,1200,100,1400,1);
INSERT INTO ventas VALUES (3,'Cristina Cortés',5,10480,20,10500,2);
INSERT INTO ventas VALUES (4,'Daniela Durán',1,5000,2500,7500,2);
INSERT INTO ventas VALUES (5,NULL,3,3800,100,4000,3);


select * from abp_2.ventas where  (subtotal + impuesto) <> total; 
select sum(total) from ventas; 
select * from ventas where clientes_idcliente = 1; 

select idcliente, concat(nombres, ' ', apellidos) as nombre_completo from clientes where direccion = null;
select min(tota) as venta_minima, max(total) as venta_maxima from ventas;