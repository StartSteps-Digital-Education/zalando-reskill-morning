package org.startsteps.week9.day02.graph.exercises;


import java.util.*;

class Exercise1 {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);

        System.out.println("Neighbors of vertex 1: " + graph.getNeighbors(1));
        System.out.println("Neighbors of vertex 2: " + graph.getNeighbors(2));
        System.out.println("Neighbors of vertex 3: " + graph.getNeighbors(3));
    }
}

class Graph {
    // Map to store adjacency list representation of graph
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjacencyList.putIfAbsent(v, new ArrayList<>());
    }

    // Method to add an edge between two vertices in the graph
    public void addEdge(int v1, int v2) {
        // Adding the edge for an undirected graph
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
    }

    // Method to get the neighbors of a vertex
    public List<Integer> getNeighbors(int v) {
        return adjacencyList.getOrDefault(v, new LinkedList<>());
    }

    // Depth-First Search (DFS) method
    public void dfs(int v, Set<Integer> visited) {
        // Mark the current node as visited
        visited.add(v);
        // Print the current node
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : getNeighbors(v)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    // Breadth-First Search (BFS) method
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int neighbor : getNeighbors(v)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

}


// Break until 11:50