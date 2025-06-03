package com.algos10_tree;

public class _17IsMirrorTree {

    public static void main(String[] args) {
        _1BTree root = _1BTree.createMirrorTrees();
        System.out.println(isMirrorTree(root.left,root.right));
    }

    private static boolean isMirrorTree(_1BTree left, _1BTree right) {
        if(left==null && right==null)
            return true;
        return (left.data==right.data)
                && isMirrorTree(left.left,right.right)
                && isMirrorTree(left.right,right.left);
    }
}
