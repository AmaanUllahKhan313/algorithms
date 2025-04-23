package com.algos10_tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindLevelOfMaxOfSumOfNodes {

    public static void main(String[] args) {
        MirrorTree.Node root = new MirrorTree.Node(1);
        root.left = new MirrorTree.Node(2);
        root.right = new MirrorTree.Node(2);
        root.left.left = new MirrorTree.Node(3);
        root.left.right = new MirrorTree.Node(4);
        root.right.left = new MirrorTree.Node(5);
        root.right.right = new MirrorTree.Node(4);
        System.out.println(levelOfMaxSumOfNodes(root));
    }

    private static int levelOfMaxSumOfNodes(MirrorTree.Node root) {
        int max = 0 ;
        if (root == null)
            return max;
        max = root.data;
        Queue<MirrorTree.Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i <size; i++) {
                MirrorTree.Node node = queue.poll();
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
