package com.algos12_sorting;

public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int [] {2,1,1,3,4,5}));
    }
    public static int heightChecker(int[] arr) {
        int n = arr.length;
        int[] expected = arr.clone();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (expected[j] < expected[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = expected[minIdx];
            expected[minIdx] = expected[i];
            expected[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expected[i])
                count++;
        }
        return count;
    }

}