import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        int len = Math.min(n, m);
        while (len >= 0) {
            for (int i = 0; i < n - len; i++) {
                for (int j = 0; j < m - len; j++) {
                    int start = arr[i][j];
                    int right = arr[i][j + len];
                    int down = arr[i + len][j];
                    int diag = arr[i + len][j + len];
                    if (start == right && start == down && start == diag) {
                        max = Math.max(max, (len+1)*(len+1));
                    }
                }
            }
            len--;
        }
        System.out.println(max);
    }
}