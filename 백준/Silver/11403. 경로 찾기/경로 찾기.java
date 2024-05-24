import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] ans;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        ans = new int[n][n];
        list = new ArrayList<>();
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    list.get(i).add(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            dfs(i, i);
            visited = new boolean[n];
        }
        for (int[] num : ans) {
            for (int i : num) {
                bw.write(i+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    private static void dfs(int cur, int start) {
        if (visited[cur]) return;
        if (cur != start) visited[cur] = true;
        for (Integer next : list.get(cur)) {
            if (!visited[next]) {
                ans[cur][next] = 1;
                ans[start][next] = 1;
                dfs(next, start);
            }
        }
    }
}
