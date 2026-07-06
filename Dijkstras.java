import java.util.*;

    class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public class Dijkstras {

        public static void dijkstra(List<List<Edge>> graph, int source) {
            int V = graph.size();

            int[] distance = new int[V];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[source] = 0;

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            pq.offer(new int[]{source, 0});

            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                int u = current[0];
                int dist = current[1];

                // Skip if this is an outdated entry
                if (dist > distance[u]) {
                    continue;
                }

                for (Edge edge : graph.get(u)) {
                    int v = edge.destination;
                    int weight = edge.weight;

                    if (distance[u] + weight < distance[v]) {
                        distance[v] = distance[u] + weight;
                        pq.offer(new int[]{v, distance[v]});
                    }
                }
            }

            System.out.println("Shortest distances from source " + source + ":");
            for (int i = 0; i < V; i++) {
                System.out.println("Vertex " + i + " : " + distance[i]);
            }
        }

        public static void main(String[] args) {
            int V = 5;

            List<List<Edge>> graph = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                graph.add(new ArrayList<>());
            }

            // Add edges (Undirected Graph)
            graph.get(0).add(new Edge(1, 10));
            graph.get(0).add(new Edge(4, 5));

            graph.get(1).add(new Edge(0, 10));
            graph.get(1).add(new Edge(2, 1));
            graph.get(1).add(new Edge(4, 2));

            graph.get(2).add(new Edge(1, 1));
            graph.get(2).add(new Edge(3, 4));

            graph.get(3).add(new Edge(2, 4));
            graph.get(3).add(new Edge(4, 2));

            graph.get(4).add(new Edge(0, 5));
            graph.get(4).add(new Edge(1, 2));
            graph.get(4).add(new Edge(3, 2));

            dijkstra(graph, 0);
        }
    }

