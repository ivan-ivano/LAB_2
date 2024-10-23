package Task1;

public class Task1 {
    public static void main(String[] args) {
        Graph graph = new Graph(false);

        graph.addVertex("A", 1);
        graph.addVertex("B", 2);
        graph.addVertex("C", 3);

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");

        System.out.println("Directed graph:");
        graph.printGraph();
        Graph graph2 = new Graph(true);

        graph2.addVertex("A", 1);
        graph2.addVertex("B", 2);
        graph2.addVertex("C", 3);

        graph2.addEdge("A", "B");
        graph2.addEdge("B", "C");

        System.out.println("Undirected graph:");
        graph2.printGraph();
    }
}
