package com.algos.graph;

import java.util.Iterator;


class IsCyclic {
    public static void main(String args[]) {
        Graph g = Graph.getGraph();
        System.out.print("is Cyclic : ");
        System.out.print(isCyclic(0,new boolean[g.V],g));
    }

    static boolean isCyclic(int v, boolean visited[],Graph g){
        if(visited[v])
            return true;
        visited[v] = true;
        Iterator<Integer> i = g.adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (visited[n] || isCyclic(n,visited,g))
                return true;
        }
        return false;
    }
}