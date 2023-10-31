package org.startsteps.week9.day02.graph;

import java.util.*;

public class GraphDemo {

    public static void main(String[] args) {
        Graph graph = new Graph(new HashMap<>());
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");

        graph.addEdge("1", "3");

        graph.addEdge("2", "3");

        graph.addEdge("1", "2");

        System.out.println();
    }
}

class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph(HashMap<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

}


class Vertex {
    String label;
    Vertex(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vertex otherVertex = (Vertex) obj;
        return Objects.equals(label, otherVertex.label);
    }
}
