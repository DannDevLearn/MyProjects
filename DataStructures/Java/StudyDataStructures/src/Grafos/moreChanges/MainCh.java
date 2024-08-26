package Grafos.moreChanges;

public class MainCh {
    public static void main(String[] args) {
        GraphCh graph = new GraphCh();

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

        graph.printGraph();
        long s = System.currentTimeMillis();
        System.out.println(graph.dijkstra("Book"));
        long f = System.currentTimeMillis();

        System.out.println("Time: " +(f-s));
    }
}
