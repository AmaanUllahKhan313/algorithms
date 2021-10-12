package com.algos.graph;

import java.util.Iterator;
import java.util.LinkedList;

class BFS {

    public static void main(String args[]) {
        Graph g = Graph.getGraph();
        System.out.println("BFS : ");
        BFS(2,new boolean[g.V],g);
    }
    static void BFS(int s, boolean[] visited,Graph g) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = g.adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}