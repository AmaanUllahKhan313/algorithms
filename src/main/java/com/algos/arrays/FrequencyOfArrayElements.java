package com.algos.arrays;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] a = {1,2, 3, 2, 4, 5};
        int i = 1;
//        calculateCount(a);
        findCountsGFG(a,a.length);
        for (int element : a) {
            System.out.println(i + " has count:" + Math.abs(element));
            i++;
        }
    }

    private static void calculateCount(int[] a) {
        int i = 1;
        while (i <= a.length) {
            if (a[i - 1] < 0) {
                i++;
                continue;
            } else if (a[i - 1] == i) {
                a[i - 1] = -1;
                i++;
            } else if (a[i - 1] > 0) {
                if (a[a[i - 1] - 1] < 0) {
                    a[a[i - 1] - 1] -= 1;
                    a[i - 1] = 0;
                    i++;
                } else {
                    int temp = a[a[i - 1] - 1];
                    a[a[i - 1] - 1] = -1;
                    a[i - 1] = temp;
                }
            }
        }
    }
   static void findCountsGFG(int arr[], int n)
    {
        // Traverse all array elements
        int i = 0;
        while (i < n)
        {
            // If this element is already processed,
            // then nothing to do
            if (arr[i] <= 0)
            {
                i++;
                continue;
            }

            // Find index corresponding to this element
            // For example, index for 5 is 4
            int elementIndex = arr[i] - 1;

            // If the elementIndex has an element that is not
            // processed yet, then first store that element
            // to arr[i] so that we don't lose anything.
            if (arr[elementIndex] > 0)
            {
                arr[i] = arr[elementIndex];

                // After storing arr[elementIndex], change it
                // to store initial count of 'arr[i]'
                arr[elementIndex] = -1;
            }
            else
            {
                // If this is NOT first occurrence of arr[i],
                // then decrement its count.
                arr[elementIndex]--;

                // And initialize arr[i] as 0 means the element
                // 'i+1' is not seen so far
                arr[i] = 0;
                i++;
            }
        }

        System.out.println("Below are counts of all elements");
        for (int j = 0; j < n; j++)
            System.out.println(j+1 + "->" + Math.abs(arr[j]));
    }
}
