package Grafos;

import java.util.*;

public class ListAdjacent {

    private final Map<Integer, List<Integer>> adjList;

    public ListAdjacent(){
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex){
        adjList.putIfAbsent(vertex, new LinkedList<>());
    }

    public void addEdge(int from, int to) {
        if (!adjList.containsKey(from) || !adjList.containsKey(to))
            return;
        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }

    public void printAdjList() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer node : entry.getValue()) {
                System.out.print(node + "-> ");
            }
            System.out.println();
        }
    }

}
