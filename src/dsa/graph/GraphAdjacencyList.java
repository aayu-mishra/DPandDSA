package dsa.graph;

import java.util.ArrayList;

public class GraphAdjacencyList {

    static class Edge {
         private int source;
         private int destination;

         public Edge(int source,int destination){
             this.source=source;
             this.destination=destination;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[] ){
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }
            graph[0].add(new Edge(0,1));
            graph[0].add(new Edge(0,2));
            graph[1].add(new Edge(1,3));
            graph[1].add(new Edge(1,4));
            graph[2].add(new Edge(2,6));
            graph[4].add(new Edge(4,5));

    }

    public static void printGraph(){

    }

    public static void main(String[] args) {
        int vertices=6;
        ArrayList<Edge> graph[]= new ArrayList[vertices];
        createGraph(graph);

        for (int i=0;i<graph[0].size();i++){
            Edge e = graph[6].get(i);
            System.out.print(e.destination+ " ");
        }
    }

}
