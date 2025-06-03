package com.algos10_tree;

public class _21PrintAllNodesFromKthDistance {
    public static void main(String[] args) {
        _1BTree root = new _1BTree(1);
        root.left = new _1BTree(2);
        root.right = new _1BTree(2);
        root.left.left = new _1BTree(3);
        root.left.right = new _1BTree(4);
        root.right.left = new _1BTree(5);
        root.right.right = new _1BTree(4);
        printKthNodes(root,1);
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
