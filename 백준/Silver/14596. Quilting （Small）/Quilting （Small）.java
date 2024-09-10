import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] arr = new int[h][w];
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = (arr[i][j] - num) * (arr[i][j] - num);
            }
        }
        int[][] dp = new int[h][w];
        for (int i = 0; i < w; i++) {
            dp[0][i] = arr[0][i];
        }
        if (w == 1) {
            int sum = 0;
            for (int[] ints : arr) {
                sum += ints[0];
            }
            System.out.println(sum);
            return;
        }
        for (int i = 1; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + arr[i][j];
                    continue;
                }
                if (j == w - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
                    continue;
                }
                dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i - 1][j + 1]) + arr[i][j];
            }
        }
        Arrays.stream(dp[h - 1]).min().ifPresent(System.out::println);
    }
}