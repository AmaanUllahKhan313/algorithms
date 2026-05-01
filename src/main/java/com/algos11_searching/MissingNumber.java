package com.algos11_searching;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int [] {1,2,5,8,11},5));
    }
    public static int findKthPositive(int[] A, int k) {
        int left = 0, right = A.length, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (A[mid] - 1 - mid < k)
                left = mid + 1;
            else
                right = mid;
        }
        return left + k;
    }
}
