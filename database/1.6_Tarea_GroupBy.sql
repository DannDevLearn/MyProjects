-- Group by

-- Como su nombre lo dice es para agrupar pero... veamos un ejemplo donde
-- queremos contar los libros que tenemos con respecto a su editorial

select editorial, count(*) from libros group by editorial;

select editorial, count(precio) from libros group by editorial;


-- Ahora queremos conocer el total de dinero de los libros agrupados
-- por editorial 

	select editorial, sum(precio) from libros group by editorial;
	
-- Ahora queremos saber el valor maximo y minimo de cada editorial 

	select 
		editorial, 
		max(precio) as precio_maximo,
		min(precio) as precio_minimo
	from
		libros
	group by
		editorial;
		
-- Ahora queremos obtener el promedio del valor de los libros por editorial
	
	select 
		editorial,
		avg(precio) as promedio
	from
		libros
	group by
		editorial;
		
-- Tambien podemos agregar la clausula where para aplicar una condicion extra
	
-- Ahora vamos por la tarea el cual consiste en hacer una tabla visitantes
	
	create table visitantes(
  nombre varchar(30),
  edad smallint,
  sexo char(1) default 'f',
  domicilio varchar(30),
  ciudad varchar(20) default 'Cordoba',
  telefono varchar(11),
  mail varchar(30) default 'no tiene',
  montocompra decimal (6,2)
 );
 
-- Agregamos un par de datos

 insert into visitantes
  values ('Susana Molina',35,default,'Colon 123',default,null,null,59.80);
 insert into visitantes
  values ('Marcos Torres',29,'m',default,'Carlos Paz',default,'marcostorres@hotmail.com',150.50);
 insert into visitantes
  values ('Mariana Juarez',45,default,default,'Carlos Paz',null,default,23.90);
 insert into visitantes (nombre, edad,sexo,telefono, mail)
  values ('Fabian Perez',36,'m','4556677','fabianperez@xaxamail.com');
 insert into visitantes (nombre, ciudad, montocompra)
  values ('Alejandra Gonzalez','La Falda',280.50);
 insert into visitantes (nombre, edad,sexo, ciudad, mail,montocompra)
  values ('Gaston Perez',29,'m','Carlos Paz','gastonperez1@gmail.com',95.40);
 insert into visitantes
  values ('Liliana Torres',40,default,'Sarmiento 876',default,default,default,85);
 insert into visitantes
  values ('Gabriela Duarte',21,null,null,'Rio Tercero',default,'gabrielaltorres@hotmail.com',321.50);
  
 	select * from visitantes;
 
 -- 3- Queremos saber la cantidad de visitantes de cada ciudad utilizando la cláusula "group by" (4 filas devueltas)

 	select ciudad, count(*) from visitantes  group by ciudad;
 
-- 4- Queremos la cantidad visitantes con teléfono no nulo, de cada ciudad (4 filas devueltas)
 
 	select ciudad, count(telefono) from visitantes group by ciudad; 

-- 5- Necesitamos el total del monto de las compras agrupadas por sexo (3 filas)
 
 	select sexo, sum(montocompra) from visitantes group by sexo;

-- 6- Se necesita saber el máximo y mínimo valor de compra agrupados por sexo y ciudad (6 filas)
 
 	select 
 		sexo,
 		max(montocompra) as monto_maximo,
 		min(montocompra) as monto_minimo
 	from
 		visitantes 
 	group by
 		sexo,
 		ciudad;

-- 7- Calcule el promedio del valor de compra agrupados por ciudad (4 filas)
 	
	select ciudad, avg(montocompra) from visitantes group by ciudad;

-- 8- Cuente y agrupe por ciudad sin tener en cuenta los visitantes que no tienen mail (3 filas)

	select ciudad, count(mail) as cantidad from visitantes where mail is not null and mail <> 'no tiene' group by ciudad; 

 
 