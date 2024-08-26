#include<iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    // Punteros a constantes No podemos cambiar el valor de una constante ni usando punteros pero si podemos
    // cambiar la referencia hacia otro objeto
    
    const int age = 20;
    const int *age_ptr = &age;
    cout << *age_ptr << endl;

    int payment = 2000;

    age_ptr = &payment;
    cout << "Imprimiendo nuevamente mi puntero pero apuntando otra direccion: " << *age_ptr << endl;

    // Punteros constantes Pero si cremos un puntero constante no podra cambiar la referencia pero
    // el valor que apunta se podra cambiar el valor

    int edad = 20;
    int *const ptr_edad = &edad; // Asi se crea un puntero constante;

    cout << "Usando el puntero constante: " << *ptr_edad << endl;
    *ptr_edad = 30;
    cout << "Cambiando el vamor de mi puntero constante: " << *ptr_edad << endl; 

    // Al final constante constante donde no cambiara el valor ni la referencia

    const int salario = 2000;
    const int *const  ptrSalario = &salario;

    cout << "Usando puntero constante constante: " << *ptrSalario << endl;

    return 0;
}
