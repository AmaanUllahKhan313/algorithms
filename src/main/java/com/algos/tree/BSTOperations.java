package com.algos.tree;

public class BSTOperations{
    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree(21);
        BinarySearchTree node1 = new BinarySearchTree(15);
        BinarySearchTree node2 = new BinarySearchTree(18);
        BinarySearchTree node3 = new BinarySearchTree(16);

        root.setLeft(node1);
        node1.setRight(node2);
        node1.setLeft(node3);

        BinarySearchTree.display(root);
        System.out.println("Height :"+BinarySearchTree.height(root));

        System.out.println("Preorder");
        BinarySearchTree.preorder(root);
        System.out.println();
        System.out.println("Inorder");
        BinarySearchTree.inorder(root);
        System.out.println();
        System.out.println("Postorder");
        BinarySearchTree.postorder(root);

    }
}
