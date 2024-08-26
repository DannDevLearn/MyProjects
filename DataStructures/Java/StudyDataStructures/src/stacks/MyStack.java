package stacks;

import java.util.Stack;

/**
 * Stack (Pila)
 *  Es una estructura de datos lineal que sigue un orden particular en las que se ralizan las
 *  operaciones
 *
 *  El orden es conocido por sus siglas en ingles LIFO (Last In First Out).
 *
 *  La razon por la que se considera dificil esta estructura de datos es que utiliza otras estructuras
 *  de datos para la implementacion de esta misma. Como lo son Listas, Arreglos entre otros.
 *
 *  En un ejemplo tenemos mi stack
 *
 *      Stack = 1,2,3,4,5
 *
 *   Al momento de obtener nuestro dato como sabemos como funciona LIFO obtendremos el 5
 *   por lo cual nuestro stack queda como
 *
 *      Stack = 1,2,3,4
 *
 *   Para conocer mas de los metodos que tenemos en Stack tenemos:
 *   See also {@link <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html">Ver documentacion</a>}
 *
 * */
public class MyStack {
    public static void main(String[] args) {
        // En Java contamos con una implementacion de esta estructura de datos
        // Esta estructura de datos viene de una clase Vector pero ahora solo nos
        // concentraremos en la clase Stack

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Al imprimir mi stack quedaria algo asi = 1,2,3,4,5

        System.out.println(stack);

        // Ahora queremos recuperar nuestro ultimo datos insertado
        int number = stack.pop();

        // Ahora nuestro estack queda 1,2,3,4 y el numero 5 asignado a otra variable
        // Recordemos que el metodo pop remueve el valor de mi pila
        System.out.println(stack);
        System.out.println("Mi valor obtenido es: " +number);

        // Tambien podemos recuperar el ultimo valor con peek pero este no lo eliminará

        int n = stack.peek();

        // Imprimimos para verificar los datos

        System.out.println(stack);
        System.out.println("Mi valor obtenido pero no elliminado es: " +n);

    }
}
