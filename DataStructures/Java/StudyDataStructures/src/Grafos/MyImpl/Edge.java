package Grafos.MyImpl;

public class Edge {

    private final char destination;
    private final int weight;

    public Edge(char destination, int weight){
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + destination + ", " + weight + ")";
    }
}
