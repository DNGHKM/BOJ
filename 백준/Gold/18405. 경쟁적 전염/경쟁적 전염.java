import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static int[] dy = {0, -1, 0, 1};
    static int[] dx = {1, 0, -1, 0};
    static Queue<int[]> q;
    static ArrayList<int[]> tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        q = new LinkedList<>();
        tmp = new ArrayList<>();
        int k = Integer.parseInt(st.nextToken()); //바이러스갯수
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= k; i++) {
            findVirus(i);
        }
        for (int i = 0; i < s; i++) {
            fillArr();
            q.addAll(tmp);
            tmp = new ArrayList<>();
        }
        System.out.println(arr[x - 1][y - 1]);
    }

    private static void fillArr() {
        while (!q.isEmpty()) {
            int[] ints = q.poll();
            for (int i = 0; i < 4; i++) {
                int ny = ints[0] + dy[i];
                int nx = ints[1] + dx[i];
                if (rangeCheck(ny, nx) && arr[ny][nx] == 0) {
                    arr[ny][nx] = arr[ints[0]][ints[1]];
                    tmp.add(new int[]{ny, nx});
                }
            }
        }
    }

    private static boolean rangeCheck(int ny, int nx) {
        return 0 <= ny && ny < n && 0 <= nx && nx < n;
    }


    private static void findVirus(int num) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == num) {
                    q.add(new int[]{i, j});
                }
            }
        }
    }
}