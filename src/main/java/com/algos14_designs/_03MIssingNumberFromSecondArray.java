package com.algos14_designs;

public class _03MIssingNumberFromSecondArray {
    public static void main(String[] args) {
        System.out.println(getMissingNumberFromSecondArray(new
                int []{4, 8, 1, 3, 7}, new int[]{7, 4, 3, 1}));
    }

    private static int getMissingNumberFromSecondArray(int[] firstArray, int[] secondArray) {
        int missingNumber = 0;
        for (int i = 0; i < firstArray.length; i++) {
            missingNumber=missingNumber^firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            missingNumber=missingNumber^secondArray[i];
        }
        return missingNumber;
    }
}
