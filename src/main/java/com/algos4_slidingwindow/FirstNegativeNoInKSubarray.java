package com.algos4_slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNoInKSubarray {
    public static void main(String[] args) {
        int[] a = {12,-1,-7,8,-15,30,18,28};
        int window = 3;
//        System.out.println("First -ve element list : "+getFirstNegativeArrayInSubarray(a,window));
        printFirstNegativeInteger(a,a.length,window);
    }

    // function to find the first negative
// integer in every window of size k
    static void printFirstNegativeInteger(int arr[],
                                          int n, int k)
    {
        // A Double Ended Queue, Di that will
        // store indexes of useful array elements
        // for the current window of size k.
        // The useful elements are all negative integers.
        LinkedList<Integer> Di = new LinkedList<>();

        // Process first k (or first window)
        // elements of array
        int i;
        for (i = 0; i < k; i++)

            // Add current element at the rear of Di
            // if it is a negative integer
            if (arr[i] < 0)
                Di.add(i);

        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for ( ; i < n; i++)
        {
            // if Di is not empty then the element
            // at the front of the queue is the first
            // negative integer of the previous window
            if (!Di.isEmpty())
                System.out.print(arr[Di.peek()] + " ");

                // else the window does not have a
                // negative integer
            else
                System.out.print("0" + " ");

            // Remove the elements which are
            // out of this window
            while ((!Di.isEmpty()) &&
                    Di.peek() < (i - k + 1))
                Di.remove(); // Remove from front of queue

            // Add current element at the rear of Di
            // if it is a negative integer
            if (arr[i] < 0)
                Di.add(i);
        }

        // Print the first negative
        // integer of last window
        if (!Di.isEmpty())
            System.out.print(arr[Di.peek()] + " ");
        else
            System.out.print("0" + " ");
    }

    private static List getFirstNegativeArrayInSubarray(int[] a, int window) {
        List<Integer> returnList = new ArrayList<>();
        int start = 0, end = 0, neg = 0;
        Queue<Integer> queue = new LinkedList<>();

        boolean isFound = false;
        while(end<window){
            if(a[end]<0){
                if(!isFound ){
                    isFound=true;
                    neg = a[end];
                }
                ((LinkedList<Integer>) queue).add(a[end]);
            }
            end++;
        }
end--;
//        returnList.add(neg);

        while(end!=a.length){
            if(!queue.isEmpty() && queue.peek()==a[start]){
                neg = ((LinkedList<Integer>) queue).pop();
                returnList.add(neg);
            }else{
                if(!queue.isEmpty()){
                    neg=queue.peek();
                }
                else neg = 0;
                returnList.add(neg);
            }
            start++;
            if(a[end]<0){
                queue.add(a[end]);
            }
            end++;
        }
        return  returnList;
    }
}
