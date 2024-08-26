#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char const *argv[])
{
    // El for básico y más conocido de siempre
    for (int i=0; i<10; i++){
        cout << i << endl;
    }

    /*
        La cosa cambia un poquito cuando usamo vectores
        ya que se asimila un pooc a lo que usamos en Java    
    */
   vector<int> numbers = {10,20,30,40,50,60,70,80,90};

    for (int number: numbers){
        cout << "using vector and the number is: " << number << endl;
    }

    return 0;
}

