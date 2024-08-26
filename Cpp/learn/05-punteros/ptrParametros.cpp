#include<iostream>

void changeValue(int* val){
    // Debemos desreferenciar usando ()
    (*val)+=5;
}

int main(int argc, char const *argv[])
{
    /* 
        Para pasar por parametro punteros es muy buena opcion cuando queremos modificar una variable
        original sun necesidad de retornar algo y asignarlo o sin hacer copias 
        ya que la memoria en cpp es muy importante

        Tambien cuando se pasan por parametro grandes cantidades de informacion
        Trabajr con arrays y cadenas
        Pero sobre todo es cuando se asigna la memoria dinamica asignada con new o malloc

        Paso por referencia vs por punteros
        Por referencia:
            No se trabaja directamnete  con direcciones de memoria en el codigo
            Acceso directo al original sin necesidad de desreferenciar
            Sintaxis y el manejo son generalmente mas sencillos 
            No poermite trabajo a bajo nivel o con la memoria

        Punteros:
            Pasa directo la memoria de la variable
            Hay que derefetenciar el puntero para modificar el valor al que apunta
            Sintaxis mas compleja 
            Permite el trabajo a bajo nivel y trabajo directo con la memoria
    */
   int v = 5;

   std::cout << "Valor antes de llamar la funcion: " << v << std::endl;

    changeValue(&v);

    std::cout << "Valor despues de llamar a la funcion: " << v << std::endl;

    return 0;
}
