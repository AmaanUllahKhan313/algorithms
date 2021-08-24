package com.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class FibboncaiUsingRecursion {
 List series = new ArrayList<Integer>();
    static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main (String args[])
    {
        int n = 10;
      //  System.out.println(fib(n));
        int f [] = new int [n+2];
        f[0]=1;
        f[1]=1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1]+f[i-2];
            System.out.println(f[i]);
        }


    }
    }
