'''
Los programas frecuentemente necesitan procesar argumentos de linea de comandos. Estos argumentos se almacenan 
en el atributo argv del módulo sys como una lista. Por ejemplo, consideremos el siguiente archivo :file: “demo.py”:

Este es el resultado de ejecutar python demo.py uno dos tres en la línea de comandos:

['demo.py', 'one', 'two', 'three']

'''

import sys

if __name__ == "__main__":
    print(sys.argv)

