import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int[] ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        ans = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        climb();
        climbReverse();
        System.out.println(Arrays.stream(ans).max().getAsInt() - 1);
    }

    static void climb() {
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            int num = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    num = Math.max(dp[j], num);
                }
            }
            ans[i] += dp[i] = num + 1;
        }
    }

    static void climbReverse() {
        int[] dp = new int[n];
        for (int i = n-1; i >=0; i--) {
            int num = 0;
            for (int j = n-1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    num = Math.max(dp[j], num);
                }
            }
            ans[i] += dp[i] = num + 1;
        }
    }
}