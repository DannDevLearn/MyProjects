package Grafos.trying;

import java.util.*;

public class GraphTry {

    private final Map<String, LinkedList<EdgeTry>> adjList;

    public GraphTry() {
        adjList = new HashMap<>();
    }

    public void addVertex(String vertex){
        adjList.putIfAbsent(vertex, new LinkedList<>());
    }

    public void addEdge(String from, String to, int weight ){
        if (!adjList.containsKey(from) || !adjList.containsKey(to))
            return;
        adjList.get(from).add(new EdgeTry(to, weight));
    }

    public void printGraph(){
        for (Map.Entry<String, LinkedList<EdgeTry>> n: adjList.entrySet()){
            System.out.printf("%s -> ", n.getKey());
            for ( EdgeTry edg: n.getValue() )
                System.out.printf("%s ", edg);
            System.out.println();
        }
    }

    public Map<String, Integer> dijkstra(String startVertex){
        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<EdgeTry> pq = new PriorityQueue<>();
        Set<String> visited = new HashSet<>();
        int maxValue = Integer.MAX_VALUE;// To simulate infinity

        // Here will put all the distances like infinity
        for (String vtx : adjList.keySet())
            distances.put(vtx, maxValue);

        // Now I will change the value of my vertex will start
        distances.put(startVertex, 0);
        pq.add(new EdgeTry(startVertex, 0));

        while ( !pq.isEmpty() ){
            EdgeTry cur = pq.poll();

            if(visited.contains(cur.getDestination())) continue;
            visited.add(cur.getDestination());

            for (EdgeTry neighbor: adjList.get(cur.getDestination())){
                if (!visited.contains(neighbor.getDestination())){
                    int newDist = distances.get(cur.getDestination()) + neighbor.getWeight();

                    if (newDist < distances.get(neighbor.getDestination())){
                        distances.put(neighbor.getDestination(), newDist);
                        pq.add(new EdgeTry(neighbor.getDestination(), newDist));
                    }
                }
            }

        }

        return distances;
    }

}


