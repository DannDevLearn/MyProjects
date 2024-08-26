package Queue.MyQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  Queue (Colar)
 *  Ahora tenemos la estructura de datos llamda queue o fila, la cual se manupula
 *  de manera conocida por sus siglas en ingles como FIFO (First In First Out) que es
 *  el primero en entrar es el ultimo en salir.
 *
 *  Un ejemplo de su funcionamiento es
 *
 *      Queue = 1,2,3,4,5
 *
 *  Queremos el valor de mi queue que en este caso es el primero en entrar es el 1 mi queue queda
 *
 *      Queue = 2,3,4,5
 *
 *  En Java tenemos una estructura de datos que encontramos en:
 *
 *  Mas informacion en {@link <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html">Java Docs</a>}
 *
 *  Notas:
 *      1. Recuerda que en Java una Queue es una interfaz la cual es implementada por varias clases
 *      2. Indicaremos en Java que usaremos una Queue pero es si es una lista enlazada que se
 *      comportara como queue
 * */
public class MyQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);

        q.poll();

        System.out.println(q);

    }
}
