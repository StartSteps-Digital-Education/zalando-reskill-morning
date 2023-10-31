package org.startsteps.week9.day02.graph.exercises;

import java.util.HashSet;
import java.util.Set;

class Exercise2Graph {


    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(3);
        graph.addVertex(2);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 6);
        graph.addEdge(6, 5);

        System.out.println("DFS starting from vertex 1:");
        graph.dfs(1, new HashSet<>());
//        System.out.println("\nBFS starting from vertex 1:");
//        graph.bfs(1);
    }
}