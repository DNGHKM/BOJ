import java.io.*;
import java.util.*;

public class Main {
    static int count;
    static int n;
    static int m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[2][3];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        find(-1, 0, 0, 0);
        System.out.println(count);
    }

    private static void find(int row, int cur, int sum, int deep) {
        if (deep > n) {
            return;
        }
        sum += cur;
        if (deep == n && sum >= m) {
            count++;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int next = arr[i][j];
                if (row == j) next /= 2;
                find(j, next, sum, deep + 1);
            }
        }
    }
}
