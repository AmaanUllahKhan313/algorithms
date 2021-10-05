package com.algos.tree;

public class ValidateBST {
    public static void main(String[] args) {
        BTree root = new BTree(3);
        root.left = new BTree(2);
        root.right = new BTree(5);
        root.left.left = new BTree(1);
        root.left.right = new BTree(4);
        System.out.println(new ValidateBST().isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    BTree prev;
    public boolean isBST(BTree node,int min, int max){
        if (node == null)
            return true;
        if (node.data < min || node.data > max)
            return false;
        return (isBST(node.left, min, node.data-1) &&
                isBST(node.right, node.data+1, max));
    }
}
