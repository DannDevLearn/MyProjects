#include<iostream>

using namespace std;

int main(int argc, char const *argv[]){
    
    /*
        Las memorias principales en cpp podemos encontrar:
            stack
            heap
            static
        lo que podemos ver es que la heap y stack se comportan similar Java
        pero con la diferencia es que en la heap debemos tener elmanejo completo de 
        la memoria.
        Mientras que la estatica es donde almacenamos las variables globales y estaticas
        las cuales viviran hasta que termine mi ejecucion

        Ahora la memoria heap es donde viven al perecer mis objetos pero veamos un ejemplo
        NOTA: Cuando usamos "new" estamos asignando memoria dinamica
    */

   int *intPtr = new int; // se inicializa null pero tenemos la referencia a la heap NO OLVIDES EL NEW ya que es
   // el encargado de hacer la referencia

   *intPtr = 10; // aqui le agregamoss un valor

   cout << "Tenemos el valor actual de mi puntero " << *intPtr << endl;

   // Ahora podemos eliminar el valor de mi variable con "delete" pero debemos tener en cuenta algo
    cout << "El valor de mi variable antes del delete: " << intPtr << endl;

    delete intPtr;

    // Ya eliminamos el valor de mi variable pero como tal mi puntero sigue viviendo para ya que podemos ver el 
    // la direccion de memoria de mi puntero

    cout << intPtr << endl;
    // Como buena practica debemos igualarlo a null para "eliminarla" por completo

    intPtr = nullptr;

    return 0;
}
