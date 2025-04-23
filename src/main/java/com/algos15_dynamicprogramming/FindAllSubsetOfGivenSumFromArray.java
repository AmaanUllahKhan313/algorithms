package com.algos15_dynamicprogramming;

public class FindAllSubsetOfGivenSumFromArray {
    public static void main(String[] args) {
        int[] a = {6,2,7,8,4,1,3,5};
        int sum = 8;
        int count = getSubsetSumCount(a,sum);
        System.out.println("Number of subset count : "+count);
    }

    private static int getSubsetSumCount(int[] a, int sum) {
        int[][] t = new int[a.length+1][sum+1];
        // If sum is 0, then answer is true
        for (int i = 0; i <= a.length; i++)
            t[i][0] = 1;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            t[0][i] = 0;

        for(int i =1 ;i<=a.length;i++){
            for(int j = 1;j<=sum;j++){
                if(a[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i-1][j-a[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        for(int i =0;i<=a.length;i++){
            for(int j=0;j<=sum;j++){
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }

        return t[a.length][sum];
    }
}
