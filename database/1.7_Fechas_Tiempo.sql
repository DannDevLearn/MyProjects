-- Las fechas en postgresql las podemos manejar con:

-- date: solo es una fecha entre 4713 antes de crísto hasta 32767 después de cristo.
-- time: almacena la horo del dia (tambien en comillas simples)
-- timestamp: almacena la fecha y la hora del dia

-- Las fechas se ingresan entre comillas simples y los separadores pueden ser / - .
-- Postgre requiere de poner la fechas en un formato de aaaa/mm/dd
-- PostgreSQL permite configurar el formato de ingreso de la fecha seteando la variable de 
-- entorno llamada DATESTYLE: SET DATESTYLE TO 'European';

-- Para almacenar solo la hora debemos utilizar el tipo time. En un campo tipo time podemos 
-- almacenar un valor en el rango: 00:00:00.00 23:59:59.99.

create table fechas(
	id serial primary key,
	fecha date,
	tiempo time,
	todo timestamp
);


insert into fechas(fecha, tiempo, todo) 
	values('2000/01/07', '17:39:19', '2001/02/24 10:30:15');
	
select * from fechas;



-- Tarea
-- Una facultad almacena los datos de sus alumnos en una tabla denominada "alumnos".

-- 1- Cree la tabla eligiendo el tipo de dato adecuado para cada campo:
 create table alumnos(
  apellido varchar(30),
  nombre varchar(30),
  documento char(8),
  domicilio varchar(30),
  fechaingreso date,
  fechanacimiento date
 );

-- 2- Setee el formato para entrada de datos de tipo fecha para que acepte valores "día-mes-año" 

-- 3- Ingrese un alumno empleando distintos separadores para las fechas:
 insert into alumnos values('Gonzalez','Ana','22222222','Colon 123','20-08-1990','15/02/1972');

-- 4- Ingrese otro alumno empleando solamente un dígito para día y mes y 2 para el año:
 insert into alumnos values('Juarez','Bernardo','25555555','Sucre 456','03-03-1991','15/02/1972');

-- 5- Ingrese un alumnos empleando 2 dígitos para el año de la fecha de ingreso y "null" en 
-- "fechanacimiento":
 insert into alumnos values('Perez','Laura','26666666','Bulnes 345','03-03-91',null);

--6- Intente ingresar un alumno con fecha de ingreso correspondiente a "15 de marzo de 1990" pero en 
-- orden incorrecto "03-15-90":
 insert into alumnos values('Lopez','Carlos','27777777','Sarmiento 1254','03-15-1990',null);
-- aparece un mensaje de error porque lo lee con el formato día, mes y año y no reconoce el mes 15.

-- 7- Muestre todos los alumnos que ingresaron antes del '1-1-91'. 1 registro.

-- 8- Muestre todos los alumnos que tienen "null" en "fechanacimiento". 1 registro.
