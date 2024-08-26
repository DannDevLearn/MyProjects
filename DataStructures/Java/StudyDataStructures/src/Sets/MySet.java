package Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Set
 *
 *  Un set es una estructura de datos que se comporta como una lista o arreglo pero
 *  con la condicion de no contener duplicados.
 *
 *  En Java tenemos la interfaz Set con la implemetacion HashSet
 * */
public class MySet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(9);
        set.add(10);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(7);
        set.add(5);

        // Al imprimir mi set podremos notar que no se repite el numero 5
        System.out.println(set);
    }
}
