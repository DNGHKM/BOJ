import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n;
    static int m;
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
        int ans = 0;
        while (true) {
            for (int i = 1; i < arr.length-1; i++) {
                for (int j = 1; j < arr[i].length-1; j++) {
                    if (rangeCheck(i, j) && arr[i][j] != 0 && !visited[i][j]) {
                        visited[i][j] = true;
                        dfs(i, j);
                        count++;
                    }
                }
            }
            if(count>=2){
                break;
            }
            if(count==0){
                System.out.print(0);
                return;
            }
            count = 0;
            ans++;
            melt();
            visited = new boolean[n][m];
        }
        System.out.print(ans);
    }

    static void melt() {
        int[][] currentArr = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                currentArr[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (currentArr[i][j] == 0) {
                    for (int k = 0; k < 4; k++) {
                        int nextY = i + dy[k];
                        int nextX = j + dx[k];
                        if (rangeCheck(nextY, nextX) && arr[nextY][nextX] != 0) arr[nextY][nextX]--;
                    }
                }
            }
        }
    }

    static boolean rangeCheck(int y, int x) {
        return (0 <= y && y < n && 0 <= x && x < m);
    }

    static void dfs(int y, int x) {
        for (int i = 0; i < 4; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];
            if (rangeCheck(nextY, nextX)) {
                if (arr[nextY][nextX] != 0 && !visited[nextY][nextX]) {
                    visited[nextY][nextX] = true;
                    dfs(nextY, nextX);
                }
            }
        }
    }
}