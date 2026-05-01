package com.algos10_tree;

public class _4PrintTreeWIthGivenLevel {
    public _4PrintTreeWIthGivenLevel(int anInt) {

    }

    public static void main(String[] args) {
        printAllLevelsOfTree(_1BTree.initializeTree());
    }

    public static void printAllLevelsOfTree(_1BTree root){
        int height = _10HeightOfTree.getHeight(root);
        for(int i=1;i<=height;i++){
            printGivenLevel(root, i);
        }
    }

    private static void printGivenLevel(_1BTree root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data+"\t");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
}
