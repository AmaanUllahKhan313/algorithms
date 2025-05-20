package com.algos10_tree;

public class _2PrintTreeInPrePostOrder {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        System.out.println("Preorder");
        preorder(root);
        System.out.println("Inorder");
        inorder(root);
        System.out.println("Postorder");
        postorder(root);
    }

    public static void inorder(_1BTree root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+"\t");
        inorder(root.right);
    }
    public static void preorder(_1BTree root){

        if(root == null) return;
        System.out.print(root.data+"\t");
        preorder(root.left);
        preorder(root.right);
    }
    public static  void postorder(_1BTree root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"\t");
    }

}
