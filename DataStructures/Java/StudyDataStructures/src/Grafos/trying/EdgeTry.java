package Grafos.trying;

public class EdgeTry implements Comparable<EdgeTry> {

    private final String destination;
    private final int weight;

    public EdgeTry(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "(" + destination + ", " + weight + ")";
    }

    @Override
    public int compareTo(EdgeTry o) {
        return Integer.compare(this.weight, o.weight);
    }
}
