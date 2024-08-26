-- Siguiendo con las consultas vamos a entnder el operador IN
-- Este nos ayudar a saber si el valor de un campo esta incluido en una lista de valores especificada

-- Para este usaremos la tabla libros 

-- Vamos a ejecutar un consulta para saber si los autore Borges y  Paenza existen

select * from libros where autor in('Borges', 'Paenza');

-- Parece facil, ahora vamos a intentar lo mismo pero pidiendo que esos no esten en nuestra consulta

select * from libros where autor not in ('Borges', 'Paenza');

-- Como podemos ver nos regresa la consulta sin esos autores

-- Notamos que es algo sencillo por lo que vamos rapidio a la tarea

-- Crear una tabla llamda medicamentos
-- 1- Cree la tabla con la siguiente estructura:
 create table medicamentos(
  codigo serial primary key,
  nombre varchar(20),
  laboratorio varchar(20),
  precio decimal(6,2),
  cantidad smallint,
  fechavencimiento date not null
 );
 
-- 2- Ahora ingresamos unos datos

 insert into medicamentos(nombre,laboratorio,precio,cantidad,fechavencimiento)
  values('Sertal','Roche',5.2,1,'2005-02-01');
 insert into medicamentos(nombre,laboratorio,precio,cantidad,fechavencimiento) 
  values('Buscapina','Roche',4.10,3,'2006-03-01');
 insert into medicamentos(nombre,laboratorio,precio,cantidad,fechavencimiento) 
  values('Amoxidal 500','Bayer',15.60,100,'2007-05-01');
 insert into medicamentos(nombre,laboratorio,precio,cantidad,fechavencimiento)
  values('Paracetamol 500','Bago',1.90,20,'2008-02-01');
 insert into medicamentos(nombre,laboratorio,precio,cantidad,fechavencimiento) 
  values('Bayaspirina','Bayer',2.10,150,'2009-12-01'); 
 insert into medicamentos(nombre,laboratorio,precio,cantidad,fechavencimiento) 
  values('Amoxidal jarabe','Bayer',5.10,250,'2010-10-01'); 
 
 
-- 3- Recupere los nombres y precios de los medicamentos cuyo laboratorio sea "Bayer" o "Bago" 
--empleando el operador "in" (4 registros)
 
 select nombre, precio, laboratorio from medicamentos where laboratorio in ('Bayer', 'Bago');

-- 4- Seleccione los medicamentos cuya cantidad se encuentre entre 1 y 5 empleando el operador "between" y 
-- luego el operador "in" (2 registros)
-- Note que es más conveniente emplear, en este caso, el operador ""between".

	select * from medicamentos where cantidad between 1 and 5; 
	select * from medicamentos where cantidad in (1,2,3,4,5);


