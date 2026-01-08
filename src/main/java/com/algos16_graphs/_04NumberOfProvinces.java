package com.algos16_graphs;

public class _04NumberOfProvinces {
    public static void main(String[] args) {
        System.out.println(getNumberOfProvinces(_0Graph.getGraphAsMatrix()));
    }
    private static int getNumberOfProvinces(int[][] graph) {
        int count=0;
        for (int i = 0; i < graph.length; i++)
            if (graph[i][i] != 0) {
                dfs(graph, i);
                count++;
            }
        return count;
    }
    static void dfs(int[][] graph, int i) {
        graph[i][i] = 0;
        for (int j = 0; j < graph[i].length; j++)
            if (graph[j][j] != 0 && graph[i][j] == 1)
                dfs(graph, j);
    }
}