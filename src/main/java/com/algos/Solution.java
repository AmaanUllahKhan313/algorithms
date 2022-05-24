package com.algos;

import com.algos.stack.OverlappingIntervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Intervals {
        int start;
        int end;

        public Intervals(int start, int end) {
            this.start = start;
            this.end = end;
        }

        static class ArrayEntity {
            private int value;
            private int index;

            public ArrayEntity(int value, int index) {
                this.value = value;
                this.index = index;
            }
        }


        public int[][] merge(int[][] intervals) {
            Stack<Intervals> stack = new Stack<Intervals>();
            stack.push(new Intervals(intervals[0][0], intervals[0][1]));
            for (int i = 1; i < intervals.length; i++) {
                if (stack.peek().end < intervals[i][0]) {
                    stack.push(new Intervals(intervals[i][0], intervals[i][1]));
                } else if (stack.peek().end < intervals[i][1]) {
                    stack.push(new Intervals(stack.pop().start, intervals[i][1]));
                }
            }
            List<Intervals> list = stack;
            int[][] result = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                result[i][0] = list.get(i).start;
                result[i][1] = list.get(i).end;
            }
            return result;
        }
    }

}