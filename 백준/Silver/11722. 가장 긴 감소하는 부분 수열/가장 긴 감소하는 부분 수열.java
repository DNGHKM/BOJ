import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            int num = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    num = Math.max(dp[j], num);
                }
            }
            dp[i] = num + 1;
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}