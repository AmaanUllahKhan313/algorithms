package com.algos10_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class _7PrintTreeLevelOrderInSpiral {
    public static void main(String[] args) {
        _17IsMirrorTree.Node root = new _17IsMirrorTree.Node(1);
        root.left = new _17IsMirrorTree.Node(2);
        root.right = new _17IsMirrorTree.Node(3);
        root.left.left = new _17IsMirrorTree.Node(4);
        root.left.right = new _17IsMirrorTree.Node(5);
        root.right.left = new _17IsMirrorTree.Node(6);
        root.right.right = new _17IsMirrorTree.Node(7);
            /*       1
                2       3
            4      5  6     7*/
        levelOrderInSprial(root).forEach(x->System.out.println(x));
    }
    public static List<List<Integer>> levelOrderInSprial(_17IsMirrorTree.Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        Deque<_17IsMirrorTree.Node> queue=new ArrayDeque<>();
        queue.add(root);
        boolean spiral = true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                if(spiral) {
                    _17IsMirrorTree.Node node = queue.pollFirst();
                    list.add(node.data);
                    if (node.left != null)
                        queue.addLast(node.left);
                    if (node.right != null)
                        queue.addLast(node.right);
                } else {
                    _17IsMirrorTree.Node node = queue.pollLast();
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
