import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        final int NUM = 1_000_000_000;
        long[][] dp = new long[k+1][n + 1];
        dp[0][0] = 1;
        for (int i = 0; i < k + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i][j - 1] % NUM + dp[i - 1][j] % NUM;
                dp[i][j] %= NUM;
            }
        }
        System.out.println(dp[k][n]);
    }
}