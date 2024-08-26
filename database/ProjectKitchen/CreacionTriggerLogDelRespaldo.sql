create table log_delete_recipe as select * from recipes limit 0;

select * from log_delete_recipe;

alter table log_delete_recipe 
add column delete_date timestamp;

alter table log_delete_recipe 
rename column id_recipe to id_del_recipe;


create or replace function func_log_recipe()
	returns trigger as
$body$
begin 
	
	insert into log_delete_recipe (id_del_recipe,description, difficult, ingredients, published,steps,
	title, delete_date)
	values(old.id_recipe, old.description, old.difficult, old.ingredients, old.published, 
			old.steps, old.title, now());
	
	return new;
end;
$body$
language plpgsql;

create or replace trigger ad_recipes
after delete 
on recipes
for each row
execute procedure func_log_recipe();

drop trigger bd_recipes on recipes;

select * from recipes;
select * from log_delete_recipe;

delete from recipes where id_recipe = 2;

truncate table log_delete_recipe;



