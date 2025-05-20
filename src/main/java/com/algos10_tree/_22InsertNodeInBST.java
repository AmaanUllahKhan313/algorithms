package com.algos10_tree;

public class _22InsertNodeInBST {
    public static void main(String[] args) {
        _1BTree root = new _1BTree(6);
        root.left = new _1BTree(4);
        root.right = new _1BTree(7);
        root.left.left = new _1BTree(3);
        root.left.right = new _1BTree(5);
        insertNodeInBST(root,1);
    }

    private static _1BTree insertNodeInBST(_1BTree root, int value) {
        if (root == null){
            root = new _1BTree(value);
            return root;
        }
        if(value<root.data)
            root.left = insertNodeInBST(root.left,value);
         else if(value>root.data)
            root.right = insertNodeInBST(root.right,value);
        return root;
    }
}
