package com.algos16_graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KruskalMST {
    public static void main(String[] args) {
       /* int graph[][] ={ { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };*/
       //graph
        ArrayList graph = new ArrayList<ArrayList<ArrayList>>();
            //node 0
            ArrayList node = new ArrayList<ArrayList>();
                //edge 0 to 1
                ArrayList edge = new ArrayList<Integer>();
                edge.add(0); // src
                edge.add(1);// dst
                edge.add(10);// weight
                node.add(edge);
                // edge 0 to 2
                edge = new ArrayList<>();
                edge.add(0); // src
                edge.add(2);// dst
                edge.add(6);// weight
                node.add(edge);
        graph.add(node);
            //node 1
            node = new ArrayList<ArrayList>();
                // edge 1 to 2
                edge = new ArrayList<>();
                edge.add(1); // src
                edge.add(2);// dst
                edge.add(5);// weight
                node.add(edge);
                // edge 1 to 0
          /*      edge = new ArrayList<>();
                edge.add(1); // src
                edge.add(0);// dst
                edge.add(10);// weight
                node.add(edge);*/
        graph.add(node);
            // node 2
            node = new ArrayList<ArrayList>();
                // edge 2 to 1
             /*   edge = new ArrayList<>();
                edge.add(2); // src
                edge.add(1);// dst
                edge.add(5);// weight
                node.add(edge);
            // edge 2 to 0
                edge = new ArrayList<>();
                edge.add(2); // src
                edge.add(0);// dst
                edge.add(6);// weight
                node.add(edge);*/
        graph.add(node);
        System.out.println(getMinCostUsingKruskalMST(graph,3));
    }
    static int [] parent;
    private static int getMinCostUsingKruskalMST(ArrayList<ArrayList<ArrayList<Integer>>>graph, int v) {
        int cost = 0;
        parent= new int[v] ;
        int edgeCount = 0;
        //Sort all the edges in non-decreasing order of their weight.
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a, b)->a[2]-b[2]);
        for(int i=0;i<v;i++){
            for(ArrayList<Integer> edge:graph.get(i))
                minHeap.add(new int[]{i,edge.get(0),edge.get(1)});
        }
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }
        // Pick the smallest edge. Check if it forms a cycle with the spanning tree formed so far.
        // Repeat step until there are (V-1) edges in the spanning tree.
        while(edgeCount<v-1){
            int[] edge=minHeap.poll();
            // If cycle is not formed, include this edge. Else, discard it.
            if(find(edge[0])!=find(edge[1])){
                union(edge[0],edge[1]);
                edgeCount++;
                cost+=edge[2];
            }
        }
        return cost;
    }
    static public int find(int i){
        while(parent[i]!=i){
            i=parent[i];
        }
        return i;
    }
    static public void union(int a, int b){
        int x=find(a);
        int y=find(b);
        parent[x]=parent[y];
    }
}
