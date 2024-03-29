import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int one;
    static int zero;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        find(0, 0, n);
        System.out.print(zero+"\n"+one);
    }

    static void find(int a, int b, int d) {
        if (isSameNum(a, b, d)) {
            if (arr[a][b] == 1) one++;
            if (arr[a][b] == 0) zero++;
            return;
        }
        d /= 2;
        find(a, b, d);
        find(a, b + d, d);
        find(a + d, b, d);
        find(a + d, b + d, d);
    }

    static boolean isSameNum(int a, int b, int d) {
        int firstNum = arr[a][b];
        for (int i = a; i < a + d; i++) {
            for (int j = b; j < b + d; j++) {
                if (firstNum != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}