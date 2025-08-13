package com.algos14_designs;

public class MinElementFromStack {
    int minElement;
    int [] stack;
    int top = -1;

    public MinElementFromStack(int size) {
        stack = new int[size];
    }
    int getMinElementFromStack() {
        return minElement;
    }
    public int peek(){
        if(top==-1)
            return top;
        if(stack[top]<minElement)
            return minElement;
        else return stack[top];
    }
    void push(int newElement){
        if (top == -1){
            minElement=newElement;
            stack[++top] = newElement;
            return;
        }
        if(newElement<minElement){
            stack[++top]=2*newElement-minElement;
            minElement=newElement;
        } else
            stack[++top] = newElement;

    }
    int pop(){
        if (top == -1)
            return -1;
        int ret = minElement;
        if(stack[top]<minElement){
            minElement=2*minElement-stack[top--];
            return ret;
        } else
            return stack[top--];
    }

    public static void main(String[] args) {
        MinElementFromStack s = new MinElementFromStack(5);
        s.push(3);
        s.push(5);
        System.out.println(s.getMinElementFromStack());
        s.push(2);
        s.push(1);
        System.out.println(s.getMinElementFromStack());
        System.out.println(s.pop());
        System.out.println(s.getMinElementFromStack());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
