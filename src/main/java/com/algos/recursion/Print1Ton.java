package com.algos.recursion;

public class Print1Ton {
    public static void main(String[] args) {
        print1Ton(7);
        System.out.println();
        printNto1(7);
    }

    private static void printNto1(int n) {
        if(n==0)return ;
        System.out.print(n+"\t");
        printNto1(n-1);
        return ;
    }

    private static void print1Ton(int n) {
        if(n==0)return ;
        print1Ton(n-1);
        System.out.print(n+"\t");
        return ;
    }
}
