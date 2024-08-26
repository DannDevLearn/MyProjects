package Grafos.DijsktraExample;

public record Edge(String destination, int weight) {

    @Override
    public String toString() {
        return "(" + destination + ", " + weight + ")";
    }
}
