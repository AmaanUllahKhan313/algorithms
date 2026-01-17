package com.algos16_graphs;

import java.util.*;


public class _09KruskalMST {
    static int find(int p[], int x) {
        if (p[x] != x)
            p[x] = find(p, p[x]);
        return p[x];
    }

    static void union(int p[], int x, int y) {
        p[find(p, x)] = find(p, y);
    }

    public static void main(String[] args) {
        _0Graph.Edge[] edges = _0Graph.graphWithEdgeWeightage();
        System.out.println("Minimum Cost = " + getCost(edges));
    }

    private static int getCost(_0Graph.Edge[] edges) {
        Arrays.sort(edges);
        int parent[] = new int[edges.length-1];
        for (int i = 0; i < edges.length-1; i++) parent[i] = i;
        int cost = 0;
        for (_0Graph.Edge e : edges) {
            if (find(parent, e.u) != find(parent, e.v)) {
                cost += e.w;
                union(parent, e.u, e.v);
            }
        }
        return cost;
    }
}
