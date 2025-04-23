package com.algos3_stack;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.addToQueue(2);
        queue.addToQueue(1);
        queue.addToQueue(3);
        System.out.println(queue.removefromQueue());
        System.out.println(queue.removefromQueue());
    }
}
class Queue{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    void addToQueue(Integer input){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(input);
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
    }
    int removefromQueue(){
        if(stack1.empty()) {
            System.out.println("No element present");
            return -1;
        }
        return stack1.pop();
    }
}
