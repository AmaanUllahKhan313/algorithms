package com.algos.graph;

import java.util.Iterator;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] M = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        int count=0;
        for (int i = 0; i < M.length; i++)
            if (M[i][i] != 0) {
                dfs(M, i);
                count++;
            }
        System.out.println(count);
    }

    static void dfs(int[][] M, int u) {
        M[u][u] = 0;
        for (int v = 0; v < M[u].length; v++)
            if (M[v][v] != 0 && M[u][v] == 1)
                dfs(M, v);
    }
}