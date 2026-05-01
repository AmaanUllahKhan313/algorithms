package com.algos13_heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1KthMinNumberUsingHeap {
    public static void main(String[] args) {
        System.out.println(getNthMinNumber(new int [] {100,25,3,14,500,60,7,8,9,110},4));
    }

    private static int getNthMinNumber(int [] arr, int position) {
        Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < position; i++) {
            queue.add(arr[i]);
        }
        for (int i =position; i < arr.length ; i++) {
            if(arr[i] < queue.peek()){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return queue.peek();
    }
}
