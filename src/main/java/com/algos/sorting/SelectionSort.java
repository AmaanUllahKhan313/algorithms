package com.algos.sorting;

public class SelectionSort {
    public static void main(String args[]){
        System.out.println("Bubble sort program");
        int[] a ={5,4,3,2,1};
        //   int[] a ={1,2,3,4,5};
        for(int i:a) System.out.println(i);
        sort(a);
        System.out.println("After sorting");
        for(int i:a) System.out.println(i);
    }
    public static void sort(int[] a) {
        for(int i = 0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]>a[j]){
                    int swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        }
    }
}
