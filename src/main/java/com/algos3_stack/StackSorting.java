package com.algos3_stack;

import java.util.Stack;

public class StackSorting {
    public static void main(String[] args) {
        System.out.println("**********Stack-sorting*********");
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        recursiveSortStack(stack);
        System.out.println(stack);
    }

    private static void recursiveSortStack(Stack<Integer> stack) {
        if(stack.size() == 1 )return;
        int temp = stack.pop();
        recursiveSortStack(stack);
        insertIntoStack(stack,temp);
    }

    private static void insertIntoStack(Stack<Integer> stack, int temp) {
        if(stack.size() == 0 || stack.peek()<=temp){
            stack.push(temp);
            return;
        }
        int value = stack.pop();
        insertIntoStack(stack,temp);
        stack.push(value);
    }

}
