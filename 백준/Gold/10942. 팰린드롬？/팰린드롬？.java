import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean[][] isPalindrome = new boolean[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                isPalindrome[i][i + 1] = true;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int start = 1; start <= n - len + 1; start++) {
                int end = start + len - 1;
                if (arr[start] == arr[end] && isPalindrome[start + 1][end - 1]) {
                    isPalindrome[start][end] = true;
                }
            }
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = isPalindrome[a][b] ? 1 : 0;
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
