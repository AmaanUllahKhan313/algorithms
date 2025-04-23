package com.algos10_tree;

public class SwappingToMirrorTree {

    public static void main(String[] args) {
        MirrorTree.Node node = new MirrorTree.Node(1);
        swapToMirrorTree(node);
    }

    private static MirrorTree.Node swapToMirrorTree(MirrorTree.Node node) {
        if (node==null)
            return node;
        MirrorTree.Node left = swapToMirrorTree(node.left);
        MirrorTree.Node right = swapToMirrorTree(node.right);
        node.left=right;
        node.right=left;
        return node;
    }
}
