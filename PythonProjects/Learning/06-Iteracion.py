# Ahora veremos unas tecnicas de iteracion

'''
    Como hemos visto acerca de diccionarios, listas y tuplas
    podemos itterar usando for pero tambien podemos agregar un poco mas
    de indicaciones
'''

# Para un diccionario iteramos asi
diccionario = {1:"Diccionarios", 2:"Listas", 3:"Tuplas"}

for k, v in diccionario.items():
    print(f"key {k}, -> value {v}")

# Para iterar sobre una seciencia ya sea lista o tupla podemos hacerlo como

lista = ["Ejemplo", "Tecnicas", "De", "Iteracion"]

for idx, value in enumerate(lista):
    print(f"idx = {idx} y el valor es: {value}")

# Tambien podemos usar el range
for idx in range(len(lista)):
    print(f"idx = {idx} y el valor es: {lista[idx]}")

# Podemos iterar dos lists al mismo tiempo com zip

first = [2,4,6,8,10]
second = [1,3,5,7,9]

for f, s in zip(first, second):
    print(f"lista 1: {f}, segunda lista {s}")

# Para iterar al reves

for i in reversed(second):
    print(i, end=" ")
else:
    print("")