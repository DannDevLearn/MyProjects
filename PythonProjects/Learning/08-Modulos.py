# Los modulos son definiciones en otros archivo .py pero podemos importarlos en un archivo
# que nosotros necesitemos usando la palabra import

import time

for i in range(5):
    print(i)
    time.sleep(1)

# Como podemos ver importamos time para poder dar un tiempo de espera en cada iteracion
# Vamos a crear un archivo para hacer fibonacci e importarlo y llamar sus funciones

import fibo

fibo.fib(5)

# En ese archivo contamos con dos funciones pero igual solo podemos importar una sola

from fibo import fib2

print(fib2(5))