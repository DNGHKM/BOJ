import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        int[][] input = new int[3][101];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
                input[j][num]++;
            }
        }
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (input[j][arr[i][j]] > 1) {
                    continue;
                }
                score[i] += arr[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : score) {
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}