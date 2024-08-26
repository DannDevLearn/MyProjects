package Grafos;

public class MainListAdj {
    public static void main(String[] args) {

        ListAdjacent graph = new ListAdjacent();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,1);

        graph.printAdjList();
    }
}
