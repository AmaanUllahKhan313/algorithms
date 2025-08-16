package com.algos13_heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class _4FindMedianOfArray {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    private boolean even;
    public _4FindMedianOfArray() {
        this.maxHeap = new PriorityQueue<>();
        this.minHeap = new PriorityQueue<>(Collections.reverseOrder());
        even = true;
    }
    private double getMedian(){
        if (even)
            return (maxHeap.peek()+minHeap.peek())/2.0;
        else return minHeap.peek();
    }
    private void add(int num){
        if (even){
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        even=!even;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,4,5,6,7,8};
        _4FindMedianOfArray median = new _4FindMedianOfArray();
        for (int num:nums) {
            median.add(num);
        }
        System.out.println(median.getMedian());
    }
}
