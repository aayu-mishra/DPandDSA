package dsa.graph;

public class GraphAdjacencyMatrix {

    private int vertices;
    private int[][] adjecencyMatrix;

    public GraphAdjacencyMatrix(int vertices){
        this.vertices=vertices;
        adjecencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source,int destination, int weight){
        adjecencyMatrix[source][destination] = weight;
        adjecencyMatrix[destination][source]= weight;
    }

    public void deleteEdge(int source, int destination){
        adjecencyMatrix[source][destination]= 0;
        adjecencyMatrix[destination][source]=0;
    }

    public void printGraph(){
        System.out.println("Adjecency Matrix");
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(adjecencyMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
