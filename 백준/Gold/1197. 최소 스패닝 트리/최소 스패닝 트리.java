import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        parent = new int[v + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.dist - o2.dist;
            }
        });
        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            pq.add(new Node(start, end, dist));
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            if (find(poll.start) != find(poll.end)) {
                sum += poll.dist;
                union(poll.start, poll.end);
            }
        }
        System.out.println(sum);
    }

    static void union(int start, int end) {
        if (parent[start] < parent[end]) {
            parent[find(end)] = find(start);
        }else{
            parent[find(start)] = find(end);
        }
    }

    static int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }
}

class Node {
    int start;
    int end;
    int dist;

    public Node(int start, int end, int dist) {
        this.start = start;
        this.end = end;
        this.dist = dist;
    }
}