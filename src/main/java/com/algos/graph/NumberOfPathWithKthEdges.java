package com.algos.graph;

public class NumberOfPathWithKthEdges {
    public static void main(String[] args) {
        int graph[][] = new int[][] {
                { 0, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 0 }
        };

        System.out.println("All paths from 0 to 3 is :" + countAllPaths(graph,0,3));
        System.out.println("All paths from 0 to 3 with exactly two edges is : "+countAllPathsWithKEdges(graph,0,3,2));

    }

    private static int countAllPathsWithKEdges(int[][] graph, int src, int dest, int edges) {
        if (edges==0 && src==dest)
            return 1;
        if (edges==1 && graph[src][dest]==1)
            return 1;
        if (edges<=0)
            return 0;
        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            if (graph[src][i]==1)
                count+=countAllPathsWithKEdges(graph,i,dest,edges-1);
        }
        return count;
    }
    private static int countAllPaths(int[][] graph, int src, int dest) {
        if (src==dest)
            return 1;
        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            if(graph[src][i]==1)
                count+=countAllPaths(graph,i,dest);
        }
        return count;
    }
}
