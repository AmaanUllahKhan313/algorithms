package com.algos10_tree;

public class _17SwappingToMirrorTree {

    public static void main(String[] args) {
        _17IsMirrorTree.Node node = new _17IsMirrorTree.Node(1);
        swapToMirrorTree(node);
    }

    private static _17IsMirrorTree.Node swapToMirrorTree(_17IsMirrorTree.Node node) {
        if (node==null)
            return node;
        _17IsMirrorTree.Node left = swapToMirrorTree(node.left);
        _17IsMirrorTree.Node right = swapToMirrorTree(node.right);
        node.left=right;
        node.right=left;
        return node;
    }
}
