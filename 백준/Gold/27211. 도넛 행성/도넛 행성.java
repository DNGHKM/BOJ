import java.io.*;
import java.util.*;

public class Main {
    static int[] dy = {0, -1, 0, 1};
    static int[] dx = {1, 0, -1, 0};
    static int n, m;
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0 && !visited[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x});
        visited[y][x] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int curY = poll[0];
            int curX = poll[1];
            for (int i = 0; i < 4; i++) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];
                if (nextY == -1) {
                    nextY = n - 1;
                }
                if (nextY == n) {
                    nextY = 0;
                }
                if (nextX == -1) {
                    nextX = m - 1;
                }
                if (nextX == m) {
                    nextX = 0;
                }
                if (arr[nextY][nextX] == 0 && !visited[nextY][nextX]) {
                    q.add(new int[]{nextY, nextX});
                    visited[nextY][nextX] = true;
                }
            }
        }
    }
}