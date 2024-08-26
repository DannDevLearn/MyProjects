# Las tuplas son una estructura de datos similar a las listas
# la diferencia es que no son mutables lo que quiere decir es que no podemos
# modificar sus valor ya insertados
# son ordenadas

my_tupla = (1,2,3,4,5,6,7)

print(my_tupla)

# Como podemos ver no podemos usar el metodo add ya que es inmutable

print(my_tupla.count(3))

# Podemos tener ciertos metodos que usamos con las listas

print(len(my_tupla))
print(3 in my_tupla)

# Como son muy similares solo dejaremos por aqui el tema

for i in my_tupla:
    print(i, end=" ")
else:
    print("")

# No podemos ordenar mi tupla
# pero si queremos podemos pasar los valores a una lista ordenarlos y devolverlos a la tupla

example_tupla=(9,8,7,6,5,4)
my_list = list(example_tupla)
print(my_list)
my_list.sort()
print(my_list)
example_tupla = tuple(my_list)
print(example_tupla)