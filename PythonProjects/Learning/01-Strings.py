# Con python podemos manipular string de una manera mas intuitiva
# No olvidemos los demas tipos de variables
# Ya que aqui solo vamos a ver strings

# IMPORTANTE los string en python son inmutables


my_str = "ejemplo de String"

# Recordemos que al final, un string es una lista de caracteres lo que quiere decir
# que podemos manupularlo como si fuera una lista

print(my_str.capitalize())
print(my_str.upper())
print(my_str.lower())

# Para poner la primer letra mayuscula de cada palabra
print(my_str.title())

# Si queremos ver cuantas veces se repite un carater tenemos count
print(my_str.count('e'))
# Tambien damos un rango de busqueda
print(my_str.count('e', 0, 8))

# Contar los caracteres de mi stirng
print(len(my_str))

# Reemplazar un substring por otro
print(my_str.replace("ejemplo de", "My"))

# Eliminar los espacios innecesarios al fin del string
print(my_str.rstrip())
print(my_str.lstrip())

# Para convertir un str en una lista
print(my_str.split())

# Separar letras con un caracter
print('-'.join(my_str))