package com.algos01_arrays;

public class TwoRepeatingElements {
    public static void main(String[] args) {
        int[] a = {4, 2, 4, 5, 2, 3, 1};
        for(int element:a) System.out.print(element+"\t");
        int[] repeatingElements= get2RepeatingElements(a);
        System.out.println("\nRepeating elements");
        for(int element:repeatingElements) System.out.print(element+"\t");
//        for(int element:a) System.out.print(element+"\t");
    }

    private static int[] get2RepeatingElements(int[] a) {
        int ptr = 1;
        int n=a.length;
        int[] returningList = new int[2];
        int index=0;
        while (ptr < n) {
            if(a[ptr-1]<=0)ptr++;
            else{
                if (a[a[ptr - 1] - 1] <= 0) {
                    a[a[ptr-1]-1] -= 1;
                    if(a[a[ptr-1]-1] == -2){
                        returningList[index]=a[ptr-1];
                        index++;
                    }
                    a[ptr-1]=0;
                }else{
                    int temp = a[a[ptr-1]-1];
                    a[a[ptr-1]-1] = -1;
                    a[ptr-1] = temp;
                }
            }
        }
        return returningList;
    }

}
