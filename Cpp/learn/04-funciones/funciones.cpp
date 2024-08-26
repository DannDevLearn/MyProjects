#include<iostream>

using namespace std;

void myFunction(){
    cout << "I am a function" << endl;
}

void withParameters(int age){
    cout << "Your age is: " << age <<endl;
}

int factorial(int n) {
    if (n <= 1) 
        return 1;
    return n * factorial(n - 1);
    
}

void porReferencia(int &age){
    age = 100;
    cout << "Not your age is: " << age << endl;
}

template<typename T>
void swapValue(T& a, T& b){
    T temp = a;
    a = b;
    b = temp;
}

int main(int argc, char const *argv[]){
    
    // Para las funciones al parecer no es necesario de una clase ya que podemos declararlas afuera
    myFunction();
    withParameters(20);

    cout << factorial(5) << endl;

    /*
        Ahora vamos a entender el paso por referencia ya que esto es importante
        cuando pasamos un valor a una funcion realmente hace un copia del valor 
        pero si no queremos eso podemos hacer el paso por referencia agregando un &
    */
    int myAge = 20;

    cout << "Estoy pasando la variable myAge con el valor: " << myAge << endl;
    porReferencia(myAge);
    cout << "Pero ahora podemos ver que ha cambiado el valor ahora es: " << myAge << endl;

    // Como en Java aquí también contamos con genereicos y digamos que tenemos una funcion swap values
    // pero en lugar de crear una funcion para cada tipo creamos un generico

    int a = 1;
    int b = 2;

    swapValue(a, b);

    char aa = 'A';
    char bb = 'B';

    swapValue(aa, bb);

    // si imprimimos los valores podemos ver que si funciona pero eso te lo dejamos de tarea

    // Rercodar las funciones prototype que son declaradas al inicio pero implementadas despues
    // esto le dice al compilador que usaremos la funcion pero se declara mas adelante
    return 0;
}
