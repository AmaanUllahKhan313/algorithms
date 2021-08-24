package com.algos.stack;

import java.util.Stack;

public class ReverseStack {
    private static Stack stack
            = new Stack();
    java.util.Stack stack2
            = new Stack();
    java.util.Stack stack3
            = new Stack();
    public static void main(String[] args) {

        int i = 0 ;
        stack.push(++i);
        stack.push(++i);
        stack.push(++i);
        stack.push(++i);

     /*   while (!stack.isEmpty())
        stack2.push(stack.pop());

        while (!stack2.isEmpty())
            stack3.push(stack2.pop());

        while (!stack3.isEmpty())
            stack.push(stack3.pop());

          while (!stack.isEmpty())
           System.out.println(stack.pop());*/


        getReverseStack(stack);
       while (!stack.isEmpty())
           System.out.println(stack.pop());



    }

    private static void getReverseStackTemp(int x) {
        if (!stack.isEmpty()){
            int a = Integer.parseInt(stack.peek()+"");
            stack.pop();
            getReverseStackTemp(x);
            stack.push(a);
        } else {
            stack.push(x);
        }
    }

    private static void getReverseStack(Stack stack) {
        if(!stack.isEmpty()) {
            int x = Integer.parseInt(stack.peek()+"");
            stack.pop();
            getReverseStack(stack);
            getReverseStackTemp(x);
        }
    }
}
