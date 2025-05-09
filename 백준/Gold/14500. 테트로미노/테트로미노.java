import java.io.*;
import java.util.*;

public class Main {
    static int n, m, max;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

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
        max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfs(new int[]{i, j}, 1, arr[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int[] point = {i, j};
                max = Math.max(max, find(new int[][]{ //ㅏ
                        {point[0], point[1]},
                        {point[0], point[1] + 1},
                        {point[0], point[1] + 2},
                        {point[0] + 1, point[1] + 1}
                }));
                max = Math.max(max, find(new int[][]{ // ㅓ
                        {point[0], point[1]},
                        {point[0], point[1] + 1},
                        {point[0], point[1] + 2},
                        {point[0] - 1, point[1] + 1}
                }));
                max = Math.max(max, find(new int[][]{ // ㅗ 모양
                        {point[0], point[1]},
                        {point[0] + 1, point[1]},
                        {point[0] + 1, point[1] - 1},
                        {point[0] + 2, point[1]}
                }));
                max = Math.max(max, find(new int[][]{ // ㅜ 모양
                        {point[0], point[1]},
                        {point[0] + 1, point[1]},
                        {point[0] + 1, point[1] + 1},
                        {point[0] + 2, point[1]}
                }));
            }
        }
        System.out.println(max);
    }

    private static void dfs(int[] point, int deep, int sum) {
        if (deep == 4) {
            max = Math.max(max, sum);
            return;
        }
        visited[point[0]][point[1]] = true;
        for (int i = 0; i < 4; i++) {
            int[] next = {point[0] + dx[i], point[1] + dy[i]};
            if (rangeCheck(next) && !visited[next[0]][next[1]]) {
                dfs(next, deep + 1, sum + arr[next[0]][next[1]]);
                visited[next[0]][next[1]] = false;
            }
        }
        visited[point[0]][point[1]] = false;
    }

    private static int find(int[][] point) {
        for (int[] ints : point) {
            if (!rangeCheck(ints)) {
                return 0;
            }
        }
        return sum(point);
    }

    private static boolean rangeCheck(int[] point) {
        return point[0] >= 0 && point[0] < n && point[1] >= 0 && point[1] < m;
    }

    private static int sum(int[][] point) {
        int sum = 0;
        for (int[] ints : point) {
            sum += arr[ints[0]][ints[1]];
        }
        return sum;
    }
}