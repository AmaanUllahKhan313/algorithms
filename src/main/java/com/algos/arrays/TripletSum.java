package com.algos.arrays;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int sum = 9;
        int[] a = {12, 3, 4, 1, 6, 9};
        int sum = 24;

        if (isTripletSumFound(a, sum)) {
            System.out.println("TRIPLET FOUND!");
        } else {
            System.out.println("TRIPLET NOT FOUND");
        }
    }
    private void hashMapImplementation(){
        //TODO - hashmap implementation for triplets sum
    }
    private static boolean isTripletSumFound(int[] a, int sum) {
        Arrays.sort(a);
        int cachedSum = sum, tripletCount = 3;
        for (int i = a.length - 1; i >= 0; i--) {
            if (cachedSum - a[i] > 0 || (cachedSum - a[i] == 0 && tripletCount - 1 == 0)) {
                tripletCount--;
                cachedSum -= a[i];
                System.out.println(a[i]);

            }
            if (tripletCount == 0) {
                return true;
            }
        }
        return false;
    }
}
