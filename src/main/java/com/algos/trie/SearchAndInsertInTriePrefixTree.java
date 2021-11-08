package com.algos.trie;

public class SearchAndInsertInTriePrefixTree {
    private static TrieNode root;
    public static void main(String[] args) {
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};
        root = new TrieNode();
        for (int i = 0; i < keys.length ; i++)
            insert(keys[i]);
        System.out.println(search("answer")!=null);
    }
    public SearchAndInsertInTriePrefixTree() {
        root = new TrieNode();
    }
    static void insert(String word){
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if(!node.containsKey(word.charAt(i)))
                node.put(word.charAt(i),new TrieNode());
            node = node.get(word.charAt(i));
        }
        node.setEnd(true);
    }
    static TrieNode search(String word){
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if(node.containsKey(word.charAt(i)))
                node = node.get(word.charAt(i));
            else return null;
        }
        return node;
    }
}
