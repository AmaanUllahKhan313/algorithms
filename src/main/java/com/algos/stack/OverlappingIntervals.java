package com.algos.stack;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Stack;
import java.util.stream.Stream;

public class OverlappingIntervals {
    static class Intervals {
        int start;
        int end;

        public Intervals(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Intervals[] intervals = new Intervals[4];
        intervals[0] = new Intervals(6, 9);
        intervals[1] = new Intervals(1, 3);
        intervals[2] = new Intervals(2, 4);
        intervals[3] = new Intervals(4, 7);
        for (Intervals stack: getMergedIntervals(intervals)) {
            System.out.println(stack.start+" "+stack.end);
        }
        Stream.of(getMergedIntervalsWithoutExtraSpace(intervals)).forEach(x->System.out.println(x.start+" "+x.end));
        deleteOverlappingIntervals(new ArrayList<>(Arrays.asList(intervals))).forEach(x -> System.out.println(x.start + " " + x.end));
    }

    private static Stack<Intervals> getMergedIntervals(Intervals[] intervals) {
        Arrays.sort(intervals, (Comparator.comparingInt(a -> a.start)));
        Stack<Intervals> stack = new Stack<Intervals>();
        stack.push(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (stack.peek().end < intervals[i].start) {
                stack.push(intervals[i]);
            } else if (stack.peek().end < intervals[i].end) {
                stack.push(new Intervals(stack.pop().start, intervals[i].end));
            }
        }
        return stack;
    }

    static Intervals[] getMergedIntervalsWithoutExtraSpace(Intervals[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(x -> x.start));
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index].end >= intervals[i].start) {
                intervals[index].end = Math.max(intervals[index].end, intervals[i].end);
                intervals[index].start = Math.min(intervals[index].start, intervals[i].start);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }
        return intervals;
    }

    static List<Intervals> deleteOverlappingIntervals(List<Intervals> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(x -> x.start));
        ListIterator<Intervals> listIterator = intervals.listIterator();
        Intervals prev = listIterator.next();
        while (listIterator.hasNext()) {
            Intervals current = listIterator.next();
            if (prev.end > current.start) {
                if (current.end > prev.end) {
                    listIterator.remove();
                } else {
                    listIterator.previous();
                    listIterator.remove();
                }
            }
            prev = current;
        }
        return intervals;
    }
}
