package com.algos1_arrays;

public class DifferenceBetweenLargest {
    public static void main(String[] args) {
      int[] a= {3,4,10,21,2};
//        int[] a = {3, 1};
        System.out.println(findDifference(a));
    }

    private static int findDifference(int[] a) {
        int largest = a[0], index = 0;
        for (int i = 1; i < a.length; i++)
            if (largest < a[i]) {
                largest = a[i];
                index = i;
            }
        int difference = 0;
        for (int i = 0; i <= index; i++) {
            if (difference < largest - a[i]) difference = largest - a[i];
        }
        return difference;
    }

    private static int findDifferenceGFG(int[] a) {
        int max_difference = a[1] - a[0];
        int min_element = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]-min_element>max_difference)max_difference=a[i]-min_element;
            if(a[i]<min_element)min_element = a[i];
        }
        return max_difference;
    }
}
