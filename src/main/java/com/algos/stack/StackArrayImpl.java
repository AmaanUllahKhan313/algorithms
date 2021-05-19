package com.algos.stack;

public class StackArrayImpl {
    private int top = -1;
    int[] stack;
    int min;

    public int getMin() {
        return min;
    }

    public StackArrayImpl(int size) {
        stack = new int[size];
    }
    public boolean push(int value){
        if((top+1) == stack.length)return false;
        if(top == -1) min = value;
        stack[++top] = value;
        if(value<min)min=value;
        return true;
    }
    public int pop(){
        if((top-1) == -2)return -1;
        return stack[top--];
    }
    public void display(){
        System.out.println();
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+"\t");
        }
        System.out.println();
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
    public int peek(){
        if(top==-1)return top;
        return stack[top];
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
}
