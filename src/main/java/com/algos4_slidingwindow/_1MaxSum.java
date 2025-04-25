package com.algos4_slidingwindow;

import java.util.*;

public class _1MaxSum {

    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {1,3,-1,-3,5,3,6,7},3));
    }
    static int maxSum(int arr[], int k){
        //kadanes algo
        int max = 0;int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=i<k?arr[i]:arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }

    static int [] maxElementInWindow(int arr[], int k){
            int n = arr.length, j = 0;
            int[] ans = new int[n - k + 1];
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            for (int i = 0; i < n; i++) {
                maxHeap.add(new int[]{arr[i], i});
                if (i + 1 >= k) {
                    ans[j++] = maxHeap.peek()[0];
                }
                while (maxHeap.size() > 0 && i - maxHeap.peek()[1] + 1 >= k) { // discard max elements of heap that out of range k
                    maxHeap.poll();
                }
            }
            return ans;
    }
}
