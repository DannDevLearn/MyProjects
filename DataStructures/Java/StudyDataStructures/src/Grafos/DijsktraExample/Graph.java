package Grafos.DijsktraExample;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/*
* Para este ejemplo vamos a crear un grafo como lista de adyacencia y tomaremos
* el grafo que está en el libro "GRokking Algorithm" para poder implementarlo.
* */
public class Graph {

    private final Map<String, LinkedList<Edge>> adjList;

    public Graph (){
        adjList = new HashMap<>();
    }

    public void addVertex(String vertex){
        adjList.putIfAbsent(vertex, new LinkedList<>());
    }

    public void addEdge(String from, String to, int weight){
        if (!adjList.containsKey(from) || !adjList.containsKey(to))
            return;

        adjList.get(from).add(new Edge(to, weight));
    }

    public void printGraph(){

        for (Map.Entry<String, LinkedList<Edge>> n: adjList.entrySet()){
            System.out.printf("%s -> ", n.getKey());
            for ( Edge e: n.getValue() )
                System.out.printf("%s, ", e);
            System.out.println();
        }

    }

    public Set<String> getKeySet(){
        return adjList.keySet();
    }

    public Map<String, LinkedList<Edge>> getAdjList() {
        return adjList;
    }
}
