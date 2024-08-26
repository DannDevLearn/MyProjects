-- Existen en PostgreSQL funciones que nos permiten contar registros, calcular sumas, promedios, 
-- obtener valores máximos y mínimos. Estas funciones se denominan funciones de agregado y operan 
-- sobre un conjunto de valores (registros), no con datos individuales y devuelven un único valor.

-- Imaginemos que nuestra tabla "libros" contiene muchos registros. Para averiguar la cantidad 
-- sin necesidad de contarlos manualmente usamos la función "count()":

select count(*) from libros;

-- La función "count()" cuenta la cantidad de registros de una tabla, incluyendo los que tienen valor nulo.

-- También podemos utilizar esta función junto con la cláusula "where" para una consulta más específica. 
-- Queremos saber la cantidad de libros de la editorial "Planeta":

select count(*) as total_libros_plantea from libros where editorial = 'Planeta';

-- Para contar los registros que tienen precio (sin tener en cuenta los que tienen valor nulo), usamos 
-- la función "count()" y en los paréntesis colocamos el nombre del campo que necesitamos contar:
select count(precio) from libros;


-- Podemos notar que al usar un  *  ignora lo nulos y los cuenta 
-- pero sin embargo agregamos un campo en especifico va a irgnorar nulo y NO lo va a contar

select * from medicamentos;

-- Ahora vamos a practicar para que quede mas claro asi que vmaos a crear una tabla medicamentos2

 Cree la tabla con la siguiente estructura:
 create table medicamentos2(
  codigo serial,
  nombre varchar(20),
  laboratorio varchar(20),
  precio decimal(6,2),
  cantidad smallint,
  fechavencimiento date not null,
  numerolote int default null,
  primary key(codigo));
  
 -- Agregamos un par de registros 
 
 insert into medicamentos2(nombre,laboratorio,precio,cantidad,fechavencimiento,numerolote)
  values('Sertal','Roche',5.2,1,'2015-02-01',null);
 insert into medicamentos2(nombre,laboratorio,precio,cantidad,fechavencimiento,numerolote) 
  values('Buscapina','Roche',4.10,3,'2016-03-01',null);
 insert into medicamentos2(nombre,laboratorio,precio,cantidad,fechavencimiento,numerolote) 
  values('Amoxidal 500','Bayer',15.60,100,'2017-05-01',null);
 insert into medicamentos2(nombre,laboratorio,precio,cantidad,fechavencimiento,numerolote)
  values('Paracetamol 500','Bago',1.90,20,'2018-02-01',null);
 insert into medicamentos2(nombre,laboratorio,precio,cantidad,fechavencimiento,numerolote) 
  values('Bayaspirina',null,2.10,null,'2019-12-01',null); 
  insert into medicamentos2(nombre,laboratorio,precio,cantidad,fechavencimiento,numerolote) 
  values('Amoxidal jarabe','Bayer',null,250,'2019-12-15',null); 
 
 
-- 3- Muestre la cantidad de registros empleando la función "count(*)" (6 registros)
	
 	select count(*) from medicamentos2; 
 
 
-- 4- Cuente la cantidad de medicamentos que tienen laboratorio conocido (5 registros)
 
 	select count(laboratorio) from medicamentos2;

-- 5- Cuente la cantidad de medicamentos que tienen precio distinto a "null" y que tienen cantidad 
-- distinto a "null", disponer alias para las columnas.

 	select * from medicamentos2;
 	select count(precio) as count_precio, 
 			count(cantidad) as count_cantidad
 		from medicamentos2;
 
-- 6- Cuente la cantidad de remedios con precio conocido, cuyo laboratorio comience con "B" (2 
-- registros)
 	
 	select count(precio) from medicamentos2 where laboratorio like 'B%';

-- 7- Cuente la cantidad de medicamentos con número de lote distinto de "null" (0 registros)
 
 	select count(numerolote) from medicamentos2; 
 
 