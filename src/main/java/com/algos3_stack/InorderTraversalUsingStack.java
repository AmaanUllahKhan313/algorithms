package com.algos3_stack;

import com.algos10_tree.BinarySearchTree;

import java.util.Stack;

public class InorderTraversalUsingStack {
    public static void main(String[] args) {
        BinarySearchTree node1 = new BinarySearchTree(30);
        BinarySearchTree node2 = new BinarySearchTree(null,node1,27);
        BinarySearchTree node7 = new BinarySearchTree(11);
        BinarySearchTree node6 = new BinarySearchTree(null,node7,9);
        BinarySearchTree node4 = new BinarySearchTree(15);
        BinarySearchTree node3 = new BinarySearchTree(null,node4,12);
        BinarySearchTree node5 = new BinarySearchTree(node6,node4,12);
        BinarySearchTree root = new BinarySearchTree(node5,node2,21);

        BinarySearchTree.display(root);

        Stack<BinarySearchTree> stack = new Stack<>();
        stack.push(root);
        BinarySearchTree.inorderUsingStack(stack,root);
    }


}
