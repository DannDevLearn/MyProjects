package Tries;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("today");
        trie.insert("total");

        System.out.println(trie.search("today"));
        System.out.println(trie.search("total"));
    }
}
