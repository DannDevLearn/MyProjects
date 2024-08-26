-- Vamos ahora con LIKE

-- Para este tipo de consultas podemos verlo cuando usamos una busqueda cuando solo sabemos
-- un poco de la cadena de caracteres ya que si usamos el = buscara la conicidencia igial
-- mientras que like podemos usar una exprecion regular para buscar similitudes

-- Como ejemplo tenmos la tabla libro pero en autor tenemos a Borges y J.L Borges
-- si usamos = solo tendremos a Borges
-- pero al usar like obtendremos a ambos

select * from libros where autor='Borges';

-- Ahora usaremos like para traer todos lo libros de Borges

select * from libros where autor like '%Borges%';

-- algo que debemos tener en cuenta
-- % significa que esperamos cualquier caracter ya sea al inicio o al final
-- Asi que siquermeos solo los que inician con B lo hariamos asi

	select * from libros where autor like 'B%';

-- O tambien si sabemos que que nuestro autor su nombre termina en orges

	select * from libros where autor like '%orges';
-- Estamos diciendo, No importan los caracteres el inicio pero si los del final

--  Así como "%" reemplaza cualquier cantidad de caracteres, el guión bajo "_" reemplaza un caracter, 
-- es otro caracter comodín. Por ejemplo, queremos ver los libros de "Lewis Carroll" pero no recordamos 
-- si se escribe "Carroll" o "Carrolt", entonces tipeamos esta condición:

	select * from libros where autor like '%Carrol_';

-- "like" se emplea con tipos de datos char, varchar, date, time, timestamp. Si empleamos "like" con tipos 
-- de datos que no son caracteres utilizamos el comando 'cast' convirtiendo éste al tipo de dato. 
-- Por ejemplo, queremos buscar todos los libros cuyo precio se encuentre entre 10.00 y 19.99:

	select * from libros where cast(precio as varchar) like '1_.%';


-- Como practica vamos a lo que sigue con la tabla empleados
 create table empleados(
  nombre varchar(30),
  documento char(8),
  domicilio varchar(30),
  fechaingreso date,
  seccion varchar(20),
  sueldo decimal(6,2),
  primary key(documento)
 );

-- Insertamos un par de registros
 insert into empleados
  values('Juan Perez','22333444','Colon 123','1990-10-08','Gerencia',900.50);
 insert into empleados
  values('Ana Acosta','23444555','Caseros 987','1995-12-18','Secretaria',590.30);
 insert into empleados
  values('Lucas Duarte','25666777','Sucre 235','2005-05-15','Sistemas',790);
 insert into empleados
  values('Pamela Gonzalez','26777888','Sarmiento 873','1999-02-12','Secretaria',550);
 insert into empleados
  values('Marcos Juarez','30000111','Rivadavia 801','2002-09-22','Contaduria',630.70);
 insert into empleados
  values('Yolanda Perez','35111222','Colon 180','1990-10-08','Administracion',400);
 insert into empleados
  values('Rodolfo Perez','35555888','Coronel Olmedo 588','1990-05-28','Sistemas',800);

 
-- 3- Muestre todos los empleados con apellido "Perez" empleando el operador "like" (3 registros)
 
 select * from empleados where nombre like '%Perez%';

-- 4- Muestre todos los empleados cuyo domicilio comience con "Co" y tengan un "8" (2 registros)

 select * from empleados where domicilio like 'Co%8%';

-- 5- Muestre todos los nombres y sueldos de los empleados cuyos sueldos incluyen centavos (3 
-- registros)

select * from empleados;
 select nombre, sueldo from empleados where cast(sueldo as varchar) not like '%.00';

-- 6- Muestre los empleados que hayan ingresado en "1990" (3 registros)

	select * from empleados where cast(fechaingreso as varchar) like '1990%';
 
