import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[] targetLocation = new int[2];
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i <n; i++) {
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j <m; j++) {
                int input = Integer.parseInt(st.nextToken());
                if(input==2){
                    targetLocation = new int[]{i, j};
                    map[i][j] = 0;
                    continue;
                }
                map[i][j] = input;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(targetLocation);
        visited[targetLocation[0]][targetLocation[1]]=true;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            for (int i = 0; i <4; i++) {
                int[] next = {tmp[0]+dx[i],tmp[1]+dy[i]};
                if(rangeCheck(next[0],next[1])) {
                    if (map[next[0]][next[1]] ==1&&!visited[next[0]][next[1]]) {
                        q.add(next);
                        visited[next[0]][next[1]] = true;
                        map[next[0]][next[1]] = map[tmp[0]][tmp[1]] + 1;
                    }
                }
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if(map[i][j]==1&&!visited[i][j]) {
                    bw.write(-1 + " ");
                    continue;
                }
                bw.write(map[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    private static boolean rangeCheck(int a, int b) {
        if(0<=a&&a<n&&0<=b&&b<m){
            return true;
        }else{
            return false;
        }
    }
}