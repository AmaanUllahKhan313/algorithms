package com.algos16_graphs;

import java.util.Iterator;

public class _04NumberOfProvinces {
    public static void main(String[] args) {
        System.out.println(getNumberOfProvinces(_0Graph.getGraphAsMatrix()));
    }
    private static int getNumberOfProvinces(int[][] M) {
        int count=0;
        for (int i = 0; i < M.length; i++)
            if (M[i][i] != 0) {
                dfs(M, i);
                count++;
            }
        return count;
    }
    static void dfs(int[][] M, int u) {
        M[u][u] = 0;
        for (int v = 0; v < M[u].length; v++)
            if (M[v][v] != 0 && M[u][v] == 1)
                dfs(M, v);
    }
}