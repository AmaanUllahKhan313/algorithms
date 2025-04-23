package com.algos3_stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class VisitAllRooms {
    public static void main(String[] args) {
       Integer [][] roomsArray =  {{1,3},{3,0,1},{2},{0}};
        List<List<Integer>> rooms = Arrays.stream(roomsArray)
                .map(Arrays::asList).collect(Collectors.toList());
        System.out.println(canVisitAllRooms(rooms));
    }
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int nei: rooms.get(node))
                if (!seen[nei]) {
                    seen[nei] = true;
                    stack.push(nei);
                }
        }
        for (boolean v: seen)
            if (!v) return false;
        return true;
    }
}
