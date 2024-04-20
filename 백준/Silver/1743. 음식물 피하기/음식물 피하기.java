import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n, m;
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            arr[y][x] = 1;
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    int num = bfs(i, j);
                    if (num > max) max = num;
                }
            }
        }
        System.out.print(max);
    }

    static int bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        int count = 1;
        q.add(new int[]{y, x});
        visited[y][x] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextY = poll[0] + dy[i];
                int nextX = poll[1] + dx[i];
                if (rangeCheck(nextY, nextX) && !visited[nextY][nextX] && arr[nextY][nextX] == 1) {
                    q.add(new int[]{nextY, nextX});
                    visited[nextY][nextX] = true;
                    count++;
                }
            }
        }
        return count;
    }

    static boolean rangeCheck(int nextY, int nextX) {
        return 0 <= nextY && nextY <= n && 0 <= nextX && nextX <= m;
    }
}