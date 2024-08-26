-- Vamos a seguir realizando mas consultas 

-- Para este ejemplo vamos a aprender el uso de between
-- Ya que podemos realizar consultas usando operadores logicos pero ahora tenemos between

 create table libros(
  codigo serial,
  titulo varchar(40) not null,
  autor varchar(20) default 'Desconocido',
  editorial varchar(20),
  precio decimal(6,2),
  primary key(codigo)
 );
 
 insert into libros(titulo,autor,editorial,precio)
  values('El aleph','Borges','Emece',15.90);
 insert into libros(titulo,autor,editorial,precio)
  values('Cervantes y el quijote','Borges','Paidos',null);
 insert into libros(titulo,autor,editorial,precio)
  values('Alicia en el pais de las maravillas','Lewis Carroll',null,19.90);
 insert into libros(titulo,autor,editorial,precio)
  values('Martin Fierro','Jose Hernandez','Emece',25.90);
 insert into libros (titulo,autor,precio)
  values('Antología poética','Borges',32);
 insert into libros (titulo,autor,precio)
  values('Java en 10 minutos','Mario Molina',45.80);
 insert into libros (titulo,autor,precio)
  values('Martin Fierro','Jose Hernandez',40);
 insert into libros (titulo,autor,precio)
  values('Aprenda PHP','Mario Molina',56.50);
  
 
 select * from libros;
 
 -- Para seleccionar los libros cuyo precio NO esté entre un intervalo de valores 
 -- antecedemos "not" al "between":

select * from libros where precio not between 20 and 40;

 -- Recuperamos los registros cuyo precio esté entre 20 y 40 empleando "between":

select * from libros where precio between  20 and 40;



-- Ahora como tarea para quedar un poco mas claro vamos a usar la tabla visitas 

-- Seleccione los usuarios que visitaron la página entre el '2006-09-12' y '2006-10-11' (5 registros)
-- Note que incluye los de fecha mayor o igual al valor mínimo y menores al valor máximo, y que los 
-- valores null no se incluyen.

select * from visitas;
select * from visitas where fecha between '2006-09-12' and '2006-10-11';

-- 4- Recupere las visitas cuyo número se encuentra entre 2 y 5 (4 registros)
-- Note que incluye los valores límites. 

select * from visitas where numero between 2 and 5;




