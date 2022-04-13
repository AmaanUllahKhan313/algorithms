package com.algos.stack;

import java.util.Stack;

public class DeleteMiddleElementFromStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        deleteMiddleElement(stack,stack.size()/2+1);
        System.out.println(stack);
    }

    private static void deleteMiddleElement(Stack<Integer> stack, int middle) {
        if(middle == 1) {
            stack.pop();
            return;
        }
        int value = stack.pop();
        deleteMiddleElement(stack,middle-1);
        stack.push(value);
    }
}
