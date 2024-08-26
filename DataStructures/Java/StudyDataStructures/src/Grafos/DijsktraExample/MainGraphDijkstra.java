package Grafos.DijsktraExample;

import java.util.Map;

public class MainGraphDijkstra {
    public static void main(String[] args) {

        Graph graph = getGraph();

        //La intencion es iniciar en el libro y llegar al piano
        graph.printGraph();

        System.out.println("++++++++++++++++++++++Starting Dijkstra+++++++++++++++");
        long start = System.currentTimeMillis();
        Map<String, Integer> resultDijkstra = Dijkstra.solution("Book", graph);
        long end = System.currentTimeMillis();
        System.out.println("+++++++++++++++++++Finish Dijkstra+++++++++++++++++++++");
        Dijkstra.printDijkstraResult(resultDijkstra);
        System.out.println("Total time: " +(end-start));
    }

    private static Graph getGraph() {
        Graph graph = new Graph();

        graph.addVertex("Book");
        graph.addVertex("Poster");
        graph.addVertex("Rare LP");
        graph.addVertex("Bass Guitar");
        graph.addVertex("Drum set");
        graph.addVertex("Piano");

        graph.addEdge("Book", "Rare LP", 5);
        graph.addEdge("Book", "Poster", 0);
        graph.addEdge("Rare LP", "Bass Guitar", 15);
        graph.addEdge("Rare LP","Drum set", 20);
        graph.addEdge("Poster", "Bass Guitar", 30);
        graph.addEdge("Poster", "Drum set", 35);
        graph.addEdge("Bass Guitar", "Piano", 20);
        graph.addEdge("Drum set", "Piano", 10);
        return graph;
    }
}
