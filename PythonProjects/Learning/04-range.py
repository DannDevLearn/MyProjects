# La funcion range nos dara un rango que le indiquemos

for i in range(10):
    print(i, end=" ")
else:
    print("")

# Indicamos donde iniciar y terminar
for i in range(1, 5):
    print(i, end=" ")
else:
    print("")

# Podemos decir que incluso de cuanto en cuanto se incremente

for i in range(0, 10, 2):
    print(i, end=" ")
else:
    print("")

# Cuando queremos iterar una lista pero tambien saber su idx
list_example = ["Hola", "Mundo", "Como", "Estas"]

for i in range(len(list_example)):
    print(f"{i}->{list_example[i]}", end=" ")
else:
    print("")