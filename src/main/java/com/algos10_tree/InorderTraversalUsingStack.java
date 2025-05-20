package com.algos10_tree;

import java.util.Stack;

public class InorderTraversalUsingStack {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        Stack<_1BTree> stack = new Stack<>();
        stack.push(root);
        inorderUsingStack(stack,root);
    }
    public static void inorderUsingStack(Stack stack, _1BTree root){
        if(root == null)return;
        stack.push(root);
        inorderUsingStack(stack, root.left);
        _1BTree node = (_1BTree) stack.pop();
        System.out.print(node.data+"\t");
        inorderUsingStack(stack, root);
    }
}
