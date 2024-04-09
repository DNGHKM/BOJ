import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n;
    static int m;
    static int[][] arr;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;
        max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                    int result = dfs(i, j);
                    if(max<result) max = result;
                }
            }
        }
        System.out.print(count+"\n"+max);
    }

    static int dfs(int y, int x) {
        int size = 1;
        arr[y][x] = 0;
        for (int i = 0; i < 4; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];
            if (rangeCheck(nextY, nextX) && arr[nextY][nextX] == 1) {
                size += dfs(nextY, nextX);
            }
        }
        return size;
    }
    static boolean rangeCheck(int nextY, int nextX) {
        return 0 <= nextY && nextY < n && 0 <= nextX && nextX < m;
    }
}