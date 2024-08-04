import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            long[] dp = new long[n];
            dp[0] = arr[0];
            for (int i = 1; i < dp.length; i++) {
                dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            }
            System.out.println(Arrays.stream(dp).max().getAsLong());
        }
    }
}