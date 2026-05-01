package com.algos16_graphs;

import java.util.*;

public class _03PathExist {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = _0Graph.getGraphAsMap();
        int start = 0;
        int end = 3;
        boolean[] visited = new boolean[graph.size()];
        System.out.println("Path exists between " + start + " and " + end + " is " + dfs(graph, visited, start, end) );
    }
    static boolean dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int start, int end) {
        if (visited[start]) return false;
        if (start == end) return true;
        visited[start] = true;
        for (int nei : graph.get(start)) {
            if (!visited[nei]) {
                if (dfs(graph, visited, nei, end)) {
                    return true; // path found
                }
            }
        }
        return false; // no path from this branch
    }
}
