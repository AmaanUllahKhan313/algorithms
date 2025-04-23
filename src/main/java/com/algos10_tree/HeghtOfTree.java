package com.algos10_tree;

public class HeghtOfTree {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(21);
        BinaryTree node1 = new BinaryTree(12);
        BinaryTree node2 = new BinaryTree(3);
        BinaryTree node3 = new BinaryTree(18);
        BinaryTree node4 = new BinaryTree(24);
        BinaryTree node5 = new BinaryTree(30);
        BinaryTree node6 = new BinaryTree(27);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node3.setLeft(node5);
        node3.setRight(node6);

        int height = getHeight(root);
        System.out.println("Height of the tree :"+height);
    }

    private static int getHeight(BinaryTree root) {
        if(root == null)return 0;
        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());
        return 1+Math.max(leftHeight,rightHeight);
    }
}
