package com.algos1_arrays;

import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3, 4, 5, 6};
        createWaveArray(arr);
        Arrays.stream(arr).forEach((value) -> System.out.print(" " + value));
    }

    private static void createWaveArray(int[] ints) {
        for (int i = 0; i < ints.length; i+=2) {
            if(i>0 && ints[i] < ints[i-1]){
                swap(ints,i,i-1);
            }
            if(i<ints.length-1 && ints[i] < ints[i+1]){
                swap(ints,i,i+1);
            }
        }
    }

    private static void swap(int[] ints, int i, int i1) {
        int temp = ints[i];
        ints[i] = ints[i1];
        ints[i1] = temp;
    }
}
