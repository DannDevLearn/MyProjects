package Grafos;

public class MainMatrixAdj {
    public static void main(String[] args) {
        MatrixAdjacent graph = new MatrixAdjacent(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Adjacency Matrix:");
        graph.printMatrix();
    }
}
