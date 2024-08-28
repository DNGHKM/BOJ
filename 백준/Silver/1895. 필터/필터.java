import java.io.*;
import java.util.*;

class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (t <= findMid(i, j)) cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static int findMid(int a, int b) {
        int[] tmp = new int[9];
        int idx = 0;
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                tmp[idx] = arr[i][j];
                idx++;
            }
        }
        Arrays.sort(tmp);
        return tmp[4];
    }
}
