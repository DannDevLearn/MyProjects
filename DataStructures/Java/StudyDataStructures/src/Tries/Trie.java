package Tries;

import java.util.HashMap;
import java.util.Map;

class TrieNode{
    Map<Character, TrieNode> children;
    boolean isEndWord;

    public TrieNode(){
        children = new HashMap<>();
        isEndWord = false;
    }
}

public class Trie {

    private final TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode cur = root;

        for (char c : word.toCharArray())
            cur = cur.children.computeIfAbsent(c,k -> new TrieNode());
        cur.isEndWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            current = current.children.get(c);
            if (current == null) {
                return false;
            }
        }
        return current.isEndWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            current = current.children.get(c);
            if (current == null) {
                return false;
            }
        }
        return true;
    }

}