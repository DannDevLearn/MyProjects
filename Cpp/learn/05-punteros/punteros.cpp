#include<iostream>
#include<vector>

using namespace std;

int main(int argc, char const *argv[]){

    /*
        Para entender, los punteros son las variables para poder guardar la direccion en memoria
        y para obtener la direccion en memoria es usando &
        y para declarar un putero es usando un asterisco *
        
        Entonces en pocas palabras recordar que los punteros son las variables para poder
        guardar la direccion en memoria fisica de mia variables
    */
    
    int variable = 100;

    int *puntero = &variable;

    cout << "Valor de mi variable: " << variable <<endl;
    cout << "Valor de direccion de memoria de variable: " << puntero << endl;
    cout << "Mostrando valor pero usan el puntero: " << *puntero << endl;

    int arr[5] = {1,2,3,4,5};

    cout << sizeof(arr);

    for (int i=0; i<5; i++){
        cout << "Valor de memoria de [" << &arr[i] << "] "<< &i << endl;
    }

    vector<int> nums = {1,2,3,4,5};

    cout << "Ahora vamos a ver el espacio en memoria en vectores" << endl;

    for (int i=0; i<nums.size(); i++)
        cout << &nums[i] << endl;


    // Cuando accedemos a un valor desde un puntero eso se le llama Deferencing pointer
    return 0;
}
