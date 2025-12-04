package com.algos16_graphs;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _03PathExist {
    static boolean found = false;
    static void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int start, int end) {
        if (visited[start] || found) return;
        visited[start] = true;
        for (int nei : graph.get(start)) {
            if (nei == end) {
                found = true;
                break;
            }
            if (!visited[nei])
                dfs(graph, visited, nei, end);
        }
    }
}
