'''
Cuando ejecutes un módulo de Python con
    python fibo.py <arguments>
(en la terminal)

el código en el módulo será ejecutado, tal como si lo hubieses importado, pero con __name__ con el valor de "__main__". 
Eso significa que agregando este código al final de tu módulo:

    if __name__ == "__main__":
    import sys
    fib(int(sys.argv[1]))

Ya estando en la terminal podemos ejecutar en la linea de comando como 
    
    python fibo.py 50

'''

def contador(n :int) -> None:
    for i in range(n):
        print(i, end=" ")

    

if __name__ == "__main__":
    import sys
    contador(int(sys.argv[1]))