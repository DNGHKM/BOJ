import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] += min(i,j);
            }
        }
        Arrays.stream(dp[n-1]).min().ifPresent(System.out::println);
    }

    private static int min(int y, int x) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if(i==x) continue;
            min = Math.min(min,dp[y-1][i]);
        }
        return min;
    }
}