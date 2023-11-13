import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int[] dx = {1,0,-1,0,0,0};
    static int[] dy = {0,0,0,0,1,-1};
    static int[] dz = {0,1,0,-1,0,0};
    static int m;
    static int n;
    static int h;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); //상자의 가로 칸 수
        n = Integer.parseInt(st.nextToken()); //상자의 세로 칸 수
        h = Integer.parseInt(st.nextToken()); //상자의 높이(수)
        int[][][] tomato = new int[h][n][m];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    int input = Integer.parseInt(st.nextToken());
                    tomato[i][j][k] = input;
                    if (input == 1) {
                        q.add(new int[]{i, j, k});
                    }
                }
            }
        }
        //처음부터 다 익었는지 안익은 토마토 갯수 세기
        int countZero = 0;
        for (int i = 0; i <h; i++) {
            for (int j = 0; j <n; j++) {
                for (int k = 0; k <m; k++) {
                    if(tomato[i][j][k] ==0) {
                        countZero++;
                    }
                }
            }
        }
        //안익은 토마토가 0개라면 0 출력 후 종료
        if(countZero==0) {
            System.out.println(0);
            return;
        }
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];
                int nz = tmp[2] + dz[i];
                int[] next = {nx, ny, nz};
                if (rangeCheck(nx, ny, nz)){
                    if(tomato[nx][ny][nz] == 0){
                        q.add(next);
                        tomato[nx][ny][nz] = tomato[tmp[0]][tmp[1]][tmp[2]] + 1;
                    }
                }
            }
        }
        int answer = 1;
        for (int i = 0; i <h ; i++) {
            for (int j = 0; j <n ; j++) {
                for (int k = 0; k <m ; k++) {
                    if(tomato[i][j][k]==0) {
                        System.out.println(-1);
                        return;
                    }else{
                       if(tomato[i][j][k]>answer){
                           answer = tomato[i][j][k];
                       }
                    }
                }
            }
        }
        System.out.println(answer-1);
    }
    private static boolean rangeCheck(int a, int b, int c) {
        if(0<=a&&a<h&&0<=b&&b<n&&0<=c&&c<m) {
            return true;
        } else{
            return false;
        }
    }
}