#include <iostream>

int main(int argc, char const *argv[]){

    bool booleano = true; // 1 byte
    char caracter = 'A';  // 1 byte
    unsigned char uchar = 255; // 1 byte
    signed char schar = -128; // 1 byte

    int entero = 12345; // 4 bytes
    unsigned int uentero = 12345; // 4 bytes
    short corto = 32767; // 2 bytes
    unsigned short ucorto = 65535; // 2 bytes
    long largo = 1234567890L; // 4 u 8 bytes dependiendo del sistema
    unsigned long ulargo = 1234567890UL; // 4 u 8 bytes dependiendo del sistema
    long long largo_largo = 1234567890123456789LL; // 8 bytes
    unsigned long long ulargo_largo = 1234567890123456789ULL; // 8 bytes

    float flotante = 3.14f; // 4 bytes
    double doble = 3.141592653589793; // 8 bytes
    long double doble_largo = 3.14159265358979323846264338327950288L; // 8, 12 o 16 bytes

    std::cout << "Entero: " << entero << std::endl;
    std::cout << "Flotante: " << flotante << std::endl;
    std::cout << "Doble: " << doble << std::endl;
    std::cout << "UChar: " << static_cast<int>(uchar) << std::endl;

    /*
        NOTA importante:
            - ¿Para que nos sirve la palabra signed o unsigned?
            En C++, la palabra clave unsigned se utiliza antes de declarar un tipo de dato para especificar 
            que la variable no tendrá signo. Esto significa que la variable solo puede almacenar valores no 
            negativos. La versión sin signo (unsigned) de los tipos de datos permite el uso completo del 
            rango positivo de bits disponibles, duplicando efectivamente el rango de valores positivos en 
            comparación con su contraparte con signo (signed).

            Si queremos saber el rango de y el tamaño de una variable en c++ podemos hacer lo siguiente:
    */
    std::cout << "Size of int is: " << sizeof(int) << " bytes " << std::endl; // Para el tamño en bytes
    std::cout << "Int min value is: " << INT_MIN << std::endl; // Para el valor minimo de int
    std::cout << "Int max value is: " << INT_MAX << std::endl; // Para el valor maximo de int

    // Para ver algo más cerca a lo que hablamos de unsigned
    std::cout << "Size of unsigned int is: " << sizeof(unsigned int) <<" bytes" << std::endl;
    std::cout << "UInt max value is: " << UINT_MAX << std::endl;

    // Y esto lo podemos hacer con el resto de las variables
    std::cout << "Size of boolean value is: " << sizeof(bool) << " bytes" << std::endl;

    std::cout << "Size long long max value is: " << sizeof(long long) << " bytes" << std::endl;
    std::cout << "long int max value is: " << LONG_LONG_MAX << std::endl;


    return 0;
}
