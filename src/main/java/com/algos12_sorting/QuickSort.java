package com.algos12_sorting;

import java.util.stream.IntStream;

public class QuickSort {
    public static void main(String args[]){
        IntStream.of(quickSort(new int []{ 12, 11, 13, 5, 6 },0,4)).forEach(System.out::println);
    }

    private static int [] quickSort(int[] ints, int start, int end) {
        if (start<end){
            int p = partitions(ints,start,end);
            quickSort(ints,start,p-1);
            quickSort(ints,p+1,end);
        }
        return ints;
    }

    private static int partitions(int[] ints, int start, int end) {
        int pivot = ints[end];
        int i = start-1;
        for (int j = start; j < end; j++) {
            if(ints[j]<pivot){
                i++;
                int t = ints[i];
                ints[i] = ints[j];
                ints[j] = t;
            }
        }
        int t = ints[i+1];
        ints[i+1] = ints[end];
        ints[end] = t;
        return i+1;
    }
}
