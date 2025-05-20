package com.algos10_tree;

public class AllPathsFromRootToAllLeafNodes {
    public static void preorder(_1BTree root){
        if(root == null) return;
        System.out.print(root.data+"\t");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
       // System.out.println(preorder(root,root.left,root.right).data);
    }
}
