package com.algos10_tree;

public class PrintRightViewOfTree {
    public static void main(String[] args) {
        BTree root = BTree.initializeTree();
        printLeftView(root,1);
    }
    static int max_level=0;
    private static void printLeftView(BTree bTree,int level) {
        if(bTree == null) return;
        if (max_level < level) {
            System.out.print(" " + bTree.data);
            max_level = level;
        }
        printLeftView(bTree.left,level+1);
        printLeftView(bTree.right,level+1);
    }
    private static void printRightView(BTree bTree,int level) {
        if(bTree == null) return;
        if (max_level < level) {
            System.out.print(" " + bTree.data);
            max_level = level;
        }
        printLeftView(bTree.right,level+1);
        printLeftView(bTree.left,level+1);
    }
}
