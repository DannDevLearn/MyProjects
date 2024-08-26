package Grafos.trying;

public class MainGraphTry {
    public static void main(String[] args) {

        GraphTry graph = new GraphTry();

        graph.addVertex("Book");
        graph.addVertex("Poster");
        graph.addVertex("Rare LP");
        graph.addVertex("Drum set");
        graph.addVertex("Bass Guitar");
        graph.addVertex("Piano");

        graph.addEdge("Book", "Rare LP", 5);
        graph.addEdge("Book", "Poster", 0);
        graph.addEdge("Rare LP", "Drum set", 20);
        graph.addEdge("Rare LP", "Bass Guitar", 15);
        graph.addEdge("Poster", "Bass Guitar", 30);
        graph.addEdge("Poster", "Drum set", 35);
        graph.addEdge("Bass Guitar", "Piano", 20);
        graph.addEdge("Drum set", "Piano", 10);

        graph.printGraph();
        System.out.println("**********************************");
        System.out.println(graph.dijkstra("Book"));
    }
}
