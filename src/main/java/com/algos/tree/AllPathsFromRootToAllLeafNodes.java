package com.algos.tree;

public class AllPathsFromRootToAllLeafNodes {
    public static void preorder(BTree root){
        if(root == null) return;
        System.out.print(root.data+"\t");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        BTree root = BTree.initializeTree();
       // System.out.println(preorder(root,root.left,root.right).data);
    }
}
