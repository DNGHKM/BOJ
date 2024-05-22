import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        long[][] dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) continue;
                int jump = arr[i][j];
                if (dp[i][j] != 0) {
                    if (i + jump < n) {
                        dp[i + jump][j] = Math.max(1, dp[i][j] + dp[i + jump][j]);
                    }
                    if (j + jump < n) {
                        dp[i][j + jump] = Math.max(1, dp[i][j] + dp[i][j + jump]);
                    }
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}