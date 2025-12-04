package com.algos16_graphs;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class _08ShortestPath {
    static class PathAndCost{
        int node;
        int distance;

        public PathAndCost(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
    public static void main(String[] args) {
        int graph[][] = new int[][] {
                { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };
        getShortestPath(graph,0);

    }

    private static void getShortestPath(int[][] graph, int source) {
        //initialize
        int [] previousNode = new int[graph.length+1];
        int [] distance = new int[graph.length];
        Arrays.fill(previousNode,-1);
        Arrays.fill(distance,-1);
        Queue<PathAndCost> minHeap = new PriorityQueue<>((src,dest)->src.distance-dest.distance);
        minHeap.add(new PathAndCost(source,0));
        distance[source] = 0;
        previousNode[source] = source;

        //iterate all nodes one by one
        while (!minHeap.isEmpty()){
            PathAndCost pathAndCost = minHeap.poll();
            int currentNode = pathAndCost.node;
            //find all path from nodes
            for (int i = 0; i < graph.length; i++) {
                //not zero means path present from node
                if(graph[currentNode][i]!=0){
                    //calculate new distance
                    int weight=graph[currentNode][i];
                    int newDistance = distance[currentNode] + weight;
                    //if greater then
                    if (distance[i] == -1 || newDistance < distance[i]) {
                        distance[i] = newDistance;
                        minHeap.add(new PathAndCost(i, distance[i]));
                        previousNode[i] = currentNode;
                    }
                }
            }
        }
        //print result
        System.out.println("From "+source+" to:");
        for (int i=0;i<distance.length;i++)
            System.out.println(i + " is Distance="+distance[i]+" from Node="+ previousNode[i]);
    }
}
