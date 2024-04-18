import java.io.*;
import java.util.*;

class Main {
    static int n;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;
    static boolean success;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        for (int i = 1; i < list.size(); i++) {
            visited = new boolean[n + 1];
            dfs(i, 0);
        }
        if (success) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void dfs(int node, int deep) {
        if(success) return;
        if (deep >= 4) {
            success = true;
            return;
        }
        visited[node] = true;
        for (Integer i : list.get(node)) {
            if (!visited[i]) {
                dfs(i, deep + 1);
            }
        }
        visited[node] = false;
    }
}