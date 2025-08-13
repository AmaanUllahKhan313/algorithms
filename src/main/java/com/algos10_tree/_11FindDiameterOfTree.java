package com.algos10_tree;

public class _11FindDiameterOfTree {

    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        System.out.println(getDiameter(root));
    }

    private static int getDiameter(_1BTree root) {
        if(root ==null)
            return 0;
        int lheight = new _10HeightOfTree().getTreeHeight(root.left);
        int rheight = new _10HeightOfTree().getTreeHeight(root.right);
        return Math.max(+1+rheight+lheight,Math.max(getDiameter(root.left),getDiameter(root.right)));

    }
}
