package com.algos10_tree;

public class _21PrintAllNodesFromKthDistance {
    public static void main(String[] args) {
        printKthNodes(_1BTree.initializeTree(),1);
    }

    private static void printKthNodes(_1BTree root, int i) {
        if (root==null)
            return;
        if (i==0)
            System.out.println(root.data);
        printKthNodes(root.left,i-1);
        printKthNodes(root.right,i-1);
    }
}
