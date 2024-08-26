package Grafos.MyImpl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class GraphList {

    // es no dirigido
    private final Map<Character, LinkedList<Character>> listAdj;

    public GraphList(){
        listAdj = new HashMap<>();
    }

    public void addVertex(char ch){
        listAdj.putIfAbsent(ch, new LinkedList<>());
    }

    public void addEdge(char from, char to){
        if (!listAdj.containsKey(from) && !listAdj.containsKey(to))
            return;
        listAdj.get(from).add(to);
        listAdj.get(to).add(from);
    }

    public void printAdjList(){
        for (Map.Entry<Character, LinkedList<Character>> entry : listAdj.entrySet()){
            System.out.printf("%s -> ", entry.getKey());
            for ( Character ch : entry.getValue() ){
                System.out.printf("%s -> ", ch);
            }
            System.out.println();
        }
    }

    public void BFS(char startVertex) {
        Map<Character, Boolean> visited = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        visited.put(startVertex, true);
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            char currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (char neighbor : listAdj.get(currentVertex)) {
                if (!visited.containsKey(neighbor) || !visited.get(neighbor)) {
                    visited.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphList graph = new GraphList();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');

        graph.addEdge('A','B');
        graph.addEdge('A','C');
        graph.addEdge('A','D');
        graph.addEdge('B','E');
        graph.addEdge('C','E');
        graph.addEdge('D','F');
        graph.addEdge('D','G');

        graph.BFS('A');
    }
}
