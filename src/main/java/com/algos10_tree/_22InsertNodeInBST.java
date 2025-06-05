package com.algos10_tree;

public class _22InsertNodeInBST {
    public static void main(String[] args) {
        insertNodeInBST(_1BTree.initializeTree(),1);
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
