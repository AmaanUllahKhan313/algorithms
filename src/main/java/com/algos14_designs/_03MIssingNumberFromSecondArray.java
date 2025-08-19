package com.algos14_designs;

public class _03MIssingNumberFromSecondArray {
    public static void main(String[] args) {
        System.out.println(getMissingNumberFromSecondArray(new int []{4, 8, 1, 3, 7}, new int[]{7, 4, 3, 1}));
    }

    private static int getMissingNumberFromSecondArray(int[] ints, int[] ints1) {
        int missingNumber = 0;
        for (int i = 0; i < ints.length; i++) {
            missingNumber=missingNumber^ints[i];
        }
        for (int i = 0; i < ints1.length; i++) {
            missingNumber=missingNumber^ints1[i];
        }
        return missingNumber;
    }
}
