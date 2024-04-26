import java.io.*;
import java.util.*;

public class Main {
    static int[][] inputArr;
    static int[][] solveArr;
    static boolean complete;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        inputArr = new int[9][9];
        solveArr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String input = br.readLine();
            for (int j = 0; j < 9; j++) {
                inputArr[i][j] = input.charAt(j) - '0';
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                solveArr[i][j] = inputArr[i][j];
            }
        }
        complete = true;
        solve(0, 0, 0);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(solveArr[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    private static void solve(int y, int x, int index) {
        if (y == 9) {
            return;
        }
        if (solveArr[y][x] == 0) {
            fillNum(y, x, index);
        }
        if (!complete) {
            return;
        }
        if (x <= 7) {
            solve(y, x + 1, 0);
        } else if (x == 8) {
            solve(y + 1, 0, 0);
        }
        if (!complete) {
            if (inputArr[y][x] != 0) {
                return;
            }
            solveArr[y][x] = 0;
            solve(y, x, index + 1);
        }
    }

    private static void fillNum(int y, int x, int index) {
        complete = true;
        boolean[] nums = new boolean[10];
        Arrays.fill(nums, true);
        nums[0] = false;
        for (int i = 0; i < 9; i++) {
            nums[solveArr[y][i]] = false;
            nums[solveArr[i][x]] = false;
        }
        for (int i = y / 3 * 3; i < y / 3 * 3 + 3; i++) {
            for (int j = x / 3 * 3; j < x / 3 * 3 + 3; j++) {
                nums[solveArr[i][j]] = false;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]) {
                list.add(i);
            }
        }
        if (index > list.size() - 1) {
            complete = false;
            return;
        }
        solveArr[y][x] = list.get(index);
    }
}