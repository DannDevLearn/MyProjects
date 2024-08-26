package Grafos.moreChanges;

public record EdgeCh(String val, int weight) implements Comparable<EdgeCh> {

    @Override
    public String toString() {
        return "(" + val + ", " + weight + ")";
    }

    @Override
    public int compareTo(EdgeCh o) {
        return Integer.compare(this.weight, o.weight());
    }

}
