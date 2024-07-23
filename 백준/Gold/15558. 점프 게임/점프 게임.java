import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static int[][] cnt;
    static int k;
    static int[] dx;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        if (n <= k) {
            System.out.println(1);
            return;
        }
        dx = new int[]{1, -1, k};
        arr = new int[2][n];
        for (int i = 0; i < 2; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        cnt = new int[2][n + 1];
        bfs();
        int maxIdx = 0;
        for (int i = 0; i < cnt[0].length; i++) {
            if (cnt[0][i] > 0 || cnt[1][i] > 0) {
                maxIdx = Math.max(maxIdx, i);
            }
        }
        if (maxIdx + k >= n) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }

    private static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 0});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 3; i++) {
                int nextY = poll[0];
                if (i == 2) {
                    if (nextY == 0) {
                        nextY = 1;
                    } else {
                        nextY = 0;
                    }
                }
                int nextX = poll[1] + dx[i];
                if (rangeCheck(nextX) && arr[nextY][nextX] == 1 && cnt[nextY][nextX] == 0 && nextX >= poll[2] + 1) {
                    q.add(new int[]{nextY, nextX, poll[2] + 1});
                    cnt[nextY][nextX] = cnt[poll[0]][poll[1]] + 1;
                }
            }
        }
    }

    private static boolean rangeCheck(int nextX) {
        return 0 <= nextX && nextX < n;
    }
}