package com.algos01_arrays;

public class LowerSumEqualsHigherSum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,1,4,5};
        int partition = getPartitionElement(a);
        System.out.println("Elements:");
        for(int element:a) System.out.print(element+"\t");
        System.out.println("Partition element:"+a[partition]);
    }

    private static int getPartitionElement(int[] a) {
        int[] prefixSum = new int[a.length], suffixSum = new int[a.length];
        int lSum = a[0],rSum = a[a.length-1];
        prefixSum[0] = lSum;
        suffixSum[a.length-1] = rSum;
        for (int i=1; i < a.length; i++) {
            lSum+=a[i];
            prefixSum[i]=lSum;
        }
        for (int i = a.length - 2; i >= 0; i--) {
            rSum+=a[i];
            suffixSum[i]=rSum;
        }
        for (int i = 0; i < a.length; i++) {
            if(prefixSum[i]==suffixSum[i])return i;
        }
        return -1;
    }
}
