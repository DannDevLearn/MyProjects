package Grafos.MyImpl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GraphWeight {

    private final Map<Character, LinkedList<Edge>> adjList;

    public GraphWeight(){
        adjList = new HashMap<>();
    }

    public void addVertex(char ch){
        adjList.putIfAbsent(ch, new LinkedList<>());
    }

    public void addEdge(char from, char to, int weight){
        if (!adjList.containsKey(from) || !adjList.containsKey(to))
            return;
        adjList.get(from).add(new Edge(to, weight));
    }

    public void printGraph(){
        for (Map.Entry<Character, LinkedList<Edge>> n : adjList.entrySet()){
            System.out.printf("%s -> ", n.getKey());
            for ( Edge e: n.getValue() ){
                System.out.printf("%s -> ", e);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphWeight graph = new GraphWeight();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('G');

        graph.addEdge('A','B',7);
        graph.addEdge('A','D',6);
        graph.addEdge('D','B',2);
        graph.addEdge('D','G',9);
        graph.addEdge('B','E',1);
        graph.addEdge('G','E',9);
        graph.addEdge('E','C',7);

        graph.printGraph();
    }


}
