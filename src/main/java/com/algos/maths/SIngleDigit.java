package com.algos.maths;

public class SIngleDigit {
    public static void main(String[] args) {
        System.out.println(getSingleDigit(256));
    }

    private static int getSingleDigit(int i) {
        if(i<10)
            return i;
        int sum=0;
        while (i>0){
            sum+=i%10;
            i=i/10;
        }
        return getSingleDigit(sum);
    }

}
