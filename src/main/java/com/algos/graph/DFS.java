package com.algos.graph;

import java.util.Iterator;

class DFS {

    public static void main(String args[]) {
        Graph g = Graph.getGraph();
        boolean[] visited = new boolean[g.V];
        for (int i = 0; i < g.V; i++) {
            if (!visited[i])
                DFS(0, visited, g);
        }
    }

    static void DFS(int v, boolean visited[],Graph g){
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = g.adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFS(n, visited,g);
        }
    }
}