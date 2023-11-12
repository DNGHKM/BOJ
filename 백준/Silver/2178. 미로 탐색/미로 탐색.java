import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n + 1][m + 1];
        int[][] count = new int[n + 1][m + 1];
        boolean[][] visited = new boolean[n + 1][m + 1];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i + 1][j + 1] = input.charAt(j) - 48;
            }
        }
        Queue<point> q = new LinkedList<>();
        q.add(new point(1,1));
        while (!q.isEmpty()) {
            point tmp = q.poll();
            visited[tmp.x][tmp.y] = true;
            for (int i = 0; i < 4; i++) {
                int nextX = tmp.x + dx[i];
                int nextY = tmp.y + dy[i];
                if (rangeCheck(nextX, nextY) && arr[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    point nextPoint = new point(nextX, nextY);
                    q.add(nextPoint);
                    count[nextPoint.x][nextPoint.y]=count[tmp.x][tmp.y]+1;
                    visited[nextPoint.x][nextPoint.y] = true;
                    if(nextPoint.x==n&&nextPoint.y==m){
                        break;
                    }
                }
            }
        }
        System.out.println(count[n][m]+1);
    }
    private static boolean rangeCheck(int a, int b) {
        return 0 < a && a <= n && 0<=b && b <= m;
    }
} class point {
    int x;
    int y;
    point(int x, int y){
        this.x = x;
        this.y= y;
    }
}