import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[][] dp = new long[n + 2][11];
        long sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += dp[1][i] = 1;
        }
        for (int i = 2; i < dp.length; i++) {
            dp[i][1] = sum;
            for (int j = 2; j < 11; j++) {
                dp[i][j] = (dp[i][j - 1] - dp[i - 1][j - 1]+10007)%10007;
                sum += dp[i][j];
                sum %= 10007;
            }
        }
        System.out.println(dp[n + 1][1]);
    }
}