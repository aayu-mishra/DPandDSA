package dsa.graph;

public class GraphOperations {
    public static void main(String[] args) {

        GraphAdjacencyMatrix graphAdjacencyMatrix = new GraphAdjacencyMatrix(5);

        graphAdjacencyMatrix.addEdge(1,2,5);
        graphAdjacencyMatrix.addEdge(2,3,7);
        graphAdjacencyMatrix.addEdge(3,4,9);
        graphAdjacencyMatrix.deleteEdge(2,3);

        graphAdjacencyMatrix.printGraph();
    }
}
