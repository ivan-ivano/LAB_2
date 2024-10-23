package Task1;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final String name;
    private final int value;
    private final List<Vertex> neighbors;

    public Vertex(String name, int value) {
        this.name = name;
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Vertex neighbor) {
        neighbors.add(neighbor);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }
}