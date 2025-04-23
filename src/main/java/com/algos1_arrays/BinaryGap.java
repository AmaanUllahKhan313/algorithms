package com.algos1_arrays;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(147));
    }
    public static int solution(int n) {
        if (n == 1) return 0;
        int finalGap = 0; int tempGap = 0;
        char binaryRep[] = Integer.toBinaryString(n).toCharArray();
        for (int x = 0; x < binaryRep.length; x++) {
            if(binaryRep[x]=='0')
                tempGap++;
            else if(binaryRep[x]=='1'){
                finalGap=Math.max(tempGap,finalGap);
                tempGap=0;
            }
        }
        return finalGap;
    }
}