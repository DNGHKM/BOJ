import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static long ans;
    static long[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new long[n+1][n+1];
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            arr[s][e] = Math.max(arr[s][e], d);
        }
        boolean[] visited = new boolean[n + 1];
        findAll(0, 0, 0, visited);
        if (ans == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }

    private static void findAll(int cur, long dist, int cnt, boolean[] visited) {
        if (cnt == n) {
            if (arr[cur][0] != 0) {
                ans = Math.max(ans, dist + arr[cur][0]);
            }
            return;
        }
        for (int i = 1; i < n + 1; i++) {
            if (arr[cur][i] != 0 && !visited[i]) {
                visited[i] = true;
                findAll(i, dist + arr[cur][i], cnt + 1, visited);
                visited[i] = false;
            }
        }
    }
}