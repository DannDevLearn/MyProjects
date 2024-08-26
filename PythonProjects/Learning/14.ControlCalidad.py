'''
Una forma para desarrollar software de alta calidad consiste en escribir pruebas para cada 
función mientras se desarrolla y correr esas pruebas frecuentemente durante el proceso de desarrollo.

El módulo doctest provee una herramienta para revisar un módulo y validar las pruebas integradas 
en las cadenas de documentación (o docstring) del programa. La construcción de las pruebas es tan 
sencillo como cortar y pegar una ejecución típica junto con sus resultados en los docstrings. Esto 
mejora la documentación al proveer al usuario un ejemplo y permite que el módulo doctest se asegure 
que el código permanece fiel a la documentación:
'''
import doctest

def average(values):
    """Computes the arithmetic mean of a list of numbers.

    >>> print(average([20, 30, 70]))
    40.0
    """
    return sum(values) / len(values)


doctest.testmod()


# El módulo unittest no es tan sencillo como el módulo doctest, pero permite mantener un 
# conjunto más completo de pruebas en un archivo independiente:

import unittest

class TestStatisticalFunctions(unittest.TestCase):

    def test_average(self):
        self.assertEqual(average([20, 30, 70]), 40.0)
        self.assertEqual(round(average([1, 5, 7]), 1), 4.3)
        with self.assertRaises(ZeroDivisionError):
            average([])
        with self.assertRaises(TypeError):
            average(20, 30, 70)

unittest.main() 