package com.algos.arrays;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int sum = 9;
        int[] a = {12, 3, 4, 1, 7, 9};
        int sum = 23;

        if (get3Sum(a, sum)) {
            System.out.println("TRIPLET FOUND!");
        } else {
            System.out.println("TRIPLET NOT FOUND");
        }
    }
    private static boolean get3Sum(int[] a, int sum) {
        Arrays.sort(a);
        for (int first = 0; first < a.length ; first++) {
            int second=1,last=a.length-1;
            if (sum==a[first]+a[second]+a[last])
                return true;
            else
            if (sum>a[first]+a[second]+a[last])
                second++;
            else
            if (sum<a[first]+a[second]+a[last])
                last--;
            if(second==last){
                first++;
                second=first+1;
                last=a.length-1;
            }
        }
        return false;
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
