# Para definir una clase usamos la palabra reservada class
# posterior agregamos el nombre de la clase iniciando con mayusculas
# y si requiere espacios solo iniciamos con mayus
# " MiClaseEnPython "

'''
Cuando creamos una clase tambien podemos crear su constructor que este esta definido con
    def __init__(self)

Tambien tener en cuenta que en python no contamos con palabras reservadas para indicar
si un metodo o atributo es publico o privado por lo que solo tenemos que indicar con
guiones bajos por lo cual si queremos agregar un metodo privado solo es

    __metodo
    __atributo

La palabra self es como el this de Java
'''

class Perro:
    
    def __init__(self,nombre :str) -> None:
        self.nombre = nombre

luna = Perro("Luna")
print(luna.nombre)

'''
Como podemos ver pasamos por parametro el nombre del perro y podemos ver ese tributo
Crearemos un ejemplo donde tenga un atributo de trucos en una clase
Perrito
'''

class Perrito:

    # Como se menciona aqui este atributo es publico
    trucos = []

    def __init__(self, nombre :str) -> None:
        self.nombre = nombre
    
    # Para agregar metodos es como si definieramos una funcion
    def agregar_truco(self, truco):
        self.trucos.append(truco)

coco = Perrito("Coco")
coco.agregar_truco("Dar vuelta")
coco.agregar_truco("Dar patita")

# Como la lista de trucos es atributo publico podemos acceder a el directamente
print(coco.nombre)
print(coco.trucos)

'''
Todo parece que no hay nada malo pero podemos mejorar o en otras palabras
agregar la mejor manera de definir la clase lo cual quedaria

    class Perrito:
        def __init__(self,nombre :str) -> None:
            self.nombre = nombre
            self.trucos = []
        def agregar_truco(self, trucos :str) -> None:
            self.trucos.append(truco)

Hagamos lo mismo pero con la clase gato y que haga sus tareas
'''

class Gato:

    def __init__(self, nombre :str) -> None:
        self.nombre = nombre
        self.tareas = []

    def agreagr_tarea(self, tarea: str) -> None:
        self.tareas.append(tarea)

pantera = Gato("Pantera")
pantera.agreagr_tarea("Dormir")
pantera.agreagr_tarea("Dominar al mundo")

print(pantera.nombre)
print(pantera.tareas)


'''
En nuestra clase debemos saber que si nuestra clase necesita un atributo pero este tiene un 
nombre por defecto pero nosotros queremos otro nombre en la instancia, se priorisa la instancia
y asi podemos agregar atributos con valores por defecto
'''

class Casa:
    tipo = "Vivienda"
    region = "Norte"

c1 = Casa()
c2 = Casa()
c2.region = "Sur"

print(f"tipo {c1.tipo} en region {c1.region}")
print(f"tipo {c2.tipo} en region {c2.region}")

'''
Los métodos pueden llamar a otros métodos de la instancia usando el argumento self
algo asi como si fueran metodos estaticos en Java
'''

class Bolsa:
    def __init__(self) -> None:
        self.articulos = []

    def agregar(self, articulo :str) -> None:
        self.articulos.append(articulo)
    
    def agregar_dos_veces(self, articulo :str) -> None:
        self.agregar(articulo)
        self.agregar(articulo)

bolsa = Bolsa()
bolsa.agregar("Manzana")
bolsa.agregar_dos_veces("Mandarina")

print(bolsa.articulos)

'''
En python como hemos visto todos los atributos se pasaran al init que es el constructor de la clase
lo cual este crecera cada que aumentemos mas parametros por lo cual es necesario tener algo genial que podemos ver
en lenguajes como Java o C
Vamos a utilizar el decorador dataclass y este sustituira al init y al repr
'''

from dataclasses import dataclass

@dataclass
class Alumno:

    nombre: str
    apodo: str
    edad: int


maicol = Alumno("Miguel", "Maicol", 10)

print(f"Mi nombre es: {maicol.nombre}, mi apodo es: {maicol.apodo} y mi edad es de {maicol.edad}")


