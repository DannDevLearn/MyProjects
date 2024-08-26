package arreglos;

import java.util.ArrayList;
import java.util.List;

/**
 * Cuando hablamos de estructuras de datos como primer parte tenemos a los arreglos
 * o arrays, los cuales podemos pensar en ellos como espacios en memoria que van
 * acomodados una espacio de memoria tras otro. Podemos pensar en ellos como una caja que
 * contiene cajitas pequeñas y en cada una podemos almacenar un dato.
 * En Java tenemos maneras de declararlos ya sea nativamente o con clases.
 *
 * Una de las ventas de usar arreglos es que al saber el indice de un valor podemos
 * acceder a el con una complejidad de O(n)
 * asi como agregar y eliminar pero solo conociendo el indice
 * La gran desventaja es que tenemos un tamaño limitado para agregar datos
 */
public class MyArrays {
    // Para poder crear un arreglo de manera nativa del lenguaje
    // en este caso obligatoriamente debemos de conocer cuantos datos alamacenaremos
    int[] arreglo = new int[5];

    // Para declaralos usando clases que ya estan en el core de Java
    List<Integer> numbers = new ArrayList<>();
    // De esta manera podemos declararlos y para ver su valor es usar un For

    //Con arreglos pasamos de rapido ya que ya sabemos como funcionan
}
