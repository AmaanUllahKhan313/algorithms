package com.algos.sorting;

import java.util.stream.IntStream;

public class InsertionSort {
    public static void main(String args[]){
        int [] ints = new int []{ 12, 11, 13, 5, 6 };
        insertionSort(ints);
        IntStream.of(ints).forEach(System.out::println);
    }

    private static void insertionSort(int[] ints) {
        int j;
        for (int i = 1; i < ints.length; i++) {
            int temp = ints[i];
            j=i-1;
            while (j>=0 && temp<=ints[j]){
                ints[j+1]=ints[j];
                j--;
            }
            ints[j+1] = temp;
        }
    }
}
