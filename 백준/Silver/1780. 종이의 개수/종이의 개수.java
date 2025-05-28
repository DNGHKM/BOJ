import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int[] cnt = new int[3];

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
        int[] start = {0, 0};
        findSquare(n, start);
        for (int i : cnt) {
            System.out.println(i);
        }
    }

    private static void findSquare(int size, int[] start) {
        if (size == 1 || isSame(size, start)) {
            count(start);
            return;
        }
        for (int i = 0; i < size; i += size / 3) {
            for (int j = 0; j < size; j += size / 3) {
                findSquare(size / 3, new int[]{(start[0] + i), (start[1] + j)});
            }
        }
    }

    private static void count(int[] start) {
        int num = arr[start[0]][start[1]];
        if (num == -1) {
            cnt[0]++;
        } else if (num == 0) {
            cnt[1]++;
        } else {
            cnt[2]++;
        }
    }

    private static boolean isSame(int size, int[] start) {
        int num = arr[start[0]][start[1]];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[start[0] + i][start[1] + j] != num) {
                    return false;
                }
            }
        }
        return true;
    }
}
