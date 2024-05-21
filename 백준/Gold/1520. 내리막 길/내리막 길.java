import java.io.*;
import java.util.*;

public class Main {
    static int[] dy = {0, -1, 0, 1};
    static int[] dx = {1, 0, -1, 0};
    static int n, m;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        dp = new int[n][m];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(dfs(n-1, m-1));
    }

    private static int dfs(int y, int x) {
        if (dp[y][x] == -1) {
            dp[y][x] = 0;
            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];
                if (rangeCheck(nextY, nextX) && arr[nextY][nextX] > arr[y][x]) {
                    dp[y][x] += dfs(nextY, nextX);
                }
            }
        }
        return dp[y][x];
    }

    private static boolean rangeCheck(int y, int x) {
        return 0 <= y && y < n && 0 <= x && x < m;
    }
}