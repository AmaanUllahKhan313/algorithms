package com.algos10_tree;

import java.util.*;

public class _9PrintTreeInVerticalOrder {
    static class QueueHelper
    {
        _20CheckIfTwoNodesAreSibling.Node node;
        int level;

        public QueueHelper(_20CheckIfTwoNodesAreSibling.Node node, int level) {
            this.node = node;
            this.level = level;
        }
    };
    public static void main(String[] args) {
        _20CheckIfTwoNodesAreSibling.Node root = _20CheckIfTwoNodesAreSibling.getTree();
        getVerticalOrderTraverse(root).values().stream().forEach(System.out::println);
    }

    private static Map getVerticalOrderTraverse(_20CheckIfTwoNodesAreSibling.Node root) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<QueueHelper> queue = new LinkedList<>();
        queue.add(new QueueHelper(root,0));
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                QueueHelper queueHelper = queue.poll();
                _20CheckIfTwoNodesAreSibling.Node node = queueHelper.node;
                int level = queueHelper.level;
                if (map.containsKey(queueHelper.level)){
                    map.get(level).add(node.data);
                } else {
                    List<Integer> list = new ArrayList();
                    list.add(node.data);
                    map.put(level,list);
                }
                if (queueHelper.node.left!=null)
                    queue.add(new QueueHelper(node.left,level-1));
                if (queueHelper.node.right!=null)
                    queue.add(new QueueHelper(node.right,level+1));
            }
        }
        return map;
    }
}
