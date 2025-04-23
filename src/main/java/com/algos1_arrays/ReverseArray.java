package com.algos1_arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int element : a) System.out.print(element + "\t");
        reverseArray(a);
        System.out.println("after reverse:");
        for (int element : a) System.out.print(element + "\t");
    }

    private static void reverseArray(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length -1 - i] =temp;
        }
    }
}
