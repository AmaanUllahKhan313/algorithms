package com.algos.graph;

import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {
        Graph g = Graph.getGraph();
        System.out.println("Topological Sort : ");
        topoSort(new boolean[g.V],g);
    }
    private static void topoSort(boolean[] visited, Graph g) {
        Stack stack = new Stack();
        for (int i = 0; i < g.V; i++) {
            if(!visited[i])
                util(i,visited,stack,g);
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
    private static void util(int i, boolean[] visited, Stack stack,Graph g) {
        visited[i]=true;
        Iterator<Integer> iterator = g.adj[i].iterator();
        while (iterator.hasNext()){
            Integer j = iterator.next();
            if(!visited[j])
                util(j,visited,stack,g);
        }
        stack.push(i);
    }
}
