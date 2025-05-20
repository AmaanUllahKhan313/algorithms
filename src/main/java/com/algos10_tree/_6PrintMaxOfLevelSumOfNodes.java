package com.algos10_tree;

import java.util.LinkedList;
import java.util.Queue;

public class _6PrintMaxOfLevelSumOfNodes {

    public static void main(String[] args) {
        _17IsMirrorTree.Node root = new _17IsMirrorTree.Node(1);
        root.left = new _17IsMirrorTree.Node(2);
        root.right = new _17IsMirrorTree.Node(2);
        root.left.left = new _17IsMirrorTree.Node(3);
        root.left.right = new _17IsMirrorTree.Node(4);
        root.right.left = new _17IsMirrorTree.Node(5);
        root.right.right = new _17IsMirrorTree.Node(4);
        System.out.println(levelOfMaxSumOfNodes(root));
    }

    private static int levelOfMaxSumOfNodes(_17IsMirrorTree.Node root) {
        int max = 0 ;
        if (root == null)
            return max;
        max = root.data;
        Queue<_17IsMirrorTree.Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i <size; i++) {
                _17IsMirrorTree.Node node = queue.poll();
                sum += node.data;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            max=Math.max(max,sum);
        }
        return max;
    }

}
