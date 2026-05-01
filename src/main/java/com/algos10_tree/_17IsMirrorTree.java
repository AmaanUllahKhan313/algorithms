package com.algos10_tree;

public class _17IsMirrorTree {

    public static void main(String[] args) {
        _1BTree root = _1BTree.createMirrorTrees();
        System.out.println(isMirrorTree(root.left,root.right));
    }

    private static boolean isMirrorTree(_1BTree root1, _1BTree root2) {
        if(root1==null && root2==null)
            return true;
        return (root1.data==root2.data)
                && isMirrorTree(root1.left,root2.right)
                && isMirrorTree(root1.right,root2.left);
    }
}
