import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int climbNum = climb(i);
            int descendNum = descend(i);
            ans = Math.max(ans, climbNum + descendNum - 1);
        }
        System.out.println(ans);
    }

    private static int climb(int end) {
        int[] dp = new int[end + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            int num = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    num = Math.max(dp[j], num);
                }
            }
            dp[i] = num + 1;
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    private static int descend(int start) {
        int[] dp = new int[n];
        dp[start] = 1;
        for (int i = start + 1; i < dp.length; i++) {
            int num = 0;
            for (int j = start; j < i; j++) {
                if (arr[i] < arr[j]) {
                    num = Math.max(dp[j], num);
                }
            }
            dp[i] = num + 1;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}