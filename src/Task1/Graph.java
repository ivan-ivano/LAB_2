package Task1;


import java.util.HashMap;
import java.util.Map;

public class Graph {
    private final Map<String, Vertex> vertices;
    private final boolean isDirected;

    public Graph(boolean isDirected) {
        this.vertices = new HashMap<>();
        this.isDirected = isDirected;
    }

    public void addVertex(String name, int value) {
        vertices.put(name, new Vertex(name, value));
    }

    public void addEdge(String from, String to) {
        if (vertices.containsKey(from) && vertices.containsKey(to)) {
            vertices.get(from).addNeighbor(vertices.get(to));
            if (!isDirected) {
                vertices.get(to).addNeighbor(vertices.get(from));
            }
        } else {
            System.out.println("Invalid vertex!");
        }
    }

    public void printGraph() {
        for (Vertex vertex : vertices.values()) {
            System.out.print(vertex.getName() + " (" + vertex.getValue() + "): ");
            for (Vertex neighbor : vertex.getNeighbors()) {
                System.out.print(neighbor.getName() + " ");
            }
            System.out.println();
        }
    }
}
