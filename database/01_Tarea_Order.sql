-- Vamos a empezar con los ejercicios 

--Primer problema:
--En una página web se guardan los siguientes datos de las visitas: número de visita, nombre, mail, 
--pais, fecha.

--1- Créela con la siguiente estructura:
-- create table visitas (
--  numero serial,
--  nombre varchar(30) default 'Anonimo',
--  mail varchar(50),
--  pais varchar (20),
--  fecha timestamp,
--  primary key(numero)
--);

 create table visitas (
  numero serial,
  nombre varchar(30) default 'Anonimo',
  mail varchar(50),
  pais varchar (20),
  fecha timestamp,
  primary key(numero)
);

-- Inserta un par de datos

insert into visitas (nombre,mail,pais,fecha)
  values ('Ana Maria Lopez','AnaMaria@hotmail.com','Argentina','2006-10-10 10:10');
 insert into visitas (nombre,mail,pais,fecha)
  values ('Gustavo Gonzalez','GustavoGGonzalez@hotmail.com','Chile','2006-10-10 21:30');
 insert into visitas (nombre,mail,pais,fecha)
  values ('Juancito','JuanJosePerez@hotmail.com','Argentina','2006-10-11 15:45');
 insert into visitas (nombre,mail,pais,fecha)
  values ('Fabiola Martinez','MartinezFabiola@hotmail.com','Mexico','2006-10-12 08:15');
 insert into visitas (nombre,mail,pais,fecha)
  values ('Fabiola Martinez','MartinezFabiola@hotmail.com','Mexico','2006-09-12 20:45');
 insert into visitas (nombre,mail,pais,fecha)
  values ('Juancito','JuanJosePerez@hotmail.com','Argentina','2006-09-12 16:20');
 insert into visitas (nombre,mail,pais,fecha)
  values ('Juancito','JuanJosePerez@hotmail.com','Argentina','2006-09-15 16:25');
 
 
 select * from visitas;
-- 3- Ordene los registros por fecha, en orden descendente.
 
 select * from visitas order by fecha desc;

-- 4- Muestre el nombre del usuario, pais y el número de mes, ordenado por pais (ascendente)
-- y número de mes (descendente)

 select nombre, pais, extract(month from fecha) as mes from visitas order by pais, mes desc;

-- 5- Muestre el pais, el mes, el día y la hora y ordene las visitas por nombre del mes, del día y la 
-- hora.

	select 
		nombre,
		mail, 
		extract(month from fecha) as mes,
		extract(day from fecha) as dia,
		extract(hour from fecha) as hora
	from
		visitas
	order by
		3,4,5;

-- 6- Muestre los mail, país, ordenado por país, de todos los que visitaron la página en octubre (4 
--registros)
	
	
  select mail, pais
  from visitas
  where extract(month from fecha)=10
  order by 2;
		
	 