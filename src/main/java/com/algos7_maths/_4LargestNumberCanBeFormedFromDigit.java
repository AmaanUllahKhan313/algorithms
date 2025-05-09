package com.algos7_maths;

public class _4LargestNumberCanBeFormedFromDigit {

    public static void main(String[] args) {
        System.out.println(largestNumber(5,12));
    }
    static String largestNumber(int n, int sum){
        String temp="";
        while (n!=0 ||sum !=0){
            if(sum>=9){
                temp+=9;
                sum-=9;
            } else {
                temp+=sum;
                sum=0;
            }
            n--;
        }
        return temp+"0".repeat(n);
    }
}
