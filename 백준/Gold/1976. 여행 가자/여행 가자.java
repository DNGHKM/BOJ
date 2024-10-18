import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        int m = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                if (st.nextToken().equals("1")) {
                    nodes.get(i).add(j);
                    nodes.get(j).add(i);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (Integer next : nodes.get(i)) {
                if (find(next) != find(i)) {
                    union(next, i);
                }
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] route = new int[m];
        for (int i = 0; i < m; i++) {
            route[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        int start = find(route[0]);
        for (int i = 1; i < m; i++) {
            if (find(route[i]) != start) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    private static void union(int next, int i) {
        if (find(next) < find(i)) {
            parent[find(i)] = find(next);
        } else {
            parent[find(next)] = find(i);
        }

    }

    private static int find(Integer node) {
        if (parent[node] == node) {
            return node;
        } else {
            return parent[node] = find(parent[node]);
        }
    }

}