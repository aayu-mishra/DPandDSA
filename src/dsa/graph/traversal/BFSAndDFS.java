package dsa.graph.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSAndDFS {

    static class Edge {
        private int source;
        private int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 6));
        graph[4].add(new Edge(4, 5));

    }

    public static void bfs(ArrayList<Edge>[] graph, boolean[] vis, int start){
        
    }



    public static void main(String[] args) {
        int vertices = 7;
        boolean vis[] = new boolean[vertices];
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        bfs(graph,vis,0);
        //dfs(graph,vis,0);
    }

}
