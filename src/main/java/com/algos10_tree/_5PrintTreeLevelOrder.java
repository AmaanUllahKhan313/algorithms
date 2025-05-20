package com.algos10_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class _5PrintTreeLevelOrder {
    public static void main(String[] args) {
        _17IsMirrorTree.Node root = new _17IsMirrorTree.Node(1);
        root.left = new _17IsMirrorTree.Node(2);
        root.right = new _17IsMirrorTree.Node(2);
        root.left.left = new _17IsMirrorTree.Node(3);
        root.left.right = new _17IsMirrorTree.Node(4);
        root.right.left = new _17IsMirrorTree.Node(5);
        root.right.right = new _17IsMirrorTree.Node(4);
        System.out.println(levelOrder(root));
    }
    public static List<List<Integer>> levelOrder(_17IsMirrorTree.Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;

        Queue<_17IsMirrorTree.Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();

            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                _17IsMirrorTree.Node node=queue.poll();
                list.add(node.data);

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
