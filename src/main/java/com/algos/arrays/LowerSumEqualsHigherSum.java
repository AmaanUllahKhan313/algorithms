package com.algos.arrays;

public class LowerSumEqualsHigherSum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,1,4,5};
        int partition = findElementGFG(a,a.length);
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
    //TODO not working
    static int findElementGFG(int arr[], int size)
    {
        int right_sum = 0, left_sum = 0;
        // Maintains left cumulative sum
        left_sum = 0;

        // Maintains right cumulative sum
        right_sum=0;
        int i = -1, j = -1;

        for( i = 0, j = size-1 ; i < j ; i++, j-- ){
            left_sum += arr[i];
            right_sum += arr[j];

            // Keep moving i towards center until
            // left_sum is found lesser than right_sum
            while(left_sum < right_sum && i < j){
                i++;
                left_sum += arr[i];
            }
            // Keep moving j towards center until
            // right_sum is found lesser than left_sum
            while(right_sum < left_sum && i < j){
                j--;
                right_sum += arr[j];
            }
        }
        if(left_sum == right_sum && i == j)
            return arr[i];
        else
            return -1;
    }
}
