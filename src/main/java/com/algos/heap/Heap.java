package com.algos.heap;

import com.algos.Input;

import java.util.*;

public class Heap {
    public static void main(String[] args) {

//        getNthMinNumber(Input.takeInputIntegerFromUser().toArray(),4);
            int [] n = {100,25,3,14,500,60,7,8,9,110};
            getNthMinNumber(n,4);

    }

    private static void getNthMinNumber(int [] arr, int position) {
        Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < position; i++) {
            queue.add(arr[i]);
        }
        for (int i =position; i < arr.length ; i++) {
         if(arr[i] < queue.peek()){
             queue.poll();
             queue.add(arr[i]);
        }
        }
        System.out.println(queue.peek());
       /* Iterator iterator = queue.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }*/
    }
}
