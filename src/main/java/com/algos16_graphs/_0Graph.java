package com.algos16_graphs;

import java.util.*;

public class _0Graph {
    public int V;
    public LinkedList<Integer> adj[];
    _0Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    public static _0Graph getGraph(){
        _0Graph g = new _0Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        return g;
    }
    public static Map<Integer, List<Integer>> getGraphAsMap() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>()); // no outgoing edges
        return graph;
    }
}