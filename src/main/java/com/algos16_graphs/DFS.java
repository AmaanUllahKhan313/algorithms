package com.algos16_graphs;

import java.util.Iterator;

class DFS {

    public static void main(String args[]) {
        _0Graph g = _0Graph.getGraph();
        boolean[] visited = new boolean[g.V];
        for (int i = 0; i < g.V; i++) {
            if (!visited[i])
                DFS(i, visited, g);
        }
    }

    static void DFS(int v, boolean visited[],_0Graph g){
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