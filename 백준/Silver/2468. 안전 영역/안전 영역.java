import java.io.*;
import java.util.*;

class Main{
    static int[][] land;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        land = new int[n][n];
        int maxHeight = 0;
        for (int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <n; j++) {
                int num = Integer.parseInt(st.nextToken());
                land[i][j] = num;
                if(num>maxHeight) maxHeight = num;
            }
        }
        int max = 0;
        for (int i = 0; i <=maxHeight; i++) {
            if(max< BFS(i)) max = BFS(i);
        }
        System.out.println(max);
    }
    private static int BFS(int i) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        for (int j = 0; j <n; j++) {
            for (int k = 0; k <n; k++) {
                if(!visited[j][k]&&land[j][k]>i){
                    q.add(new int[] {j,k});
                    while(!q.isEmpty()){
                        int[] tmp = q.poll();
                        for (int l = 0; l < 4; l++) {
                            int nextX = tmp[0]+dx[l];
                            int nextY = tmp[1]+dy[l];
                            if(rangeCheck(nextX,nextY)&&!visited[nextX][nextY]&&land[nextX][nextY]>i){
                                q.add(new int[] {nextX,nextY});
                                visited[nextX][nextY] = true;
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }
    private static boolean rangeCheck(int nextX, int nextY) {
        return 0 <= nextX && nextX < n && 0 <= nextY && nextY < n;
    }
}