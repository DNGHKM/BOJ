import java.util.Scanner;

public class Main {
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int n;
    static int m;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int num = 1;
        int t = sc.nextInt();
        int[][] arr = new int[m][n];
        int y = 0;
        int x = 0;
        int idx = 0;
        while (true) {
            arr[y][x] = num;
            if (num == n * m) {
                break;
            }
            int nextY = y + dy[idx];
            int nextX = x + dx[idx];
            if (!rangeCheck(nextY, nextX) || arr[nextY][nextX] != 0) {
                idx++;
                if (idx == 4) {
                    idx = 0;
                }
                continue;
            }
            num++;
            y = nextY;
            x = nextX;
        }
        int ansY = -1;
        int ansX = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == t) {
                    ansY = i;
                    ansX = j;
                }
            }
        }
        if (ansY == -1) {
            System.out.println(0);
            return;
        }
        System.out.println((ansX + 1) + " " + (ansY + 1));
    }

    private static boolean rangeCheck(int nextY, int nextX) {
        return 0 <= nextY && nextY < m && 0 <= nextX && nextX < n;
    }

}