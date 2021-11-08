package com.algos.trie;

public class TrieNode {
    private static final int R = 26;
    private TrieNode [] links;
    private boolean isEnd;
    public TrieNode() {
        links = new TrieNode[R];
    }
    public boolean isEnd() {
        return isEnd;
    }
    public void setEnd(boolean end) {
        isEnd = end;
    }
    public TrieNode get(char ch) {
        return links[ch-'a'];
    }
    public void put(char ch, TrieNode node) {
        links[ch-'a']=node;
    }
    public boolean containsKey(char ch) {
        return links[ch -'a'] != null;
    }
}
