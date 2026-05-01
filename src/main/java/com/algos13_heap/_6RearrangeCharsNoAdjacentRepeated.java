package com.algos13_heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _6RearrangeCharsNoAdjacentRepeated {
    static class Freequency{
        char ch;
        int freq;
        public Freequency(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    static class FreqComparator implements Comparator<Freequency>{
        @Override
        public int compare(Freequency freequency, Freequency t1) {
            if (freequency.freq<t1.freq)
                return 1;
            else if (freequency.freq>t1.freq)
                return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        String input = "bbbaa";
        rearrange(input);
    }

    private static void rearrange(String input) {
        int n = input.length();
        int[] count = new int[26];

        for (int i = 0; i < n; i++)
            count[input.charAt(i) - 'a']++;

        Queue<Freequency> queue = new PriorityQueue<Freequency>(new FreqComparator());
        for (char c = 'a'; c <= 'z'; c++) {
            int val = c - 'a';
            if (count[val] > 0)
                queue.add(new Freequency(c,count[val]));
        }
        Freequency previous = new Freequency('#',-1);
        input = "";
        while (0!=queue.size()){
            Freequency temp = queue.poll();
            input+=temp.ch;
            if(previous.freq>0)
                queue.add(previous);
            temp.freq--;
            previous=temp;
        }
        if (n != input.length()) {
            System.out.println(" Not valid String ");
        } else {
            System.out.println(input);
        }
    }
}
