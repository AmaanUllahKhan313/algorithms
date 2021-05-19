package com.algos.arrays;

public class Rotate {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5000000};
        if(a.length > 100000) return;
        System.out.println("Before rotation");
        for (int n:a) {
            System.out.print(n+"\t");
            if(n>1000000)return;
        }

        a = leftRotate(a,10);
        if(a == null)return;
        System.out.println("After rotation ");
        for (int n:a) {
            System.out.print(n+"\t");
        }
    }

    private static int[] leftRotate(int[] a, int r) {
        if(r>a.length)return null;
        for(int i=0;i<r;i++){
            int temp = a[0];
            for(int j=0;j<a.length-1;j++)a[j] = a[j+1];
            a[a.length-1] = temp;
        }
        return a;
    }
}
