import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int MOD = 1_000_000_007;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[][] arr = new long[n][m];
        int blank = Integer.parseInt(br.readLine());
        for (int i = 0; i < blank; i++) {
            st = new StringTokenizer(br.readLine());
            int by = Integer.parseInt(st.nextToken());
            int bx = Integer.parseInt(st.nextToken());
            arr[by - 1][bx - 1] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == -1) {
                break;
            }
            arr[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == -1) {
                    continue;
                }

                long a = 0;
                if (j > 0) {
                    a = arr[j - 1][i];
                }
                a = Math.max(0, a);

                long b = 0;
                if (i % 2 == 0 && j > 0) {
                    b = arr[j - 1][i - 1];
                } else if (i % 2 == 1) {
                    b = arr[j][i - 1];
                }
                b = Math.max(0, b);

                long c = 0;
                if (i % 2 == 0) {
                    c = arr[j][i - 1];
                } else {
                    if (j + 1 != n) {
                        c = arr[j + 1][i - 1];
                    }
                }
                c = Math.max(0, c);
                arr[j][i] = (a + b + c) % MOD;
            }
        }
        System.out.println(arr[n - 1][m - 1]);
    }
}