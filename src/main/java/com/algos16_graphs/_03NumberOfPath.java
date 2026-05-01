package com.algos16_graphs;

public class _03NumberOfPath {
    public static void main(String[] args) {
        int graph[][] = new int[][] {
                { 0, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 0 }
        };
        System.out.println("All paths from 0 to 3 is :" + countAllPaths(graph,0,3));
    }
    private static int countAllPaths(int[][] graph, int src, int dest) {
        if (src==dest) return 1;
        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            if(graph[src][i]==1)
                count+=countAllPaths(graph,i,dest);
        }
        return count;
    }
}
