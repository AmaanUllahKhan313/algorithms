package com.algos.tree;

public class MergeTwoTrees {
    public static void main(String[] args) {
        System.out.println(mergeTrees(BTree.initializeTree(),BTree.initializeTree2()));
    }
    public static BTree mergeTrees(BTree root1, BTree root2) {
        if (root1 != null & root2 != null) root1.data = root1.data+root2.data;
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        if (root1.right!=null  & root2.right!=null) mergeTrees(root1.right,root2.right);
        if (root1.right==null  & root2.right!=null) root1.right = root2.right;
        if (root1.left!=null  & root2.left!=null) mergeTrees(root1.left,root2.left);
        if (root1.left==null  & root2.left!=null) root1.left = root2.left;
        return root1;
    }
}
