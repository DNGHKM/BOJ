import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {1,1,1,0,-1,-1,-1,0};
    static int[] dy = {1,0,-1,-1,-1,0,1,1};
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if(w==0&&h==0){
                break;
            }
            arr = new int[h][w];
            for (int i = 0; i <h; i++) {
                st=new StringTokenizer(br.readLine());
                for (int j = 0; j <w; j++) {
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            Queue<int[]> q = new LinkedList<>();
            int count = 0;
            for (int i = 0; i <h; i++) {
                for (int j = 0; j <w; j++) {
                    if(arr[i][j]==1){
                        q.add(new int[]{i,j});
                        arr[i][j] = 0;
                        count++;
                    }
                    while(!q.isEmpty()) {
                        int[] tmp = q.poll();
                        for (int k = 0; k < 8; k++) {
                            int nextX = tmp[0] + dx[k];
                            int nextY = tmp[1] + dy[k];
                            if (0 <= nextX && 0 <= nextY && nextX < h && nextY < w){
                            int next = arr[nextX][nextY];
                                if (next == 1) {
                                    q.add(new int[]{nextX, nextY});
                                    arr[nextX][nextY] = 0;
                                }
                            }
                        }
                    }
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }
}