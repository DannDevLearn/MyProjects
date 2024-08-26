# Para definirlas es con corchetes
# Las listas son mutables
# Son ordenadas, esto quiere decir que mantienen el orden en como fueron insertadas


my_list = [1,2,3,4,5]

print(my_list)

# Como con los string podemos concatenar listas
second_list = my_list + [6,7,8,9]
print(second_list)

# Para agreagr datos a mi lista
my_list.append(79)
print(my_list)

# Podemos asignar valor de ciertas posiciones
my_list[1:3] = [7, 9]
print(my_list)

# la funcion len tambien aplica aqui
print(len(my_list))

# Podemos tener listas de listas
first = [20,30,40,50,60,70] 
second: str = ["Example", "List","Strings"]

final_list = [first, second]
print(final_list)

# Tambien podemos agregar mas datos en la posicion especifica
first.insert(0, 10)
print(first)

# Remover un item de mi lista
first.remove(10)
print(first)

# Remover el ultimo item de mi lista
first.pop()
print(first)

# Algo que es propio de Python y muy intersante
# List Comprehension

example = [1,2,3,4,5,6,7,8,9]
# Si queremos aplicar una operacion a cada elemento de la lista como el multiplicarlo por 2
# lo podemos hacer con un for pero algo mejor es list comprehension en python

result = [i*2 for i in example]
print(result)

# En este caso que tal si queremos imprimir los numeros pares
pares = [i for i in example if i % 2 == 0]
print(pares)

# Ahora para poder observar un poco de cosas extras
# en las listas tenemos lo siguiente

print(example[2:7])

# Asi indicamos el rango que queremos que nos imprima
# Estamos diciendo que imiprima desde la posicion 2 hasta la 7(una antes la 7 no se imprime)

print(example[2:])

# Cuando no indicamos de donde terminar por defecto imprimira el resto de la lista

print(example[:5])

# Y al reves tambien funciona


# Si queremos saber si existe un valor dentro de mi lista usamos in
print(7 in example)


# Si queremos iterar una lista usamos while o for

for i in example:
    print(i, end=" ")
else:
    print("")


# Ahora para ordenar listas
other_list = [9,8,7,6,5,4,3,2,1]
print(other_list)
other_list.sort()
print(other_list)