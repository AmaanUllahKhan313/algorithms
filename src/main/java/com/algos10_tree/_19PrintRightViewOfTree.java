package com.algos10_tree;

public class _19PrintRightViewOfTree {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        printRightView(root,1);
    }
    static int max_level=0;
    private static void printRightView(_1BTree a1BTree, int level) {
        if(a1BTree == null) return;
        if (max_level < level) {
            System.out.print(" " + a1BTree.data);
            max_level = level;
        }
        printRightView(a1BTree.right,level+1);
        printRightView(a1BTree.left,level+1);
    }
}
