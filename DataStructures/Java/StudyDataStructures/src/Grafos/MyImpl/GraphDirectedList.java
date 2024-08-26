package Grafos.MyImpl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GraphDirectedList {

    private Map<Character, LinkedList<Character>> adjList;

    public GraphDirectedList(){
        adjList = new HashMap<>();
    }

    public void addVertex(char ch){
        adjList.putIfAbsent(ch, new LinkedList<>());
    }

    public void addEdge(char from, char to){
        if (!adjList.containsKey(from) && adjList.containsKey(to))
            return;
        adjList.get(from).add(to);
    }

    public void printAdjList(){
        for (Map.Entry<Character, LinkedList<Character>> entry : adjList.entrySet()){
            System.out.printf("%s -> ", entry.getKey());
            for ( Character ch : entry.getValue() ){
                System.out.printf("%s -> ", ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphDirectedList graph = new GraphDirectedList();

        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('d');
        graph.addVertex('e');

        graph.addEdge('e','b');
        graph.addEdge('e','a');
        graph.addEdge('d','c');
        graph.addEdge('d','e');

        graph.printAdjList();
    }
}
