package com.algos12_sorting;

import java.util.stream.IntStream;

public class _03InsertionSort {
    public static void main(String args[]){
        int [] ints = new int []{ 12, 11, 13, 5, 6 };
        insertionSort(ints);
        IntStream.of(ints).forEach(System.out::println);
    }

    private static void insertionSort(int[] ints) {
        int j;
        for (int i = 1; i < ints.length; i++) {
            int key = ints[i];
            j=i-1;
             /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && key<=ints[j]){
                ints[j+1]=ints[j];
                j--;
            }
            ints[j+1] = key;
        }
    }
}
