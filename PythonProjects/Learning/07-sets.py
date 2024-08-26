# Un set es una lista donde no se permiten duplicados
# para crear un set es con la funcion set

my_set = {1,2,3,4,5,6,7,8,9, 3}

print(my_set)

# Como podemos ver no acepta duplicados
 
# Debemos tener en cuanta que no son ordenados

# Podemos ver que debemos usar lalves como ai fuera un diccionario
# pero python sabe cuando sea crea un set o un diccioanrio

lista = ["Hola", "Mundo", "Hello", "Hola"]
print(lista)

setA = {'a','b','c'}
setB = {'d','f','g','a'}


another_set = set(lista)
print(another_set)

print(setA&setB)