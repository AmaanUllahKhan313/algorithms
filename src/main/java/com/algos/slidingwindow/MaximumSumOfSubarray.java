package com.algos.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumOfSubarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int window = 3;
        printMaximumSubArraySum(a,window);
    }

    private static void printMaximumSubArraySum(int[] a, int window) {
        int start = 0,end =0 ;
        int sum =0;
        List<Integer> list = new ArrayList<>();
            while(end!=window){
                sum+=a[end];
                end++;
            }
            list.add(sum);
        while(end<a.length-1){
            sum-=a[start++];
            sum+=a[end++];
            list.add(sum);
        }
        System.out.println(list);
        }
}
