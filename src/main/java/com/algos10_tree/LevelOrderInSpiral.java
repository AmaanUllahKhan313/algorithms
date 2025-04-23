package com.algos10_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class LevelOrderInSpiral {
    public static void main(String[] args) {
        MirrorTree.Node root = new MirrorTree.Node(1);
        root.left = new MirrorTree.Node(2);
        root.right = new MirrorTree.Node(3);
        root.left.left = new MirrorTree.Node(4);
        root.left.right = new MirrorTree.Node(5);
        root.right.left = new MirrorTree.Node(6);
        root.right.right = new MirrorTree.Node(7);
            /*       1
                2       3
            4      5  6     7*/
        levelOrderInSprial(root).forEach(x->System.out.println(x));
    }
    public static List<List<Integer>> levelOrderInSprial(MirrorTree.Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        Deque<MirrorTree.Node> queue=new ArrayDeque<>();
        queue.add(root);
        boolean spiral = true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                if(spiral) {
                    MirrorTree.Node node = queue.pollFirst();
                    list.add(node.data);
                    if (node.left != null)
                        queue.addLast(node.left);
                    if (node.right != null)
                        queue.addLast(node.right);
                } else {
                    MirrorTree.Node node = queue.pollLast();
                    list.add(node.data);
                    if (node.right != null)
                        queue.addFirst(node.right);
                    if (node.left != null)
                        queue.addFirst(node.left);
                }
            }
            spiral=!spiral;
            result.add(list);
        }
        return result;
    }
}
