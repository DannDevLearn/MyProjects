-- Para crear un tabla en postgresql
create table users(
	user_id serial primary key,
	username VARCHAR(50) not null,
	email VARCHAR(50)
);
-- donde serial indica que es el autincrementable 
-- indicamos nuestra llave primaria
-- tambien indicamos que campos pueden ser nulos
-- podemos agregar un valor por defecto encaso de que venga nulo el campo pero se vera mas adelante

-- Ya creada la tabla podemos consultar sus datos con
select * from users;

-- Si queremos ver la informacion de nuestra tabla podemos usar la siguiente sintaxis
SELECT 
   table_name, 
   column_name, 
   data_type 
FROM 
   information_schema.columns
WHERE 
   table_name = 'users';
   
 
 --Ya que tenemos nuestra tabla podemos insertar registros
 insert into users (username, email) values('Emmanuel','manu@email.com');
 insert into users (username) values ('Rick');
-- Como el valor de email es opcional nos aparecera nulo y es por eso que podemos agregar solo el nombre
-- Ahora prara agregar mas valores junetos

insert into users (username, email) 
values ('Tommy', 'tom@email.com'),
	   ('Johanson', 'john@email.com'),
	   ('Paul', 'paul@email.com');
	  
--Antes de continuar recordemos que tenemos varios tipos de datos los mas basicos son
	  -- serial (indica que es un Integer pero autoincrementable)
	  -- VARCHAR (50) (Texto variable indicando la longitud del texto)
	  -- Integer
	  -- Float (numeros flotantes)
	  
-- Teniendo esta aprendido debes crear una tabla donde tenga los siguiente
-- La tabla es books
	  -- book_id serial PK
	  -- title varchar 40 no nulo
	  -- author varchar 50 no nulo
	  -- price float no nulo
	  -- stock integer no nulo
-- No olvides agregar minimo 5 registros
	  
create table books (
	book_id serial primary key,
	title varchar(40) not null,
	author varchar(50) not null,
	price float not null,
	stock integer not null
);

insert into books (title, author, price, stock)
values
('Doctor Sleep', 'Stephen King', 10.50, 30),
('Microservices in action', 'Romulo Johnson', 47.99, 10),
('Learn play Chess', 'Kasparov', 56.89, 25),
('Think fast Think slow', 'Andres', 43.65, 12),
('Learn French', 'French Academy', 89.45, 6);

select * from books;


-- Ahora que sabemos consultar todos los datos vamos a consultar solo ciertas columnas
-- en este ejmplo solo consultaremos el titulo y autor

select title, author from books;

-- Abhora agregarmos un where para solo tener ciertos resultados
select title, author from books where author='Stephen King';

-- Ahora debemos entender los datos relacionales los cuales son 
-- =	igual
-- <> ó != distinto
-- >	mayor
-- <	menor
-- >=	mayor o igual
-- <=	menor o igual

--Vamos a realizar un consulta donde pidamos que el precio del libro sea mayor o igual a 55
select title, author, price from books where price >= 50;
-- Puedes realizar consulta agregando un poco de condiciones
select title, author, price, stock from books where price != 89.45;
select * from books where stock >25;

-- Ahora vamos a eliminar registros de nuestra tabla
-- Vamos a eliminar con respecto a un dato especifico en este caso sera por el title

delete from books where title='Cujo';

-- Con respecto al eliminar debemos tener cuidado de no olvidar poner WHERE indicando a quien eliminaremos
-- ya que si no lo hacemos borramos toda la tabla (para vacias una tabla podemos usar truncate)

-- Ya que sabemos como crear, consultar y eliminar un registro ahora vamos a actualizarlos
-- para ello vamos a cambiar el nombre de un libro

update books set title='It' where book_id=1;

-- Podemos actualizar varios campos lo cual vamos hacer con el stock y el precio del libro it

update books set price=20.89, stock=7  where book_id=1;

-- Ahora para finalizar vamos a crear una tabla nueva donde aplicaremos todo lo aprendido
-- tabla  Refrescos
	-- id
	-- marca
	-- precio
	-- stock
	-- fecha de caducidad

create table sodas(
	soda_id serial primary key,
	brand varchar(30) not null,
	price float not null,
	stock integer,
	expiry_date date not null
);

select * from sodas;

insert into sodas(brand, price, stock, expiry_date) values
	('Coca Cola',30.83, 27,'2023/12/24');
	('Pepsi',29.87, 30, '2023/12/22'),
	('Fanta', 25.33,40,'2024/01/06'),
	('Sprite',22.34,23,'2024/02/28'),
	('Lipton', 33.43,12,'2024/06/11'),
	('Dr peper', 20.82,44,'2024/09/30');


select brand, price, expiry_date from sodas;

select brand, stock from sodas;

select brand, price, stock from sodas where stock >= 30;

update sodas set stock=50 where soda_id=1;

delete from sodas where brand='Dr peper';

select brand, price, stock, expiry_date from sodas order by stock;

-- Como bonus vamos a vacia la tabla sodas con truncate ya que lo podemos hacer con delete pero lo mejor es con truncate

truncate table sodas;