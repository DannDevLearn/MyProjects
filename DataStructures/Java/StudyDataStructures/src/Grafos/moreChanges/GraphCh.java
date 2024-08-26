package Grafos.moreChanges;

import java.util.*;

public class GraphCh {

    private Map<String, LinkedList<EdgeCh>> adjList;

    public GraphCh() {
        adjList = new HashMap<>();
    }

    public void addVertex(String v){
        adjList.putIfAbsent(v, new LinkedList<>());
    }

    public void addEdge(String from, String to, int weight){
        if (!adjList.containsKey(from) || !adjList.containsKey(to))
            return;
        adjList.get(from).add(new EdgeCh(to, weight));
    }

    public void printGraph(){
        for (Map.Entry<String, LinkedList<EdgeCh>> v: adjList.entrySet()){
            System.out.printf("%s -> ", v.getKey());
            for (EdgeCh edg: v.getValue())
                System.out.printf("%s, ", edg);
            System.out.println();
        }
    }

    /*
    * Esta implementacion solo es una manera basica de como trabaja el algoritmo
    * pero mas adelante veremos mas formas de implementar en el caso como lo es
    * un vertice de inicio y un vertice de finalizacion
    * o como se menciona en el libro grokking Algorithm saber si
    * alguien es un vendedor de mangos
    * */
    public Map<String, Integer> dijkstra(String startVertex){
        // Declaramos lo necesario para poder hacer el algoritmo
        Map<String, Integer> dist = new HashMap<>();
        Set<String> visited = new HashSet<>();
        PriorityQueue<EdgeCh> pq = new PriorityQueue<>();
        int maxInt = Integer.MAX_VALUE;

        // Segundo inicializamos los demas como infinitos en las distancias
        for ( String vtx: adjList.keySet() )
            dist.put(vtx, maxInt);

        // Tercero Ahora ponemos el vertex que iniciaremos en cero
        dist.put(startVertex, 0);
        // y agregamos al min heap el primer elemento
        pq.add(new EdgeCh(startVertex, 0));

        // Cuarto comienza el reto, mientras no este vacia la queue seguiremos iterando
        // en otros casos cuando tenemos el nodo destino, detendremos la iteracion
        // una vez llegado al nodo
        while (!pq.isEmpty()){
            EdgeCh curEdg = pq.poll();

            // si encontramos como visitado el nodo solo saltamos al siguiente iteracion
            if (visited.contains(curEdg.val())) continue;
            visited.add(curEdg.val());

            for (EdgeCh neighbor: adjList.get(curEdg.val())){
                // Checamos si algun nodo adyacente o vecino ha sido visitado
                // aqui lo descartamos para evitar caer en un ciclo infinito
                if ( visited.contains(neighbor.val()) ) continue;

                // La nueva distancia va a ser la distancia acumulada desde el vertice inicial
                // hasta el peso de esata arista
                int newDistance = dist.get(curEdg.val()) + neighbor.weight();

                // si la nueva distancia nueva es menor que la distancia  del vecino
                // le daremos prioridad y es donde agregamos la distancia corta
                // y lo ponemos en la cola de prioridad o Min Heap
                if (newDistance < dist.get(neighbor.val())){
                    dist.put(neighbor.val(), newDistance);
                    pq.add(new EdgeCh(neighbor.val(), newDistance));
                }
            }
        }
        return dist;
    }
}
