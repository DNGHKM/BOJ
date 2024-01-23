import java.io.*;
import java.util.*;

public class Main {
    static int m, n, count;
    static int[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i <arr.length; i++) {
            Arrays.fill(arr[i], 0);
        }
        for (int i = 0; i <k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j <x2; j++) {
                for (int l = y1; l <y2; l++) {
                    arr[j][l] = -1;
                }
            }
        }
        count = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                BFS(i,j);
            }
        }
        bw.write(count+"\n");
        Collections.sort(list);
        for (Integer i : list) {
            bw.write(i+" ");
        }
        bw.flush();
    }

    private static void BFS(int i, int j) {
        int area = 1;
        Queue<int[]> q = new LinkedList<>();
        if(arr[i][j]==0) {
            q.add(new int[]{i, j});
            arr[i][j] = 1;
            while (!q.isEmpty()) {
                int[] tmp = q.poll();
                for (int k = 0; k < 4; k++) {
                    int nextX = tmp[0] + dx[k];
                    int nextY = tmp[1] + dy[k];
                    if (rangeCheck(nextX, nextY) && arr[nextX][nextY] == 0) {
                        q.add(new int[]{nextX, nextY});
                        arr[nextX][nextY] = arr[tmp[0]][tmp[1]] + 1;
                        area++;
                    }
                }
            }
            count++;
            list.add(area);
        }
    }

    private static boolean rangeCheck(int nextX, int nextY) {
        return 0<=nextX && nextX<n &&  0<=nextY && nextY<m;
    }
}