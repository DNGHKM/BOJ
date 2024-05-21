import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startY = Integer.parseInt(st.nextToken());
            int startX = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int targetY = Integer.parseInt(st.nextToken());
            int targetX = Integer.parseInt(st.nextToken());
            if(startY==targetY&&startX==targetX){
                System.out.println(0);
                continue;
            }
            bfs(startY, startX, targetY, targetX);
            System.out.println(arr[targetY][targetX]);
        }
    }

    private static void bfs(int y, int x, int targetY, int targetX) {
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 8; i++) {
                int nextY = poll[0] + dy[i];
                int nextX = poll[1] + dx[i];
                if (rangeCheck(nextY, nextX) && !visited[nextY][nextX]) {
                    q.add(new int[]{nextY, nextX});
                    visited[nextY][nextX] = true;
                    arr[nextY][nextX] = arr[poll[0]][poll[1]] + 1;
                    if (nextY ==targetY&&nextX==targetX) return;
                }
            }
        }
    }

    private static boolean rangeCheck(int y, int x) {
        return 0 <= y && y < n && 0 <= x && x < n;
    }
}