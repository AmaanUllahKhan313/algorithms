package com.algos07_maths;

public class _5Hamming {
    public static void main(String[] args) {
        System.out.println(getHamming(680142203,
                1111953568));
    }
    public static int getHamming(int x, int y){
        int count=0;
        while(x!=0 || y!=0){
            if((x&1)!=(y&1)){
                count++;
            }
            x=x>>>1;
            y=y>>>1;
        }
        return count;
    }
}
