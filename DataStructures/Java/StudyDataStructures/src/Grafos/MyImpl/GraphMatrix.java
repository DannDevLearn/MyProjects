package Grafos.MyImpl;

import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix {

    private final int[][] adjMatrix;
    private final int numVertex;

    public GraphMatrix(int numVertex){
        this.numVertex = numVertex;
        adjMatrix = new int[numVertex][numVertex];
    }

    public void addEdge(int from, int to){
        adjMatrix[from][to] = 1;
        adjMatrix[to][from] = 1;
    }

    public void printGraph(){
        for (int[] matrix : adjMatrix) {
            for (int j = 0; j < adjMatrix.length; j++)
                System.out.print(matrix[j] + " ");
            System.out.println();
        }
    }

    // this method is for an undirected graph
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertex];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int curVertex = queue.poll();
            System.out.print(curVertex + " ");

            for (int i = 0; i < numVertex; i++) {
                if (adjMatrix[curVertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);
        graph.addEdge(2, 4);

        graph.BFS(0);
    }
}
