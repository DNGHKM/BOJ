import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 1, -1, -1};
    static int[] dy = {1, -1, -1, 1};
    static int[][] board;
    static int[][] color;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        board = new int[9][9];
        color = new int[9][9];
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if ((i + j) % 2 == 0) color[i][j] = 1;
            }
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int startX = input.charAt(0) - 'A' + 1;
            int startY = input.charAt(2) - '0';
            int endX = input.charAt(4) - 'A' + 1;
            int endY = input.charAt(6) - '0';
            if (color[startY][startX] != color[endY][endX]) {
                bw.write("Impossible\n");
                continue;
            }
            if (startY == endY && startX == endX) {
                bw.write("0 " + (char) (startX + 'A' - 1) + " " + startY + "\n");
                continue;
            }
            bfs(startY, startX);
            int resultY = board[endY][endX] / 10;
            int resultX = board[endY][endX] % 10;
            if (resultY == startY && resultX == startX) {
                bw.write("1 " + (char) (startX + 'A' - 1) + " " + startY + " " + (char) (endX + 'A' - 1) + " " + endY + "\n");
            } else {
                bw.write("2 " + (char) (startX + 'A' - 1) + " " + startY + " " + (char) (resultX + 'A' - 1) + " " + resultY +
                        " " + (char) (endX + 'A' - 1) + " " + endY + "\n");
            }
            board = new int[9][9];
        }
        bw.flush();
    }

    private static void bfs(int startY, int startX) {
        board[startY][startX] = 10 * startY + startX;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startY, startX});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 1; i < 8; i++) {
                for (int j = 0; j < 4; j++) {
                    int nextY = poll[0] + dy[j] * i;
                    int nextX = poll[1] + dx[j] * i;
                    if (rangeCheck(nextY, nextX) && board[nextY][nextX] == 0 && color[nextY][nextX] == color[startY][startX]) {
                        q.add(new int[]{nextY, nextX});
                        board[nextY][nextX] = 10 * poll[0] + poll[1];
                    }
                }
            }
        }
    }

    private static boolean rangeCheck(int nextY, int nextX) {
        return 1 <= nextY && nextY <= 8 && 1 <= nextX && nextX <= 8;
    }
}
