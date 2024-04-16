import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Node> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Node(i));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            if (v == -1) {
                continue;
            }
            if (list.get(v).leftNode == -1) {
                list.get(v).leftNode = i;
            } else {
                list.get(v).rightNode = i;
            }
        }
        int delete = Integer.parseInt(br.readLine());
        deleteDfs(delete);
        int count = 0;
        for (Node node : list) {
            boolean leaf = node.alive;
            if (node.leftNode != -1 && list.get(node.leftNode).alive) {
                leaf = false;
            }
            if (node.rightNode != -1 && list.get(node.rightNode).alive) {
                leaf = false;
            }
            if (leaf) count++;
        }
        System.out.println(count);
    }

    private static void deleteDfs(int num) {
        for (Node node : list) {
            if (node.num == num) {
                if (node.leftNode != -1) {
                    deleteDfs(node.leftNode);
                }
                if (node.rightNode != -1) {
                    deleteDfs(node.rightNode);
                }
                node.alive = false;
                node.leftNode = -1;
                node.rightNode = -1;
            }
        }
    }
}

class Node {
    int num;
    boolean alive = true;
    int leftNode = -1;
    int rightNode = -1;

    public Node(int num) {
        this.num = num;
    }
}
