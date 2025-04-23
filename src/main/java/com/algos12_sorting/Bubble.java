package com.algos12_sorting;

public class Bubble {
    static void sort(int[] a){
        int count =0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        System.out.println(count);
    }
    public static void main(String args[]){
        System.out.println("Bubble sort program");
       int[] a ={5,4,3,2,1};
     //   int[] a ={1,2,3,4,5};
        for(int i:a) System.out.println(i);
        sort(a);
        System.out.println("After sorting");
        for(int i:a) System.out.println(i);
    }
}
