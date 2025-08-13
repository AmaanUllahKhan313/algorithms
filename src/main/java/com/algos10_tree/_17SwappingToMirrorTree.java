package com.algos10_tree;

public class _17SwappingToMirrorTree {

    public static void main(String[] args) {
        _1BTree node = _1BTree.initializeTree();
        swapToMirrorTree(node);
    }

    private static _1BTree swapToMirrorTree(_1BTree node) {
        if (node==null)
            return node;
        _1BTree left = swapToMirrorTree(node.left);
        _1BTree right = swapToMirrorTree(node.right);
        node.left=right;
        node.right=left;
        return node;
    }
}
