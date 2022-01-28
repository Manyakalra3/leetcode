class WordDictionary {
    TrieNode root;
    
    static class TrieNode {
        boolean isWord;
        TrieNode[] children = new TrieNode[26];
    }

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); ++i) {
            int k = word.charAt(i) - 'a';
            if (node.children[k] == null) node.children[k] = new TrieNode();
            node = node.children[k];
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        return search(root, word, 0);
    }
    
    private boolean search(TrieNode node, String word, int pos) {
        if (node == null) return false;
        if (pos == word.length()) return node.isWord;
        char c = word.charAt(pos);
        if (c == '.') {
            for (int i = 0; i < 26; ++i) {
                if (search(node.children[i], word, pos + 1)) return true;
            }
            return false;
        }
        return node.children[c - 'a'] != null && search(node.children[c - 'a'], word, pos + 1);
    }
}