import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    static int m;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int[][] tomato = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    int input = Integer.parseInt(st.nextToken());
                    tomato[i][j] = input;
                    if (input == 1) {
                        q.add(new int[]{i, j});
                    }
                }
            }
        int countZero = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if(tomato[i][j] ==0) {
                    countZero++;
                }
            }
        }
        if(countZero==0) {
            System.out.println(0);
            return;
        }
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];
                int[] next = {nx, ny};
                if (rangeCheck(nx, ny)){
                    if(tomato[nx][ny] == 0){
                        q.add(next);
                        tomato[nx][ny] = tomato[tmp[0]][tmp[1]] + 1;
                    }
                }
            }
        }
        int answer = 1;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    if(tomato[i][j]==0) {
                        System.out.println(-1);
                        return;
                    }else{
                       if(tomato[i][j]>answer){
                           answer = tomato[i][j];
                       }
                    }
                }
            }
            System.out.println(answer-1);
        }
    private static boolean rangeCheck(int a, int b) {
        if(0<=a&&a<n&&0<=b&&b<m) {
            return true;
        } else{
            return false;
        }
    }
}