package com.algos01_arrays;

public class RepeatingElement {
    public static void main(String[] args) {
     int[] a={1,2,4,3,6,1,5};
     for (int element:a) System.out.print(element+"\t");
        printRepeatingElements(a);
    }

    private static void printRepeatingElements(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index=Math.abs(a[i]);
            if(a[index]>=0)a[index] = -a[index];
            else {
                System.out.println("\nelement:"+Math.abs(index));
            }
        }
    }
}
