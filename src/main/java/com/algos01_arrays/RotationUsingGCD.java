package com.algos01_arrays;

public class RotationUsingGCD {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int rotationBy = 3;
        for (int element : a) System.out.print(element + "\t");
        rotateArray(a, rotationBy);
        System.out.println("After rotation:");
        for (int element : a) System.out.print(element + "\t");
    }

    private static void rotateArray(int[] a, int d) {
        int gcd = GCD(a.length, d);
        for (int i = 0; i < gcd; i++) {
            int temp = a[i];
            int j = i;
            while (true) {
                int k = j + d;
                if (k >= a.length) k -= a.length;
                if (k == i) break;
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
    }

    private static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}
