package com.algos10_tree;


//AVL Tree
public class _13IsTreeBalanced {

    public static void main(String[] args) {
        System.out.println(isAVLTree(_1BTree.initializeTree()));
    }

    private static boolean isAVLTree(_1BTree root) {
        if(root == null) return true;
        return Math.abs(_10HeightOfTree.getHeight(root.left)
                - _10HeightOfTree.getHeight(root.right))<=1;
    }
}
