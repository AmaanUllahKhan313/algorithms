package com.algos16_graphs;

import java.util.Iterator;
import java.util.Stack;

public class _05TopologicalSort {
    public static void main(String[] args) {
        _0Graph g = _0Graph.getGraph();
        System.out.println("Topological Sort : ");
        topoSort(new boolean[g.V],g);
    }
    private static void topoSort(boolean[] visited, _0Graph graph) {
        Stack stack = new Stack();
        for (int i = 0; i < graph.V; i++) {
            if(!visited[i])
                dfs(i,visited,stack,graph);
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
    private static void dfs(int i, boolean[] visited, Stack stack, _0Graph g) {
        visited[i]=true;
        Iterator<Integer> iterator = g.adj[i].iterator();
        while (iterator.hasNext()){
            Integer j = iterator.next();
            if(!visited[j])
                dfs(j,visited,stack,g);
        }
        stack.push(i);
    }
}
