package Grafos.DijsktraExample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {

    public static Map<String, Integer> solution(String startVertex, Graph graph){
        Map<String, Integer> dist = new HashMap<>();
        Map<String, String> prev = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(dist::get));

        for (String node : graph.getKeySet()) {
            dist.put(node, Integer.MAX_VALUE);
            prev.put(node, null);
        }
        dist.put(startVertex, 0);
        pq.add(startVertex);

        while (!pq.isEmpty()) {
            String current = pq.poll();
            for (Edge edge : graph.getAdjList().get(current)) {
                int newDist = dist.get(current) + edge.weight();
                if (newDist < dist.get(edge.destination())) {
                    dist.put(edge.destination(), newDist);
                    prev.put(edge.destination(), current);
                    pq.add(edge.destination());
                }
            }
        }

        return dist;
    }


    public static void printDijkstraResult(Map<String, Integer> dist) {
        for (String node : dist.keySet()) {
            System.out.println("Distance from start to " + node + " is " + dist.get(node));
        }
    }
}
