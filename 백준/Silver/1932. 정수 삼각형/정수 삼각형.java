import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        arr[0][0] = Integer.parseInt(br.readLine());
        int k = 2;
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (j == 0) {
                    arr[i][j] = arr[i - 1][j] + tmp;
                } else if (j == k - 1) {
                    arr[i][j] = arr[i - 1][j - 1] + tmp;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j - 1], arr[i - 1][j]) + tmp;
                }
            }
            k++;
        }
        System.out.print(Arrays.stream(arr[n - 1]).max().orElseThrow());
    }
}