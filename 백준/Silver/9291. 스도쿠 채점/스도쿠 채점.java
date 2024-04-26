import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int k = 0; k < t; k++) {
            if (k != 0) {
                br.readLine();
            }
            int[][] arr = new int[9][9];
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            boolean check = true;
            // 각 행 검사
            for (int i = 0; i < 9; i++) {
                int[] numRow = new int[9];
                for (int j = 0; j < 9; j++) {
                    int rowIdx = arr[i][j] - 1;
                    numRow[rowIdx]++;
                    if (numRow[rowIdx] == 2) {
                        check = false;
                        break;
                    }
                }
            }
            // 각 열 검사
            for (int i = 0; i < 9; i++) {
                int[] numColumn = new int[9];
                for (int j = 0; j < 9; j++) {
                    int ColumnIdx = arr[j][i] - 1;
                    numColumn[ColumnIdx]++;
                    if (numColumn[ColumnIdx] == 2) {
                        check = false;
                        break;
                    }
                }
            }
            // 3x3 박스 검사
            for (int boxRow = 0; boxRow < 9; boxRow += 3) {
                for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                    int[] numBox = new int[9];
                    for (int i = boxRow; i < boxRow + 3; i++) {
                        for (int j = boxCol; j < boxCol + 3; j++) {
                            int boxIdx = arr[i][j] - 1;
                            numBox[boxIdx]++;
                            if (numBox[boxIdx] == 2) {
                                check = false;
                                break;
                            }
                        }
                    }
                }
            }
            bw.write("Case " + (k + 1) + ": ");
            if (!check) {
                bw.write("INCORRECT\n");
            } else {
                bw.write("CORRECT\n");
            }
        }
        bw.flush();
    }
}