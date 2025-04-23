package com.algos1_arrays;

public class Segregate01 {
    public static void main(String[] args) {
        int[] a = {0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,0};
//        int[] a = {0,0,0};
        for (int element : a) System.out.print(element);
        System.out.println("\nAfter segregation:\n");
//        segregateArray(a);
        segregate0and1GFG(a);
        for (int element : a) System.out.print(element);
    }

    private static void segregateArray(int[] a) {
        int j = 0;
        for (j = 0; j < a.length && a[j] != 1; j++) ;
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }
    static void segregate0and1GFG(int arr[]) {
        int type0 = 0;
        int type1 = arr.length - 1;

        while (type0 < type1) {
            if (arr[type0] == 1) {
                // swap
                arr[type1] = arr[type1]+ arr[type0];
                arr[type0] = arr[type1]-arr[type0];
                arr[type1] = arr[type1]-arr[type0];
                type1--;
            } else {
                type0++;
            }
        }

    }
}
