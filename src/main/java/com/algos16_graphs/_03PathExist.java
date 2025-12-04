package com.algos16_graphs;

import java.util.*;

public class _03PathExist {
    public static void main(String[] args) {
        // Create graph
        Map<Integer, List<Integer>> graph = _0Graph.getGraphAsMap();
        int start = 0;
        int end = 3;
        boolean[] visited = new boolean[graph.size()];
        dfs(graph, visited, start, end);
        if (found)
            System.out.println("Path exists between " + start + " and " + end);
        else
            System.out.println("No path exists between " + start + " and " + end);
    }



    static boolean found = false;
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
