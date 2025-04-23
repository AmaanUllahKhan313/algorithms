package com.algos10_tree;

public class DiameterOfTree {

    public static void main(String[] args) {
        BTree root = BTree.initializeTree();
        System.out.println(getDiameter(root));
    }

    private static int getDiameter(BTree bTree) {
        if(bTree==null)
            return 0;
        int lheight = BTree.getTreeHeight(bTree.left);
        int rheight = BTree.getTreeHeight(bTree.right);
        return Math.max(+1+rheight+lheight,Math.max(getDiameter(bTree.left),getDiameter(bTree.right)));

    }
}
