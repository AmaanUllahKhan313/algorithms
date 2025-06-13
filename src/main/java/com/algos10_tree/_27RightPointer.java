package com.algos10_tree;

public class _27RightPointer {
    public static void main(String[] args) {
        System.out.println(new _32PrintTreeVisualization(connect(_1BTree.initializeTree())).traversePreOrder());
    }
    public static _1BTree connect(_1BTree root) {
        if(root == null) return root;
        helper(root.left, root.right);
        return root;
    }
    static void helper(_1BTree _1BTree1, _1BTree _1BTree2){
        if(_1BTree1 == null) return;
        helper(_1BTree1.left, _1BTree1.right);
        helper(_1BTree2.left, _1BTree2.right);
        helper(_1BTree1.right, _1BTree2.left);
    }
}
