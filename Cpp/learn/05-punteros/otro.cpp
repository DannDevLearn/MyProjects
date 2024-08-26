#include<iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    cout << "Uso de memoria y puntero:" << endl;

    int *int_ptr = new int;

    *int_ptr = 20;

    cout << int_ptr << endl;

    return 0;
}
