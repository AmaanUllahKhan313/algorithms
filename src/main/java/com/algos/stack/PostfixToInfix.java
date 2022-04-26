package com.algos.stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        System.out.println(postFixToInfix("ab*c+"));
    }

    private static String postFixToInfix(String postfix) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < postfix.length(); i++) {
            if (isOperand(postfix.charAt(i))){
                stack.push(postfix.charAt(i)+"");
            } else {
                stack.push("(" + stack.pop() + postfix.charAt(i) + stack.pop() + ")");
            }
        }
        return stack.pop();
    }

    private static boolean isOperand(char charAt) {
        return charAt>='a'&&charAt<='z'||charAt>='A'&&charAt<='Z';
    }
}
