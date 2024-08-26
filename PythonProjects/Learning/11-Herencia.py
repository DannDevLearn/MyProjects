'''
Cuando hablamos de herencia es cuando hay una clase padre que hereda a una clase hijo
y herada atributos y metodos.
En el caso de python para heredar vamos a pasar por parametro al definir el nombre de la calse
el nombre de la clase padre
En Java usamos la herencia con extends para clases e implements para interfaces
'''

class ClasePadre:
    def __init__(self, nombre = "Clase Base") -> None:
        self.nombre = nombre

class ClaseHija(ClasePadre):
    pass


'''
Tambien tenemos la herencia multiple en Python algo que en Java no contamos
y al menos para mitigar este problema en Java se crean las interfaces
algo que en python no existe
'''
class ClaseMadre:
    pass

class ClaseHijo(ClasePadre, ClaseMadre):
    pass


'''
Manejando variable privadas
'''
class Mapping:
    def __init__(self, iterable :list) -> None:
        self.items_list = []
        self.__update(iterable)

    def update(self, iterable :list) -> None:
        for item in iterable:
            self.items_list.append(item)

    __update = update

class SubMappingClass(Mapping):

    def update(self, keys, values):
        for item in zip(keys, values):
            self.items_list.append(item)

my_list = []
ejemplo = SubMappingClass(my_list)
k = ["Clave 1", "Clave 2", "Clave 3"]
v = ["Valor 1", "Valor 2", "Valor 3"]
ejemplo.update(k, v)
print(ejemplo.items_list)


'''
Este tema lo veremos mas adelante en Python POO
'''