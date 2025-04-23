package com.algos1_arrays;

import java.util.Arrays;

public class MaxOfJMinusI {
    public static void main(String[] args) {
        int[] a = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = a.length;
        int []maxFromEnd = new int[n + 1];
        Arrays.fill(maxFromEnd, Integer.MIN_VALUE);
        // Create an array maxfromEnd
        for (int i = a.length - 1; i >= 0; i--)
        {
            maxFromEnd[i] = Math.max(maxFromEnd[i + 1],
                    a[i]);
        }
        int result = 0;

        for (int i = 0; i < a.length; i++)
        {
            int low = i + 1, high = a.length - 1,
                    ans = i;

            while (low <= high)
            {
                int mid = (low + high) / 2;

                if (a[i] <= maxFromEnd[mid])
                {
                    // We store this as current
                    // answer and look for further
                    // larger number to the right side
                    ans = Math.max(ans, mid);
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }

            // Keeping a track of the
            // maximum difference in indices
            result = Math.max(result, ans - i);
        }
        System.out.print(result + "\n");
        return;
    }

}
