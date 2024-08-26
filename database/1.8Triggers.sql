-- Crearemos una tabla para ejemplo de un respaldo
create table nuevo_usuario(
	id serial primary key,
	nombre varchar(200) not null,
	edad int not null
);

insert into nuevo_usuario (nombre, edad)
	values('Xavi la diabla', 22);
	

select * from nuevo_usuario;

-- Creamos la tabla donde se guardaran los respaldos
create table respaldo_nuevo_usuario as select * from nuevo_usuario limit 0;

-- Tenemos tipos de triggers, ya que sea que se inserten
-- a nivel de fila o a nivel de instruccion
-- Fila -> Por cada fila se ejecuta el trigger
-- Instruccion -> Por cada instruccion ya sea un insert de 10 datos solo se ejecuta 1 vez

-- Propiedades de los triggers 
-- Before -> Se ejecuta antes de la operacion
-- After -> Se ejecuta despues de la operacion


-- Con un trigger podemos, crear un trigger, eliminarlo, modificarlo, deshabilitarlo, habilitarlo.

-- En postgresql tenemos una manera diferenter crear trigger ya que
-- Primero vamos a crear una funcion y despues la asociamos a un trigger

create or replace function func_usuarios()
	returns trigger as
$body$
begin 
	-- Logica a poner
	return new;
end;
$body$
language plpgsql;

-- La sintaxys para el triggers y lo asosiamos a la funcion creada
	create trigger trigger_name
	{before | after } { event } -- event insert delete update etc...
	on nombre_tabla
	[for [each] {row | statement}]
	execute procedure trigger_function
	
-- ejemplos de variables especiales
-- old, new, tg_when, tg_op, tg_table_name
	
-- Vamos al ejemplo con la tablas creadas
	
create table usuarios(
	id_usuario serial primary key,
	nombre varchar(100) not null,
	edad int not null
);

create table usuarios_respaldo as select * from usuarios limit 0;

insert into usuarios (nombre, edad) values ('Mr Frog', 60);

select * from usuarios;

-- Creamos la funcion para el trigger despues aspsiarlo

create or replace function func_usuarios()
	returns trigger as
$body$
begin 
	insert into usuarios_respaldo values (new.id_usuario, new.nombre, new.edad);
	return new;
end;
$body$
language plpgsql;


-- Ahora creamos el trigger
create trigger ai_usuarios
after insert
on usuarios
for each row
execute procedure func_usuarios();

-- Se supone que ya quedo el trigger

insert into usuarios (nombre, edad) values ('Silvestre', 40);

select * from usuarios;
select * from usuarios_respaldo;


-- Referencias
-- https://rstudio-pubs-static.s3.amazonaws.com/452109_7f9752b5ab574a50a68089c55749c827.html



select * from recipes;

create table general_recipe(
	id_recipe int not null,
	title varchar(150) not null,
	description varchar(300) not null,
	published timestamp not null
);

select * from recipes;


create or replace function func_general_recipe()
	returns trigger as
$body$
begin 
	
	insert into general_recipe (id_recipe, title,  description, published)
		values(new.id, new.title, new.description, now());
	return new;
end;
$body$
language plpgsql;


create trigger ai_recipes
after insert 
on recipes
for each row
execute procedure func_general_recipe();


select * from general_recipe;

select * from recipes;


