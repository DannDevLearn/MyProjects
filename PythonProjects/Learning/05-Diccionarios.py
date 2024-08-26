# Es una estructura de datos donde manejamos clave valor
# en Java podemos tenerlo como un HashMap(Mapa)
# Para definirlos usamos {} llaves

my_diccionario = {1:"Ejemplo", 2:"De", 3:"Diccionarios"}

print(my_diccionario)

# Algo en tomar en cuenta es que a partir de python 3.7 los diccionarios son ordenados
# pero en versiones de python 3.6 hacia abajo no lo son
# Tambien debemos saber que los diccionarios si son mutables

# Podemos acceder a su valor por medi de la clave
print(my_diccionario[1])

# Dentro de un diccionario no podemos tener claves duplicadas

# Para poder recorrer nuestros diccionarios lo hacemos con un for 
for k,v in my_diccionario.items(): # Donde k = Key (clave) y v = value (valor) y agregamos la funcion items()
    print(f"my clave es {k} con un valor {v}")

# Tambien podemos crear un diccionario con "Comprehension" para agregar una condicion

# diccionario = {key:value for value in iterable  if condicion}

comp = {x:x**2 for x in range(-10, 0) if x%2==0}
print(comp)

# Otra manera de crear diccionarios es con dict()
other = dict(otro=123, ejemplo=32324, diccionario=23432)
print(other)