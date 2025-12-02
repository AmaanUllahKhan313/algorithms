package com.algos16_graphs;

public class isCyclicUndirected {
    public static void main(String[] args) {
        _0Graph graph = _0Graph.getGraph();
        boolean [] visited = new boolean[graph.V];
        System.out.println("IsCyclic: "+ isCyclicUndirected(0,-1,visited,graph));
    }

    private static boolean isCyclicUndirected(int node, int parent, boolean[] visited, _0Graph graph) {
        if(visited[node])
            return false;
        visited[node]=true;
        for (Integer nextNode:
                graph.adj[node]) {
            if (visited[nextNode] && parent!=nextNode ||  isCyclicUndirected(nextNode,node,visited,graph)){
                return true;
            }
        }
        return false;
    }
}
