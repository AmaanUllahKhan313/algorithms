package com.algos3_stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    private static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty())return;
        int value = stack.pop();
        reverseStack(stack);
        insertAtBottomOfStack(stack,value);
    }

    private static void insertAtBottomOfStack(Stack<Integer> stack, int value) {
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int pop = stack.pop();
        insertAtBottomOfStack(stack,value);
        stack.push(pop);
        return;
    }
}
