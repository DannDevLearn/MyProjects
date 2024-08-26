#include<iostream>

using namespace std;

int main(int argc, char const *argv[]){
    // Practicamente el arreglo en cpp  es el puntero del primer elemento

    int arr[] = {10,20,30};

    // por lo tanto arr es el puntero hacia el numero 10 para este ejemplo
    cout << "Impriminedo el nombre de mi arr " << arr << endl;
    // Como podemos ver es el puntero el que se imprime y ahora si accedemos al valor de mi puntero
    // notaremos que es el valor del primer elemento de mi arreglo
    cout << "Imprimiendo el valor de mi arr: " << *arr << endl;

    // Si creamos un puntero de mi arreglo se comportara de la misma manera (hablando de punteros)
    int *ptr_arr {arr};

    cout << "Valor de mi puntero de mi array: " << ptr_arr << endl;
    cout << "Accediendo al valor: " << *ptr_arr << endl;

    /*
        Aritmetica de los punteros
        Es un concepto de programacion importante en C y Cpp principalmente en el manejo de arrays
        los punteros son variables que almacenan la direccion de memoria y la aritmetica punteros
        se utilizaran para calcular direcciones de memoria, lo que permite acceder y manipular datos
        en diferentes posiciones de un array o bloque de mmeoria

        Las operacioes que podemos hacer es el incrementar, decrementar, sumar y restar.
    */


   // Para entender un poco de esto vamos hacer un ejemplo
   int age[] = {23, 27, 30, 39};

   // Como sabemos que practicament el array es un puntero vamos acceder a los valor pero aplicando
   // aritmetica de punteros

   cout << "Valor de mi arreglo en la posicion 0: " << age[0] << endl;
   cout << "Valor de posicion 1 con aritmetica: " << *(age+1) << endl;
   cout << "y la direccion de memoria es: " << (age+1) << endl;

    return 0;
}
