import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                char c = s.charAt(j);
                if (c == 'W') {
                    board[i][j] = 'W';
                } else {
                    board[i][j] = 'B';
                }
            }
        }
        System.out.println(Math.min(findMin('W'), findMin('B')));
    }

    private static int findMin(char color) {
        int[][] arr = new int[n][m];
        int[][] sumArr = new int[n + 1][m + 1];
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != color) arr[i][j]++;
                } else {
                    if (board[i][j] == color) arr[i][j]++;
                }
                sumArr[i + 1][j + 1] = sumArr[i][j + 1] + sumArr[i + 1][j] - sumArr[i][j] + arr[i][j];
            }
        }
        for (int i = 1; i <= n - k + 1; i++) {
            for (int j = 1; j <= m - k + 1; j++) {
                count = Math.min(count, sumArr[i + k - 1][j + k - 1] - sumArr[i + k - 1][j - 1] - sumArr[i - 1][j + k - 1] + sumArr[i - 1][j - 1]);
            }
        }
        return count;
    }
}