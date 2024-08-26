package Queue.PriotityQueueExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Como podemos ver PriorityQueue es una estructura de datos donde nosotros tenemos la prioridad si es por
 * Maximo o Minimo
 * Algo que debemos de rescatar es que esta estructura de datos funciona como un Arbol Binario(Binary Tree o Heap)
 * y dependiendo a la prioridad que le asignemos es como va a ir acomodando nuestros datos
 * */

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.add(55);
        queue.add(22);
        queue.add(34);
        queue.add(10);
        queue.add(2);
        queue.add(99);
        queue.add(68);

        List<Integer> result = new ArrayList<>();
        result.add(queue.poll());
        result.add(queue.poll());
        result.add(queue.poll());
        result.add(queue.poll());
        result.add(queue.poll());
        result.add(queue.poll());
        result.add(queue.poll());
        System.out.println(result);
    }
}
