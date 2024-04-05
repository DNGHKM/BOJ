import java.io.*;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Trie trie = new Trie();
            for (int j = 0; j < n; j++) {
                String str = br.readLine();
                trie.insert(str);
            }
            int count = trie.countBottomNodes();
            if(count==n){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}

class Node {
    HashMap<Character, Node> child;

    public Node() {
        this.child = new HashMap<>();
    }
}

class Trie {
    static Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String string) {
        Node cur = root;
        for (int i = 0; i < string.length(); i++) {
            char tmp = string.charAt(i);
            cur.child.putIfAbsent(tmp, new Node());
            cur = cur.child.get(tmp);
        }
    }
    int countBottomNodes() {
        return countBottomNode(root);
    }
    private int countBottomNode(Node node) {
        if(node ==null){
            return 0;
        }
        if(node.child.isEmpty()) {
            return 1;
        }
        int count = 0;
        for (Node value : node.child.values()) {
            count += countBottomNode(value);
        }
        return count;
    }
}