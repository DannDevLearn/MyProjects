package ListasEnlazadas;

import java.util.LinkedList;
import java.util.List;

/**
 *  Las listas enlazadas o LinkedList es una estructura de datos con los cuales
 *  podemos crear objetos y enlazarlos. Esto nos perminitara tener una lista que puede
 *  crecer de manera "Ilimitada" a comparacion de los arreglos que necesitan un tamaño
 *  en especifico.
 *  Ahora al usar Listas Enlazadas podemos agregar objetos en Big O con O(n)
 *  ya que debemos de recorrer la lista para poder insertar un datos
 *  Y de la misma manera para eliminar tenemos un uso O(n)
 *
 *  Para trabajar con listas en Java tenemos dos maneras
 *  1.- Nuestra propia implementacion
 *  2.- Java nos provee una Lista enlazada en el core
 * */
public class ListasEnlazadas {
    public static void main(String[] args) {
        // La manera que Java nos provee
        List<String> names = new LinkedList<>();
        names.add("Example");
        names.add("Example 2");
        names.add("Example 3");
        System.out.println(names);
    }
}
