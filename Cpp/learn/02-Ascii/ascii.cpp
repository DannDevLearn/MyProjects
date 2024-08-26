#include <iostream>

int main(int argc, char const *argv[]){
    
    /*
        Cuando hablamos de ascii es el número de cada caracter en un computadora
        y este numero lo podemos obtener en c++ por medio del casteo de los caracteres
        y esto quedaria algo asi (cabe mencionar que puede se esto como bit manipulation)
     */

    std::cout << int('a') << std::endl;
    // o también puede ser:
    std::cout << (int)'a' << std::endl;

    // y puede funcionar de manera inversa
    std::cout << char(97) << std::endl;

    return 0;
}
