package Tree;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Tree (Arboles)
 *
 *  En Java contamos con una implementacion para arboles pero desde una interfaz Set.
 *  Recordemos que un Set es una lista u Arreglo con la ventaja de no tener repetidos
 *
 *  Para decir algo es que en Java utilizaremos el arbol desde la interfaz Set y la clase
 *  TreeSet.
 *
 *  Recordemos que hay muchas maneras de encontrarnos con arboles binarios como heap, binarios etc..
 *
 *  Recordmos igual que un arbol se compone de nodos o raiz y nodos hijos o nodos hojas. Pero
 *  lo veremos mas adelante donde hagamos nuestra propia implementacion
 *
 *  Mas info en {@link <a href="https://docs.oracle.com/javase/8/docs/api/">...</a>}
 *
 * */
public class Tree {
    public static void main(String[] args) {

        Set<Integer> tree = new TreeSet<>();

        tree.add(3);
        tree.add(9);
        tree.add(10);
        tree.add(45);
        tree.add(1);
        tree.add(9);

        // Al imprimir mi arbol podemos ver que no tenemos el numero 9 repetido
        System.out.println(tree);
        // Tambien podemos notar que lo tenemos ordenado de manera ascendente


    }
}
