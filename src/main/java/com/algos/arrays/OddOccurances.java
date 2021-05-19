package com.algos.arrays;

public class OddOccurances {
    public static void main(String[] args) {
        int[] a = {5, 7, 2, 5};
        System.out.println("Odd occurrence :"+oddOccurrence(a));
    }

    private static int oddOccurrence(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = res ^ a[i];
        }
        return res;
    }
}
