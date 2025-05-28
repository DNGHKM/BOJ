import java.io.*;
import java.util.*;

public class Main {
    static int y;
    static int x;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        arr = new int[y][x];
        int cnt = 0;
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
                if (num == 1) {
                    cnt++;
                }
            }
        }
        int time = 0;
        while (cnt != 0) {
            updateArr();
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (arr[i][j] != 1) {
                        continue;
                    }
                    if (isMelt(new int[]{i, j})) {
                        arr[i][j] = 0;
                        cnt--;
                    }
                }
            }
            time++;
        }
        System.out.println(time);
    }

    private static void updateArr() {
        visited = new boolean[y][x];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            for (int i = 0; i < 4; i++) {
                int[] next = new int[]{curr[0] + dy[i], curr[1] + dx[i]};
                if (rangeCheck(next) &&
                        (arr[next[0]][next[1]] == 0 || arr[next[0]][next[1]] == -1) &&
                        !visited[next[0]][next[1]]) {
                    visited[next[0]][next[1]] = true;
                    q.add(new int[]{next[0], next[1]});
                    arr[next[0]][next[1]] = -1;
                }
            }
        }
    }

    private static boolean rangeCheck(int[] next) {
        return 0 <= next[0] && next[0] < y && 0 <= next[1] && next[1] < x;
    }

    private static boolean isMelt(int[] cheese) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[cheese[0] + dy[i]][cheese[1] + dx[i]] == -1) {
                cnt++;
            }
        }
        return cnt >= 2;
    }
}
