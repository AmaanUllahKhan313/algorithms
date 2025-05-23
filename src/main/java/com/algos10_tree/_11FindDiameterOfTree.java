package com.algos10_tree;

public class _11FindDiameterOfTree {

    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        System.out.println(getDiameter(root));
    }

    private static int getDiameter(_1BTree a1BTree) {
        if(a1BTree ==null)
            return 0;
        int lheight = new _10HeightOfTree().getTreeHeight(a1BTree.left);
        int rheight = new _10HeightOfTree().getTreeHeight(a1BTree.right);
        return Math.max(+1+rheight+lheight,Math.max(getDiameter(a1BTree.left),getDiameter(a1BTree.right)));

    }
}
