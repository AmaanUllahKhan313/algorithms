package com.algos.arrays;

public class BinaryGap {
    public static void main(String[] args) {
        int n=147;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int finalGap = 0;
        //1 is  0
        if (n == 1) {
            return 0;
        }
        //use the shortest way to convert to a binary representation
        char binaryRep[] = Integer.toBinaryString(n).toCharArray();
        int tempGap=0;
        //the binary representation must start with 1 we continue counting the 0 while
        // we found a new one, and then return the longest binary gap
        // the binary numbers ending on 0 cant be counted because it should be 1 0000..1
        // to be a valid gap
        for (int x = 0; x < binaryRep.length; x++) {
            if(binaryRep[x]=='0'){
                tempGap++;
                continue;
            }else if(binaryRep[x]=='1'){
                if(tempGap>finalGap)
                    finalGap=tempGap;
                tempGap=0;
            }

        }
        return finalGap;
    }
}