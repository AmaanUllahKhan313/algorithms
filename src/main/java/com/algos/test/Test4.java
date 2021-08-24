package com.algos.test;

import com.sun.source.tree.WhileLoopTree;

public class Test4 {

    public static void main(String[] args) {
        System.out.println(largestNumber(5,12));
    }
    static String largestNumber(int n, int sum)
    {
        String temp="";
        int orig=sum;
        int origN=n;
        int sumOfDigit=0;
        while (n!=0 ||sum !=0){
            if(sum>=9){
                temp+=9;
                sum=sum-9;
                sumOfDigit+=9;
            } else {
                temp+=sum;
                sumOfDigit+=sum;
                sum=0;
            }
            n--;
        }
        return sumOfDigit==orig?temp+"0".repeat(origN-temp.length()):"-1";
    }
}
