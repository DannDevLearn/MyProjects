package Grafos;

public class MatrixAdjacent {

    // We'll work with 0 and 1
    private int[][] adjMatrix;
    private int vertexNum;

    public MatrixAdjacent(int vertexNum){
        this.vertexNum = vertexNum;
        adjMatrix = new int[vertexNum][vertexNum];
    }

    public void addEdge(int from, int to){
        adjMatrix[from][to] = 1;
        adjMatrix[to][from] = 1;
    }

    public void printMatrix(){
        for (int[] matrix : adjMatrix) {
            for (int j = 0; j < adjMatrix.length; j++)
                System.out.print(matrix[j] + " ");
            System.out.println();
        }
    }

}
