package com.algos.arrays;

public class RepeatingElement {
    public static void main(String[] args) {
     int[] a={1,2,4,3,2,1,5};
     for (int element:a) System.out.print(element+"\t");
        printRepeatingElements(a);
/*     int[] repeatingElements = getRepeatingElements(a);
        System.out.println("\nRepeating elements:");
        for(int element:repeatingElements) System.out.print(element+"\t");*/
    }

    private static void printRepeatingElements(int[] a) {
        int rIndex=0;
        for (int i = 0; i < a.length; i++) {
            int index=Math.abs(a[i]);
            if(a[index]>=0)a[index] = -a[index];
            else {
                System.out.println("\nelement:"+Math.abs(index));
            }
        }
    }
}
