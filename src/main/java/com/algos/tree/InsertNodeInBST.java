package com.algos.tree;

public class InsertNodeInBST {
    public static void main(String[] args) {
        BTree root = new BTree(6);
        root.left = new BTree(4);
        root.right = new BTree(7);
        root.left.left = new BTree(3);
        root.left.right = new BTree(5);
        insertNodeInBST(root,1);
    }

    private static BTree insertNodeInBST(BTree root,int value) {
        if (root == null){
            root = new BTree(value);
            return root;
        }
        if(value<root.data){
            root.left = insertNodeInBST(root.left,value);
        } else if(value>root.data){
            root.right = insertNodeInBST(root.right,value);
        }
        return root;
    }

}
