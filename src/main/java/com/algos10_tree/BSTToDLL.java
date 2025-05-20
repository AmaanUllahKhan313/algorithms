package com.algos10_tree;

public class BSTToDLL {
    static _1BTree head = null;
    static _1BTree tail = null;
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        bstToDll(root);
        printDLL();
    }
    private static void printDLL() {
        while (head!=null){
            System.out.println(head.data);
            head = head.right;
        }
    }
    private static void bstToDll(_1BTree root) {
        if (root==null)
            return;
        bstToDll(root.left);
        if (head == null) {
            head = root;
        }
        root.left = tail;
        if (tail != null) {
            (tail).right = root;
        }
        tail = root;
        bstToDll(root.right);
    }
}
