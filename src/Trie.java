import java.util.HashMap;
import java.util.Map;

class Trie {

    private class TrieNode{
        Map<Character, TrieNode> hm;
        boolean flag;

        public TrieNode(){
            hm = new HashMap<>();
            flag = false;
        }

    }

    /** Initialize your data structure here. */
    private final TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode tn = root;
        int len = word.length();
        for(int i=0; i<len; i++){
            char c = word.charAt(i);
            TrieNode temp = tn.hm.get(c);
            if(!tn.hm.containsKey(c)){
                tn = new TrieNode();
                tn.hm.put(c, temp);
            }
            tn = temp;
        }
        tn.flag = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode tn = root;
        int len = word.length();
        for(int i=0; i<len; i++){
            char c = word.charAt(i);
            TrieNode temp = tn.hm.get(c);
            if(temp == null) return false;
            tn = temp;
        }
        return tn.flag;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
        TrieNode tn = root;
        int len = word.length();
        for(int i=0; i<len; i++){
            char c = word.charAt(i);
            TrieNode temp = tn.hm.get(c);
            if(temp == null) return false;
            tn = temp;
        }
        return true;
    }

    public static void main(String args[]){
        Trie obj = new Trie();
        String word = "apurva";
        String prefix = "ap";
        obj.insert(word);
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith(prefix);
        System.out.println(param_2+" and "+param_3);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

