package com.algos13_heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class _5MinCostOfRopes {
    public static void main(String[] args) {
        int arr []={4,3,2,6};
        System.out.println(getMinCostForRopes(arr));
    }

    private static int getMinCostForRopes(int[] arr) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
        queue.add(arr[i]);
        }
        int sum = 0;
        while (queue.size()>1){
            int first = queue.poll();
            int second = queue.poll();
            sum += first+second;
            queue.add(first+second);
        }
        return sum;
    }
}
