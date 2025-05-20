package com.algos10_tree;

class _1BTree {
    public _1BTree left;
    public _1BTree right;
    public int data;
    public _1BTree(int data) {
        this.data = data;
    }
    public static void main(String[] args) {
        _1BTree root = initializeTree();
    }

    public static _1BTree initializeTree() {
        _1BTree root = new _1BTree(5);
        root.left = new _1BTree(3);
        root.right = new _1BTree(8);
        root.left.left = new _1BTree(2);
        root.left.right = new _1BTree(4);
        //root.left.left.right.right = new BTree(10);
        //  root.left.left.left = new BTree(8);
        //  root.left.right = new BTree(5);
        root.right.left = new _1BTree(7);
        root.right.right = new _1BTree(9);
        return root;

    }

    public static _1BTree initializeTree2() {
        _1BTree root = new _1BTree(1);
        root.left = new _1BTree(2);
        root.right = new _1BTree(3);
        root.left.left = new _1BTree(4);
        root.left.left.right = new _1BTree(9);
        root.left.left.right.right = new _1BTree(10);
        root.left.left.left = new _1BTree(15);
        root.left.right = new _1BTree(5);
        root.right.left = new _1BTree(6);
        root.right.right = new _1BTree(7);
        return root;
    }
}
