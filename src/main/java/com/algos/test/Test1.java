package com.algos.test;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().maxConsecutiveOnes(222));
    }
    int maxConsecutiveOnes(int N)
    {
        System.out.println(Integer.toBinaryString(N));
        char [] arr =Integer.toBinaryString(N).toCharArray();
        int maxSofar=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == '1'){
                max+=1;
                if(maxSofar<max)
                    maxSofar=max;
            } else {
                 max=0;

            }
        }
        // code here
        return maxSofar;
    }



 

}
