import java.io.*;
import java.util.*;

public class Main {
    static char[][] board;
    static char cur;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            board = new char[3][3];
            ArrayList<int[]> list = fillBoard(br);
            cur = br.readLine().charAt(0);
            solution(list);
            write(bw, i);
        }
        bw.flush();

    }

    private static void solution(ArrayList<int[]> list) {
        for (int[] ints : list) {
            int curY = ints[0];
            int curX = ints[1];
            board[curY][curX] = cur;
            int cnt = 0;

            for (int i = 0; i < 3; i++) {
                if (board[i][curX] == cur) {
                    cnt++;
                }
            }
            if (cnt == 3) return;
            cnt = 0;

            for (int i = 0; i < 3; i++) {
                if (board[curY][i] == cur) {
                    cnt++;
                }
            }
            if (cnt == 3) return;

            if ((curX + curY) % 2 == 0) {
                cnt = 0;
                for (int i = 0; i < 3; i++) {
                    if (board[i][i] == cur) {
                        cnt++;
                    }
                }
                if (cnt == 3) return;
                cnt = 0;
                for (int i = 0; i < 3; i++) {
                    if (board[2 - i][i] == cur) {
                        cnt++;
                    }
                }
                if (cnt == 3) return;
            }
            board[curY][curX] = '-';
        }
    }

    private static void write(BufferedWriter bw, int i) throws IOException {
        bw.write("Case " + i + ":\n");
        for (char[] chars : board) {
            for (char aChar : chars) {
                bw.write(aChar);
            }
            bw.write("\n");
        }
    }

    private static ArrayList<int[]> fillBoard(BufferedReader br) throws IOException {
        ArrayList<int[]> list = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            String s = br.readLine();
            for (int k = 0; k < 3; k++) {
                board[j][k] = s.charAt(k);
                if (board[j][k] == '-') {
                    list.add(new int[]{j, k});
                }
            }
        }
        return list;
    }
}
